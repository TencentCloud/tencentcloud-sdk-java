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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogAnalysisDownloadTask extends AbstractModel {

    /**
    * <p>任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>数据归属地区，取值有：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>开始时间，示例值：2020-04-29T00:00:00Z。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，示例值：2020-04-30T00:00:00Z。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>日志类型，取值有：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul></p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，长度上限 12KB。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>文件格式，取值有：</p><ul><li>csv 。</li></ul>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>原始日志是否按时间排序返回，取值有：<ul><li>asc：升序；</li><li>desc：降序。</li></ul></p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>任务状态，取值有：<ul><li>loading：处理中，等待生成下载链接；</li><li> failed: 处理失败，当前任务无法下载;</li><li>completed：已完成打包，可以下载。</li></ul></p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务创建时间，任务创建成功后将保留3天。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>下载地址，仅当 Status = completed 时有返回值。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>下载任务过期时间，过期后下载地址将不可用，请通过本接口获取新的下载地址。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get <p>任务 ID。</p> 
     * @return TaskId <p>任务 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID。</p>
     * @param TaskId <p>任务 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>数据归属地区，取值有：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p> 
     * @return Area <p>数据归属地区，取值有：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>数据归属地区，取值有：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p>
     * @param Area <p>数据归属地区，取值有：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>开始时间，示例值：2020-04-29T00:00:00Z。</p> 
     * @return StartTime <p>开始时间，示例值：2020-04-29T00:00:00Z。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，示例值：2020-04-29T00:00:00Z。</p>
     * @param StartTime <p>开始时间，示例值：2020-04-29T00:00:00Z。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，示例值：2020-04-30T00:00:00Z。</p> 
     * @return EndTime <p>结束时间，示例值：2020-04-30T00:00:00Z。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，示例值：2020-04-30T00:00:00Z。</p>
     * @param EndTime <p>结束时间，示例值：2020-04-30T00:00:00Z。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>日志类型，取值有：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul></p> 
     * @return LogType <p>日志类型，取值有：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul></p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型，取值有：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul></p>
     * @param LogType <p>日志类型，取值有：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul></p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，长度上限 12KB。</p> 
     * @return Condition <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，长度上限 12KB。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，长度上限 12KB。</p>
     * @param Condition <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，长度上限 12KB。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>文件格式，取值有：</p><ul><li>csv 。</li></ul> 
     * @return Format <p>文件格式，取值有：</p><ul><li>csv 。</li></ul>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>文件格式，取值有：</p><ul><li>csv 。</li></ul>
     * @param Format <p>文件格式，取值有：</p><ul><li>csv 。</li></ul>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>原始日志是否按时间排序返回，取值有：<ul><li>asc：升序；</li><li>desc：降序。</li></ul></p> 
     * @return Sort <p>原始日志是否按时间排序返回，取值有：<ul><li>asc：升序；</li><li>desc：降序。</li></ul></p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>原始日志是否按时间排序返回，取值有：<ul><li>asc：升序；</li><li>desc：降序。</li></ul></p>
     * @param Sort <p>原始日志是否按时间排序返回，取值有：<ul><li>asc：升序；</li><li>desc：降序。</li></ul></p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>任务状态，取值有：<ul><li>loading：处理中，等待生成下载链接；</li><li> failed: 处理失败，当前任务无法下载;</li><li>completed：已完成打包，可以下载。</li></ul></p> 
     * @return Status <p>任务状态，取值有：<ul><li>loading：处理中，等待生成下载链接；</li><li> failed: 处理失败，当前任务无法下载;</li><li>completed：已完成打包，可以下载。</li></ul></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，取值有：<ul><li>loading：处理中，等待生成下载链接；</li><li> failed: 处理失败，当前任务无法下载;</li><li>completed：已完成打包，可以下载。</li></ul></p>
     * @param Status <p>任务状态，取值有：<ul><li>loading：处理中，等待生成下载链接；</li><li> failed: 处理失败，当前任务无法下载;</li><li>completed：已完成打包，可以下载。</li></ul></p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务创建时间，任务创建成功后将保留3天。</p> 
     * @return CreateTime <p>任务创建时间，任务创建成功后将保留3天。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间，任务创建成功后将保留3天。</p>
     * @param CreateTime <p>任务创建时间，任务创建成功后将保留3天。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>下载地址，仅当 Status = completed 时有返回值。</p> 
     * @return Url <p>下载地址，仅当 Status = completed 时有返回值。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>下载地址，仅当 Status = completed 时有返回值。</p>
     * @param Url <p>下载地址，仅当 Status = completed 时有返回值。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>下载任务过期时间，过期后下载地址将不可用，请通过本接口获取新的下载地址。</p> 
     * @return ExpireTime <p>下载任务过期时间，过期后下载地址将不可用，请通过本接口获取新的下载地址。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>下载任务过期时间，过期后下载地址将不可用，请通过本接口获取新的下载地址。</p>
     * @param ExpireTime <p>下载任务过期时间，过期后下载地址将不可用，请通过本接口获取新的下载地址。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public LogAnalysisDownloadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogAnalysisDownloadTask(LogAnalysisDownloadTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

