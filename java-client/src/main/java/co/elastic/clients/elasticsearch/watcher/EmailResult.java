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

// typedef: watcher._types.EmailResult
@JsonpDeserializable
public class EmailResult implements JsonpSerializable {
	@Nullable
	private final String account;

	private final EmailResult message;

	@Nullable
	private final String reason;

	// ---------------------------------------------------------------------------------------------

	private EmailResult(Builder builder) {

		this.account = builder.account;
		this.message = ModelTypeHelper.requireNonNull(builder.message, this, "message");
		this.reason = builder.reason;

	}

	public static EmailResult of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code account}
	 */
	@Nullable
	public final String account() {
		return this.account;
	}

	/**
	 * Required - API name: {@code message}
	 */
	public final EmailResult message() {
		return this.message;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
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

		if (this.account != null) {
			generator.writeKey("account");
			generator.write(this.account);

		}
		generator.writeKey("message");
		this.message.serialize(generator, mapper);

		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EmailResult}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<EmailResult> {
		@Nullable
		private String account;

		private EmailResult message;

		@Nullable
		private String reason;

		/**
		 * API name: {@code account}
		 */
		public final Builder account(@Nullable String value) {
			this.account = value;
			return this;
		}

		/**
		 * Required - API name: {@code message}
		 */
		public final Builder message(EmailResult value) {
			this.message = value;
			return this;
		}

		/**
		 * Required - API name: {@code message}
		 */
		public final Builder message(Consumer<EmailResult.Builder> fn) {
			EmailResult.Builder builder = new EmailResult.Builder();
			fn.accept(builder);
			return this.message(builder.build());
		}

		/**
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Builds a {@link EmailResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EmailResult build() {
			_checkSingleUse();

			return new EmailResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EmailResult}
	 */
	public static final JsonpDeserializer<EmailResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EmailResult::setupEmailResultDeserializer);

	protected static void setupEmailResultDeserializer(ObjectDeserializer<EmailResult.Builder> op) {

		op.add(Builder::account, JsonpDeserializer.stringDeserializer(), "account");
		op.add(Builder::message, EmailResult._DESERIALIZER, "message");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");

	}

}
