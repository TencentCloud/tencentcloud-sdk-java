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

public class DescribeRunningTasksResponse extends AbstractModel{

    /**
    * 当前正在执行中的任务总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 任务信息列表
    */
    @SerializedName("Tasks")
    @Expose
    private RunningTaskItem [] Tasks;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前正在执行中的任务总数 
     * @return Total 当前正在执行中的任务总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 当前正在执行中的任务总数
     * @param Total 当前正在执行中的任务总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 任务信息列表 
     * @return Tasks 任务信息列表
     */
    public RunningTaskItem [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务信息列表
     * @param Tasks 任务信息列表
     */
    public void setTasks(RunningTaskItem [] Tasks) {
        this.Tasks = Tasks;
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

    public DescribeRunningTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRunningTasksResponse(DescribeRunningTasksResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Tasks != null) {
            this.Tasks = new RunningTaskItem[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new RunningTaskItem(source.Tasks[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

