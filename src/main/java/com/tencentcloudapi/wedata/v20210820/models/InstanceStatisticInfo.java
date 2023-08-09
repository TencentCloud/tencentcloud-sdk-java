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

public class InstanceStatisticInfo extends AbstractModel{

    /**
    * 实例状态趋势状态统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountList")
    @Expose
    private Long [] CountList;

    /**
    * 实例状态趋势时间分割
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeList")
    @Expose
    private String [] TimeList;

    /**
    * 实例状态标识：WAITING_RUNNING、KILLING、FAILED、FAILED_TRYING、SUCCEED 分别表示等待执行、正在终止、失败、失败重试、成功，用于实例状态分布和实例状态趋势
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 用于实例状态分布计数
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 当前展示时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowTime")
    @Expose
    private String ShowTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 实例状态趋势状态统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountList 实例状态趋势状态统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getCountList() {
        return this.CountList;
    }

    /**
     * Set 实例状态趋势状态统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountList 实例状态趋势状态统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountList(Long [] CountList) {
        this.CountList = CountList;
    }

    /**
     * Get 实例状态趋势时间分割
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeList 实例状态趋势时间分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTimeList() {
        return this.TimeList;
    }

    /**
     * Set 实例状态趋势时间分割
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeList 实例状态趋势时间分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeList(String [] TimeList) {
        this.TimeList = TimeList;
    }

    /**
     * Get 实例状态标识：WAITING_RUNNING、KILLING、FAILED、FAILED_TRYING、SUCCEED 分别表示等待执行、正在终止、失败、失败重试、成功，用于实例状态分布和实例状态趋势 
     * @return InstanceStatus 实例状态标识：WAITING_RUNNING、KILLING、FAILED、FAILED_TRYING、SUCCEED 分别表示等待执行、正在终止、失败、失败重试、成功，用于实例状态分布和实例状态趋势
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态标识：WAITING_RUNNING、KILLING、FAILED、FAILED_TRYING、SUCCEED 分别表示等待执行、正在终止、失败、失败重试、成功，用于实例状态分布和实例状态趋势
     * @param InstanceStatus 实例状态标识：WAITING_RUNNING、KILLING、FAILED、FAILED_TRYING、SUCCEED 分别表示等待执行、正在终止、失败、失败重试、成功，用于实例状态分布和实例状态趋势
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 用于实例状态分布计数 
     * @return InstanceCount 用于实例状态分布计数
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 用于实例状态分布计数
     * @param InstanceCount 用于实例状态分布计数
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 当前展示时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowTime 当前展示时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShowTime() {
        return this.ShowTime;
    }

    /**
     * Set 当前展示时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowTime 当前展示时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowTime(String ShowTime) {
        this.ShowTime = ShowTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public InstanceStatisticInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceStatisticInfo(InstanceStatisticInfo source) {
        if (source.CountList != null) {
            this.CountList = new Long[source.CountList.length];
            for (int i = 0; i < source.CountList.length; i++) {
                this.CountList[i] = new Long(source.CountList[i]);
            }
        }
        if (source.TimeList != null) {
            this.TimeList = new String[source.TimeList.length];
            for (int i = 0; i < source.TimeList.length; i++) {
                this.TimeList[i] = new String(source.TimeList[i]);
            }
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.ShowTime != null) {
            this.ShowTime = new String(source.ShowTime);
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
        this.setParamArraySimple(map, prefix + "CountList.", this.CountList);
        this.setParamArraySimple(map, prefix + "TimeList.", this.TimeList);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ShowTime", this.ShowTime);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

