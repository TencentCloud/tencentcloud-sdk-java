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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerScale extends AbstractModel {

    /**
    * 循环类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 循环起始
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 循环结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 起始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 副本个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
     * Get 循环类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 循环类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 循环类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 循环类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 循环起始
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartDate 循环起始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 循环起始
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartDate 循环起始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 循环结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDate 循环结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 循环结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDate 循环结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 起始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 副本个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicaNum 副本个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 副本个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicaNum 副本个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    public TimerScale() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerScale(TimerScale source) {
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);

    }
}

