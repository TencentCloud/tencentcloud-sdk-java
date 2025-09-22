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

public class JobExecutionDto extends AbstractModel {

    /**
    * 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 子查询任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobExecutionId")
    @Expose
    private String JobExecutionId;

    /**
    * 子查询名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobExecutionName")
    @Expose
    private String JobExecutionName;

    /**
    * 子查询sql内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 子查询状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 执行阶段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteStageInfo")
    @Expose
    private String ExecuteStageInfo;

    /**
    * 日志路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFilePath")
    @Expose
    private String LogFilePath;

    /**
    * 下载结果路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultFilePath")
    @Expose
    private String ResultFilePath;

    /**
    * 预览结果路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultPreviewFilePath")
    @Expose
    private String ResultPreviewFilePath;

    /**
    * 任务执行的结果总行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultTotalCount")
    @Expose
    private Long ResultTotalCount;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeCost")
    @Expose
    private Long TimeCost;

    /**
    * 上下文SQL内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContextScriptContent")
    @Expose
    private String [] ContextScriptContent;

    /**
    * 任务执行的结果预览行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultPreviewCount")
    @Expose
    private Long ResultPreviewCount;

    /**
    * 任务执行的结果影响行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultEffectCount")
    @Expose
    private Long ResultEffectCount;

    /**
    * 是否正在收集全量结果：默认false，true表示正在收集全量结果，用于前端判断是否需要继续轮询
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectingTotalResult")
    @Expose
    private Boolean CollectingTotalResult;

    /**
    * 是否需要截断脚本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContentTruncate")
    @Expose
    private Boolean ScriptContentTruncate;

    /**
     * Get 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 子查询任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobExecutionId 子查询任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobExecutionId() {
        return this.JobExecutionId;
    }

    /**
     * Set 子查询任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobExecutionId 子查询任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobExecutionId(String JobExecutionId) {
        this.JobExecutionId = JobExecutionId;
    }

    /**
     * Get 子查询名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobExecutionName 子查询名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobExecutionName() {
        return this.JobExecutionName;
    }

    /**
     * Set 子查询名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobExecutionName 子查询名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobExecutionName(String JobExecutionName) {
        this.JobExecutionName = JobExecutionName;
    }

    /**
     * Get 子查询sql内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent 子查询sql内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 子查询sql内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent 子查询sql内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 子查询状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 子查询状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 子查询状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 子查询状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 执行阶段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteStageInfo 执行阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteStageInfo() {
        return this.ExecuteStageInfo;
    }

    /**
     * Set 执行阶段
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteStageInfo 执行阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteStageInfo(String ExecuteStageInfo) {
        this.ExecuteStageInfo = ExecuteStageInfo;
    }

    /**
     * Get 日志路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogFilePath 日志路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogFilePath() {
        return this.LogFilePath;
    }

    /**
     * Set 日志路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogFilePath 日志路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogFilePath(String LogFilePath) {
        this.LogFilePath = LogFilePath;
    }

    /**
     * Get 下载结果路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultFilePath 下载结果路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultFilePath() {
        return this.ResultFilePath;
    }

    /**
     * Set 下载结果路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultFilePath 下载结果路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultFilePath(String ResultFilePath) {
        this.ResultFilePath = ResultFilePath;
    }

    /**
     * Get 预览结果路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultPreviewFilePath 预览结果路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultPreviewFilePath() {
        return this.ResultPreviewFilePath;
    }

    /**
     * Set 预览结果路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultPreviewFilePath 预览结果路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultPreviewFilePath(String ResultPreviewFilePath) {
        this.ResultPreviewFilePath = ResultPreviewFilePath;
    }

    /**
     * Get 任务执行的结果总行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultTotalCount 任务执行的结果总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultTotalCount() {
        return this.ResultTotalCount;
    }

    /**
     * Set 任务执行的结果总行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultTotalCount 任务执行的结果总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultTotalCount(Long ResultTotalCount) {
        this.ResultTotalCount = ResultTotalCount;
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
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeCost 耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeCost() {
        return this.TimeCost;
    }

    /**
     * Set 耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeCost 耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeCost(Long TimeCost) {
        this.TimeCost = TimeCost;
    }

    /**
     * Get 上下文SQL内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContextScriptContent 上下文SQL内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getContextScriptContent() {
        return this.ContextScriptContent;
    }

    /**
     * Set 上下文SQL内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContextScriptContent 上下文SQL内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContextScriptContent(String [] ContextScriptContent) {
        this.ContextScriptContent = ContextScriptContent;
    }

    /**
     * Get 任务执行的结果预览行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultPreviewCount 任务执行的结果预览行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultPreviewCount() {
        return this.ResultPreviewCount;
    }

    /**
     * Set 任务执行的结果预览行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultPreviewCount 任务执行的结果预览行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultPreviewCount(Long ResultPreviewCount) {
        this.ResultPreviewCount = ResultPreviewCount;
    }

    /**
     * Get 任务执行的结果影响行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultEffectCount 任务执行的结果影响行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultEffectCount() {
        return this.ResultEffectCount;
    }

    /**
     * Set 任务执行的结果影响行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultEffectCount 任务执行的结果影响行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultEffectCount(Long ResultEffectCount) {
        this.ResultEffectCount = ResultEffectCount;
    }

    /**
     * Get 是否正在收集全量结果：默认false，true表示正在收集全量结果，用于前端判断是否需要继续轮询
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectingTotalResult 是否正在收集全量结果：默认false，true表示正在收集全量结果，用于前端判断是否需要继续轮询
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCollectingTotalResult() {
        return this.CollectingTotalResult;
    }

    /**
     * Set 是否正在收集全量结果：默认false，true表示正在收集全量结果，用于前端判断是否需要继续轮询
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectingTotalResult 是否正在收集全量结果：默认false，true表示正在收集全量结果，用于前端判断是否需要继续轮询
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectingTotalResult(Boolean CollectingTotalResult) {
        this.CollectingTotalResult = CollectingTotalResult;
    }

    /**
     * Get 是否需要截断脚本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContentTruncate 是否需要截断脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScriptContentTruncate() {
        return this.ScriptContentTruncate;
    }

    /**
     * Set 是否需要截断脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContentTruncate 是否需要截断脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContentTruncate(Boolean ScriptContentTruncate) {
        this.ScriptContentTruncate = ScriptContentTruncate;
    }

    public JobExecutionDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobExecutionDto(JobExecutionDto source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobExecutionId != null) {
            this.JobExecutionId = new String(source.JobExecutionId);
        }
        if (source.JobExecutionName != null) {
            this.JobExecutionName = new String(source.JobExecutionName);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExecuteStageInfo != null) {
            this.ExecuteStageInfo = new String(source.ExecuteStageInfo);
        }
        if (source.LogFilePath != null) {
            this.LogFilePath = new String(source.LogFilePath);
        }
        if (source.ResultFilePath != null) {
            this.ResultFilePath = new String(source.ResultFilePath);
        }
        if (source.ResultPreviewFilePath != null) {
            this.ResultPreviewFilePath = new String(source.ResultPreviewFilePath);
        }
        if (source.ResultTotalCount != null) {
            this.ResultTotalCount = new Long(source.ResultTotalCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TimeCost != null) {
            this.TimeCost = new Long(source.TimeCost);
        }
        if (source.ContextScriptContent != null) {
            this.ContextScriptContent = new String[source.ContextScriptContent.length];
            for (int i = 0; i < source.ContextScriptContent.length; i++) {
                this.ContextScriptContent[i] = new String(source.ContextScriptContent[i]);
            }
        }
        if (source.ResultPreviewCount != null) {
            this.ResultPreviewCount = new Long(source.ResultPreviewCount);
        }
        if (source.ResultEffectCount != null) {
            this.ResultEffectCount = new Long(source.ResultEffectCount);
        }
        if (source.CollectingTotalResult != null) {
            this.CollectingTotalResult = new Boolean(source.CollectingTotalResult);
        }
        if (source.ScriptContentTruncate != null) {
            this.ScriptContentTruncate = new Boolean(source.ScriptContentTruncate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobExecutionId", this.JobExecutionId);
        this.setParamSimple(map, prefix + "JobExecutionName", this.JobExecutionName);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExecuteStageInfo", this.ExecuteStageInfo);
        this.setParamSimple(map, prefix + "LogFilePath", this.LogFilePath);
        this.setParamSimple(map, prefix + "ResultFilePath", this.ResultFilePath);
        this.setParamSimple(map, prefix + "ResultPreviewFilePath", this.ResultPreviewFilePath);
        this.setParamSimple(map, prefix + "ResultTotalCount", this.ResultTotalCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TimeCost", this.TimeCost);
        this.setParamArraySimple(map, prefix + "ContextScriptContent.", this.ContextScriptContent);
        this.setParamSimple(map, prefix + "ResultPreviewCount", this.ResultPreviewCount);
        this.setParamSimple(map, prefix + "ResultEffectCount", this.ResultEffectCount);
        this.setParamSimple(map, prefix + "CollectingTotalResult", this.CollectingTotalResult);
        this.setParamSimple(map, prefix + "ScriptContentTruncate", this.ScriptContentTruncate);

    }
}

