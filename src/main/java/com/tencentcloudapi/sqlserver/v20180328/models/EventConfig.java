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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventConfig extends AbstractModel{

    /**
    * 事件类型，slow-设置慢SQL阈值，blocked-设置阻塞、死锁阈值
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 阈值，单位毫秒。0表示关闭，大于0表示开启
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
     * Get 事件类型，slow-设置慢SQL阈值，blocked-设置阻塞、死锁阈值 
     * @return EventType 事件类型，slow-设置慢SQL阈值，blocked-设置阻塞、死锁阈值
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型，slow-设置慢SQL阈值，blocked-设置阻塞、死锁阈值
     * @param EventType 事件类型，slow-设置慢SQL阈值，blocked-设置阻塞、死锁阈值
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 阈值，单位毫秒。0表示关闭，大于0表示开启 
     * @return Threshold 阈值，单位毫秒。0表示关闭，大于0表示开启
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 阈值，单位毫秒。0表示关闭，大于0表示开启
     * @param Threshold 阈值，单位毫秒。0表示关闭，大于0表示开启
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    public EventConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventConfig(EventConfig source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

