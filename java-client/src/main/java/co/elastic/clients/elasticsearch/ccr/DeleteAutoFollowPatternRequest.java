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

package co.elastic.clients.elasticsearch.ccr;

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
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ccr.delete_auto_follow_pattern.Request

public class DeleteAutoFollowPatternRequest extends RequestBase {
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private DeleteAutoFollowPatternRequest(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static DeleteAutoFollowPatternRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - The name of the auto follow pattern.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteAutoFollowPatternRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeleteAutoFollowPatternRequest> {
		private String name;

		/**
		 * Required - The name of the auto follow pattern.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteAutoFollowPatternRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteAutoFollowPatternRequest build() {
			_checkSingleUse();

			return new DeleteAutoFollowPatternRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.delete_auto_follow_pattern}".
	 */
	public static final Endpoint<DeleteAutoFollowPatternRequest, DeleteAutoFollowPatternResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ccr.delete_auto_follow_pattern",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ccr");
					buf.append("/auto_follow");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteAutoFollowPatternResponse._DESERIALIZER);
}
