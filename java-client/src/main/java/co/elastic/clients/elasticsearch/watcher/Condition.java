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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher._types.ConditionContainer
// union type: Container[]
@JsonpDeserializable
public class Condition implements TaggedUnion<Condition.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Condition} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Always("always"),

		ArrayCompare("array_compare"),

		Compare("compare"),

		Never("never"),

		Script("script"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public Condition(ConditionVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._conditionKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Condition(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Condition of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code always}?
	 */
	public boolean isAlways() {
		return _kind == Kind.Always;
	}

	/**
	 * Get the {@code always} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code always} kind.
	 */
	public AlwaysCondition always() {
		return TaggedUnionUtils.get(this, Kind.Always);
	}

	/**
	 * Is this variant instance of kind {@code array_compare}?
	 */
	public boolean isArrayCompare() {
		return _kind == Kind.ArrayCompare;
	}

	/**
	 * Get the {@code array_compare} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code array_compare} kind.
	 */
	public ArrayCompareCondition arrayCompare() {
		return TaggedUnionUtils.get(this, Kind.ArrayCompare);
	}

	/**
	 * Is this variant instance of kind {@code compare}?
	 */
	public boolean isCompare() {
		return _kind == Kind.Compare;
	}

	/**
	 * Get the {@code compare} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code compare} kind.
	 */
	public CompareCondition compare() {
		return TaggedUnionUtils.get(this, Kind.Compare);
	}

	/**
	 * Is this variant instance of kind {@code never}?
	 */
	public boolean isNever() {
		return _kind == Kind.Never;
	}

	/**
	 * Get the {@code never} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code never} kind.
	 */
	public NeverCondition never() {
		return TaggedUnionUtils.get(this, Kind.Never);
	}

	/**
	 * Is this variant instance of kind {@code script}?
	 */
	public boolean isScript() {
		return _kind == Kind.Script;
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptCondition script() {
		return TaggedUnionUtils.get(this, Kind.Script);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Condition> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<Condition> always(AlwaysCondition v) {
			this._kind = Kind.Always;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> always(Consumer<AlwaysCondition.Builder> fn) {
			AlwaysCondition.Builder builder = new AlwaysCondition.Builder();
			fn.accept(builder);
			return this.always(builder.build());
		}

		public ObjectBuilder<Condition> arrayCompare(ArrayCompareCondition v) {
			this._kind = Kind.ArrayCompare;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> arrayCompare(Consumer<ArrayCompareCondition.Builder> fn) {
			ArrayCompareCondition.Builder builder = new ArrayCompareCondition.Builder();
			fn.accept(builder);
			return this.arrayCompare(builder.build());
		}

		public ObjectBuilder<Condition> compare(CompareCondition v) {
			this._kind = Kind.Compare;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> compare(Consumer<CompareCondition.Builder> fn) {
			CompareCondition.Builder builder = new CompareCondition.Builder();
			fn.accept(builder);
			return this.compare(builder.build());
		}

		public ObjectBuilder<Condition> never(NeverCondition v) {
			this._kind = Kind.Never;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> never(Consumer<NeverCondition.Builder> fn) {
			NeverCondition.Builder builder = new NeverCondition.Builder();
			fn.accept(builder);
			return this.never(builder.build());
		}

		public ObjectBuilder<Condition> script(ScriptCondition v) {
			this._kind = Kind.Script;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> script(Consumer<ScriptCondition.Builder> fn) {
			ScriptCondition.Builder builder = new ScriptCondition.Builder();
			fn.accept(builder);
			return this.script(builder.build());
		}

		public Condition build() {
			_checkSingleUse();
			return new Condition(this);
		}

	}

	protected static void setupConditionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::always, AlwaysCondition._DESERIALIZER, "always");
		op.add(Builder::arrayCompare, ArrayCompareCondition._DESERIALIZER, "array_compare");
		op.add(Builder::compare, CompareCondition._DESERIALIZER, "compare");
		op.add(Builder::never, NeverCondition._DESERIALIZER, "never");
		op.add(Builder::script, ScriptCondition._DESERIALIZER, "script");

	}

	public static final JsonpDeserializer<Condition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Condition::setupConditionDeserializer, Builder::build);
}
