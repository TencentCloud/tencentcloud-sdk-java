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

public class RuntimeInstanceCntTop extends AbstractModel{

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunTime")
    @Expose
    private Long RunTime;

    /**
    * 实例运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurRunTime")
    @Expose
    private String CurRunTime;

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
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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
     * Get 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleUnit 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleUnit 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
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
     * Get 耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunTime 耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunTime() {
        return this.RunTime;
    }

    /**
     * Set 耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunTime 耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunTime(Long RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get 实例运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurRunTime 实例运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurRunTime() {
        return this.CurRunTime;
    }

    /**
     * Set 实例运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurRunTime 实例运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurRunTime(String CurRunTime) {
        this.CurRunTime = CurRunTime;
    }

    public RuntimeInstanceCntTop() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeInstanceCntTop(RuntimeInstanceCntTop source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.RunTime != null) {
            this.RunTime = new Long(source.RunTime);
        }
        if (source.CurRunTime != null) {
            this.CurRunTime = new String(source.CurRunTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamSimple(map, prefix + "CurRunTime", this.CurRunTime);

    }
}

