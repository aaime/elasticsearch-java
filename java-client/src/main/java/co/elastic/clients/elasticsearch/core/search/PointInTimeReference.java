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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.search._types.PointInTimeReference
@JsonpDeserializable
public class PointInTimeReference implements JsonpSerializable {
	private final String id;

	@Nullable
	private final Time keepAlive;

	// ---------------------------------------------------------------------------------------------

	private PointInTimeReference(Builder builder) {

		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.keepAlive = builder.keepAlive;

	}

	public static PointInTimeReference of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final Time keepAlive() {
		return this.keepAlive;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.keepAlive != null) {
			generator.writeKey("keep_alive");
			this.keepAlive.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PointInTimeReference}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PointInTimeReference> {
		private String id;

		@Nullable
		private Time keepAlive;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.keepAlive(builder.build());
		}

		/**
		 * Builds a {@link PointInTimeReference}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PointInTimeReference build() {
			_checkSingleUse();

			return new PointInTimeReference(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PointInTimeReference}
	 */
	public static final JsonpDeserializer<PointInTimeReference> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PointInTimeReference::setupPointInTimeReferenceDeserializer);

	protected static void setupPointInTimeReferenceDeserializer(ObjectDeserializer<PointInTimeReference.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::keepAlive, Time._DESERIALIZER, "keep_alive");

	}

}
