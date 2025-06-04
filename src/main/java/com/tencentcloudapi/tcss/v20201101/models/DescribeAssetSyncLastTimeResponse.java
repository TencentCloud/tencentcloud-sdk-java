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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetSyncLastTimeResponse extends AbstractModel {

    /**
    * 资产最近同步时间
    */
    @SerializedName("AssetSyncLastTime")
    @Expose
    private String AssetSyncLastTime;

    /**
    * 任务状态
PENDING:待处理
PROCESSING:处理中
PROCESSED:已完成
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 任务进度(百分比)
    */
    @SerializedName("TaskProcess")
    @Expose
    private Long TaskProcess;

    /**
    * 失败主机数
    */
    @SerializedName("FailedHostCount")
    @Expose
    private Long FailedHostCount;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产最近同步时间 
     * @return AssetSyncLastTime 资产最近同步时间
     */
    public String getAssetSyncLastTime() {
        return this.AssetSyncLastTime;
    }

    /**
     * Set 资产最近同步时间
     * @param AssetSyncLastTime 资产最近同步时间
     */
    public void setAssetSyncLastTime(String AssetSyncLastTime) {
        this.AssetSyncLastTime = AssetSyncLastTime;
    }

    /**
     * Get 任务状态
PENDING:待处理
PROCESSING:处理中
PROCESSED:已完成 
     * @return TaskStatus 任务状态
PENDING:待处理
PROCESSING:处理中
PROCESSED:已完成
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
PENDING:待处理
PROCESSING:处理中
PROCESSED:已完成
     * @param TaskStatus 任务状态
PENDING:待处理
PROCESSING:处理中
PROCESSED:已完成
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务进度(百分比) 
     * @return TaskProcess 任务进度(百分比)
     */
    public Long getTaskProcess() {
        return this.TaskProcess;
    }

    /**
     * Set 任务进度(百分比)
     * @param TaskProcess 任务进度(百分比)
     */
    public void setTaskProcess(Long TaskProcess) {
        this.TaskProcess = TaskProcess;
    }

    /**
     * Get 失败主机数 
     * @return FailedHostCount 失败主机数
     */
    public Long getFailedHostCount() {
        return this.FailedHostCount;
    }

    /**
     * Set 失败主机数
     * @param FailedHostCount 失败主机数
     */
    public void setFailedHostCount(Long FailedHostCount) {
        this.FailedHostCount = FailedHostCount;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetSyncLastTimeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetSyncLastTimeResponse(DescribeAssetSyncLastTimeResponse source) {
        if (source.AssetSyncLastTime != null) {
            this.AssetSyncLastTime = new String(source.AssetSyncLastTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.TaskProcess != null) {
            this.TaskProcess = new Long(source.TaskProcess);
        }
        if (source.FailedHostCount != null) {
            this.FailedHostCount = new Long(source.FailedHostCount);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetSyncLastTime", this.AssetSyncLastTime);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskProcess", this.TaskProcess);
        this.setParamSimple(map, prefix + "FailedHostCount", this.FailedHostCount);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

