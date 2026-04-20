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

public class CreateAgentInstanceRequest extends AbstractModel {

    /**
    * <p>智能体ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>智能体版本</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>智能体实例的参数列表</p>
    */
    @SerializedName("Parameters")
    @Expose
    private Parameter [] Parameters;

    /**
    * <p>资源的标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * <p>无</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>无</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>无</p>
    */
    @SerializedName("Skills")
    @Expose
    private String [] Skills;

    /**
    * <p>无</p>
    */
    @SerializedName("SoulId")
    @Expose
    private Long SoulId;

    /**
    * <p>无</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get <p>实例名</p> 
     * @return InstanceName <p>实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名</p>
     * @param InstanceName <p>实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>智能体实例的参数列表</p> 
     * @return Parameters <p>智能体实例的参数列表</p>
     */
    public Parameter [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>智能体实例的参数列表</p>
     * @param Parameters <p>智能体实例的参数列表</p>
     */
    public void setParameters(Parameter [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get <p>资源的标签信息</p> 
     * @return Tags <p>资源的标签信息</p>
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>资源的标签信息</p>
     * @param Tags <p>资源的标签信息</p>
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
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
     * @return TemplateId <p>无</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>无</p>
     * @param TemplateId <p>无</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>无</p> 
     * @return Skills <p>无</p>
     */
    public String [] getSkills() {
        return this.Skills;
    }

    /**
     * Set <p>无</p>
     * @param Skills <p>无</p>
     */
    public void setSkills(String [] Skills) {
        this.Skills = Skills;
    }

    /**
     * Get <p>无</p> 
     * @return SoulId <p>无</p>
     */
    public Long getSoulId() {
        return this.SoulId;
    }

    /**
     * Set <p>无</p>
     * @param SoulId <p>无</p>
     */
    public void setSoulId(Long SoulId) {
        this.SoulId = SoulId;
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

    public CreateAgentInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentInstanceRequest(CreateAgentInstanceRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Parameters != null) {
            this.Parameters = new Parameter[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new Parameter(source.Parameters[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Skills != null) {
            this.Skills = new String[source.Skills.length];
            for (int i = 0; i < source.Skills.length; i++) {
                this.Skills[i] = new String(source.Skills[i]);
            }
        }
        if (source.SoulId != null) {
            this.SoulId = new Long(source.SoulId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "Skills.", this.Skills);
        this.setParamSimple(map, prefix + "SoulId", this.SoulId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

