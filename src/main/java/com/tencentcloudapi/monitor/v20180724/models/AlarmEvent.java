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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmEvent extends AbstractModel{

    /**
    * 事件名
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 展示的事件名
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 告警策略类型
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 事件名 
     * @return EventName 事件名
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名
     * @param EventName 事件名
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 展示的事件名 
     * @return Description 展示的事件名
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 展示的事件名
     * @param Description 展示的事件名
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 告警策略类型 
     * @return Namespace 告警策略类型
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 告警策略类型
     * @param Namespace 告警策略类型
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

