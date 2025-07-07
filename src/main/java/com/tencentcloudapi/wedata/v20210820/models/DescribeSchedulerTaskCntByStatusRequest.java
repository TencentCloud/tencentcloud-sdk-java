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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchedulerTaskCntByStatusRequest extends AbstractModel {

    /**
    * 1
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Y
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 111
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 1
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 项目ID列表，如果传了 ProjectIds ，ProjectId 不会生效
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 资源组ID筛选
    */
    @SerializedName("ResourceGroupIds")
    @Expose
    private String [] ResourceGroupIds;

    /**
     * Get 1 
     * @return TaskType 1
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 1
     * @param TaskType 1
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Y 
     * @return TypeName Y
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Y
     * @param TypeName Y
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 111 
     * @return ProjectId 111
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 111
     * @param ProjectId 111
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 1 
     * @return InCharge 1
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 1
     * @param InCharge 1
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 项目ID列表，如果传了 ProjectIds ，ProjectId 不会生效 
     * @return ProjectIds 项目ID列表，如果传了 ProjectIds ，ProjectId 不会生效
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID列表，如果传了 ProjectIds ，ProjectId 不会生效
     * @param ProjectIds 项目ID列表，如果传了 ProjectIds ，ProjectId 不会生效
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 资源组ID筛选 
     * @return ResourceGroupIds 资源组ID筛选
     */
    public String [] getResourceGroupIds() {
        return this.ResourceGroupIds;
    }

    /**
     * Set 资源组ID筛选
     * @param ResourceGroupIds 资源组ID筛选
     */
    public void setResourceGroupIds(String [] ResourceGroupIds) {
        this.ResourceGroupIds = ResourceGroupIds;
    }

    public DescribeSchedulerTaskCntByStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulerTaskCntByStatusRequest(DescribeSchedulerTaskCntByStatusRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ResourceGroupIds != null) {
            this.ResourceGroupIds = new String[source.ResourceGroupIds.length];
            for (int i = 0; i < source.ResourceGroupIds.length; i++) {
                this.ResourceGroupIds[i] = new String(source.ResourceGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ResourceGroupIds.", this.ResourceGroupIds);

    }
}

