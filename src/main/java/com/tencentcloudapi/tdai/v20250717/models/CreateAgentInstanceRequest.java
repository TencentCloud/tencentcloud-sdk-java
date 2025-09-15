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
    * 智能体ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 智能体版本
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 智能体实例的参数列表
    */
    @SerializedName("Parameters")
    @Expose
    private Parameter [] Parameters;

    /**
    * 资源的标签信息
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

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
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 智能体实例的参数列表 
     * @return Parameters 智能体实例的参数列表
     */
    public Parameter [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 智能体实例的参数列表
     * @param Parameters 智能体实例的参数列表
     */
    public void setParameters(Parameter [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 资源的标签信息 
     * @return Tags 资源的标签信息
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源的标签信息
     * @param Tags 资源的标签信息
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
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

    }
}

