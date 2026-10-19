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

public class WorkflowRunSummary extends AbstractModel {

    /**
    * <p>运行环境。1:开发域，2:生产域</p>
    */
    @SerializedName("Domain")
    @Expose
    private Long Domain;

    /**
    * <p>工作流运行实例基本信息</p>
    */
    @SerializedName("WorkflowRunProfile")
    @Expose
    private WorkflowRunProfile WorkflowRunProfile;

    /**
    * <p>工作流运行实例结果</p>
    */
    @SerializedName("WorkflowRunResult")
    @Expose
    private WorkflowRunResult WorkflowRunResult;

    /**
    * <p>工作流运行实例时间信息</p>
    */
    @SerializedName("WorkflowRunTime")
    @Expose
    private WorkflowRunTime WorkflowRunTime;

    /**
     * Get <p>运行环境。1:开发域，2:生产域</p> 
     * @return Domain <p>运行环境。1:开发域，2:生产域</p>
     */
    public Long getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>运行环境。1:开发域，2:生产域</p>
     * @param Domain <p>运行环境。1:开发域，2:生产域</p>
     */
    public void setDomain(Long Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>工作流运行实例基本信息</p> 
     * @return WorkflowRunProfile <p>工作流运行实例基本信息</p>
     */
    public WorkflowRunProfile getWorkflowRunProfile() {
        return this.WorkflowRunProfile;
    }

    /**
     * Set <p>工作流运行实例基本信息</p>
     * @param WorkflowRunProfile <p>工作流运行实例基本信息</p>
     */
    public void setWorkflowRunProfile(WorkflowRunProfile WorkflowRunProfile) {
        this.WorkflowRunProfile = WorkflowRunProfile;
    }

    /**
     * Get <p>工作流运行实例结果</p> 
     * @return WorkflowRunResult <p>工作流运行实例结果</p>
     */
    public WorkflowRunResult getWorkflowRunResult() {
        return this.WorkflowRunResult;
    }

    /**
     * Set <p>工作流运行实例结果</p>
     * @param WorkflowRunResult <p>工作流运行实例结果</p>
     */
    public void setWorkflowRunResult(WorkflowRunResult WorkflowRunResult) {
        this.WorkflowRunResult = WorkflowRunResult;
    }

    /**
     * Get <p>工作流运行实例时间信息</p> 
     * @return WorkflowRunTime <p>工作流运行实例时间信息</p>
     */
    public WorkflowRunTime getWorkflowRunTime() {
        return this.WorkflowRunTime;
    }

    /**
     * Set <p>工作流运行实例时间信息</p>
     * @param WorkflowRunTime <p>工作流运行实例时间信息</p>
     */
    public void setWorkflowRunTime(WorkflowRunTime WorkflowRunTime) {
        this.WorkflowRunTime = WorkflowRunTime;
    }

    public WorkflowRunSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunSummary(WorkflowRunSummary source) {
        if (source.Domain != null) {
            this.Domain = new Long(source.Domain);
        }
        if (source.WorkflowRunProfile != null) {
            this.WorkflowRunProfile = new WorkflowRunProfile(source.WorkflowRunProfile);
        }
        if (source.WorkflowRunResult != null) {
            this.WorkflowRunResult = new WorkflowRunResult(source.WorkflowRunResult);
        }
        if (source.WorkflowRunTime != null) {
            this.WorkflowRunTime = new WorkflowRunTime(source.WorkflowRunTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "WorkflowRunProfile.", this.WorkflowRunProfile);
        this.setParamObj(map, prefix + "WorkflowRunResult.", this.WorkflowRunResult);
        this.setParamObj(map, prefix + "WorkflowRunTime.", this.WorkflowRunTime);

    }
}

