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

package co.elastic.clients.elasticsearch.graph;

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
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: graph._types.VertexInclude
@JsonpDeserializable
public class VertexInclude implements JsonpSerializable {
	private final double boost;

	private final String term;

	// ---------------------------------------------------------------------------------------------

	private VertexInclude(Builder builder) {

		this.boost = ModelTypeHelper.requireNonNull(builder.boost, this, "boost");
		this.term = ModelTypeHelper.requireNonNull(builder.term, this, "term");

	}

	public static VertexInclude of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code boost}
	 */
	public final double boost() {
		return this.boost;
	}

	/**
	 * Required - API name: {@code term}
	 */
	public final String term() {
		return this.term;
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

		generator.writeKey("boost");
		generator.write(this.boost);

		generator.writeKey("term");
		generator.write(this.term);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VertexInclude}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<VertexInclude> {
		private Double boost;

		private String term;

		/**
		 * Required - API name: {@code boost}
		 */
		public final Builder boost(double value) {
			this.boost = value;
			return this;
		}

		/**
		 * Required - API name: {@code term}
		 */
		public final Builder term(String value) {
			this.term = value;
			return this;
		}

		/**
		 * Builds a {@link VertexInclude}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VertexInclude build() {
			_checkSingleUse();

			return new VertexInclude(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VertexInclude}
	 */
	public static final JsonpDeserializer<VertexInclude> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			VertexInclude::setupVertexIncludeDeserializer);

	protected static void setupVertexIncludeDeserializer(ObjectDeserializer<VertexInclude.Builder> op) {

		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::term, JsonpDeserializer.stringDeserializer(), "term");

	}

}
