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
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MultiTermsAggregation
@JsonpDeserializable
public class MultiTermsAggregation extends BucketAggregationBase implements AggregationVariant {
	private final List<MultiTermLookup> terms;

	// ---------------------------------------------------------------------------------------------

	private MultiTermsAggregation(Builder builder) {
		super(builder);

		this.terms = ModelTypeHelper.unmodifiableRequired(builder.terms, this, "terms");

	}

	public static MultiTermsAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.MultiTerms;
	}

	/**
	 * Required - API name: {@code terms}
	 */
	public final List<MultiTermLookup> terms() {
		return this.terms;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.terms)) {
			generator.writeKey("terms");
			generator.writeStartArray();
			for (MultiTermLookup item0 : this.terms) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiTermsAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MultiTermsAggregation> {
		private List<MultiTermLookup> terms;

		/**
		 * Required - API name: {@code terms}
		 */
		public final Builder terms(List<MultiTermLookup> value) {
			this.terms = value;
			return this;
		}

		/**
		 * Required - API name: {@code terms}
		 */
		public final Builder terms(MultiTermLookup... value) {
			this.terms = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code terms}
		 */
		public final Builder terms(
				Function<ListBuilder<MultiTermLookup, MultiTermLookup.Builder>, ObjectBuilder<List<MultiTermLookup>>> fn) {
			return terms(fn.apply(new ListBuilder<>(MultiTermLookup.Builder::new)).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiTermsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiTermsAggregation build() {
			_checkSingleUse();

			return new MultiTermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiTermsAggregation}
	 */
	public static final JsonpDeserializer<MultiTermsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MultiTermsAggregation::setupMultiTermsAggregationDeserializer);

	protected static void setupMultiTermsAggregationDeserializer(ObjectDeserializer<MultiTermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::terms, JsonpDeserializer.arrayDeserializer(MultiTermLookup._DESERIALIZER), "terms");

	}

}
