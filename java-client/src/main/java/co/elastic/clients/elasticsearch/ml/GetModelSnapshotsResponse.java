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

// typedef: ml.get_model_snapshots.Response
@JsonpDeserializable
public class GetModelSnapshotsResponse implements JsonpSerializable {
	private final long count;

	private final List<ModelSnapshot> modelSnapshots;

	// ---------------------------------------------------------------------------------------------

	private GetModelSnapshotsResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.modelSnapshots = ModelTypeHelper.unmodifiableRequired(builder.modelSnapshots, this, "modelSnapshots");

	}

	public static GetModelSnapshotsResponse of(Consumer<Builder> fn) {
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
	 * Required - API name: {@code model_snapshots}
	 */
	public final List<ModelSnapshot> modelSnapshots() {
		return this.modelSnapshots;
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

		if (ModelTypeHelper.isDefined(this.modelSnapshots)) {
			generator.writeKey("model_snapshots");
			generator.writeStartArray();
			for (ModelSnapshot item0 : this.modelSnapshots) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetModelSnapshotsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetModelSnapshotsResponse> {
		private Long count;

		private List<ModelSnapshot> modelSnapshots;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshots}
		 */
		public final Builder modelSnapshots(List<ModelSnapshot> value) {
			this.modelSnapshots = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshots}
		 */
		public final Builder modelSnapshots(ModelSnapshot... value) {
			this.modelSnapshots = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshots}
		 */
		public final Builder modelSnapshots(
				Function<ListBuilder<ModelSnapshot, ModelSnapshot.Builder>, ObjectBuilder<List<ModelSnapshot>>> fn) {
			return modelSnapshots(fn.apply(new ListBuilder<>(ModelSnapshot.Builder::new)).build());
		}

		/**
		 * Builds a {@link GetModelSnapshotsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetModelSnapshotsResponse build() {
			_checkSingleUse();

			return new GetModelSnapshotsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetModelSnapshotsResponse}
	 */
	public static final JsonpDeserializer<GetModelSnapshotsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetModelSnapshotsResponse::setupGetModelSnapshotsResponseDeserializer);

	protected static void setupGetModelSnapshotsResponseDeserializer(
			ObjectDeserializer<GetModelSnapshotsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::modelSnapshots, JsonpDeserializer.arrayDeserializer(ModelSnapshot._DESERIALIZER),
				"model_snapshots");

	}

}
