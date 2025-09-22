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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataBackfillRange extends AbstractModel {

    /**
    * 开始日期，格式yyyy-MM-dd 表示从指定日期的00:00:00开始
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期，格式yyyy-MM-dd，表示从指定日期的 23:59:59结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 在[StartDate, EndDate]之间每天的开始时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 在[StartDate, EndDate]之间每天的结束时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
     * Get 开始日期，格式yyyy-MM-dd 表示从指定日期的00:00:00开始
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartDate 开始日期，格式yyyy-MM-dd 表示从指定日期的00:00:00开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始日期，格式yyyy-MM-dd 表示从指定日期的00:00:00开始
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartDate 开始日期，格式yyyy-MM-dd 表示从指定日期的00:00:00开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束日期，格式yyyy-MM-dd，表示从指定日期的 23:59:59结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDate 结束日期，格式yyyy-MM-dd，表示从指定日期的 23:59:59结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期，格式yyyy-MM-dd，表示从指定日期的 23:59:59结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDate 结束日期，格式yyyy-MM-dd，表示从指定日期的 23:59:59结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 在[StartDate, EndDate]之间每天的开始时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime 在[StartDate, EndDate]之间每天的开始时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 在[StartDate, EndDate]之间每天的开始时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime 在[StartDate, EndDate]之间每天的开始时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 在[StartDate, EndDate]之间每天的结束时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime 在[StartDate, EndDate]之间每天的结束时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 在[StartDate, EndDate]之间每天的结束时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime 在[StartDate, EndDate]之间每天的结束时间点，格式HH:mm,只针对小时及周期小于小时的任务生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    public DataBackfillRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBackfillRange(DataBackfillRange source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);

    }
}

