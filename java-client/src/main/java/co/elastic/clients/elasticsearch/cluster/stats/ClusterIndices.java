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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.elasticsearch._types.CompletionStats;
import co.elastic.clients.elasticsearch._types.DocStats;
import co.elastic.clients.elasticsearch._types.FielddataStats;
import co.elastic.clients.elasticsearch._types.QueryCacheStats;
import co.elastic.clients.elasticsearch._types.SegmentsStats;
import co.elastic.clients.elasticsearch._types.StoreStats;
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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterIndices
@JsonpDeserializable
public class ClusterIndices implements JsonpSerializable {
	private final CompletionStats completion;

	private final long count;

	private final DocStats docs;

	private final FielddataStats fielddata;

	private final QueryCacheStats queryCache;

	private final SegmentsStats segments;

	private final ClusterIndicesShards shards;

	private final StoreStats store;

	private final FieldTypesMappings mappings;

	private final CharFilterTypes analysis;

	private final List<IndicesVersions> versions;

	// ---------------------------------------------------------------------------------------------

	private ClusterIndices(Builder builder) {

		this.completion = ModelTypeHelper.requireNonNull(builder.completion, this, "completion");
		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.docs = ModelTypeHelper.requireNonNull(builder.docs, this, "docs");
		this.fielddata = ModelTypeHelper.requireNonNull(builder.fielddata, this, "fielddata");
		this.queryCache = ModelTypeHelper.requireNonNull(builder.queryCache, this, "queryCache");
		this.segments = ModelTypeHelper.requireNonNull(builder.segments, this, "segments");
		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.store = ModelTypeHelper.requireNonNull(builder.store, this, "store");
		this.mappings = ModelTypeHelper.requireNonNull(builder.mappings, this, "mappings");
		this.analysis = ModelTypeHelper.requireNonNull(builder.analysis, this, "analysis");
		this.versions = ModelTypeHelper.unmodifiable(builder.versions);

	}

	public static ClusterIndices of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - Contains statistics about memory used for completion in selected
	 * nodes.
	 * <p>
	 * API name: {@code completion}
	 */
	public final CompletionStats completion() {
		return this.completion;
	}

	/**
	 * Required - Total number of indices with shards assigned to selected nodes.
	 * <p>
	 * API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - Contains counts for documents in selected nodes.
	 * <p>
	 * API name: {@code docs}
	 */
	public final DocStats docs() {
		return this.docs;
	}

	/**
	 * Required - Contains statistics about the field data cache of selected nodes.
	 * <p>
	 * API name: {@code fielddata}
	 */
	public final FielddataStats fielddata() {
		return this.fielddata;
	}

	/**
	 * Required - Contains statistics about the query cache of selected nodes.
	 * <p>
	 * API name: {@code query_cache}
	 */
	public final QueryCacheStats queryCache() {
		return this.queryCache;
	}

	/**
	 * Required - Contains statistics about segments in selected nodes.
	 * <p>
	 * API name: {@code segments}
	 */
	public final SegmentsStats segments() {
		return this.segments;
	}

	/**
	 * Required - Contains statistics about indices with shards assigned to selected
	 * nodes.
	 * <p>
	 * API name: {@code shards}
	 */
	public final ClusterIndicesShards shards() {
		return this.shards;
	}

	/**
	 * Required - Contains statistics about the size of shards assigned to selected
	 * nodes.
	 * <p>
	 * API name: {@code store}
	 */
	public final StoreStats store() {
		return this.store;
	}

	/**
	 * Required - Contains statistics about field mappings in selected nodes.
	 * <p>
	 * API name: {@code mappings}
	 */
	public final FieldTypesMappings mappings() {
		return this.mappings;
	}

