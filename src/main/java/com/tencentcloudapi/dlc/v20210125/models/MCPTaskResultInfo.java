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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MCPTaskResultInfo extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>状态</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>结果集 Schema</p>
    */
    @SerializedName("ResultSchema")
    @Expose
    private Column [] ResultSchema;

    /**
    * <p>结果集</p>
    */
    @SerializedName("ResultSet")
    @Expose
    private String ResultSet;

    /**
    * <p>是否还有其他结果</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <p>影响行数</p>
    */
    @SerializedName("RowAffectInfo")
    @Expose
    private String RowAffectInfo;

    /**
    * <p>输出信息</p>
    */
    @SerializedName("OutputMessage")
    @Expose
    private String OutputMessage;

    /**
    * <p>展示 format</p>
    */
    @SerializedName("DisplayFormat")
    @Expose
    private String DisplayFormat;

    /**
    * <p>能否下载</p>
    */
    @SerializedName("CanDownload")
    @Expose
    private Boolean CanDownload;

    /**
    * <p>结果花费时间</p><p>单位：毫秒</p>
    */
    @SerializedName("QueryResultTime")
    @Expose
    private Float QueryResultTime;

    /**
    * <p>是否超大</p>
    */
    @SerializedName("IsResultOversize")
    @Expose
    private Boolean IsResultOversize;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>状态</p> 
     * @return State <p>状态</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>状态</p>
     * @param State <p>状态</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>结果集 Schema</p> 
     * @return ResultSchema <p>结果集 Schema</p>
     */
    public Column [] getResultSchema() {
        return this.ResultSchema;
    }

    /**
     * Set <p>结果集 Schema</p>
     * @param ResultSchema <p>结果集 Schema</p>
     */
    public void setResultSchema(Column [] ResultSchema) {
        this.ResultSchema = ResultSchema;
    }

    /**
     * Get <p>结果集</p> 
     * @return ResultSet <p>结果集</p>
     */
    public String getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set <p>结果集</p>
     * @param ResultSet <p>结果集</p>
     */
    public void setResultSet(String ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get <p>是否还有其他结果</p> 
     * @return NextToken <p>是否还有其他结果</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>是否还有其他结果</p>
     * @param NextToken <p>是否还有其他结果</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <p>影响行数</p> 
     * @return RowAffectInfo <p>影响行数</p>
     */
    public String getRowAffectInfo() {
        return this.RowAffectInfo;
    }

    /**
     * Set <p>影响行数</p>
     * @param RowAffectInfo <p>影响行数</p>
     */
    public void setRowAffectInfo(String RowAffectInfo) {
        this.RowAffectInfo = RowAffectInfo;
    }

    /**
     * Get <p>输出信息</p> 
     * @return OutputMessage <p>输出信息</p>
     */
    public String getOutputMessage() {
        return this.OutputMessage;
    }

    /**
     * Set <p>输出信息</p>
     * @param OutputMessage <p>输出信息</p>
     */
    public void setOutputMessage(String OutputMessage) {
        this.OutputMessage = OutputMessage;
    }

    /**
     * Get <p>展示 format</p> 
     * @return DisplayFormat <p>展示 format</p>
     */
    public String getDisplayFormat() {
        return this.DisplayFormat;
    }

    /**
     * Set <p>展示 format</p>
     * @param DisplayFormat <p>展示 format</p>
     */
    public void setDisplayFormat(String DisplayFormat) {
        this.DisplayFormat = DisplayFormat;
    }

    /**
     * Get <p>能否下载</p> 
     * @return CanDownload <p>能否下载</p>
     */
    public Boolean getCanDownload() {
        return this.CanDownload;
    }

    /**
     * Set <p>能否下载</p>
     * @param CanDownload <p>能否下载</p>
     */
    public void setCanDownload(Boolean CanDownload) {
        this.CanDownload = CanDownload;
    }

    /**
     * Get <p>结果花费时间</p><p>单位：毫秒</p> 
     * @return QueryResultTime <p>结果花费时间</p><p>单位：毫秒</p>
     */
    public Float getQueryResultTime() {
        return this.QueryResultTime;
    }

    /**
     * Set <p>结果花费时间</p><p>单位：毫秒</p>
     * @param QueryResultTime <p>结果花费时间</p><p>单位：毫秒</p>
     */
    public void setQueryResultTime(Float QueryResultTime) {
        this.QueryResultTime = QueryResultTime;
    }

    /**
     * Get <p>是否超大</p> 
     * @return IsResultOversize <p>是否超大</p>
     */
    public Boolean getIsResultOversize() {
        return this.IsResultOversize;
    }

    /**
     * Set <p>是否超大</p>
     * @param IsResultOversize <p>是否超大</p>
     */
    public void setIsResultOversize(Boolean IsResultOversize) {
        this.IsResultOversize = IsResultOversize;
    }

    public MCPTaskResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPTaskResultInfo(MCPTaskResultInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.ResultSchema != null) {
            this.ResultSchema = new Column[source.ResultSchema.length];
            for (int i = 0; i < source.ResultSchema.length; i++) {
                this.ResultSchema[i] = new Column(source.ResultSchema[i]);
            }
        }
        if (source.ResultSet != null) {
            this.ResultSet = new String(source.ResultSet);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.RowAffectInfo != null) {
            this.RowAffectInfo = new String(source.RowAffectInfo);
        }
        if (source.OutputMessage != null) {
            this.OutputMessage = new String(source.OutputMessage);
        }
        if (source.DisplayFormat != null) {
            this.DisplayFormat = new String(source.DisplayFormat);
        }
        if (source.CanDownload != null) {
            this.CanDownload = new Boolean(source.CanDownload);
        }
        if (source.QueryResultTime != null) {
            this.QueryResultTime = new Float(source.QueryResultTime);
        }
        if (source.IsResultOversize != null) {
            this.IsResultOversize = new Boolean(source.IsResultOversize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "ResultSchema.", this.ResultSchema);
        this.setParamSimple(map, prefix + "ResultSet", this.ResultSet);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "RowAffectInfo", this.RowAffectInfo);
        this.setParamSimple(map, prefix + "OutputMessage", this.OutputMessage);
        this.setParamSimple(map, prefix + "DisplayFormat", this.DisplayFormat);
        this.setParamSimple(map, prefix + "CanDownload", this.CanDownload);
        this.setParamSimple(map, prefix + "QueryResultTime", this.QueryResultTime);
        this.setParamSimple(map, prefix + "IsResultOversize", this.IsResultOversize);

    }
}

