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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.elasticsearch.ml.Job;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Jobs
@JsonpDeserializable
public class Jobs implements JsonpSerializable {
	private final Map<String, Job> jobs;

	@Nullable
	private final AllJobs all;

	// ---------------------------------------------------------------------------------------------

	private Jobs(Builder builder) {

		this.jobs = ModelTypeHelper.unmodifiable(builder.jobs);

		this.all = builder.all;

	}

	public static Jobs of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Detailed job data
	 */
	public final Map<String, Job> jobs() {
		return this.jobs;
	}

	/**
	 * API name: {@code _all}
	 */
	@Nullable
	public final AllJobs all() {
		return this.all;
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

		for (Map.Entry<String, Job> item0 : this.jobs.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		if (this.all != null) {
			generator.writeKey("_all");
			this.all.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Jobs}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Jobs> {
		@Nullable
		private Map<String, Job> jobs = new HashMap<>();

		/**
		 * Detailed job data
		 */
		public final Builder jobs(@Nullable Map<String, Job> value) {
			this.jobs = value;
			return this;
		}

		public final Builder jobs(Function<MapBuilder<String, Job, Job.Builder>, ObjectBuilder<Map<String, Job>>> fn) {
			return jobs(fn.apply(new MapBuilder<>(Job.Builder::new)).build());
		}

		@Nullable
		private AllJobs all;

		/**
		 * API name: {@code _all}
		 */
		public final Builder all(@Nullable AllJobs value) {
			this.all = value;
			return this;
		}

		/**
		 * API name: {@code _all}
		 */
		public final Builder all(Consumer<AllJobs.Builder> fn) {
			AllJobs.Builder builder = new AllJobs.Builder();
			fn.accept(builder);
			return this.all(builder.build());
		}

		/**
		 * Builds a {@link Jobs}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Jobs build() {
			_checkSingleUse();

			return new Jobs(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Jobs}
	 */
	public static final JsonpDeserializer<Jobs> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Jobs::setupJobsDeserializer);

	protected static void setupJobsDeserializer(ObjectDeserializer<Jobs.Builder> op) {

		op.add(Builder::all, AllJobs._DESERIALIZER, "_all");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			if (builder.jobs == null) {
				builder.jobs = new HashMap<>();
			}
			builder.jobs.put(name, Job._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
