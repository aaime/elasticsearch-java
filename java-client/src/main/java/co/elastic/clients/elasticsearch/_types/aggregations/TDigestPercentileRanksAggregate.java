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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;

// typedef: _types.aggregations.TDigestPercentileRanksAggregate
@JsonpDeserializable
public class TDigestPercentileRanksAggregate extends PercentilesAggregateBase implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private TDigestPercentileRanksAggregate(Builder builder) {
		super(builder);

	}

	public static TDigestPercentileRanksAggregate of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.TdigestPercentileRanks;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TDigestPercentileRanksAggregate}.
	 */
	public static class Builder extends PercentilesAggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TDigestPercentileRanksAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TDigestPercentileRanksAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TDigestPercentileRanksAggregate build() {
			_checkSingleUse();

			return new TDigestPercentileRanksAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TDigestPercentileRanksAggregate}
	 */
	public static final JsonpDeserializer<TDigestPercentileRanksAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TDigestPercentileRanksAggregate::setupTDigestPercentileRanksAggregateDeserializer);

	protected static void setupTDigestPercentileRanksAggregateDeserializer(
			ObjectDeserializer<TDigestPercentileRanksAggregate.Builder> op) {
		PercentilesAggregateBase.setupPercentilesAggregateBaseDeserializer(op);

	}

}
