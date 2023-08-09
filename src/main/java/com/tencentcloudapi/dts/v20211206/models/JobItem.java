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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobItem extends AbstractModel{

    /**
    * 数据迁移任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 数据迁移任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 任务创建(提交)时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务更新时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 任务开始执行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务执行结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 迁移任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BriefMsg")
    @Expose
    private String BriefMsg;

    /**
    * 任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、
pausing(暂停中)、
manualPaused(已暂停)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * 期待启动时间，当RunMode取值为timed时，此值必填，形如：2022-07-11 16:20:49
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * 任务操作信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private MigrateAction Action;

    /**
    * 迁移执行过程信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepInfo")
    @Expose
    private MigrateDetailInfo StepInfo;

    /**
    * 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcInfo")
    @Expose
    private DBEndpointInfo SrcInfo;

    /**
    * 目标端信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstInfo")
    @Expose
    private DBEndpointInfo DstInfo;

    /**
    * 数据一致性校验结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareTask")
    @Expose
    private CompareTaskInfo CompareTask;

    /**
    * 计费状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeInfo")
    @Expose
    private TradeInfo TradeInfo;

    /**
    * 标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * 自动重试时间段信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
    * 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DumperResumeCtrl")
    @Expose
    private String DumperResumeCtrl;

    /**
     * Get 数据迁移任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 数据迁移任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 数据迁移任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 数据迁移任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 数据迁移任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobName 数据迁移任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 数据迁移任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobName 数据迁移任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 任务创建(提交)时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 任务创建(提交)时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建(提交)时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 任务创建(提交)时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务更新时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 任务更新时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务更新时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 任务更新时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 任务开始执行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 任务开始执行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始执行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务开始执行时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务执行结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务执行结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务执行结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务执行结束时间，格式为 yyyy-mm-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 迁移任务错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BriefMsg 迁移任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBriefMsg() {
        return this.BriefMsg;
    }

    /**
     * Set 迁移任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BriefMsg 迁移任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBriefMsg(String BriefMsg) {
        this.BriefMsg = BriefMsg;
    }

    /**
     * Get 任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、
pausing(暂停中)、
manualPaused(已暂停)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、
pausing(暂停中)、
manualPaused(已暂停)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、
pausing(暂停中)、
manualPaused(已暂停)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、
pausing(暂停中)、
manualPaused(已暂停)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunMode 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunMode 任务运行模式，值包括：immediate(立即运行)，timed(定时运行)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 期待启动时间，当RunMode取值为timed时，此值必填，形如：2022-07-11 16:20:49
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpectRunTime 期待启动时间，当RunMode取值为timed时，此值必填，形如：2022-07-11 16:20:49
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set 期待启动时间，当RunMode取值为timed时，此值必填，形如：2022-07-11 16:20:49
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpectRunTime 期待启动时间，当RunMode取值为timed时，此值必填，形如：2022-07-11 16:20:49
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get 任务操作信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 任务操作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MigrateAction getAction() {
        return this.Action;
    }

    /**
     * Set 任务操作信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 任务操作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(MigrateAction Action) {
        this.Action = Action;
    }

    /**
     * Get 迁移执行过程信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepInfo 迁移执行过程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MigrateDetailInfo getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set 迁移执行过程信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepInfo 迁移执行过程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepInfo(MigrateDetailInfo StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * Get 源实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBEndpointInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInfo(DBEndpointInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 目标端信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstInfo 目标端信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBEndpointInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标端信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstInfo 目标端信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstInfo(DBEndpointInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 数据一致性校验结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareTask 数据一致性校验结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareTaskInfo getCompareTask() {
        return this.CompareTask;
    }

    /**
     * Set 数据一致性校验结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareTask 数据一致性校验结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareTask(CompareTaskInfo CompareTask) {
        this.CompareTask = CompareTask;
    }

    /**
     * Get 计费状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeInfo 计费状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TradeInfo getTradeInfo() {
        return this.TradeInfo;
    }

    /**
     * Set 计费状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeInfo 计费状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeInfo(TradeInfo TradeInfo) {
        this.TradeInfo = TradeInfo;
    }

    /**
     * Get 标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 自动重试时间段信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRetryTimeRangeMinutes 自动重试时间段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set 自动重试时间段信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRetryTimeRangeMinutes 自动重试时间段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    /**
     * Get 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DumperResumeCtrl 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDumperResumeCtrl() {
        return this.DumperResumeCtrl;
    }

    /**
     * Set 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。
     * @param DumperResumeCtrl 全量导出可重入标识：enum::"yes"/"no"。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDumperResumeCtrl(String DumperResumeCtrl) {
        this.DumperResumeCtrl = DumperResumeCtrl;
    }

    public JobItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobItem(JobItem source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.BriefMsg != null) {
            this.BriefMsg = new String(source.BriefMsg);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
        if (source.Action != null) {
            this.Action = new MigrateAction(source.Action);
        }
        if (source.StepInfo != null) {
            this.StepInfo = new MigrateDetailInfo(source.StepInfo);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new DBEndpointInfo(source.SrcInfo);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new DBEndpointInfo(source.DstInfo);
        }
        if (source.CompareTask != null) {
            this.CompareTask = new CompareTaskInfo(source.CompareTask);
        }
        if (source.TradeInfo != null) {
            this.TradeInfo = new TradeInfo(source.TradeInfo);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.AutoRetryTimeRangeMinutes != null) {
            this.AutoRetryTimeRangeMinutes = new Long(source.AutoRetryTimeRangeMinutes);
        }
        if (source.DumperResumeCtrl != null) {
            this.DumperResumeCtrl = new String(source.DumperResumeCtrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BriefMsg", this.BriefMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamObj(map, prefix + "StepInfo.", this.StepInfo);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "CompareTask.", this.CompareTask);
        this.setParamObj(map, prefix + "TradeInfo.", this.TradeInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRetryTimeRangeMinutes", this.AutoRetryTimeRangeMinutes);
        this.setParamSimple(map, prefix + "DumperResumeCtrl", this.DumperResumeCtrl);

    }
}

