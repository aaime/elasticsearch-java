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

import co.elastic.clients.elasticsearch.ilm.explain_lifecycle.LifecycleExplain;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.explain_lifecycle.Response
@JsonpDeserializable
public class ExplainLifecycleResponse implements JsonpSerializable {
	private final Map<String, LifecycleExplain> indices;

	// ---------------------------------------------------------------------------------------------

	private ExplainLifecycleResponse(Builder builder) {

		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static ExplainLifecycleResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final Map<String, LifecycleExplain> indices() {
		return this.indices;
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

		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, LifecycleExplain> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainLifecycleResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExplainLifecycleResponse> {
		private Map<String, LifecycleExplain> indices;

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(Map<String, LifecycleExplain> value) {
			this.indices = value;
			return this;
		}

		public final Builder indices(
				Function<MapBuilder<String, LifecycleExplain, LifecycleExplain.Builder>, ObjectBuilder<Map<String, LifecycleExplain>>> fn) {
			return indices(fn.apply(new MapBuilder<>(LifecycleExplain.Builder::new)).build());
		}

		/**
		 * Builds a {@link ExplainLifecycleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainLifecycleResponse build() {
			_checkSingleUse();

			return new ExplainLifecycleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExplainLifecycleResponse}
	 */
	public static final JsonpDeserializer<ExplainLifecycleResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExplainLifecycleResponse::setupExplainLifecycleResponseDeserializer);

	protected static void setupExplainLifecycleResponseDeserializer(
			ObjectDeserializer<ExplainLifecycleResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(LifecycleExplain._DESERIALIZER), "indices");

	}

}
