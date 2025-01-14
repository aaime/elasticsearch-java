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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DetectionRule
@JsonpDeserializable
public class DetectionRule implements JsonpSerializable {
	private final List<RuleAction> actions;

	private final List<RuleCondition> conditions;

	private final Map<String, FilterRef> scope;

	// ---------------------------------------------------------------------------------------------

	private DetectionRule(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiable(builder.actions);
		this.conditions = ModelTypeHelper.unmodifiable(builder.conditions);
		this.scope = ModelTypeHelper.unmodifiable(builder.scope);

	}

	public static DetectionRule of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * The set of actions to be triggered when the rule applies. If more than one
	 * action is specified the effects of all actions are combined.
	 * <p>
	 * API name: {@code actions}
	 */
	public final List<RuleAction> actions() {
		return this.actions;
	}

	/**
	 * An array of numeric conditions when the rule applies. A rule must either have
	 * a non-empty scope or at least one condition. Multiple conditions are combined
	 * together with a logical AND.
	 * <p>
	 * API name: {@code conditions}
	 */
	public final List<RuleCondition> conditions() {
		return this.conditions;
	}

	/**
	 * A scope of series where the rule applies. A rule must either have a non-empty
	 * scope or at least one condition. By default, the scope includes all series.
	 * Scoping is allowed for any of the fields that are also specified in
	 * <code>by_field_name</code>, <code>over_field_name</code>, or
	 * <code>partition_field_name</code>.
	 * <p>
	 * API name: {@code scope}
	 */
	public final Map<String, FilterRef> scope() {
		return this.scope;
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

		if (ModelTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (RuleAction item0 : this.actions) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.conditions)) {
			generator.writeKey("conditions");
			generator.writeStartArray();
			for (RuleCondition item0 : this.conditions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.scope)) {
			generator.writeKey("scope");
			generator.writeStartObject();
			for (Map.Entry<String, FilterRef> item0 : this.scope.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DetectionRule}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DetectionRule> {
		@Nullable
		private List<RuleAction> actions;

		@Nullable
		private List<RuleCondition> conditions;

		@Nullable
		private Map<String, FilterRef> scope;

		/**
		 * The set of actions to be triggered when the rule applies. If more than one
		 * action is specified the effects of all actions are combined.
		 * <p>
		 * API name: {@code actions}
		 */
		public final Builder actions(@Nullable List<RuleAction> value) {
			this.actions = value;
			return this;
		}

		/**
		 * The set of actions to be triggered when the rule applies. If more than one
		 * action is specified the effects of all actions are combined.
		 * <p>
		 * API name: {@code actions}
		 */
		public final Builder actions(RuleAction... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * An array of numeric conditions when the rule applies. A rule must either have
		 * a non-empty scope or at least one condition. Multiple conditions are combined
		 * together with a logical AND.
		 * <p>
		 * API name: {@code conditions}
		 */
		public final Builder conditions(@Nullable List<RuleCondition> value) {
			this.conditions = value;
			return this;
		}

		/**
		 * An array of numeric conditions when the rule applies. A rule must either have
		 * a non-empty scope or at least one condition. Multiple conditions are combined
		 * together with a logical AND.
		 * <p>
		 * API name: {@code conditions}
		 */
		public final Builder conditions(RuleCondition... value) {
			this.conditions = Arrays.asList(value);
			return this;
		}

		/**
		 * An array of numeric conditions when the rule applies. A rule must either have
		 * a non-empty scope or at least one condition. Multiple conditions are combined
		 * together with a logical AND.
		 * <p>
		 * API name: {@code conditions}
		 */
		public final Builder conditions(
				Function<ListBuilder<RuleCondition, RuleCondition.Builder>, ObjectBuilder<List<RuleCondition>>> fn) {
			return conditions(fn.apply(new ListBuilder<>(RuleCondition.Builder::new)).build());
		}

		/**
		 * A scope of series where the rule applies. A rule must either have a non-empty
		 * scope or at least one condition. By default, the scope includes all series.
		 * Scoping is allowed for any of the fields that are also specified in
		 * <code>by_field_name</code>, <code>over_field_name</code>, or
		 * <code>partition_field_name</code>.
		 * <p>
		 * API name: {@code scope}
		 */
		public final Builder scope(@Nullable Map<String, FilterRef> value) {
			this.scope = value;
			return this;
		}

		public final Builder scope(
				Function<MapBuilder<String, FilterRef, FilterRef.Builder>, ObjectBuilder<Map<String, FilterRef>>> fn) {
			return scope(fn.apply(new MapBuilder<>(FilterRef.Builder::new)).build());
		}

		/**
		 * Builds a {@link DetectionRule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DetectionRule build() {
			_checkSingleUse();

			return new DetectionRule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DetectionRule}
	 */
	public static final JsonpDeserializer<DetectionRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DetectionRule::setupDetectionRuleDeserializer);

	protected static void setupDetectionRuleDeserializer(ObjectDeserializer<DetectionRule.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(RuleAction._DESERIALIZER), "actions");
		op.add(Builder::conditions, JsonpDeserializer.arrayDeserializer(RuleCondition._DESERIALIZER), "conditions");
		op.add(Builder::scope, JsonpDeserializer.stringMapDeserializer(FilterRef._DESERIALIZER), "scope");

	}

}
