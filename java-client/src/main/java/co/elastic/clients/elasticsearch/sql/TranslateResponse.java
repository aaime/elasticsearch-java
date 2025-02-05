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

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch.core.search.SourceConfig;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: sql.translate.Response
@JsonpDeserializable
public class TranslateResponse implements JsonpSerializable {
	private final long size;

	private final SourceConfig source;

	private final List<Map<String, String>> fields;

	private final List<SortOptions> sort;

	// ---------------------------------------------------------------------------------------------

	private TranslateResponse(Builder builder) {

		this.size = ModelTypeHelper.requireNonNull(builder.size, this, "size");
		this.source = ModelTypeHelper.requireNonNull(builder.source, this, "source");
		this.fields = ModelTypeHelper.unmodifiableRequired(builder.fields, this, "fields");
		this.sort = ModelTypeHelper.unmodifiableRequired(builder.sort, this, "sort");

	}

	public static TranslateResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final long size() {
		return this.size;
	}

	/**
	 * Required - API name: {@code _source}
	 */
	public final SourceConfig source() {
		return this.source;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final List<Map<String, String>> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
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

		generator.writeKey("size");
		generator.write(this.size);

		generator.writeKey("_source");
		this.source.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (Map<String, String> item0 : this.fields) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, String> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslateResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TranslateResponse> {
		private Long size;

		private SourceConfig source;

		private List<Map<String, String>> fields;

		private List<SortOptions> sort;

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(long value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - API name: {@code _source}
		 */
		public final Builder source(SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - API name: {@code _source}
		 */
		public final Builder source(Consumer<SourceConfig.Builder> fn) {
			SourceConfig.Builder builder = new SourceConfig.Builder();
			fn.accept(builder);
			return this.source(builder.build());
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public final Builder fields(List<Map<String, String>> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public final Builder fields(Map<String, String>... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 */
		public final Builder sort(List<SortOptions> value) {
			this.sort = value;
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 */
		public final Builder sort(SortOptions... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 */
		public final Builder sort(
				Function<ListBuilder<SortOptions, SortOptions.Builder>, ObjectBuilder<List<SortOptions>>> fn) {
			return sort(fn.apply(new ListBuilder<>(SortOptions.Builder::new)).build());
		}

		/**
		 * Builds a {@link TranslateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslateResponse build() {
			_checkSingleUse();

			return new TranslateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TranslateResponse}
	 */
	public static final JsonpDeserializer<TranslateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TranslateResponse::setupTranslateResponseDeserializer);

	protected static void setupTranslateResponseDeserializer(ObjectDeserializer<TranslateResponse.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");
		op.add(Builder::source, SourceConfig._DESERIALIZER, "_source");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())), "fields");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");

	}

}
