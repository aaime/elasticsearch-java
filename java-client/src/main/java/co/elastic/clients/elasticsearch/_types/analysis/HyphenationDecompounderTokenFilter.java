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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;

// typedef: _types.analysis.HyphenationDecompounderTokenFilter
@JsonpDeserializable
public class HyphenationDecompounderTokenFilter extends CompoundWordTokenFilterBase
		implements
			TokenFilterDefinitionVariant {
	// ---------------------------------------------------------------------------------------------

	private HyphenationDecompounderTokenFilter(Builder builder) {
		super(builder);

	}

	public static HyphenationDecompounderTokenFilter of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.HyphenationDecompounder;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "hyphenation_decompounder");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HyphenationDecompounderTokenFilter}.
	 */
	public static class Builder extends CompoundWordTokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HyphenationDecompounderTokenFilter> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HyphenationDecompounderTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HyphenationDecompounderTokenFilter build() {
			_checkSingleUse();

			return new HyphenationDecompounderTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HyphenationDecompounderTokenFilter}
	 */
	public static final JsonpDeserializer<HyphenationDecompounderTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					HyphenationDecompounderTokenFilter::setupHyphenationDecompounderTokenFilterDeserializer);

	protected static void setupHyphenationDecompounderTokenFilterDeserializer(
			ObjectDeserializer<HyphenationDecompounderTokenFilter.Builder> op) {
		CompoundWordTokenFilterBase.setupCompoundWordTokenFilterBaseDeserializer(op);

		op.ignore("type");
	}

}
