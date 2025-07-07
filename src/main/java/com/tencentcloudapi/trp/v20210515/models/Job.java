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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel {

    /**
    * 调度ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 执行状态 init:初始化, pending: 执行中, done: 执行成功, error: 执行失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务错误信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get 调度ID 
     * @return JobId 调度ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 调度ID
     * @param JobId 调度ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 执行状态 init:初始化, pending: 执行中, done: 执行成功, error: 执行失败 
     * @return Status 执行状态 init:初始化, pending: 执行中, done: 执行成功, error: 执行失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态 init:初始化, pending: 执行中, done: 执行成功, error: 执行失败
     * @param Status 执行状态 init:初始化, pending: 执行中, done: 执行成功, error: 执行失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务错误信息 
     * @return ErrorMessage 任务错误信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 任务错误信息
     * @param ErrorMessage 任务错误信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

