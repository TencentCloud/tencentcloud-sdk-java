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
    * <p>开发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>执行平台执行id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * <p>执行平台子执行jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionSubJobId")
    @Expose
    private String ExecutionSubJobId;

    /**
    * <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>子记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailId")
    @Expose
    private Long DetailId;

    /**
    * <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeCost")
    @Expose
    private Long TimeCost;

    /**
    * <p>结果总行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultTotalCount")
    @Expose
    private Long ResultTotalCount;

    /**
    * <p>预览结果行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultPreviewCount")
    @Expose
    private Long ResultPreviewCount;

    /**
    * <p>结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultFilePath")
    @Expose
    private String ResultFilePath;

    /**
    * <p>预览结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultPreviewFilePath")
    @Expose
    private String ResultPreviewFilePath;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
    * <p>日志路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFilePath")
    @Expose
    private String LogFilePath;

    /**
    * <p>是否包含子结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasSubResultSet")
    @Expose
    private Boolean HasSubResultSet;

    /**
    * <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContentTruncated")
    @Expose
    private Boolean ScriptContentTruncated;

    /**
    * <p>结果集表字符信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaInfoFilePath")
    @Expose
    private String SchemaInfoFilePath;

    /**
     * Get <p>开发时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>开发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>开发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>执行平台执行id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionJobId <p>执行平台执行id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set <p>执行平台执行id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionJobId <p>执行平台执行id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get <p>执行平台子执行jobid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionSubJobId <p>执行平台子执行jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionSubJobId() {
        return this.ExecutionSubJobId;
    }

    /**
     * Set <p>执行平台子执行jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionSubJobId <p>执行平台子执行jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionSubJobId(String ExecutionSubJobId) {
        this.ExecutionSubJobId = ExecutionSubJobId;
    }

    /**
     * Get <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>子记录id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailId <p>子记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDetailId() {
        return this.DetailId;
    }

    /**
     * Set <p>子记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailId <p>子记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailId(Long DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeCost <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeCost() {
        return this.TimeCost;
    }

    /**
     * Set <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeCost <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeCost(Long TimeCost) {
        this.TimeCost = TimeCost;
    }

    /**
     * Get <p>结果总行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultTotalCount <p>结果总行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultTotalCount() {
        return this.ResultTotalCount;
    }

    /**
     * Set <p>结果总行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultTotalCount <p>结果总行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultTotalCount(Long ResultTotalCount) {
        this.ResultTotalCount = ResultTotalCount;
    }

    /**
     * Get <p>预览结果行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultPreviewCount <p>预览结果行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultPreviewCount() {
        return this.ResultPreviewCount;
    }

    /**
     * Set <p>预览结果行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultPreviewCount <p>预览结果行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultPreviewCount(Long ResultPreviewCount) {
        this.ResultPreviewCount = ResultPreviewCount;
    }

    /**
     * Get <p>结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultFilePath <p>结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultFilePath() {
        return this.ResultFilePath;
    }

    /**
     * Set <p>结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultFilePath <p>结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultFilePath(String ResultFilePath) {
        this.ResultFilePath = ResultFilePath;
    }

    /**
     * Get <p>预览结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultPreviewFilePath <p>预览结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultPreviewFilePath() {
        return this.ResultPreviewFilePath;
    }

    /**
     * Set <p>预览结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultPreviewFilePath <p>预览结果文件路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultPreviewFilePath(String ResultPreviewFilePath) {
        this.ResultPreviewFilePath = ResultPreviewFilePath;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sequence <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sequence <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get <p>日志路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogFilePath <p>日志路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogFilePath() {
        return this.LogFilePath;
    }

    /**
     * Set <p>日志路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogFilePath <p>日志路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogFilePath(String LogFilePath) {
        this.LogFilePath = LogFilePath;
    }

    /**
     * Get <p>是否包含子结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasSubResultSet <p>是否包含子结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasSubResultSet() {
        return this.HasSubResultSet;
    }

    /**
     * Set <p>是否包含子结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasSubResultSet <p>是否包含子结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasSubResultSet(Boolean HasSubResultSet) {
        this.HasSubResultSet = HasSubResultSet;
    }

    /**
     * Get <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContentTruncated <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScriptContentTruncated() {
        return this.ScriptContentTruncated;
    }

    /**
     * Set <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContentTruncated <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContentTruncated(Boolean ScriptContentTruncated) {
        this.ScriptContentTruncated = ScriptContentTruncated;
    }

    /**
     * Get <p>结果集表字符信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaInfoFilePath <p>结果集表字符信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaInfoFilePath() {
        return this.SchemaInfoFilePath;
    }

    /**
     * Set <p>结果集表字符信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaInfoFilePath <p>结果集表字符信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaInfoFilePath(String SchemaInfoFilePath) {
        this.SchemaInfoFilePath = SchemaInfoFilePath;
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
        if (source.ScriptContentTruncated != null) {
            this.ScriptContentTruncated = new Boolean(source.ScriptContentTruncated);
        }
        if (source.SchemaInfoFilePath != null) {
            this.SchemaInfoFilePath = new String(source.SchemaInfoFilePath);
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
        this.setParamSimple(map, prefix + "ScriptContentTruncated", this.ScriptContentTruncated);
        this.setParamSimple(map, prefix + "SchemaInfoFilePath", this.SchemaInfoFilePath);

    }
}

