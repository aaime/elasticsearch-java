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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the snapshot namespace.
 */
public class ElasticsearchSnapshotAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchSnapshotAsyncClient> {

	public ElasticsearchSnapshotAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSnapshotAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSnapshotAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSnapshotAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: snapshot.cleanup_repository

	/**
	 * Removes stale data from repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CleanupRepositoryResponse> cleanupRepository(CleanupRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse>) CleanupRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes stale data from repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CleanupRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CleanupRepositoryResponse> cleanupRepository(
			Consumer<CleanupRepositoryRequest.Builder> fn) throws IOException, ElasticsearchException {
		CleanupRepositoryRequest.Builder builder = new CleanupRepositoryRequest.Builder();
		fn.accept(builder);
		return cleanupRepository(builder.build());
	}

	// ----- Endpoint: snapshot.clone

	/**
	 * Clones indices from one snapshot into another snapshot in the same
	 * repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CloneSnapshotResponse> clone(CloneSnapshotRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse>) CloneSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clones indices from one snapshot into another snapshot in the same
	 * repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloneSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CloneSnapshotResponse> clone(Consumer<CloneSnapshotRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CloneSnapshotRequest.Builder builder = new CloneSnapshotRequest.Builder();
		fn.accept(builder);
		return clone(builder.build());
	}

	// ----- Endpoint: snapshot.create

	/**
	 * Creates a snapshot in a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateSnapshotResponse> create(CreateSnapshotRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse>) CreateSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a snapshot in a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateSnapshotResponse> create(Consumer<CreateSnapshotRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CreateSnapshotRequest.Builder builder = new CreateSnapshotRequest.Builder();
		fn.accept(builder);
		return create(builder.build());
	}

	// ----- Endpoint: snapshot.create_repository

	/**
	 * Creates a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse>) CreateRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateRepositoryResponse> createRepository(
			Consumer<CreateRepositoryRequest.Builder> fn) throws IOException, ElasticsearchException {
		CreateRepositoryRequest.Builder builder = new CreateRepositoryRequest.Builder();
		fn.accept(builder);
		return createRepository(builder.build());
	}

	// ----- Endpoint: snapshot.delete

	/**
	 * Deletes one or more snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteSnapshotResponse> delete(DeleteSnapshotRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse>) DeleteSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes one or more snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteSnapshotResponse> delete(Consumer<DeleteSnapshotRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteSnapshotRequest.Builder builder = new DeleteSnapshotRequest.Builder();
		fn.accept(builder);
		return delete(builder.build());
	}

	// ----- Endpoint: snapshot.delete_repository

	/**
	 * Deletes a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse>) DeleteRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteRepositoryResponse> deleteRepository(
			Consumer<DeleteRepositoryRequest.Builder> fn) throws IOException, ElasticsearchException {
		DeleteRepositoryRequest.Builder builder = new DeleteRepositoryRequest.Builder();
		fn.accept(builder);
		return deleteRepository(builder.build());
	}

	// ----- Endpoint: snapshot.get

	/**
	 * Returns information about a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSnapshotResponse> get(GetSnapshotRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse>) GetSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSnapshotResponse> get(Consumer<GetSnapshotRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetSnapshotRequest.Builder builder = new GetSnapshotRequest.Builder();
		fn.accept(builder);
		return get(builder.build());
	}

	// ----- Endpoint: snapshot.get_repository

	/**
	 * Returns information about a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse>) GetRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRepositoryResponse> getRepository(Consumer<GetRepositoryRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetRepositoryRequest.Builder builder = new GetRepositoryRequest.Builder();
		fn.accept(builder);
		return getRepository(builder.build());
	}

	/**
	 * Returns information about a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRepositoryResponse> getRepository() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetRepositoryRequest.Builder().build(),
				GetRepositoryRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: snapshot.restore

	/**
	 * Restores a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RestoreResponse> restore(RestoreRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse> endpoint = (JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse>) RestoreRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Restores a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RestoreRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RestoreResponse> restore(Consumer<RestoreRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		RestoreRequest.Builder builder = new RestoreRequest.Builder();
		fn.accept(builder);
		return restore(builder.build());
	}

	// ----- Endpoint: snapshot.status

	/**
	 * Returns information about the status of a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotStatusResponse> status(SnapshotStatusRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse>) SnapshotStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the status of a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SnapshotStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SnapshotStatusResponse> status(Consumer<SnapshotStatusRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		SnapshotStatusRequest.Builder builder = new SnapshotStatusRequest.Builder();
		fn.accept(builder);
		return status(builder.build());
	}

	/**
	 * Returns information about the status of a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotStatusResponse> status() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new SnapshotStatusRequest.Builder().build(),
				SnapshotStatusRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: snapshot.verify_repository

	/**
	 * Verifies a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<VerifyRepositoryResponse> verifyRepository(VerifyRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse>) VerifyRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Verifies a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link VerifyRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<VerifyRepositoryResponse> verifyRepository(
			Consumer<VerifyRepositoryRequest.Builder> fn) throws IOException, ElasticsearchException {
		VerifyRepositoryRequest.Builder builder = new VerifyRepositoryRequest.Builder();
		fn.accept(builder);
		return verifyRepository(builder.build());
	}

}
