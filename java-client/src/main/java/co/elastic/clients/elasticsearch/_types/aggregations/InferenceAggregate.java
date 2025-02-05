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

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.InferenceAggregate
@JsonpDeserializable
public class InferenceAggregate extends AggregateBase implements AggregateVariant {
	private final Map<String, JsonData> data;

	@Nullable
	private final FieldValue value;

	private final List<InferenceFeatureImportance> featureImportance;

	private final List<InferenceTopClassEntry> topClasses;

	@Nullable
	private final String warning;

	// ---------------------------------------------------------------------------------------------

	private InferenceAggregate(Builder builder) {
		super(builder);
		this.data = ModelTypeHelper.unmodifiable(builder.data);

		this.value = builder.value;
		this.featureImportance = ModelTypeHelper.unmodifiable(builder.featureImportance);
		this.topClasses = ModelTypeHelper.unmodifiable(builder.topClasses);
		this.warning = builder.warning;

	}

	public static InferenceAggregate of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Inference;
	}

	/**
	 * Additional data
	 */
	public final Map<String, JsonData> data() {
		return this.data;
	}

	/**
	 * API name: {@code value}
	 */
	@Nullable
	public final FieldValue value() {
		return this.value;
	}

	/**
	 * API name: {@code feature_importance}
	 */
	public final List<InferenceFeatureImportance> featureImportance() {
		return this.featureImportance;
	}

	/**
	 * API name: {@code top_classes}
	 */
	public final List<InferenceTopClassEntry> topClasses() {
		return this.topClasses;
	}

	/**
	 * API name: {@code warning}
	 */
	@Nullable
	public final String warning() {
		return this.warning;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		for (Map.Entry<String, JsonData> item0 : this.data.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		super.serializeInternal(generator, mapper);
		if (this.value != null) {
			generator.writeKey("value");
			this.value.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.featureImportance)) {
			generator.writeKey("feature_importance");
			generator.writeStartArray();
			for (InferenceFeatureImportance item0 : this.featureImportance) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.topClasses)) {
			generator.writeKey("top_classes");
			generator.writeStartArray();
			for (InferenceTopClassEntry item0 : this.topClasses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.warning != null) {
			generator.writeKey("warning");
			generator.write(this.warning);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceAggregate}.
	 */
	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<InferenceAggregate> {
		@Nullable
		private Map<String, JsonData> data = new HashMap<>();

		/**
		 * Additional data
		 */
		public final Builder data(@Nullable Map<String, JsonData> value) {
			this.data = value;
			return this;
		}

		@Nullable
		private FieldValue value;

		@Nullable
		private List<InferenceFeatureImportance> featureImportance;

		@Nullable
		private List<InferenceTopClassEntry> topClasses;

		@Nullable
		private String warning;

		/**
		 * API name: {@code value}
		 */
		public final Builder value(@Nullable FieldValue value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public final Builder value(Consumer<FieldValue.Builder> fn) {
			FieldValue.Builder builder = new FieldValue.Builder();
			fn.accept(builder);
			return this.value(builder.build());
		}

		/**
		 * API name: {@code feature_importance}
		 */
		public final Builder featureImportance(@Nullable List<InferenceFeatureImportance> value) {
			this.featureImportance = value;
			return this;
		}

		/**
		 * API name: {@code feature_importance}
		 */
		public final Builder featureImportance(InferenceFeatureImportance... value) {
			this.featureImportance = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code feature_importance}
		 */
		public final Builder featureImportance(
				Function<ListBuilder<InferenceFeatureImportance, InferenceFeatureImportance.Builder>, ObjectBuilder<List<InferenceFeatureImportance>>> fn) {
			return featureImportance(fn.apply(new ListBuilder<>(InferenceFeatureImportance.Builder::new)).build());
		}

		/**
		 * API name: {@code top_classes}
		 */
		public final Builder topClasses(@Nullable List<InferenceTopClassEntry> value) {
			this.topClasses = value;
			return this;
		}

		/**
		 * API name: {@code top_classes}
		 */
		public final Builder topClasses(InferenceTopClassEntry... value) {
			this.topClasses = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code top_classes}
		 */
		public final Builder topClasses(
				Function<ListBuilder<InferenceTopClassEntry, InferenceTopClassEntry.Builder>, ObjectBuilder<List<InferenceTopClassEntry>>> fn) {
			return topClasses(fn.apply(new ListBuilder<>(InferenceTopClassEntry.Builder::new)).build());
		}

		/**
		 * API name: {@code warning}
		 */
		public final Builder warning(@Nullable String value) {
			this.warning = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceAggregate build() {
			_checkSingleUse();

			return new InferenceAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceAggregate}
	 */
	public static final JsonpDeserializer<InferenceAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceAggregate::setupInferenceAggregateDeserializer);

	protected static void setupInferenceAggregateDeserializer(ObjectDeserializer<InferenceAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::value, FieldValue._DESERIALIZER, "value");
		op.add(Builder::featureImportance,
				JsonpDeserializer.arrayDeserializer(InferenceFeatureImportance._DESERIALIZER), "feature_importance");
		op.add(Builder::topClasses, JsonpDeserializer.arrayDeserializer(InferenceTopClassEntry._DESERIALIZER),
				"top_classes");
		op.add(Builder::warning, JsonpDeserializer.stringDeserializer(), "warning");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			if (builder.data == null) {
				builder.data = new HashMap<>();
			}
			builder.data.put(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
