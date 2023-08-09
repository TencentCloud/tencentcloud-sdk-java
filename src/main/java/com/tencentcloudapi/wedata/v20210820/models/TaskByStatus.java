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

public class TaskByStatus extends AbstractModel{

    /**
    * 统计值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountGroup")
    @Expose
    private String CountGroup;

    /**
    * 日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowTimeGroup")
    @Expose
    private String ShowTimeGroup;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 周期单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 1
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * 1
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 统计值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountGroup 统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountGroup() {
        return this.CountGroup;
    }

    /**
     * Set 统计值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountGroup 统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountGroup(String CountGroup) {
        this.CountGroup = CountGroup;
    }

    /**
     * Get 日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowTimeGroup 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShowTimeGroup() {
        return this.ShowTimeGroup;
    }

    /**
     * Set 日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowTimeGroup 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowTimeGroup(String ShowTimeGroup) {
        this.ShowTimeGroup = ShowTimeGroup;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 周期单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleUnit 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleUnit 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 1 
     * @return ReportTime 1
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 1
     * @param ReportTime 1
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get 1 
     * @return Count 1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 1
     * @param Count 1
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public TaskByStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskByStatus(TaskByStatus source) {
        if (source.CountGroup != null) {
            this.CountGroup = new String(source.CountGroup);
        }
        if (source.ShowTimeGroup != null) {
            this.ShowTimeGroup = new String(source.ShowTimeGroup);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountGroup", this.CountGroup);
        this.setParamSimple(map, prefix + "ShowTimeGroup", this.ShowTimeGroup);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

