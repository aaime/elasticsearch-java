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

package co.elastic.clients.elasticsearch.core.reindex;

import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex.Source
@JsonpDeserializable
public class Source implements JsonpSerializable {
	private final List<String> index;

	@Nullable
	private final Query query;

	@Nullable
	private final RemoteSource remote;

	@Nullable
	private final Integer size;

	@Nullable
	private final SlicedScroll slice;

	private final List<SortOptions> sort;

	private final List<String> sourceFields;

	private final Map<String, RuntimeField> runtimeMappings;

	// ---------------------------------------------------------------------------------------------

	private Source(Builder builder) {

		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.query = builder.query;
		this.remote = builder.remote;
		this.size = builder.size;
		this.slice = builder.slice;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.sourceFields = ModelTypeHelper.unmodifiable(builder.sourceFields);
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);

	}

	public static Source of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * API name: {@code remote}
	 */
	@Nullable
	public final RemoteSource remote() {
		return this.remote;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code slice}
	 */
	@Nullable
	public final SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * API name: {@code _source}
	 */
	public final List<String> sourceFields() {
		return this.sourceFields;
	}

	/**
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
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

		if (ModelTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (String item0 : this.index) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.remote != null) {
			generator.writeKey("remote");
			this.remote.serialize(generator, mapper);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.slice != null) {
			generator.writeKey("slice");
			this.slice.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.sourceFields)) {
			generator.writeKey("_source");
			generator.writeStartArray();
			for (String item0 : this.sourceFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Source}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Source> {
		private List<String> index;

		@Nullable
		private Query query;

		@Nullable
		private RemoteSource remote;

		@Nullable
		private Integer size;

		@Nullable
		private SlicedScroll slice;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private List<String> sourceFields;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
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
		 * API name: {@code remote}
		 */
		public final Builder remote(@Nullable RemoteSource value) {
			this.remote = value;
			return this;
		}

		/**
		 * API name: {@code remote}
		 */
		public final Builder remote(Consumer<RemoteSource.Builder> fn) {
			RemoteSource.Builder builder = new RemoteSource.Builder();
			fn.accept(builder);
			return this.remote(builder.build());
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public final Builder slice(@Nullable SlicedScroll value) {
			this.slice = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public final Builder slice(Consumer<SlicedScroll.Builder> fn) {
			SlicedScroll.Builder builder = new SlicedScroll.Builder();
			fn.accept(builder);
			return this.slice(builder.build());
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable List<SortOptions> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(SortOptions... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(
				Function<ListBuilder<SortOptions, SortOptions.Builder>, ObjectBuilder<List<SortOptions>>> fn) {
			return sort(fn.apply(new ListBuilder<>(SortOptions.Builder::new)).build());
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder sourceFields(@Nullable List<String> value) {
			this.sourceFields = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder sourceFields(String... value) {
			this.sourceFields = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 */
		public final Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		public final Builder runtimeMappings(
				Function<MapBuilder<String, RuntimeField, RuntimeField.Builder>, ObjectBuilder<Map<String, RuntimeField>>> fn) {
			return runtimeMappings(fn.apply(new MapBuilder<>(RuntimeField.Builder::new)).build());
		}

		/**
		 * Builds a {@link Source}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Source build() {
			_checkSingleUse();

			return new Source(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Source}
	 */
	public static final JsonpDeserializer<Source> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Source::setupSourceDeserializer);

	protected static void setupSourceDeserializer(ObjectDeserializer<Source.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::remote, RemoteSource._DESERIALIZER, "remote");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::slice, SlicedScroll._DESERIALIZER, "slice");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");
		op.add(Builder::sourceFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"_source");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");

	}

}
