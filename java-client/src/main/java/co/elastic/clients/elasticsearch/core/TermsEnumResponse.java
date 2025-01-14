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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.terms_enum.Response
@JsonpDeserializable
public class TermsEnumResponse implements JsonpSerializable {
	private final ShardStatistics shards;

	private final List<String> terms;

	private final boolean complete;

	// ---------------------------------------------------------------------------------------------

	private TermsEnumResponse(Builder builder) {

		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.terms = ModelTypeHelper.unmodifiableRequired(builder.terms, this, "terms");
		this.complete = ModelTypeHelper.requireNonNull(builder.complete, this, "complete");

	}

	public static TermsEnumResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code terms}
	 */
	public final List<String> terms() {
		return this.terms;
	}

	/**
	 * Required - API name: {@code complete}
	 */
	public final boolean complete() {
		return this.complete;
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

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.terms)) {
			generator.writeKey("terms");
			generator.writeStartArray();
			for (String item0 : this.terms) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("complete");
		generator.write(this.complete);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsEnumResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TermsEnumResponse> {
		private ShardStatistics shards;

		private List<String> terms;

		private Boolean complete;

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder shards(Consumer<ShardStatistics.Builder> fn) {
			ShardStatistics.Builder builder = new ShardStatistics.Builder();
			fn.accept(builder);
			return this.shards(builder.build());
		}

		/**
		 * Required - API name: {@code terms}
		 */
		public final Builder terms(List<String> value) {
			this.terms = value;
			return this;
		}

		/**
		 * Required - API name: {@code terms}
		 */
		public final Builder terms(String... value) {
			this.terms = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code complete}
		 */
		public final Builder complete(boolean value) {
			this.complete = value;
			return this;
		}

		/**
		 * Builds a {@link TermsEnumResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsEnumResponse build() {
			_checkSingleUse();

			return new TermsEnumResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermsEnumResponse}
	 */
	public static final JsonpDeserializer<TermsEnumResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TermsEnumResponse::setupTermsEnumResponseDeserializer);

	protected static void setupTermsEnumResponseDeserializer(ObjectDeserializer<TermsEnumResponse.Builder> op) {

		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::terms, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "terms");
		op.add(Builder::complete, JsonpDeserializer.booleanDeserializer(), "complete");

	}

}
