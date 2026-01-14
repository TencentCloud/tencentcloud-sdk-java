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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EstimateRebuildIndexTaskRequest extends AbstractModel {

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 预估任务起始时间，毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 预估任务结束时间，毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 预估任务起始时间，毫秒 
     * @return StartTime 预估任务起始时间，毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 预估任务起始时间，毫秒
     * @param StartTime 预估任务起始时间，毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 预估任务结束时间，毫秒 
     * @return EndTime 预估任务结束时间，毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 预估任务结束时间，毫秒
     * @param EndTime 预估任务结束时间，毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public EstimateRebuildIndexTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EstimateRebuildIndexTaskRequest(EstimateRebuildIndexTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

