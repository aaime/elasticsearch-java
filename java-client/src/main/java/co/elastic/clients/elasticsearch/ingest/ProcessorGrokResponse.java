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

package co.elastic.clients.elasticsearch.ingest;

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
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ingest.processor_grok.Response
@JsonpDeserializable
public class ProcessorGrokResponse implements JsonpSerializable {
	private final Map<String, String> patterns;

	// ---------------------------------------------------------------------------------------------

	private ProcessorGrokResponse(Builder builder) {

		this.patterns = ModelTypeHelper.unmodifiableRequired(builder.patterns, this, "patterns");

	}

	public static ProcessorGrokResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code patterns}
	 */
	public final Map<String, String> patterns() {
		return this.patterns;
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

		if (ModelTypeHelper.isDefined(this.patterns)) {
			generator.writeKey("patterns");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.patterns.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ProcessorGrokResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ProcessorGrokResponse> {
		private Map<String, String> patterns;

		/**
		 * Required - API name: {@code patterns}
		 */
		public final Builder patterns(Map<String, String> value) {
			this.patterns = value;
			return this;
		}

		/**
		 * Builds a {@link ProcessorGrokResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ProcessorGrokResponse build() {
			_checkSingleUse();

			return new ProcessorGrokResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ProcessorGrokResponse}
	 */
	public static final JsonpDeserializer<ProcessorGrokResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ProcessorGrokResponse::setupProcessorGrokResponseDeserializer);

	protected static void setupProcessorGrokResponseDeserializer(ObjectDeserializer<ProcessorGrokResponse.Builder> op) {

		op.add(Builder::patterns, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"patterns");

	}

}
