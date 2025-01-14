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
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResult
@JsonpDeserializable
public class ExecutionResult implements JsonpSerializable {
	private final List<ExecutionResultAction> actions;

	private final ExecutionResultCondition condition;

	private final int executionDuration;

	private final String executionTime;

	private final ExecutionResultInput input;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResult(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.condition = ModelTypeHelper.requireNonNull(builder.condition, this, "condition");
		this.executionDuration = ModelTypeHelper.requireNonNull(builder.executionDuration, this, "executionDuration");
		this.executionTime = ModelTypeHelper.requireNonNull(builder.executionTime, this, "executionTime");
		this.input = ModelTypeHelper.requireNonNull(builder.input, this, "input");

	}

	public static ExecutionResult of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final List<ExecutionResultAction> actions() {
		return this.actions;
	}

	/**
	 * Required - API name: {@code condition}
	 */
	public final ExecutionResultCondition condition() {
		return this.condition;
	}

	/**
	 * Required - API name: {@code execution_duration}
	 */
	public final int executionDuration() {
		return this.executionDuration;
	}

	/**
	 * Required - API name: {@code execution_time}
	 */
	public final String executionTime() {
		return this.executionTime;
	}

	/**
	 * Required - API name: {@code input}
	 */
	public final ExecutionResultInput input() {
		return this.input;
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
			for (ExecutionResultAction item0 : this.actions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("condition");
		this.condition.serialize(generator, mapper);

		generator.writeKey("execution_duration");
		generator.write(this.executionDuration);

		generator.writeKey("execution_time");
		generator.write(this.executionTime);

		generator.writeKey("input");
		this.input.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResult}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecutionResult> {
		private List<ExecutionResultAction> actions;

		private ExecutionResultCondition condition;

		private Integer executionDuration;

		private String executionTime;

		private ExecutionResultInput input;

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(List<ExecutionResultAction> value) {
			this.actions = value;
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(ExecutionResultAction... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(
				Function<ListBuilder<ExecutionResultAction, ExecutionResultAction.Builder>, ObjectBuilder<List<ExecutionResultAction>>> fn) {
			return actions(fn.apply(new ListBuilder<>(ExecutionResultAction.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code condition}
		 */
		public final Builder condition(ExecutionResultCondition value) {
			this.condition = value;
			return this;
		}

		/**
		 * Required - API name: {@code condition}
		 */
		public final Builder condition(Consumer<ExecutionResultCondition.Builder> fn) {
			ExecutionResultCondition.Builder builder = new ExecutionResultCondition.Builder();
			fn.accept(builder);
			return this.condition(builder.build());
		}

		/**
		 * Required - API name: {@code execution_duration}
		 */
		public final Builder executionDuration(int value) {
			this.executionDuration = value;
			return this;
		}

		/**
		 * Required - API name: {@code execution_time}
		 */
		public final Builder executionTime(String value) {
			this.executionTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code input}
		 */
		public final Builder input(ExecutionResultInput value) {
			this.input = value;
			return this;
		}

		/**
		 * Required - API name: {@code input}
		 */
		public final Builder input(Consumer<ExecutionResultInput.Builder> fn) {
			ExecutionResultInput.Builder builder = new ExecutionResultInput.Builder();
			fn.accept(builder);
			return this.input(builder.build());
		}

		/**
		 * Builds a {@link ExecutionResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResult build() {
			_checkSingleUse();

			return new ExecutionResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionResult}
	 */
	public static final JsonpDeserializer<ExecutionResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExecutionResult::setupExecutionResultDeserializer);

	protected static void setupExecutionResultDeserializer(ObjectDeserializer<ExecutionResult.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(ExecutionResultAction._DESERIALIZER), "actions");
		op.add(Builder::condition, ExecutionResultCondition._DESERIALIZER, "condition");
		op.add(Builder::executionDuration, JsonpDeserializer.integerDeserializer(), "execution_duration");
		op.add(Builder::executionTime, JsonpDeserializer.stringDeserializer(), "execution_time");
		op.add(Builder::input, ExecutionResultInput._DESERIALIZER, "input");

	}

}
