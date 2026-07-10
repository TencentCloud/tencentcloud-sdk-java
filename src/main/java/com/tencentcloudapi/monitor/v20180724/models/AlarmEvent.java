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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmEvent extends AbstractModel {

    /**
    * <p>事件名</p>
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * <p>展示的事件名</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>告警策略类型</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get <p>事件名</p> 
     * @return EventName <p>事件名</p>
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set <p>事件名</p>
     * @param EventName <p>事件名</p>
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get <p>展示的事件名</p> 
     * @return Description <p>展示的事件名</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>展示的事件名</p>
     * @param Description <p>展示的事件名</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>告警策略类型</p> 
     * @return Namespace <p>告警策略类型</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>告警策略类型</p>
     * @param Namespace <p>告警策略类型</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public AlarmEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmEvent(AlarmEvent source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

