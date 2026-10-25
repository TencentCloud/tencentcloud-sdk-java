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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIssueTrendRequest extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Issue ID</p>
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * <p>开始时间，Unix 毫秒时间戳</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间，Unix 毫秒时间戳</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>趋势分桶，可选值：auto、1m、10m、1h、1d</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>环境。可选。为空表示全部环境。</p>
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * <p>关键字。可选。不传表示不过滤。</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。不传表示不附加这组筛选。</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Issue ID</p> 
     * @return IssueId <p>Issue ID</p>
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set <p>Issue ID</p>
     * @param IssueId <p>Issue ID</p>
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get <p>开始时间，Unix 毫秒时间戳</p> 
     * @return StartTime <p>开始时间，Unix 毫秒时间戳</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，Unix 毫秒时间戳</p>
     * @param StartTime <p>开始时间，Unix 毫秒时间戳</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，Unix 毫秒时间戳</p> 
     * @return EndTime <p>结束时间，Unix 毫秒时间戳</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，Unix 毫秒时间戳</p>
     * @param EndTime <p>结束时间，Unix 毫秒时间戳</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>趋势分桶，可选值：auto、1m、10m、1h、1d</p> 
     * @return Bucket <p>趋势分桶，可选值：auto、1m、10m、1h、1d</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>趋势分桶，可选值：auto、1m、10m、1h、1d</p>
     * @param Bucket <p>趋势分桶，可选值：auto、1m、10m、1h、1d</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>环境。可选。为空表示全部环境。</p> 
     * @return Env <p>环境。可选。为空表示全部环境。</p>
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境。可选。为空表示全部环境。</p>
     * @param Env <p>环境。可选。为空表示全部环境。</p>
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get <p>关键字。可选。不传表示不过滤。</p> 
     * @return Keyword <p>关键字。可选。不传表示不过滤。</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键字。可选。不传表示不过滤。</p>
     * @param Keyword <p>关键字。可选。不传表示不过滤。</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。不传表示不附加这组筛选。</p> 
     * @return Filters <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。不传表示不附加这组筛选。</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。不传表示不附加这组筛选。</p>
     * @param Filters <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。可选。不传表示不附加这组筛选。</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    public DescribeIssueTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIssueTrendRequest(DescribeIssueTrendRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Filters", this.Filters);

    }
}

