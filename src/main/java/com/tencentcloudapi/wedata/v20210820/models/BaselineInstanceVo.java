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

public class BaselineInstanceVo extends AbstractModel{

    /**
    * 基线实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 基线id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * 基线名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineName")
    @Expose
    private String BaselineName;

    /**
    * 基线类型，D: 天基线 / H 小时基线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineType")
    @Expose
    private String BaselineType;

    /**
    * 基线实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineDataTime")
    @Expose
    private String BaselineDataTime;

    /**
    * 基线实例生成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 基线实例预计完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EstimatedEndTime")
    @Expose
    private String EstimatedEndTime;

    /**
    * 基线实例状态，P:暂停/ SF:安全/ WN:预警/ BL:破线 / TF:任务失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineInstanceStatus")
    @Expose
    private String BaselineInstanceStatus;

    /**
    * 责任人uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeUin")
    @Expose
    private String InChargeUin;

    /**
    * 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeName")
    @Expose
    private String InChargeName;

    /**
    * 预警余量/单位分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarningMargin")
    @Expose
    private Long WarningMargin;

    /**
    * 承诺时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromiseTime")
    @Expose
    private String PromiseTime;

    /**
    * 告警级别 N: 普通 / I重要 / E: 紧急
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private String AlarmLevel;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 基线实例ready状态。NEW_GENERATED_INSTANCE:产生实例/RENDER_DAG:渲染DAG/CALCULATE_PATH:计算路径/COMPLETE:完成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsReady")
    @Expose
    private String IsReady;

    /**
    * 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardKey")
    @Expose
    private String ShardKey;

    /**
    * 异常任务实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionalTaskInstances")
    @Expose
    private BaselineTaskInstanceDto [] ExceptionalTaskInstances;

    /**
    * 关联的所有任务实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInstances")
    @Expose
    private BaselineTaskInstanceDto [] TaskInstances;

    /**
    * 任务实例DAG整体启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CriticalStartTime")
    @Expose
    private String CriticalStartTime;

    /**
    * 基线实例上的关键任务实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CriticalTaskInstances")
    @Expose
    private BaselineTaskInstanceDto [] CriticalTaskInstances;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 基线实例与保障任务实例映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineTaskInstances")
    @Expose
    private BaselineTaskInstanceDto [] BaselineTaskInstances;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
     * Get 基线实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 基线实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 基线实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 基线实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 基线id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineId 基线id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set 基线id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineId 基线id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineId(Long BaselineId) {
        this.BaselineId = BaselineId;
    }

    /**
     * Get 基线名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineName 基线名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaselineName() {
        return this.BaselineName;
    }

    /**
     * Set 基线名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineName 基线名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineName(String BaselineName) {
        this.BaselineName = BaselineName;
    }

    /**
     * Get 基线类型，D: 天基线 / H 小时基线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineType 基线类型，D: 天基线 / H 小时基线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaselineType() {
        return this.BaselineType;
    }

    /**
     * Set 基线类型，D: 天基线 / H 小时基线
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineType 基线类型，D: 天基线 / H 小时基线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineType(String BaselineType) {
        this.BaselineType = BaselineType;
    }

    /**
     * Get 基线实例数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineDataTime 基线实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaselineDataTime() {
        return this.BaselineDataTime;
    }

    /**
     * Set 基线实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineDataTime 基线实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineDataTime(String BaselineDataTime) {
        this.BaselineDataTime = BaselineDataTime;
    }

    /**
     * Get 基线实例生成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 基线实例生成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 基线实例生成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 基线实例生成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 基线实例预计完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EstimatedEndTime 基线实例预计完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEstimatedEndTime() {
        return this.EstimatedEndTime;
    }

    /**
     * Set 基线实例预计完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EstimatedEndTime 基线实例预计完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEstimatedEndTime(String EstimatedEndTime) {
        this.EstimatedEndTime = EstimatedEndTime;
    }

    /**
     * Get 基线实例状态，P:暂停/ SF:安全/ WN:预警/ BL:破线 / TF:任务失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineInstanceStatus 基线实例状态，P:暂停/ SF:安全/ WN:预警/ BL:破线 / TF:任务失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaselineInstanceStatus() {
        return this.BaselineInstanceStatus;
    }

    /**
     * Set 基线实例状态，P:暂停/ SF:安全/ WN:预警/ BL:破线 / TF:任务失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineInstanceStatus 基线实例状态，P:暂停/ SF:安全/ WN:预警/ BL:破线 / TF:任务失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineInstanceStatus(String BaselineInstanceStatus) {
        this.BaselineInstanceStatus = BaselineInstanceStatus;
    }

    /**
     * Get 责任人uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeUin 责任人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeUin() {
        return this.InChargeUin;
    }

    /**
     * Set 责任人uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeUin 责任人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeUin(String InChargeUin) {
        this.InChargeUin = InChargeUin;
    }

    /**
     * Get 责任人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeName 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeName() {
        return this.InChargeName;
    }

    /**
     * Set 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeName 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeName(String InChargeName) {
        this.InChargeName = InChargeName;
    }

    /**
     * Get 预警余量/单位分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarningMargin 预警余量/单位分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarningMargin() {
        return this.WarningMargin;
    }

    /**
     * Set 预警余量/单位分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarningMargin 预警余量/单位分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarningMargin(Long WarningMargin) {
        this.WarningMargin = WarningMargin;
    }

    /**
     * Get 承诺时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromiseTime 承诺时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPromiseTime() {
        return this.PromiseTime;
    }

    /**
     * Set 承诺时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromiseTime 承诺时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromiseTime(String PromiseTime) {
        this.PromiseTime = PromiseTime;
    }

    /**
     * Get 告警级别 N: 普通 / I重要 / E: 紧急
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmLevel 告警级别 N: 普通 / I重要 / E: 紧急
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别 N: 普通 / I重要 / E: 紧急
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmLevel 告警级别 N: 普通 / I重要 / E: 紧急
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmLevel(String AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 基线实例ready状态。NEW_GENERATED_INSTANCE:产生实例/RENDER_DAG:渲染DAG/CALCULATE_PATH:计算路径/COMPLETE:完成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsReady 基线实例ready状态。NEW_GENERATED_INSTANCE:产生实例/RENDER_DAG:渲染DAG/CALCULATE_PATH:计算路径/COMPLETE:完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsReady() {
        return this.IsReady;
    }

    /**
     * Set 基线实例ready状态。NEW_GENERATED_INSTANCE:产生实例/RENDER_DAG:渲染DAG/CALCULATE_PATH:计算路径/COMPLETE:完成
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsReady 基线实例ready状态。NEW_GENERATED_INSTANCE:产生实例/RENDER_DAG:渲染DAG/CALCULATE_PATH:计算路径/COMPLETE:完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsReady(String IsReady) {
        this.IsReady = IsReady;
    }

    /**
     * Get 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardKey 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardKey() {
        return this.ShardKey;
    }

    /**
     * Set 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardKey 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardKey(String ShardKey) {
        this.ShardKey = ShardKey;
    }

    /**
     * Get 异常任务实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionalTaskInstances 异常任务实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineTaskInstanceDto [] getExceptionalTaskInstances() {
        return this.ExceptionalTaskInstances;
    }

    /**
     * Set 异常任务实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionalTaskInstances 异常任务实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionalTaskInstances(BaselineTaskInstanceDto [] ExceptionalTaskInstances) {
        this.ExceptionalTaskInstances = ExceptionalTaskInstances;
    }

    /**
     * Get 关联的所有任务实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInstances 关联的所有任务实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineTaskInstanceDto [] getTaskInstances() {
        return this.TaskInstances;
    }

    /**
     * Set 关联的所有任务实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInstances 关联的所有任务实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInstances(BaselineTaskInstanceDto [] TaskInstances) {
        this.TaskInstances = TaskInstances;
    }

    /**
     * Get 任务实例DAG整体启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CriticalStartTime 任务实例DAG整体启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCriticalStartTime() {
        return this.CriticalStartTime;
    }

    /**
     * Set 任务实例DAG整体启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CriticalStartTime 任务实例DAG整体启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCriticalStartTime(String CriticalStartTime) {
        this.CriticalStartTime = CriticalStartTime;
    }

    /**
     * Get 基线实例上的关键任务实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CriticalTaskInstances 基线实例上的关键任务实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineTaskInstanceDto [] getCriticalTaskInstances() {
        return this.CriticalTaskInstances;
    }

    /**
     * Set 基线实例上的关键任务实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param CriticalTaskInstances 基线实例上的关键任务实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCriticalTaskInstances(BaselineTaskInstanceDto [] CriticalTaskInstances) {
        this.CriticalTaskInstances = CriticalTaskInstances;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 基线实例与保障任务实例映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineTaskInstances 基线实例与保障任务实例映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineTaskInstanceDto [] getBaselineTaskInstances() {
        return this.BaselineTaskInstances;
    }

    /**
     * Set 基线实例与保障任务实例映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineTaskInstances 基线实例与保障任务实例映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineTaskInstances(BaselineTaskInstanceDto [] BaselineTaskInstances) {
        this.BaselineTaskInstances = BaselineTaskInstances;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    public BaselineInstanceVo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineInstanceVo(BaselineInstanceVo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.BaselineId != null) {
            this.BaselineId = new Long(source.BaselineId);
        }
        if (source.BaselineName != null) {
            this.BaselineName = new String(source.BaselineName);
        }
        if (source.BaselineType != null) {
            this.BaselineType = new String(source.BaselineType);
        }
        if (source.BaselineDataTime != null) {
            this.BaselineDataTime = new String(source.BaselineDataTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EstimatedEndTime != null) {
            this.EstimatedEndTime = new String(source.EstimatedEndTime);
        }
        if (source.BaselineInstanceStatus != null) {
            this.BaselineInstanceStatus = new String(source.BaselineInstanceStatus);
        }
        if (source.InChargeUin != null) {
            this.InChargeUin = new String(source.InChargeUin);
        }
        if (source.InChargeName != null) {
            this.InChargeName = new String(source.InChargeName);
        }
        if (source.WarningMargin != null) {
            this.WarningMargin = new Long(source.WarningMargin);
        }
        if (source.PromiseTime != null) {
            this.PromiseTime = new String(source.PromiseTime);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new String(source.AlarmLevel);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.IsReady != null) {
            this.IsReady = new String(source.IsReady);
        }
        if (source.ShardKey != null) {
            this.ShardKey = new String(source.ShardKey);
        }
        if (source.ExceptionalTaskInstances != null) {
            this.ExceptionalTaskInstances = new BaselineTaskInstanceDto[source.ExceptionalTaskInstances.length];
            for (int i = 0; i < source.ExceptionalTaskInstances.length; i++) {
                this.ExceptionalTaskInstances[i] = new BaselineTaskInstanceDto(source.ExceptionalTaskInstances[i]);
            }
        }
        if (source.TaskInstances != null) {
            this.TaskInstances = new BaselineTaskInstanceDto[source.TaskInstances.length];
            for (int i = 0; i < source.TaskInstances.length; i++) {
                this.TaskInstances[i] = new BaselineTaskInstanceDto(source.TaskInstances[i]);
            }
        }
        if (source.CriticalStartTime != null) {
            this.CriticalStartTime = new String(source.CriticalStartTime);
        }
        if (source.CriticalTaskInstances != null) {
            this.CriticalTaskInstances = new BaselineTaskInstanceDto[source.CriticalTaskInstances.length];
            for (int i = 0; i < source.CriticalTaskInstances.length; i++) {
                this.CriticalTaskInstances[i] = new BaselineTaskInstanceDto(source.CriticalTaskInstances[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.BaselineTaskInstances != null) {
            this.BaselineTaskInstances = new BaselineTaskInstanceDto[source.BaselineTaskInstances.length];
            for (int i = 0; i < source.BaselineTaskInstances.length; i++) {
                this.BaselineTaskInstances[i] = new BaselineTaskInstanceDto(source.BaselineTaskInstances[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamSimple(map, prefix + "BaselineName", this.BaselineName);
        this.setParamSimple(map, prefix + "BaselineType", this.BaselineType);
        this.setParamSimple(map, prefix + "BaselineDataTime", this.BaselineDataTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EstimatedEndTime", this.EstimatedEndTime);
        this.setParamSimple(map, prefix + "BaselineInstanceStatus", this.BaselineInstanceStatus);
        this.setParamSimple(map, prefix + "InChargeUin", this.InChargeUin);
        this.setParamSimple(map, prefix + "InChargeName", this.InChargeName);
        this.setParamSimple(map, prefix + "WarningMargin", this.WarningMargin);
        this.setParamSimple(map, prefix + "PromiseTime", this.PromiseTime);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsReady", this.IsReady);
        this.setParamSimple(map, prefix + "ShardKey", this.ShardKey);
        this.setParamArrayObj(map, prefix + "ExceptionalTaskInstances.", this.ExceptionalTaskInstances);
        this.setParamArrayObj(map, prefix + "TaskInstances.", this.TaskInstances);
        this.setParamSimple(map, prefix + "CriticalStartTime", this.CriticalStartTime);
        this.setParamArrayObj(map, prefix + "CriticalTaskInstances.", this.CriticalTaskInstances);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "BaselineTaskInstances.", this.BaselineTaskInstances);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);

    }
}

