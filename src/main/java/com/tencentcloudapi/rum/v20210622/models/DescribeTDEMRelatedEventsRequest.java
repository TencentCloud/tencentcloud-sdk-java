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

public class DescribeTDEMRelatedEventsRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间 Unix 毫秒（必填，用于分区裁剪）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>模式：timeline / page / breadcrumb（必填）</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>会话 ID（必填）</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>页面 URL（Mode=page 必填）</p>
    */
    @SerializedName("PageUrl")
    @Expose
    private String PageUrl;

    /**
    * <p>锚点 Unix 毫秒（Mode=page/breadcrumb 使用）</p>
    */
    @SerializedName("AnchorTimestamp")
    @Expose
    private Long AnchorTimestamp;

    /**
    * <p>偏移，&gt;=0，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>条数，1-200，默认 200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>事件分类（可选）</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>关键字（可选）</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>视图 ID</p>
    */
    @SerializedName("ViewId")
    @Expose
    private String ViewId;

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>开始时间 Unix 毫秒（必填，用于分区裁剪）</p> 
     * @return StartTime <p>开始时间 Unix 毫秒（必填，用于分区裁剪）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间 Unix 毫秒（必填，用于分区裁剪）</p>
     * @param StartTime <p>开始时间 Unix 毫秒（必填，用于分区裁剪）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间 Unix 毫秒（必填）</p> 
     * @return EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间 Unix 毫秒（必填）</p>
     * @param EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>模式：timeline / page / breadcrumb（必填）</p> 
     * @return Mode <p>模式：timeline / page / breadcrumb（必填）</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>模式：timeline / page / breadcrumb（必填）</p>
     * @param Mode <p>模式：timeline / page / breadcrumb（必填）</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>会话 ID（必填）</p> 
     * @return SessionId <p>会话 ID（必填）</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID（必填）</p>
     * @param SessionId <p>会话 ID（必填）</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>页面 URL（Mode=page 必填）</p> 
     * @return PageUrl <p>页面 URL（Mode=page 必填）</p>
     */
    public String getPageUrl() {
        return this.PageUrl;
    }

    /**
     * Set <p>页面 URL（Mode=page 必填）</p>
     * @param PageUrl <p>页面 URL（Mode=page 必填）</p>
     */
    public void setPageUrl(String PageUrl) {
        this.PageUrl = PageUrl;
    }

    /**
     * Get <p>锚点 Unix 毫秒（Mode=page/breadcrumb 使用）</p> 
     * @return AnchorTimestamp <p>锚点 Unix 毫秒（Mode=page/breadcrumb 使用）</p>
     */
    public Long getAnchorTimestamp() {
        return this.AnchorTimestamp;
    }

    /**
     * Set <p>锚点 Unix 毫秒（Mode=page/breadcrumb 使用）</p>
     * @param AnchorTimestamp <p>锚点 Unix 毫秒（Mode=page/breadcrumb 使用）</p>
     */
    public void setAnchorTimestamp(Long AnchorTimestamp) {
        this.AnchorTimestamp = AnchorTimestamp;
    }

    /**
     * Get <p>偏移，&gt;=0，默认 0</p> 
     * @return Offset <p>偏移，&gt;=0，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移，&gt;=0，默认 0</p>
     * @param Offset <p>偏移，&gt;=0，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>条数，1-200，默认 200</p> 
     * @return Limit <p>条数，1-200，默认 200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>条数，1-200，默认 200</p>
     * @param Limit <p>条数，1-200，默认 200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>事件分类（可选）</p> 
     * @return Category <p>事件分类（可选）</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>事件分类（可选）</p>
     * @param Category <p>事件分类（可选）</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>关键字（可选）</p> 
     * @return Keyword <p>关键字（可选）</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键字（可选）</p>
     * @param Keyword <p>关键字（可选）</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>视图 ID</p> 
     * @return ViewId <p>视图 ID</p>
     */
    public String getViewId() {
        return this.ViewId;
    }

    /**
     * Set <p>视图 ID</p>
     * @param ViewId <p>视图 ID</p>
     */
    public void setViewId(String ViewId) {
        this.ViewId = ViewId;
    }

    public DescribeTDEMRelatedEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMRelatedEventsRequest(DescribeTDEMRelatedEventsRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.PageUrl != null) {
            this.PageUrl = new String(source.PageUrl);
        }
        if (source.AnchorTimestamp != null) {
            this.AnchorTimestamp = new Long(source.AnchorTimestamp);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ViewId != null) {
            this.ViewId = new String(source.ViewId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "PageUrl", this.PageUrl);
        this.setParamSimple(map, prefix + "AnchorTimestamp", this.AnchorTimestamp);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ViewId", this.ViewId);

    }
}

