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
import java.lang.Double;
import java.lang.Long;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml._types.DatafeedTimingStats
@JsonpDeserializable
public class DatafeedTimingStats implements JsonpSerializable {
	private final long bucketCount;

	private final double exponentialAverageSearchTimePerHourMs;

	private final String jobId;

	private final long searchCount;

	private final double totalSearchTimeMs;

	private final Number averageSearchTimePerBucketMs;

	// ---------------------------------------------------------------------------------------------

	private DatafeedTimingStats(Builder builder) {

		this.bucketCount = ModelTypeHelper.requireNonNull(builder.bucketCount, this, "bucketCount");
		this.exponentialAverageSearchTimePerHourMs = ModelTypeHelper.requireNonNull(
				builder.exponentialAverageSearchTimePerHourMs, this, "exponentialAverageSearchTimePerHourMs");
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.searchCount = ModelTypeHelper.requireNonNull(builder.searchCount, this, "searchCount");
		this.totalSearchTimeMs = ModelTypeHelper.requireNonNull(builder.totalSearchTimeMs, this, "totalSearchTimeMs");
		this.averageSearchTimePerBucketMs = ModelTypeHelper.requireNonNull(builder.averageSearchTimePerBucketMs, this,
				"averageSearchTimePerBucketMs");

	}

	public static DatafeedTimingStats of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code bucket_count}
	 */
	public final long bucketCount() {
		return this.bucketCount;
	}

	/**
	 * Required - API name: {@code exponential_average_search_time_per_hour_ms}
	 */
	public final double exponentialAverageSearchTimePerHourMs() {
		return this.exponentialAverageSearchTimePerHourMs;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code search_count}
	 */
	public final long searchCount() {
		return this.searchCount;
	}

	/**
	 * Required - API name: {@code total_search_time_ms}
	 */
	public final double totalSearchTimeMs() {
		return this.totalSearchTimeMs;
	}

	/**
	 * Required - API name: {@code average_search_time_per_bucket_ms}
	 */
	public final Number averageSearchTimePerBucketMs() {
		return this.averageSearchTimePerBucketMs;
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

		generator.writeKey("bucket_count");
		generator.write(this.bucketCount);

		generator.writeKey("exponential_average_search_time_per_hour_ms");
		generator.write(this.exponentialAverageSearchTimePerHourMs);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("search_count");
		generator.write(this.searchCount);

		generator.writeKey("total_search_time_ms");
		generator.write(this.totalSearchTimeMs);

		generator.writeKey("average_search_time_per_bucket_ms");
		generator.write(this.averageSearchTimePerBucketMs.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedTimingStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DatafeedTimingStats> {
		private Long bucketCount;

		private Double exponentialAverageSearchTimePerHourMs;

		private String jobId;

		private Long searchCount;

		private Double totalSearchTimeMs;

		private Number averageSearchTimePerBucketMs;

		/**
		 * Required - API name: {@code bucket_count}
		 */
		public final Builder bucketCount(long value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponential_average_search_time_per_hour_ms}
		 */
		public final Builder exponentialAverageSearchTimePerHourMs(double value) {
			this.exponentialAverageSearchTimePerHourMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code search_count}
		 */
		public final Builder searchCount(long value) {
			this.searchCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_search_time_ms}
		 */
		public final Builder totalSearchTimeMs(double value) {
			this.totalSearchTimeMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code average_search_time_per_bucket_ms}
		 */
		public final Builder averageSearchTimePerBucketMs(Number value) {
			this.averageSearchTimePerBucketMs = value;
			return this;
		}

		/**
		 * Builds a {@link DatafeedTimingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedTimingStats build() {
			_checkSingleUse();

			return new DatafeedTimingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatafeedTimingStats}
	 */
	public static final JsonpDeserializer<DatafeedTimingStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatafeedTimingStats::setupDatafeedTimingStatsDeserializer);

	protected static void setupDatafeedTimingStatsDeserializer(ObjectDeserializer<DatafeedTimingStats.Builder> op) {

		op.add(Builder::bucketCount, JsonpDeserializer.longDeserializer(), "bucket_count");
		op.add(Builder::exponentialAverageSearchTimePerHourMs, JsonpDeserializer.doubleDeserializer(),
				"exponential_average_search_time_per_hour_ms");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::searchCount, JsonpDeserializer.longDeserializer(), "search_count");
		op.add(Builder::totalSearchTimeMs, JsonpDeserializer.doubleDeserializer(), "total_search_time_ms");
		op.add(Builder::averageSearchTimePerBucketMs, JsonpDeserializer.numberDeserializer(),
				"average_search_time_per_bucket_ms");

	}

}
