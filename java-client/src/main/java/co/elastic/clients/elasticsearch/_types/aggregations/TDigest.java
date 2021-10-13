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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TDigest
@JsonpDeserializable
public final class TDigest implements JsonpSerializable {
	@Nullable
	private final Integer compression;

	// ---------------------------------------------------------------------------------------------

	public TDigest(Builder builder) {

		this.compression = builder.compression;

	}

	public TDigest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code compression}
	 */
	@Nullable
	public Integer compression() {
		return this.compression;
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

		if (this.compression != null) {

			generator.writeKey("compression");
			generator.write(this.compression);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TDigest}.
	 */
	public static class Builder implements ObjectBuilder<TDigest> {
		@Nullable
		private Integer compression;

		/**
		 * API name: {@code compression}
		 */
		public Builder compression(@Nullable Integer value) {
			this.compression = value;
			return this;
		}

		/**
		 * Builds a {@link TDigest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TDigest build() {

			return new TDigest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TDigest}
	 */
	public static final JsonpDeserializer<TDigest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TDigest::setupTDigestDeserializer, Builder::build);

	protected static void setupTDigestDeserializer(DelegatingDeserializer<TDigest.Builder> op) {

		op.add(Builder::compression, JsonpDeserializer.integerDeserializer(), "compression");

	}

}
