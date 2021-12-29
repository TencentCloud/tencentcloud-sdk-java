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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputFrontRisk extends AbstractModel{

    /**
    * 事件ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 趋势类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 当前开始时间
    */
    @SerializedName("CurrentStartTime")
    @Expose
    private String CurrentStartTime;

    /**
    * 当前结束时间
    */
    @SerializedName("CurrentEndTime")
    @Expose
    private String CurrentEndTime;

    /**
     * Get 事件ID 
     * @return EventId 事件ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID
     * @param EventId 事件ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 趋势类型 
     * @return Type 趋势类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 趋势类型
     * @param Type 趋势类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 当前开始时间 
     * @return CurrentStartTime 当前开始时间
     */
    public String getCurrentStartTime() {
        return this.CurrentStartTime;
    }

    /**
     * Set 当前开始时间
     * @param CurrentStartTime 当前开始时间
     */
    public void setCurrentStartTime(String CurrentStartTime) {
        this.CurrentStartTime = CurrentStartTime;
    }

    /**
     * Get 当前结束时间 
     * @return CurrentEndTime 当前结束时间
     */
    public String getCurrentEndTime() {
        return this.CurrentEndTime;
    }

    /**
     * Set 当前结束时间
     * @param CurrentEndTime 当前结束时间
     */
    public void setCurrentEndTime(String CurrentEndTime) {
        this.CurrentEndTime = CurrentEndTime;
    }

    public InputFrontRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputFrontRisk(InputFrontRisk source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CurrentStartTime != null) {
            this.CurrentStartTime = new String(source.CurrentStartTime);
        }
        if (source.CurrentEndTime != null) {
            this.CurrentEndTime = new String(source.CurrentEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CurrentStartTime", this.CurrentStartTime);
        this.setParamSimple(map, prefix + "CurrentEndTime", this.CurrentEndTime);

    }
}

