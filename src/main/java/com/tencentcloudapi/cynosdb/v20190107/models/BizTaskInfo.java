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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BizTaskInfo extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 延迟执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
    * 任务失败信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 异步任务流id
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 任务输入信息
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 实例组id
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * 实例组id
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务操作对象id
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 任务操作对象类型
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 操作者uin
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 任务输出信息
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 触发本任务的父任务ID
    */
    @SerializedName("TriggerTaskId")
    @Expose
    private Long TriggerTaskId;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 任务进度
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * 修改参数任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyParamsData")
    @Expose
    private ModifyParamsData [] ModifyParamsData;

    /**
    * 创建集群任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateClustersData")
    @Expose
    private CreateClustersData CreateClustersData;

    /**
    * 集群回档任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RollbackData")
    @Expose
    private RollbackData RollbackData;

    /**
    * 实例变配任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyInstanceData")
    @Expose
    private ModifyInstanceData ModifyInstanceData;

    /**
    * 手动备份任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualBackupData")
    @Expose
    private ManualBackupData ManualBackupData;

    /**
    * 修改内核版本任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyDbVersionData")
    @Expose
    private ModifyDbVersionData ModifyDbVersionData;

    /**
    * 集群可用区信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterSlaveData")
    @Expose
    private ClusterSlaveData ClusterSlaveData;

    /**
    * 转换集群日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchClusterLogBin")
    @Expose
    private SwitchClusterLogBin SwitchClusterLogBin;

    /**
    * 修改实例参数数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyInstanceParamsData")
    @Expose
    private BizTaskModifyParamsData ModifyInstanceParamsData;

    /**
    * 维护时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskMaintainInfo")
    @Expose
    private TaskMaintainInfo TaskMaintainInfo;

    /**
     * Get 任务id 
     * @return ID 任务id
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 任务id
     * @param ID 任务id
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 延迟执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime 延迟执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延迟执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime 延迟执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 任务失败信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 任务失败信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 任务失败信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 任务失败信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 异步任务流id 
     * @return FlowId 异步任务流id
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 异步任务流id
     * @param FlowId 异步任务流id
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 任务输入信息 
     * @return Input 任务输入信息
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 任务输入信息
     * @param Input 任务输入信息
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 实例组id 
     * @return InstanceGrpId 实例组id
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set 实例组id
     * @param InstanceGrpId 实例组id
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get 实例组id 
     * @return InstanceGroupId 实例组id
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例组id
     * @param InstanceGroupId 实例组id
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务操作对象id 
     * @return ObjectId 任务操作对象id
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 任务操作对象id
     * @param ObjectId 任务操作对象id
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 任务操作对象类型 
     * @return ObjectType 任务操作对象类型
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 任务操作对象类型
     * @param ObjectType 任务操作对象类型
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get 操作者uin 
     * @return Operator 操作者uin
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者uin
     * @param Operator 操作者uin
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 任务输出信息 
     * @return Output 任务输出信息
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 任务输出信息
     * @param Output 任务输出信息
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 触发本任务的父任务ID 
     * @return TriggerTaskId 触发本任务的父任务ID
     */
    public Long getTriggerTaskId() {
        return this.TriggerTaskId;
    }

    /**
     * Set 触发本任务的父任务ID
     * @param TriggerTaskId 触发本任务的父任务ID
     */
    public void setTriggerTaskId(Long TriggerTaskId) {
        this.TriggerTaskId = TriggerTaskId;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 任务开始时间 
     * @return StartTime 任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
     * @param StartTime 任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间 
     * @return EndTime 任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
     * @param EndTime 任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 任务进度 
     * @return Process 任务进度
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set 任务进度
     * @param Process 任务进度
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get 修改参数任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyParamsData 修改参数任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModifyParamsData [] getModifyParamsData() {
        return this.ModifyParamsData;
    }

    /**
     * Set 修改参数任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyParamsData 修改参数任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyParamsData(ModifyParamsData [] ModifyParamsData) {
        this.ModifyParamsData = ModifyParamsData;
    }

    /**
     * Get 创建集群任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateClustersData 创建集群任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateClustersData getCreateClustersData() {
        return this.CreateClustersData;
    }

    /**
     * Set 创建集群任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateClustersData 创建集群任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateClustersData(CreateClustersData CreateClustersData) {
        this.CreateClustersData = CreateClustersData;
    }

    /**
     * Get 集群回档任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RollbackData 集群回档任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RollbackData getRollbackData() {
        return this.RollbackData;
    }

    /**
     * Set 集群回档任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RollbackData 集群回档任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollbackData(RollbackData RollbackData) {
        this.RollbackData = RollbackData;
    }

    /**
     * Get 实例变配任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyInstanceData 实例变配任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModifyInstanceData getModifyInstanceData() {
        return this.ModifyInstanceData;
    }

    /**
     * Set 实例变配任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyInstanceData 实例变配任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyInstanceData(ModifyInstanceData ModifyInstanceData) {
        this.ModifyInstanceData = ModifyInstanceData;
    }

    /**
     * Get 手动备份任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualBackupData 手动备份任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ManualBackupData getManualBackupData() {
        return this.ManualBackupData;
    }

    /**
     * Set 手动备份任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualBackupData 手动备份任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualBackupData(ManualBackupData ManualBackupData) {
        this.ManualBackupData = ManualBackupData;
    }

    /**
     * Get 修改内核版本任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyDbVersionData 修改内核版本任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModifyDbVersionData getModifyDbVersionData() {
        return this.ModifyDbVersionData;
    }

    /**
     * Set 修改内核版本任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyDbVersionData 修改内核版本任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyDbVersionData(ModifyDbVersionData ModifyDbVersionData) {
        this.ModifyDbVersionData = ModifyDbVersionData;
    }

    /**
     * Get 集群可用区信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterSlaveData 集群可用区信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterSlaveData getClusterSlaveData() {
        return this.ClusterSlaveData;
    }

    /**
     * Set 集群可用区信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterSlaveData 集群可用区信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterSlaveData(ClusterSlaveData ClusterSlaveData) {
        this.ClusterSlaveData = ClusterSlaveData;
    }

    /**
     * Get 转换集群日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchClusterLogBin 转换集群日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchClusterLogBin getSwitchClusterLogBin() {
        return this.SwitchClusterLogBin;
    }

    /**
     * Set 转换集群日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchClusterLogBin 转换集群日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchClusterLogBin(SwitchClusterLogBin SwitchClusterLogBin) {
        this.SwitchClusterLogBin = SwitchClusterLogBin;
    }

    /**
     * Get 修改实例参数数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyInstanceParamsData 修改实例参数数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BizTaskModifyParamsData getModifyInstanceParamsData() {
        return this.ModifyInstanceParamsData;
    }

    /**
     * Set 修改实例参数数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyInstanceParamsData 修改实例参数数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyInstanceParamsData(BizTaskModifyParamsData ModifyInstanceParamsData) {
        this.ModifyInstanceParamsData = ModifyInstanceParamsData;
    }

    /**
     * Get 维护时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskMaintainInfo 维护时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskMaintainInfo getTaskMaintainInfo() {
        return this.TaskMaintainInfo;
    }

    /**
     * Set 维护时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskMaintainInfo 维护时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskMaintainInfo(TaskMaintainInfo TaskMaintainInfo) {
        this.TaskMaintainInfo = TaskMaintainInfo;
    }

    public BizTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizTaskInfo(BizTaskInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new String(source.DelayTime);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TriggerTaskId != null) {
            this.TriggerTaskId = new Long(source.TriggerTaskId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Process != null) {
            this.Process = new Long(source.Process);
        }
        if (source.ModifyParamsData != null) {
            this.ModifyParamsData = new ModifyParamsData[source.ModifyParamsData.length];
            for (int i = 0; i < source.ModifyParamsData.length; i++) {
                this.ModifyParamsData[i] = new ModifyParamsData(source.ModifyParamsData[i]);
            }
        }
        if (source.CreateClustersData != null) {
            this.CreateClustersData = new CreateClustersData(source.CreateClustersData);
        }
        if (source.RollbackData != null) {
            this.RollbackData = new RollbackData(source.RollbackData);
        }
        if (source.ModifyInstanceData != null) {
            this.ModifyInstanceData = new ModifyInstanceData(source.ModifyInstanceData);
        }
        if (source.ManualBackupData != null) {
            this.ManualBackupData = new ManualBackupData(source.ManualBackupData);
        }
        if (source.ModifyDbVersionData != null) {
            this.ModifyDbVersionData = new ModifyDbVersionData(source.ModifyDbVersionData);
        }
        if (source.ClusterSlaveData != null) {
            this.ClusterSlaveData = new ClusterSlaveData(source.ClusterSlaveData);
        }
        if (source.SwitchClusterLogBin != null) {
            this.SwitchClusterLogBin = new SwitchClusterLogBin(source.SwitchClusterLogBin);
        }
        if (source.ModifyInstanceParamsData != null) {
            this.ModifyInstanceParamsData = new BizTaskModifyParamsData(source.ModifyInstanceParamsData);
        }
        if (source.TaskMaintainInfo != null) {
            this.TaskMaintainInfo = new TaskMaintainInfo(source.TaskMaintainInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TriggerTaskId", this.TriggerTaskId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamArrayObj(map, prefix + "ModifyParamsData.", this.ModifyParamsData);
        this.setParamObj(map, prefix + "CreateClustersData.", this.CreateClustersData);
        this.setParamObj(map, prefix + "RollbackData.", this.RollbackData);
        this.setParamObj(map, prefix + "ModifyInstanceData.", this.ModifyInstanceData);
        this.setParamObj(map, prefix + "ManualBackupData.", this.ManualBackupData);
        this.setParamObj(map, prefix + "ModifyDbVersionData.", this.ModifyDbVersionData);
        this.setParamObj(map, prefix + "ClusterSlaveData.", this.ClusterSlaveData);
        this.setParamObj(map, prefix + "SwitchClusterLogBin.", this.SwitchClusterLogBin);
        this.setParamObj(map, prefix + "ModifyInstanceParamsData.", this.ModifyInstanceParamsData);
        this.setParamObj(map, prefix + "TaskMaintainInfo.", this.TaskMaintainInfo);

    }
}

