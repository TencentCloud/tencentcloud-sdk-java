/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpanReference extends AbstractModel {

    /**
    * 关联关系类型
    */
    @SerializedName("RefType")
    @Expose
    private String RefType;

    /**
    * Span ID
    */
    @SerializedName("SpanID")
    @Expose
    private String SpanID;

    /**
    * Trace ID
    */
    @SerializedName("TraceID")
    @Expose
    private String TraceID;

    /**
     * Get 关联关系类型 
     * @return RefType 关联关系类型
     */
    public String getRefType() {
        return this.RefType;
    }

    /**
     * Set 关联关系类型
     * @param RefType 关联关系类型
     */
    public void setRefType(String RefType) {
        this.RefType = RefType;
    }

    /**
     * Get Span ID 
     * @return SpanID Span ID
     */
    public String getSpanID() {
        return this.SpanID;
    }

    /**
     * Set Span ID
     * @param SpanID Span ID
     */
    public void setSpanID(String SpanID) {
        this.SpanID = SpanID;
    }

    /**
     * Get Trace ID 
     * @return TraceID Trace ID
     */
    public String getTraceID() {
        return this.TraceID;
    }

    /**
     * Set Trace ID
     * @param TraceID Trace ID
     */
    public void setTraceID(String TraceID) {
        this.TraceID = TraceID;
    }

    public SpanReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpanReference(SpanReference source) {
        if (source.RefType != null) {
            this.RefType = new String(source.RefType);
        }
        if (source.SpanID != null) {
            this.SpanID = new String(source.SpanID);
        }
        if (source.TraceID != null) {
            this.TraceID = new String(source.TraceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RefType", this.RefType);
        this.setParamSimple(map, prefix + "SpanID", this.SpanID);
        this.setParamSimple(map, prefix + "TraceID", this.TraceID);

    }
}

