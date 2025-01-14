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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.elasticsearch._types.Retries;
import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: tasks._types.Status
@JsonpDeserializable
public class Status implements JsonpSerializable {
	private final long batches;

	@Nullable
	private final String canceled;

	private final long created;

	private final long deleted;

	private final long noops;

	private final List<String> failures;

	private final float requestsPerSecond;

	private final Retries retries;

	@Nullable
	private final Time throttled;

	private final long throttledMillis;

	@Nullable
	private final Time throttledUntil;

	private final long throttledUntilMillis;

	@Nullable
	private final Boolean timedOut;

	@Nullable
	private final Long took;

	private final long total;

	private final long updated;

	private final long versionConflicts;

	// ---------------------------------------------------------------------------------------------

	private Status(Builder builder) {

		this.batches = ModelTypeHelper.requireNonNull(builder.batches, this, "batches");
		this.canceled = builder.canceled;
		this.created = ModelTypeHelper.requireNonNull(builder.created, this, "created");
		this.deleted = ModelTypeHelper.requireNonNull(builder.deleted, this, "deleted");
		this.noops = ModelTypeHelper.requireNonNull(builder.noops, this, "noops");
		this.failures = ModelTypeHelper.unmodifiable(builder.failures);
		this.requestsPerSecond = ModelTypeHelper.requireNonNull(builder.requestsPerSecond, this, "requestsPerSecond");
		this.retries = ModelTypeHelper.requireNonNull(builder.retries, this, "retries");
		this.throttled = builder.throttled;
		this.throttledMillis = ModelTypeHelper.requireNonNull(builder.throttledMillis, this, "throttledMillis");
		this.throttledUntil = builder.throttledUntil;
		this.throttledUntilMillis = ModelTypeHelper.requireNonNull(builder.throttledUntilMillis, this,
				"throttledUntilMillis");
		this.timedOut = builder.timedOut;
		this.took = builder.took;
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.updated = ModelTypeHelper.requireNonNull(builder.updated, this, "updated");
		this.versionConflicts = ModelTypeHelper.requireNonNull(builder.versionConflicts, this, "versionConflicts");

	}

