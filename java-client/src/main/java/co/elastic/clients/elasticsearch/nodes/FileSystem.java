/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.FileSystem
@JsonpDeserializable
public class FileSystem implements JsonpSerializable {
	private final List<DataPathStats> data;

	private final long timestamp;

	private final FileSystemTotal total;

	// ---------------------------------------------------------------------------------------------

	private FileSystem(Builder builder) {

		this.data = ModelTypeHelper.unmodifiableRequired(builder.data, this, "data");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static FileSystem of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code data}
	 */
	public final List<DataPathStats> data() {
		return this.data;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final FileSystemTotal total() {
		return this.total;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.data)) {
			generator.writeKey("data");
			generator.writeStartArray();
			for (DataPathStats item0 : this.data) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileSystem}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FileSystem> {
		private List<DataPathStats> data;

		private Long timestamp;

		private FileSystemTotal total;

		/**
		 * Required - API name: {@code data}
		 */
		public final Builder data(List<DataPathStats> value) {
			this.data = value;
			return this;
		}

		/**
		 * Required - API name: {@code data}
		 */
		public final Builder data(DataPathStats... value) {
			this.data = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code data}
		 */
		public final Builder data(
				Function<ListBuilder<DataPathStats, DataPathStats.Builder>, ObjectBuilder<List<DataPathStats>>> fn) {
			return data(fn.apply(new ListBuilder<>(DataPathStats.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(FileSystemTotal value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(Consumer<FileSystemTotal.Builder> fn) {
			FileSystemTotal.Builder builder = new FileSystemTotal.Builder();
			fn.accept(builder);
			return this.total(builder.build());
		}

		/**
		 * Builds a {@link FileSystem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileSystem build() {
			_checkSingleUse();

			return new FileSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FileSystem}
	 */
	public static final JsonpDeserializer<FileSystem> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FileSystem::setupFileSystemDeserializer);

	protected static void setupFileSystemDeserializer(ObjectDeserializer<FileSystem.Builder> op) {

		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(DataPathStats._DESERIALIZER), "data");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::total, FileSystemTotal._DESERIALIZER, "total");

	}

}
