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

import co.elastic.clients.elasticsearch._types.DistanceUnit;
import co.elastic.clients.elasticsearch._types.GeoDistanceType;
import co.elastic.clients.elasticsearch._types.GeoLocation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoDistanceAggregation
@JsonpDeserializable
public class GeoDistanceAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final GeoDistanceType distanceType;

	@Nullable
	private final String field;

	@Nullable
	private final GeoLocation origin;

	private final List<AggregationRange> ranges;

	@Nullable
	private final DistanceUnit unit;

	// ---------------------------------------------------------------------------------------------

	private GeoDistanceAggregation(Builder builder) {
		super(builder);

		this.distanceType = builder.distanceType;
		this.field = builder.field;
		this.origin = builder.origin;
		this.ranges = ModelTypeHelper.unmodifiable(builder.ranges);
		this.unit = builder.unit;

	}

	public static GeoDistanceAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.GeoDistance;
	}

	/**
	 * API name: {@code distance_type}
	 */
	@Nullable
	public final GeoDistanceType distanceType() {
		return this.distanceType;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code origin}
	 */
	@Nullable
	public final GeoLocation origin() {
		return this.origin;
	}

	/**
	 * API name: {@code ranges}
	 */
	public final List<AggregationRange> ranges() {
		return this.ranges;
	}

	/**
	 * API name: {@code unit}
	 */
	@Nullable
	public final DistanceUnit unit() {
		return this.unit;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.distanceType != null) {
			generator.writeKey("distance_type");
			this.distanceType.serialize(generator, mapper);
		}
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.origin != null) {
			generator.writeKey("origin");
			this.origin.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.ranges)) {
			generator.writeKey("ranges");
			generator.writeStartArray();
			for (AggregationRange item0 : this.ranges) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.unit != null) {
			generator.writeKey("unit");
			this.unit.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoDistanceAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoDistanceAggregation> {
		@Nullable
		private GeoDistanceType distanceType;

		@Nullable
		private String field;

		@Nullable
		private GeoLocation origin;

		@Nullable
		private List<AggregationRange> ranges;

		@Nullable
		private DistanceUnit unit;

		/**
		 * API name: {@code distance_type}
		 */
		public final Builder distanceType(@Nullable GeoDistanceType value) {
			this.distanceType = value;
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
		 * API name: {@code origin}
		 */
		public final Builder origin(@Nullable GeoLocation value) {
			this.origin = value;
			return this;
		}

		/**
		 * API name: {@code origin}
		 */
		public final Builder origin(Consumer<GeoLocation.Builder> fn) {
			GeoLocation.Builder builder = new GeoLocation.Builder();
			fn.accept(builder);
			return this.origin(builder.build());
		}

		/**
		 * API name: {@code ranges}
		 */
		public final Builder ranges(@Nullable List<AggregationRange> value) {
			this.ranges = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public final Builder ranges(AggregationRange... value) {
			this.ranges = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public final Builder ranges(
				Function<ListBuilder<AggregationRange, AggregationRange.Builder>, ObjectBuilder<List<AggregationRange>>> fn) {
			return ranges(fn.apply(new ListBuilder<>(AggregationRange.Builder::new)).build());
		}

		/**
		 * API name: {@code unit}
		 */
		public final Builder unit(@Nullable DistanceUnit value) {
			this.unit = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoDistanceAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoDistanceAggregation build() {
			_checkSingleUse();

			return new GeoDistanceAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoDistanceAggregation}
	 */
	public static final JsonpDeserializer<GeoDistanceAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoDistanceAggregation::setupGeoDistanceAggregationDeserializer);

	protected static void setupGeoDistanceAggregationDeserializer(
			ObjectDeserializer<GeoDistanceAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::distanceType, GeoDistanceType._DESERIALIZER, "distance_type");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::origin, GeoLocation._DESERIALIZER, "origin");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(AggregationRange._DESERIALIZER), "ranges");
		op.add(Builder::unit, DistanceUnit._DESERIALIZER, "unit");

	}

}
