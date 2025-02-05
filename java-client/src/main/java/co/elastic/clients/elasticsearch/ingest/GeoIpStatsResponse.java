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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch.ingest.geo_ip_stats.GeoIpDownloadStatistics;
import co.elastic.clients.elasticsearch.ingest.geo_ip_stats.GeoIpNodeDatabases;
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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.geo_ip_stats.Response
@JsonpDeserializable
public class GeoIpStatsResponse implements JsonpSerializable {
	private final GeoIpDownloadStatistics stats;

	private final Map<String, GeoIpNodeDatabases> nodes;

	// ---------------------------------------------------------------------------------------------

	private GeoIpStatsResponse(Builder builder) {

		this.stats = ModelTypeHelper.requireNonNull(builder.stats, this, "stats");
		this.nodes = ModelTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static GeoIpStatsResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - Download statistics for all GeoIP2 databases.
	 * <p>
	 * API name: {@code stats}
	 */
	public final GeoIpDownloadStatistics stats() {
		return this.stats;
	}

	/**
	 * Required - Downloaded GeoIP2 databases for each node.
	 * <p>
	 * API name: {@code nodes}
	 */
	public final Map<String, GeoIpNodeDatabases> nodes() {
		return this.nodes;
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

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, GeoIpNodeDatabases> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpStatsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoIpStatsResponse> {
		private GeoIpDownloadStatistics stats;

		private Map<String, GeoIpNodeDatabases> nodes;

		/**
		 * Required - Download statistics for all GeoIP2 databases.
		 * <p>
		 * API name: {@code stats}
		 */
		public final Builder stats(GeoIpDownloadStatistics value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - Download statistics for all GeoIP2 databases.
		 * <p>
		 * API name: {@code stats}
		 */
		public final Builder stats(Consumer<GeoIpDownloadStatistics.Builder> fn) {
			GeoIpDownloadStatistics.Builder builder = new GeoIpDownloadStatistics.Builder();
			fn.accept(builder);
			return this.stats(builder.build());
		}

		/**
		 * Required - Downloaded GeoIP2 databases for each node.
		 * <p>
		 * API name: {@code nodes}
		 */
		public final Builder nodes(Map<String, GeoIpNodeDatabases> value) {
			this.nodes = value;
			return this;
		}

		public final Builder nodes(
				Function<MapBuilder<String, GeoIpNodeDatabases, GeoIpNodeDatabases.Builder>, ObjectBuilder<Map<String, GeoIpNodeDatabases>>> fn) {
			return nodes(fn.apply(new MapBuilder<>(GeoIpNodeDatabases.Builder::new)).build());
		}

		/**
		 * Builds a {@link GeoIpStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoIpStatsResponse build() {
			_checkSingleUse();

			return new GeoIpStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoIpStatsResponse}
	 */
	public static final JsonpDeserializer<GeoIpStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoIpStatsResponse::setupGeoIpStatsResponseDeserializer);

	protected static void setupGeoIpStatsResponseDeserializer(ObjectDeserializer<GeoIpStatsResponse.Builder> op) {

		op.add(Builder::stats, GeoIpDownloadStatistics._DESERIALIZER, "stats");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(GeoIpNodeDatabases._DESERIALIZER), "nodes");

	}

}
