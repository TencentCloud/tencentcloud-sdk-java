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

public class DescribeIssueAffectedUsersRequest extends AbstractModel {

    /**
    * <p>应用 ID（string，必填）。空 → InvalidParameter</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>问题 ID（string，必填）。空 → InvalidParameter</p>
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * <p>页码（整数，选填）。&lt; 1 钳制为 1；缺省 1</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页条数（整数，选填）。&lt; 1 或 &gt; 1000 回落默认 20；导出场景按 1000 一批拉全量</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>应用版本（string，选填）。按 app_version 精确匹配；空表示不限版本</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>起始毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限；与 StartTime 同时给出且 StartTime &gt; EndTime → InvalidParameter</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>身份值关键字（string，选填）。不区分大小写的子串匹配，命中 if(user_id='', session_id, user_id)；空表示不限</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>排序字段（string，选填）。可选 last_seen / first_seen / event_count；缺省 last_seen；其它值 → InvalidParameter</p>
    */
    @SerializedName("OrderKey")
    @Expose
    private String OrderKey;

    /**
    * <p>排序方向（string，选填）。可选 asc / desc；缺省 desc；其它值 → InvalidParameter</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get <p>应用 ID（string，必填）。空 → InvalidParameter</p> 
     * @return AppId <p>应用 ID（string，必填）。空 → InvalidParameter</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（string，必填）。空 → InvalidParameter</p>
     * @param AppId <p>应用 ID（string，必填）。空 → InvalidParameter</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>问题 ID（string，必填）。空 → InvalidParameter</p> 
     * @return IssueId <p>问题 ID（string，必填）。空 → InvalidParameter</p>
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set <p>问题 ID（string，必填）。空 → InvalidParameter</p>
     * @param IssueId <p>问题 ID（string，必填）。空 → InvalidParameter</p>
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get <p>页码（整数，选填）。&lt; 1 钳制为 1；缺省 1</p> 
     * @return Page <p>页码（整数，选填）。&lt; 1 钳制为 1；缺省 1</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码（整数，选填）。&lt; 1 钳制为 1；缺省 1</p>
     * @param Page <p>页码（整数，选填）。&lt; 1 钳制为 1；缺省 1</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页条数（整数，选填）。&lt; 1 或 &gt; 1000 回落默认 20；导出场景按 1000 一批拉全量</p> 
     * @return PageSize <p>每页条数（整数，选填）。&lt; 1 或 &gt; 1000 回落默认 20；导出场景按 1000 一批拉全量</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页条数（整数，选填）。&lt; 1 或 &gt; 1000 回落默认 20；导出场景按 1000 一批拉全量</p>
     * @param PageSize <p>每页条数（整数，选填）。&lt; 1 或 &gt; 1000 回落默认 20；导出场景按 1000 一批拉全量</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>应用版本（string，选填）。按 app_version 精确匹配；空表示不限版本</p> 
     * @return AppVersion <p>应用版本（string，选填）。按 app_version 精确匹配；空表示不限版本</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>应用版本（string，选填）。按 app_version 精确匹配；空表示不限版本</p>
     * @param AppVersion <p>应用版本（string，选填）。按 app_version 精确匹配；空表示不限版本</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>起始毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限</p> 
     * @return StartTime <p>起始毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限</p>
     * @param StartTime <p>起始毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限；与 StartTime 同时给出且 StartTime &gt; EndTime → InvalidParameter</p> 
     * @return EndTime <p>结束毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限；与 StartTime 同时给出且 StartTime &gt; EndTime → InvalidParameter</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限；与 StartTime 同时给出且 StartTime &gt; EndTime → InvalidParameter</p>
     * @param EndTime <p>结束毫秒时间戳（整数，选填）。&lt;= 0 表示该侧不限；与 StartTime 同时给出且 StartTime &gt; EndTime → InvalidParameter</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>身份值关键字（string，选填）。不区分大小写的子串匹配，命中 if(user_id='', session_id, user_id)；空表示不限</p> 
     * @return Keyword <p>身份值关键字（string，选填）。不区分大小写的子串匹配，命中 if(user_id='', session_id, user_id)；空表示不限</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>身份值关键字（string，选填）。不区分大小写的子串匹配，命中 if(user_id='', session_id, user_id)；空表示不限</p>
     * @param Keyword <p>身份值关键字（string，选填）。不区分大小写的子串匹配，命中 if(user_id='', session_id, user_id)；空表示不限</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>排序字段（string，选填）。可选 last_seen / first_seen / event_count；缺省 last_seen；其它值 → InvalidParameter</p> 
     * @return OrderKey <p>排序字段（string，选填）。可选 last_seen / first_seen / event_count；缺省 last_seen；其它值 → InvalidParameter</p>
     */
    public String getOrderKey() {
        return this.OrderKey;
    }

    /**
     * Set <p>排序字段（string，选填）。可选 last_seen / first_seen / event_count；缺省 last_seen；其它值 → InvalidParameter</p>
     * @param OrderKey <p>排序字段（string，选填）。可选 last_seen / first_seen / event_count；缺省 last_seen；其它值 → InvalidParameter</p>
     */
    public void setOrderKey(String OrderKey) {
        this.OrderKey = OrderKey;
    }

    /**
     * Get <p>排序方向（string，选填）。可选 asc / desc；缺省 desc；其它值 → InvalidParameter</p> 
     * @return OrderBy <p>排序方向（string，选填）。可选 asc / desc；缺省 desc；其它值 → InvalidParameter</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序方向（string，选填）。可选 asc / desc；缺省 desc；其它值 → InvalidParameter</p>
     * @param OrderBy <p>排序方向（string，选填）。可选 asc / desc；缺省 desc；其它值 → InvalidParameter</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeIssueAffectedUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIssueAffectedUsersRequest(DescribeIssueAffectedUsersRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
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
        if (source.OrderKey != null) {
            this.OrderKey = new String(source.OrderKey);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "OrderKey", this.OrderKey);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

