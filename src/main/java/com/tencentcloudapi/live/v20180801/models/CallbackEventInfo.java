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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackEventInfo extends AbstractModel{

    /**
    * 事件时间
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 回调请求
    */
    @SerializedName("Request")
    @Expose
    private String Request;

    /**
    * 回调响应
    */
    @SerializedName("Response")
    @Expose
    private String Response;

    /**
    * 客户接口响应时间
    */
    @SerializedName("ResponseTime")
    @Expose
    private String ResponseTime;

    /**
    * 回调结果
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * 流名称
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
     * Get 事件时间 
     * @return EventTime 事件时间
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件时间
     * @param EventTime 事件时间
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 回调请求 
     * @return Request 回调请求
     */
    public String getRequest() {
        return this.Request;
    }

    /**
     * Set 回调请求
     * @param Request 回调请求
     */
    public void setRequest(String Request) {
        this.Request = Request;
    }

    /**
     * Get 回调响应 
     * @return Response 回调响应
     */
    public String getResponse() {
        return this.Response;
    }

    /**
     * Set 回调响应
     * @param Response 回调响应
     */
    public void setResponse(String Response) {
        this.Response = Response;
    }

    /**
     * Get 客户接口响应时间 
     * @return ResponseTime 客户接口响应时间
     */
    public String getResponseTime() {
        return this.ResponseTime;
    }

    /**
     * Set 客户接口响应时间
     * @param ResponseTime 客户接口响应时间
     */
    public void setResponseTime(String ResponseTime) {
        this.ResponseTime = ResponseTime;
    }

    /**
     * Get 回调结果 
     * @return ResultCode 回调结果
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 回调结果
     * @param ResultCode 回调结果
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 流名称 
     * @return StreamId 流名称
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 流名称
     * @param StreamId 流名称
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    public CallbackEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallbackEventInfo(CallbackEventInfo source) {
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.Request != null) {
            this.Request = new String(source.Request);
        }
        if (source.Response != null) {
            this.Response = new String(source.Response);
        }
        if (source.ResponseTime != null) {
            this.ResponseTime = new String(source.ResponseTime);
        }
        if (source.ResultCode != null) {
            this.ResultCode = new Long(source.ResultCode);
        }
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "Response", this.Response);
        this.setParamSimple(map, prefix + "ResponseTime", this.ResponseTime);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);

    }
}

