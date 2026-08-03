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

public class EventLogItem extends AbstractModel {

    /**
    * 事件时间（Unix 时间戳，秒级）
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
    * 组件名称
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 日志级别（INFO/WARN/ERROR）
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 事件内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 事件时间（Unix 时间戳，秒级） 
     * @return EventTime 事件时间（Unix 时间戳，秒级）
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件时间（Unix 时间戳，秒级）
     * @param EventTime 事件时间（Unix 时间戳，秒级）
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 组件名称 
     * @return Component 组件名称
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件名称
     * @param Component 组件名称
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 日志级别（INFO/WARN/ERROR） 
     * @return Level 日志级别（INFO/WARN/ERROR）
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 日志级别（INFO/WARN/ERROR）
     * @param Level 日志级别（INFO/WARN/ERROR）
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 事件内容 
     * @return Message 事件内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 事件内容
     * @param Message 事件内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public EventLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventLogItem(EventLogItem source) {
        if (source.EventTime != null) {
            this.EventTime = new Long(source.EventTime);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

