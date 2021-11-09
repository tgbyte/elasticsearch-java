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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.RetentionPolicyContainer
@JsonpDeserializable
public class RetentionPolicy implements TaggedUnion<Object>, JsonpSerializable {

	public static final String TIME = "time";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public RetentionPolicy(RetentionPolicyVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private RetentionPolicy(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RetentionPolicy of(Function<Builder, ObjectBuilder<RetentionPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code time} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code time} kind.
	 */
	public TimeRetentionPolicy time() {
		return TaggedUnionUtils.get(this, TIME);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RetentionPolicy> {
		private String _type;
		private Object _value;

		public Builder time(TimeRetentionPolicy v) {
			this._type = TIME;
			this._value = v;
			return this;
		}

		public Builder time(Function<TimeRetentionPolicy.Builder, ObjectBuilder<TimeRetentionPolicy>> f) {
			return this.time(f.apply(new TimeRetentionPolicy.Builder()).build());
		}

		public RetentionPolicy build() {
			_checkSingleUse();
			return new RetentionPolicy(this);
		}

	}

	protected static void setupRetentionPolicyDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::time, TimeRetentionPolicy._DESERIALIZER, "time");

	}

	public static final JsonpDeserializer<RetentionPolicy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RetentionPolicy::setupRetentionPolicyDeserializer, Builder::build);
}
