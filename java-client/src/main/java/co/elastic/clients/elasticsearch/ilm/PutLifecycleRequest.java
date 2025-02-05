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

package co.elastic.clients.elasticsearch.ilm;

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
import java.util.Collections;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ilm.put_lifecycle.Request
@JsonpDeserializable
public class PutLifecycleRequest extends RequestBase implements JsonpSerializable {
	private final String name;

	@Nullable
	private final IlmPolicy policy;

	// ---------------------------------------------------------------------------------------------

	private PutLifecycleRequest(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.policy = builder.policy;

	}

	public static PutLifecycleRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - The name of the index lifecycle policy
	 * <p>
	 * API name: {@code policy}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code policy}
	 */
	@Nullable
	public final IlmPolicy policy() {
		return this.policy;
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

		if (this.policy != null) {
			generator.writeKey("policy");
			this.policy.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutLifecycleRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutLifecycleRequest> {
		private String name;

		@Nullable
		private IlmPolicy policy;

		/**
		 * Required - The name of the index lifecycle policy
		 * <p>
		 * API name: {@code policy}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public final Builder policy(@Nullable IlmPolicy value) {
			this.policy = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public final Builder policy(Consumer<IlmPolicy.Builder> fn) {
			IlmPolicy.Builder builder = new IlmPolicy.Builder();
			fn.accept(builder);
			return this.policy(builder.build());
		}

		/**
		 * Builds a {@link PutLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutLifecycleRequest build() {
			_checkSingleUse();

			return new PutLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutLifecycleRequest}
	 */
	public static final JsonpDeserializer<PutLifecycleRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutLifecycleRequest::setupPutLifecycleRequestDeserializer);

	protected static void setupPutLifecycleRequestDeserializer(ObjectDeserializer<PutLifecycleRequest.Builder> op) {

		op.add(Builder::policy, IlmPolicy._DESERIALIZER, "policy");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.put_lifecycle}".
	 */
	public static final Endpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ilm.put_lifecycle",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ilm");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutLifecycleResponse._DESERIALIZER);
}
