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
import co.elastic.clients.util.ListBuilder;
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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.post_calendar_events.Request
@JsonpDeserializable
public class PostCalendarEventsRequest extends RequestBase implements JsonpSerializable {
	private final String calendarId;

	private final List<CalendarEvent> events;

	// ---------------------------------------------------------------------------------------------

	private PostCalendarEventsRequest(Builder builder) {

		this.calendarId = ModelTypeHelper.requireNonNull(builder.calendarId, this, "calendarId");
		this.events = ModelTypeHelper.unmodifiableRequired(builder.events, this, "events");

	}

	public static PostCalendarEventsRequest of(Consumer<Builder> fn) {
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
	 * Required - A list of one of more scheduled events. The event’s start and end
	 * times can be specified as integer milliseconds since the epoch or as a string
	 * in ISO 8601 format.
	 * <p>
	 * API name: {@code events}
	 */
	public final List<CalendarEvent> events() {
		return this.events;
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

		if (ModelTypeHelper.isDefined(this.events)) {
			generator.writeKey("events");
			generator.writeStartArray();
			for (CalendarEvent item0 : this.events) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostCalendarEventsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PostCalendarEventsRequest> {
		private String calendarId;

		private List<CalendarEvent> events;

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
		 * Required - A list of one of more scheduled events. The event’s start and end
		 * times can be specified as integer milliseconds since the epoch or as a string
		 * in ISO 8601 format.
		 * <p>
		 * API name: {@code events}
		 */
		public final Builder events(List<CalendarEvent> value) {
			this.events = value;
			return this;
		}

		/**
		 * Required - A list of one of more scheduled events. The event’s start and end
		 * times can be specified as integer milliseconds since the epoch or as a string
		 * in ISO 8601 format.
		 * <p>
		 * API name: {@code events}
		 */
		public final Builder events(CalendarEvent... value) {
			this.events = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - A list of one of more scheduled events. The event’s start and end
		 * times can be specified as integer milliseconds since the epoch or as a string
		 * in ISO 8601 format.
		 * <p>
		 * API name: {@code events}
		 */
		public final Builder events(
				Function<ListBuilder<CalendarEvent, CalendarEvent.Builder>, ObjectBuilder<List<CalendarEvent>>> fn) {
			return events(fn.apply(new ListBuilder<>(CalendarEvent.Builder::new)).build());
		}

		/**
		 * Builds a {@link PostCalendarEventsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostCalendarEventsRequest build() {
			_checkSingleUse();

			return new PostCalendarEventsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostCalendarEventsRequest}
	 */
	public static final JsonpDeserializer<PostCalendarEventsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PostCalendarEventsRequest::setupPostCalendarEventsRequestDeserializer);

	protected static void setupPostCalendarEventsRequestDeserializer(
			ObjectDeserializer<PostCalendarEventsRequest.Builder> op) {

		op.add(Builder::events, JsonpDeserializer.arrayDeserializer(CalendarEvent._DESERIALIZER), "events");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.post_calendar_events}".
	 */
	public static final Endpoint<PostCalendarEventsRequest, PostCalendarEventsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.post_calendar_events",

			// Request method
			request -> {
				return "POST";

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
					buf.append("/events");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PostCalendarEventsResponse._DESERIALIZER);
}
