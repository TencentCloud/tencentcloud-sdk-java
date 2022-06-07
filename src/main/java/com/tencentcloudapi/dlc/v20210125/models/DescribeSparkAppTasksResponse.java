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

public class DescribeSparkAppTasksResponse extends AbstractModel{

    /**
    * 任务结果（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private TaskResponseInfo Tasks;

    /**
    * 任务总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 任务结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkAppTasks")
    @Expose
    private TaskResponseInfo [] SparkAppTasks;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务结果（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 任务结果（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskResponseInfo getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务结果（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 任务结果（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(TaskResponseInfo Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 任务总数 
     * @return TotalCount 任务总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 任务总数
     * @param TotalCount 任务总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 任务结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkAppTasks 任务结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskResponseInfo [] getSparkAppTasks() {
        return this.SparkAppTasks;
    }

    /**
     * Set 任务结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkAppTasks 任务结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkAppTasks(TaskResponseInfo [] SparkAppTasks) {
        this.SparkAppTasks = SparkAppTasks;
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

    public DescribeSparkAppTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppTasksResponse(DescribeSparkAppTasksResponse source) {
        if (source.Tasks != null) {
            this.Tasks = new TaskResponseInfo(source.Tasks);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SparkAppTasks != null) {
            this.SparkAppTasks = new TaskResponseInfo[source.SparkAppTasks.length];
            for (int i = 0; i < source.SparkAppTasks.length; i++) {
                this.SparkAppTasks[i] = new TaskResponseInfo(source.SparkAppTasks[i]);
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
        this.setParamObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SparkAppTasks.", this.SparkAppTasks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

