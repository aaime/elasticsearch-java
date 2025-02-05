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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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

// typedef: security.invalidate_token.Response
@JsonpDeserializable
public class InvalidateTokenResponse implements JsonpSerializable {
	private final long errorCount;

	private final List<ErrorCause> errorDetails;

	private final long invalidatedTokens;

	private final long previouslyInvalidatedTokens;

	// ---------------------------------------------------------------------------------------------

	private InvalidateTokenResponse(Builder builder) {

		this.errorCount = ModelTypeHelper.requireNonNull(builder.errorCount, this, "errorCount");
		this.errorDetails = ModelTypeHelper.unmodifiable(builder.errorDetails);
		this.invalidatedTokens = ModelTypeHelper.requireNonNull(builder.invalidatedTokens, this, "invalidatedTokens");
		this.previouslyInvalidatedTokens = ModelTypeHelper.requireNonNull(builder.previouslyInvalidatedTokens, this,
				"previouslyInvalidatedTokens");

	}

	public static InvalidateTokenResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code error_count}
	 */
	public final long errorCount() {
		return this.errorCount;
	}

	/**
	 * API name: {@code error_details}
	 */
	public final List<ErrorCause> errorDetails() {
		return this.errorDetails;
	}

	/**
	 * Required - API name: {@code invalidated_tokens}
	 */
	public final long invalidatedTokens() {
		return this.invalidatedTokens;
	}

	/**
	 * Required - API name: {@code previously_invalidated_tokens}
	 */
	public final long previouslyInvalidatedTokens() {
		return this.previouslyInvalidatedTokens;
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

		generator.writeKey("error_count");
		generator.write(this.errorCount);

		if (ModelTypeHelper.isDefined(this.errorDetails)) {
			generator.writeKey("error_details");
			generator.writeStartArray();
			for (ErrorCause item0 : this.errorDetails) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("invalidated_tokens");
		generator.write(this.invalidatedTokens);

		generator.writeKey("previously_invalidated_tokens");
		generator.write(this.previouslyInvalidatedTokens);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InvalidateTokenResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InvalidateTokenResponse> {
		private Long errorCount;

		@Nullable
		private List<ErrorCause> errorDetails;

		private Long invalidatedTokens;

		private Long previouslyInvalidatedTokens;

		/**
		 * Required - API name: {@code error_count}
		 */
		public final Builder errorCount(long value) {
			this.errorCount = value;
			return this;
		}

		/**
		 * API name: {@code error_details}
		 */
		public final Builder errorDetails(@Nullable List<ErrorCause> value) {
			this.errorDetails = value;
			return this;
		}

		/**
		 * API name: {@code error_details}
		 */
		public final Builder errorDetails(ErrorCause... value) {
			this.errorDetails = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code error_details}
		 */
		public final Builder errorDetails(
				Function<ListBuilder<ErrorCause, ErrorCause.Builder>, ObjectBuilder<List<ErrorCause>>> fn) {
			return errorDetails(fn.apply(new ListBuilder<>(ErrorCause.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code invalidated_tokens}
		 */
		public final Builder invalidatedTokens(long value) {
			this.invalidatedTokens = value;
			return this;
		}

		/**
		 * Required - API name: {@code previously_invalidated_tokens}
		 */
		public final Builder previouslyInvalidatedTokens(long value) {
			this.previouslyInvalidatedTokens = value;
			return this;
		}

		/**
		 * Builds a {@link InvalidateTokenResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvalidateTokenResponse build() {
			_checkSingleUse();

			return new InvalidateTokenResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InvalidateTokenResponse}
	 */
	public static final JsonpDeserializer<InvalidateTokenResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InvalidateTokenResponse::setupInvalidateTokenResponseDeserializer);

	protected static void setupInvalidateTokenResponseDeserializer(
			ObjectDeserializer<InvalidateTokenResponse.Builder> op) {

		op.add(Builder::errorCount, JsonpDeserializer.longDeserializer(), "error_count");
		op.add(Builder::errorDetails, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "error_details");
		op.add(Builder::invalidatedTokens, JsonpDeserializer.longDeserializer(), "invalidated_tokens");
		op.add(Builder::previouslyInvalidatedTokens, JsonpDeserializer.longDeserializer(),
				"previously_invalidated_tokens");

	}

}
