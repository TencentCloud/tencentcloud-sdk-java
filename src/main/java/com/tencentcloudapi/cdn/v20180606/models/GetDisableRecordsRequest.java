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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDisableRecordsRequest extends AbstractModel {

    /**
    * 指定 URL 查询
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 开始时间，如：2018-12-12 10:24:00。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如：2018-12-14 10:24:00。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * URL 当前状态
disable：当前仍为禁用状态，访问返回 403
enable：当前为可用状态，已解禁，可正常访问
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 分页查询偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目，默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 任务ID，任务ID和起始时间需要至少填写一项。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 指定 URL 查询 
     * @return Url 指定 URL 查询
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 指定 URL 查询
     * @param Url 指定 URL 查询
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 开始时间，如：2018-12-12 10:24:00。 
     * @return StartTime 开始时间，如：2018-12-12 10:24:00。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如：2018-12-12 10:24:00。
     * @param StartTime 开始时间，如：2018-12-12 10:24:00。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如：2018-12-14 10:24:00。 
     * @return EndTime 结束时间，如：2018-12-14 10:24:00。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如：2018-12-14 10:24:00。
     * @param EndTime 结束时间，如：2018-12-14 10:24:00。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get URL 当前状态
disable：当前仍为禁用状态，访问返回 403
enable：当前为可用状态，已解禁，可正常访问 
     * @return Status URL 当前状态
disable：当前仍为禁用状态，访问返回 403
enable：当前为可用状态，已解禁，可正常访问
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set URL 当前状态
disable：当前仍为禁用状态，访问返回 403
enable：当前为可用状态，已解禁，可正常访问
     * @param Status URL 当前状态
disable：当前仍为禁用状态，访问返回 403
enable：当前为可用状态，已解禁，可正常访问
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 分页查询偏移量，默认为 0 
     * @return Offset 分页查询偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为 0
     * @param Offset 分页查询偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目，默认为20。 
     * @return Limit 分页查询限制数目，默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认为20。
     * @param Limit 分页查询限制数目，默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 任务ID，任务ID和起始时间需要至少填写一项。 
     * @return TaskId 任务ID，任务ID和起始时间需要至少填写一项。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，任务ID和起始时间需要至少填写一项。
     * @param TaskId 任务ID，任务ID和起始时间需要至少填写一项。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public GetDisableRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDisableRecordsRequest(GetDisableRecordsRequest source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

