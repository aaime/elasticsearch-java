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
import java.lang.Long;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_overall_buckets.Response
@JsonpDeserializable
public class GetOverallBucketsResponse implements JsonpSerializable {
	private final long count;

	private final List<OverallBucket> overallBuckets;

	// ---------------------------------------------------------------------------------------------

	private GetOverallBucketsResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.overallBuckets = ModelTypeHelper.unmodifiableRequired(builder.overallBuckets, this, "overallBuckets");

	}

	public static GetOverallBucketsResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - Array of overall bucket objects
	 * <p>
	 * API name: {@code overall_buckets}
	 */
	public final List<OverallBucket> overallBuckets() {
		return this.overallBuckets;
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

		if (ModelTypeHelper.isDefined(this.overallBuckets)) {
			generator.writeKey("overall_buckets");
			generator.writeStartArray();
			for (OverallBucket item0 : this.overallBuckets) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetOverallBucketsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetOverallBucketsResponse> {
		private Long count;

		private List<OverallBucket> overallBuckets;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Array of overall bucket objects
		 * <p>
		 * API name: {@code overall_buckets}
		 */
		public final Builder overallBuckets(List<OverallBucket> value) {
			this.overallBuckets = value;
			return this;
		}

		/**
		 * Required - Array of overall bucket objects
		 * <p>
		 * API name: {@code overall_buckets}
		 */
		public final Builder overallBuckets(OverallBucket... value) {
			this.overallBuckets = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Array of overall bucket objects
		 * <p>
		 * API name: {@code overall_buckets}
		 */
		public final Builder overallBuckets(
				Function<ListBuilder<OverallBucket, OverallBucket.Builder>, ObjectBuilder<List<OverallBucket>>> fn) {
			return overallBuckets(fn.apply(new ListBuilder<>(OverallBucket.Builder::new)).build());
		}

		/**
		 * Builds a {@link GetOverallBucketsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetOverallBucketsResponse build() {
			_checkSingleUse();

			return new GetOverallBucketsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetOverallBucketsResponse}
	 */
	public static final JsonpDeserializer<GetOverallBucketsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetOverallBucketsResponse::setupGetOverallBucketsResponseDeserializer);

	protected static void setupGetOverallBucketsResponseDeserializer(
			ObjectDeserializer<GetOverallBucketsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::overallBuckets, JsonpDeserializer.arrayDeserializer(OverallBucket._DESERIALIZER),
				"overall_buckets");

	}

}
