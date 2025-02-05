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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.Checkpointing
@JsonpDeserializable
public class Checkpointing implements JsonpSerializable {
	private final long changesLastDetectedAt;

	@Nullable
	private final String changesLastDetectedAtDateTime;

	private final CheckpointStats last;

	@Nullable
	private final CheckpointStats next;

	@Nullable
	private final Long operationsBehind;

	// ---------------------------------------------------------------------------------------------

	private Checkpointing(Builder builder) {

		this.changesLastDetectedAt = ModelTypeHelper.requireNonNull(builder.changesLastDetectedAt, this,
				"changesLastDetectedAt");
		this.changesLastDetectedAtDateTime = builder.changesLastDetectedAtDateTime;
		this.last = ModelTypeHelper.requireNonNull(builder.last, this, "last");
		this.next = builder.next;
		this.operationsBehind = builder.operationsBehind;

	}

	public static Checkpointing of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code changes_last_detected_at}
	 */
	public final long changesLastDetectedAt() {
		return this.changesLastDetectedAt;
	}

	/**
	 * API name: {@code changes_last_detected_at_date_time}
	 */
	@Nullable
	public final String changesLastDetectedAtDateTime() {
		return this.changesLastDetectedAtDateTime;
	}

	/**
	 * Required - API name: {@code last}
	 */
	public final CheckpointStats last() {
		return this.last;
	}

	/**
	 * API name: {@code next}
	 */
	@Nullable
	public final CheckpointStats next() {
		return this.next;
	}

	/**
	 * API name: {@code operations_behind}
	 */
	@Nullable
	public final Long operationsBehind() {
		return this.operationsBehind;
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

		generator.writeKey("changes_last_detected_at");
		generator.write(this.changesLastDetectedAt);

		if (this.changesLastDetectedAtDateTime != null) {
			generator.writeKey("changes_last_detected_at_date_time");
			generator.write(this.changesLastDetectedAtDateTime);

		}
		generator.writeKey("last");
		this.last.serialize(generator, mapper);

		if (this.next != null) {
			generator.writeKey("next");
			this.next.serialize(generator, mapper);

		}
		if (this.operationsBehind != null) {
			generator.writeKey("operations_behind");
			generator.write(this.operationsBehind);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Checkpointing}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Checkpointing> {
		private Long changesLastDetectedAt;

		@Nullable
		private String changesLastDetectedAtDateTime;

		private CheckpointStats last;

		@Nullable
		private CheckpointStats next;

		@Nullable
		private Long operationsBehind;

		/**
		 * Required - API name: {@code changes_last_detected_at}
		 */
		public final Builder changesLastDetectedAt(long value) {
			this.changesLastDetectedAt = value;
			return this;
		}

		/**
		 * API name: {@code changes_last_detected_at_date_time}
		 */
		public final Builder changesLastDetectedAtDateTime(@Nullable String value) {
			this.changesLastDetectedAtDateTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code last}
		 */
		public final Builder last(CheckpointStats value) {
			this.last = value;
			return this;
		}

		/**
		 * Required - API name: {@code last}
		 */
		public final Builder last(Consumer<CheckpointStats.Builder> fn) {
			CheckpointStats.Builder builder = new CheckpointStats.Builder();
			fn.accept(builder);
			return this.last(builder.build());
		}

		/**
		 * API name: {@code next}
		 */
		public final Builder next(@Nullable CheckpointStats value) {
			this.next = value;
			return this;
		}

		/**
		 * API name: {@code next}
		 */
		public final Builder next(Consumer<CheckpointStats.Builder> fn) {
			CheckpointStats.Builder builder = new CheckpointStats.Builder();
			fn.accept(builder);
			return this.next(builder.build());
		}

		/**
		 * API name: {@code operations_behind}
		 */
		public final Builder operationsBehind(@Nullable Long value) {
			this.operationsBehind = value;
			return this;
		}

		/**
		 * Builds a {@link Checkpointing}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Checkpointing build() {
			_checkSingleUse();

			return new Checkpointing(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Checkpointing}
	 */
	public static final JsonpDeserializer<Checkpointing> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Checkpointing::setupCheckpointingDeserializer);

	protected static void setupCheckpointingDeserializer(ObjectDeserializer<Checkpointing.Builder> op) {

		op.add(Builder::changesLastDetectedAt, JsonpDeserializer.longDeserializer(), "changes_last_detected_at");
		op.add(Builder::changesLastDetectedAtDateTime, JsonpDeserializer.stringDeserializer(),
				"changes_last_detected_at_date_time");
		op.add(Builder::last, CheckpointStats._DESERIALIZER, "last");
		op.add(Builder::next, CheckpointStats._DESERIALIZER, "next");
		op.add(Builder::operationsBehind, JsonpDeserializer.longDeserializer(), "operations_behind");

	}

}
