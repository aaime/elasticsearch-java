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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch.security.get_role.RoleTemplate;
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.RoleMapping
@JsonpDeserializable
public class RoleMapping implements JsonpSerializable {
	private final boolean enabled;

	private final Map<String, JsonData> metadata;

	private final List<String> roles;

	private final RoleMappingRule rules;

	private final List<RoleTemplate> roleTemplates;

	// ---------------------------------------------------------------------------------------------

	private RoleMapping(Builder builder) {

		this.enabled = ModelTypeHelper.requireNonNull(builder.enabled, this, "enabled");
		this.metadata = ModelTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.roles = ModelTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.rules = ModelTypeHelper.requireNonNull(builder.rules, this, "rules");
		this.roleTemplates = ModelTypeHelper.unmodifiable(builder.roleTemplates);

	}

	public static RoleMapping of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code rules}
	 */
	public final RoleMappingRule rules() {
		return this.rules;
	}

	/**
	 * API name: {@code role_templates}
	 */
	public final List<RoleTemplate> roleTemplates() {
		return this.roleTemplates;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

		if (ModelTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("rules");
		this.rules.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.roleTemplates)) {
			generator.writeKey("role_templates");
			generator.writeStartArray();
			for (RoleTemplate item0 : this.roleTemplates) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleMapping}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RoleMapping> {
		private Boolean enabled;

		private Map<String, JsonData> metadata;

		private List<String> roles;

		private RoleMappingRule rules;

		@Nullable
		private List<RoleTemplate> roleTemplates;

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - API name: {@code metadata}
		 */
		public final Builder metadata(Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public final Builder roles(List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public final Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code rules}
		 */
		public final Builder rules(RoleMappingRule value) {
			this.rules = value;
			return this;
		}

		/**
		 * Required - API name: {@code rules}
		 */
		public final Builder rules(Consumer<RoleMappingRule.Builder> fn) {
			RoleMappingRule.Builder builder = new RoleMappingRule.Builder();
			fn.accept(builder);
			return this.rules(builder.build());
		}

		/**
		 * API name: {@code role_templates}
		 */
		public final Builder roleTemplates(@Nullable List<RoleTemplate> value) {
			this.roleTemplates = value;
			return this;
		}

		/**
		 * API name: {@code role_templates}
		 */
		public final Builder roleTemplates(RoleTemplate... value) {
			this.roleTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code role_templates}
		 */
		public final Builder roleTemplates(
				Function<ListBuilder<RoleTemplate, RoleTemplate.Builder>, ObjectBuilder<List<RoleTemplate>>> fn) {
			return roleTemplates(fn.apply(new ListBuilder<>(RoleTemplate.Builder::new)).build());
		}

		/**
		 * Builds a {@link RoleMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleMapping build() {
			_checkSingleUse();

			return new RoleMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleMapping}
	 */
	public static final JsonpDeserializer<RoleMapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoleMapping::setupRoleMappingDeserializer);

	protected static void setupRoleMappingDeserializer(ObjectDeserializer<RoleMapping.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::rules, RoleMappingRule._DESERIALIZER, "rules");
		op.add(Builder::roleTemplates, JsonpDeserializer.arrayDeserializer(RoleTemplate._DESERIALIZER),
				"role_templates");

	}

}
