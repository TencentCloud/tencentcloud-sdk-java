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

public class CompareTaskItem extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>对比任务 Id</p>
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * <p>对比任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>对比任务配置</p>
    */
    @SerializedName("Config")
    @Expose
    private CompareObject Config;

    /**
    * <p>对比任务校验详情</p>
    */
    @SerializedName("CheckProcess")
    @Expose
    private ProcessProgress CheckProcess;

    /**
    * <p>对比任务运行详情</p>
    */
    @SerializedName("CompareProcess")
    @Expose
    private ProcessProgress CompareProcess;

    /**
    * <p>对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过</p>
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * <p>任务创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>任务启动时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * <p>对比结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
    * <p>对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>对比配置信息</p>
    */
    @SerializedName("Options")
    @Expose
    private CompareOptions Options;

    /**
    * <p>一致性校验提示信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>任务id</p> 
     * @return JobId <p>任务id</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>任务id</p>
     * @param JobId <p>任务id</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>对比任务 Id</p> 
     * @return CompareTaskId <p>对比任务 Id</p>
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set <p>对比任务 Id</p>
     * @param CompareTaskId <p>对比任务 Id</p>
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get <p>对比任务名称</p> 
     * @return TaskName <p>对比任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>对比任务名称</p>
     * @param TaskName <p>对比任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p> 
     * @return Status <p>对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p>
     * @param Status <p>对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>对比任务配置</p> 
     * @return Config <p>对比任务配置</p>
     */
    public CompareObject getConfig() {
        return this.Config;
    }

    /**
     * Set <p>对比任务配置</p>
     * @param Config <p>对比任务配置</p>
     */
    public void setConfig(CompareObject Config) {
        this.Config = Config;
    }

    /**
     * Get <p>对比任务校验详情</p> 
     * @return CheckProcess <p>对比任务校验详情</p>
     */
    public ProcessProgress getCheckProcess() {
        return this.CheckProcess;
    }

    /**
     * Set <p>对比任务校验详情</p>
     * @param CheckProcess <p>对比任务校验详情</p>
     */
    public void setCheckProcess(ProcessProgress CheckProcess) {
        this.CheckProcess = CheckProcess;
    }

    /**
     * Get <p>对比任务运行详情</p> 
     * @return CompareProcess <p>对比任务运行详情</p>
     */
    public ProcessProgress getCompareProcess() {
        return this.CompareProcess;
    }

    /**
     * Set <p>对比任务运行详情</p>
     * @param CompareProcess <p>对比任务运行详情</p>
     */
    public void setCompareProcess(ProcessProgress CompareProcess) {
        this.CompareProcess = CompareProcess;
    }

    /**
     * Get <p>对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过</p> 
     * @return Conclusion <p>对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过</p>
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set <p>对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过</p>
     * @param Conclusion <p>对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过</p>
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get <p>任务创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return CreatedAt <p>任务创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>任务创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param CreatedAt <p>任务创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>任务启动时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return StartedAt <p>任务启动时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set <p>任务启动时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param StartedAt <p>任务启动时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get <p>对比结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return FinishedAt <p>对比结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set <p>对比结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param FinishedAt <p>对比结束时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    /**
     * Get <p>对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)</p> 
     * @return Method <p>对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)</p>
     * @param Method <p>对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>对比配置信息</p> 
     * @return Options <p>对比配置信息</p>
     */
    public CompareOptions getOptions() {
        return this.Options;
    }

    /**
     * Set <p>对比配置信息</p>
     * @param Options <p>对比配置信息</p>
     */
    public void setOptions(CompareOptions Options) {
        this.Options = Options;
    }

    /**
     * Get <p>一致性校验提示信息</p> 
     * @return Message <p>一致性校验提示信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>一致性校验提示信息</p>
     * @param Message <p>一致性校验提示信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public CompareTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTaskItem(CompareTaskItem source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Config != null) {
            this.Config = new CompareObject(source.Config);
        }
        if (source.CheckProcess != null) {
            this.CheckProcess = new ProcessProgress(source.CheckProcess);
        }
        if (source.CompareProcess != null) {
            this.CompareProcess = new ProcessProgress(source.CompareProcess);
        }
        if (source.Conclusion != null) {
            this.Conclusion = new String(source.Conclusion);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Options != null) {
            this.Options = new CompareOptions(source.Options);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "CheckProcess.", this.CheckProcess);
        this.setParamObj(map, prefix + "CompareProcess.", this.CompareProcess);
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

