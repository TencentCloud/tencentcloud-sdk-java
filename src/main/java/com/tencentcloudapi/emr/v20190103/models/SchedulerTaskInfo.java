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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulerTaskInfo extends AbstractModel {

    /**
    * 调度器类型
    */
    @SerializedName("SchedulerName")
    @Expose
    private String SchedulerName;

    /**
    * 操作类型
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private SchedulerTaskDetail [] Details;

    /**
     * Get 调度器类型 
     * @return SchedulerName 调度器类型
     */
    public String getSchedulerName() {
        return this.SchedulerName;
    }

    /**
     * Set 调度器类型
     * @param SchedulerName 调度器类型
     */
    public void setSchedulerName(String SchedulerName) {
        this.SchedulerName = SchedulerName;
    }

    /**
     * Get 操作类型 
     * @return OperatorName 操作类型
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 操作类型
     * @param OperatorName 操作类型
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details 详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SchedulerTaskDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details 详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(SchedulerTaskDetail [] Details) {
        this.Details = Details;
    }

    public SchedulerTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulerTaskInfo(SchedulerTaskInfo source) {
        if (source.SchedulerName != null) {
            this.SchedulerName = new String(source.SchedulerName);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Details != null) {
            this.Details = new SchedulerTaskDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new SchedulerTaskDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SchedulerName", this.SchedulerName);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

