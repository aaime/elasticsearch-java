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

package co.elastic.clients.elasticsearch.core.search;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.search._types.NestedIdentity
@JsonpDeserializable
public class NestedIdentity implements JsonpSerializable {
	private final String field;

	private final int offset;

	@Nullable
	private final NestedIdentity nested;

	// ---------------------------------------------------------------------------------------------

	private NestedIdentity(Builder builder) {

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.offset = ModelTypeHelper.requireNonNull(builder.offset, this, "offset");
		this.nested = builder.nested;

	}

	public static NestedIdentity of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code offset}
	 */
	public final int offset() {
		return this.offset;
	}

	/**
	 * API name: {@code _nested}
	 */
	@Nullable
	public final NestedIdentity nested() {
		return this.nested;
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

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("offset");
		generator.write(this.offset);

		if (this.nested != null) {
			generator.writeKey("_nested");
			this.nested.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NestedIdentity}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NestedIdentity> {
		private String field;

		private Integer offset;

		@Nullable
		private NestedIdentity nested;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code offset}
		 */
		public final Builder offset(int value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public final Builder nested(@Nullable NestedIdentity value) {
			this.nested = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public final Builder nested(Consumer<NestedIdentity.Builder> fn) {
			NestedIdentity.Builder builder = new NestedIdentity.Builder();
			fn.accept(builder);
			return this.nested(builder.build());
		}

		/**
		 * Builds a {@link NestedIdentity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NestedIdentity build() {
			_checkSingleUse();

			return new NestedIdentity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NestedIdentity}
	 */
	public static final JsonpDeserializer<NestedIdentity> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NestedIdentity::setupNestedIdentityDeserializer);

	protected static void setupNestedIdentityDeserializer(ObjectDeserializer<NestedIdentity.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::offset, JsonpDeserializer.integerDeserializer(), "offset");
		op.add(Builder::nested, NestedIdentity._DESERIALIZER, "_nested");

	}

}
