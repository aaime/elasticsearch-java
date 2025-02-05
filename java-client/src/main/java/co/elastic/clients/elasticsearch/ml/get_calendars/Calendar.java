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

package co.elastic.clients.elasticsearch.ml.get_calendars;

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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml.get_calendars.Calendar
@JsonpDeserializable
public class Calendar implements JsonpSerializable {
	private final String calendarId;

	@Nullable
	private final String description;

	private final List<String> jobIds;

	// ---------------------------------------------------------------------------------------------

	private Calendar(Builder builder) {

		this.calendarId = ModelTypeHelper.requireNonNull(builder.calendarId, this, "calendarId");
		this.description = builder.description;
		this.jobIds = ModelTypeHelper.unmodifiableRequired(builder.jobIds, this, "jobIds");

	}

	public static Calendar of(Consumer<Builder> fn) {
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
	 * Required - An array of anomaly detection job identifiers.
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

		generator.writeKey("calendar_id");
		generator.write(this.calendarId);

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
	 * Builder for {@link Calendar}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Calendar> {
		private String calendarId;

		@Nullable
		private String description;

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
		 * Required - An array of anomaly detection job identifiers.
		 * <p>
		 * API name: {@code job_ids}
		 */
		public final Builder jobIds(List<String> value) {
			this.jobIds = value;
			return this;
		}

		/**
		 * Required - An array of anomaly detection job identifiers.
		 * <p>
		 * API name: {@code job_ids}
		 */
		public final Builder jobIds(String... value) {
			this.jobIds = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link Calendar}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Calendar build() {
			_checkSingleUse();

			return new Calendar(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Calendar}
	 */
	public static final JsonpDeserializer<Calendar> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Calendar::setupCalendarDeserializer);

	protected static void setupCalendarDeserializer(ObjectDeserializer<Calendar.Builder> op) {

		op.add(Builder::calendarId, JsonpDeserializer.stringDeserializer(), "calendar_id");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::jobIds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "job_ids");

	}

}
