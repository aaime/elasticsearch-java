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

package co.elastic.clients.elasticsearch.ccr;

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
 * Client for the ccr namespace.
 */
public class ElasticsearchCcrAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchCcrAsyncClient> {

	public ElasticsearchCcrAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchCcrAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchCcrAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchCcrAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ccr.delete_auto_follow_pattern

	/**
	 * Deletes auto-follow patterns.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-delete-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAutoFollowPatternResponse> deleteAutoFollowPattern(
			DeleteAutoFollowPatternRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAutoFollowPatternRequest, DeleteAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAutoFollowPatternRequest, DeleteAutoFollowPatternResponse, ErrorResponse>) DeleteAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes auto-follow patterns.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-delete-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAutoFollowPatternResponse> deleteAutoFollowPattern(
			Consumer<DeleteAutoFollowPatternRequest.Builder> fn) throws IOException, ElasticsearchException {
		DeleteAutoFollowPatternRequest.Builder builder = new DeleteAutoFollowPatternRequest.Builder();
		fn.accept(builder);
		return deleteAutoFollowPattern(builder.build());
	}

	// ----- Endpoint: ccr.follow

	/**
	 * Creates a new follower index configured to follow the referenced leader
	 * index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FollowResponse> follow(FollowRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FollowRequest, FollowResponse, ErrorResponse> endpoint = (JsonEndpoint<FollowRequest, FollowResponse, ErrorResponse>) FollowRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new follower index configured to follow the referenced leader
	 * index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FollowResponse> follow(Consumer<FollowRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		FollowRequest.Builder builder = new FollowRequest.Builder();
		fn.accept(builder);
		return follow(builder.build());
	}

	// ----- Endpoint: ccr.follow_info

	/**
	 * Retrieves information about all follower indices, including parameters and
	 * status for each follower index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FollowInfoResponse> followInfo(FollowInfoRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FollowInfoRequest, FollowInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<FollowInfoRequest, FollowInfoResponse, ErrorResponse>) FollowInfoRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves information about all follower indices, including parameters and
	 * status for each follower index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FollowInfoResponse> followInfo(Consumer<FollowInfoRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		FollowInfoRequest.Builder builder = new FollowInfoRequest.Builder();
		fn.accept(builder);
		return followInfo(builder.build());
	}

	// ----- Endpoint: ccr.follow_stats

	/**
	 * Retrieves follower stats. return shard-level stats about the following tasks
	 * associated with each shard for the specified indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FollowStatsResponse> followStats(FollowStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FollowStatsRequest, FollowStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<FollowStatsRequest, FollowStatsResponse, ErrorResponse>) FollowStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves follower stats. return shard-level stats about the following tasks
	 * associated with each shard for the specified indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FollowStatsResponse> followStats(Consumer<FollowStatsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		FollowStatsRequest.Builder builder = new FollowStatsRequest.Builder();
		fn.accept(builder);
		return followStats(builder.build());
	}

	// ----- Endpoint: ccr.forget_follower

	/**
	 * Removes the follower retention leases from the leader.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-forget-follower.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ForgetFollowerResponse> forgetFollower(ForgetFollowerRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ForgetFollowerRequest, ForgetFollowerResponse, ErrorResponse> endpoint = (JsonEndpoint<ForgetFollowerRequest, ForgetFollowerResponse, ErrorResponse>) ForgetFollowerRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes the follower retention leases from the leader.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ForgetFollowerRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-forget-follower.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ForgetFollowerResponse> forgetFollower(Consumer<ForgetFollowerRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ForgetFollowerRequest.Builder builder = new ForgetFollowerRequest.Builder();
		fn.accept(builder);
		return forgetFollower(builder.build());
	}

	// ----- Endpoint: ccr.get_auto_follow_pattern

	/**
	 * Gets configured auto-follow patterns. Returns the specified auto-follow
	 * pattern collection.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAutoFollowPatternResponse> getAutoFollowPattern(GetAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAutoFollowPatternRequest, GetAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAutoFollowPatternRequest, GetAutoFollowPatternResponse, ErrorResponse>) GetAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configured auto-follow patterns. Returns the specified auto-follow
	 * pattern collection.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetAutoFollowPatternResponse> getAutoFollowPattern(
			Consumer<GetAutoFollowPatternRequest.Builder> fn) throws IOException, ElasticsearchException {
		GetAutoFollowPatternRequest.Builder builder = new GetAutoFollowPatternRequest.Builder();
		fn.accept(builder);
		return getAutoFollowPattern(builder.build());
	}

	/**
	 * Gets configured auto-follow patterns. Returns the specified auto-follow
	 * pattern collection.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAutoFollowPatternResponse> getAutoFollowPattern()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetAutoFollowPatternRequest.Builder().build(),
				GetAutoFollowPatternRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ccr.pause_auto_follow_pattern

	/**
	 * Pauses an auto-follow pattern
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-pause-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PauseAutoFollowPatternResponse> pauseAutoFollowPattern(
			PauseAutoFollowPatternRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PauseAutoFollowPatternRequest, PauseAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<PauseAutoFollowPatternRequest, PauseAutoFollowPatternResponse, ErrorResponse>) PauseAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Pauses an auto-follow pattern
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PauseAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-pause-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PauseAutoFollowPatternResponse> pauseAutoFollowPattern(
			Consumer<PauseAutoFollowPatternRequest.Builder> fn) throws IOException, ElasticsearchException {
		PauseAutoFollowPatternRequest.Builder builder = new PauseAutoFollowPatternRequest.Builder();
		fn.accept(builder);
		return pauseAutoFollowPattern(builder.build());
	}

	// ----- Endpoint: ccr.pause_follow

	/**
	 * Pauses a follower index. The follower index will not fetch any additional
	 * operations from the leader index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-pause-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PauseFollowResponse> pauseFollow(PauseFollowRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PauseFollowRequest, PauseFollowResponse, ErrorResponse> endpoint = (JsonEndpoint<PauseFollowRequest, PauseFollowResponse, ErrorResponse>) PauseFollowRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Pauses a follower index. The follower index will not fetch any additional
	 * operations from the leader index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PauseFollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-pause-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PauseFollowResponse> pauseFollow(Consumer<PauseFollowRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PauseFollowRequest.Builder builder = new PauseFollowRequest.Builder();
		fn.accept(builder);
		return pauseFollow(builder.build());
	}

	// ----- Endpoint: ccr.put_auto_follow_pattern

	/**
	 * Creates a new named collection of auto-follow patterns against a specified
	 * remote cluster. Newly created indices on the remote cluster matching any of
	 * the specified patterns will be automatically configured as follower indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutAutoFollowPatternResponse> putAutoFollowPattern(PutAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAutoFollowPatternRequest, PutAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAutoFollowPatternRequest, PutAutoFollowPatternResponse, ErrorResponse>) PutAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new named collection of auto-follow patterns against a specified
	 * remote cluster. Newly created indices on the remote cluster matching any of
	 * the specified patterns will be automatically configured as follower indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutAutoFollowPatternResponse> putAutoFollowPattern(
			Consumer<PutAutoFollowPatternRequest.Builder> fn) throws IOException, ElasticsearchException {
		PutAutoFollowPatternRequest.Builder builder = new PutAutoFollowPatternRequest.Builder();
		fn.accept(builder);
		return putAutoFollowPattern(builder.build());
	}

	// ----- Endpoint: ccr.resume_auto_follow_pattern

	/**
	 * Resumes an auto-follow pattern that has been paused
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-resume-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ResumeAutoFollowPatternResponse> resumeAutoFollowPattern(
			ResumeAutoFollowPatternRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResumeAutoFollowPatternRequest, ResumeAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<ResumeAutoFollowPatternRequest, ResumeAutoFollowPatternResponse, ErrorResponse>) ResumeAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Resumes an auto-follow pattern that has been paused
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResumeAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-resume-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResumeAutoFollowPatternResponse> resumeAutoFollowPattern(
			Consumer<ResumeAutoFollowPatternRequest.Builder> fn) throws IOException, ElasticsearchException {
		ResumeAutoFollowPatternRequest.Builder builder = new ResumeAutoFollowPatternRequest.Builder();
		fn.accept(builder);
		return resumeAutoFollowPattern(builder.build());
	}

	// ----- Endpoint: ccr.resume_follow

	/**
	 * Resumes a follower index that has been paused
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-resume-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ResumeFollowResponse> resumeFollow(ResumeFollowRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResumeFollowRequest, ResumeFollowResponse, ErrorResponse> endpoint = (JsonEndpoint<ResumeFollowRequest, ResumeFollowResponse, ErrorResponse>) ResumeFollowRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Resumes a follower index that has been paused
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResumeFollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-resume-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResumeFollowResponse> resumeFollow(Consumer<ResumeFollowRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ResumeFollowRequest.Builder builder = new ResumeFollowRequest.Builder();
		fn.accept(builder);
		return resumeFollow(builder.build());
	}

	// ----- Endpoint: ccr.stats

	/**
	 * Gets all stats related to cross-cluster replication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<CcrStatsResponse> stats() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(CcrStatsRequest._INSTANCE, CcrStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ccr.unfollow

	/**
	 * Stops the following task associated with a follower index and removes index
	 * metadata and settings associated with cross-cluster replication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-unfollow.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UnfollowResponse> unfollow(UnfollowRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UnfollowRequest, UnfollowResponse, ErrorResponse> endpoint = (JsonEndpoint<UnfollowRequest, UnfollowResponse, ErrorResponse>) UnfollowRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Stops the following task associated with a follower index and removes index
	 * metadata and settings associated with cross-cluster replication.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UnfollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-unfollow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UnfollowResponse> unfollow(Consumer<UnfollowRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		UnfollowRequest.Builder builder = new UnfollowRequest.Builder();
		fn.accept(builder);
		return unfollow(builder.build());
	}

}
