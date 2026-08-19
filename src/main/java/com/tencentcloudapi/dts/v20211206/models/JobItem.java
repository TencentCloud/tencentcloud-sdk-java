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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobItem extends AbstractModel {

    /**
    * <p>数据迁移任务ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>数据迁移任务名称</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>任务创建(提交)时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务更新时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>任务开始执行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务执行结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>迁移任务错误信息</p>
    */
    @SerializedName("BriefMsg")
    @Expose
    private String BriefMsg;

    /**
    * <p>任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(终止中)、completing(完成中)、pausing(暂停中)、manualPaused(已暂停)、resumableErr(可重试错误)、resuming(重试中)、unknown(未知状态)、error(任务错误)、canceled(已取消)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>期待启动时间，当 <code>RunMode</code> 取值为 <code>timed</code> 时此值必填。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * <p>任务操作信息</p>
    */
    @SerializedName("Action")
    @Expose
    private MigrateAction Action;

    /**
    * <p>迁移执行过程信息</p>
    */
    @SerializedName("StepInfo")
    @Expose
    private MigrateDetailInfo StepInfo;

    /**
    * <p>源实例信息</p>
    */
    @SerializedName("SrcInfo")
    @Expose
    private DBEndpointInfo SrcInfo;

    /**
    * <p>目标端信息</p>
    */
    @SerializedName("DstInfo")
    @Expose
    private DBEndpointInfo DstInfo;

    /**
    * <p>数据一致性校验结果</p>
    */
    @SerializedName("CompareTask")
    @Expose
    private CompareTaskInfo CompareTask;

    /**
    * <p>计费状态信息</p>
    */
    @SerializedName("TradeInfo")
    @Expose
    private TradeInfo TradeInfo;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * <p>自动重试时间段信息</p>
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
    * <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
    */
    @SerializedName("DumperResumeCtrl")
    @Expose
    private String DumperResumeCtrl;

    /**
     * Get <p>数据迁移任务ID</p> 
     * @return JobId <p>数据迁移任务ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>数据迁移任务ID</p>
     * @param JobId <p>数据迁移任务ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>数据迁移任务名称</p> 
     * @return JobName <p>数据迁移任务名称</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>数据迁移任务名称</p>
     * @param JobName <p>数据迁移任务名称</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>任务创建(提交)时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return CreateTime <p>任务创建(提交)时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建(提交)时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param CreateTime <p>任务创建(提交)时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务更新时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return UpdateTime <p>任务更新时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>任务更新时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param UpdateTime <p>任务更新时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>任务开始执行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return StartTime <p>任务开始执行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始执行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param StartTime <p>任务开始执行时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务执行结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return EndTime <p>任务执行结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务执行结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param EndTime <p>任务执行结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>迁移任务错误信息</p> 
     * @return BriefMsg <p>迁移任务错误信息</p>
     */
    public String getBriefMsg() {
        return this.BriefMsg;
    }

    /**
     * Set <p>迁移任务错误信息</p>
     * @param BriefMsg <p>迁移任务错误信息</p>
     */
    public void setBriefMsg(String BriefMsg) {
        this.BriefMsg = BriefMsg;
    }

    /**
     * Get <p>任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(终止中)、completing(完成中)、pausing(暂停中)、manualPaused(已暂停)、resumableErr(可重试错误)、resuming(重试中)、unknown(未知状态)、error(任务错误)、canceled(已取消)</p> 
     * @return Status <p>任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(终止中)、completing(完成中)、pausing(暂停中)、manualPaused(已暂停)、resumableErr(可重试错误)、resuming(重试中)、unknown(未知状态)、error(任务错误)、canceled(已取消)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(终止中)、completing(完成中)、pausing(暂停中)、manualPaused(已暂停)、resumableErr(可重试错误)、resuming(重试中)、unknown(未知状态)、error(任务错误)、canceled(已取消)</p>
     * @param Status <p>任务状态，取值为：creating(创建中)、created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(终止中)、completing(完成中)、pausing(暂停中)、manualPaused(已暂停)、resumableErr(可重试错误)、resuming(重试中)、unknown(未知状态)、error(任务错误)、canceled(已取消)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p> 
     * @return RunMode <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p>
     * @param RunMode <p>任务运行模式，值包括：immediate(立即运行)，timed(定时运行)</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>期待启动时间，当 <code>RunMode</code> 取值为 <code>timed</code> 时此值必填。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return ExpectRunTime <p>期待启动时间，当 <code>RunMode</code> 取值为 <code>timed</code> 时此值必填。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set <p>期待启动时间，当 <code>RunMode</code> 取值为 <code>timed</code> 时此值必填。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param ExpectRunTime <p>期待启动时间，当 <code>RunMode</code> 取值为 <code>timed</code> 时此值必填。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get <p>任务操作信息</p> 
     * @return Action <p>任务操作信息</p>
     */
    public MigrateAction getAction() {
        return this.Action;
    }

    /**
     * Set <p>任务操作信息</p>
     * @param Action <p>任务操作信息</p>
     */
    public void setAction(MigrateAction Action) {
        this.Action = Action;
    }

    /**
     * Get <p>迁移执行过程信息</p> 
     * @return StepInfo <p>迁移执行过程信息</p>
     */
    public MigrateDetailInfo getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set <p>迁移执行过程信息</p>
     * @param StepInfo <p>迁移执行过程信息</p>
     */
    public void setStepInfo(MigrateDetailInfo StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * Get <p>源实例信息</p> 
     * @return SrcInfo <p>源实例信息</p>
     */
    public DBEndpointInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set <p>源实例信息</p>
     * @param SrcInfo <p>源实例信息</p>
     */
    public void setSrcInfo(DBEndpointInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get <p>目标端信息</p> 
     * @return DstInfo <p>目标端信息</p>
     */
    public DBEndpointInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set <p>目标端信息</p>
     * @param DstInfo <p>目标端信息</p>
     */
    public void setDstInfo(DBEndpointInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get <p>数据一致性校验结果</p> 
     * @return CompareTask <p>数据一致性校验结果</p>
     */
    public CompareTaskInfo getCompareTask() {
        return this.CompareTask;
    }

    /**
     * Set <p>数据一致性校验结果</p>
     * @param CompareTask <p>数据一致性校验结果</p>
     */
    public void setCompareTask(CompareTaskInfo CompareTask) {
        this.CompareTask = CompareTask;
    }

    /**
     * Get <p>计费状态信息</p> 
     * @return TradeInfo <p>计费状态信息</p>
     */
    public TradeInfo getTradeInfo() {
        return this.TradeInfo;
    }

    /**
     * Set <p>计费状态信息</p>
     * @param TradeInfo <p>计费状态信息</p>
     */
    public void setTradeInfo(TradeInfo TradeInfo) {
        this.TradeInfo = TradeInfo;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>自动重试时间段信息</p> 
     * @return AutoRetryTimeRangeMinutes <p>自动重试时间段信息</p>
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set <p>自动重试时间段信息</p>
     * @param AutoRetryTimeRangeMinutes <p>自动重试时间段信息</p>
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    /**
     * Get <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p> 
     * @return DumperResumeCtrl <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
     */
    public String getDumperResumeCtrl() {
        return this.DumperResumeCtrl;
    }

    /**
     * Set <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
     * @param DumperResumeCtrl <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
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

