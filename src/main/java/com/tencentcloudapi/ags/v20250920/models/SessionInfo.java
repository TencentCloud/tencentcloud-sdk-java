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

public class SessionInfo extends AbstractModel {

    /**
    * <p>会话 ID。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>会话所属空间 ID。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Session 快照状态</p>
    */
    @SerializedName("State")
    @Expose
    private SessionState State;

    /**
    * <p>会话元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值，最多支持 64 项。</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataVar [] Metadata;

    /**
    * <p>Agent ID。</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>用户 ID。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>会话标题。</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>事件数量。</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>会话 ID。</p> 
     * @return SessionId <p>会话 ID。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID。</p>
     * @param SessionId <p>会话 ID。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

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
     * Get <p>Session 快照状态</p> 
     * @return State <p>Session 快照状态</p>
     */
    public SessionState getState() {
        return this.State;
    }

    /**
     * Set <p>Session 快照状态</p>
     * @param State <p>Session 快照状态</p>
     */
    public void setState(SessionState State) {
        this.State = State;
    }

    /**
     * Get <p>会话元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值，最多支持 64 项。</p> 
     * @return Metadata <p>会话元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值，最多支持 64 项。</p>
     */
    public MetadataVar [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>会话元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值，最多支持 64 项。</p>
     * @param Metadata <p>会话元数据，以键值对数组形式表示。每个元素包含 Metadata 名称和对应值，最多支持 64 项。</p>
     */
    public void setMetadata(MetadataVar [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>Agent ID。</p> 
     * @return AgentId <p>Agent ID。</p>
     * @deprecated
     */
    @Deprecated
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID。</p>
     * @param AgentId <p>Agent ID。</p>
     * @deprecated
     */
    @Deprecated
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>用户 ID。</p> 
     * @return UserId <p>用户 ID。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户 ID。</p>
     * @param UserId <p>用户 ID。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>会话标题。</p> 
     * @return Title <p>会话标题。</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>会话标题。</p>
     * @param Title <p>会话标题。</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>事件数量。</p> 
     * @return EventCount <p>事件数量。</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>事件数量。</p>
     * @param EventCount <p>事件数量。</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间。</p> 
     * @return UpdateTime <p>更新时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间。</p>
     * @param UpdateTime <p>更新时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionInfo(SessionInfo source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
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
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "State.", this.State);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

