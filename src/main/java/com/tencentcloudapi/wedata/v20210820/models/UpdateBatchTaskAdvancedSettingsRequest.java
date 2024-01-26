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

public class UpdateBatchTaskAdvancedSettingsRequest extends AbstractModel {

    /**
    * 待更新的任务ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 重试等待时间
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * 失败重试次数
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * 任务优先级
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * 超时处理策略
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private Long ExecutionTTL;

    /**
     * Get 待更新的任务ID 
     * @return TaskIds 待更新的任务ID
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 待更新的任务ID
     * @param TaskIds 待更新的任务ID
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
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

    /**
     * Get 重试等待时间 
     * @return RetryWait 重试等待时间
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set 重试等待时间
     * @param RetryWait 重试等待时间
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get 失败重试次数 
     * @return TryLimit 失败重试次数
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set 失败重试次数
     * @param TryLimit 失败重试次数
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get 任务优先级 
     * @return RunPriority 任务优先级
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set 任务优先级
     * @param RunPriority 任务优先级
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get 超时处理策略 
     * @return ExecutionTTL 超时处理策略
     */
    public Long getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set 超时处理策略
     * @param ExecutionTTL 超时处理策略
     */
    public void setExecutionTTL(Long ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    public UpdateBatchTaskAdvancedSettingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBatchTaskAdvancedSettingsRequest(UpdateBatchTaskAdvancedSettingsRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.ExecutionTTL != null) {
            this.ExecutionTTL = new Long(source.ExecutionTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "ExecutionTTL", this.ExecutionTTL);

    }
}

