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

public class AlarmRuleDetail extends AbstractModel {

    /**
    * 失败触发时机 

1 – 首次失败触发
2 --所有重试完成触发 (默认)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trigger")
    @Expose
    private Long Trigger;

    /**
    * 补录重跑触发时机

1 –  首次失败触发
2 – 所有重试完成触发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataBackfillOrRerunTrigger")
    @Expose
    private Long DataBackfillOrRerunTrigger;

    /**
    * 周期实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeOutExtInfo")
    @Expose
    private TimeOutStrategyInfo [] TimeOutExtInfo;

    /**
    * 重跑补录实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataBackfillOrRerunTimeOutExtInfo")
    @Expose
    private TimeOutStrategyInfo [] DataBackfillOrRerunTimeOutExtInfo;

    /**
    * 项目波动告警配置明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectInstanceStatisticsAlarmInfoList")
    @Expose
    private ProjectInstanceStatisticsAlarmInfo [] ProjectInstanceStatisticsAlarmInfoList;

    /**
    * 离线集成对账告警配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReconciliationExtInfo")
    @Expose
    private ReconciliationStrategyInfo [] ReconciliationExtInfo;

    /**
    * 监控对象的白名单配置
    */
    @SerializedName("MonitorWhiteTasks")
    @Expose
    private MonitorWhiteTask [] MonitorWhiteTasks;

    /**
    * 3.0 Workflow 完成时间（周期）告警策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowCompletionTimeCycleExtInfo")
    @Expose
    private TimeOutStrategyInfo [] WorkflowCompletionTimeCycleExtInfo;

    /**
    * 工作流执行触发告警条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowExecutionTrigger")
    @Expose
    private Long WorkflowExecutionTrigger;

    /**
    * 工作流执行失败告警条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowExecutionFailureTrigger")
    @Expose
    private Long WorkflowExecutionFailureTrigger;

    /**
    * 工作流执行成功告警条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowExecutionSuccessTrigger")
    @Expose
    private Long WorkflowExecutionSuccessTrigger;

    /**
     * Get 失败触发时机 

1 – 首次失败触发
2 --所有重试完成触发 (默认)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trigger 失败触发时机 

1 – 首次失败触发
2 --所有重试完成触发 (默认)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTrigger() {
        return this.Trigger;
    }

    /**
     * Set 失败触发时机 

1 – 首次失败触发
2 --所有重试完成触发 (默认)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trigger 失败触发时机 

1 – 首次失败触发
2 --所有重试完成触发 (默认)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrigger(Long Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get 补录重跑触发时机

1 –  首次失败触发
2 – 所有重试完成触发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataBackfillOrRerunTrigger 补录重跑触发时机

1 –  首次失败触发
2 – 所有重试完成触发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataBackfillOrRerunTrigger() {
        return this.DataBackfillOrRerunTrigger;
    }

    /**
     * Set 补录重跑触发时机

1 –  首次失败触发
2 – 所有重试完成触发
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataBackfillOrRerunTrigger 补录重跑触发时机

1 –  首次失败触发
2 – 所有重试完成触发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataBackfillOrRerunTrigger(Long DataBackfillOrRerunTrigger) {
        this.DataBackfillOrRerunTrigger = DataBackfillOrRerunTrigger;
    }

    /**
     * Get 周期实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeOutExtInfo 周期实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimeOutStrategyInfo [] getTimeOutExtInfo() {
        return this.TimeOutExtInfo;
    }

    /**
     * Set 周期实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeOutExtInfo 周期实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeOutExtInfo(TimeOutStrategyInfo [] TimeOutExtInfo) {
        this.TimeOutExtInfo = TimeOutExtInfo;
    }

    /**
     * Get 重跑补录实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataBackfillOrRerunTimeOutExtInfo 重跑补录实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimeOutStrategyInfo [] getDataBackfillOrRerunTimeOutExtInfo() {
        return this.DataBackfillOrRerunTimeOutExtInfo;
    }

    /**
     * Set 重跑补录实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataBackfillOrRerunTimeOutExtInfo 重跑补录实例超时配置明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataBackfillOrRerunTimeOutExtInfo(TimeOutStrategyInfo [] DataBackfillOrRerunTimeOutExtInfo) {
        this.DataBackfillOrRerunTimeOutExtInfo = DataBackfillOrRerunTimeOutExtInfo;
    }

    /**
     * Get 项目波动告警配置明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectInstanceStatisticsAlarmInfoList 项目波动告警配置明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectInstanceStatisticsAlarmInfo [] getProjectInstanceStatisticsAlarmInfoList() {
        return this.ProjectInstanceStatisticsAlarmInfoList;
    }

    /**
     * Set 项目波动告警配置明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectInstanceStatisticsAlarmInfoList 项目波动告警配置明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectInstanceStatisticsAlarmInfoList(ProjectInstanceStatisticsAlarmInfo [] ProjectInstanceStatisticsAlarmInfoList) {
        this.ProjectInstanceStatisticsAlarmInfoList = ProjectInstanceStatisticsAlarmInfoList;
    }

    /**
     * Get 离线集成对账告警配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReconciliationExtInfo 离线集成对账告警配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReconciliationStrategyInfo [] getReconciliationExtInfo() {
        return this.ReconciliationExtInfo;
    }

    /**
     * Set 离线集成对账告警配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReconciliationExtInfo 离线集成对账告警配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReconciliationExtInfo(ReconciliationStrategyInfo [] ReconciliationExtInfo) {
        this.ReconciliationExtInfo = ReconciliationExtInfo;
    }

    /**
     * Get 监控对象的白名单配置 
     * @return MonitorWhiteTasks 监控对象的白名单配置
     */
    public MonitorWhiteTask [] getMonitorWhiteTasks() {
        return this.MonitorWhiteTasks;
    }

