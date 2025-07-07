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

public class DownloadLogByLineRequest extends AbstractModel {

    /**
    * 开始行
    */
    @SerializedName("StartLine")
    @Expose
    private Long StartLine;

    /**
    * 读取行
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实例运行时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 任务详情id，用于读取切分的日志文件
    */
    @SerializedName("DetailId")
    @Expose
    private String DetailId;

    /**
    * base64编码的文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 任务记录id
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 子job id
    */
    @SerializedName("SubJobId")
    @Expose
    private String SubJobId;

    /**
    * hiveSql:34,sparkSql:36 dlcSql: 32
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * true:解析错误信息。false:不解析错误信息
    */
    @SerializedName("ParseErrorTip")
    @Expose
    private Boolean ParseErrorTip;

    /**
    * log 0 code 1 result 2 custo 3
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * 查询文件标志：0: 从执行机获取，1: 从cos获取，获取不到会再从执行机获取
    */
    @SerializedName("QueryFileFlag")
    @Expose
    private Long QueryFileFlag;

    /**
    * 透传字段，如果queryFileFlag为1，则ext回作为上一页的分页标识offset
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get 开始行 
     * @return StartLine 开始行
     */
    public Long getStartLine() {
        return this.StartLine;
    }

    /**
     * Set 开始行
     * @param StartLine 开始行
     */
    public void setStartLine(Long StartLine) {
        this.StartLine = StartLine;
    }

    /**
     * Get 读取行 
     * @return LineCount 读取行
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set 读取行
     * @param LineCount 读取行
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实例运行时间 
     * @return CurRunDate 实例运行时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 实例运行时间
     * @param CurRunDate 实例运行时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 任务详情id，用于读取切分的日志文件 
     * @return DetailId 任务详情id，用于读取切分的日志文件
     */
    public String getDetailId() {
        return this.DetailId;
    }

    /**
     * Set 任务详情id，用于读取切分的日志文件
     * @param DetailId 任务详情id，用于读取切分的日志文件
     */
    public void setDetailId(String DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get base64编码的文件路径 
     * @return FilePath base64编码的文件路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set base64编码的文件路径
     * @param FilePath base64编码的文件路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 任务记录id 
     * @return RecordId 任务记录id
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 任务记录id
     * @param RecordId 任务记录id
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 子job id 
     * @return SubJobId 子job id
     */
    public String getSubJobId() {
        return this.SubJobId;
    }

    /**
     * Set 子job id
     * @param SubJobId 子job id
     */
    public void setSubJobId(String SubJobId) {
        this.SubJobId = SubJobId;
    }

    /**
     * Get hiveSql:34,sparkSql:36 dlcSql: 32 
     * @return JobType hiveSql:34,sparkSql:36 dlcSql: 32
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set hiveSql:34,sparkSql:36 dlcSql: 32
     * @param JobType hiveSql:34,sparkSql:36 dlcSql: 32
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get true:解析错误信息。false:不解析错误信息 
     * @return ParseErrorTip true:解析错误信息。false:不解析错误信息
     */
    public Boolean getParseErrorTip() {
        return this.ParseErrorTip;
    }

    /**
     * Set true:解析错误信息。false:不解析错误信息
     * @param ParseErrorTip true:解析错误信息。false:不解析错误信息
     */
    public void setParseErrorTip(Boolean ParseErrorTip) {
        this.ParseErrorTip = ParseErrorTip;
    }

    /**
     * Get log 0 code 1 result 2 custo 3 
     * @return FileType log 0 code 1 result 2 custo 3
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set log 0 code 1 result 2 custo 3
     * @param FileType log 0 code 1 result 2 custo 3
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 查询文件标志：0: 从执行机获取，1: 从cos获取，获取不到会再从执行机获取 
     * @return QueryFileFlag 查询文件标志：0: 从执行机获取，1: 从cos获取，获取不到会再从执行机获取
     */
    public Long getQueryFileFlag() {
        return this.QueryFileFlag;
    }

    /**
     * Set 查询文件标志：0: 从执行机获取，1: 从cos获取，获取不到会再从执行机获取
     * @param QueryFileFlag 查询文件标志：0: 从执行机获取，1: 从cos获取，获取不到会再从执行机获取
     */
    public void setQueryFileFlag(Long QueryFileFlag) {
        this.QueryFileFlag = QueryFileFlag;
    }

    /**
     * Get 透传字段，如果queryFileFlag为1，则ext回作为上一页的分页标识offset 
     * @return ExtInfo 透传字段，如果queryFileFlag为1，则ext回作为上一页的分页标识offset
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 透传字段，如果queryFileFlag为1，则ext回作为上一页的分页标识offset
     * @param ExtInfo 透传字段，如果queryFileFlag为1，则ext回作为上一页的分页标识offset
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public DownloadLogByLineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadLogByLineRequest(DownloadLogByLineRequest source) {
        if (source.StartLine != null) {
            this.StartLine = new Long(source.StartLine);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.DetailId != null) {
            this.DetailId = new String(source.DetailId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.SubJobId != null) {
            this.SubJobId = new String(source.SubJobId);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.ParseErrorTip != null) {
            this.ParseErrorTip = new Boolean(source.ParseErrorTip);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.QueryFileFlag != null) {
            this.QueryFileFlag = new Long(source.QueryFileFlag);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartLine", this.StartLine);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "SubJobId", this.SubJobId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "ParseErrorTip", this.ParseErrorTip);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "QueryFileFlag", this.QueryFileFlag);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

