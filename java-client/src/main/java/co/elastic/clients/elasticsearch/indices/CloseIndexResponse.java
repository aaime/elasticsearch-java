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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.elasticsearch.indices.close.CloseIndexResult;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.close.Response
@JsonpDeserializable
public class CloseIndexResponse extends AcknowledgedResponseBase {
	private final Map<String, CloseIndexResult> indices;

	private final boolean shardsAcknowledged;

	// ---------------------------------------------------------------------------------------------

	private CloseIndexResponse(Builder builder) {
		super(builder);

		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.shardsAcknowledged = ModelTypeHelper.requireNonNull(builder.shardsAcknowledged, this,
				"shardsAcknowledged");

	}

	public static CloseIndexResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final Map<String, CloseIndexResult> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code shards_acknowledged}
	 */
	public final boolean shardsAcknowledged() {
		return this.shardsAcknowledged;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, CloseIndexResult> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseIndexResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CloseIndexResponse> {
		private Map<String, CloseIndexResult> indices;

		private Boolean shardsAcknowledged;

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(Map<String, CloseIndexResult> value) {
			this.indices = value;
			return this;
		}

		public final Builder indices(
				Function<MapBuilder<String, CloseIndexResult, CloseIndexResult.Builder>, ObjectBuilder<Map<String, CloseIndexResult>>> fn) {
			return indices(fn.apply(new MapBuilder<>(CloseIndexResult.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code shards_acknowledged}
		 */
		public final Builder shardsAcknowledged(boolean value) {
			this.shardsAcknowledged = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CloseIndexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseIndexResponse build() {
			_checkSingleUse();

			return new CloseIndexResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloseIndexResponse}
	 */
	public static final JsonpDeserializer<CloseIndexResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CloseIndexResponse::setupCloseIndexResponseDeserializer);

	protected static void setupCloseIndexResponseDeserializer(ObjectDeserializer<CloseIndexResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(CloseIndexResult._DESERIALIZER), "indices");
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");

	}

}
