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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Results extends AbstractModel{

    /**
    * 测绘类型统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statistics")
    @Expose
    private AssetTypeStatistic [] Statistics;

    /**
    * 测绘结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private MappingResult [] Result;

    /**
    * 测绘任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * 最大测绘任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskMaxCount")
    @Expose
    private Long TaskMaxCount;

    /**
     * Get 测绘类型统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Statistics 测绘类型统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetTypeStatistic [] getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 测绘类型统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Statistics 测绘类型统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatistics(AssetTypeStatistic [] Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get 测绘结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 测绘结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MappingResult [] getResult() {
        return this.Result;
    }

    /**
     * Set 测绘结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 测绘结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(MappingResult [] Result) {
        this.Result = Result;
    }

    /**
     * Get 测绘任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCount 测绘任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set 测绘任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCount 测绘任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get 最大测绘任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskMaxCount 最大测绘任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskMaxCount() {
        return this.TaskMaxCount;
    }

    /**
     * Set 最大测绘任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskMaxCount 最大测绘任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskMaxCount(Long TaskMaxCount) {
        this.TaskMaxCount = TaskMaxCount;
    }

    public Results() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Results(Results source) {
        if (source.Statistics != null) {
            this.Statistics = new AssetTypeStatistic[source.Statistics.length];
            for (int i = 0; i < source.Statistics.length; i++) {
                this.Statistics[i] = new AssetTypeStatistic(source.Statistics[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new MappingResult[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new MappingResult(source.Result[i]);
            }
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.TaskMaxCount != null) {
            this.TaskMaxCount = new Long(source.TaskMaxCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "TaskMaxCount", this.TaskMaxCount);

    }
}

