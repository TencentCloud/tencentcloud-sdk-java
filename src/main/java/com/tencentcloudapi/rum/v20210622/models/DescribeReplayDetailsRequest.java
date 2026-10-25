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

public class DescribeReplayDetailsRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>会话id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>回放id</p>
    */
    @SerializedName("ReplayId")
    @Expose
    private String ReplayId;

    /**
    * <p>事件类别， 默认为all</p>
    */
    @SerializedName("Categories")
    @Expose
    private String Categories;

    /**
    * <p>每页返回数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>游标分页，传上一次返回的 NextCursor 值。首次请求不传</p>
    */
    @SerializedName("Cursor")
    @Expose
    private Long Cursor;

    /**
    * <p>起始偏移（毫秒），相对于录屏开始时间。用于只查某个时间段的事件</p>
    */
    @SerializedName("StartOffsetMs")
    @Expose
    private Long StartOffsetMs;

    /**
    * <p>结束偏移（毫秒），必须 ≥ StartOffsetMs</p>
    */
    @SerializedName("EndOffsetMs")
    @Expose
    private Long EndOffsetMs;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>会话id</p> 
     * @return SessionId <p>会话id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话id</p>
     * @param SessionId <p>会话id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>回放id</p> 
     * @return ReplayId <p>回放id</p>
     */
    public String getReplayId() {
        return this.ReplayId;
    }

    /**
     * Set <p>回放id</p>
     * @param ReplayId <p>回放id</p>
     */
    public void setReplayId(String ReplayId) {
        this.ReplayId = ReplayId;
    }

    /**
     * Get <p>事件类别， 默认为all</p> 
     * @return Categories <p>事件类别， 默认为all</p>
     */
    public String getCategories() {
        return this.Categories;
    }

    /**
     * Set <p>事件类别， 默认为all</p>
     * @param Categories <p>事件类别， 默认为all</p>
     */
    public void setCategories(String Categories) {
        this.Categories = Categories;
    }

    /**
     * Get <p>每页返回数量</p> 
     * @return Limit <p>每页返回数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回数量</p>
     * @param Limit <p>每页返回数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>游标分页，传上一次返回的 NextCursor 值。首次请求不传</p> 
     * @return Cursor <p>游标分页，传上一次返回的 NextCursor 值。首次请求不传</p>
     */
    public Long getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>游标分页，传上一次返回的 NextCursor 值。首次请求不传</p>
     * @param Cursor <p>游标分页，传上一次返回的 NextCursor 值。首次请求不传</p>
     */
    public void setCursor(Long Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get <p>起始偏移（毫秒），相对于录屏开始时间。用于只查某个时间段的事件</p> 
     * @return StartOffsetMs <p>起始偏移（毫秒），相对于录屏开始时间。用于只查某个时间段的事件</p>
     */
    public Long getStartOffsetMs() {
        return this.StartOffsetMs;
    }

    /**
     * Set <p>起始偏移（毫秒），相对于录屏开始时间。用于只查某个时间段的事件</p>
     * @param StartOffsetMs <p>起始偏移（毫秒），相对于录屏开始时间。用于只查某个时间段的事件</p>
     */
    public void setStartOffsetMs(Long StartOffsetMs) {
        this.StartOffsetMs = StartOffsetMs;
    }

    /**
     * Get <p>结束偏移（毫秒），必须 ≥ StartOffsetMs</p> 
     * @return EndOffsetMs <p>结束偏移（毫秒），必须 ≥ StartOffsetMs</p>
     */
    public Long getEndOffsetMs() {
        return this.EndOffsetMs;
    }

    /**
     * Set <p>结束偏移（毫秒），必须 ≥ StartOffsetMs</p>
     * @param EndOffsetMs <p>结束偏移（毫秒），必须 ≥ StartOffsetMs</p>
     */
    public void setEndOffsetMs(Long EndOffsetMs) {
        this.EndOffsetMs = EndOffsetMs;
    }

    public DescribeReplayDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplayDetailsRequest(DescribeReplayDetailsRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ReplayId != null) {
            this.ReplayId = new String(source.ReplayId);
        }
        if (source.Categories != null) {
            this.Categories = new String(source.Categories);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Cursor != null) {
            this.Cursor = new Long(source.Cursor);
        }
        if (source.StartOffsetMs != null) {
            this.StartOffsetMs = new Long(source.StartOffsetMs);
        }
        if (source.EndOffsetMs != null) {
            this.EndOffsetMs = new Long(source.EndOffsetMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ReplayId", this.ReplayId);
        this.setParamSimple(map, prefix + "Categories", this.Categories);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "StartOffsetMs", this.StartOffsetMs);
        this.setParamSimple(map, prefix + "EndOffsetMs", this.EndOffsetMs);

    }
}

