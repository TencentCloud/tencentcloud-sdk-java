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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFlowSummary extends AbstractModel {

    /**
    * 任务流程名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentName")
    @Expose
    private String IntentName;

    /**
    * 实体列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedSlotValues")
    @Expose
    private ValueInfo [] UpdatedSlotValues;

    /**
    * 节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunNodes")
    @Expose
    private RunNodeInfo [] RunNodes;

    /**
    * 意图判断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Purposes")
    @Expose
    private String [] Purposes;

    /**
     * Get 任务流程名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentName 任务流程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentName() {
        return this.IntentName;
    }

    /**
     * Set 任务流程名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentName 任务流程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentName(String IntentName) {
        this.IntentName = IntentName;
    }

    /**
     * Get 实体列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedSlotValues 实体列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueInfo [] getUpdatedSlotValues() {
        return this.UpdatedSlotValues;
    }

    /**
     * Set 实体列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedSlotValues 实体列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedSlotValues(ValueInfo [] UpdatedSlotValues) {
        this.UpdatedSlotValues = UpdatedSlotValues;
    }

    /**
     * Get 节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunNodes 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RunNodeInfo [] getRunNodes() {
        return this.RunNodes;
    }

    /**
     * Set 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunNodes 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunNodes(RunNodeInfo [] RunNodes) {
        this.RunNodes = RunNodes;
    }

    /**
     * Get 意图判断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Purposes 意图判断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPurposes() {
        return this.Purposes;
    }

    /**
     * Set 意图判断
注意：此字段可能返回 null，表示取不到有效值。
     * @param Purposes 意图判断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPurposes(String [] Purposes) {
        this.Purposes = Purposes;
    }

    public TaskFlowSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFlowSummary(TaskFlowSummary source) {
        if (source.IntentName != null) {
            this.IntentName = new String(source.IntentName);
        }
        if (source.UpdatedSlotValues != null) {
            this.UpdatedSlotValues = new ValueInfo[source.UpdatedSlotValues.length];
            for (int i = 0; i < source.UpdatedSlotValues.length; i++) {
                this.UpdatedSlotValues[i] = new ValueInfo(source.UpdatedSlotValues[i]);
            }
        }
        if (source.RunNodes != null) {
            this.RunNodes = new RunNodeInfo[source.RunNodes.length];
            for (int i = 0; i < source.RunNodes.length; i++) {
                this.RunNodes[i] = new RunNodeInfo(source.RunNodes[i]);
            }
        }
        if (source.Purposes != null) {
            this.Purposes = new String[source.Purposes.length];
            for (int i = 0; i < source.Purposes.length; i++) {
                this.Purposes[i] = new String(source.Purposes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentName", this.IntentName);
        this.setParamArrayObj(map, prefix + "UpdatedSlotValues.", this.UpdatedSlotValues);
        this.setParamArrayObj(map, prefix + "RunNodes.", this.RunNodes);
        this.setParamArraySimple(map, prefix + "Purposes.", this.Purposes);

    }
}

