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

package co.elastic.clients.elasticsearch.security.get_service_credentials;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.NodesCredentialsFileToken
@JsonpDeserializable
public class NodesCredentialsFileToken implements JsonpSerializable {
	private final List<String> nodes;

	// ---------------------------------------------------------------------------------------------

	private NodesCredentialsFileToken(Builder builder) {

		this.nodes = ModelTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static NodesCredentialsFileToken of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final List<String> nodes() {
		return this.nodes;
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

		if (ModelTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartArray();
			for (String item0 : this.nodes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesCredentialsFileToken}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodesCredentialsFileToken> {
		private List<String> nodes;

		/**
		 * Required - API name: {@code nodes}
		 */
		public final Builder nodes(List<String> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 */
		public final Builder nodes(String... value) {
			this.nodes = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link NodesCredentialsFileToken}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesCredentialsFileToken build() {
			_checkSingleUse();

			return new NodesCredentialsFileToken(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodesCredentialsFileToken}
	 */
	public static final JsonpDeserializer<NodesCredentialsFileToken> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodesCredentialsFileToken::setupNodesCredentialsFileTokenDeserializer);

	protected static void setupNodesCredentialsFileTokenDeserializer(
			ObjectDeserializer<NodesCredentialsFileToken.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "nodes");

	}

}
