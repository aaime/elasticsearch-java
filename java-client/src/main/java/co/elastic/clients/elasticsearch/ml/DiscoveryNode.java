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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml._types.DiscoveryNode
@JsonpDeserializable
public class DiscoveryNode implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final String ephemeralId;

	private final String id;

	private final String name;

	private final String transportAddress;

	// ---------------------------------------------------------------------------------------------

	private DiscoveryNode(Builder builder) {

		this.attributes = ModelTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");
		this.ephemeralId = ModelTypeHelper.requireNonNull(builder.ephemeralId, this, "ephemeralId");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.transportAddress = ModelTypeHelper.requireNonNull(builder.transportAddress, this, "transportAddress");

	}

	public static DiscoveryNode of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Required - API name: {@code ephemeral_id}
	 */
	public final String ephemeralId() {
		return this.ephemeralId;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code transport_address}
	 */
	public final String transportAddress() {
		return this.transportAddress;
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

		if (ModelTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("ephemeral_id");
		generator.write(this.ephemeralId);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DiscoveryNode}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DiscoveryNode> {
		private Map<String, String> attributes;

		private String ephemeralId;

		private String id;

		private String name;

		private String transportAddress;

		/**
		 * Required - API name: {@code attributes}
		 */
		public final Builder attributes(Map<String, String> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * Required - API name: {@code ephemeral_id}
		 */
		public final Builder ephemeralId(String value) {
			this.ephemeralId = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport_address}
		 */
		public final Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * Builds a {@link DiscoveryNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DiscoveryNode build() {
			_checkSingleUse();

			return new DiscoveryNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DiscoveryNode}
	 */
	public static final JsonpDeserializer<DiscoveryNode> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DiscoveryNode::setupDiscoveryNodeDeserializer);

	protected static void setupDiscoveryNodeDeserializer(ObjectDeserializer<DiscoveryNode.Builder> op) {

		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::ephemeralId, JsonpDeserializer.stringDeserializer(), "ephemeral_id");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");

	}

}
