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

public class DescribeIssueEventsRequest extends AbstractModel {

    /**
    * 应用 ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Issue ID
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * 开始时间，Unix 毫秒时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，Unix 毫秒时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 事件关键字过滤
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * 页码，默认 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 分页大小，默认 20，范围 1~100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序方向，可选值：asc、desc
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get 应用 ID 
     * @return AppId 应用 ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用 ID
     * @param AppId 应用 ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Issue ID 
     * @return IssueId Issue ID
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set Issue ID
     * @param IssueId Issue ID
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get 开始时间，Unix 毫秒时间戳 
     * @return StartTime 开始时间，Unix 毫秒时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，Unix 毫秒时间戳
     * @param StartTime 开始时间，Unix 毫秒时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，Unix 毫秒时间戳 
     * @return EndTime 结束时间，Unix 毫秒时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，Unix 毫秒时间戳
     * @param EndTime 结束时间，Unix 毫秒时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 事件关键字过滤 
     * @return Keyword 事件关键字过滤
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 事件关键字过滤
     * @param Keyword 事件关键字过滤
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type 
     * @return Filters 扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set 扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type
     * @param Filters 扩展过滤器 JSON 字符串；白名单字段包括 app_version、country、province、city、device_type、browser、os、isp、referrer、user_type、platform、normalized_page_url、event_type、issue_id、environment、process_type
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 页码，默认 1 
     * @return Page 页码，默认 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码，默认 1
     * @param Page 页码，默认 1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 分页大小，默认 20，范围 1~100 
     * @return PageSize 分页大小，默认 20，范围 1~100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，默认 20，范围 1~100
     * @param PageSize 分页大小，默认 20，范围 1~100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序方向，可选值：asc、desc 
     * @return SortOrder 排序方向，可选值：asc、desc
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序方向，可选值：asc、desc
     * @param SortOrder 排序方向，可选值：asc、desc
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeIssueEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIssueEventsRequest(DescribeIssueEventsRequest source) {
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
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
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
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

