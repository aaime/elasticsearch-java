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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.aggregations.PercentileRanksAggregation
@JsonpDeserializable
public class PercentileRanksAggregation extends FormatMetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Boolean keyed;

	private final List<Double> values;

	@Nullable
	private final HdrMethod hdr;

	@Nullable
	private final TDigest tdigest;

	// ---------------------------------------------------------------------------------------------

	private PercentileRanksAggregation(Builder builder) {
		super(builder);

		this.keyed = builder.keyed;
		this.values = ModelTypeHelper.unmodifiable(builder.values);
		this.hdr = builder.hdr;
		this.tdigest = builder.tdigest;

	}

	public static PercentileRanksAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.PercentileRanks;
	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	/**
	 * API name: {@code values}
	 */
	public final List<Double> values() {
		return this.values;
	}

	/**
	 * API name: {@code hdr}
	 */
	@Nullable
	public final HdrMethod hdr() {
		return this.hdr;
	}

	/**
	 * API name: {@code tdigest}
	 */
	@Nullable
	public final TDigest tdigest() {
		return this.tdigest;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}
		if (ModelTypeHelper.isDefined(this.values)) {
			generator.writeKey("values");
			generator.writeStartArray();
			for (Double item0 : this.values) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.hdr != null) {
			generator.writeKey("hdr");
			this.hdr.serialize(generator, mapper);

		}
		if (this.tdigest != null) {
			generator.writeKey("tdigest");
			this.tdigest.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PercentileRanksAggregation}.
	 */
	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PercentileRanksAggregation> {
		@Nullable
		private Boolean keyed;

		@Nullable
		private List<Double> values;

		@Nullable
		private HdrMethod hdr;

		@Nullable
		private TDigest tdigest;

		/**
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		/**
		 * API name: {@code values}
		 */
		public final Builder values(@Nullable List<Double> value) {
			this.values = value;
			return this;
		}

		/**
		 * API name: {@code values}
		 */
		public final Builder values(Double... value) {
			this.values = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code hdr}
		 */
		public final Builder hdr(@Nullable HdrMethod value) {
			this.hdr = value;
			return this;
		}

		/**
		 * API name: {@code hdr}
		 */
		public final Builder hdr(Consumer<HdrMethod.Builder> fn) {
			HdrMethod.Builder builder = new HdrMethod.Builder();
			fn.accept(builder);
			return this.hdr(builder.build());
		}

		/**
		 * API name: {@code tdigest}
		 */
		public final Builder tdigest(@Nullable TDigest value) {
			this.tdigest = value;
			return this;
		}

		/**
		 * API name: {@code tdigest}
		 */
		public final Builder tdigest(Consumer<TDigest.Builder> fn) {
			TDigest.Builder builder = new TDigest.Builder();
			fn.accept(builder);
			return this.tdigest(builder.build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PercentileRanksAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PercentileRanksAggregation build() {
			_checkSingleUse();

			return new PercentileRanksAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PercentileRanksAggregation}
	 */
	public static final JsonpDeserializer<PercentileRanksAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PercentileRanksAggregation::setupPercentileRanksAggregationDeserializer);

	protected static void setupPercentileRanksAggregationDeserializer(
			ObjectDeserializer<PercentileRanksAggregation.Builder> op) {
		FormatMetricAggregationBase.setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");
		op.add(Builder::values, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()), "values");
		op.add(Builder::hdr, HdrMethod._DESERIALIZER, "hdr");
		op.add(Builder::tdigest, TDigest._DESERIALIZER, "tdigest");

	}

}
