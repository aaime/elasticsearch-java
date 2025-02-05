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

package co.elastic.clients.elasticsearch.security.get_service_accounts;

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

// typedef: security.get_service_accounts.RoleDescriptorWrapper
@JsonpDeserializable
public class RoleDescriptorWrapper implements JsonpSerializable {
	private final RoleDescriptor roleDescriptor;

	// ---------------------------------------------------------------------------------------------

	private RoleDescriptorWrapper(Builder builder) {

		this.roleDescriptor = ModelTypeHelper.requireNonNull(builder.roleDescriptor, this, "roleDescriptor");

	}

	public static RoleDescriptorWrapper of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code role_descriptor}
	 */
	public final RoleDescriptor roleDescriptor() {
		return this.roleDescriptor;
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

		generator.writeKey("role_descriptor");
		this.roleDescriptor.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleDescriptorWrapper}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RoleDescriptorWrapper> {
		private RoleDescriptor roleDescriptor;

		/**
		 * Required - API name: {@code role_descriptor}
		 */
		public final Builder roleDescriptor(RoleDescriptor value) {
			this.roleDescriptor = value;
			return this;
		}

		/**
		 * Required - API name: {@code role_descriptor}
		 */
		public final Builder roleDescriptor(Consumer<RoleDescriptor.Builder> fn) {
			RoleDescriptor.Builder builder = new RoleDescriptor.Builder();
			fn.accept(builder);
			return this.roleDescriptor(builder.build());
		}

		/**
		 * Builds a {@link RoleDescriptorWrapper}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleDescriptorWrapper build() {
			_checkSingleUse();

			return new RoleDescriptorWrapper(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleDescriptorWrapper}
	 */
	public static final JsonpDeserializer<RoleDescriptorWrapper> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RoleDescriptorWrapper::setupRoleDescriptorWrapperDeserializer);

	protected static void setupRoleDescriptorWrapperDeserializer(ObjectDeserializer<RoleDescriptorWrapper.Builder> op) {

		op.add(Builder::roleDescriptor, RoleDescriptor._DESERIALIZER, "role_descriptor");

	}

}
