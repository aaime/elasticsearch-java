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
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoIngest
@JsonpDeserializable
public class NodeInfoIngest implements JsonpSerializable {
	private final List<NodeInfoIngestProcessor> processors;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoIngest(Builder builder) {

		this.processors = ModelTypeHelper.unmodifiableRequired(builder.processors, this, "processors");

	}

	public static NodeInfoIngest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code processors}
	 */
	public final List<NodeInfoIngestProcessor> processors() {
		return this.processors;
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

		if (ModelTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (NodeInfoIngestProcessor item0 : this.processors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoIngest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoIngest> {
		private List<NodeInfoIngestProcessor> processors;

		/**
		 * Required - API name: {@code processors}
		 */
		public final Builder processors(List<NodeInfoIngestProcessor> value) {
			this.processors = value;
			return this;
		}

		/**
		 * Required - API name: {@code processors}
		 */
		public final Builder processors(NodeInfoIngestProcessor... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code processors}
		 */
		public final Builder processors(
				Function<ListBuilder<NodeInfoIngestProcessor, NodeInfoIngestProcessor.Builder>, ObjectBuilder<List<NodeInfoIngestProcessor>>> fn) {
			return processors(fn.apply(new ListBuilder<>(NodeInfoIngestProcessor.Builder::new)).build());
		}

		/**
		 * Builds a {@link NodeInfoIngest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoIngest build() {
			_checkSingleUse();

			return new NodeInfoIngest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoIngest}
	 */
	public static final JsonpDeserializer<NodeInfoIngest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoIngest::setupNodeInfoIngestDeserializer);

	protected static void setupNodeInfoIngestDeserializer(ObjectDeserializer<NodeInfoIngest.Builder> op) {

		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(NodeInfoIngestProcessor._DESERIALIZER),
				"processors");

	}

}