    /**
     * Set 监控对象的白名单配置
     * @param MonitorWhiteTasks 监控对象的白名单配置
     */
    public void setMonitorWhiteTasks(MonitorWhiteTask [] MonitorWhiteTasks) {
        this.MonitorWhiteTasks = MonitorWhiteTasks;
    }

    /**
     * Get 3.0 Workflow 完成时间（周期）告警策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowCompletionTimeCycleExtInfo 3.0 Workflow 完成时间（周期）告警策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimeOutStrategyInfo [] getWorkflowCompletionTimeCycleExtInfo() {
        return this.WorkflowCompletionTimeCycleExtInfo;
    }

    /**
     * Set 3.0 Workflow 完成时间（周期）告警策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowCompletionTimeCycleExtInfo 3.0 Workflow 完成时间（周期）告警策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowCompletionTimeCycleExtInfo(TimeOutStrategyInfo [] WorkflowCompletionTimeCycleExtInfo) {
        this.WorkflowCompletionTimeCycleExtInfo = WorkflowCompletionTimeCycleExtInfo;
    }

    /**
     * Get 工作流执行触发告警条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowExecutionTrigger 工作流执行触发告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkflowExecutionTrigger() {
        return this.WorkflowExecutionTrigger;
    }

    /**
     * Set 工作流执行触发告警条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowExecutionTrigger 工作流执行触发告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowExecutionTrigger(Long WorkflowExecutionTrigger) {
        this.WorkflowExecutionTrigger = WorkflowExecutionTrigger;
    }

    /**
     * Get 工作流执行失败告警条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowExecutionFailureTrigger 工作流执行失败告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkflowExecutionFailureTrigger() {
        return this.WorkflowExecutionFailureTrigger;
    }

    /**
     * Set 工作流执行失败告警条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowExecutionFailureTrigger 工作流执行失败告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowExecutionFailureTrigger(Long WorkflowExecutionFailureTrigger) {
        this.WorkflowExecutionFailureTrigger = WorkflowExecutionFailureTrigger;
    }

    /**
     * Get 工作流执行成功告警条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowExecutionSuccessTrigger 工作流执行成功告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkflowExecutionSuccessTrigger() {
        return this.WorkflowExecutionSuccessTrigger;
    }

    /**
     * Set 工作流执行成功告警条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowExecutionSuccessTrigger 工作流执行成功告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowExecutionSuccessTrigger(Long WorkflowExecutionSuccessTrigger) {
        this.WorkflowExecutionSuccessTrigger = WorkflowExecutionSuccessTrigger;
    }

    public AlarmRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmRuleDetail(AlarmRuleDetail source) {
        if (source.Trigger != null) {
            this.Trigger = new Long(source.Trigger);
        }
        if (source.DataBackfillOrRerunTrigger != null) {
            this.DataBackfillOrRerunTrigger = new Long(source.DataBackfillOrRerunTrigger);
        }
        if (source.TimeOutExtInfo != null) {
            this.TimeOutExtInfo = new TimeOutStrategyInfo[source.TimeOutExtInfo.length];
            for (int i = 0; i < source.TimeOutExtInfo.length; i++) {
                this.TimeOutExtInfo[i] = new TimeOutStrategyInfo(source.TimeOutExtInfo[i]);
            }
        }
        if (source.DataBackfillOrRerunTimeOutExtInfo != null) {
            this.DataBackfillOrRerunTimeOutExtInfo = new TimeOutStrategyInfo[source.DataBackfillOrRerunTimeOutExtInfo.length];
            for (int i = 0; i < source.DataBackfillOrRerunTimeOutExtInfo.length; i++) {
                this.DataBackfillOrRerunTimeOutExtInfo[i] = new TimeOutStrategyInfo(source.DataBackfillOrRerunTimeOutExtInfo[i]);
            }
        }
        if (source.ProjectInstanceStatisticsAlarmInfoList != null) {
            this.ProjectInstanceStatisticsAlarmInfoList = new ProjectInstanceStatisticsAlarmInfo[source.ProjectInstanceStatisticsAlarmInfoList.length];
            for (int i = 0; i < source.ProjectInstanceStatisticsAlarmInfoList.length; i++) {
                this.ProjectInstanceStatisticsAlarmInfoList[i] = new ProjectInstanceStatisticsAlarmInfo(source.ProjectInstanceStatisticsAlarmInfoList[i]);
            }
        }
        if (source.ReconciliationExtInfo != null) {
            this.ReconciliationExtInfo = new ReconciliationStrategyInfo[source.ReconciliationExtInfo.length];
            for (int i = 0; i < source.ReconciliationExtInfo.length; i++) {
                this.ReconciliationExtInfo[i] = new ReconciliationStrategyInfo(source.ReconciliationExtInfo[i]);
            }
        }
        if (source.MonitorWhiteTasks != null) {
            this.MonitorWhiteTasks = new MonitorWhiteTask[source.MonitorWhiteTasks.length];
            for (int i = 0; i < source.MonitorWhiteTasks.length; i++) {
                this.MonitorWhiteTasks[i] = new MonitorWhiteTask(source.MonitorWhiteTasks[i]);
            }
        }
        if (source.WorkflowCompletionTimeCycleExtInfo != null) {
            this.WorkflowCompletionTimeCycleExtInfo = new TimeOutStrategyInfo[source.WorkflowCompletionTimeCycleExtInfo.length];
            for (int i = 0; i < source.WorkflowCompletionTimeCycleExtInfo.length; i++) {
                this.WorkflowCompletionTimeCycleExtInfo[i] = new TimeOutStrategyInfo(source.WorkflowCompletionTimeCycleExtInfo[i]);
            }
        }
        if (source.WorkflowExecutionTrigger != null) {
            this.WorkflowExecutionTrigger = new Long(source.WorkflowExecutionTrigger);
        }
        if (source.WorkflowExecutionFailureTrigger != null) {
            this.WorkflowExecutionFailureTrigger = new Long(source.WorkflowExecutionFailureTrigger);
        }
        if (source.WorkflowExecutionSuccessTrigger != null) {
            this.WorkflowExecutionSuccessTrigger = new Long(source.WorkflowExecutionSuccessTrigger);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Trigger", this.Trigger);
        this.setParamSimple(map, prefix + "DataBackfillOrRerunTrigger", this.DataBackfillOrRerunTrigger);
        this.setParamArrayObj(map, prefix + "TimeOutExtInfo.", this.TimeOutExtInfo);
        this.setParamArrayObj(map, prefix + "DataBackfillOrRerunTimeOutExtInfo.", this.DataBackfillOrRerunTimeOutExtInfo);
        this.setParamArrayObj(map, prefix + "ProjectInstanceStatisticsAlarmInfoList.", this.ProjectInstanceStatisticsAlarmInfoList);
        this.setParamArrayObj(map, prefix + "ReconciliationExtInfo.", this.ReconciliationExtInfo);
        this.setParamArrayObj(map, prefix + "MonitorWhiteTasks.", this.MonitorWhiteTasks);
        this.setParamArrayObj(map, prefix + "WorkflowCompletionTimeCycleExtInfo.", this.WorkflowCompletionTimeCycleExtInfo);
        this.setParamSimple(map, prefix + "WorkflowExecutionTrigger", this.WorkflowExecutionTrigger);
        this.setParamSimple(map, prefix + "WorkflowExecutionFailureTrigger", this.WorkflowExecutionFailureTrigger);
        this.setParamSimple(map, prefix + "WorkflowExecutionSuccessTrigger", this.WorkflowExecutionSuccessTrigger);

    }
}

