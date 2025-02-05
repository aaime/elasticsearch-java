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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.Transform;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher._types.Action
@JsonpDeserializable
public class Action implements JsonpSerializable {
	@Nullable
	private final ActionType actionType;

	@Nullable
	private final Condition condition;

	@Nullable
	private final String foreach;

	@Nullable
	private final Integer maxIterations;

	@Nullable
	private final String name;

	@Nullable
	private final Time throttlePeriod;

	@Nullable
	private final String throttlePeriodInMillis;

	@Nullable
	private final Transform transform;

	@Nullable
	private final Index index;

	@Nullable
	private final Logging logging;

	@Nullable
	private final ActionWebhook webhook;

	// ---------------------------------------------------------------------------------------------

	private Action(Builder builder) {

		this.actionType = builder.actionType;
		this.condition = builder.condition;
		this.foreach = builder.foreach;
		this.maxIterations = builder.maxIterations;
		this.name = builder.name;
		this.throttlePeriod = builder.throttlePeriod;
		this.throttlePeriodInMillis = builder.throttlePeriodInMillis;
		this.transform = builder.transform;
		this.index = builder.index;
		this.logging = builder.logging;
		this.webhook = builder.webhook;

	}

	public static Action of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code action_type}
	 */
	@Nullable
	public final ActionType actionType() {
		return this.actionType;
	}

	/**
	 * API name: {@code condition}
	 */
	@Nullable
	public final Condition condition() {
		return this.condition;
	}

	/**
	 * API name: {@code foreach}
	 */
	@Nullable
	public final String foreach() {
		return this.foreach;
	}

	/**
	 * API name: {@code max_iterations}
	 */
	@Nullable
	public final Integer maxIterations() {
		return this.maxIterations;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code throttle_period}
	 */
	@Nullable
	public final Time throttlePeriod() {
		return this.throttlePeriod;
	}

	/**
	 * API name: {@code throttle_period_in_millis}
	 */
	@Nullable
	public final String throttlePeriodInMillis() {
		return this.throttlePeriodInMillis;
	}

	/**
	 * API name: {@code transform}
	 */
	@Nullable
	public final Transform transform() {
		return this.transform;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Index index() {
		return this.index;
	}

	/**
	 * API name: {@code logging}
	 */
	@Nullable
	public final Logging logging() {
		return this.logging;
	}

	/**
	 * API name: {@code webhook}
	 */
	@Nullable
	public final ActionWebhook webhook() {
		return this.webhook;
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

		if (this.actionType != null) {
			generator.writeKey("action_type");
			this.actionType.serialize(generator, mapper);
		}
		if (this.condition != null) {
			generator.writeKey("condition");
			this.condition.serialize(generator, mapper);

		}
		if (this.foreach != null) {
			generator.writeKey("foreach");
			generator.write(this.foreach);

		}
		if (this.maxIterations != null) {
			generator.writeKey("max_iterations");
			generator.write(this.maxIterations);

		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.throttlePeriod != null) {
			generator.writeKey("throttle_period");
			this.throttlePeriod.serialize(generator, mapper);

		}
		if (this.throttlePeriodInMillis != null) {
			generator.writeKey("throttle_period_in_millis");
			generator.write(this.throttlePeriodInMillis);

		}
		if (this.transform != null) {
			generator.writeKey("transform");
			this.transform.serialize(generator, mapper);

		}
		if (this.index != null) {
			generator.writeKey("index");
			this.index.serialize(generator, mapper);

		}
		if (this.logging != null) {
			generator.writeKey("logging");
			this.logging.serialize(generator, mapper);

		}
		if (this.webhook != null) {
			generator.writeKey("webhook");
			this.webhook.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Action}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Action> {
		@Nullable
		private ActionType actionType;

		@Nullable
		private Condition condition;

		@Nullable
		private String foreach;

		@Nullable
		private Integer maxIterations;

		@Nullable
		private String name;

		@Nullable
		private Time throttlePeriod;

		@Nullable
		private String throttlePeriodInMillis;

		@Nullable
		private Transform transform;

		@Nullable
		private Index index;

		@Nullable
		private Logging logging;

		@Nullable
		private ActionWebhook webhook;

		/**
		 * API name: {@code action_type}
		 */
		public final Builder actionType(@Nullable ActionType value) {
			this.actionType = value;
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
		 * API name: {@code foreach}
		 */
		public final Builder foreach(@Nullable String value) {
			this.foreach = value;
			return this;
		}

		/**
		 * API name: {@code max_iterations}
		 */
		public final Builder maxIterations(@Nullable Integer value) {
			this.maxIterations = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code throttle_period}
		 */
		public final Builder throttlePeriod(@Nullable Time value) {
			this.throttlePeriod = value;
			return this;
		}

		/**
		 * API name: {@code throttle_period}
		 */
		public final Builder throttlePeriod(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.throttlePeriod(builder.build());
		}

		/**
		 * API name: {@code throttle_period_in_millis}
		 */
		public final Builder throttlePeriodInMillis(@Nullable String value) {
			this.throttlePeriodInMillis = value;
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
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Index value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(Consumer<Index.Builder> fn) {
			Index.Builder builder = new Index.Builder();
			fn.accept(builder);
			return this.index(builder.build());
		}

		/**
		 * API name: {@code logging}
		 */
		public final Builder logging(@Nullable Logging value) {
			this.logging = value;
			return this;
		}

		/**
		 * API name: {@code logging}
		 */
		public final Builder logging(Consumer<Logging.Builder> fn) {
			Logging.Builder builder = new Logging.Builder();
			fn.accept(builder);
			return this.logging(builder.build());
		}

		/**
		 * API name: {@code webhook}
		 */
		public final Builder webhook(@Nullable ActionWebhook value) {
			this.webhook = value;
			return this;
		}

		/**
		 * API name: {@code webhook}
		 */
		public final Builder webhook(Consumer<ActionWebhook.Builder> fn) {
			ActionWebhook.Builder builder = new ActionWebhook.Builder();
			fn.accept(builder);
			return this.webhook(builder.build());
		}

		/**
		 * Builds a {@link Action}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Action build() {
			_checkSingleUse();

			return new Action(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Action}
	 */
	public static final JsonpDeserializer<Action> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Action::setupActionDeserializer);

	protected static void setupActionDeserializer(ObjectDeserializer<Action.Builder> op) {

		op.add(Builder::actionType, ActionType._DESERIALIZER, "action_type");
		op.add(Builder::condition, Condition._DESERIALIZER, "condition");
		op.add(Builder::foreach, JsonpDeserializer.stringDeserializer(), "foreach");
		op.add(Builder::maxIterations, JsonpDeserializer.integerDeserializer(), "max_iterations");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::throttlePeriod, Time._DESERIALIZER, "throttle_period");
		op.add(Builder::throttlePeriodInMillis, JsonpDeserializer.stringDeserializer(), "throttle_period_in_millis");
		op.add(Builder::transform, Transform._DESERIALIZER, "transform");
		op.add(Builder::index, Index._DESERIALIZER, "index");
		op.add(Builder::logging, Logging._DESERIALIZER, "logging");
		op.add(Builder::webhook, ActionWebhook._DESERIALIZER, "webhook");

	}

}
