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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.QueryProfile
@JsonpDeserializable
public class QueryProfile implements JsonpSerializable {
	private final QueryBreakdown breakdown;

	private final String description;

	private final long timeInNanos;

	private final String type;

	private final List<QueryProfile> children;

	// ---------------------------------------------------------------------------------------------

	private QueryProfile(Builder builder) {

		this.breakdown = ModelTypeHelper.requireNonNull(builder.breakdown, this, "breakdown");
		this.description = ModelTypeHelper.requireNonNull(builder.description, this, "description");
		this.timeInNanos = ModelTypeHelper.requireNonNull(builder.timeInNanos, this, "timeInNanos");
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.children = ModelTypeHelper.unmodifiable(builder.children);

	}

	public static QueryProfile of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code breakdown}
	 */
	public final QueryBreakdown breakdown() {
		return this.breakdown;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code time_in_nanos}
	 */
	public final long timeInNanos() {
		return this.timeInNanos;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code children}
	 */
	public final List<QueryProfile> children() {
		return this.children;
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

		generator.writeKey("breakdown");
		this.breakdown.serialize(generator, mapper);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("time_in_nanos");
		generator.write(this.timeInNanos);

		generator.writeKey("type");
		generator.write(this.type);

		if (ModelTypeHelper.isDefined(this.children)) {
			generator.writeKey("children");
			generator.writeStartArray();
			for (QueryProfile item0 : this.children) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryProfile}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<QueryProfile> {
		private QueryBreakdown breakdown;

		private String description;

		private Long timeInNanos;

		private String type;

		@Nullable
		private List<QueryProfile> children;

		/**
		 * Required - API name: {@code breakdown}
		 */
		public final Builder breakdown(QueryBreakdown value) {
			this.breakdown = value;
			return this;
		}

		/**
		 * Required - API name: {@code breakdown}
		 */
		public final Builder breakdown(Consumer<QueryBreakdown.Builder> fn) {
			QueryBreakdown.Builder builder = new QueryBreakdown.Builder();
			fn.accept(builder);
			return this.breakdown(builder.build());
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_in_nanos}
		 */
		public final Builder timeInNanos(long value) {
			this.timeInNanos = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public final Builder children(@Nullable List<QueryProfile> value) {
			this.children = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public final Builder children(QueryProfile... value) {
			this.children = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public final Builder children(
				Function<ListBuilder<QueryProfile, QueryProfile.Builder>, ObjectBuilder<List<QueryProfile>>> fn) {
			return children(fn.apply(new ListBuilder<>(QueryProfile.Builder::new)).build());
		}

		/**
		 * Builds a {@link QueryProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryProfile build() {
			_checkSingleUse();

			return new QueryProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryProfile}
	 */
	public static final JsonpDeserializer<QueryProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryProfile::setupQueryProfileDeserializer);

	protected static void setupQueryProfileDeserializer(ObjectDeserializer<QueryProfile.Builder> op) {

		op.add(Builder::breakdown, QueryBreakdown._DESERIALIZER, "breakdown");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::timeInNanos, JsonpDeserializer.longDeserializer(), "time_in_nanos");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::children, JsonpDeserializer.arrayDeserializer(QueryProfile._DESERIALIZER), "children");

	}

}
