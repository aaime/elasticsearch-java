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

import co.elastic.clients.elasticsearch._types.NodeAttributes;
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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalytics
@JsonpDeserializable
public class DataframeAnalytics implements JsonpSerializable {
	@Nullable
	private final DataframeAnalyticsStats analysisStats;

	@Nullable
	private final String assignmentExplanation;

	private final DataframeAnalyticsStatsDataCounts dataCounts;

	private final String id;

	private final DataframeAnalyticsStatsMemoryUsage memoryUsage;

	@Nullable
	private final NodeAttributes node;

	private final List<DataframeAnalyticsStatsProgress> progress;

	private final DataframeState state;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalytics(Builder builder) {

		this.analysisStats = builder.analysisStats;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.dataCounts = ModelTypeHelper.requireNonNull(builder.dataCounts, this, "dataCounts");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.memoryUsage = ModelTypeHelper.requireNonNull(builder.memoryUsage, this, "memoryUsage");
		this.node = builder.node;
		this.progress = ModelTypeHelper.unmodifiableRequired(builder.progress, this, "progress");
		this.state = ModelTypeHelper.requireNonNull(builder.state, this, "state");

	}

	public static DataframeAnalytics of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * An object containing information about the analysis job.
	 * <p>
	 * API name: {@code analysis_stats}
	 */
	@Nullable
	public final DataframeAnalyticsStats analysisStats() {
		return this.analysisStats;
	}

	/**
	 * For running jobs only, contains messages relating to the selection of a node
	 * to run the job.
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * Required - An object that provides counts for the quantity of documents
	 * skipped, used in training, or available for testing.
	 * <p>
	 * API name: {@code data_counts}
	 */
	public final DataframeAnalyticsStatsDataCounts dataCounts() {
		return this.dataCounts;
	}

	/**
	 * Required - The unique identifier of the data frame analytics job.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - An object describing memory usage of the analytics. It is present
	 * only after the job is started and memory usage is reported.
	 * <p>
	 * API name: {@code memory_usage}
	 */
	public final DataframeAnalyticsStatsMemoryUsage memoryUsage() {
		return this.memoryUsage;
	}

	/**
	 * Contains properties for the node that runs the job. This information is
	 * available only for running jobs.
	 * <p>
	 * API name: {@code node}
	 */
	@Nullable
	public final NodeAttributes node() {
		return this.node;
	}

	/**
	 * Required - The progress report of the data frame analytics job by phase.
	 * <p>
	 * API name: {@code progress}
	 */
	public final List<DataframeAnalyticsStatsProgress> progress() {
		return this.progress;
	}

