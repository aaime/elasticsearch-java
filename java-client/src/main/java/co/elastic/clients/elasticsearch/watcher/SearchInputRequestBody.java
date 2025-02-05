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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher._types.SearchInputRequestBody
@JsonpDeserializable
public class SearchInputRequestBody implements JsonpSerializable {
	private final Query query;

	// ---------------------------------------------------------------------------------------------

	private SearchInputRequestBody(Builder builder) {

		this.query = ModelTypeHelper.requireNonNull(builder.query, this, "query");

	}

	public static SearchInputRequestBody of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final Query query() {
		return this.query;
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

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchInputRequestBody}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SearchInputRequestBody> {
		private Query query;

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.query(builder.build());
		}

		/**
		 * Builds a {@link SearchInputRequestBody}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchInputRequestBody build() {
			_checkSingleUse();

			return new SearchInputRequestBody(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchInputRequestBody}
	 */
	public static final JsonpDeserializer<SearchInputRequestBody> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchInputRequestBody::setupSearchInputRequestBodyDeserializer);

	protected static void setupSearchInputRequestBodyDeserializer(
			ObjectDeserializer<SearchInputRequestBody.Builder> op) {

		op.add(Builder::query, Query._DESERIALIZER, "query");

	}

}
