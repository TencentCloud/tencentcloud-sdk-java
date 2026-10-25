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

public class DescribeTDEMSessionReplayTimelineRequest extends AbstractModel {

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
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>数量限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>游标</p>
    */
    @SerializedName("Cursor")
    @Expose
    private Long Cursor;

    /**
    * <p>时间线分页的事件ID游标，与时间游标Cursor共同定位续页起点，用于同一时间戳下的稳定分页。</p>
    */
    @SerializedName("CursorEventId")
    @Expose
    private String CursorEventId;

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
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>数量限制</p> 
     * @return Limit <p>数量限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>数量限制</p>
     * @param Limit <p>数量限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>游标</p> 
     * @return Cursor <p>游标</p>
     */
    public Long getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>游标</p>
     * @param Cursor <p>游标</p>
     */
    public void setCursor(Long Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get <p>时间线分页的事件ID游标，与时间游标Cursor共同定位续页起点，用于同一时间戳下的稳定分页。</p> 
     * @return CursorEventId <p>时间线分页的事件ID游标，与时间游标Cursor共同定位续页起点，用于同一时间戳下的稳定分页。</p>
     */
    public String getCursorEventId() {
        return this.CursorEventId;
    }

    /**
     * Set <p>时间线分页的事件ID游标，与时间游标Cursor共同定位续页起点，用于同一时间戳下的稳定分页。</p>
     * @param CursorEventId <p>时间线分页的事件ID游标，与时间游标Cursor共同定位续页起点，用于同一时间戳下的稳定分页。</p>
     */
    public void setCursorEventId(String CursorEventId) {
        this.CursorEventId = CursorEventId;
    }

    public DescribeTDEMSessionReplayTimelineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMSessionReplayTimelineRequest(DescribeTDEMSessionReplayTimelineRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Cursor != null) {
            this.Cursor = new Long(source.Cursor);
        }
        if (source.CursorEventId != null) {
            this.CursorEventId = new String(source.CursorEventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "CursorEventId", this.CursorEventId);

    }
}

