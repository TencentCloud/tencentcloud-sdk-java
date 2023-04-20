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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataRepositoryTaskStatusResponse extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态 0(初始化中), 1(运行中), 2(已完成), 3(任务失败)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 已完成的文件数量
    */
    @SerializedName("FinishedFileNumber")
    @Expose
    private Long FinishedFileNumber;

    /**
    * 已完成的数据量
    */
    @SerializedName("FinishedCapacity")
    @Expose
    private Long FinishedCapacity;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态 0(初始化中), 1(运行中), 2(已完成), 3(任务失败) 
     * @return Status 任务状态 0(初始化中), 1(运行中), 2(已完成), 3(任务失败)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态 0(初始化中), 1(运行中), 2(已完成), 3(任务失败)
     * @param Status 任务状态 0(初始化中), 1(运行中), 2(已完成), 3(任务失败)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 已完成的文件数量 
     * @return FinishedFileNumber 已完成的文件数量
     */
    public Long getFinishedFileNumber() {
        return this.FinishedFileNumber;
    }

    /**
     * Set 已完成的文件数量
     * @param FinishedFileNumber 已完成的文件数量
     */
    public void setFinishedFileNumber(Long FinishedFileNumber) {
        this.FinishedFileNumber = FinishedFileNumber;
    }

    /**
     * Get 已完成的数据量 
     * @return FinishedCapacity 已完成的数据量
     */
    public Long getFinishedCapacity() {
        return this.FinishedCapacity;
    }

    /**
     * Set 已完成的数据量
     * @param FinishedCapacity 已完成的数据量
     */
    public void setFinishedCapacity(Long FinishedCapacity) {
        this.FinishedCapacity = FinishedCapacity;
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

    public DescribeDataRepositoryTaskStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataRepositoryTaskStatusResponse(DescribeDataRepositoryTaskStatusResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FinishedFileNumber != null) {
            this.FinishedFileNumber = new Long(source.FinishedFileNumber);
        }
        if (source.FinishedCapacity != null) {
            this.FinishedCapacity = new Long(source.FinishedCapacity);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FinishedFileNumber", this.FinishedFileNumber);
        this.setParamSimple(map, prefix + "FinishedCapacity", this.FinishedCapacity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

