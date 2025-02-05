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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.mapping.DynamicMapping;
import co.elastic.clients.elasticsearch._types.mapping.DynamicTemplate;
import co.elastic.clients.elasticsearch._types.mapping.FieldNamesField;
import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch._types.mapping.RoutingField;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.mapping.SourceField;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.put_mapping.Request
@JsonpDeserializable
public class PutMappingRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final FieldNamesField fieldNames;

	private final Map<String, JsonData> meta;

	@Nullable
	private final RoutingField routing;

	@Nullable
	private final SourceField source;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean dateDetection;

	@Nullable
	private final DynamicMapping dynamic;

	private final List<String> dynamicDateFormats;

	private final List<Map<String, DynamicTemplate>> dynamicTemplates;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeTypeName;

	private final List<String> index;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Boolean numericDetection;

	private final Map<String, Property> properties;

	private final Map<String, RuntimeField> runtime;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Boolean writeIndexOnly;

	// ---------------------------------------------------------------------------------------------

	private PutMappingRequest(Builder builder) {

		this.fieldNames = builder.fieldNames;
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.routing = builder.routing;
		this.source = builder.source;
		this.allowNoIndices = builder.allowNoIndices;
		this.dateDetection = builder.dateDetection;
		this.dynamic = builder.dynamic;
		this.dynamicDateFormats = ModelTypeHelper.unmodifiable(builder.dynamicDateFormats);
		this.dynamicTemplates = ModelTypeHelper.unmodifiable(builder.dynamicTemplates);
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeTypeName = builder.includeTypeName;
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.masterTimeout = builder.masterTimeout;
		this.numericDetection = builder.numericDetection;
		this.properties = ModelTypeHelper.unmodifiable(builder.properties);
		this.runtime = ModelTypeHelper.unmodifiable(builder.runtime);
		this.timeout = builder.timeout;
		this.writeIndexOnly = builder.writeIndexOnly;

	}

	public static PutMappingRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Control whether field names are enabled for the index.
	 * <p>
	 * API name: {@code _field_names}
	 */
	@Nullable
	public final FieldNamesField fieldNames() {
		return this.fieldNames;
	}

	/**
	 * A mapping type can have custom meta data associated with it. These are not
	 * used at all by Elasticsearch, but can be used to store application-specific
	 * metadata.
	 * <p>
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Enable making a routing value required on indexed documents.
	 * <p>
	 * API name: {@code _routing}
	 */
	@Nullable
	public final RoutingField routing() {
		return this.routing;
	}

	/**
	 * Control whether the _source field is enabled on the index.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceField source() {
		return this.source;
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Controls whether dynamic date detection is enabled.
	 * <p>
	 * API name: {@code date_detection}
	 */
	@Nullable
	public final Boolean dateDetection() {
		return this.dateDetection;
	}

	/**
	 * Controls whether new fields are added dynamically.
	 * <p>
	 * API name: {@code dynamic}
	 */
	@Nullable
	public final DynamicMapping dynamic() {
		return this.dynamic;
	}

	/**
	 * If date detection is enabled then new string fields are checked against
	 * 'dynamic_date_formats' and if the value matches then a new date field is
	 * added instead of string.
	 * <p>
	 * API name: {@code dynamic_date_formats}
	 */
	public final List<String> dynamicDateFormats() {
		return this.dynamicDateFormats;
	}

	/**
	 * Specify dynamic templates for the mapping.
	 * <p>
	 * API name: {@code dynamic_templates}
	 */
	public final List<Map<String, DynamicTemplate>> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public final Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * Required - A comma-separated list of index names the mapping should be added
	 * to (supports wildcards); use <code>_all</code> or omit to add the mapping on
	 * all indices.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Automatically map strings into numeric data types for all fields.
	 * <p>
	 * API name: {@code numeric_detection}
	 */
	@Nullable
	public final Boolean numericDetection() {
		return this.numericDetection;
	}

	/**
	 * Mapping for a field. For new fields, this mapping can include:
	 * <ul>
	 * <li>Field name</li>
	 * <li>Field data type</li>
	 * <li>Mapping parameters</li>
	 * </ul>
	 * <p>
	 * API name: {@code properties}
	 */
	public final Map<String, Property> properties() {
		return this.properties;
	}

	/**
	 * Mapping of runtime fields for the index.
	 * <p>
	 * API name: {@code runtime}
	 */
	public final Map<String, RuntimeField> runtime() {
		return this.runtime;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * When true, applies mappings only to the write index of an alias or data
	 * stream
	 * <p>
	 * API name: {@code write_index_only}
	 */
	@Nullable
	public final Boolean writeIndexOnly() {
		return this.writeIndexOnly;
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

		if (this.fieldNames != null) {
			generator.writeKey("_field_names");
			this.fieldNames.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.routing != null) {
			generator.writeKey("_routing");
			this.routing.serialize(generator, mapper);

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (this.dateDetection != null) {
			generator.writeKey("date_detection");
			generator.write(this.dateDetection);

		}
		if (this.dynamic != null) {
			generator.writeKey("dynamic");
			this.dynamic.serialize(generator, mapper);
		}
		if (ModelTypeHelper.isDefined(this.dynamicDateFormats)) {
			generator.writeKey("dynamic_date_formats");
			generator.writeStartArray();
			for (String item0 : this.dynamicDateFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.dynamicTemplates)) {
			generator.writeKey("dynamic_templates");
			generator.writeStartArray();
			for (Map<String, DynamicTemplate> item0 : this.dynamicTemplates) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, DynamicTemplate> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.numericDetection != null) {
			generator.writeKey("numeric_detection");
			generator.write(this.numericDetection);

		}
		if (ModelTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.runtime)) {
			generator.writeKey("runtime");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtime.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutMappingRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutMappingRequest> {
		@Nullable
		private FieldNamesField fieldNames;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private RoutingField routing;

		@Nullable
		private SourceField source;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean dateDetection;

		@Nullable
		private DynamicMapping dynamic;

		@Nullable
		private List<String> dynamicDateFormats;

		@Nullable
		private List<Map<String, DynamicTemplate>> dynamicTemplates;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeTypeName;

		private List<String> index;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Boolean numericDetection;

		@Nullable
		private Map<String, Property> properties;

		@Nullable
		private Map<String, RuntimeField> runtime;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean writeIndexOnly;

		/**
		 * Control whether field names are enabled for the index.
		 * <p>
		 * API name: {@code _field_names}
		 */
		public final Builder fieldNames(@Nullable FieldNamesField value) {
			this.fieldNames = value;
			return this;
		}

		/**
		 * Control whether field names are enabled for the index.
		 * <p>
		 * API name: {@code _field_names}
		 */
		public final Builder fieldNames(Consumer<FieldNamesField.Builder> fn) {
			FieldNamesField.Builder builder = new FieldNamesField.Builder();
			fn.accept(builder);
			return this.fieldNames(builder.build());
		}

		/**
		 * A mapping type can have custom meta data associated with it. These are not
		 * used at all by Elasticsearch, but can be used to store application-specific
		 * metadata.
		 * <p>
		 * API name: {@code _meta}
		 */
		public final Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Enable making a routing value required on indexed documents.
		 * <p>
		 * API name: {@code _routing}
		 */
		public final Builder routing(@Nullable RoutingField value) {
			this.routing = value;
			return this;
		}

		/**
		 * Enable making a routing value required on indexed documents.
		 * <p>
		 * API name: {@code _routing}
		 */
		public final Builder routing(Consumer<RoutingField.Builder> fn) {
			RoutingField.Builder builder = new RoutingField.Builder();
			fn.accept(builder);
			return this.routing(builder.build());
		}

		/**
		 * Control whether the _source field is enabled on the index.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceField value) {
			this.source = value;
			return this;
		}

		/**
		 * Control whether the _source field is enabled on the index.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(Consumer<SourceField.Builder> fn) {
			SourceField.Builder builder = new SourceField.Builder();
			fn.accept(builder);
			return this.source(builder.build());
		}

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Controls whether dynamic date detection is enabled.
		 * <p>
		 * API name: {@code date_detection}
		 */
		public final Builder dateDetection(@Nullable Boolean value) {
			this.dateDetection = value;
			return this;
		}

		/**
		 * Controls whether new fields are added dynamically.
		 * <p>
		 * API name: {@code dynamic}
		 */
		public final Builder dynamic(@Nullable DynamicMapping value) {
			this.dynamic = value;
			return this;
		}

		/**
		 * If date detection is enabled then new string fields are checked against
		 * 'dynamic_date_formats' and if the value matches then a new date field is
		 * added instead of string.
		 * <p>
		 * API name: {@code dynamic_date_formats}
		 */
		public final Builder dynamicDateFormats(@Nullable List<String> value) {
			this.dynamicDateFormats = value;
			return this;
		}

		/**
		 * If date detection is enabled then new string fields are checked against
		 * 'dynamic_date_formats' and if the value matches then a new date field is
		 * added instead of string.
		 * <p>
		 * API name: {@code dynamic_date_formats}
		 */
		public final Builder dynamicDateFormats(String... value) {
			this.dynamicDateFormats = Arrays.asList(value);
			return this;
		}

		/**
		 * Specify dynamic templates for the mapping.
		 * <p>
		 * API name: {@code dynamic_templates}
		 */
		public final Builder dynamicTemplates(@Nullable List<Map<String, DynamicTemplate>> value) {
			this.dynamicTemplates = value;
			return this;
		}

		/**
		 * Specify dynamic templates for the mapping.
		 * <p>
		 * API name: {@code dynamic_templates}
		 */
		public final Builder dynamicTemplates(Map<String, DynamicTemplate>... value) {
			this.dynamicTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcard> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcard... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code include_type_name}
		 */
		public final Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names the mapping should be added
		 * to (supports wildcards); use <code>_all</code> or omit to add the mapping on
		 * all indices.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names the mapping should be added
		 * to (supports wildcards); use <code>_all</code> or omit to add the mapping on
		 * all indices.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.masterTimeout(builder.build());
		}

		/**
		 * Automatically map strings into numeric data types for all fields.
		 * <p>
		 * API name: {@code numeric_detection}
		 */
		public final Builder numericDetection(@Nullable Boolean value) {
			this.numericDetection = value;
			return this;
		}

		/**
		 * Mapping for a field. For new fields, this mapping can include:
		 * <ul>
		 * <li>Field name</li>
		 * <li>Field data type</li>
		 * <li>Mapping parameters</li>
		 * </ul>
		 * <p>
		 * API name: {@code properties}
		 */
		public final Builder properties(@Nullable Map<String, Property> value) {
			this.properties = value;
			return this;
		}

		public final Builder properties(
				Function<MapBuilder<String, Property, Property.Builder>, ObjectBuilder<Map<String, Property>>> fn) {
			return properties(fn.apply(new MapBuilder<>(Property.Builder::new)).build());
		}

		/**
		 * Mapping of runtime fields for the index.
		 * <p>
		 * API name: {@code runtime}
		 */
		public final Builder runtime(@Nullable Map<String, RuntimeField> value) {
			this.runtime = value;
			return this;
		}

		public final Builder runtime(
				Function<MapBuilder<String, RuntimeField, RuntimeField.Builder>, ObjectBuilder<Map<String, RuntimeField>>> fn) {
			return runtime(fn.apply(new MapBuilder<>(RuntimeField.Builder::new)).build());
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.timeout(builder.build());
		}

		/**
		 * When true, applies mappings only to the write index of an alias or data
		 * stream
		 * <p>
		 * API name: {@code write_index_only}
		 */
		public final Builder writeIndexOnly(@Nullable Boolean value) {
			this.writeIndexOnly = value;
			return this;
		}

		/**
		 * Builds a {@link PutMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutMappingRequest build() {
			_checkSingleUse();

			return new PutMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutMappingRequest}
	 */
	public static final JsonpDeserializer<PutMappingRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutMappingRequest::setupPutMappingRequestDeserializer);

	protected static void setupPutMappingRequestDeserializer(ObjectDeserializer<PutMappingRequest.Builder> op) {

		op.add(Builder::fieldNames, FieldNamesField._DESERIALIZER, "_field_names");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::routing, RoutingField._DESERIALIZER, "_routing");
		op.add(Builder::source, SourceField._DESERIALIZER, "_source");
		op.add(Builder::dateDetection, JsonpDeserializer.booleanDeserializer(), "date_detection");
		op.add(Builder::dynamic, DynamicMapping._DESERIALIZER, "dynamic");
		op.add(Builder::dynamicDateFormats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"dynamic_date_formats");
		op.add(Builder::dynamicTemplates, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(DynamicTemplate._DESERIALIZER)), "dynamic_templates");
		op.add(Builder::numericDetection, JsonpDeserializer.booleanDeserializer(), "numeric_detection");
		op.add(Builder::properties, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "properties");
		op.add(Builder::runtime, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER), "runtime");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_mapping}".
	 */
	public static final Endpoint<PutMappingRequest, PutMappingResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.put_mapping",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_mapping");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.includeTypeName != null) {
					params.put("include_type_name", String.valueOf(request.includeTypeName));
				}
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.writeIndexOnly != null) {
					params.put("write_index_only", String.valueOf(request.writeIndexOnly));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutMappingResponse._DESERIALIZER);
}
