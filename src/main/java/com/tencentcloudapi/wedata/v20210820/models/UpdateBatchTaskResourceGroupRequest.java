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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateBatchTaskResourceGroupRequest extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 调度资源组Id
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 集成资源组Id
    */
    @SerializedName("EtlResourceGroup")
    @Expose
    private String EtlResourceGroup;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 任务id 
     * @return TaskIds 任务id
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务id
     * @param TaskIds 任务id
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 调度资源组Id 
     * @return ResourceGroup 调度资源组Id
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 调度资源组Id
     * @param ResourceGroup 调度资源组Id
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 集成资源组Id 
     * @return EtlResourceGroup 集成资源组Id
     */
    public String getEtlResourceGroup() {
        return this.EtlResourceGroup;
    }

    /**
     * Set 集成资源组Id
     * @param EtlResourceGroup 集成资源组Id
     */
    public void setEtlResourceGroup(String EtlResourceGroup) {
        this.EtlResourceGroup = EtlResourceGroup;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public UpdateBatchTaskResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBatchTaskResourceGroupRequest(UpdateBatchTaskResourceGroupRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.EtlResourceGroup != null) {
            this.EtlResourceGroup = new String(source.EtlResourceGroup);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "EtlResourceGroup", this.EtlResourceGroup);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

