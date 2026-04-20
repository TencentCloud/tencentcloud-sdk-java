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
    * <p>智能体实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>智能体实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>智能体ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>智能体名称</p>
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * <p>智能体类型</p>
    */
    @SerializedName("AgentInternalName")
    @Expose
    private String AgentInternalName;

    /**
    * <p>智能体服务模式</p>
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * <p>智能体版本</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>智能体实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>智能体实例参数列表</p>
    */
    @SerializedName("Parameters")
    @Expose
    private Parameter [] Parameters;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>资源绑定Tag列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * <p>部署位置,intranet-共享版，userVpc-专享版</p>
    */
    @SerializedName("DeployPlace")
    @Expose
    private String DeployPlace;

    /**
    * <p>关联的告警策略ID。</p>
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
    * <p>无</p>
    */
    @SerializedName("ClawConfig")
    @Expose
    private ClawConfigInfo ClawConfig;

    /**
    * <p>无</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>无</p>
    */
    @SerializedName("AllowedActions")
    @Expose
    private String [] AllowedActions;

    /**
    * <p>无</p>
    */
    @SerializedName("LastActiveTime")
    @Expose
    private String LastActiveTime;

    /**
    * <p>无</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>智能体实例ID</p> 
     * @return InstanceId <p>智能体实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>智能体实例ID</p>
     * @param InstanceId <p>智能体实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>智能体实例名称</p> 
     * @return InstanceName <p>智能体实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>智能体实例名称</p>
     * @param InstanceName <p>智能体实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>智能体ID</p> 
     * @return AgentId <p>智能体ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>智能体ID</p>
     * @param AgentId <p>智能体ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>智能体名称</p> 
     * @return AgentName <p>智能体名称</p>
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set <p>智能体名称</p>
     * @param AgentName <p>智能体名称</p>
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get <p>智能体类型</p> 
     * @return AgentInternalName <p>智能体类型</p>
     */
    public String getAgentInternalName() {
        return this.AgentInternalName;
    }

    /**
     * Set <p>智能体类型</p>
     * @param AgentInternalName <p>智能体类型</p>
     */
    public void setAgentInternalName(String AgentInternalName) {
        this.AgentInternalName = AgentInternalName;
    }

    /**
     * Get <p>智能体服务模式</p> 
     * @return AgentType <p>智能体服务模式</p>
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set <p>智能体服务模式</p>
     * @param AgentType <p>智能体服务模式</p>
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get <p>智能体版本</p> 
     * @return AgentVersion <p>智能体版本</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>智能体版本</p>
     * @param AgentVersion <p>智能体版本</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>智能体实例状态</p> 
     * @return Status <p>智能体实例状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>智能体实例状态</p>
     * @param Status <p>智能体实例状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>智能体实例参数列表</p> 
     * @return Parameters <p>智能体实例参数列表</p>
     */
    public Parameter [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>智能体实例参数列表</p>
     * @param Parameters <p>智能体实例参数列表</p>
     */
    public void setParameters(Parameter [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return UpdateTime <p>修改时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param UpdateTime <p>修改时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>资源绑定Tag列表</p> 
     * @return Tags <p>资源绑定Tag列表</p>
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>资源绑定Tag列表</p>
     * @param Tags <p>资源绑定Tag列表</p>
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>部署位置,intranet-共享版，userVpc-专享版</p> 
     * @return DeployPlace <p>部署位置,intranet-共享版，userVpc-专享版</p>
     */
    public String getDeployPlace() {
        return this.DeployPlace;
    }

    /**
     * Set <p>部署位置,intranet-共享版，userVpc-专享版</p>
     * @param DeployPlace <p>部署位置,intranet-共享版，userVpc-专享版</p>
     */
    public void setDeployPlace(String DeployPlace) {
        this.DeployPlace = DeployPlace;
    }

    /**
     * Get <p>关联的告警策略ID。</p> 
     * @return PolicyIds <p>关联的告警策略ID。</p>
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set <p>关联的告警策略ID。</p>
     * @param PolicyIds <p>关联的告警策略ID。</p>
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get <p>无</p> 
     * @return ClawConfig <p>无</p>
     */
    public ClawConfigInfo getClawConfig() {
        return this.ClawConfig;
    }

    /**
     * Set <p>无</p>
     * @param ClawConfig <p>无</p>
     */
    public void setClawConfig(ClawConfigInfo ClawConfig) {
        this.ClawConfig = ClawConfig;
    }

    /**
     * Get <p>无</p> 
     * @return InstanceType <p>无</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>无</p>
     * @param InstanceType <p>无</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>无</p> 
     * @return AllowedActions <p>无</p>
     */
    public String [] getAllowedActions() {
        return this.AllowedActions;
    }

    /**
     * Set <p>无</p>
     * @param AllowedActions <p>无</p>
     */
    public void setAllowedActions(String [] AllowedActions) {
        this.AllowedActions = AllowedActions;
    }

    /**
     * Get <p>无</p> 
     * @return LastActiveTime <p>无</p>
     */
    public String getLastActiveTime() {
        return this.LastActiveTime;
    }

    /**
     * Set <p>无</p>
     * @param LastActiveTime <p>无</p>
     */
    public void setLastActiveTime(String LastActiveTime) {
        this.LastActiveTime = LastActiveTime;
    }

    /**
     * Get <p>无</p> 
     * @return Description <p>无</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>无</p>
     * @param Description <p>无</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
        if (source.DeployPlace != null) {
            this.DeployPlace = new String(source.DeployPlace);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
        if (source.ClawConfig != null) {
            this.ClawConfig = new ClawConfigInfo(source.ClawConfig);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AllowedActions != null) {
            this.AllowedActions = new String[source.AllowedActions.length];
            for (int i = 0; i < source.AllowedActions.length; i++) {
                this.AllowedActions[i] = new String(source.AllowedActions[i]);
            }
        }
        if (source.LastActiveTime != null) {
            this.LastActiveTime = new String(source.LastActiveTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "DeployPlace", this.DeployPlace);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamObj(map, prefix + "ClawConfig.", this.ClawConfig);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "AllowedActions.", this.AllowedActions);
        this.setParamSimple(map, prefix + "LastActiveTime", this.LastActiveTime);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

