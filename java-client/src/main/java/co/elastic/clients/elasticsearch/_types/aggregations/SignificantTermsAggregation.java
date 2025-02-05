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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.aggregations.SignificantTermsAggregation
@JsonpDeserializable
public class SignificantTermsAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final Query backgroundFilter;

	@Nullable
	private final ChiSquareHeuristic chiSquare;

	@Nullable
	private final TermsExclude exclude;

	@Nullable
	private final TermsAggregationExecutionHint executionHint;

	@Nullable
	private final String field;

	@Nullable
	private final GoogleNormalizedDistanceHeuristic gnd;

	private final List<String> include;

	@Nullable
	private final Long minDocCount;

	@Nullable
	private final MutualInformationHeuristic mutualInformation;

	@Nullable
	private final PercentageScoreHeuristic percentage;

	@Nullable
	private final ScriptedHeuristic scriptHeuristic;

	@Nullable
	private final Long shardMinDocCount;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private SignificantTermsAggregation(Builder builder) {
		super(builder);

		this.backgroundFilter = builder.backgroundFilter;
		this.chiSquare = builder.chiSquare;
		this.exclude = builder.exclude;
		this.executionHint = builder.executionHint;
		this.field = builder.field;
		this.gnd = builder.gnd;
		this.include = ModelTypeHelper.unmodifiable(builder.include);
		this.minDocCount = builder.minDocCount;
		this.mutualInformation = builder.mutualInformation;
		this.percentage = builder.percentage;
		this.scriptHeuristic = builder.scriptHeuristic;
		this.shardMinDocCount = builder.shardMinDocCount;
		this.shardSize = builder.shardSize;
		this.size = builder.size;

	}

	public static SignificantTermsAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.SignificantTerms;
	}

	/**
	 * API name: {@code background_filter}
	 */
	@Nullable
	public final Query backgroundFilter() {
		return this.backgroundFilter;
	}

	/**
	 * API name: {@code chi_square}
	 */
	@Nullable
	public final ChiSquareHeuristic chiSquare() {
		return this.chiSquare;
	}

	/**
	 * API name: {@code exclude}
	 */
	@Nullable
	public final TermsExclude exclude() {
		return this.exclude;
	}

	/**
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public final TermsAggregationExecutionHint executionHint() {
		return this.executionHint;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code gnd}
	 */
	@Nullable
	public final GoogleNormalizedDistanceHeuristic gnd() {
		return this.gnd;
	}

	/**
	 * API name: {@code include}
	 */
	public final List<String> include() {
		return this.include;
	}

	/**
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Long minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code mutual_information}
	 */
	@Nullable
	public final MutualInformationHeuristic mutualInformation() {
		return this.mutualInformation;
	}

	/**
	 * API name: {@code percentage}
	 */
	@Nullable
	public final PercentageScoreHeuristic percentage() {
		return this.percentage;
	}

	/**
	 * API name: {@code script_heuristic}
	 */
	@Nullable
	public final ScriptedHeuristic scriptHeuristic() {
		return this.scriptHeuristic;
	}

	/**
	 * API name: {@code shard_min_doc_count}
	 */
	@Nullable
	public final Long shardMinDocCount() {
		return this.shardMinDocCount;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.backgroundFilter != null) {
			generator.writeKey("background_filter");
			this.backgroundFilter.serialize(generator, mapper);

		}
		if (this.chiSquare != null) {
			generator.writeKey("chi_square");
			this.chiSquare.serialize(generator, mapper);

		}
		if (this.exclude != null) {
			generator.writeKey("exclude");
			this.exclude.serialize(generator, mapper);

		}
		if (this.executionHint != null) {
			generator.writeKey("execution_hint");
			this.executionHint.serialize(generator, mapper);
		}
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.gnd != null) {
			generator.writeKey("gnd");
			this.gnd.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.include)) {
			generator.writeKey("include");
			generator.writeStartArray();
			for (String item0 : this.include) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.mutualInformation != null) {
			generator.writeKey("mutual_information");
			this.mutualInformation.serialize(generator, mapper);

		}
		if (this.percentage != null) {
			generator.writeKey("percentage");
			this.percentage.serialize(generator, mapper);

		}
		if (this.scriptHeuristic != null) {
			generator.writeKey("script_heuristic");
			this.scriptHeuristic.serialize(generator, mapper);

		}
		if (this.shardMinDocCount != null) {
			generator.writeKey("shard_min_doc_count");
			generator.write(this.shardMinDocCount);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SignificantTermsAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SignificantTermsAggregation> {
		@Nullable
		private Query backgroundFilter;

		@Nullable
		private ChiSquareHeuristic chiSquare;

		@Nullable
		private TermsExclude exclude;

		@Nullable
		private TermsAggregationExecutionHint executionHint;

		@Nullable
		private String field;

		@Nullable
		private GoogleNormalizedDistanceHeuristic gnd;

		@Nullable
		private List<String> include;

		@Nullable
		private Long minDocCount;

		@Nullable
		private MutualInformationHeuristic mutualInformation;

		@Nullable
		private PercentageScoreHeuristic percentage;

		@Nullable
		private ScriptedHeuristic scriptHeuristic;

		@Nullable
		private Long shardMinDocCount;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Integer size;

		/**
		 * API name: {@code background_filter}
		 */
		public final Builder backgroundFilter(@Nullable Query value) {
			this.backgroundFilter = value;
			return this;
		}

		/**
		 * API name: {@code background_filter}
		 */
		public final Builder backgroundFilter(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.backgroundFilter(builder.build());
		}

		/**
		 * API name: {@code chi_square}
		 */
		public final Builder chiSquare(@Nullable ChiSquareHeuristic value) {
			this.chiSquare = value;
			return this;
		}

		/**
		 * API name: {@code chi_square}
		 */
		public final Builder chiSquare(Consumer<ChiSquareHeuristic.Builder> fn) {
			ChiSquareHeuristic.Builder builder = new ChiSquareHeuristic.Builder();
			fn.accept(builder);
			return this.chiSquare(builder.build());
		}

		/**
		 * API name: {@code exclude}
		 */
		public final Builder exclude(@Nullable TermsExclude value) {
			this.exclude = value;
			return this;
		}

		/**
		 * API name: {@code exclude}
		 */
		public final Builder exclude(Consumer<TermsExclude.Builder> fn) {
			TermsExclude.Builder builder = new TermsExclude.Builder();
			fn.accept(builder);
			return this.exclude(builder.build());
		}

		/**
		 * API name: {@code execution_hint}
		 */
		public final Builder executionHint(@Nullable TermsAggregationExecutionHint value) {
			this.executionHint = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code gnd}
		 */
		public final Builder gnd(@Nullable GoogleNormalizedDistanceHeuristic value) {
			this.gnd = value;
			return this;
		}

		/**
		 * API name: {@code gnd}
		 */
		public final Builder gnd(Consumer<GoogleNormalizedDistanceHeuristic.Builder> fn) {
			GoogleNormalizedDistanceHeuristic.Builder builder = new GoogleNormalizedDistanceHeuristic.Builder();
			fn.accept(builder);
			return this.gnd(builder.build());
		}

		/**
		 * API name: {@code include}
		 */
		public final Builder include(@Nullable List<String> value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public final Builder include(String... value) {
			this.include = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Long value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * API name: {@code mutual_information}
		 */
		public final Builder mutualInformation(@Nullable MutualInformationHeuristic value) {
			this.mutualInformation = value;
			return this;
		}

		/**
		 * API name: {@code mutual_information}
		 */
		public final Builder mutualInformation(Consumer<MutualInformationHeuristic.Builder> fn) {
			MutualInformationHeuristic.Builder builder = new MutualInformationHeuristic.Builder();
			fn.accept(builder);
			return this.mutualInformation(builder.build());
		}

		/**
		 * API name: {@code percentage}
		 */
		public final Builder percentage(@Nullable PercentageScoreHeuristic value) {
			this.percentage = value;
			return this;
		}

		/**
		 * API name: {@code percentage}
		 */
		public final Builder percentage(Consumer<PercentageScoreHeuristic.Builder> fn) {
			PercentageScoreHeuristic.Builder builder = new PercentageScoreHeuristic.Builder();
			fn.accept(builder);
			return this.percentage(builder.build());
		}

		/**
		 * API name: {@code script_heuristic}
		 */
		public final Builder scriptHeuristic(@Nullable ScriptedHeuristic value) {
			this.scriptHeuristic = value;
			return this;
		}

		/**
		 * API name: {@code script_heuristic}
		 */
		public final Builder scriptHeuristic(Consumer<ScriptedHeuristic.Builder> fn) {
			ScriptedHeuristic.Builder builder = new ScriptedHeuristic.Builder();
			fn.accept(builder);
			return this.scriptHeuristic(builder.build());
		}

		/**
		 * API name: {@code shard_min_doc_count}
		 */
		public final Builder shardMinDocCount(@Nullable Long value) {
			this.shardMinDocCount = value;
			return this;
		}

		/**
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SignificantTermsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SignificantTermsAggregation build() {
			_checkSingleUse();

			return new SignificantTermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SignificantTermsAggregation}
	 */
	public static final JsonpDeserializer<SignificantTermsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SignificantTermsAggregation::setupSignificantTermsAggregationDeserializer);

	protected static void setupSignificantTermsAggregationDeserializer(
			ObjectDeserializer<SignificantTermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::backgroundFilter, Query._DESERIALIZER, "background_filter");
		op.add(Builder::chiSquare, ChiSquareHeuristic._DESERIALIZER, "chi_square");
		op.add(Builder::exclude, TermsExclude._DESERIALIZER, "exclude");
		op.add(Builder::executionHint, TermsAggregationExecutionHint._DESERIALIZER, "execution_hint");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::gnd, GoogleNormalizedDistanceHeuristic._DESERIALIZER, "gnd");
		op.add(Builder::include, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"include");
		op.add(Builder::minDocCount, JsonpDeserializer.longDeserializer(), "min_doc_count");
		op.add(Builder::mutualInformation, MutualInformationHeuristic._DESERIALIZER, "mutual_information");
		op.add(Builder::percentage, PercentageScoreHeuristic._DESERIALIZER, "percentage");
		op.add(Builder::scriptHeuristic, ScriptedHeuristic._DESERIALIZER, "script_heuristic");
		op.add(Builder::shardMinDocCount, JsonpDeserializer.longDeserializer(), "shard_min_doc_count");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");

	}

}
