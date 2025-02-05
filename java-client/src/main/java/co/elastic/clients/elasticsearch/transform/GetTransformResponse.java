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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.EmptyTransform;
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
import java.lang.Long;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform.Response
@JsonpDeserializable
public class GetTransformResponse implements JsonpSerializable {
	private final long count;

	private final List<EmptyTransform> transforms;

	// ---------------------------------------------------------------------------------------------

	private GetTransformResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.transforms = ModelTypeHelper.unmodifiableRequired(builder.transforms, this, "transforms");

	}

	public static GetTransformResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code transforms}
	 */
	public final List<EmptyTransform> transforms() {
		return this.transforms;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ModelTypeHelper.isDefined(this.transforms)) {
			generator.writeKey("transforms");
			generator.writeStartArray();
			for (EmptyTransform item0 : this.transforms) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTransformResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetTransformResponse> {
		private Long count;

		private List<EmptyTransform> transforms;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code transforms}
		 */
		public final Builder transforms(List<EmptyTransform> value) {
			this.transforms = value;
			return this;
		}

		/**
		 * Required - API name: {@code transforms}
		 */
		public final Builder transforms(EmptyTransform... value) {
			this.transforms = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code transforms}
		 */
		public final Builder transforms(
				Function<ListBuilder<EmptyTransform, EmptyTransform.Builder>, ObjectBuilder<List<EmptyTransform>>> fn) {
			return transforms(fn.apply(new ListBuilder<>(EmptyTransform.Builder::new)).build());
		}

		/**
		 * Builds a {@link GetTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformResponse build() {
			_checkSingleUse();

			return new GetTransformResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTransformResponse}
	 */
	public static final JsonpDeserializer<GetTransformResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetTransformResponse::setupGetTransformResponseDeserializer);

	protected static void setupGetTransformResponseDeserializer(ObjectDeserializer<GetTransformResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::transforms, JsonpDeserializer.arrayDeserializer(EmptyTransform._DESERIALIZER), "transforms");

	}

}
