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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmEventRequest extends AbstractModel{

    /**
    * 告警事件，支持CPU、MEM、TCP
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 告警阈值
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 告警状态，0表示停用，1表示启动
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 告警开始时间，只有在这个时间后才会发送告警，当跟EndTime同时为空时表示全天告警
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 告警结束时间，只有在这个时间前才会发送告警，当跟BeginTime同时为空时表示全天告警
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 告警事件，支持CPU、MEM、TCP 
     * @return Event 告警事件，支持CPU、MEM、TCP
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 告警事件，支持CPU、MEM、TCP
     * @param Event 告警事件，支持CPU、MEM、TCP
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get 告警阈值 
     * @return Limit 告警阈值
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 告警阈值
     * @param Limit 告警阈值
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 告警状态，0表示停用，1表示启动 
     * @return Status 告警状态，0表示停用，1表示启动
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 告警状态，0表示停用，1表示启动
     * @param Status 告警状态，0表示停用，1表示启动
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 告警开始时间，只有在这个时间后才会发送告警，当跟EndTime同时为空时表示全天告警 
     * @return BeginTime 告警开始时间，只有在这个时间后才会发送告警，当跟EndTime同时为空时表示全天告警
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 告警开始时间，只有在这个时间后才会发送告警，当跟EndTime同时为空时表示全天告警
     * @param BeginTime 告警开始时间，只有在这个时间后才会发送告警，当跟EndTime同时为空时表示全天告警
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 告警结束时间，只有在这个时间前才会发送告警，当跟BeginTime同时为空时表示全天告警 
     * @return EndTime 告警结束时间，只有在这个时间前才会发送告警，当跟BeginTime同时为空时表示全天告警
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 告警结束时间，只有在这个时间前才会发送告警，当跟BeginTime同时为空时表示全天告警
     * @param EndTime 告警结束时间，只有在这个时间前才会发送告警，当跟BeginTime同时为空时表示全天告警
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ModifyAlarmEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmEventRequest(ModifyAlarmEventRequest source) {
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

