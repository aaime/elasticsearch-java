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

package co.elastic.clients.elasticsearch.security.create_api_key;

import co.elastic.clients.elasticsearch.security.IndexPrivilege;
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

// typedef: security.create_api_key.IndexPrivileges
@JsonpDeserializable
public class IndexPrivileges implements JsonpSerializable {
	private final List<String> names;

	private final List<IndexPrivilege> privileges;

	// ---------------------------------------------------------------------------------------------

	private IndexPrivileges(Builder builder) {

		this.names = ModelTypeHelper.unmodifiableRequired(builder.names, this, "names");
		this.privileges = ModelTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");

	}

	public static IndexPrivileges of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code names}
	 */
	public final List<String> names() {
		return this.names;
	}

	/**
	 * Required - API name: {@code privileges}
	 */
	public final List<IndexPrivilege> privileges() {
		return this.privileges;
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

		if (ModelTypeHelper.isDefined(this.names)) {
			generator.writeKey("names");
			generator.writeStartArray();
			for (String item0 : this.names) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.privileges)) {
			generator.writeKey("privileges");
			generator.writeStartArray();
			for (IndexPrivilege item0 : this.privileges) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexPrivileges}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexPrivileges> {
		private List<String> names;

		private List<IndexPrivilege> privileges;

		/**
		 * Required - API name: {@code names}
		 */
		public final Builder names(List<String> value) {
			this.names = value;
			return this;
		}

		/**
		 * Required - API name: {@code names}
		 */
		public final Builder names(String... value) {
			this.names = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code privileges}
		 */
		public final Builder privileges(List<IndexPrivilege> value) {
			this.privileges = value;
			return this;
		}

		/**
		 * Required - API name: {@code privileges}
		 */
		public final Builder privileges(IndexPrivilege... value) {
			this.privileges = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link IndexPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexPrivileges build() {
			_checkSingleUse();

			return new IndexPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexPrivileges}
	 */
	public static final JsonpDeserializer<IndexPrivileges> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexPrivileges::setupIndexPrivilegesDeserializer);

	protected static void setupIndexPrivilegesDeserializer(ObjectDeserializer<IndexPrivileges.Builder> op) {

		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(IndexPrivilege._DESERIALIZER), "privileges");

	}

}
