/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConcurrencyLimitDetail extends AbstractModel {

    /**
    * <p>调用来源（subject_type 决定 subject_id/subject_name 的含义，如 APP 时 subject_id=app_id、subject_name=app_name）</p>
    */
    @SerializedName("CallSource")
    @Expose
    private CallSource CallSource;

    /**
    * <p>超限发生时间（Unix秒）</p>
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>请求内容（用户请求的原始查询文本）</p>
    */
    @SerializedName("RequestQuery")
    @Expose
    private String RequestQuery;

    /**
    * <p>空间 ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get <p>调用来源（subject_type 决定 subject_id/subject_name 的含义，如 APP 时 subject_id=app_id、subject_name=app_name）</p> 
     * @return CallSource <p>调用来源（subject_type 决定 subject_id/subject_name 的含义，如 APP 时 subject_id=app_id、subject_name=app_name）</p>
     */
    public CallSource getCallSource() {
        return this.CallSource;
    }

    /**
     * Set <p>调用来源（subject_type 决定 subject_id/subject_name 的含义，如 APP 时 subject_id=app_id、subject_name=app_name）</p>
     * @param CallSource <p>调用来源（subject_type 决定 subject_id/subject_name 的含义，如 APP 时 subject_id=app_id、subject_name=app_name）</p>
     */
    public void setCallSource(CallSource CallSource) {
        this.CallSource = CallSource;
    }

    /**
     * Get <p>超限发生时间（Unix秒）</p> 
     * @return EventTime <p>超限发生时间（Unix秒）</p>
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>超限发生时间（Unix秒）</p>
     * @param EventTime <p>超限发生时间（Unix秒）</p>
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>请求内容（用户请求的原始查询文本）</p> 
     * @return RequestQuery <p>请求内容（用户请求的原始查询文本）</p>
     */
    public String getRequestQuery() {
        return this.RequestQuery;
    }

    /**
     * Set <p>请求内容（用户请求的原始查询文本）</p>
     * @param RequestQuery <p>请求内容（用户请求的原始查询文本）</p>
     */
    public void setRequestQuery(String RequestQuery) {
        this.RequestQuery = RequestQuery;
    }

    /**
     * Get <p>空间 ID</p> 
     * @return SpaceId <p>空间 ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间 ID</p>
     * @param SpaceId <p>空间 ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public ConcurrencyLimitDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConcurrencyLimitDetail(ConcurrencyLimitDetail source) {
        if (source.CallSource != null) {
            this.CallSource = new CallSource(source.CallSource);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.RequestQuery != null) {
            this.RequestQuery = new String(source.RequestQuery);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CallSource.", this.CallSource);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "RequestQuery", this.RequestQuery);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);

    }
}

