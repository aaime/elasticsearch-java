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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.analysis.SnowballTokenFilter
@JsonpDeserializable
public class SnowballTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final SnowballLanguage language;

	// ---------------------------------------------------------------------------------------------

	private SnowballTokenFilter(Builder builder) {
		super(builder);

		this.language = ModelTypeHelper.requireNonNull(builder.language, this, "language");

	}

	public static SnowballTokenFilter of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Snowball;
	}

	/**
	 * Required - API name: {@code language}
	 */
	public final SnowballLanguage language() {
		return this.language;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "snowball");
		super.serializeInternal(generator, mapper);
		generator.writeKey("language");
		this.language.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnowballTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SnowballTokenFilter> {
		private SnowballLanguage language;

		/**
		 * Required - API name: {@code language}
		 */
		public final Builder language(SnowballLanguage value) {
			this.language = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnowballTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnowballTokenFilter build() {
			_checkSingleUse();

			return new SnowballTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnowballTokenFilter}
	 */
	public static final JsonpDeserializer<SnowballTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnowballTokenFilter::setupSnowballTokenFilterDeserializer);

	protected static void setupSnowballTokenFilterDeserializer(ObjectDeserializer<SnowballTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::language, SnowballLanguage._DESERIALIZER, "language");

		op.ignore("type");
	}

}
