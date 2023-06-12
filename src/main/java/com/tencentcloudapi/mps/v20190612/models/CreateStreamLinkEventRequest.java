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

public class CreateStreamLinkEventRequest extends AbstractModel{

    /**
    * 事件名称。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 事件描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 事件名称。 
     * @return EventName 事件名称。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称。
     * @param EventName 事件名称。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件描述。 
     * @return Description 事件描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件描述。
     * @param Description 事件描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateStreamLinkEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLinkEventRequest(CreateStreamLinkEventRequest source) {
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
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

