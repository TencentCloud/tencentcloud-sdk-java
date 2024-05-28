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

public class FreezeTasksByWorkflowIdsRequest extends AbstractModel {

    /**
    * 工作流id列表
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否终止已生成的实例
    */
    @SerializedName("KillInstance")
    @Expose
    private Boolean KillInstance;

    /**
     * Get 工作流id列表 
     * @return WorkflowIds 工作流id列表
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set 工作流id列表
     * @param WorkflowIds 工作流id列表
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否终止已生成的实例 
     * @return KillInstance 是否终止已生成的实例
     */
    public Boolean getKillInstance() {
        return this.KillInstance;
    }

    /**
     * Set 是否终止已生成的实例
     * @param KillInstance 是否终止已生成的实例
     */
    public void setKillInstance(Boolean KillInstance) {
        this.KillInstance = KillInstance;
    }

    public FreezeTasksByWorkflowIdsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FreezeTasksByWorkflowIdsRequest(FreezeTasksByWorkflowIdsRequest source) {
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.KillInstance != null) {
            this.KillInstance = new Boolean(source.KillInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "KillInstance", this.KillInstance);

    }
}

