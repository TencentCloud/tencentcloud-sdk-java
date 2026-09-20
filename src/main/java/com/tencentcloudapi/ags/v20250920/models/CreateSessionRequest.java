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

public class CreateSessionRequest extends AbstractModel {

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
    * <p>Agent ID。可选。</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>会话 ID。可通过 CreateSession 或 DescribeSessions 接口获取。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>会话标题，最大长度 256 字符。</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>初始会话状态。</p>
    */
    @SerializedName("State")
    @Expose
    private SessionState State;

    /**
    * <p>创建会话时设置的初始元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataVar [] Metadata;

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
     * Get <p>会话标题，最大长度 256 字符。</p> 
     * @return Title <p>会话标题，最大长度 256 字符。</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>会话标题，最大长度 256 字符。</p>
     * @param Title <p>会话标题，最大长度 256 字符。</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>初始会话状态。</p> 
     * @return State <p>初始会话状态。</p>
     */
    public SessionState getState() {
        return this.State;
    }

    /**
     * Set <p>初始会话状态。</p>
     * @param State <p>初始会话状态。</p>
     */
    public void setState(SessionState State) {
        this.State = State;
    }

    /**
     * Get <p>创建会话时设置的初始元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p> 
     * @return Metadata <p>创建会话时设置的初始元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p>
     */
    public MetadataVar [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>创建会话时设置的初始元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p>
     * @param Metadata <p>创建会话时设置的初始元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p>
     */
    public void setMetadata(MetadataVar [] Metadata) {
        this.Metadata = Metadata;
    }

    public CreateSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSessionRequest(CreateSessionRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.State != null) {
            this.State = new SessionState(source.State);
        }
        if (source.Metadata != null) {
            this.Metadata = new MetadataVar[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new MetadataVar(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamObj(map, prefix + "State.", this.State);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

