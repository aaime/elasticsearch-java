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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml.delete_datafeed.Request

public class DeleteDatafeedRequest extends RequestBase {
	private final String datafeedId;

	@Nullable
	private final Boolean force;

	// ---------------------------------------------------------------------------------------------

	private DeleteDatafeedRequest(Builder builder) {

		this.datafeedId = ModelTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.force = builder.force;

	}

	public static DeleteDatafeedRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - A numerical character string that uniquely identifies the
	 * datafeed. This identifier can contain lowercase alphanumeric characters (a-z
	 * and 0-9), hyphens, and underscores. It must start and end with alphanumeric
	 * characters.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * Use to forcefully delete a started datafeed; this method is quicker than
	 * stopping and deleting the datafeed.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteDatafeedRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeleteDatafeedRequest> {
		private String datafeedId;

		@Nullable
		private Boolean force;

		/**
		 * Required - A numerical character string that uniquely identifies the
		 * datafeed. This identifier can contain lowercase alphanumeric characters (a-z
		 * and 0-9), hyphens, and underscores. It must start and end with alphanumeric
		 * characters.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * Use to forcefully delete a started datafeed; this method is quicker than
		 * stopping and deleting the datafeed.
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteDatafeedRequest build() {
			_checkSingleUse();

			return new DeleteDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_datafeed}".
	 */
	public static final Endpoint<DeleteDatafeedRequest, DeleteDatafeedResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.delete_datafeed",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.datafeedId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteDatafeedResponse._DESERIALIZER);
}
