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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.BoostingQuery
@JsonpDeserializable
public class BoostingQuery extends QueryBase implements QueryVariant {
	private final double negativeBoost;

	private final Query negative;

	private final Query positive;

	// ---------------------------------------------------------------------------------------------

	private BoostingQuery(Builder builder) {
		super(builder);

		this.negativeBoost = ModelTypeHelper.requireNonNull(builder.negativeBoost, this, "negativeBoost");
		this.negative = ModelTypeHelper.requireNonNull(builder.negative, this, "negative");
		this.positive = ModelTypeHelper.requireNonNull(builder.positive, this, "positive");

	}

	public static BoostingQuery of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Boosting;
	}

	/**
	 * Required - API name: {@code negative_boost}
	 */
	public final double negativeBoost() {
		return this.negativeBoost;
	}

	/**
	 * Required - API name: {@code negative}
	 */
	public final Query negative() {
		return this.negative;
	}

	/**
	 * Required - API name: {@code positive}
	 */
	public final Query positive() {
		return this.positive;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("negative_boost");
		generator.write(this.negativeBoost);

		generator.writeKey("negative");
		this.negative.serialize(generator, mapper);

		generator.writeKey("positive");
		this.positive.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoostingQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<BoostingQuery> {
		private Double negativeBoost;

		private Query negative;

		private Query positive;

		/**
		 * Required - API name: {@code negative_boost}
		 */
		public final Builder negativeBoost(double value) {
			this.negativeBoost = value;
			return this;
		}

		/**
		 * Required - API name: {@code negative}
		 */
		public final Builder negative(Query value) {
			this.negative = value;
			return this;
		}

		/**
		 * Required - API name: {@code negative}
		 */
		public final Builder negative(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.negative(builder.build());
		}

		/**
		 * Required - API name: {@code positive}
		 */
		public final Builder positive(Query value) {
			this.positive = value;
			return this;
		}

		/**
		 * Required - API name: {@code positive}
		 */
		public final Builder positive(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.positive(builder.build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BoostingQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BoostingQuery build() {
			_checkSingleUse();

			return new BoostingQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BoostingQuery}
	 */
	public static final JsonpDeserializer<BoostingQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BoostingQuery::setupBoostingQueryDeserializer);

	protected static void setupBoostingQueryDeserializer(ObjectDeserializer<BoostingQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::negativeBoost, JsonpDeserializer.doubleDeserializer(), "negative_boost");
		op.add(Builder::negative, Query._DESERIALIZER, "negative");
		op.add(Builder::positive, Query._DESERIALIZER, "positive");

	}

}
