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

public class CompareTaskItem extends AbstractModel{

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 对比任务 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * 对比任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 对比任务配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private CompareObject Config;

    /**
    * 对比任务校验详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckProcess")
    @Expose
    private ProcessProgress CheckProcess;

    /**
    * 对比任务运行详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareProcess")
    @Expose
    private ProcessProgress CompareProcess;

    /**
    * 对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * 对比结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
    * 对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 对比配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Options")
    @Expose
    private CompareOptions Options;

    /**
    * 一致性校验提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 对比任务 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareTaskId 对比任务 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set 对比任务 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareTaskId 对比任务 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get 对比任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 对比任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 对比任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 对比任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 对比任务状态, 可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 对比任务配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 对比任务配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareObject getConfig() {
        return this.Config;
    }

    /**
     * Set 对比任务配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 对比任务配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(CompareObject Config) {
        this.Config = Config;
    }

    /**
     * Get 对比任务校验详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckProcess 对比任务校验详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcessProgress getCheckProcess() {
        return this.CheckProcess;
    }

    /**
     * Set 对比任务校验详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckProcess 对比任务校验详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckProcess(ProcessProgress CheckProcess) {
        this.CheckProcess = CheckProcess;
    }

    /**
     * Get 对比任务运行详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareProcess 对比任务运行详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcessProgress getCompareProcess() {
        return this.CompareProcess;
    }

    /**
     * Set 对比任务运行详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareProcess 对比任务运行详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareProcess(ProcessProgress CompareProcess) {
        this.CompareProcess = CompareProcess;
    }

    /**
     * Get 对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conclusion 对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set 对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conclusion 对比结果, 可能的值：same - 一致；different - 不一致；skipAll - 跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartedAt 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartedAt 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get 对比结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishedAt 对比结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set 对比结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishedAt 对比结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    /**
     * Get 对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 对比类型，dataCheck(完整数据对比)、sampleDataCheck(抽样数据对比)、rowsCount(行数对比)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 对比配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Options 对比配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareOptions getOptions() {
        return this.Options;
    }

    /**
     * Set 对比配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Options 对比配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptions(CompareOptions Options) {
        this.Options = Options;
    }

    /**
     * Get 一致性校验提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 一致性校验提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 一致性校验提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 一致性校验提示信息
注意：此字段可能返回 null，表示取不到有效值。
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

