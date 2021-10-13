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

package co.elastic.clients.base;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapperBase;

public abstract class ApiClient {

    protected final Transport transport;

    protected ApiClient(Transport transport) {
        this.transport = transport;
    }

    protected <T> JsonpDeserializer<T> getDeserializer(Class<T> clazz) {
        // Try the built-in deserializers first to avoid repeated lookups in the Jsonp mapper for client-defined classes
        JsonpDeserializer<T> result = JsonpMapperBase.findDeserializer(clazz);
        if (result != null) {
            return result;
        }

        return JsonpDeserializer.of(clazz);
    }

    public Transport _transport() {
        return this.transport;
    }
}
