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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml.get_influencers.Response
@JsonpDeserializable
public class GetInfluencersResponse implements JsonpSerializable {
	private final long count;

	private final List<Influencer> influencers;

	// ---------------------------------------------------------------------------------------------

	private GetInfluencersResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.influencers = ModelTypeHelper.unmodifiableRequired(builder.influencers, this, "influencers");

	}

	public static GetInfluencersResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - Array of influencer objects
	 * <p>
	 * API name: {@code influencers}
	 */
	public final List<Influencer> influencers() {
		return this.influencers;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ModelTypeHelper.isDefined(this.influencers)) {
			generator.writeKey("influencers");
			generator.writeStartArray();
			for (Influencer item0 : this.influencers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetInfluencersResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetInfluencersResponse> {
		private Long count;

		private List<Influencer> influencers;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Array of influencer objects
		 * <p>
		 * API name: {@code influencers}
		 */
		public final Builder influencers(List<Influencer> value) {
			this.influencers = value;
			return this;
		}

		/**
		 * Required - Array of influencer objects
		 * <p>
		 * API name: {@code influencers}
		 */
		public final Builder influencers(Influencer... value) {
			this.influencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Array of influencer objects
		 * <p>
		 * API name: {@code influencers}
		 */
		public final Builder influencers(
				Function<ListBuilder<Influencer, Influencer.Builder>, ObjectBuilder<List<Influencer>>> fn) {
			return influencers(fn.apply(new ListBuilder<>(Influencer.Builder::new)).build());
		}

		/**
		 * Builds a {@link GetInfluencersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetInfluencersResponse build() {
			_checkSingleUse();

			return new GetInfluencersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetInfluencersResponse}
	 */
	public static final JsonpDeserializer<GetInfluencersResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetInfluencersResponse::setupGetInfluencersResponseDeserializer);

	protected static void setupGetInfluencersResponseDeserializer(
			ObjectDeserializer<GetInfluencersResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(Influencer._DESERIALIZER), "influencers");

	}

}
