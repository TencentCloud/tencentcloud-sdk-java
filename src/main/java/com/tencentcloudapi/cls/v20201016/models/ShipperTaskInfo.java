/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShipperTaskInfo extends AbstractModel{

    /**
    * 投递任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 投递信息ID
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 本批投递的日志的开始时间戳，毫秒
    */
    @SerializedName("RangeStart")
    @Expose
    private Long RangeStart;

    /**
    * 本批投递的日志的结束时间戳， 毫秒
    */
    @SerializedName("RangeEnd")
    @Expose
    private Long RangeEnd;

    /**
    * 本次投递任务的开始时间戳， 毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 本次投递任务的结束时间戳， 毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 本次投递的结果，"success","running","failed"
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 结果的详细信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 投递任务ID 
     * @return TaskId 投递任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 投递任务ID
     * @param TaskId 投递任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 投递信息ID 
     * @return ShipperId 投递信息ID
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set 投递信息ID
     * @param ShipperId 投递信息ID
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

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
     * Get 本批投递的日志的开始时间戳，毫秒 
     * @return RangeStart 本批投递的日志的开始时间戳，毫秒
     */
    public Long getRangeStart() {
        return this.RangeStart;
    }

    /**
     * Set 本批投递的日志的开始时间戳，毫秒
     * @param RangeStart 本批投递的日志的开始时间戳，毫秒
     */
    public void setRangeStart(Long RangeStart) {
        this.RangeStart = RangeStart;
    }

    /**
     * Get 本批投递的日志的结束时间戳， 毫秒 
     * @return RangeEnd 本批投递的日志的结束时间戳， 毫秒
     */
    public Long getRangeEnd() {
        return this.RangeEnd;
    }

    /**
     * Set 本批投递的日志的结束时间戳， 毫秒
     * @param RangeEnd 本批投递的日志的结束时间戳， 毫秒
     */
    public void setRangeEnd(Long RangeEnd) {
        this.RangeEnd = RangeEnd;
    }

    /**
     * Get 本次投递任务的开始时间戳， 毫秒 
     * @return StartTime 本次投递任务的开始时间戳， 毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 本次投递任务的开始时间戳， 毫秒
     * @param StartTime 本次投递任务的开始时间戳， 毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 本次投递任务的结束时间戳， 毫秒 
     * @return EndTime 本次投递任务的结束时间戳， 毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 本次投递任务的结束时间戳， 毫秒
     * @param EndTime 本次投递任务的结束时间戳， 毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 本次投递的结果，"success","running","failed" 
     * @return Status 本次投递的结果，"success","running","failed"
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 本次投递的结果，"success","running","failed"
     * @param Status 本次投递的结果，"success","running","failed"
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 结果的详细信息 
     * @return Message 结果的详细信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 结果的详细信息
     * @param Message 结果的详细信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ShipperTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShipperTaskInfo(ShipperTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.RangeStart != null) {
            this.RangeStart = new Long(source.RangeStart);
        }
        if (source.RangeEnd != null) {
            this.RangeEnd = new Long(source.RangeEnd);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "RangeStart", this.RangeStart);
        this.setParamSimple(map, prefix + "RangeEnd", this.RangeEnd);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

