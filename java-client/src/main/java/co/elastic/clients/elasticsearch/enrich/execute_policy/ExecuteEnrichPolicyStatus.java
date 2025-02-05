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

package co.elastic.clients.elasticsearch.enrich.execute_policy;

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

// typedef: enrich.execute_policy.ExecuteEnrichPolicyStatus
@JsonpDeserializable
public class ExecuteEnrichPolicyStatus implements JsonpSerializable {
	private final EnrichPolicyPhase phase;

	// ---------------------------------------------------------------------------------------------

	private ExecuteEnrichPolicyStatus(Builder builder) {

		this.phase = ModelTypeHelper.requireNonNull(builder.phase, this, "phase");

	}

	public static ExecuteEnrichPolicyStatus of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code phase}
	 */
	public final EnrichPolicyPhase phase() {
		return this.phase;
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

		generator.writeKey("phase");
		this.phase.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteEnrichPolicyStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecuteEnrichPolicyStatus> {
		private EnrichPolicyPhase phase;

		/**
		 * Required - API name: {@code phase}
		 */
		public final Builder phase(EnrichPolicyPhase value) {
			this.phase = value;
			return this;
		}

		/**
		 * Builds a {@link ExecuteEnrichPolicyStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteEnrichPolicyStatus build() {
			_checkSingleUse();

			return new ExecuteEnrichPolicyStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecuteEnrichPolicyStatus}
	 */
	public static final JsonpDeserializer<ExecuteEnrichPolicyStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecuteEnrichPolicyStatus::setupExecuteEnrichPolicyStatusDeserializer);

	protected static void setupExecuteEnrichPolicyStatusDeserializer(
			ObjectDeserializer<ExecuteEnrichPolicyStatus.Builder> op) {

		op.add(Builder::phase, EnrichPolicyPhase._DESERIALIZER, "phase");

	}

}
