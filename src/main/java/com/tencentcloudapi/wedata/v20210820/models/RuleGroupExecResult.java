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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupExecResult extends AbstractModel {

    /**
    * 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 执行触发类型（1：手动触发， 2：调度事中触发，3：周期调度触发）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * 执行时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecTime")
    @Expose
    private String ExecTime;

    /**
    * 执行状态（1.已提交 2.检测中 3.正常 4.异常）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 异常规则数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRuleCount")
    @Expose
    private Long AlarmRuleCount;

    /**
    * 总规则数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRuleCount")
    @Expose
    private Long TotalRuleCount;

    /**
    * 源表负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * 源表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 数据库id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 有无权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permission")
    @Expose
    private Boolean Permission;

    /**
    * 执行详情，调度计划或者关联生产任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecDetail")
    @Expose
    private String ExecDetail;

    /**
    * 实际执行引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 规则执行结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleExecResultVOList")
    @Expose
    private RuleExecResult [] RuleExecResultVOList;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 本地规则表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupTableId")
    @Expose
    private String RuleGroupTableId;

    /**
    * 集群部署类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterDeployType")
    @Expose
    private String ClusterDeployType;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库所属环境，0.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DsEnvType")
    @Expose
    private String DsEnvType;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例运行的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 实例运行的结束时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupExecId 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupExecId 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get 规则组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 执行触发类型（1：手动触发， 2：调度事中触发，3：周期调度触发）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 执行触发类型（1：手动触发， 2：调度事中触发，3：周期调度触发）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 执行触发类型（1：手动触发， 2：调度事中触发，3：周期调度触发）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 执行触发类型（1：手动触发， 2：调度事中触发，3：周期调度触发）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 执行时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecTime 执行时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 执行时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecTime 执行时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecTime(String ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get 执行状态（1.已提交 2.检测中 3.正常 4.异常）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 执行状态（1.已提交 2.检测中 3.正常 4.异常）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态（1.已提交 2.检测中 3.正常 4.异常）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 执行状态（1.已提交 2.检测中 3.正常 4.异常）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 异常规则数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRuleCount 异常规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmRuleCount() {
        return this.AlarmRuleCount;
    }

    /**
     * Set 异常规则数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRuleCount 异常规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRuleCount(Long AlarmRuleCount) {
        this.AlarmRuleCount = AlarmRuleCount;
    }

    /**
     * Get 总规则数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRuleCount 总规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRuleCount() {
        return this.TotalRuleCount;
    }

    /**
     * Set 总规则数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRuleCount 总规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRuleCount(Long TotalRuleCount) {
        this.TotalRuleCount = TotalRuleCount;
    }

    /**
     * Get 源表负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerName 源表负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set 源表负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerName 源表负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get 源表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 源表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 源表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 源表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 数据库id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 有无权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permission 有无权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPermission() {
        return this.Permission;
    }

    /**
     * Set 有无权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permission 有无权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermission(Boolean Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 执行详情，调度计划或者关联生产任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecDetail 执行详情，调度计划或者关联生产任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecDetail() {
        return this.ExecDetail;
    }

    /**
     * Set 执行详情，调度计划或者关联生产任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecDetail 执行详情，调度计划或者关联生产任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecDetail(String ExecDetail) {
        this.ExecDetail = ExecDetail;
    }

    /**
     * Get 实际执行引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineType 实际执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 实际执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineType 实际执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 规则执行结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleExecResultVOList 规则执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleExecResult [] getRuleExecResultVOList() {
        return this.RuleExecResultVOList;
    }

    /**
     * Set 规则执行结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleExecResultVOList 规则执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleExecResultVOList(RuleExecResult [] RuleExecResultVOList) {
        this.RuleExecResultVOList = RuleExecResultVOList;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 本地规则表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupTableId 本地规则表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleGroupTableId() {
        return this.RuleGroupTableId;
    }

    /**
     * Set 本地规则表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupTableId 本地规则表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupTableId(String RuleGroupTableId) {
        this.RuleGroupTableId = RuleGroupTableId;
    }

    /**
     * Get 集群部署类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterDeployType 集群部署类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterDeployType() {
        return this.ClusterDeployType;
    }

    /**
     * Set 集群部署类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterDeployType 集群部署类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterDeployType(String ClusterDeployType) {
        this.ClusterDeployType = ClusterDeployType;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库所属环境，0.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DsEnvType 数据库所属环境，0.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set 数据库所属环境，0.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     * @param DsEnvType 数据库所属环境，0.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDsEnvType(String DsEnvType) {
        this.DsEnvType = DsEnvType;
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
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例运行的开始时间 
     * @return StartTime 实例运行的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 实例运行的开始时间
     * @param StartTime 实例运行的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例运行的结束时间 
     * @return FinishTime 实例运行的结束时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 实例运行的结束时间
     * @param FinishTime 实例运行的结束时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public RuleGroupExecResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupExecResult(RuleGroupExecResult source) {
        if (source.RuleGroupExecId != null) {
            this.RuleGroupExecId = new Long(source.RuleGroupExecId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new String(source.ExecTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AlarmRuleCount != null) {
            this.AlarmRuleCount = new Long(source.AlarmRuleCount);
        }
        if (source.TotalRuleCount != null) {
            this.TotalRuleCount = new Long(source.TotalRuleCount);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Permission != null) {
            this.Permission = new Boolean(source.Permission);
        }
        if (source.ExecDetail != null) {
            this.ExecDetail = new String(source.ExecDetail);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.RuleExecResultVOList != null) {
            this.RuleExecResultVOList = new RuleExecResult[source.RuleExecResultVOList.length];
            for (int i = 0; i < source.RuleExecResultVOList.length; i++) {
                this.RuleExecResultVOList[i] = new RuleExecResult(source.RuleExecResultVOList[i]);
            }
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.RuleGroupTableId != null) {
            this.RuleGroupTableId = new String(source.RuleGroupTableId);
        }
        if (source.ClusterDeployType != null) {
            this.ClusterDeployType = new String(source.ClusterDeployType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new String(source.DsEnvType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupExecId", this.RuleGroupExecId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AlarmRuleCount", this.AlarmRuleCount);
        this.setParamSimple(map, prefix + "TotalRuleCount", this.TotalRuleCount);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "ExecDetail", this.ExecDetail);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArrayObj(map, prefix + "RuleExecResultVOList.", this.RuleExecResultVOList);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "RuleGroupTableId", this.RuleGroupTableId);
        this.setParamSimple(map, prefix + "ClusterDeployType", this.ClusterDeployType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

