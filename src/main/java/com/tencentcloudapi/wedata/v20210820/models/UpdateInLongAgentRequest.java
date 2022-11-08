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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInLongAgentRequest extends AbstractModel{

    /**
    * 采集器ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * WeData项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 采集器名称
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 集成资源组ID
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
     * Get 采集器ID 
     * @return AgentId 采集器ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 采集器ID
     * @param AgentId 采集器ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get WeData项目ID 
     * @return ProjectId WeData项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set WeData项目ID
     * @param ProjectId WeData项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 采集器名称 
     * @return AgentName 采集器名称
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 采集器名称
     * @param AgentName 采集器名称
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 集成资源组ID 
     * @return ExecutorGroupId 集成资源组ID
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 集成资源组ID
     * @param ExecutorGroupId 集成资源组ID
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    public UpdateInLongAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateInLongAgentRequest(UpdateInLongAgentRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);

    }
}

