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

import co.elastic.clients.json.JsonData;
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
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelStats
@JsonpDeserializable
public class TrainedModelStats implements JsonpSerializable {
	private final String modelId;

	private final int pipelineCount;

	@Nullable
	private final TrainedModelInferenceStats inferenceStats;

	private final Map<String, JsonData> ingest;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelStats(Builder builder) {

		this.modelId = ModelTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.pipelineCount = ModelTypeHelper.requireNonNull(builder.pipelineCount, this, "pipelineCount");
		this.inferenceStats = builder.inferenceStats;
		this.ingest = ModelTypeHelper.unmodifiable(builder.ingest);

	}

	public static TrainedModelStats of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - The number of ingest pipelines that currently refer to the model.
	 * <p>
	 * API name: {@code pipeline_count}
	 */
	public final int pipelineCount() {
		return this.pipelineCount;
	}

	/**
	 * A collection of inference stats fields.
	 * <p>
	 * API name: {@code inference_stats}
	 */
	@Nullable
	public final TrainedModelInferenceStats inferenceStats() {
		return this.inferenceStats;
	}

	/**
	 * A collection of ingest stats for the model across all nodes. The values are
	 * summations of the individual node statistics. The format matches the ingest
	 * section in Nodes stats.
	 * <p>
	 * API name: {@code ingest}
	 */
	public final Map<String, JsonData> ingest() {
		return this.ingest;
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

		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("pipeline_count");
		generator.write(this.pipelineCount);

		if (this.inferenceStats != null) {
			generator.writeKey("inference_stats");
			this.inferenceStats.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.ingest)) {
			generator.writeKey("ingest");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.ingest.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TrainedModelStats> {
		private String modelId;

		private Integer pipelineCount;

		@Nullable
		private TrainedModelInferenceStats inferenceStats;

		@Nullable
		private Map<String, JsonData> ingest;

		/**
		 * Required - The unique identifier of the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - The number of ingest pipelines that currently refer to the model.
		 * <p>
		 * API name: {@code pipeline_count}
		 */
		public final Builder pipelineCount(int value) {
			this.pipelineCount = value;
			return this;
		}

		/**
		 * A collection of inference stats fields.
		 * <p>
		 * API name: {@code inference_stats}
		 */
		public final Builder inferenceStats(@Nullable TrainedModelInferenceStats value) {
			this.inferenceStats = value;
			return this;
		}

		/**
		 * A collection of inference stats fields.
		 * <p>
		 * API name: {@code inference_stats}
		 */
		public final Builder inferenceStats(Consumer<TrainedModelInferenceStats.Builder> fn) {
			TrainedModelInferenceStats.Builder builder = new TrainedModelInferenceStats.Builder();
			fn.accept(builder);
			return this.inferenceStats(builder.build());
		}

		/**
		 * A collection of ingest stats for the model across all nodes. The values are
		 * summations of the individual node statistics. The format matches the ingest
		 * section in Nodes stats.
		 * <p>
		 * API name: {@code ingest}
		 */
		public final Builder ingest(@Nullable Map<String, JsonData> value) {
			this.ingest = value;
			return this;
		}

		/**
		 * Builds a {@link TrainedModelStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelStats build() {
			_checkSingleUse();

			return new TrainedModelStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelStats}
	 */
	public static final JsonpDeserializer<TrainedModelStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelStats::setupTrainedModelStatsDeserializer);

	protected static void setupTrainedModelStatsDeserializer(ObjectDeserializer<TrainedModelStats.Builder> op) {

		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::pipelineCount, JsonpDeserializer.integerDeserializer(), "pipeline_count");
		op.add(Builder::inferenceStats, TrainedModelInferenceStats._DESERIALIZER, "inference_stats");
		op.add(Builder::ingest, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "ingest");

	}

}
