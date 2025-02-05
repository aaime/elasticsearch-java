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

package co.elastic.clients.elasticsearch.core.msearch;

import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.search.PointInTimeReference;
import co.elastic.clients.elasticsearch.core.search.Suggester;
import co.elastic.clients.elasticsearch.core.search.TrackHits;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.msearch.MultisearchBody
@JsonpDeserializable
public class MultisearchBody implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final Query query;

	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	@Nullable
	private final PointInTimeReference pit;

	@Nullable
	private final TrackHits trackTotalHits;

	@Nullable
	private final Suggester suggest;

	// ---------------------------------------------------------------------------------------------

	private MultisearchBody(Builder builder) {

		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.query = builder.query;
		this.from = builder.from;
		this.size = builder.size;
		this.pit = builder.pit;
		this.trackTotalHits = builder.trackTotalHits;
		this.suggest = builder.suggest;

	}

	public static MultisearchBody of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code pit}
	 */
	@Nullable
	public final PointInTimeReference pit() {
		return this.pit;
	}

	/**
	 * API name: {@code track_total_hits}
	 */
	@Nullable
	public final TrackHits trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public final Suggester suggest() {
		return this.suggest;
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

		if (ModelTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.pit != null) {
			generator.writeKey("pit");
			this.pit.serialize(generator, mapper);

		}
		if (this.trackTotalHits != null) {
			generator.writeKey("track_total_hits");
			this.trackTotalHits.serialize(generator, mapper);

		}
		if (this.suggest != null) {
			generator.writeKey("suggest");
			this.suggest.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultisearchBody}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MultisearchBody> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Query query;

		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		@Nullable
		private PointInTimeReference pit;

		@Nullable
		private TrackHits trackTotalHits;

		@Nullable
		private Suggester suggest;

		/**
		 * API name: {@code aggregations}
		 */
		public final Builder aggregations(@Nullable Map<String, Aggregation> value) {
			this.aggregations = value;
			return this;
		}

		public final Builder aggregations(
				Function<MapBuilder<String, Aggregation, Aggregation.Builder>, ObjectBuilder<Map<String, Aggregation>>> fn) {
			return aggregations(fn.apply(new MapBuilder<>(Aggregation.Builder::new)).build());
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.query(builder.build());
		}

		/**
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code pit}
		 */
		public final Builder pit(@Nullable PointInTimeReference value) {
			this.pit = value;
			return this;
		}

		/**
		 * API name: {@code pit}
		 */
		public final Builder pit(Consumer<PointInTimeReference.Builder> fn) {
			PointInTimeReference.Builder builder = new PointInTimeReference.Builder();
			fn.accept(builder);
			return this.pit(builder.build());
		}

		/**
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(@Nullable TrackHits value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(Consumer<TrackHits.Builder> fn) {
			TrackHits.Builder builder = new TrackHits.Builder();
			fn.accept(builder);
			return this.trackTotalHits(builder.build());
		}

		/**
		 * API name: {@code suggest}
		 */
		public final Builder suggest(@Nullable Suggester value) {
			this.suggest = value;
			return this;
		}

		/**
		 * API name: {@code suggest}
		 */
		public final Builder suggest(Consumer<Suggester.Builder> fn) {
			Suggester.Builder builder = new Suggester.Builder();
			fn.accept(builder);
			return this.suggest(builder.build());
		}

		/**
		 * Builds a {@link MultisearchBody}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultisearchBody build() {
			_checkSingleUse();

			return new MultisearchBody(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultisearchBody}
	 */
	public static final JsonpDeserializer<MultisearchBody> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MultisearchBody::setupMultisearchBodyDeserializer);

	protected static void setupMultisearchBodyDeserializer(ObjectDeserializer<MultisearchBody.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::pit, PointInTimeReference._DESERIALIZER, "pit");
		op.add(Builder::trackTotalHits, TrackHits._DESERIALIZER, "track_total_hits");
		op.add(Builder::suggest, Suggester._DESERIALIZER, "suggest");

	}

}
