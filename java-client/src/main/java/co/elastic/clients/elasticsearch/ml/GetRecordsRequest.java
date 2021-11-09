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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_records.Request
@JsonpDeserializable
public class GetRecordsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean desc;

	@Nullable
	private final String end;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Integer from;

	private final String jobId;

	@Nullable
	private final Page page;

	@Nullable
	private final Double recordScore;

	@Nullable
	private final Integer size;

	@Nullable
	private final String sort;

	@Nullable
	private final String start;

	// ---------------------------------------------------------------------------------------------

	private GetRecordsRequest(Builder builder) {

		this.desc = builder.desc;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.from = builder.from;
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.page = builder.page;
		this.recordScore = builder.recordScore;
		this.size = builder.size;
		this.sort = builder.sort;
		this.start = builder.start;

	}

	public static GetRecordsRequest of(Function<Builder, ObjectBuilder<GetRecordsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If true, the results are sorted in descending order.
	 * <p>
	 * API name: {@code desc}
	 */
	@Nullable
	public final Boolean desc() {
		return this.desc;
	}

	/**
	 * Returns records with timestamps earlier than this time. The default value
	 * means results are not limited to specific timestamps.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final String end() {
		return this.end;
	}

	/**
	 * If true, the output excludes interim results.
	 * <p>
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public final Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * Skips the specified number of records.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code page}
	 */
	@Nullable
	public final Page page() {
		return this.page;
	}

	/**
	 * Returns records with anomaly scores greater or equal than this value.
	 * <p>
	 * API name: {@code record_score}
	 */
	@Nullable
	public final Double recordScore() {
		return this.recordScore;
	}

	/**
	 * Specifies the maximum number of records to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Specifies the sort field for the requested records.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final String sort() {
		return this.sort;
	}

	/**
	 * Returns records with timestamps earlier than this time. The default value
	 * means results are not limited to specific timestamps.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final String start() {
		return this.start;
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

		if (this.desc != null) {
			generator.writeKey("desc");
			generator.write(this.desc);

		}
		if (this.end != null) {
			generator.writeKey("end");
			generator.write(this.end);

		}
		if (this.excludeInterim != null) {
			generator.writeKey("exclude_interim");
			generator.write(this.excludeInterim);

		}
		if (this.page != null) {
			generator.writeKey("page");
			this.page.serialize(generator, mapper);

		}
		if (this.recordScore != null) {
			generator.writeKey("record_score");
			generator.write(this.recordScore);

		}
		if (this.sort != null) {
			generator.writeKey("sort");
			generator.write(this.sort);

		}
		if (this.start != null) {
			generator.writeKey("start");
			generator.write(this.start);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRecordsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetRecordsRequest> {
		@Nullable
		private Boolean desc;

		@Nullable
		private String end;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Integer from;

		private String jobId;

		@Nullable
		private Page page;

		@Nullable
		private Double recordScore;

		@Nullable
		private Integer size;

		@Nullable
		private String sort;

		@Nullable
		private String start;

		/**
		 * If true, the results are sorted in descending order.
		 * <p>
		 * API name: {@code desc}
		 */
		public final Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * Returns records with timestamps earlier than this time. The default value
		 * means results are not limited to specific timestamps.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * If true, the output excludes interim results.
		 * <p>
		 * API name: {@code exclude_interim}
		 */
		public final Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * Skips the specified number of records.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public final Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public final Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * Returns records with anomaly scores greater or equal than this value.
		 * <p>
		 * API name: {@code record_score}
		 */
		public final Builder recordScore(@Nullable Double value) {
			this.recordScore = value;
			return this;
		}

		/**
		 * Specifies the maximum number of records to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Specifies the sort field for the requested records.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * Returns records with timestamps earlier than this time. The default value
		 * means results are not limited to specific timestamps.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * Builds a {@link GetRecordsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecordsRequest build() {
			_checkSingleUse();

			return new GetRecordsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRecordsRequest}
	 */
	public static final JsonpDeserializer<GetRecordsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRecordsRequest::setupGetRecordsRequestDeserializer);

	protected static void setupGetRecordsRequestDeserializer(ObjectDeserializer<GetRecordsRequest.Builder> op) {

		op.add(Builder::desc, JsonpDeserializer.booleanDeserializer(), "desc");
		op.add(Builder::end, JsonpDeserializer.stringDeserializer(), "end");
		op.add(Builder::excludeInterim, JsonpDeserializer.booleanDeserializer(), "exclude_interim");
		op.add(Builder::page, Page._DESERIALIZER, "page");
		op.add(Builder::recordScore, JsonpDeserializer.doubleDeserializer(), "record_score");
		op.add(Builder::sort, JsonpDeserializer.stringDeserializer(), "sort");
		op.add(Builder::start, JsonpDeserializer.stringDeserializer(), "start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_records}".
	 */
	public static final Endpoint<GetRecordsRequest, GetRecordsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/results");
					buf.append("/records");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetRecordsResponse._DESERIALIZER);
}
