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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealTimeTaskInstanceNodeInfo extends AbstractModel{

    /**
    * 任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实时任务实例节点信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNodeInfoList")
    @Expose
    private InstanceNodeInfo [] InstanceNodeInfoList;

    /**
     * Get 任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实时任务实例节点信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNodeInfoList 实时任务实例节点信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeInfo [] getInstanceNodeInfoList() {
        return this.InstanceNodeInfoList;
    }

    /**
     * Set 实时任务实例节点信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNodeInfoList 实时任务实例节点信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNodeInfoList(InstanceNodeInfo [] InstanceNodeInfoList) {
        this.InstanceNodeInfoList = InstanceNodeInfoList;
    }

    public RealTimeTaskInstanceNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealTimeTaskInstanceNodeInfo(RealTimeTaskInstanceNodeInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.InstanceNodeInfoList != null) {
            this.InstanceNodeInfoList = new InstanceNodeInfo[source.InstanceNodeInfoList.length];
            for (int i = 0; i < source.InstanceNodeInfoList.length; i++) {
                this.InstanceNodeInfoList[i] = new InstanceNodeInfo(source.InstanceNodeInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "InstanceNodeInfoList.", this.InstanceNodeInfoList);

    }
}

