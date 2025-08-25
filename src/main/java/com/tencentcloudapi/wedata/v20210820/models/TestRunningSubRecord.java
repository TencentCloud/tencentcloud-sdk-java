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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TestRunningSubRecord extends AbstractModel {

    /**
    * 开发时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 执行平台执行id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * 执行平台子执行jobid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionSubJobId")
    @Expose
    private String ExecutionSubJobId;

    /**
    * 开发侧提交的jobid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 子记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailId")
    @Expose
    private Long DetailId;

    /**
    * 试运行记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeCost")
    @Expose
    private Long TimeCost;

    /**
    * 结果总行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultTotalCount")
    @Expose
    private Long ResultTotalCount;

    /**
    * 预览结果行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultPreviewCount")
    @Expose
    private Long ResultPreviewCount;

    /**
    * 结果文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultFilePath")
    @Expose
    private String ResultFilePath;

    /**
    * 预览结果文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultPreviewFilePath")
    @Expose
    private String ResultPreviewFilePath;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
    * 日志路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFilePath")
    @Expose
    private String LogFilePath;

    /**
    * 是否包含子结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasSubResultSet")
    @Expose
    private Boolean HasSubResultSet;

    /**
     * Get 开发时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开发时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
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
     * Get 执行平台执行id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionJobId 执行平台执行id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set 执行平台执行id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionJobId 执行平台执行id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get 执行平台子执行jobid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionSubJobId 执行平台子执行jobid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionSubJobId() {
        return this.ExecutionSubJobId;
    }

    /**
     * Set 执行平台子执行jobid
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionSubJobId 执行平台子执行jobid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionSubJobId(String ExecutionSubJobId) {
        this.ExecutionSubJobId = ExecutionSubJobId;
    }

    /**
     * Get 开发侧提交的jobid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 开发侧提交的jobid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 开发侧提交的jobid
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 开发侧提交的jobid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 子记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailId 子记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDetailId() {
        return this.DetailId;
    }

    /**
     * Set 子记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailId 子记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailId(Long DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get 试运行记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 试运行记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 试运行记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 试运行记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 脚本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 结果总行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultTotalCount 结果总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultTotalCount() {
        return this.ResultTotalCount;
    }

    /**
     * Set 结果总行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultTotalCount 结果总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultTotalCount(Long ResultTotalCount) {
        this.ResultTotalCount = ResultTotalCount;
    }

    /**
     * Get 预览结果行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultPreviewCount 预览结果行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultPreviewCount() {
        return this.ResultPreviewCount;
    }

    /**
     * Set 预览结果行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultPreviewCount 预览结果行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultPreviewCount(Long ResultPreviewCount) {
        this.ResultPreviewCount = ResultPreviewCount;
    }

    /**
     * Get 结果文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultFilePath 结果文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultFilePath() {
        return this.ResultFilePath;
    }

    /**
     * Set 结果文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultFilePath 结果文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultFilePath(String ResultFilePath) {
        this.ResultFilePath = ResultFilePath;
    }

    /**
     * Get 预览结果文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultPreviewFilePath 预览结果文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultPreviewFilePath() {
        return this.ResultPreviewFilePath;
    }

    /**
     * Set 预览结果文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultPreviewFilePath 预览结果文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultPreviewFilePath(String ResultPreviewFilePath) {
        this.ResultPreviewFilePath = ResultPreviewFilePath;
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
     * Get 序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sequence 序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set 序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sequence 序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
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
     * Get 是否包含子结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasSubResultSet 是否包含子结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasSubResultSet() {
        return this.HasSubResultSet;
    }

    /**
     * Set 是否包含子结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasSubResultSet 是否包含子结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasSubResultSet(Boolean HasSubResultSet) {
        this.HasSubResultSet = HasSubResultSet;
    }

    public TestRunningSubRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestRunningSubRecord(TestRunningSubRecord source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExecutionJobId != null) {
            this.ExecutionJobId = new String(source.ExecutionJobId);
        }
        if (source.ExecutionSubJobId != null) {
            this.ExecutionSubJobId = new String(source.ExecutionSubJobId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.DetailId != null) {
            this.DetailId = new Long(source.DetailId);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TimeCost != null) {
            this.TimeCost = new Long(source.TimeCost);
        }
        if (source.ResultTotalCount != null) {
            this.ResultTotalCount = new Long(source.ResultTotalCount);
        }
        if (source.ResultPreviewCount != null) {
            this.ResultPreviewCount = new Long(source.ResultPreviewCount);
        }
        if (source.ResultFilePath != null) {
            this.ResultFilePath = new String(source.ResultFilePath);
        }
        if (source.ResultPreviewFilePath != null) {
            this.ResultPreviewFilePath = new String(source.ResultPreviewFilePath);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Sequence != null) {
            this.Sequence = new String(source.Sequence);
        }
        if (source.LogFilePath != null) {
            this.LogFilePath = new String(source.LogFilePath);
        }
        if (source.HasSubResultSet != null) {
            this.HasSubResultSet = new Boolean(source.HasSubResultSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "ExecutionSubJobId", this.ExecutionSubJobId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TimeCost", this.TimeCost);
        this.setParamSimple(map, prefix + "ResultTotalCount", this.ResultTotalCount);
        this.setParamSimple(map, prefix + "ResultPreviewCount", this.ResultPreviewCount);
        this.setParamSimple(map, prefix + "ResultFilePath", this.ResultFilePath);
        this.setParamSimple(map, prefix + "ResultPreviewFilePath", this.ResultPreviewFilePath);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "LogFilePath", this.LogFilePath);
        this.setParamSimple(map, prefix + "HasSubResultSet", this.HasSubResultSet);

    }
}

