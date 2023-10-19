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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckRuleRequest extends AbstractModel {

    /**
    * Event信息
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * EventPattern信息
    */
    @SerializedName("EventPattern")
    @Expose
    private String EventPattern;

    /**
     * Get Event信息 
     * @return Event Event信息
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set Event信息
     * @param Event Event信息
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get EventPattern信息 
     * @return EventPattern EventPattern信息
     */
    public String getEventPattern() {
        return this.EventPattern;
    }

    /**
     * Set EventPattern信息
     * @param EventPattern EventPattern信息
     */
    public void setEventPattern(String EventPattern) {
        this.EventPattern = EventPattern;
    }

    public CheckRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckRuleRequest(CheckRuleRequest source) {
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.EventPattern != null) {
            this.EventPattern = new String(source.EventPattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "EventPattern", this.EventPattern);

    }
}

