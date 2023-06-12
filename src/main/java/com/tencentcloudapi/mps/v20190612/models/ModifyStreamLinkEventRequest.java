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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamLinkEventRequest extends AbstractModel{

    /**
    * 媒体传输事件Event Id。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 需要修改的事件名称。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event的描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 媒体传输事件Event Id。 
     * @return EventId 媒体传输事件Event Id。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 媒体传输事件Event Id。
     * @param EventId 媒体传输事件Event Id。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 需要修改的事件名称。 
     * @return EventName 需要修改的事件名称。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 需要修改的事件名称。
     * @param EventName 需要修改的事件名称。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Event的描述信息。 
     * @return Description Event的描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event的描述信息。
     * @param Description Event的描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyStreamLinkEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLinkEventRequest(ModifyStreamLinkEventRequest source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

