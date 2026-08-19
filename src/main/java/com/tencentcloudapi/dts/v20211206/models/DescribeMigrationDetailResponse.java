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

public class DescribeMigrationDetailResponse extends AbstractModel {

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
    * <p>迁移任务简要错误信息</p>
    */
    @SerializedName("BriefMsg")
    @Expose
    private String BriefMsg;

    /**
    * <p>任务状态，取值为：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、<br>pausing(暂停中)、<br>manualPaused(已暂停)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务操作信息</p>
    */
    @SerializedName("Action")
    @Expose
    private MigrateAction Action;

    /**
    * <p>迁移执行过程信息，在校验阶段显示校验过程步骤信息，在迁移阶段会显示迁移步骤信息</p>
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
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * <p>运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)</p>
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
    * <p>迁移选项，描述任务如何执行迁移等一系列配置信息</p>
    */
    @SerializedName("MigrateOption")
    @Expose
    private MigrateOption MigrateOption;

    /**
    * <p>校验任务运行详情</p>
    */
    @SerializedName("CheckStepInfo")
    @Expose
    private CheckStepInfo CheckStepInfo;

    /**
    * <p>描述计费相关的信息</p>
    */
    @SerializedName("TradeInfo")
    @Expose
    private TradeInfo TradeInfo;

    /**
    * <p>任务错误信息</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ErrorInfoItem [] ErrorInfo;

    /**
    * <p>全量导出可重入标识：enum::&quot;yes&quot;/&quot;no&quot;。yes表示当前任务可重入、no表示当前任务处于全量导出且不可重入阶段；如果在该值为no时重启任务导出流程不支持断点续传</p>
    */
    @SerializedName("DumperResumeCtrl")
    @Expose
    private String DumperResumeCtrl;

    /**
    * <p>任务的限速信息</p>
    */
    @SerializedName("RateLimitOption")
    @Expose
    private RateLimitOption RateLimitOption;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get <p>迁移任务简要错误信息</p> 
     * @return BriefMsg <p>迁移任务简要错误信息</p>
     */
    public String getBriefMsg() {
        return this.BriefMsg;
    }

    /**
     * Set <p>迁移任务简要错误信息</p>
     * @param BriefMsg <p>迁移任务简要错误信息</p>
     */
    public void setBriefMsg(String BriefMsg) {
        this.BriefMsg = BriefMsg;
    }

