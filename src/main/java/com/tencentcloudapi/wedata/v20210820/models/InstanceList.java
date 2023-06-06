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

public class InstanceList extends AbstractModel{

    /**
    * 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
    * 数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 是否补录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DoFlag")
    @Expose
    private Long DoFlag;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLog")
    @Expose
    private String LastLog;

    /**
    * 调度计划
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
     * Get 耗费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostTime 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostTime 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurRunDate 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurRunDate 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 是否补录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DoFlag 是否补录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDoFlag() {
        return this.DoFlag;
    }

    /**
     * Set 是否补录
注意：此字段可能返回 null，表示取不到有效值。
     * @param DoFlag 是否补录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDoFlag(Long DoFlag) {
        this.DoFlag = DoFlag;
    }

    /**
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLog 日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLog() {
        return this.LastLog;
    }

    /**
     * Set 日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLog 日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLog(String LastLog) {
        this.LastLog = LastLog;
    }

    /**
     * Get 调度计划
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDesc 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDesc 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TryLimit 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TryLimit 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    public InstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceList(InstanceList source) {
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.DoFlag != null) {
            this.DoFlag = new Long(source.DoFlag);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.LastLog != null) {
            this.LastLog = new String(source.LastLog);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "DoFlag", this.DoFlag);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "LastLog", this.LastLog);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);

    }
}

