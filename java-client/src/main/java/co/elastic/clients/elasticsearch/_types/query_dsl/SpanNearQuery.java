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
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanNearQuery
@JsonpDeserializable
public class SpanNearQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	private final List<SpanQuery> clauses;

	@Nullable
	private final Boolean inOrder;

	@Nullable
	private final Integer slop;

	// ---------------------------------------------------------------------------------------------

	private SpanNearQuery(Builder builder) {
		super(builder);

		this.clauses = ModelTypeHelper.unmodifiableRequired(builder.clauses, this, "clauses");
		this.inOrder = builder.inOrder;
		this.slop = builder.slop;

	}

	public static SpanNearQuery of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * SpanQuery variant kind.
	 */
	@Override
	public SpanQuery.Kind _spanQueryKind() {
		return SpanQuery.Kind.SpanNear;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SpanNear;
	}

	/**
	 * Required - API name: {@code clauses}
	 */
	public final List<SpanQuery> clauses() {
		return this.clauses;
	}

	/**
	 * API name: {@code in_order}
	 */
	@Nullable
	public final Boolean inOrder() {
		return this.inOrder;
	}

	/**
	 * API name: {@code slop}
	 */
	@Nullable
	public final Integer slop() {
		return this.slop;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.clauses)) {
			generator.writeKey("clauses");
			generator.writeStartArray();
			for (SpanQuery item0 : this.clauses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.inOrder != null) {
			generator.writeKey("in_order");
			generator.write(this.inOrder);

		}
		if (this.slop != null) {
			generator.writeKey("slop");
			generator.write(this.slop);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanNearQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanNearQuery> {
		private List<SpanQuery> clauses;

		@Nullable
		private Boolean inOrder;

		@Nullable
		private Integer slop;

		/**
		 * Required - API name: {@code clauses}
		 */
		public final Builder clauses(List<SpanQuery> value) {
			this.clauses = value;
			return this;
		}

		/**
		 * Required - API name: {@code clauses}
		 */
		public final Builder clauses(SpanQuery... value) {
			this.clauses = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code clauses}
		 */
		public final Builder clauses(
				Function<ListBuilder<SpanQuery, SpanQuery.Builder>, ObjectBuilder<List<SpanQuery>>> fn) {
			return clauses(fn.apply(new ListBuilder<>(SpanQuery.Builder::new)).build());
		}

		/**
		 * API name: {@code in_order}
		 */
		public final Builder inOrder(@Nullable Boolean value) {
			this.inOrder = value;
			return this;
		}

		/**
		 * API name: {@code slop}
		 */
		public final Builder slop(@Nullable Integer value) {
			this.slop = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanNearQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanNearQuery build() {
			_checkSingleUse();

			return new SpanNearQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanNearQuery}
	 */
	public static final JsonpDeserializer<SpanNearQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanNearQuery::setupSpanNearQueryDeserializer);

	protected static void setupSpanNearQueryDeserializer(ObjectDeserializer<SpanNearQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::clauses, JsonpDeserializer.arrayDeserializer(SpanQuery._DESERIALIZER), "clauses");
		op.add(Builder::inOrder, JsonpDeserializer.booleanDeserializer(), "in_order");
		op.add(Builder::slop, JsonpDeserializer.integerDeserializer(), "slop");

	}

}
