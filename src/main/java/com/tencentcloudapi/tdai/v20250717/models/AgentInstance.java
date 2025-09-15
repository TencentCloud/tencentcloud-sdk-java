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

public class AgentInstance extends AbstractModel {

    /**
    * 智能体实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 智能体实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 智能体ID
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
    * 智能体服务模式
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * 智能体版本
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * 智能体实例状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 智能体实例参数列表
    */
    @SerializedName("Parameters")
    @Expose
    private Parameter [] Parameters;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 资源绑定Tag列表
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
     * Get 智能体实例ID 
     * @return InstanceId 智能体实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 智能体实例ID
     * @param InstanceId 智能体实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 智能体实例名称 
     * @return InstanceName 智能体实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 智能体实例名称
     * @param InstanceName 智能体实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 智能体ID 
     * @return AgentId 智能体ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 智能体ID
     * @param AgentId 智能体ID
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
     * Get 智能体服务模式 
     * @return AgentType 智能体服务模式
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 智能体服务模式
     * @param AgentType 智能体服务模式
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get 智能体版本 
     * @return AgentVersion 智能体版本
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set 智能体版本
     * @param AgentVersion 智能体版本
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get 智能体实例状态 
     * @return Status 智能体实例状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 智能体实例状态
     * @param Status 智能体实例状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 智能体实例参数列表 
     * @return Parameters 智能体实例参数列表
     */
    public Parameter [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 智能体实例参数列表
     * @param Parameters 智能体实例参数列表
     */
    public void setParameters(Parameter [] Parameters) {
        this.Parameters = Parameters;
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
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 资源绑定Tag列表 
     * @return Tags 资源绑定Tag列表
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源绑定Tag列表
     * @param Tags 资源绑定Tag列表
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    public AgentInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentInstance(AgentInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.AgentInternalName != null) {
            this.AgentInternalName = new String(source.AgentInternalName);
        }
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Parameters != null) {
            this.Parameters = new Parameter[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new Parameter(source.Parameters[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "AgentInternalName", this.AgentInternalName);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

