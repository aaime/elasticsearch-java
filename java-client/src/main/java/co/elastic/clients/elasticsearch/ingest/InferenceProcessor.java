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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ingest._types.InferenceProcessor
@JsonpDeserializable
public class InferenceProcessor extends ProcessorBase implements ProcessorVariant {
	private final String modelId;

	private final String targetField;

	private final Map<String, JsonData> fieldMap;

	@Nullable
	private final InferenceConfig inferenceConfig;

	// ---------------------------------------------------------------------------------------------

	private InferenceProcessor(Builder builder) {
		super(builder);

		this.modelId = ModelTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.targetField = ModelTypeHelper.requireNonNull(builder.targetField, this, "targetField");
		this.fieldMap = ModelTypeHelper.unmodifiable(builder.fieldMap);
		this.inferenceConfig = builder.inferenceConfig;

	}

	public static InferenceProcessor of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Inference;
	}

	/**
	 * Required - API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - API name: {@code target_field}
	 */
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * API name: {@code field_map}
	 */
	public final Map<String, JsonData> fieldMap() {
		return this.fieldMap;
	}

	/**
	 * API name: {@code inference_config}
	 */
	@Nullable
	public final InferenceConfig inferenceConfig() {
		return this.inferenceConfig;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("target_field");
		generator.write(this.targetField);

		if (ModelTypeHelper.isDefined(this.fieldMap)) {
			generator.writeKey("field_map");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.fieldMap.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.inferenceConfig != null) {
			generator.writeKey("inference_config");
			this.inferenceConfig.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<InferenceProcessor> {
		private String modelId;

		private String targetField;

		@Nullable
		private Map<String, JsonData> fieldMap;

		@Nullable
		private InferenceConfig inferenceConfig;

		/**
		 * Required - API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - API name: {@code target_field}
		 */
		public final Builder targetField(String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * API name: {@code field_map}
		 */
		public final Builder fieldMap(@Nullable Map<String, JsonData> value) {
			this.fieldMap = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(@Nullable InferenceConfig value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(Consumer<InferenceConfig.Builder> fn) {
			InferenceConfig.Builder builder = new InferenceConfig.Builder();
			fn.accept(builder);
			return this.inferenceConfig(builder.build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceProcessor build() {
			_checkSingleUse();

			return new InferenceProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceProcessor}
	 */
	public static final JsonpDeserializer<InferenceProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceProcessor::setupInferenceProcessorDeserializer);

	protected static void setupInferenceProcessorDeserializer(ObjectDeserializer<InferenceProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::fieldMap, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "field_map");
		op.add(Builder::inferenceConfig, InferenceConfig._DESERIALIZER, "inference_config");

	}

}
