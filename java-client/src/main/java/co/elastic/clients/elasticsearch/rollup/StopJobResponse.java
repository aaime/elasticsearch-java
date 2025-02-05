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

package co.elastic.clients.elasticsearch.rollup;

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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Consumer;

// typedef: rollup.stop_job.Response
@JsonpDeserializable
public class StopJobResponse implements JsonpSerializable {
	private final boolean stopped;

	// ---------------------------------------------------------------------------------------------

	private StopJobResponse(Builder builder) {

		this.stopped = ModelTypeHelper.requireNonNull(builder.stopped, this, "stopped");

	}

	public static StopJobResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code stopped}
	 */
	public final boolean stopped() {
		return this.stopped;
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

		generator.writeKey("stopped");
		generator.write(this.stopped);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopJobResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StopJobResponse> {
		private Boolean stopped;

		/**
		 * Required - API name: {@code stopped}
		 */
		public final Builder stopped(boolean value) {
			this.stopped = value;
			return this;
		}

		/**
		 * Builds a {@link StopJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopJobResponse build() {
			_checkSingleUse();

			return new StopJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopJobResponse}
	 */
	public static final JsonpDeserializer<StopJobResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StopJobResponse::setupStopJobResponseDeserializer);

	protected static void setupStopJobResponseDeserializer(ObjectDeserializer<StopJobResponse.Builder> op) {

		op.add(Builder::stopped, JsonpDeserializer.booleanDeserializer(), "stopped");

	}

}
