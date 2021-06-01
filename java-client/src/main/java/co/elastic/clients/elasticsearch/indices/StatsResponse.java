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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.indices.stats.IndicesStats;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.Response
public final class StatsResponse implements ToJsonp {
	@Nullable
	private final Map<String, IndicesStats> indices;

	private final ShardStatistics _shards;

	private final IndicesStats _all;

	// ---------------------------------------------------------------------------------------------

	protected StatsResponse(Builder builder) {

		this.indices = builder.indices;
		this._shards = Objects.requireNonNull(builder._shards, "_shards");
		this._all = Objects.requireNonNull(builder._all, "_all");

	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public Map<String, IndicesStats> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics _shards() {
		return this._shards;
	}

	/**
	 * API name: {@code _all}
	 */
	public IndicesStats _all() {
		return this._all;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.indices != null) {

			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, IndicesStats> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("_shards");
		this._shards.toJsonp(generator, mapper);

		generator.writeKey("_all");
		this._all.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<StatsResponse> {
		@Nullable
		private Map<String, IndicesStats> indices;

		private ShardStatistics _shards;

		private IndicesStats _all;

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable Map<String, IndicesStats> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, IndicesStats value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<IndicesStats.Builder, ObjectBuilder<IndicesStats>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new IndicesStats.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, Function<IndicesStats.Builder, ObjectBuilder<IndicesStats>> fn) {
			return this.putIndices(key, fn.apply(new IndicesStats.Builder()).build());
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder _shards(ShardStatistics value) {
			this._shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder _shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this._shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code _all}
		 */
		public Builder _all(IndicesStats value) {
			this._all = value;
			return this;
		}

		/**
		 * API name: {@code _all}
		 */
		public Builder _all(Function<IndicesStats.Builder, ObjectBuilder<IndicesStats>> fn) {
			return this._all(fn.apply(new IndicesStats.Builder()).build());
		}

		/**
		 * Builds a {@link StatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsResponse build() {

			return new StatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for StatsResponse
	 */
	public static final JsonpValueParser<StatsResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, StatsResponse::setupStatsResponseParser);

	protected static void setupStatsResponseParser(DelegatingJsonpValueParser<StatsResponse.Builder> op) {

		op.add(Builder::indices, JsonpValueParser.stringMapParser(IndicesStats.JSONP_PARSER), "indices");
		op.add(Builder::_shards, ShardStatistics.JSONP_PARSER, "_shards");
		op.add(Builder::_all, IndicesStats.JSONP_PARSER, "_all");

	}

}