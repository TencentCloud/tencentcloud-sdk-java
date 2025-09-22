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

public class OpsWorkflowDetail extends AbstractModel {

    /**
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * 工作流类型：
 - cycle 周期；
 - manual手动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 延时执行时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * 配置生效日期 开始日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 配置结束日期 结束日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 文件夹Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 任务实例初始化策略
 - T_PLUS_1（T+1）：延迟一天初始化
 - T_PLUS_0（T+0）：当天初始化
 - T_MINUS_1（T-1）：提前一天初始化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestSubmitTime")
    @Expose
    private String LatestSubmitTime;

    /**
    * 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 负责人, 多个以‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get 工作流类型：
 - cycle 周期；
 - manual手动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowType 工作流类型：
 - cycle 周期；
 - manual手动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set 工作流类型：
 - cycle 周期；
 - manual手动
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowType 工作流类型：
 - cycle 周期；
 - manual手动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 延时执行时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime 延时执行时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 延时执行时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime 延时执行时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 配置生效日期 开始日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 配置生效日期 开始日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 配置生效日期 开始日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 配置生效日期 开始日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 配置结束日期 结束日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 配置结束日期 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 配置结束日期 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 配置结束日期 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 文件夹Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 任务实例初始化策略
 - T_PLUS_1（T+1）：延迟一天初始化
 - T_PLUS_0（T+0）：当天初始化
 - T_MINUS_1（T-1）：提前一天初始化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInitStrategy 任务实例初始化策略
 - T_PLUS_1（T+1）：延迟一天初始化
 - T_PLUS_0（T+0）：当天初始化
 - T_MINUS_1（T-1）：提前一天初始化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set 任务实例初始化策略
 - T_PLUS_1（T+1）：延迟一天初始化
 - T_PLUS_0（T+0）：当天初始化
 - T_MINUS_1（T-1）：提前一天初始化
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInitStrategy 任务实例初始化策略
 - T_PLUS_1（T+1）：延迟一天初始化
 - T_PLUS_0（T+0）：当天初始化
 - T_MINUS_1（T-1）：提前一天初始化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDesc 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDesc 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstSubmitTime 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstSubmitTime 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestSubmitTime 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestSubmitTime() {
        return this.LatestSubmitTime;
    }

    /**
     * Set 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestSubmitTime 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestSubmitTime(String LatestSubmitTime) {
        this.LatestSubmitTime = LatestSubmitTime;
    }

    /**
     * Get 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 负责人, 多个以‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 负责人, 多个以‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 负责人, 多个以‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 负责人, 多个以‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    public OpsWorkflowDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsWorkflowDetail(OpsWorkflowDetail source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.LatestSubmitTime != null) {
            this.LatestSubmitTime = new String(source.LatestSubmitTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "LatestSubmitTime", this.LatestSubmitTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);

    }
}

