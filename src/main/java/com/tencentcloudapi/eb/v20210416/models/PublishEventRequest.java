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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishEventRequest extends AbstractModel{

    /**
    * 事件列表
    */
    @SerializedName("EventList")
    @Expose
    private Event [] EventList;

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
     * Get 事件列表 
     * @return EventList 事件列表
     */
    public Event [] getEventList() {
        return this.EventList;
    }

    /**
     * Set 事件列表
     * @param EventList 事件列表
     */
    public void setEventList(Event [] EventList) {
        this.EventList = EventList;
    }

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    public PublishEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishEventRequest(PublishEventRequest source) {
        if (source.EventList != null) {
            this.EventList = new Event[source.EventList.length];
            for (int i = 0; i < source.EventList.length; i++) {
                this.EventList[i] = new Event(source.EventList[i]);
            }
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventList.", this.EventList);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);

    }
}