	/**
	 * Required - The status of the data frame analytics job, which can be one of
	 * the following values: failed, started, starting, stopping, stopped.
	 * <p>
	 * API name: {@code state}
	 */
	public final DataframeState state() {
		return this.state;
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

		if (this.analysisStats != null) {
			generator.writeKey("analysis_stats");
			this.analysisStats.serialize(generator, mapper);

		}
		if (this.assignmentExplanation != null) {
			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}
		generator.writeKey("data_counts");
		this.dataCounts.serialize(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("memory_usage");
		this.memoryUsage.serialize(generator, mapper);

		if (this.node != null) {
			generator.writeKey("node");
			this.node.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.progress)) {
			generator.writeKey("progress");
			generator.writeStartArray();
			for (DataframeAnalyticsStatsProgress item0 : this.progress) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("state");
		this.state.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalytics}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataframeAnalytics> {
		@Nullable
		private DataframeAnalyticsStats analysisStats;

		@Nullable
		private String assignmentExplanation;

		private DataframeAnalyticsStatsDataCounts dataCounts;

		private String id;

		private DataframeAnalyticsStatsMemoryUsage memoryUsage;

		@Nullable
		private NodeAttributes node;

		private List<DataframeAnalyticsStatsProgress> progress;

		private DataframeState state;

		/**
		 * An object containing information about the analysis job.
		 * <p>
		 * API name: {@code analysis_stats}
		 */
		public final Builder analysisStats(@Nullable DataframeAnalyticsStats value) {
			this.analysisStats = value;
			return this;
		}

		/**
		 * An object containing information about the analysis job.
		 * <p>
		 * API name: {@code analysis_stats}
		 */
		public final Builder analysisStats(Consumer<DataframeAnalyticsStats.Builder> fn) {
			DataframeAnalyticsStats.Builder builder = new DataframeAnalyticsStats.Builder();
			fn.accept(builder);
			return this.analysisStats(builder.build());
		}

		/**
		 * For running jobs only, contains messages relating to the selection of a node
		 * to run the job.
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * Required - An object that provides counts for the quantity of documents
		 * skipped, used in training, or available for testing.
		 * <p>
		 * API name: {@code data_counts}
		 */
		public final Builder dataCounts(DataframeAnalyticsStatsDataCounts value) {
			this.dataCounts = value;
			return this;
		}

		/**
		 * Required - An object that provides counts for the quantity of documents
		 * skipped, used in training, or available for testing.
		 * <p>
		 * API name: {@code data_counts}
		 */
		public final Builder dataCounts(Consumer<DataframeAnalyticsStatsDataCounts.Builder> fn) {
			DataframeAnalyticsStatsDataCounts.Builder builder = new DataframeAnalyticsStatsDataCounts.Builder();
			fn.accept(builder);
			return this.dataCounts(builder.build());
		}

		/**
		 * Required - The unique identifier of the data frame analytics job.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - An object describing memory usage of the analytics. It is present
		 * only after the job is started and memory usage is reported.
		 * <p>
		 * API name: {@code memory_usage}
		 */
		public final Builder memoryUsage(DataframeAnalyticsStatsMemoryUsage value) {
			this.memoryUsage = value;
			return this;
		}

		/**
		 * Required - An object describing memory usage of the analytics. It is present
		 * only after the job is started and memory usage is reported.
		 * <p>
		 * API name: {@code memory_usage}
		 */
		public final Builder memoryUsage(Consumer<DataframeAnalyticsStatsMemoryUsage.Builder> fn) {
			DataframeAnalyticsStatsMemoryUsage.Builder builder = new DataframeAnalyticsStatsMemoryUsage.Builder();
			fn.accept(builder);
			return this.memoryUsage(builder.build());
		}

		/**
		 * Contains properties for the node that runs the job. This information is
		 * available only for running jobs.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(@Nullable NodeAttributes value) {
			this.node = value;
			return this;
		}

		/**
		 * Contains properties for the node that runs the job. This information is
		 * available only for running jobs.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(Consumer<NodeAttributes.Builder> fn) {
			NodeAttributes.Builder builder = new NodeAttributes.Builder();
			fn.accept(builder);
			return this.node(builder.build());
		}

		/**
		 * Required - The progress report of the data frame analytics job by phase.
		 * <p>
		 * API name: {@code progress}
		 */
		public final Builder progress(List<DataframeAnalyticsStatsProgress> value) {
			this.progress = value;
			return this;
		}

		/**
		 * Required - The progress report of the data frame analytics job by phase.
		 * <p>
		 * API name: {@code progress}
		 */
		public final Builder progress(DataframeAnalyticsStatsProgress... value) {
			this.progress = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - The progress report of the data frame analytics job by phase.
		 * <p>
		 * API name: {@code progress}
		 */
		public final Builder progress(
				Function<ListBuilder<DataframeAnalyticsStatsProgress, DataframeAnalyticsStatsProgress.Builder>, ObjectBuilder<List<DataframeAnalyticsStatsProgress>>> fn) {
			return progress(fn.apply(new ListBuilder<>(DataframeAnalyticsStatsProgress.Builder::new)).build());
		}

		/**
		 * Required - The status of the data frame analytics job, which can be one of
		 * the following values: failed, started, starting, stopping, stopped.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(DataframeState value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalytics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalytics build() {
			_checkSingleUse();

			return new DataframeAnalytics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalytics}
	 */
	public static final JsonpDeserializer<DataframeAnalytics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalytics::setupDataframeAnalyticsDeserializer);

	protected static void setupDataframeAnalyticsDeserializer(ObjectDeserializer<DataframeAnalytics.Builder> op) {

		op.add(Builder::analysisStats, DataframeAnalyticsStats._DESERIALIZER, "analysis_stats");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");
		op.add(Builder::dataCounts, DataframeAnalyticsStatsDataCounts._DESERIALIZER, "data_counts");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::memoryUsage, DataframeAnalyticsStatsMemoryUsage._DESERIALIZER, "memory_usage");
		op.add(Builder::node, NodeAttributes._DESERIALIZER, "node");
		op.add(Builder::progress, JsonpDeserializer.arrayDeserializer(DataframeAnalyticsStatsProgress._DESERIALIZER),
				"progress");
		op.add(Builder::state, DataframeState._DESERIALIZER, "state");

	}

}
