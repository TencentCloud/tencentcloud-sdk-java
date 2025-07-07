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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEscapeEventDetailRequest extends AbstractModel {

    /**
    * 事件唯一id
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
     * Get 事件唯一id 
     * @return EventId 事件唯一id
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件唯一id
     * @param EventId 事件唯一id
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    public DescribeEscapeEventDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEscapeEventDetailRequest(DescribeEscapeEventDetailRequest source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);

    }
}

