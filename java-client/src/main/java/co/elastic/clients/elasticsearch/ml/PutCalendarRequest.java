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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml.put_calendar.Request
@JsonpDeserializable
public class PutCalendarRequest extends RequestBase implements JsonpSerializable {
	private final String calendarId;

	@Nullable
	private final String description;

	private final List<String> jobIds;

	// ---------------------------------------------------------------------------------------------

	private PutCalendarRequest(Builder builder) {

		this.calendarId = ModelTypeHelper.requireNonNull(builder.calendarId, this, "calendarId");
		this.description = builder.description;
		this.jobIds = ModelTypeHelper.unmodifiable(builder.jobIds);

	}

	public static PutCalendarRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - A string that uniquely identifies a calendar.
	 * <p>
	 * API name: {@code calendar_id}
	 */
	public final String calendarId() {
		return this.calendarId;
	}

	/**
	 * A description of the calendar.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * An array of anomaly detection job identifiers.
	 * <p>
	 * API name: {@code job_ids}
	 */
	public final List<String> jobIds() {
		return this.jobIds;
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

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ModelTypeHelper.isDefined(this.jobIds)) {
			generator.writeKey("job_ids");
			generator.writeStartArray();
			for (String item0 : this.jobIds) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutCalendarRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutCalendarRequest> {
		private String calendarId;

		@Nullable
		private String description;

		@Nullable
		private List<String> jobIds;

		/**
		 * Required - A string that uniquely identifies a calendar.
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public final Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * A description of the calendar.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * An array of anomaly detection job identifiers.
		 * <p>
		 * API name: {@code job_ids}
		 */
		public final Builder jobIds(@Nullable List<String> value) {
			this.jobIds = value;
			return this;
		}

		/**
		 * An array of anomaly detection job identifiers.
		 * <p>
		 * API name: {@code job_ids}
		 */
		public final Builder jobIds(String... value) {
			this.jobIds = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link PutCalendarRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutCalendarRequest build() {
			_checkSingleUse();

			return new PutCalendarRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutCalendarRequest}
	 */
	public static final JsonpDeserializer<PutCalendarRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutCalendarRequest::setupPutCalendarRequestDeserializer);

	protected static void setupPutCalendarRequestDeserializer(ObjectDeserializer<PutCalendarRequest.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::jobIds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "job_ids");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_calendar}".
	 */
	public static final Endpoint<PutCalendarRequest, PutCalendarResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.put_calendar",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _calendarId = 1 << 0;

				int propsSet = 0;

				propsSet |= _calendarId;

				if (propsSet == (_calendarId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.calendarId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutCalendarResponse._DESERIALIZER);
}
