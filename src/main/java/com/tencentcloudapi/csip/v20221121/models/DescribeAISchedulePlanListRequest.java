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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAISchedulePlanListRequest extends AbstractModel {

    /**
    * <p>AI 定时任务 ID。可通过 DescribeAIScheduleList 接口获取。</p>
    */
    @SerializedName("ScheduleId")
    @Expose
    private String ScheduleId;

    /**
    * <p>预览窗口开始时间，Unix 毫秒时间戳，0 表示当前时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>预览窗口结束时间，Unix 毫秒时间戳。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>分页偏移量，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>最大返回条数，默认 20，最大 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>AI 定时任务 ID。可通过 DescribeAIScheduleList 接口获取。</p> 
     * @return ScheduleId <p>AI 定时任务 ID。可通过 DescribeAIScheduleList 接口获取。</p>
     */
    public String getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>AI 定时任务 ID。可通过 DescribeAIScheduleList 接口获取。</p>
     * @param ScheduleId <p>AI 定时任务 ID。可通过 DescribeAIScheduleList 接口获取。</p>
     */
    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get <p>预览窗口开始时间，Unix 毫秒时间戳，0 表示当前时间。</p> 
     * @return StartTime <p>预览窗口开始时间，Unix 毫秒时间戳，0 表示当前时间。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>预览窗口开始时间，Unix 毫秒时间戳，0 表示当前时间。</p>
     * @param StartTime <p>预览窗口开始时间，Unix 毫秒时间戳，0 表示当前时间。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>预览窗口结束时间，Unix 毫秒时间戳。</p> 
     * @return EndTime <p>预览窗口结束时间，Unix 毫秒时间戳。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>预览窗口结束时间，Unix 毫秒时间戳。</p>
     * @param EndTime <p>预览窗口结束时间，Unix 毫秒时间戳。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>分页偏移量，默认 0。</p> 
     * @return Offset <p>分页偏移量，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认 0。</p>
     * @param Offset <p>分页偏移量，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>最大返回条数，默认 20，最大 100。</p> 
     * @return Limit <p>最大返回条数，默认 20，最大 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>最大返回条数，默认 20，最大 100。</p>
     * @param Limit <p>最大返回条数，默认 20，最大 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAISchedulePlanListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAISchedulePlanListRequest(DescribeAISchedulePlanListRequest source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new String(source.ScheduleId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

