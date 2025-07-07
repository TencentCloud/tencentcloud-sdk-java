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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksResponse extends AbstractModel {

    /**
    * 任务对象列表。
    */
    @SerializedName("TaskList")
    @Expose
    private TaskResponseInfo [] TaskList;

    /**
    * 实例总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 任务概览信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TasksOverview")
    @Expose
    private TasksOverview TasksOverview;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务对象列表。 
     * @return TaskList 任务对象列表。
     */
    public TaskResponseInfo [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set 任务对象列表。
     * @param TaskList 任务对象列表。
     */
    public void setTaskList(TaskResponseInfo [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get 实例总数。 
     * @return TotalCount 实例总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 实例总数。
     * @param TotalCount 实例总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 任务概览信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TasksOverview 任务概览信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TasksOverview getTasksOverview() {
        return this.TasksOverview;
    }

    /**
     * Set 任务概览信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TasksOverview 任务概览信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasksOverview(TasksOverview TasksOverview) {
        this.TasksOverview = TasksOverview;
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

    public DescribeTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksResponse(DescribeTasksResponse source) {
        if (source.TaskList != null) {
            this.TaskList = new TaskResponseInfo[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new TaskResponseInfo(source.TaskList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TasksOverview != null) {
            this.TasksOverview = new TasksOverview(source.TasksOverview);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamObj(map, prefix + "TasksOverview.", this.TasksOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

