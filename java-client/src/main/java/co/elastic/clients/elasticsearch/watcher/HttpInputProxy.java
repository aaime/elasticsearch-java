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
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher._types.HttpInputProxy
@JsonpDeserializable
public class HttpInputProxy implements JsonpSerializable {
	private final String host;

	private final Number port;

	// ---------------------------------------------------------------------------------------------

	private HttpInputProxy(Builder builder) {

		this.host = ModelTypeHelper.requireNonNull(builder.host, this, "host");
		this.port = ModelTypeHelper.requireNonNull(builder.port, this, "port");

	}

	public static HttpInputProxy of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code host}
	 */
	public final String host() {
		return this.host;
	}

	/**
	 * Required - API name: {@code port}
	 */
	public final Number port() {
		return this.port;
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

		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("port");
		generator.write(this.port.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInputProxy}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HttpInputProxy> {
		private String host;

		private Number port;

		/**
		 * Required - API name: {@code host}
		 */
		public final Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * Required - API name: {@code port}
		 */
		public final Builder port(Number value) {
			this.port = value;
			return this;
		}

		/**
		 * Builds a {@link HttpInputProxy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpInputProxy build() {
			_checkSingleUse();

			return new HttpInputProxy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpInputProxy}
	 */
	public static final JsonpDeserializer<HttpInputProxy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HttpInputProxy::setupHttpInputProxyDeserializer);

	protected static void setupHttpInputProxyDeserializer(ObjectDeserializer<HttpInputProxy.Builder> op) {

		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::port, JsonpDeserializer.numberDeserializer(), "port");

	}

}
