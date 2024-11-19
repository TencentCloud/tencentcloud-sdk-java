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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunMetadata extends AbstractModel {

    /**
    * 任务类型。
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * 任务ID。
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * 父层ID。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 作业ID。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业名称。
    */
    @SerializedName("CallName")
    @Expose
    private String CallName;

    /**
    * Scatter索引。
    */
    @SerializedName("ScatterIndex")
    @Expose
    private String ScatterIndex;

    /**
    * 输入。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 输出。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误信息。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 提交时间。
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 命令行。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 运行时。
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 预处理。
    */
    @SerializedName("Preprocess")
    @Expose
    private Boolean Preprocess;

    /**
    * 后处理。
    */
    @SerializedName("PostProcess")
    @Expose
    private Boolean PostProcess;

    /**
    * Cache命中
    */
    @SerializedName("CallCached")
    @Expose
    private Boolean CallCached;

    /**
    * 工作目录。
    */
    @SerializedName("WorkDir")
    @Expose
    private String WorkDir;

    /**
    * 标准输出。
    */
    @SerializedName("Stdout")
    @Expose
    private String Stdout;

    /**
    * 错误输出。
    */
    @SerializedName("Stderr")
    @Expose
    private String Stderr;

    /**
    * 其他信息。
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
     * Get 任务类型。 
     * @return RunType 任务类型。
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set 任务类型。
     * @param RunType 任务类型。
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get 任务ID。 
     * @return RunId 任务ID。
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set 任务ID。
     * @param RunId 任务ID。
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get 父层ID。 
     * @return ParentId 父层ID。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父层ID。
     * @param ParentId 父层ID。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 作业ID。 
     * @return JobId 作业ID。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID。
     * @param JobId 作业ID。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业名称。 
     * @return CallName 作业名称。
     */
    public String getCallName() {
        return this.CallName;
    }

    /**
     * Set 作业名称。
     * @param CallName 作业名称。
     */
    public void setCallName(String CallName) {
        this.CallName = CallName;
    }

    /**
     * Get Scatter索引。 
     * @return ScatterIndex Scatter索引。
     */
    public String getScatterIndex() {
        return this.ScatterIndex;
    }

    /**
     * Set Scatter索引。
     * @param ScatterIndex Scatter索引。
     */
    public void setScatterIndex(String ScatterIndex) {
        this.ScatterIndex = ScatterIndex;
    }

    /**
     * Get 输入。 
     * @return Input 输入。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 输入。
     * @param Input 输入。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 输出。 
     * @return Output 输出。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 输出。
     * @param Output 输出。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误信息。 
     * @return ErrorMessage 错误信息。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息。
     * @param ErrorMessage 错误信息。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 提交时间。 
     * @return SubmitTime 提交时间。
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set 提交时间。
     * @param SubmitTime 提交时间。
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 命令行。 
     * @return Command 命令行。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 命令行。
     * @param Command 命令行。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 运行时。 
     * @return Runtime 运行时。
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 运行时。
     * @param Runtime 运行时。
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 预处理。 
     * @return Preprocess 预处理。
     */
    public Boolean getPreprocess() {
        return this.Preprocess;
    }

    /**
     * Set 预处理。
     * @param Preprocess 预处理。
     */
    public void setPreprocess(Boolean Preprocess) {
        this.Preprocess = Preprocess;
    }

    /**
     * Get 后处理。 
     * @return PostProcess 后处理。
     */
    public Boolean getPostProcess() {
        return this.PostProcess;
    }

    /**
     * Set 后处理。
     * @param PostProcess 后处理。
     */
    public void setPostProcess(Boolean PostProcess) {
        this.PostProcess = PostProcess;
    }

    /**
     * Get Cache命中 
     * @return CallCached Cache命中
     */
    public Boolean getCallCached() {
        return this.CallCached;
    }

    /**
     * Set Cache命中
     * @param CallCached Cache命中
     */
    public void setCallCached(Boolean CallCached) {
        this.CallCached = CallCached;
    }

    /**
     * Get 工作目录。 
     * @return WorkDir 工作目录。
     */
    public String getWorkDir() {
        return this.WorkDir;
    }

    /**
     * Set 工作目录。
     * @param WorkDir 工作目录。
     */
    public void setWorkDir(String WorkDir) {
        this.WorkDir = WorkDir;
    }

    /**
     * Get 标准输出。 
     * @return Stdout 标准输出。
     */
    public String getStdout() {
        return this.Stdout;
    }

    /**
     * Set 标准输出。
     * @param Stdout 标准输出。
     */
    public void setStdout(String Stdout) {
        this.Stdout = Stdout;
    }

    /**
     * Get 错误输出。 
     * @return Stderr 错误输出。
     */
    public String getStderr() {
        return this.Stderr;
    }

    /**
     * Set 错误输出。
     * @param Stderr 错误输出。
     */
    public void setStderr(String Stderr) {
        this.Stderr = Stderr;
    }

    /**
     * Get 其他信息。 
     * @return Meta 其他信息。
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set 其他信息。
     * @param Meta 其他信息。
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    public RunMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunMetadata(RunMetadata source) {
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CallName != null) {
            this.CallName = new String(source.CallName);
        }
        if (source.ScatterIndex != null) {
            this.ScatterIndex = new String(source.ScatterIndex);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.Preprocess != null) {
            this.Preprocess = new Boolean(source.Preprocess);
        }
        if (source.PostProcess != null) {
            this.PostProcess = new Boolean(source.PostProcess);
        }
        if (source.CallCached != null) {
            this.CallCached = new Boolean(source.CallCached);
        }
        if (source.WorkDir != null) {
            this.WorkDir = new String(source.WorkDir);
        }
        if (source.Stdout != null) {
            this.Stdout = new String(source.Stdout);
        }
        if (source.Stderr != null) {
            this.Stderr = new String(source.Stderr);
        }
        if (source.Meta != null) {
            this.Meta = new String(source.Meta);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CallName", this.CallName);
        this.setParamSimple(map, prefix + "ScatterIndex", this.ScatterIndex);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Preprocess", this.Preprocess);
        this.setParamSimple(map, prefix + "PostProcess", this.PostProcess);
        this.setParamSimple(map, prefix + "CallCached", this.CallCached);
        this.setParamSimple(map, prefix + "WorkDir", this.WorkDir);
        this.setParamSimple(map, prefix + "Stdout", this.Stdout);
        this.setParamSimple(map, prefix + "Stderr", this.Stderr);
        this.setParamSimple(map, prefix + "Meta", this.Meta);

    }
}

