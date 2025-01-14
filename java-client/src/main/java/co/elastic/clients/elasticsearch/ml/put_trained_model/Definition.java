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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.Definition
@JsonpDeserializable
public class Definition implements JsonpSerializable {
	private final List<Preprocessor> preprocessors;

	private final TrainedModel trainedModel;

	// ---------------------------------------------------------------------------------------------

	private Definition(Builder builder) {

		this.preprocessors = ModelTypeHelper.unmodifiable(builder.preprocessors);
		this.trainedModel = ModelTypeHelper.requireNonNull(builder.trainedModel, this, "trainedModel");

	}

	public static Definition of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Collection of preprocessors
	 * <p>
	 * API name: {@code preprocessors}
	 */
	public final List<Preprocessor> preprocessors() {
		return this.preprocessors;
	}

	/**
	 * Required - The definition of the trained model.
	 * <p>
	 * API name: {@code trained_model}
	 */
	public final TrainedModel trainedModel() {
		return this.trainedModel;
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

		if (ModelTypeHelper.isDefined(this.preprocessors)) {
			generator.writeKey("preprocessors");
			generator.writeStartArray();
			for (Preprocessor item0 : this.preprocessors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("trained_model");
		this.trainedModel.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Definition}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Definition> {
		@Nullable
		private List<Preprocessor> preprocessors;

		private TrainedModel trainedModel;

		/**
		 * Collection of preprocessors
		 * <p>
		 * API name: {@code preprocessors}
		 */
		public final Builder preprocessors(@Nullable List<Preprocessor> value) {
			this.preprocessors = value;
			return this;
		}

		/**
		 * Collection of preprocessors
		 * <p>
		 * API name: {@code preprocessors}
		 */
		public final Builder preprocessors(Preprocessor... value) {
			this.preprocessors = Arrays.asList(value);
			return this;
		}

		/**
		 * Collection of preprocessors
		 * <p>
		 * API name: {@code preprocessors}
		 */
		public final Builder preprocessors(
				Function<ListBuilder<Preprocessor, Preprocessor.Builder>, ObjectBuilder<List<Preprocessor>>> fn) {
			return preprocessors(fn.apply(new ListBuilder<>(Preprocessor.Builder::new)).build());
		}

		/**
		 * Required - The definition of the trained model.
		 * <p>
		 * API name: {@code trained_model}
		 */
		public final Builder trainedModel(TrainedModel value) {
			this.trainedModel = value;
			return this;
		}

		/**
		 * Required - The definition of the trained model.
		 * <p>
		 * API name: {@code trained_model}
		 */
		public final Builder trainedModel(Consumer<TrainedModel.Builder> fn) {
			TrainedModel.Builder builder = new TrainedModel.Builder();
			fn.accept(builder);
			return this.trainedModel(builder.build());
		}

		/**
		 * Builds a {@link Definition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Definition build() {
			_checkSingleUse();

			return new Definition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Definition}
	 */
	public static final JsonpDeserializer<Definition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Definition::setupDefinitionDeserializer);

	protected static void setupDefinitionDeserializer(ObjectDeserializer<Definition.Builder> op) {

		op.add(Builder::preprocessors, JsonpDeserializer.arrayDeserializer(Preprocessor._DESERIALIZER),
				"preprocessors");
		op.add(Builder::trainedModel, TrainedModel._DESERIALIZER, "trained_model");

	}

}
