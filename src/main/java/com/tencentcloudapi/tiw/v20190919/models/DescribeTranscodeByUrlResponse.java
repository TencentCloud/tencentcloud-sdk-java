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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTranscodeByUrlResponse extends AbstractModel{

    /**
    * 转码的当前进度,取值范围为0~100
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
- EXCEPTION: 转换异常
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 转码任务的唯一标识Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 转码的当前进度,取值范围为0~100 
     * @return Progress 转码的当前进度,取值范围为0~100
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 转码的当前进度,取值范围为0~100
     * @param Progress 转码的当前进度,取值范围为0~100
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
- EXCEPTION: 转换异常 
     * @return Status 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
- EXCEPTION: 转换异常
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
- EXCEPTION: 转换异常
     * @param Status 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
- EXCEPTION: 转换异常
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 转码任务的唯一标识Id 
     * @return TaskId 转码任务的唯一标识Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 转码任务的唯一标识Id
     * @param TaskId 转码任务的唯一标识Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public DescribeTranscodeByUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTranscodeByUrlResponse(DescribeTranscodeByUrlResponse source) {
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

