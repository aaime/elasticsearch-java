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

package co.elastic.clients.elasticsearch.enrich;

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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: enrich._types.Summary
@JsonpDeserializable
public class EnrichSummary implements JsonpSerializable {
	private final EnrichConfiguration config;

	// ---------------------------------------------------------------------------------------------

	private EnrichSummary(Builder builder) {

		this.config = ModelTypeHelper.requireNonNull(builder.config, this, "config");

	}

	public static EnrichSummary of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code config}
	 */
	public final EnrichConfiguration config() {
		return this.config;
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

		generator.writeKey("config");
		this.config.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnrichSummary}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<EnrichSummary> {
		private EnrichConfiguration config;

		/**
		 * Required - API name: {@code config}
		 */
		public final Builder config(EnrichConfiguration value) {
			this.config = value;
			return this;
		}

		/**
		 * Required - API name: {@code config}
		 */
		public final Builder config(Consumer<EnrichConfiguration.Builder> fn) {
			EnrichConfiguration.Builder builder = new EnrichConfiguration.Builder();
			fn.accept(builder);
			return this.config(builder.build());
		}

		/**
		 * Builds a {@link EnrichSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnrichSummary build() {
			_checkSingleUse();

			return new EnrichSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EnrichSummary}
	 */
	public static final JsonpDeserializer<EnrichSummary> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EnrichSummary::setupEnrichSummaryDeserializer);

	protected static void setupEnrichSummaryDeserializer(ObjectDeserializer<EnrichSummary.Builder> op) {

		op.add(Builder::config, EnrichConfiguration._DESERIALIZER, "config");

	}

}
