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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterCheckTaskResponse extends AbstractModel {

    /**
    * 返回创建的集群检查任务的ID，为0表示创建失败。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 创建检查任务的结果，"Succ"为成功，其他的为失败原因
    */
    @SerializedName("CreateResult")
    @Expose
    private String CreateResult;

    /**
    * 返回创建的集群新任务ID
    */
    @SerializedName("NewTaskID")
    @Expose
    private String NewTaskID;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回创建的集群检查任务的ID，为0表示创建失败。 
     * @return TaskId 返回创建的集群检查任务的ID，为0表示创建失败。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 返回创建的集群检查任务的ID，为0表示创建失败。
     * @param TaskId 返回创建的集群检查任务的ID，为0表示创建失败。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 创建检查任务的结果，"Succ"为成功，其他的为失败原因 
     * @return CreateResult 创建检查任务的结果，"Succ"为成功，其他的为失败原因
     */
    public String getCreateResult() {
        return this.CreateResult;
    }

    /**
     * Set 创建检查任务的结果，"Succ"为成功，其他的为失败原因
     * @param CreateResult 创建检查任务的结果，"Succ"为成功，其他的为失败原因
     */
    public void setCreateResult(String CreateResult) {
        this.CreateResult = CreateResult;
    }

    /**
     * Get 返回创建的集群新任务ID 
     * @return NewTaskID 返回创建的集群新任务ID
     */
    public String getNewTaskID() {
        return this.NewTaskID;
    }

    /**
     * Set 返回创建的集群新任务ID
     * @param NewTaskID 返回创建的集群新任务ID
     */
    public void setNewTaskID(String NewTaskID) {
        this.NewTaskID = NewTaskID;
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

    public CreateClusterCheckTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterCheckTaskResponse(CreateClusterCheckTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.CreateResult != null) {
            this.CreateResult = new String(source.CreateResult);
        }
        if (source.NewTaskID != null) {
            this.NewTaskID = new String(source.NewTaskID);
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
        this.setParamSimple(map, prefix + "CreateResult", this.CreateResult);
        this.setParamSimple(map, prefix + "NewTaskID", this.NewTaskID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

