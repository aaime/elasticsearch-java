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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsOutlierDetection
@JsonpDeserializable
public class DataframeAnalyticsStatsOutlierDetection implements DataframeAnalyticsStatsVariant, JsonpSerializable {
	private final OutlierDetectionParameters parameters;

	private final String timestamp;

	private final TimingStats timingStats;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalyticsStatsOutlierDetection(Builder builder) {

		this.parameters = ModelTypeHelper.requireNonNull(builder.parameters, this, "parameters");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.timingStats = ModelTypeHelper.requireNonNull(builder.timingStats, this, "timingStats");

	}

	public static DataframeAnalyticsStatsOutlierDetection of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * DataframeAnalyticsStats variant kind.
	 */
	@Override
	public DataframeAnalyticsStats.Kind _dataframeAnalyticsStatsKind() {
		return DataframeAnalyticsStats.Kind.OutlierDetectionStats;
	}

	/**
	 * Required - API name: {@code parameters}
	 */
	public final OutlierDetectionParameters parameters() {
		return this.parameters;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final String timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code timing_stats}
	 */
	public final TimingStats timingStats() {
		return this.timingStats;
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

		generator.writeKey("parameters");
		this.parameters.serialize(generator, mapper);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("timing_stats");
		this.timingStats.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsStatsOutlierDetection}.
	 */
	public static class Builder extends ObjectBuilderBase
			implements
				ObjectBuilder<DataframeAnalyticsStatsOutlierDetection> {
		private OutlierDetectionParameters parameters;

		private String timestamp;

		private TimingStats timingStats;

		/**
		 * Required - API name: {@code parameters}
		 */
		public final Builder parameters(OutlierDetectionParameters value) {
			this.parameters = value;
			return this;
		}

		/**
		 * Required - API name: {@code parameters}
		 */
		public final Builder parameters(Consumer<OutlierDetectionParameters.Builder> fn) {
			OutlierDetectionParameters.Builder builder = new OutlierDetectionParameters.Builder();
			fn.accept(builder);
			return this.parameters(builder.build());
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code timing_stats}
		 */
		public final Builder timingStats(TimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code timing_stats}
		 */
		public final Builder timingStats(Consumer<TimingStats.Builder> fn) {
			TimingStats.Builder builder = new TimingStats.Builder();
			fn.accept(builder);
			return this.timingStats(builder.build());
		}

		/**
		 * Builds a {@link DataframeAnalyticsStatsOutlierDetection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsStatsOutlierDetection build() {
			_checkSingleUse();

			return new DataframeAnalyticsStatsOutlierDetection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsStatsOutlierDetection}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsStatsOutlierDetection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeAnalyticsStatsOutlierDetection::setupDataframeAnalyticsStatsOutlierDetectionDeserializer);

	protected static void setupDataframeAnalyticsStatsOutlierDetectionDeserializer(
			ObjectDeserializer<DataframeAnalyticsStatsOutlierDetection.Builder> op) {

		op.add(Builder::parameters, OutlierDetectionParameters._DESERIALIZER, "parameters");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");
		op.add(Builder::timingStats, TimingStats._DESERIALIZER, "timing_stats");

	}

}