	public static Status of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code batches}
	 */
	public final long batches() {
		return this.batches;
	}

	/**
	 * API name: {@code canceled}
	 */
	@Nullable
	public final String canceled() {
		return this.canceled;
	}

	/**
	 * Required - API name: {@code created}
	 */
	public final long created() {
		return this.created;
	}

	/**
	 * Required - API name: {@code deleted}
	 */
	public final long deleted() {
		return this.deleted;
	}

	/**
	 * Required - API name: {@code noops}
	 */
	public final long noops() {
		return this.noops;
	}

	/**
	 * API name: {@code failures}
	 */
	public final List<String> failures() {
		return this.failures;
	}

	/**
	 * Required - API name: {@code requests_per_second}
	 */
	public final float requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * Required - API name: {@code retries}
	 */
	public final Retries retries() {
		return this.retries;
	}

	/**
	 * API name: {@code throttled}
	 */
	@Nullable
	public final Time throttled() {
		return this.throttled;
	}

	/**
	 * Required - API name: {@code throttled_millis}
	 */
	public final long throttledMillis() {
		return this.throttledMillis;
	}

	/**
	 * API name: {@code throttled_until}
	 */
	@Nullable
	public final Time throttledUntil() {
		return this.throttledUntil;
	}

	/**
	 * Required - API name: {@code throttled_until_millis}
	 */
	public final long throttledUntilMillis() {
		return this.throttledUntilMillis;
	}

	/**
	 * API name: {@code timed_out}
	 */
	@Nullable
	public final Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code took}
	 */
	@Nullable
	public final Long took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code updated}
	 */
	public final long updated() {
		return this.updated;
	}

	/**
	 * Required - API name: {@code version_conflicts}
	 */
	public final long versionConflicts() {
		return this.versionConflicts;
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

		generator.writeKey("batches");
		generator.write(this.batches);

		if (this.canceled != null) {
			generator.writeKey("canceled");
			generator.write(this.canceled);

		}
		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("deleted");
		generator.write(this.deleted);

		generator.writeKey("noops");
		generator.write(this.noops);

		if (ModelTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (String item0 : this.failures) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("requests_per_second");
		generator.write(this.requestsPerSecond);

		generator.writeKey("retries");
		this.retries.serialize(generator, mapper);

		if (this.throttled != null) {
			generator.writeKey("throttled");
			this.throttled.serialize(generator, mapper);

		}
		generator.writeKey("throttled_millis");
		generator.write(this.throttledMillis);

		if (this.throttledUntil != null) {
			generator.writeKey("throttled_until");
			this.throttledUntil.serialize(generator, mapper);

		}
		generator.writeKey("throttled_until_millis");
		generator.write(this.throttledUntilMillis);

		if (this.timedOut != null) {
			generator.writeKey("timed_out");
			generator.write(this.timedOut);

		}
		if (this.took != null) {
			generator.writeKey("took");
			generator.write(this.took);

		}
		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("updated");
		generator.write(this.updated);

		generator.writeKey("version_conflicts");
		generator.write(this.versionConflicts);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Status}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Status> {
		private Long batches;

		@Nullable
		private String canceled;

		private Long created;

		private Long deleted;

		private Long noops;

		@Nullable
		private List<String> failures;

		private Float requestsPerSecond;

		private Retries retries;

		@Nullable
		private Time throttled;

		private Long throttledMillis;

		@Nullable
		private Time throttledUntil;

		private Long throttledUntilMillis;

		@Nullable
		private Boolean timedOut;

		@Nullable
		private Long took;

		private Long total;

		private Long updated;

		private Long versionConflicts;

		/**
		 * Required - API name: {@code batches}
		 */
		public final Builder batches(long value) {
			this.batches = value;
			return this;
		}

		/**
		 * API name: {@code canceled}
		 */
		public final Builder canceled(@Nullable String value) {
			this.canceled = value;
			return this;
		}

		/**
		 * Required - API name: {@code created}
		 */
		public final Builder created(long value) {
			this.created = value;
			return this;
		}

		/**
		 * Required - API name: {@code deleted}
		 */
		public final Builder deleted(long value) {
			this.deleted = value;
			return this;
		}

		/**
		 * Required - API name: {@code noops}
		 */
		public final Builder noops(long value) {
			this.noops = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(@Nullable List<String> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(String... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(float value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * Required - API name: {@code retries}
		 */
		public final Builder retries(Retries value) {
			this.retries = value;
			return this;
		}

		/**
		 * Required - API name: {@code retries}
		 */
		public final Builder retries(Consumer<Retries.Builder> fn) {
			Retries.Builder builder = new Retries.Builder();
			fn.accept(builder);
			return this.retries(builder.build());
		}

		/**
		 * API name: {@code throttled}
		 */
		public final Builder throttled(@Nullable Time value) {
			this.throttled = value;
			return this;
		}

		/**
		 * API name: {@code throttled}
		 */
		public final Builder throttled(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.throttled(builder.build());
		}

		/**
		 * Required - API name: {@code throttled_millis}
		 */
		public final Builder throttledMillis(long value) {
			this.throttledMillis = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until}
		 */
		public final Builder throttledUntil(@Nullable Time value) {
			this.throttledUntil = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until}
		 */
		public final Builder throttledUntil(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.throttledUntil(builder.build());
		}

		/**
		 * Required - API name: {@code throttled_until_millis}
		 */
		public final Builder throttledUntilMillis(long value) {
			this.throttledUntilMillis = value;
			return this;
		}

		/**
		 * API name: {@code timed_out}
		 */
		public final Builder timedOut(@Nullable Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public final Builder took(@Nullable Long value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code updated}
		 */
		public final Builder updated(long value) {
			this.updated = value;
			return this;
		}

		/**
		 * Required - API name: {@code version_conflicts}
		 */
		public final Builder versionConflicts(long value) {
			this.versionConflicts = value;
			return this;
		}

		/**
		 * Builds a {@link Status}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Status build() {
			_checkSingleUse();

			return new Status(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Status}
	 */
	public static final JsonpDeserializer<Status> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Status::setupStatusDeserializer);

	protected static void setupStatusDeserializer(ObjectDeserializer<Status.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.longDeserializer(), "batches");
		op.add(Builder::canceled, JsonpDeserializer.stringDeserializer(), "canceled");
		op.add(Builder::created, JsonpDeserializer.longDeserializer(), "created");
		op.add(Builder::deleted, JsonpDeserializer.longDeserializer(), "deleted");
		op.add(Builder::noops, JsonpDeserializer.longDeserializer(), "noops");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"failures");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.floatDeserializer(), "requests_per_second");
		op.add(Builder::retries, Retries._DESERIALIZER, "retries");
		op.add(Builder::throttled, Time._DESERIALIZER, "throttled");
		op.add(Builder::throttledMillis, JsonpDeserializer.longDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntil, Time._DESERIALIZER, "throttled_until");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.longDeserializer(), "throttled_until_millis");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.longDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.longDeserializer(), "version_conflicts");

	}

}
