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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLifeCycleOpsDto extends AbstractModel {

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 实例生命次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeRound")
    @Expose
    private Long LifeRound;

    /**
    * 运行类型 重跑/补录/周期/非周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceLifeDetailDtoList")
    @Expose
    private InstanceLifeDetailDto [] InstanceLifeDetailDtoList;

    /**
    * Runner运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunnerState")
    @Expose
    private String RunnerState;

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * 错误告警级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeLevel")
    @Expose
    private String ErrorCodeLevel;

    /**
    * 实例日志简略信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceLogListOpsDto")
    @Expose
    private InstanceLogInfo InstanceLogListOpsDto;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private Long ScheduleRunType;

    /**
    * 统一执行平台，下发执行Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * 实例运行类型: 0: 普通运行, 1: 空跑运行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceRunType")
    @Expose
    private Long InstanceRunType;

    /**
    * 实例当前总生命周期数
    */
    @SerializedName("TotalLifeRound")
    @Expose
    private Long TotalLifeRound;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private TaskTypeOpsDto TaskType;

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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
     * Get 实例生命次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeRound 实例生命次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifeRound() {
        return this.LifeRound;
    }

    /**
     * Set 实例生命次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeRound 实例生命次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeRound(Long LifeRound) {
        this.LifeRound = LifeRound;
    }

    /**
     * Get 运行类型 重跑/补录/周期/非周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunType 运行类型 重跑/补录/周期/非周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set 运行类型 重跑/补录/周期/非周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunType 运行类型 重跑/补录/周期/非周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get 重跑次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tries 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tries 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceLifeDetailDtoList 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceLifeDetailDto [] getInstanceLifeDetailDtoList() {
        return this.InstanceLifeDetailDtoList;
    }

    /**
     * Set 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceLifeDetailDtoList 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceLifeDetailDtoList(InstanceLifeDetailDto [] InstanceLifeDetailDtoList) {
        this.InstanceLifeDetailDtoList = InstanceLifeDetailDtoList;
    }

    /**
     * Get Runner运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunnerState Runner运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunnerState() {
        return this.RunnerState;
    }

    /**
     * Set Runner运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunnerState Runner运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunnerState(String RunnerState) {
        this.RunnerState = RunnerState;
    }

    /**
     * Get 错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorDesc 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set 错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorDesc 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get 错误告警级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeLevel 错误告警级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeLevel() {
        return this.ErrorCodeLevel;
    }

    /**
     * Set 错误告警级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeLevel 错误告警级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeLevel(String ErrorCodeLevel) {
        this.ErrorCodeLevel = ErrorCodeLevel;
    }

    /**
     * Get 实例日志简略信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceLogListOpsDto 实例日志简略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceLogInfo getInstanceLogListOpsDto() {
        return this.InstanceLogListOpsDto;
    }

    /**
     * Set 实例日志简略信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceLogListOpsDto 实例日志简略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceLogListOpsDto(InstanceLogInfo InstanceLogListOpsDto) {
        this.InstanceLogListOpsDto = InstanceLogListOpsDto;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceState 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceState 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleRunType 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleRunType 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleRunType(Long ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get 统一执行平台，下发执行Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionJobId 统一执行平台，下发执行Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set 统一执行平台，下发执行Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionJobId 统一执行平台，下发执行Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get 实例运行类型: 0: 普通运行, 1: 空跑运行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceRunType 实例运行类型: 0: 普通运行, 1: 空跑运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceRunType() {
        return this.InstanceRunType;
    }

    /**
     * Set 实例运行类型: 0: 普通运行, 1: 空跑运行
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceRunType 实例运行类型: 0: 普通运行, 1: 空跑运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceRunType(Long InstanceRunType) {
        this.InstanceRunType = InstanceRunType;
    }

    /**
     * Get 实例当前总生命周期数 
     * @return TotalLifeRound 实例当前总生命周期数
     */
    public Long getTotalLifeRound() {
        return this.TotalLifeRound;
    }

    /**
     * Set 实例当前总生命周期数
     * @param TotalLifeRound 实例当前总生命周期数
     */
    public void setTotalLifeRound(Long TotalLifeRound) {
        this.TotalLifeRound = TotalLifeRound;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeOpsDto getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(TaskTypeOpsDto TaskType) {
        this.TaskType = TaskType;
    }

    public InstanceLifeCycleOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLifeCycleOpsDto(InstanceLifeCycleOpsDto source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.LifeRound != null) {
            this.LifeRound = new Long(source.LifeRound);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.InstanceLifeDetailDtoList != null) {
            this.InstanceLifeDetailDtoList = new InstanceLifeDetailDto[source.InstanceLifeDetailDtoList.length];
            for (int i = 0; i < source.InstanceLifeDetailDtoList.length; i++) {
                this.InstanceLifeDetailDtoList[i] = new InstanceLifeDetailDto(source.InstanceLifeDetailDtoList[i]);
            }
        }
        if (source.RunnerState != null) {
            this.RunnerState = new String(source.RunnerState);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
        if (source.ErrorCodeLevel != null) {
            this.ErrorCodeLevel = new String(source.ErrorCodeLevel);
        }
        if (source.InstanceLogListOpsDto != null) {
            this.InstanceLogListOpsDto = new InstanceLogInfo(source.InstanceLogListOpsDto);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.ScheduleRunType != null) {
            this.ScheduleRunType = new Long(source.ScheduleRunType);
        }
        if (source.ExecutionJobId != null) {
            this.ExecutionJobId = new String(source.ExecutionJobId);
        }
        if (source.InstanceRunType != null) {
            this.InstanceRunType = new Long(source.InstanceRunType);
        }
        if (source.TotalLifeRound != null) {
            this.TotalLifeRound = new Long(source.TotalLifeRound);
        }
        if (source.TaskType != null) {
            this.TaskType = new TaskTypeOpsDto(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "LifeRound", this.LifeRound);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamArrayObj(map, prefix + "InstanceLifeDetailDtoList.", this.InstanceLifeDetailDtoList);
        this.setParamSimple(map, prefix + "RunnerState", this.RunnerState);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);
        this.setParamSimple(map, prefix + "ErrorCodeLevel", this.ErrorCodeLevel);
        this.setParamObj(map, prefix + "InstanceLogListOpsDto.", this.InstanceLogListOpsDto);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "ScheduleRunType", this.ScheduleRunType);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "InstanceRunType", this.InstanceRunType);
        this.setParamSimple(map, prefix + "TotalLifeRound", this.TotalLifeRound);
        this.setParamObj(map, prefix + "TaskType.", this.TaskType);

    }
}

