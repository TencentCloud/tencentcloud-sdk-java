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

public class DescribeIssuesRequest extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

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
    * <p>环境过滤，如 prod、test</p>
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * <p>Issue 类型过滤，可选值：native_crash、js_error、event_loop_block</p>
    */
    @SerializedName("IssueTypes")
    @Expose
    private String [] IssueTypes;

    /**
    * <p>状态过滤，可选值：Unresolved、Resolved、Ignored、Regressed</p>
    */
    @SerializedName("Statuses")
    @Expose
    private String [] Statuses;

    /**
    * <p>Issue 标题或错误关键字模糊搜索</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>排序字段，可选值：last_seen、first_seen、event_count、affected_users</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方向，可选值：asc、desc</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * <p>页码，默认 1</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>分页大小，默认 20，范围 1~100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get <p>环境过滤，如 prod、test</p> 
     * @return Env <p>环境过滤，如 prod、test</p>
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境过滤，如 prod、test</p>
     * @param Env <p>环境过滤，如 prod、test</p>
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get <p>Issue 类型过滤，可选值：native_crash、js_error、event_loop_block</p> 
     * @return IssueTypes <p>Issue 类型过滤，可选值：native_crash、js_error、event_loop_block</p>
     */
    public String [] getIssueTypes() {
        return this.IssueTypes;
    }

    /**
     * Set <p>Issue 类型过滤，可选值：native_crash、js_error、event_loop_block</p>
     * @param IssueTypes <p>Issue 类型过滤，可选值：native_crash、js_error、event_loop_block</p>
     */
    public void setIssueTypes(String [] IssueTypes) {
        this.IssueTypes = IssueTypes;
    }

    /**
     * Get <p>状态过滤，可选值：Unresolved、Resolved、Ignored、Regressed</p> 
     * @return Statuses <p>状态过滤，可选值：Unresolved、Resolved、Ignored、Regressed</p>
     */
    public String [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set <p>状态过滤，可选值：Unresolved、Resolved、Ignored、Regressed</p>
     * @param Statuses <p>状态过滤，可选值：Unresolved、Resolved、Ignored、Regressed</p>
     */
    public void setStatuses(String [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get <p>Issue 标题或错误关键字模糊搜索</p> 
     * @return Keyword <p>Issue 标题或错误关键字模糊搜索</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>Issue 标题或错误关键字模糊搜索</p>
     * @param Keyword <p>Issue 标题或错误关键字模糊搜索</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type</p> 
     * @return Filters <p>扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type</p>
     * @param Filters <p>扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段，可选值：last_seen、first_seen、event_count、affected_users</p> 
     * @return SortBy <p>排序字段，可选值：last_seen、first_seen、event_count、affected_users</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段，可选值：last_seen、first_seen、event_count、affected_users</p>
     * @param SortBy <p>排序字段，可选值：last_seen、first_seen、event_count、affected_users</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方向，可选值：asc、desc</p> 
     * @return SortOrder <p>排序方向，可选值：asc、desc</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序方向，可选值：asc、desc</p>
     * @param SortOrder <p>排序方向，可选值：asc、desc</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>页码，默认 1</p> 
     * @return Page <p>页码，默认 1</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码，默认 1</p>
     * @param Page <p>页码，默认 1</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>分页大小，默认 20，范围 1~100</p> 
     * @return PageSize <p>分页大小，默认 20，范围 1~100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小，默认 20，范围 1~100</p>
     * @param PageSize <p>分页大小，默认 20，范围 1~100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeIssuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIssuesRequest(DescribeIssuesRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
        if (source.IssueTypes != null) {
            this.IssueTypes = new String[source.IssueTypes.length];
            for (int i = 0; i < source.IssueTypes.length; i++) {
                this.IssueTypes[i] = new String(source.IssueTypes[i]);
            }
        }
        if (source.Statuses != null) {
            this.Statuses = new String[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new String(source.Statuses[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamArraySimple(map, prefix + "IssueTypes.", this.IssueTypes);
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

