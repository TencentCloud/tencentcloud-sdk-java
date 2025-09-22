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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAlarmMessagesRequest extends AbstractModel {

    /**
    * 所属项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页码数，用于翻页，最小值为 1。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的条数，最大 100 条
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 起始告警时间, 格式为yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 截止告警时间, 格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 告警级别
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警接收人Id
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * 对于传入和返回的过滤时区, 默认UTC+8
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 所属项目id 
     * @return ProjectId 所属项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目id
     * @param ProjectId 所属项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页码数，用于翻页，最小值为 1。 
     * @return PageNumber 页码数，用于翻页，最小值为 1。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码数，用于翻页，最小值为 1。
     * @param PageNumber 页码数，用于翻页，最小值为 1。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的条数，最大 100 条 
     * @return PageSize 每页显示的条数，最大 100 条
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的条数，最大 100 条
     * @param PageSize 每页显示的条数，最大 100 条
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 起始告警时间, 格式为yyyy-MM-dd HH:mm:ss 
     * @return StartTime 起始告警时间, 格式为yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始告警时间, 格式为yyyy-MM-dd HH:mm:ss
     * @param StartTime 起始告警时间, 格式为yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 截止告警时间, 格式yyyy-MM-dd HH:mm:ss 
     * @return EndTime 截止告警时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止告警时间, 格式yyyy-MM-dd HH:mm:ss
     * @param EndTime 截止告警时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 告警级别 
     * @return AlarmLevel 告警级别
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别
     * @param AlarmLevel 告警级别
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警接收人Id 
     * @return AlarmRecipientId 告警接收人Id
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set 告警接收人Id
     * @param AlarmRecipientId 告警接收人Id
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get 对于传入和返回的过滤时区, 默认UTC+8 
     * @return TimeZone 对于传入和返回的过滤时区, 默认UTC+8
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 对于传入和返回的过滤时区, 默认UTC+8
     * @param TimeZone 对于传入和返回的过滤时区, 默认UTC+8
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public ListAlarmMessagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAlarmMessagesRequest(ListAlarmMessagesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

