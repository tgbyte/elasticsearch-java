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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TimingStats
@JsonpDeserializable
public class TimingStats implements JsonpSerializable {
	private final int elapsedTime;

	@Nullable
	private final Integer iterationTime;

	// ---------------------------------------------------------------------------------------------

	private TimingStats(Builder builder) {

		this.elapsedTime = ModelTypeHelper.requireNonNull(builder.elapsedTime, this, "elapsedTime");
		this.iterationTime = builder.iterationTime;

	}

	public static TimingStats of(Function<Builder, ObjectBuilder<TimingStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Runtime of the analysis in milliseconds.
	 * <p>
	 * API name: {@code elapsed_time}
	 */
	public final int elapsedTime() {
		return this.elapsedTime;
	}

	/**
	 * Runtime of the latest iteration of the analysis in milliseconds.
	 * <p>
	 * API name: {@code iteration_time}
	 */
	@Nullable
	public final Integer iterationTime() {
		return this.iterationTime;
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

		generator.writeKey("elapsed_time");
		generator.write(this.elapsedTime);

		if (this.iterationTime != null) {
			generator.writeKey("iteration_time");
			generator.write(this.iterationTime);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimingStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TimingStats> {
		private Integer elapsedTime;

		@Nullable
		private Integer iterationTime;

		/**
		 * Required - Runtime of the analysis in milliseconds.
		 * <p>
		 * API name: {@code elapsed_time}
		 */
		public final Builder elapsedTime(int value) {
			this.elapsedTime = value;
			return this;
		}

		/**
		 * Runtime of the latest iteration of the analysis in milliseconds.
		 * <p>
		 * API name: {@code iteration_time}
		 */
		public final Builder iterationTime(@Nullable Integer value) {
			this.iterationTime = value;
			return this;
		}

		/**
		 * Builds a {@link TimingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimingStats build() {
			_checkSingleUse();

			return new TimingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TimingStats}
	 */
	public static final JsonpDeserializer<TimingStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TimingStats::setupTimingStatsDeserializer);

	protected static void setupTimingStatsDeserializer(ObjectDeserializer<TimingStats.Builder> op) {

		op.add(Builder::elapsedTime, JsonpDeserializer.integerDeserializer(), "elapsed_time");
		op.add(Builder::iterationTime, JsonpDeserializer.integerDeserializer(), "iteration_time");

	}

}
