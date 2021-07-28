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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTasksInOrderResponse extends AbstractModel{

    /**
    * 本批次提交的任务的批次Id
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 任务Id集合，按照执行顺序排列
    */
    @SerializedName("TaskIdSet")
    @Expose
    private String [] TaskIdSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本批次提交的任务的批次Id 
     * @return BatchId 本批次提交的任务的批次Id
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 本批次提交的任务的批次Id
     * @param BatchId 本批次提交的任务的批次Id
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 任务Id集合，按照执行顺序排列 
     * @return TaskIdSet 任务Id集合，按照执行顺序排列
     */
    public String [] getTaskIdSet() {
        return this.TaskIdSet;
    }

    /**
     * Set 任务Id集合，按照执行顺序排列
     * @param TaskIdSet 任务Id集合，按照执行顺序排列
     */
    public void setTaskIdSet(String [] TaskIdSet) {
        this.TaskIdSet = TaskIdSet;
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

    public CreateTasksInOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTasksInOrderResponse(CreateTasksInOrderResponse source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.TaskIdSet != null) {
            this.TaskIdSet = new String[source.TaskIdSet.length];
            for (int i = 0; i < source.TaskIdSet.length; i++) {
                this.TaskIdSet[i] = new String(source.TaskIdSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamArraySimple(map, prefix + "TaskIdSet.", this.TaskIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

