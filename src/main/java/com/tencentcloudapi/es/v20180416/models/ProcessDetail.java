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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessDetail extends AbstractModel {

    /**
    * 已完成数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Completed")
    @Expose
    private Long Completed;

    /**
    * 剩余数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remain")
    @Expose
    private Long Remain;

    /**
    * 总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 任务类型：
60：重启型任务
70：分片迁移型任务
80：节点变配任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get 已完成数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Completed 已完成数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompleted() {
        return this.Completed;
    }

    /**
     * Set 已完成数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Completed 已完成数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompleted(Long Completed) {
        this.Completed = Completed;
    }

    /**
     * Get 剩余数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remain 剩余数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemain() {
        return this.Remain;
    }

    /**
     * Set 剩余数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remain 剩余数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemain(Long Remain) {
        this.Remain = Remain;
    }

    /**
     * Get 总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 任务类型：
60：重启型任务
70：分片迁移型任务
80：节点变配任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型：
60：重启型任务
70：分片迁移型任务
80：节点变配任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型：
60：重启型任务
70：分片迁移型任务
80：节点变配任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型：
60：重启型任务
70：分片迁移型任务
80：节点变配任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public ProcessDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessDetail(ProcessDetail source) {
        if (source.Completed != null) {
            this.Completed = new Long(source.Completed);
        }
        if (source.Remain != null) {
            this.Remain = new Long(source.Remain);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Completed", this.Completed);
        this.setParamSimple(map, prefix + "Remain", this.Remain);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

