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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.indices.update_aliases.Action;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.update_aliases.Request
@JsonpDeserializable
public class UpdateAliasesRequest extends RequestBase implements JsonpSerializable {
	private final List<Action> actions;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private UpdateAliasesRequest(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiable(builder.actions);
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	public static UpdateAliasesRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code actions}
	 */
	public final List<Action> actions() {
		return this.actions;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Request timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (ModelTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (Action item0 : this.actions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateAliasesRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<UpdateAliasesRequest> {
		@Nullable
		private List<Action> actions;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Time timeout;

		/**
		 * API name: {@code actions}
		 */
		public final Builder actions(@Nullable List<Action> value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public final Builder actions(Action... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public final Builder actions(Function<ListBuilder<Action, Action.Builder>, ObjectBuilder<List<Action>>> fn) {
			return actions(fn.apply(new ListBuilder<>(Action.Builder::new)).build());
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.masterTimeout(builder.build());
		}

		/**
		 * Request timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Request timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.timeout(builder.build());
		}

		/**
		 * Builds a {@link UpdateAliasesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateAliasesRequest build() {
			_checkSingleUse();

			return new UpdateAliasesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateAliasesRequest}
	 */
	public static final JsonpDeserializer<UpdateAliasesRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateAliasesRequest::setupUpdateAliasesRequestDeserializer);

	protected static void setupUpdateAliasesRequestDeserializer(ObjectDeserializer<UpdateAliasesRequest.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(Action._DESERIALIZER), "actions");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.update_aliases}".
	 */
	public static final Endpoint<UpdateAliasesRequest, UpdateAliasesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.update_aliases",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_aliases";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, UpdateAliasesResponse._DESERIALIZER);
}
