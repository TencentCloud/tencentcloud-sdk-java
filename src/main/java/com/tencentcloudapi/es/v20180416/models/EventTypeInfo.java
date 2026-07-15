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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventTypeInfo extends AbstractModel {

    /**
    * <p>事件类型</p>
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * <p>事件名称</p>
    */
    @SerializedName("EventTypeName")
    @Expose
    private String EventTypeName;

    /**
     * Get <p>事件类型</p> 
     * @return EventType <p>事件类型</p>
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>事件类型</p>
     * @param EventType <p>事件类型</p>
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>事件名称</p> 
     * @return EventTypeName <p>事件名称</p>
     */
    public String getEventTypeName() {
        return this.EventTypeName;
    }

    /**
     * Set <p>事件名称</p>
     * @param EventTypeName <p>事件名称</p>
     */
    public void setEventTypeName(String EventTypeName) {
        this.EventTypeName = EventTypeName;
    }

    public EventTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventTypeInfo(EventTypeInfo source) {
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventTypeName != null) {
            this.EventTypeName = new String(source.EventTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventTypeName", this.EventTypeName);

    }
}

