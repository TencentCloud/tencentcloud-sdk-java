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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobStatusHistory extends AbstractModel {

    /**
    * 历史记录ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 源状态
    */
    @SerializedName("FromState")
    @Expose
    private String FromState;

    /**
    * 目标状态
    */
    @SerializedName("ToState")
    @Expose
    private String ToState;

    /**
    * 触发事件
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 转换时间（毫秒时间戳）
    */
    @SerializedName("TransitionTime")
    @Expose
    private Long TransitionTime;

    /**
     * Get 历史记录ID 
     * @return Id 历史记录ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 历史记录ID
     * @param Id 历史记录ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 作业ID 
     * @return JobId 作业ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID
     * @param JobId 作业ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业名称 
     * @return JobName 作业名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 作业名称
     * @param JobName 作业名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 源状态 
     * @return FromState 源状态
     */
    public String getFromState() {
        return this.FromState;
    }

    /**
     * Set 源状态
     * @param FromState 源状态
     */
    public void setFromState(String FromState) {
        this.FromState = FromState;
    }

    /**
     * Get 目标状态 
     * @return ToState 目标状态
     */
    public String getToState() {
        return this.ToState;
    }

    /**
     * Set 目标状态
     * @param ToState 目标状态
     */
    public void setToState(String ToState) {
        this.ToState = ToState;
    }

    /**
     * Get 触发事件 
     * @return Event 触发事件
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 触发事件
     * @param Event 触发事件
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get 消息 
     * @return Message 消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 消息
     * @param Message 消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 转换时间（毫秒时间戳） 
     * @return TransitionTime 转换时间（毫秒时间戳）
     */
    public Long getTransitionTime() {
        return this.TransitionTime;
    }

    /**
     * Set 转换时间（毫秒时间戳）
     * @param TransitionTime 转换时间（毫秒时间戳）
     */
    public void setTransitionTime(Long TransitionTime) {
        this.TransitionTime = TransitionTime;
    }

    public JobStatusHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobStatusHistory(JobStatusHistory source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.FromState != null) {
            this.FromState = new String(source.FromState);
        }
        if (source.ToState != null) {
            this.ToState = new String(source.ToState);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.TransitionTime != null) {
            this.TransitionTime = new Long(source.TransitionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "FromState", this.FromState);
        this.setParamSimple(map, prefix + "ToState", this.ToState);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "TransitionTime", this.TransitionTime);

    }
}

