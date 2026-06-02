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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BizTaskInfo extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>用户appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>延迟执行时间</p>
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
    * <p>任务失败信息</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>异步任务流id</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>任务输入信息</p>
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * <p>实例组id</p>
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * <p>实例组id</p>
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>任务操作对象id</p>
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * <p>任务操作对象类型</p>
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * <p>操作者uin</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>任务输出信息</p>
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * <p>任务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务类型</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>触发本任务的父任务ID</p>
    */
    @SerializedName("TriggerTaskId")
    @Expose
    private Long TriggerTaskId;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>任务开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>任务进度</p>
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * <p>修改参数任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyParamsData")
    @Expose
    private ModifyParamsData [] ModifyParamsData;

    /**
    * <p>创建集群任务信息</p>
    */
    @SerializedName("CreateClustersData")
    @Expose
    private CreateClustersData CreateClustersData;

    /**
    * <p>集群回档任务信息</p>
    */
    @SerializedName("RollbackData")
    @Expose
    private RollbackData RollbackData;

    /**
    * <p>实例变配任务信息</p>
    */
    @SerializedName("ModifyInstanceData")
    @Expose
    private ModifyInstanceData ModifyInstanceData;

    /**
    * <p>手动备份任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualBackupData")
    @Expose
    private ManualBackupData ManualBackupData;

    /**
    * <p>修改内核版本任务信息</p>
    */
    @SerializedName("ModifyDbVersionData")
    @Expose
    private ModifyDbVersionData ModifyDbVersionData;

    /**
    * <p>集群可用区信息</p>
    */
    @SerializedName("ClusterSlaveData")
    @Expose
    private ClusterSlaveData ClusterSlaveData;

    /**
    * <p>转换集群日志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchClusterLogBin")
    @Expose
    private SwitchClusterLogBin SwitchClusterLogBin;

    /**
    * <p>修改实例参数数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyInstanceParamsData")
    @Expose
    private BizTaskModifyParamsData ModifyInstanceParamsData;

    /**
    * <p>维护时间</p>
    */
    @SerializedName("TaskMaintainInfo")
    @Expose
    private TaskMaintainInfo TaskMaintainInfo;

    /**
    * <p>实例日志投递信息</p>
    */
    @SerializedName("InstanceCLSDeliveryInfos")
    @Expose
    private InstanceCLSDeliveryInfo [] InstanceCLSDeliveryInfos;

    /**
    * <p>任务进度信息</p>
    */
    @SerializedName("TaskProgressInfo")
    @Expose
    private TaskProgressInfo TaskProgressInfo;

    /**
    * <p>全球数据库网络任务</p>
    */
    @SerializedName("GdnTaskInfo")
    @Expose
    private GdnTaskInfo GdnTaskInfo;

    /**
    * <p>保险箱id</p>
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * <p>保险箱名称</p>
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * <p>AI优化器任务信息</p>
    */
    @SerializedName("AIOptimizerTaskData")
    @Expose
    private AIOptimizerTaskData AIOptimizerTaskData;

    /**
     * Get <p>任务id</p> 
     * @return ID <p>任务id</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>任务id</p>
     * @param ID <p>任务id</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>用户appid</p> 
     * @return AppId <p>用户appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户appid</p>
     * @param AppId <p>用户appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreateTime <p>任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreateTime <p>任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>延迟执行时间</p> 
     * @return DelayTime <p>延迟执行时间</p>
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>延迟执行时间</p>
     * @param DelayTime <p>延迟执行时间</p>
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>任务失败信息</p> 
     * @return ErrMsg <p>任务失败信息</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>任务失败信息</p>
     * @param ErrMsg <p>任务失败信息</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>异步任务流id</p> 
     * @return FlowId <p>异步任务流id</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>异步任务流id</p>
     * @param FlowId <p>异步任务流id</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>任务输入信息</p> 
     * @return Input <p>任务输入信息</p>
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set <p>任务输入信息</p>
     * @param Input <p>任务输入信息</p>
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get <p>实例组id</p> 
     * @return InstanceGrpId <p>实例组id</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set <p>实例组id</p>
     * @param InstanceGrpId <p>实例组id</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get <p>实例组id</p> 
     * @return InstanceGroupId <p>实例组id</p>
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set <p>实例组id</p>
     * @param InstanceGroupId <p>实例组id</p>
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>任务操作对象id</p> 
     * @return ObjectId <p>任务操作对象id</p>
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>任务操作对象id</p>
     * @param ObjectId <p>任务操作对象id</p>
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>任务操作对象类型</p> 
     * @return ObjectType <p>任务操作对象类型</p>
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>任务操作对象类型</p>
     * @param ObjectType <p>任务操作对象类型</p>
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get <p>操作者uin</p> 
     * @return Operator <p>操作者uin</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者uin</p>
     * @param Operator <p>操作者uin</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>任务输出信息</p> 
     * @return Output <p>任务输出信息</p>
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set <p>任务输出信息</p>
     * @param Output <p>任务输出信息</p>
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get <p>任务状态</p> 
     * @return Status <p>任务状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p>
     * @param Status <p>任务状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务类型</p> 
     * @return TaskType <p>任务类型</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p>
     * @param TaskType <p>任务类型</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>触发本任务的父任务ID</p> 
     * @return TriggerTaskId <p>触发本任务的父任务ID</p>
     */
    public Long getTriggerTaskId() {
        return this.TriggerTaskId;
    }

    /**
     * Set <p>触发本任务的父任务ID</p>
     * @param TriggerTaskId <p>触发本任务的父任务ID</p>
     */
    public void setTriggerTaskId(Long TriggerTaskId) {
        this.TriggerTaskId = TriggerTaskId;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>任务开始时间</p> 
     * @return StartTime <p>任务开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始时间</p>
     * @param StartTime <p>任务开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务结束时间</p> 
     * @return EndTime <p>任务结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务结束时间</p>
     * @param EndTime <p>任务结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>任务进度</p> 
     * @return Process <p>任务进度</p>
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set <p>任务进度</p>
     * @param Process <p>任务进度</p>
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get <p>修改参数任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyParamsData <p>修改参数任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public ModifyParamsData [] getModifyParamsData() {
        return this.ModifyParamsData;
    }

    /**
     * Set <p>修改参数任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyParamsData <p>修改参数任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setModifyParamsData(ModifyParamsData [] ModifyParamsData) {
        this.ModifyParamsData = ModifyParamsData;
    }

    /**
     * Get <p>创建集群任务信息</p> 
     * @return CreateClustersData <p>创建集群任务信息</p>
     */
    public CreateClustersData getCreateClustersData() {
        return this.CreateClustersData;
    }

    /**
     * Set <p>创建集群任务信息</p>
     * @param CreateClustersData <p>创建集群任务信息</p>
     */
    public void setCreateClustersData(CreateClustersData CreateClustersData) {
        this.CreateClustersData = CreateClustersData;
    }

    /**
     * Get <p>集群回档任务信息</p> 
     * @return RollbackData <p>集群回档任务信息</p>
     */
    public RollbackData getRollbackData() {
        return this.RollbackData;
    }

    /**
     * Set <p>集群回档任务信息</p>
     * @param RollbackData <p>集群回档任务信息</p>
     */
    public void setRollbackData(RollbackData RollbackData) {
        this.RollbackData = RollbackData;
    }

    /**
     * Get <p>实例变配任务信息</p> 
     * @return ModifyInstanceData <p>实例变配任务信息</p>
     */
    public ModifyInstanceData getModifyInstanceData() {
        return this.ModifyInstanceData;
    }

    /**
     * Set <p>实例变配任务信息</p>
     * @param ModifyInstanceData <p>实例变配任务信息</p>
     */
    public void setModifyInstanceData(ModifyInstanceData ModifyInstanceData) {
        this.ModifyInstanceData = ModifyInstanceData;
    }

    /**
     * Get <p>手动备份任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualBackupData <p>手动备份任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ManualBackupData getManualBackupData() {
        return this.ManualBackupData;
    }

    /**
     * Set <p>手动备份任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualBackupData <p>手动备份任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualBackupData(ManualBackupData ManualBackupData) {
        this.ManualBackupData = ManualBackupData;
    }

    /**
     * Get <p>修改内核版本任务信息</p> 
     * @return ModifyDbVersionData <p>修改内核版本任务信息</p>
     */
    public ModifyDbVersionData getModifyDbVersionData() {
        return this.ModifyDbVersionData;
    }

    /**
     * Set <p>修改内核版本任务信息</p>
     * @param ModifyDbVersionData <p>修改内核版本任务信息</p>
     */
    public void setModifyDbVersionData(ModifyDbVersionData ModifyDbVersionData) {
        this.ModifyDbVersionData = ModifyDbVersionData;
    }

    /**
     * Get <p>集群可用区信息</p> 
     * @return ClusterSlaveData <p>集群可用区信息</p>
     */
    public ClusterSlaveData getClusterSlaveData() {
        return this.ClusterSlaveData;
    }

    /**
     * Set <p>集群可用区信息</p>
     * @param ClusterSlaveData <p>集群可用区信息</p>
     */
    public void setClusterSlaveData(ClusterSlaveData ClusterSlaveData) {
        this.ClusterSlaveData = ClusterSlaveData;
    }

    /**
     * Get <p>转换集群日志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchClusterLogBin <p>转换集群日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchClusterLogBin getSwitchClusterLogBin() {
        return this.SwitchClusterLogBin;
    }

    /**
     * Set <p>转换集群日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchClusterLogBin <p>转换集群日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchClusterLogBin(SwitchClusterLogBin SwitchClusterLogBin) {
        this.SwitchClusterLogBin = SwitchClusterLogBin;
    }

    /**
     * Get <p>修改实例参数数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyInstanceParamsData <p>修改实例参数数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BizTaskModifyParamsData getModifyInstanceParamsData() {
        return this.ModifyInstanceParamsData;
    }

    /**
     * Set <p>修改实例参数数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyInstanceParamsData <p>修改实例参数数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyInstanceParamsData(BizTaskModifyParamsData ModifyInstanceParamsData) {
        this.ModifyInstanceParamsData = ModifyInstanceParamsData;
    }

    /**
     * Get <p>维护时间</p> 
     * @return TaskMaintainInfo <p>维护时间</p>
     */
    public TaskMaintainInfo getTaskMaintainInfo() {
        return this.TaskMaintainInfo;
    }

    /**
     * Set <p>维护时间</p>
     * @param TaskMaintainInfo <p>维护时间</p>
     */
    public void setTaskMaintainInfo(TaskMaintainInfo TaskMaintainInfo) {
        this.TaskMaintainInfo = TaskMaintainInfo;
    }

    /**
     * Get <p>实例日志投递信息</p> 
     * @return InstanceCLSDeliveryInfos <p>实例日志投递信息</p>
     */
    public InstanceCLSDeliveryInfo [] getInstanceCLSDeliveryInfos() {
        return this.InstanceCLSDeliveryInfos;
    }

    /**
     * Set <p>实例日志投递信息</p>
     * @param InstanceCLSDeliveryInfos <p>实例日志投递信息</p>
     */
    public void setInstanceCLSDeliveryInfos(InstanceCLSDeliveryInfo [] InstanceCLSDeliveryInfos) {
        this.InstanceCLSDeliveryInfos = InstanceCLSDeliveryInfos;
    }

    /**
     * Get <p>任务进度信息</p> 
     * @return TaskProgressInfo <p>任务进度信息</p>
     */
    public TaskProgressInfo getTaskProgressInfo() {
        return this.TaskProgressInfo;
    }

    /**
     * Set <p>任务进度信息</p>
     * @param TaskProgressInfo <p>任务进度信息</p>
     */
    public void setTaskProgressInfo(TaskProgressInfo TaskProgressInfo) {
        this.TaskProgressInfo = TaskProgressInfo;
    }

    /**
     * Get <p>全球数据库网络任务</p> 
     * @return GdnTaskInfo <p>全球数据库网络任务</p>
     */
    public GdnTaskInfo getGdnTaskInfo() {
        return this.GdnTaskInfo;
    }

    /**
     * Set <p>全球数据库网络任务</p>
     * @param GdnTaskInfo <p>全球数据库网络任务</p>
     */
    public void setGdnTaskInfo(GdnTaskInfo GdnTaskInfo) {
        this.GdnTaskInfo = GdnTaskInfo;
    }

    /**
     * Get <p>保险箱id</p> 
     * @return VaultId <p>保险箱id</p>
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set <p>保险箱id</p>
     * @param VaultId <p>保险箱id</p>
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get <p>保险箱名称</p> 
     * @return VaultName <p>保险箱名称</p>
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set <p>保险箱名称</p>
     * @param VaultName <p>保险箱名称</p>
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get <p>AI优化器任务信息</p> 
     * @return AIOptimizerTaskData <p>AI优化器任务信息</p>
     */
    public AIOptimizerTaskData getAIOptimizerTaskData() {
        return this.AIOptimizerTaskData;
    }

    /**
     * Set <p>AI优化器任务信息</p>
     * @param AIOptimizerTaskData <p>AI优化器任务信息</p>
     */
    public void setAIOptimizerTaskData(AIOptimizerTaskData AIOptimizerTaskData) {
        this.AIOptimizerTaskData = AIOptimizerTaskData;
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
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
        if (source.InstanceCLSDeliveryInfos != null) {
            this.InstanceCLSDeliveryInfos = new InstanceCLSDeliveryInfo[source.InstanceCLSDeliveryInfos.length];
            for (int i = 0; i < source.InstanceCLSDeliveryInfos.length; i++) {
                this.InstanceCLSDeliveryInfos[i] = new InstanceCLSDeliveryInfo(source.InstanceCLSDeliveryInfos[i]);
            }
        }
        if (source.TaskProgressInfo != null) {
            this.TaskProgressInfo = new TaskProgressInfo(source.TaskProgressInfo);
        }
        if (source.GdnTaskInfo != null) {
            this.GdnTaskInfo = new GdnTaskInfo(source.GdnTaskInfo);
        }
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.AIOptimizerTaskData != null) {
            this.AIOptimizerTaskData = new AIOptimizerTaskData(source.AIOptimizerTaskData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
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
        this.setParamArrayObj(map, prefix + "InstanceCLSDeliveryInfos.", this.InstanceCLSDeliveryInfos);
        this.setParamObj(map, prefix + "TaskProgressInfo.", this.TaskProgressInfo);
        this.setParamObj(map, prefix + "GdnTaskInfo.", this.GdnTaskInfo);
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamObj(map, prefix + "AIOptimizerTaskData.", this.AIOptimizerTaskData);

    }
}

