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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher._types.LoggingResult
@JsonpDeserializable
public class LoggingResult implements JsonpSerializable {
	private final String loggedText;

	// ---------------------------------------------------------------------------------------------

	private LoggingResult(Builder builder) {

		this.loggedText = ModelTypeHelper.requireNonNull(builder.loggedText, this, "loggedText");

	}

	public static LoggingResult of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code logged_text}
	 */
	public final String loggedText() {
		return this.loggedText;
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

		generator.writeKey("logged_text");
		generator.write(this.loggedText);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LoggingResult}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<LoggingResult> {
		private String loggedText;

		/**
		 * Required - API name: {@code logged_text}
		 */
		public final Builder loggedText(String value) {
			this.loggedText = value;
			return this;
		}

		/**
		 * Builds a {@link LoggingResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LoggingResult build() {
			_checkSingleUse();

			return new LoggingResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LoggingResult}
	 */
	public static final JsonpDeserializer<LoggingResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LoggingResult::setupLoggingResultDeserializer);

	protected static void setupLoggingResultDeserializer(ObjectDeserializer<LoggingResult.Builder> op) {

		op.add(Builder::loggedText, JsonpDeserializer.stringDeserializer(), "logged_text");

	}

}
