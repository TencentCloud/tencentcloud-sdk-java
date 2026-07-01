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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleWorkflowConfig extends AbstractModel {

    /**
    * <p>是否开启异步工作流</p>
    */
    @SerializedName("AsyncWorkflow")
    @Expose
    private Boolean AsyncWorkflow;

    /**
    * <p>状态 发布状态(UNPUBLISHED: 待发布 PUBLISHING: 发布中 PUBLISHED: 已发布 PUBLISHED_FAIL:发布失败；DRAFT：待调试)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>工作流描述</p>
    */
    @SerializedName("WorkflowDescription")
    @Expose
    private String WorkflowDescription;

    /**
    * <p>工作流Id</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流名称</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>工作流是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>是否开启异步工作流</p> 
     * @return AsyncWorkflow <p>是否开启异步工作流</p>
     */
    public Boolean getAsyncWorkflow() {
        return this.AsyncWorkflow;
    }

    /**
     * Set <p>是否开启异步工作流</p>
     * @param AsyncWorkflow <p>是否开启异步工作流</p>
     */
    public void setAsyncWorkflow(Boolean AsyncWorkflow) {
        this.AsyncWorkflow = AsyncWorkflow;
    }

    /**
     * Get <p>状态 发布状态(UNPUBLISHED: 待发布 PUBLISHING: 发布中 PUBLISHED: 已发布 PUBLISHED_FAIL:发布失败；DRAFT：待调试)</p> 
     * @return Status <p>状态 发布状态(UNPUBLISHED: 待发布 PUBLISHING: 发布中 PUBLISHED: 已发布 PUBLISHED_FAIL:发布失败；DRAFT：待调试)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态 发布状态(UNPUBLISHED: 待发布 PUBLISHING: 发布中 PUBLISHED: 已发布 PUBLISHED_FAIL:发布失败；DRAFT：待调试)</p>
     * @param Status <p>状态 发布状态(UNPUBLISHED: 待发布 PUBLISHING: 发布中 PUBLISHED: 已发布 PUBLISHED_FAIL:发布失败；DRAFT：待调试)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>工作流描述</p> 
     * @return WorkflowDescription <p>工作流描述</p>
     */
    public String getWorkflowDescription() {
        return this.WorkflowDescription;
    }

    /**
     * Set <p>工作流描述</p>
     * @param WorkflowDescription <p>工作流描述</p>
     */
    public void setWorkflowDescription(String WorkflowDescription) {
        this.WorkflowDescription = WorkflowDescription;
    }

    /**
     * Get <p>工作流Id</p> 
     * @return WorkflowId <p>工作流Id</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流Id</p>
     * @param WorkflowId <p>工作流Id</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流名称</p> 
     * @return WorkflowName <p>工作流名称</p>
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名称</p>
     * @param WorkflowName <p>工作流名称</p>
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>工作流是否启用</p> 
     * @return Enabled <p>工作流是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>工作流是否启用</p>
     * @param Enabled <p>工作流是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public SingleWorkflowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleWorkflowConfig(SingleWorkflowConfig source) {
        if (source.AsyncWorkflow != null) {
            this.AsyncWorkflow = new Boolean(source.AsyncWorkflow);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.WorkflowDescription != null) {
            this.WorkflowDescription = new String(source.WorkflowDescription);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncWorkflow", this.AsyncWorkflow);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WorkflowDescription", this.WorkflowDescription);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

