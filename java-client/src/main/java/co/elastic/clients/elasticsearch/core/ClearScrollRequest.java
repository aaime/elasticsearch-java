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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.clear_scroll.Request
@JsonpDeserializable
public class ClearScrollRequest extends RequestBase implements JsonpSerializable {
	private final List<String> scrollId;

	// ---------------------------------------------------------------------------------------------

	private ClearScrollRequest(Builder builder) {

		this.scrollId = ModelTypeHelper.unmodifiable(builder.scrollId);

	}

	public static ClearScrollRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code scroll_id}
	 */
	public final List<String> scrollId() {
		return this.scrollId;
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

		if (ModelTypeHelper.isDefined(this.scrollId)) {
			generator.writeKey("scroll_id");
			generator.writeStartArray();
			for (String item0 : this.scrollId) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearScrollRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClearScrollRequest> {
		@Nullable
		private List<String> scrollId;

		/**
		 * API name: {@code scroll_id}
		 */
		public final Builder scrollId(@Nullable List<String> value) {
			this.scrollId = value;
			return this;
		}

		/**
		 * API name: {@code scroll_id}
		 */
		public final Builder scrollId(String... value) {
			this.scrollId = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link ClearScrollRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearScrollRequest build() {
			_checkSingleUse();

			return new ClearScrollRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClearScrollRequest}
	 */
	public static final JsonpDeserializer<ClearScrollRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClearScrollRequest::setupClearScrollRequestDeserializer);

	protected static void setupClearScrollRequestDeserializer(ObjectDeserializer<ClearScrollRequest.Builder> op) {

		op.add(Builder::scrollId, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"scroll_id");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code clear_scroll}".
	 */
	public static final Endpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/clear_scroll",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				return "/_search/scroll";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ClearScrollResponse._DESERIALIZER);
}
