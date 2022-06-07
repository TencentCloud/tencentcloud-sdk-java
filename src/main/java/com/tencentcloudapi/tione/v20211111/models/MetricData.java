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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricData extends AbstractModel{

    /**
    * 训练任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 时间戳.unix timestamp,单位为秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 本次上报数据所处的训练周期数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Epoch")
    @Expose
    private Long Epoch;

    /**
    * 本次上报数据所处的训练迭代次数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
    * 训练停止所需的迭代总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSteps")
    @Expose
    private Long TotalSteps;

    /**
    * 数据点。数组元素为不同指标的数据。数组长度不超过10。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Points")
    @Expose
    private DataPoint [] Points;

    /**
     * Get 训练任务id 
     * @return TaskId 训练任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 训练任务id
     * @param TaskId 训练任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 时间戳.unix timestamp,单位为秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 时间戳.unix timestamp,单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳.unix timestamp,单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 时间戳.unix timestamp,单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 本次上报数据所处的训练周期数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Epoch 本次上报数据所处的训练周期数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEpoch() {
        return this.Epoch;
    }

    /**
     * Set 本次上报数据所处的训练周期数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Epoch 本次上报数据所处的训练周期数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEpoch(Long Epoch) {
        this.Epoch = Epoch;
    }

    /**
     * Get 本次上报数据所处的训练迭代次数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Step 本次上报数据所处的训练迭代次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set 本次上报数据所处的训练迭代次数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Step 本次上报数据所处的训练迭代次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    /**
     * Get 训练停止所需的迭代总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSteps 训练停止所需的迭代总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalSteps() {
        return this.TotalSteps;
    }

    /**
     * Set 训练停止所需的迭代总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSteps 训练停止所需的迭代总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSteps(Long TotalSteps) {
        this.TotalSteps = TotalSteps;
    }

    /**
     * Get 数据点。数组元素为不同指标的数据。数组长度不超过10。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Points 数据点。数组元素为不同指标的数据。数组长度不超过10。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataPoint [] getPoints() {
        return this.Points;
    }

    /**
     * Set 数据点。数组元素为不同指标的数据。数组长度不超过10。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Points 数据点。数组元素为不同指标的数据。数组长度不超过10。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoints(DataPoint [] Points) {
        this.Points = Points;
    }

    public MetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricData(MetricData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Epoch != null) {
            this.Epoch = new Long(source.Epoch);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
        if (source.TotalSteps != null) {
            this.TotalSteps = new Long(source.TotalSteps);
        }
        if (source.Points != null) {
            this.Points = new DataPoint[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new DataPoint(source.Points[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Epoch", this.Epoch);
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "TotalSteps", this.TotalSteps);
        this.setParamArrayObj(map, prefix + "Points.", this.Points);

    }
}

