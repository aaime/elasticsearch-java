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

package co.elastic.clients.elasticsearch.core.rank_eval;

import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalRequestItem
@JsonpDeserializable
public class RankEvalRequestItem implements JsonpSerializable {
	private final String id;

	@Nullable
	private final RankEvalQuery request;

	private final List<DocumentRating> ratings;

	@Nullable
	private final String templateId;

	private final Map<String, JsonData> params;

	// ---------------------------------------------------------------------------------------------

	private RankEvalRequestItem(Builder builder) {

		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.request = builder.request;
		this.ratings = ModelTypeHelper.unmodifiableRequired(builder.ratings, this, "ratings");
		this.templateId = builder.templateId;
		this.params = ModelTypeHelper.unmodifiable(builder.params);

	}

	public static RankEvalRequestItem of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - The search request’s ID, used to group result details later.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * The query being evaluated.
	 * <p>
	 * API name: {@code request}
	 */
	@Nullable
	public final RankEvalQuery request() {
		return this.request;
	}

	/**
	 * Required - List of document ratings
	 * <p>
	 * API name: {@code ratings}
	 */
	public final List<DocumentRating> ratings() {
		return this.ratings;
	}

	/**
	 * The search template Id
	 * <p>
	 * API name: {@code template_id}
	 */
	@Nullable
	public final String templateId() {
		return this.templateId;
	}

	/**
	 * The search template parameters.
	 * <p>
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.request != null) {
			generator.writeKey("request");
			this.request.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.ratings)) {
			generator.writeKey("ratings");
			generator.writeStartArray();
			for (DocumentRating item0 : this.ratings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.templateId != null) {
			generator.writeKey("template_id");
			generator.write(this.templateId);

		}
		if (ModelTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalRequestItem}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RankEvalRequestItem> {
		private String id;

		@Nullable
		private RankEvalQuery request;

		private List<DocumentRating> ratings;

		@Nullable
		private String templateId;

		@Nullable
		private Map<String, JsonData> params;

		/**
		 * Required - The search request’s ID, used to group result details later.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The query being evaluated.
		 * <p>
		 * API name: {@code request}
		 */
		public final Builder request(@Nullable RankEvalQuery value) {
			this.request = value;
			return this;
		}

		/**
		 * The query being evaluated.
		 * <p>
		 * API name: {@code request}
		 */
		public final Builder request(Consumer<RankEvalQuery.Builder> fn) {
			RankEvalQuery.Builder builder = new RankEvalQuery.Builder();
			fn.accept(builder);
			return this.request(builder.build());
		}

		/**
		 * Required - List of document ratings
		 * <p>
		 * API name: {@code ratings}
		 */
		public final Builder ratings(List<DocumentRating> value) {
			this.ratings = value;
			return this;
		}

		/**
		 * Required - List of document ratings
		 * <p>
		 * API name: {@code ratings}
		 */
		public final Builder ratings(DocumentRating... value) {
			this.ratings = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - List of document ratings
		 * <p>
		 * API name: {@code ratings}
		 */
		public final Builder ratings(
				Function<ListBuilder<DocumentRating, DocumentRating.Builder>, ObjectBuilder<List<DocumentRating>>> fn) {
			return ratings(fn.apply(new ListBuilder<>(DocumentRating.Builder::new)).build());
		}

		/**
		 * The search template Id
		 * <p>
		 * API name: {@code template_id}
		 */
		public final Builder templateId(@Nullable String value) {
			this.templateId = value;
			return this;
		}

		/**
		 * The search template parameters.
		 * <p>
		 * API name: {@code params}
		 */
		public final Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * Builds a {@link RankEvalRequestItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalRequestItem build() {
			_checkSingleUse();

			return new RankEvalRequestItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalRequestItem}
	 */
	public static final JsonpDeserializer<RankEvalRequestItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankEvalRequestItem::setupRankEvalRequestItemDeserializer);

	protected static void setupRankEvalRequestItemDeserializer(ObjectDeserializer<RankEvalRequestItem.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::request, RankEvalQuery._DESERIALIZER, "request");
		op.add(Builder::ratings, JsonpDeserializer.arrayDeserializer(DocumentRating._DESERIALIZER), "ratings");
		op.add(Builder::templateId, JsonpDeserializer.stringDeserializer(), "template_id");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");

	}

}