	/**
	 * Required - Contains statistics about analyzers and analyzer components used
	 * in selected nodes.
	 * <p>
	 * API name: {@code analysis}
	 */
	public final CharFilterTypes analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code versions}
	 */
	public final List<IndicesVersions> versions() {
		return this.versions;
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

		generator.writeKey("completion");
		this.completion.serialize(generator, mapper);

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("docs");
		this.docs.serialize(generator, mapper);

		generator.writeKey("fielddata");
		this.fielddata.serialize(generator, mapper);

		generator.writeKey("query_cache");
		this.queryCache.serialize(generator, mapper);

		generator.writeKey("segments");
		this.segments.serialize(generator, mapper);

		generator.writeKey("shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("store");
		this.store.serialize(generator, mapper);

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

		generator.writeKey("analysis");
		this.analysis.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.versions)) {
			generator.writeKey("versions");
			generator.writeStartArray();
			for (IndicesVersions item0 : this.versions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterIndices}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterIndices> {
		private CompletionStats completion;

		private Long count;

		private DocStats docs;

		private FielddataStats fielddata;

		private QueryCacheStats queryCache;

		private SegmentsStats segments;

		private ClusterIndicesShards shards;

		private StoreStats store;

		private FieldTypesMappings mappings;

		private CharFilterTypes analysis;

		@Nullable
		private List<IndicesVersions> versions;

		/**
		 * Required - Contains statistics about memory used for completion in selected
		 * nodes.
		 * <p>
		 * API name: {@code completion}
		 */
		public final Builder completion(CompletionStats value) {
			this.completion = value;
			return this;
		}

		/**
		 * Required - Contains statistics about memory used for completion in selected
		 * nodes.
		 * <p>
		 * API name: {@code completion}
		 */
		public final Builder completion(Consumer<CompletionStats.Builder> fn) {
			CompletionStats.Builder builder = new CompletionStats.Builder();
			fn.accept(builder);
			return this.completion(builder.build());
		}

		/**
		 * Required - Total number of indices with shards assigned to selected nodes.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Contains counts for documents in selected nodes.
		 * <p>
		 * API name: {@code docs}
		 */
		public final Builder docs(DocStats value) {
			this.docs = value;
			return this;
		}

		/**
		 * Required - Contains counts for documents in selected nodes.
		 * <p>
		 * API name: {@code docs}
		 */
		public final Builder docs(Consumer<DocStats.Builder> fn) {
			DocStats.Builder builder = new DocStats.Builder();
			fn.accept(builder);
			return this.docs(builder.build());
		}

		/**
		 * Required - Contains statistics about the field data cache of selected nodes.
		 * <p>
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(FielddataStats value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the field data cache of selected nodes.
		 * <p>
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(Consumer<FielddataStats.Builder> fn) {
			FielddataStats.Builder builder = new FielddataStats.Builder();
			fn.accept(builder);
			return this.fielddata(builder.build());
		}

		/**
		 * Required - Contains statistics about the query cache of selected nodes.
		 * <p>
		 * API name: {@code query_cache}
		 */
		public final Builder queryCache(QueryCacheStats value) {
			this.queryCache = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the query cache of selected nodes.
		 * <p>
		 * API name: {@code query_cache}
		 */
		public final Builder queryCache(Consumer<QueryCacheStats.Builder> fn) {
			QueryCacheStats.Builder builder = new QueryCacheStats.Builder();
			fn.accept(builder);
			return this.queryCache(builder.build());
		}

		/**
		 * Required - Contains statistics about segments in selected nodes.
		 * <p>
		 * API name: {@code segments}
		 */
		public final Builder segments(SegmentsStats value) {
			this.segments = value;
			return this;
		}

		/**
		 * Required - Contains statistics about segments in selected nodes.
		 * <p>
		 * API name: {@code segments}
		 */
		public final Builder segments(Consumer<SegmentsStats.Builder> fn) {
			SegmentsStats.Builder builder = new SegmentsStats.Builder();
			fn.accept(builder);
			return this.segments(builder.build());
		}

		/**
		 * Required - Contains statistics about indices with shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code shards}
		 */
		public final Builder shards(ClusterIndicesShards value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - Contains statistics about indices with shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code shards}
		 */
		public final Builder shards(Consumer<ClusterIndicesShards.Builder> fn) {
			ClusterIndicesShards.Builder builder = new ClusterIndicesShards.Builder();
			fn.accept(builder);
			return this.shards(builder.build());
		}

		/**
		 * Required - Contains statistics about the size of shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code store}
		 */
		public final Builder store(StoreStats value) {
			this.store = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the size of shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code store}
		 */
		public final Builder store(Consumer<StoreStats.Builder> fn) {
			StoreStats.Builder builder = new StoreStats.Builder();
			fn.accept(builder);
			return this.store(builder.build());
		}

		/**
		 * Required - Contains statistics about field mappings in selected nodes.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(FieldTypesMappings value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - Contains statistics about field mappings in selected nodes.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Consumer<FieldTypesMappings.Builder> fn) {
			FieldTypesMappings.Builder builder = new FieldTypesMappings.Builder();
			fn.accept(builder);
			return this.mappings(builder.build());
		}

		/**
		 * Required - Contains statistics about analyzers and analyzer components used
		 * in selected nodes.
		 * <p>
		 * API name: {@code analysis}
		 */
		public final Builder analysis(CharFilterTypes value) {
			this.analysis = value;
			return this;
		}

		/**
		 * Required - Contains statistics about analyzers and analyzer components used
		 * in selected nodes.
		 * <p>
		 * API name: {@code analysis}
		 */
		public final Builder analysis(Consumer<CharFilterTypes.Builder> fn) {
			CharFilterTypes.Builder builder = new CharFilterTypes.Builder();
			fn.accept(builder);
			return this.analysis(builder.build());
		}

		/**
		 * API name: {@code versions}
		 */
		public final Builder versions(@Nullable List<IndicesVersions> value) {
			this.versions = value;
			return this;
		}

		/**
		 * API name: {@code versions}
		 */
		public final Builder versions(IndicesVersions... value) {
			this.versions = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code versions}
		 */
		public final Builder versions(
				Function<ListBuilder<IndicesVersions, IndicesVersions.Builder>, ObjectBuilder<List<IndicesVersions>>> fn) {
			return versions(fn.apply(new ListBuilder<>(IndicesVersions.Builder::new)).build());
		}

		/**
		 * Builds a {@link ClusterIndices}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterIndices build() {
			_checkSingleUse();

			return new ClusterIndices(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterIndices}
	 */
	public static final JsonpDeserializer<ClusterIndices> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterIndices::setupClusterIndicesDeserializer);

	protected static void setupClusterIndicesDeserializer(ObjectDeserializer<ClusterIndices.Builder> op) {

		op.add(Builder::completion, CompletionStats._DESERIALIZER, "completion");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::docs, DocStats._DESERIALIZER, "docs");
		op.add(Builder::fielddata, FielddataStats._DESERIALIZER, "fielddata");
		op.add(Builder::queryCache, QueryCacheStats._DESERIALIZER, "query_cache");
		op.add(Builder::segments, SegmentsStats._DESERIALIZER, "segments");
		op.add(Builder::shards, ClusterIndicesShards._DESERIALIZER, "shards");
		op.add(Builder::store, StoreStats._DESERIALIZER, "store");
		op.add(Builder::mappings, FieldTypesMappings._DESERIALIZER, "mappings");
		op.add(Builder::analysis, CharFilterTypes._DESERIALIZER, "analysis");
		op.add(Builder::versions, JsonpDeserializer.arrayDeserializer(IndicesVersions._DESERIALIZER), "versions");

	}

}
