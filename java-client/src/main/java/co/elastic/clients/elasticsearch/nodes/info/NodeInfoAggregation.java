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

package co.elastic.clients.elasticsearch.nodes.info;

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

// typedef: nodes.info.NodeInfoAggregation
@JsonpDeserializable
public class NodeInfoAggregation implements JsonpSerializable {
	private final List<String> types;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoAggregation(Builder builder) {

		this.types = ModelTypeHelper.unmodifiableRequired(builder.types, this, "types");

	}

	public static NodeInfoAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code types}
	 */
	public final List<String> types() {
		return this.types;
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

		if (ModelTypeHelper.isDefined(this.types)) {
			generator.writeKey("types");
			generator.writeStartArray();
			for (String item0 : this.types) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoAggregation}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoAggregation> {
		private List<String> types;

		/**
		 * Required - API name: {@code types}
		 */
		public final Builder types(List<String> value) {
			this.types = value;
			return this;
		}

		/**
		 * Required - API name: {@code types}
		 */
		public final Builder types(String... value) {
			this.types = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link NodeInfoAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoAggregation build() {
			_checkSingleUse();

			return new NodeInfoAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoAggregation}
	 */
	public static final JsonpDeserializer<NodeInfoAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoAggregation::setupNodeInfoAggregationDeserializer);

	protected static void setupNodeInfoAggregationDeserializer(ObjectDeserializer<NodeInfoAggregation.Builder> op) {

		op.add(Builder::types, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "types");

	}

}
