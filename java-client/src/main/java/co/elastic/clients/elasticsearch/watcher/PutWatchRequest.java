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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Transform;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.put_watch.Request
@JsonpDeserializable
public class PutWatchRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Action> actions;

	@Nullable
	private final Boolean active;

	@Nullable
	private final Condition condition;

	private final String id;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	@Nullable
	private final Input input;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final String throttlePeriod;

	@Nullable
	private final Transform transform;

	@Nullable
	private final Trigger trigger;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private PutWatchRequest(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiable(builder.actions);
		this.active = builder.active;
		this.condition = builder.condition;
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.input = builder.input;
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.throttlePeriod = builder.throttlePeriod;
		this.transform = builder.transform;
		this.trigger = builder.trigger;
		this.version = builder.version;

	}

	public static PutWatchRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code actions}
	 */
	public final Map<String, Action> actions() {
		return this.actions;
	}

	/**
	 * Specify whether the watch is in/active by default
	 * <p>
	 * API name: {@code active}
	 */
	@Nullable
	public final Boolean active() {
		return this.active;
	}

	/**
	 * API name: {@code condition}
	 */
	@Nullable
	public final Condition condition() {
		return this.condition;
	}

	/**
	 * Required - Watch ID
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * only update the watch if the last operation that has changed the watch has
	 * the specified primary term
	 * <p>
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public final Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * only update the watch if the last operation that has changed the watch has
	 * the specified sequence number
	 * <p>
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public final Long ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * API name: {@code input}
	 */
	@Nullable
	public final Input input() {
		return this.input;
	}

	/**
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code throttle_period}
	 */
	@Nullable
	public final String throttlePeriod() {
		return this.throttlePeriod;
	}

	/**
	 * API name: {@code transform}
	 */
	@Nullable
	public final Transform transform() {
		return this.transform;
	}

	/**
	 * API name: {@code trigger}
	 */
	@Nullable
	public final Trigger trigger() {
		return this.trigger;
	}

	/**
	 * Explicit version number for concurrency control
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
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
			generator.writeStartObject();
			for (Map.Entry<String, Action> item0 : this.actions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.condition != null) {
			generator.writeKey("condition");
			this.condition.serialize(generator, mapper);

		}
		if (this.input != null) {
			generator.writeKey("input");
			this.input.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.throttlePeriod != null) {
			generator.writeKey("throttle_period");
			generator.write(this.throttlePeriod);

		}
		if (this.transform != null) {
			generator.writeKey("transform");
			this.transform.serialize(generator, mapper);

		}
		if (this.trigger != null) {
			generator.writeKey("trigger");
			this.trigger.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutWatchRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutWatchRequest> {
		@Nullable
		private Map<String, Action> actions;

		@Nullable
		private Boolean active;

		@Nullable
		private Condition condition;

		private String id;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		@Nullable
		private Input input;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String throttlePeriod;

		@Nullable
		private Transform transform;

		@Nullable
		private Trigger trigger;

		@Nullable
		private Long version;

		/**
		 * API name: {@code actions}
		 */
		public final Builder actions(@Nullable Map<String, Action> value) {
			this.actions = value;
			return this;
		}

		public final Builder actions(
				Function<MapBuilder<String, Action, Action.Builder>, ObjectBuilder<Map<String, Action>>> fn) {
			return actions(fn.apply(new MapBuilder<>(Action.Builder::new)).build());
		}

		/**
		 * Specify whether the watch is in/active by default
		 * <p>
		 * API name: {@code active}
		 */
		public final Builder active(@Nullable Boolean value) {
			this.active = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(@Nullable Condition value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(Consumer<Condition.Builder> fn) {
			Condition.Builder builder = new Condition.Builder();
			fn.accept(builder);
			return this.condition(builder.build());
		}

		/**
		 * Required - Watch ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * only update the watch if the last operation that has changed the watch has
		 * the specified primary term
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public final Builder ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * only update the watch if the last operation that has changed the watch has
		 * the specified sequence number
		 * <p>
		 * API name: {@code if_seq_no}
		 */
		public final Builder ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public final Builder input(@Nullable Input value) {
			this.input = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public final Builder input(Consumer<Input.Builder> fn) {
			Input.Builder builder = new Input.Builder();
			fn.accept(builder);
			return this.input(builder.build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * API name: {@code throttle_period}
		 */
		public final Builder throttlePeriod(@Nullable String value) {
			this.throttlePeriod = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public final Builder transform(@Nullable Transform value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public final Builder transform(Consumer<Transform.Builder> fn) {
			Transform.Builder builder = new Transform.Builder();
			fn.accept(builder);
			return this.transform(builder.build());
		}

		/**
		 * API name: {@code trigger}
		 */
		public final Builder trigger(@Nullable Trigger value) {
			this.trigger = value;
			return this;
		}

		/**
		 * API name: {@code trigger}
		 */
		public final Builder trigger(Consumer<Trigger.Builder> fn) {
			Trigger.Builder builder = new Trigger.Builder();
			fn.accept(builder);
			return this.trigger(builder.build());
		}

		/**
		 * Explicit version number for concurrency control
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link PutWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutWatchRequest build() {
			_checkSingleUse();

			return new PutWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutWatchRequest}
	 */
	public static final JsonpDeserializer<PutWatchRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutWatchRequest::setupPutWatchRequestDeserializer);

	protected static void setupPutWatchRequestDeserializer(ObjectDeserializer<PutWatchRequest.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(Action._DESERIALIZER), "actions");
		op.add(Builder::condition, Condition._DESERIALIZER, "condition");
		op.add(Builder::input, Input._DESERIALIZER, "input");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::throttlePeriod, JsonpDeserializer.stringDeserializer(), "throttle_period");
		op.add(Builder::transform, Transform._DESERIALIZER, "transform");
		op.add(Builder::trigger, Trigger._DESERIALIZER, "trigger");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.put_watch}".
	 */
	public static final Endpoint<PutWatchRequest, PutWatchResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/watcher.put_watch",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.active != null) {
					params.put("active", String.valueOf(request.active));
				}
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", String.valueOf(request.ifPrimaryTerm));
				}
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", String.valueOf(request.ifSeqNo));
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutWatchResponse._DESERIALIZER);
}
