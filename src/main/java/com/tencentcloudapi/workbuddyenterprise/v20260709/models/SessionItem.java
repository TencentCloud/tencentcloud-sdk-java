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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionItem extends AbstractModel {

    /**
    * 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 会话名称（AI 生成标题或用户改名；缺失时为空）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * Agent 业务 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID；原 AgentVersion）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 会话使用的 Agent 版本 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 会话状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建者 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 会话来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 创建时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get 会话 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 会话名称（AI 生成标题或用户改名；缺失时为空）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionName 会话名称（AI 生成标题或用户改名；缺失时为空）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set 会话名称（AI 生成标题或用户改名；缺失时为空）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionName 会话名称（AI 生成标题或用户改名；缺失时为空）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get Agent 业务 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId Agent 业务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent 业务 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId Agent 业务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Agent 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentName Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentName Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID；原 AgentVersion）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID；原 AgentVersion）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID；原 AgentVersion）
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 会话使用的版本名称（与 VersionId 区分：此为版本名，非 ID；原 AgentVersion）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 会话使用的 Agent 版本 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId 会话使用的 Agent 版本 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 会话使用的 Agent 版本 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId 会话使用的 Agent 版本 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 会话状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 会话状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 会话状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 会话状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建者 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建者 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建者 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 会话来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 会话来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 会话来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 会话来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 创建时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 更新时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 更新时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 更新时间（RFC3339）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public SessionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionItem(SessionItem source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

