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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterProcess
@JsonpDeserializable
public class ClusterProcess implements JsonpSerializable {
	private final ClusterProcessCpu cpu;

	private final ClusterProcessOpenFileDescriptors openFileDescriptors;

	// ---------------------------------------------------------------------------------------------

	private ClusterProcess(Builder builder) {

		this.cpu = ModelTypeHelper.requireNonNull(builder.cpu, this, "cpu");
		this.openFileDescriptors = ModelTypeHelper.requireNonNull(builder.openFileDescriptors, this,
				"openFileDescriptors");

	}

	public static ClusterProcess of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code cpu}
	 */
	public final ClusterProcessCpu cpu() {
		return this.cpu;
	}

	/**
	 * Required - API name: {@code open_file_descriptors}
	 */
	public final ClusterProcessOpenFileDescriptors openFileDescriptors() {
		return this.openFileDescriptors;
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

		generator.writeKey("cpu");
		this.cpu.serialize(generator, mapper);

		generator.writeKey("open_file_descriptors");
		this.openFileDescriptors.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterProcess}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterProcess> {
		private ClusterProcessCpu cpu;

		private ClusterProcessOpenFileDescriptors openFileDescriptors;

		/**
		 * Required - API name: {@code cpu}
		 */
		public final Builder cpu(ClusterProcessCpu value) {
			this.cpu = value;
			return this;
		}

		/**
		 * Required - API name: {@code cpu}
		 */
		public final Builder cpu(Consumer<ClusterProcessCpu.Builder> fn) {
			ClusterProcessCpu.Builder builder = new ClusterProcessCpu.Builder();
			fn.accept(builder);
			return this.cpu(builder.build());
		}

		/**
		 * Required - API name: {@code open_file_descriptors}
		 */
		public final Builder openFileDescriptors(ClusterProcessOpenFileDescriptors value) {
			this.openFileDescriptors = value;
			return this;
		}

		/**
		 * Required - API name: {@code open_file_descriptors}
		 */
		public final Builder openFileDescriptors(Consumer<ClusterProcessOpenFileDescriptors.Builder> fn) {
			ClusterProcessOpenFileDescriptors.Builder builder = new ClusterProcessOpenFileDescriptors.Builder();
			fn.accept(builder);
			return this.openFileDescriptors(builder.build());
		}

		/**
		 * Builds a {@link ClusterProcess}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterProcess build() {
			_checkSingleUse();

			return new ClusterProcess(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterProcess}
	 */
	public static final JsonpDeserializer<ClusterProcess> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterProcess::setupClusterProcessDeserializer);

	protected static void setupClusterProcessDeserializer(ObjectDeserializer<ClusterProcess.Builder> op) {

		op.add(Builder::cpu, ClusterProcessCpu._DESERIALIZER, "cpu");
		op.add(Builder::openFileDescriptors, ClusterProcessOpenFileDescriptors._DESERIALIZER, "open_file_descriptors");

	}

}
