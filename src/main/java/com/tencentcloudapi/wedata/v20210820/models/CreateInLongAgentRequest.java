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

public class CreateInLongAgentRequest extends AbstractModel{

    /**
    * 采集器类型，1：TKE Agent，2：BOSS SDK，默认：1
    */
    @SerializedName("AgentType")
    @Expose
    private Long AgentType;

    /**
    * 采集器名称
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 集成资源组id
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * WeData项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * TKE集群的地域
    */
    @SerializedName("TkeRegion")
    @Expose
    private String TkeRegion;

    /**
    * 当AgentType为1时，必填。当AgentType为2时，不用填
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 采集器类型，1：TKE Agent，2：BOSS SDK，默认：1 
     * @return AgentType 采集器类型，1：TKE Agent，2：BOSS SDK，默认：1
     */
    public Long getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 采集器类型，1：TKE Agent，2：BOSS SDK，默认：1
     * @param AgentType 采集器类型，1：TKE Agent，2：BOSS SDK，默认：1
     */
    public void setAgentType(Long AgentType) {
        this.AgentType = AgentType;
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
     * Get 集成资源组id 
     * @return ExecutorGroupId 集成资源组id
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 集成资源组id
     * @param ExecutorGroupId 集成资源组id
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
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
     * Get TKE集群的地域 
     * @return TkeRegion TKE集群的地域
     */
    public String getTkeRegion() {
        return this.TkeRegion;
    }

    /**
     * Set TKE集群的地域
     * @param TkeRegion TKE集群的地域
     */
    public void setTkeRegion(String TkeRegion) {
        this.TkeRegion = TkeRegion;
    }

    /**
     * Get 当AgentType为1时，必填。当AgentType为2时，不用填 
     * @return ClusterId 当AgentType为1时，必填。当AgentType为2时，不用填
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 当AgentType为1时，必填。当AgentType为2时，不用填
     * @param ClusterId 当AgentType为1时，必填。当AgentType为2时，不用填
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public CreateInLongAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInLongAgentRequest(CreateInLongAgentRequest source) {
        if (source.AgentType != null) {
            this.AgentType = new Long(source.AgentType);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TkeRegion != null) {
            this.TkeRegion = new String(source.TkeRegion);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TkeRegion", this.TkeRegion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

