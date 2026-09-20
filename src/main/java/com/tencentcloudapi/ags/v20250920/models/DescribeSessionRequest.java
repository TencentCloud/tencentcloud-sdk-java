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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionRequest extends AbstractModel {

    /**
    * <p>会话所属空间 ID。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>用户 ID。可通过调用方业务系统接口获取。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>会话 ID。可通过 CreateSession 或 DescribeSessions 接口获取。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Agent ID。可选。</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>返回最近事件数量，默认为 0，最大值为 200。</p>
    */
    @SerializedName("NumRecentEvents")
    @Expose
    private Long NumRecentEvents;

    /**
    * <p>事件起始时间，RFC3339 格式，最大长度 64 字符。</p>
    */
    @SerializedName("AfterTimestamp")
    @Expose
    private String AfterTimestamp;

    /**
     * Get <p>会话所属空间 ID。</p> 
     * @return SpaceId <p>会话所属空间 ID。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>会话所属空间 ID。</p>
     * @param SpaceId <p>会话所属空间 ID。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>用户 ID。可通过调用方业务系统接口获取。</p> 
     * @return UserId <p>用户 ID。可通过调用方业务系统接口获取。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户 ID。可通过调用方业务系统接口获取。</p>
     * @param UserId <p>用户 ID。可通过调用方业务系统接口获取。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>会话 ID。可通过 CreateSession 或 DescribeSessions 接口获取。</p> 
     * @return SessionId <p>会话 ID。可通过 CreateSession 或 DescribeSessions 接口获取。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID。可通过 CreateSession 或 DescribeSessions 接口获取。</p>
     * @param SessionId <p>会话 ID。可通过 CreateSession 或 DescribeSessions 接口获取。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Agent ID。可选。</p> 
     * @return AgentId <p>Agent ID。可选。</p>
     * @deprecated
     */
    @Deprecated
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID。可选。</p>
     * @param AgentId <p>Agent ID。可选。</p>
     * @deprecated
     */
    @Deprecated
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>返回最近事件数量，默认为 0，最大值为 200。</p> 
     * @return NumRecentEvents <p>返回最近事件数量，默认为 0，最大值为 200。</p>
     */
    public Long getNumRecentEvents() {
        return this.NumRecentEvents;
    }

    /**
     * Set <p>返回最近事件数量，默认为 0，最大值为 200。</p>
     * @param NumRecentEvents <p>返回最近事件数量，默认为 0，最大值为 200。</p>
     */
    public void setNumRecentEvents(Long NumRecentEvents) {
        this.NumRecentEvents = NumRecentEvents;
    }

    /**
     * Get <p>事件起始时间，RFC3339 格式，最大长度 64 字符。</p> 
     * @return AfterTimestamp <p>事件起始时间，RFC3339 格式，最大长度 64 字符。</p>
     */
    public String getAfterTimestamp() {
        return this.AfterTimestamp;
    }

    /**
     * Set <p>事件起始时间，RFC3339 格式，最大长度 64 字符。</p>
     * @param AfterTimestamp <p>事件起始时间，RFC3339 格式，最大长度 64 字符。</p>
     */
    public void setAfterTimestamp(String AfterTimestamp) {
        this.AfterTimestamp = AfterTimestamp;
    }

    public DescribeSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionRequest(DescribeSessionRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.NumRecentEvents != null) {
            this.NumRecentEvents = new Long(source.NumRecentEvents);
        }
        if (source.AfterTimestamp != null) {
            this.AfterTimestamp = new String(source.AfterTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "NumRecentEvents", this.NumRecentEvents);
        this.setParamSimple(map, prefix + "AfterTimestamp", this.AfterTimestamp);

    }
}

