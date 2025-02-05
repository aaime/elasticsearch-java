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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ScriptedMetricAggregation
@JsonpDeserializable
public class ScriptedMetricAggregation extends MetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Script combineScript;

	@Nullable
	private final Script initScript;

	@Nullable
	private final Script mapScript;

	private final Map<String, JsonData> params;

	@Nullable
	private final Script reduceScript;

	// ---------------------------------------------------------------------------------------------

	private ScriptedMetricAggregation(Builder builder) {
		super(builder);

		this.combineScript = builder.combineScript;
		this.initScript = builder.initScript;
		this.mapScript = builder.mapScript;
		this.params = ModelTypeHelper.unmodifiable(builder.params);
		this.reduceScript = builder.reduceScript;

	}

	public static ScriptedMetricAggregation of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.ScriptedMetric;
	}

	/**
	 * API name: {@code combine_script}
	 */
	@Nullable
	public final Script combineScript() {
		return this.combineScript;
	}

	/**
	 * API name: {@code init_script}
	 */
	@Nullable
	public final Script initScript() {
		return this.initScript;
	}

	/**
	 * API name: {@code map_script}
	 */
	@Nullable
	public final Script mapScript() {
		return this.mapScript;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code reduce_script}
	 */
	@Nullable
	public final Script reduceScript() {
		return this.reduceScript;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.combineScript != null) {
			generator.writeKey("combine_script");
			this.combineScript.serialize(generator, mapper);

		}
		if (this.initScript != null) {
			generator.writeKey("init_script");
			this.initScript.serialize(generator, mapper);

		}
		if (this.mapScript != null) {
			generator.writeKey("map_script");
			this.mapScript.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.reduceScript != null) {
			generator.writeKey("reduce_script");
			this.reduceScript.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptedMetricAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ScriptedMetricAggregation> {
		@Nullable
		private Script combineScript;

		@Nullable
		private Script initScript;

		@Nullable
		private Script mapScript;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private Script reduceScript;

		/**
		 * API name: {@code combine_script}
		 */
		public final Builder combineScript(@Nullable Script value) {
			this.combineScript = value;
			return this;
		}

		/**
		 * API name: {@code combine_script}
		 */
		public final Builder combineScript(Consumer<Script.Builder> fn) {
			Script.Builder builder = new Script.Builder();
			fn.accept(builder);
			return this.combineScript(builder.build());
		}

		/**
		 * API name: {@code init_script}
		 */
		public final Builder initScript(@Nullable Script value) {
			this.initScript = value;
			return this;
		}

		/**
		 * API name: {@code init_script}
		 */
		public final Builder initScript(Consumer<Script.Builder> fn) {
			Script.Builder builder = new Script.Builder();
			fn.accept(builder);
			return this.initScript(builder.build());
		}

		/**
		 * API name: {@code map_script}
		 */
		public final Builder mapScript(@Nullable Script value) {
			this.mapScript = value;
			return this;
		}

		/**
		 * API name: {@code map_script}
		 */
		public final Builder mapScript(Consumer<Script.Builder> fn) {
			Script.Builder builder = new Script.Builder();
			fn.accept(builder);
			return this.mapScript(builder.build());
		}

		/**
		 * API name: {@code params}
		 */
		public final Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * API name: {@code reduce_script}
		 */
		public final Builder reduceScript(@Nullable Script value) {
			this.reduceScript = value;
			return this;
		}

		/**
		 * API name: {@code reduce_script}
		 */
		public final Builder reduceScript(Consumer<Script.Builder> fn) {
			Script.Builder builder = new Script.Builder();
			fn.accept(builder);
			return this.reduceScript(builder.build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptedMetricAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptedMetricAggregation build() {
			_checkSingleUse();

			return new ScriptedMetricAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptedMetricAggregation}
	 */
	public static final JsonpDeserializer<ScriptedMetricAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScriptedMetricAggregation::setupScriptedMetricAggregationDeserializer);

	protected static void setupScriptedMetricAggregationDeserializer(
			ObjectDeserializer<ScriptedMetricAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::combineScript, Script._DESERIALIZER, "combine_script");
		op.add(Builder::initScript, Script._DESERIALIZER, "init_script");
		op.add(Builder::mapScript, Script._DESERIALIZER, "map_script");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::reduceScript, Script._DESERIALIZER, "reduce_script");

	}

}
