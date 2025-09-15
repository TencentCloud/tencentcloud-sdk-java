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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Agent extends AbstractModel {

    /**
    * 智能体Id
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 智能体名称
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 智能体类型
    */
    @SerializedName("AgentInternalName")
    @Expose
    private String AgentInternalName;

    /**
    * 智能体状态
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * 默认版本
    */
    @SerializedName("DefaultVersion")
    @Expose
    private String DefaultVersion;

    /**
    * 智能体模式
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建者
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新者
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 智能体Id 
     * @return AgentId 智能体Id
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 智能体Id
     * @param AgentId 智能体Id
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 智能体名称 
     * @return AgentName 智能体名称
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 智能体名称
     * @param AgentName 智能体名称
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 智能体类型 
     * @return AgentInternalName 智能体类型
     */
    public String getAgentInternalName() {
        return this.AgentInternalName;
    }

    /**
     * Set 智能体类型
     * @param AgentInternalName 智能体类型
     */
    public void setAgentInternalName(String AgentInternalName) {
        this.AgentInternalName = AgentInternalName;
    }

    /**
     * Get 智能体状态 
     * @return AgentStatus 智能体状态
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set 智能体状态
     * @param AgentStatus 智能体状态
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get 默认版本 
     * @return DefaultVersion 默认版本
     */
    public String getDefaultVersion() {
        return this.DefaultVersion;
    }

    /**
     * Set 默认版本
     * @param DefaultVersion 默认版本
     */
    public void setDefaultVersion(String DefaultVersion) {
        this.DefaultVersion = DefaultVersion;
    }

    /**
     * Get 智能体模式 
     * @return AgentType 智能体模式
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 智能体模式
     * @param AgentType 智能体模式
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建者 
     * @return Creator 创建者
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者
     * @param Creator 创建者
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新者 
     * @return Updater 更新者
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set 更新者
     * @param Updater 更新者
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Agent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Agent(Agent source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.AgentInternalName != null) {
            this.AgentInternalName = new String(source.AgentInternalName);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.DefaultVersion != null) {
            this.DefaultVersion = new String(source.DefaultVersion);
        }
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "AgentInternalName", this.AgentInternalName);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "DefaultVersion", this.DefaultVersion);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Updater", this.Updater);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

