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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRefreshTaskResponse extends AbstractModel{

    /**
    * 返回创建的集群检查任务的ID，为0表示创建失败。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 创建检查任务的结果，"Succ"为成功，"Failed"为失败
    */
    @SerializedName("CreateResult")
    @Expose
    private String CreateResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
     * Get 创建检查任务的结果，"Succ"为成功，"Failed"为失败 
     * @return CreateResult 创建检查任务的结果，"Succ"为成功，"Failed"为失败
     */
    public String getCreateResult() {
        return this.CreateResult;
    }

    /**
     * Set 创建检查任务的结果，"Succ"为成功，"Failed"为失败
     * @param CreateResult 创建检查任务的结果，"Succ"为成功，"Failed"为失败
     */
    public void setCreateResult(String CreateResult) {
        this.CreateResult = CreateResult;
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

    public CreateRefreshTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRefreshTaskResponse(CreateRefreshTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.CreateResult != null) {
            this.CreateResult = new String(source.CreateResult);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

