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

public class DescribeIssueDetailRequest extends AbstractModel {

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
    * <p>开始时间，Unix 毫秒时间戳。可选。与 EndTime 必须成对传入；都不传时按全保留期统计。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间，Unix 毫秒时间戳。可选。与 StartTime 必须成对传入。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>环境。可选。为空表示全部环境。</p>
    */
    @SerializedName("Env")
    @Expose
    private String Env;

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
     * Get <p>开始时间，Unix 毫秒时间戳。可选。与 EndTime 必须成对传入；都不传时按全保留期统计。</p> 
     * @return StartTime <p>开始时间，Unix 毫秒时间戳。可选。与 EndTime 必须成对传入；都不传时按全保留期统计。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，Unix 毫秒时间戳。可选。与 EndTime 必须成对传入；都不传时按全保留期统计。</p>
     * @param StartTime <p>开始时间，Unix 毫秒时间戳。可选。与 EndTime 必须成对传入；都不传时按全保留期统计。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，Unix 毫秒时间戳。可选。与 StartTime 必须成对传入。</p> 
     * @return EndTime <p>结束时间，Unix 毫秒时间戳。可选。与 StartTime 必须成对传入。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，Unix 毫秒时间戳。可选。与 StartTime 必须成对传入。</p>
     * @param EndTime <p>结束时间，Unix 毫秒时间戳。可选。与 StartTime 必须成对传入。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
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

    public DescribeIssueDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIssueDetailRequest(DescribeIssueDetailRequest source) {
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
        if (source.Env != null) {
            this.Env = new String(source.Env);
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
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "Filters", this.Filters);

    }
}

