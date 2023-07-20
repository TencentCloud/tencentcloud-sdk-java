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

public class WorkflowTaskCountOpsDto extends AbstractModel{

    /**
    * 工作流任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 任务类型维度统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeCount")
    @Expose
    private PairDto [] TypeCount;

    /**
    * 任务周期类型维度统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleCount")
    @Expose
    private PairDto [] CycleCount;

    /**
     * Get 工作流任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 工作流任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 工作流任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 工作流任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 任务类型维度统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeCount 任务类型维度统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PairDto [] getTypeCount() {
        return this.TypeCount;
    }

    /**
     * Set 任务类型维度统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeCount 任务类型维度统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeCount(PairDto [] TypeCount) {
        this.TypeCount = TypeCount;
    }

    /**
     * Get 任务周期类型维度统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleCount 任务周期类型维度统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PairDto [] getCycleCount() {
        return this.CycleCount;
    }

    /**
     * Set 任务周期类型维度统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleCount 任务周期类型维度统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleCount(PairDto [] CycleCount) {
        this.CycleCount = CycleCount;
    }

    public WorkflowTaskCountOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTaskCountOpsDto(WorkflowTaskCountOpsDto source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.TypeCount != null) {
            this.TypeCount = new PairDto[source.TypeCount.length];
            for (int i = 0; i < source.TypeCount.length; i++) {
                this.TypeCount[i] = new PairDto(source.TypeCount[i]);
            }
        }
        if (source.CycleCount != null) {
            this.CycleCount = new PairDto[source.CycleCount.length];
            for (int i = 0; i < source.CycleCount.length; i++) {
                this.CycleCount[i] = new PairDto(source.CycleCount[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "TypeCount.", this.TypeCount);
        this.setParamArrayObj(map, prefix + "CycleCount.", this.CycleCount);

    }
}

