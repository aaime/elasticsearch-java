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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_trained_models.Response
@JsonpDeserializable
public class GetTrainedModelsResponse implements JsonpSerializable {
	private final int count;

	private final List<TrainedModelConfig> trainedModelConfigs;

	// ---------------------------------------------------------------------------------------------

	private GetTrainedModelsResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.trainedModelConfigs = ModelTypeHelper.unmodifiableRequired(builder.trainedModelConfigs, this,
				"trainedModelConfigs");

	}

	public static GetTrainedModelsResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - An array of trained model resources, which are sorted by the
	 * model_id value in ascending order.
	 * <p>
	 * API name: {@code trained_model_configs}
	 */
	public final List<TrainedModelConfig> trainedModelConfigs() {
		return this.trainedModelConfigs;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ModelTypeHelper.isDefined(this.trainedModelConfigs)) {
			generator.writeKey("trained_model_configs");
			generator.writeStartArray();
			for (TrainedModelConfig item0 : this.trainedModelConfigs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrainedModelsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetTrainedModelsResponse> {
		private Integer count;

		private List<TrainedModelConfig> trainedModelConfigs;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - An array of trained model resources, which are sorted by the
		 * model_id value in ascending order.
		 * <p>
		 * API name: {@code trained_model_configs}
		 */
		public final Builder trainedModelConfigs(List<TrainedModelConfig> value) {
			this.trainedModelConfigs = value;
			return this;
		}

		/**
		 * Required - An array of trained model resources, which are sorted by the
		 * model_id value in ascending order.
		 * <p>
		 * API name: {@code trained_model_configs}
		 */
		public final Builder trainedModelConfigs(TrainedModelConfig... value) {
			this.trainedModelConfigs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - An array of trained model resources, which are sorted by the
		 * model_id value in ascending order.
		 * <p>
		 * API name: {@code trained_model_configs}
		 */
		public final Builder trainedModelConfigs(
				Function<ListBuilder<TrainedModelConfig, TrainedModelConfig.Builder>, ObjectBuilder<List<TrainedModelConfig>>> fn) {
			return trainedModelConfigs(fn.apply(new ListBuilder<>(TrainedModelConfig.Builder::new)).build());
		}

		/**
		 * Builds a {@link GetTrainedModelsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrainedModelsResponse build() {
			_checkSingleUse();

			return new GetTrainedModelsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTrainedModelsResponse}
	 */
	public static final JsonpDeserializer<GetTrainedModelsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetTrainedModelsResponse::setupGetTrainedModelsResponseDeserializer);

	protected static void setupGetTrainedModelsResponseDeserializer(
			ObjectDeserializer<GetTrainedModelsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::trainedModelConfigs, JsonpDeserializer.arrayDeserializer(TrainedModelConfig._DESERIALIZER),
				"trained_model_configs");

	}

}
