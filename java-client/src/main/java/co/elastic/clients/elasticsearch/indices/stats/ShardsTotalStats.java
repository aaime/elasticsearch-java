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

package co.elastic.clients.elasticsearch.indices.stats;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Consumer;

// typedef: indices.stats.ShardsTotalStats
@JsonpDeserializable
public class ShardsTotalStats implements JsonpSerializable {
	private final long totalCount;

	// ---------------------------------------------------------------------------------------------

	private ShardsTotalStats(Builder builder) {

		this.totalCount = ModelTypeHelper.requireNonNull(builder.totalCount, this, "totalCount");

	}

	public static ShardsTotalStats of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code total_count}
	 */
	public final long totalCount() {
		return this.totalCount;
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

		generator.writeKey("total_count");
		generator.write(this.totalCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsTotalStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardsTotalStats> {
		private Long totalCount;

		/**
		 * Required - API name: {@code total_count}
		 */
		public final Builder totalCount(long value) {
			this.totalCount = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsTotalStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsTotalStats build() {
			_checkSingleUse();

			return new ShardsTotalStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsTotalStats}
	 */
	public static final JsonpDeserializer<ShardsTotalStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardsTotalStats::setupShardsTotalStatsDeserializer);

	protected static void setupShardsTotalStatsDeserializer(ObjectDeserializer<ShardsTotalStats.Builder> op) {

		op.add(Builder::totalCount, JsonpDeserializer.longDeserializer(), "total_count");

	}

}