    /**
     * Get <p>任务状态，取值为：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、<br>pausing(暂停中)、<br>manualPaused(已暂停)</p> 
     * @return Status <p>任务状态，取值为：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、<br>pausing(暂停中)、<br>manualPaused(已暂停)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，取值为：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、<br>pausing(暂停中)、<br>manualPaused(已暂停)</p>
     * @param Status <p>任务状态，取值为：created(创建完成)、checking(校验中)、checkPass(校验通过)、checkNotPass(校验不通过)、readyRun(准备运行)、running(任务运行中)、readyComplete(准备完成)、success(任务成功)、failed(任务失败)、stopping(中止中)、completing(完成中)、<br>pausing(暂停中)、<br>manualPaused(已暂停)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>迁移执行过程信息，在校验阶段显示校验过程步骤信息，在迁移阶段会显示迁移步骤信息</p> 
     * @return StepInfo <p>迁移执行过程信息，在校验阶段显示校验过程步骤信息，在迁移阶段会显示迁移步骤信息</p>
     */
    public MigrateDetailInfo getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set <p>迁移执行过程信息，在校验阶段显示校验过程步骤信息，在迁移阶段会显示迁移步骤信息</p>
     * @param StepInfo <p>迁移执行过程信息，在校验阶段显示校验过程步骤信息，在迁移阶段会显示迁移步骤信息</p>
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
     * Get <p>运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)</p> 
     * @return RunMode <p>运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)</p>
     * @param RunMode <p>运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)</p>
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
     * Get <p>迁移选项，描述任务如何执行迁移等一系列配置信息</p> 
     * @return MigrateOption <p>迁移选项，描述任务如何执行迁移等一系列配置信息</p>
     */
    public MigrateOption getMigrateOption() {
        return this.MigrateOption;
    }

    /**
     * Set <p>迁移选项，描述任务如何执行迁移等一系列配置信息</p>
     * @param MigrateOption <p>迁移选项，描述任务如何执行迁移等一系列配置信息</p>
     */
    public void setMigrateOption(MigrateOption MigrateOption) {
        this.MigrateOption = MigrateOption;
    }

    /**
     * Get <p>校验任务运行详情</p> 
     * @return CheckStepInfo <p>校验任务运行详情</p>
     */
    public CheckStepInfo getCheckStepInfo() {
        return this.CheckStepInfo;
    }

    /**
     * Set <p>校验任务运行详情</p>
     * @param CheckStepInfo <p>校验任务运行详情</p>
     */
    public void setCheckStepInfo(CheckStepInfo CheckStepInfo) {
        this.CheckStepInfo = CheckStepInfo;
    }

    /**
     * Get <p>描述计费相关的信息</p> 
     * @return TradeInfo <p>描述计费相关的信息</p>
     */
    public TradeInfo getTradeInfo() {
        return this.TradeInfo;
    }

    /**
     * Set <p>描述计费相关的信息</p>
     * @param TradeInfo <p>描述计费相关的信息</p>
     */
    public void setTradeInfo(TradeInfo TradeInfo) {
        this.TradeInfo = TradeInfo;
    }

    /**
     * Get <p>任务错误信息</p> 
     * @return ErrorInfo <p>任务错误信息</p>
     */
    public ErrorInfoItem [] getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>任务错误信息</p>
     * @param ErrorInfo <p>任务错误信息</p>
     */
    public void setErrorInfo(ErrorInfoItem [] ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
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

    /**
     * Get <p>任务的限速信息</p> 
     * @return RateLimitOption <p>任务的限速信息</p>
     */
    public RateLimitOption getRateLimitOption() {
        return this.RateLimitOption;
    }

    /**
     * Set <p>任务的限速信息</p>
     * @param RateLimitOption <p>任务的限速信息</p>
     */
    public void setRateLimitOption(RateLimitOption RateLimitOption) {
        this.RateLimitOption = RateLimitOption;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMigrationDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationDetailResponse(DescribeMigrationDetailResponse source) {
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
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
        if (source.MigrateOption != null) {
            this.MigrateOption = new MigrateOption(source.MigrateOption);
        }
        if (source.CheckStepInfo != null) {
            this.CheckStepInfo = new CheckStepInfo(source.CheckStepInfo);
        }
        if (source.TradeInfo != null) {
            this.TradeInfo = new TradeInfo(source.TradeInfo);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new ErrorInfoItem[source.ErrorInfo.length];
            for (int i = 0; i < source.ErrorInfo.length; i++) {
                this.ErrorInfo[i] = new ErrorInfoItem(source.ErrorInfo[i]);
            }
        }
        if (source.DumperResumeCtrl != null) {
            this.DumperResumeCtrl = new String(source.DumperResumeCtrl);
        }
        if (source.RateLimitOption != null) {
            this.RateLimitOption = new RateLimitOption(source.RateLimitOption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamObj(map, prefix + "StepInfo.", this.StepInfo);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "CompareTask.", this.CompareTask);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);
        this.setParamObj(map, prefix + "MigrateOption.", this.MigrateOption);
        this.setParamObj(map, prefix + "CheckStepInfo.", this.CheckStepInfo);
        this.setParamObj(map, prefix + "TradeInfo.", this.TradeInfo);
        this.setParamArrayObj(map, prefix + "ErrorInfo.", this.ErrorInfo);
        this.setParamSimple(map, prefix + "DumperResumeCtrl", this.DumperResumeCtrl);
        this.setParamObj(map, prefix + "RateLimitOption.", this.RateLimitOption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

