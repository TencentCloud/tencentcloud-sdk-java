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
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStatusResponse extends AbstractModel{

    /**
    * 任务结果
    */
    @SerializedName("TaskResult")
    @Expose
    private String TaskResult;

    /**
    * 任务类型，010代表合同上传结果，020代表合同下载结果
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务结果 
     * @return TaskResult 任务结果
     */
    public String getTaskResult() {
        return this.TaskResult;
    }

    /**
     * Set 任务结果
     * @param TaskResult 任务结果
     */
    public void setTaskResult(String TaskResult) {
        this.TaskResult = TaskResult;
    }

    /**
     * Get 任务类型，010代表合同上传结果，020代表合同下载结果 
     * @return TaskType 任务类型，010代表合同上传结果，020代表合同下载结果
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，010代表合同上传结果，020代表合同下载结果
     * @param TaskType 任务类型，010代表合同上传结果，020代表合同下载结果
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskResult", this.TaskResult);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

