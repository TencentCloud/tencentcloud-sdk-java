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

public class EventItem extends AbstractModel {

    /**
    * <p>事件时间（Unix 时间戳，毫秒）</p>
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
    * <p>组件名称，来源于 event.involvedObject.kind</p>
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * <p>事件级别，来源于 event.type 的原始值（如 Normal、Warning）</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>事件内容，来源于 event.message</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>关联的 K8s 对象名称，来源于 event.involvedObject.name</p>
    */
    @SerializedName("InvolvedObjectName")
    @Expose
    private String InvolvedObjectName;

    /**
    * <p>事件来源组件，来源于 event.source.component</p>
    */
    @SerializedName("SourceComponent")
    @Expose
    private String SourceComponent;

    /**
    * <p>事件原因，来源于 event.reason</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>事件时间（Unix 时间戳，毫秒）</p> 
     * @return EventTime <p>事件时间（Unix 时间戳，毫秒）</p>
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>事件时间（Unix 时间戳，毫秒）</p>
     * @param EventTime <p>事件时间（Unix 时间戳，毫秒）</p>
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>组件名称，来源于 event.involvedObject.kind</p> 
     * @return Component <p>组件名称，来源于 event.involvedObject.kind</p>
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set <p>组件名称，来源于 event.involvedObject.kind</p>
     * @param Component <p>组件名称，来源于 event.involvedObject.kind</p>
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get <p>事件级别，来源于 event.type 的原始值（如 Normal、Warning）</p> 
     * @return Level <p>事件级别，来源于 event.type 的原始值（如 Normal、Warning）</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>事件级别，来源于 event.type 的原始值（如 Normal、Warning）</p>
     * @param Level <p>事件级别，来源于 event.type 的原始值（如 Normal、Warning）</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>事件内容，来源于 event.message</p> 
     * @return Message <p>事件内容，来源于 event.message</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>事件内容，来源于 event.message</p>
     * @param Message <p>事件内容，来源于 event.message</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>关联的 K8s 对象名称，来源于 event.involvedObject.name</p> 
     * @return InvolvedObjectName <p>关联的 K8s 对象名称，来源于 event.involvedObject.name</p>
     */
    public String getInvolvedObjectName() {
        return this.InvolvedObjectName;
    }

    /**
     * Set <p>关联的 K8s 对象名称，来源于 event.involvedObject.name</p>
     * @param InvolvedObjectName <p>关联的 K8s 对象名称，来源于 event.involvedObject.name</p>
     */
    public void setInvolvedObjectName(String InvolvedObjectName) {
        this.InvolvedObjectName = InvolvedObjectName;
    }

    /**
     * Get <p>事件来源组件，来源于 event.source.component</p> 
     * @return SourceComponent <p>事件来源组件，来源于 event.source.component</p>
     */
    public String getSourceComponent() {
        return this.SourceComponent;
    }

    /**
     * Set <p>事件来源组件，来源于 event.source.component</p>
     * @param SourceComponent <p>事件来源组件，来源于 event.source.component</p>
     */
    public void setSourceComponent(String SourceComponent) {
        this.SourceComponent = SourceComponent;
    }

    /**
     * Get <p>事件原因，来源于 event.reason</p> 
     * @return Reason <p>事件原因，来源于 event.reason</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>事件原因，来源于 event.reason</p>
     * @param Reason <p>事件原因，来源于 event.reason</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public EventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventItem(EventItem source) {
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
        if (source.InvolvedObjectName != null) {
            this.InvolvedObjectName = new String(source.InvolvedObjectName);
        }
        if (source.SourceComponent != null) {
            this.SourceComponent = new String(source.SourceComponent);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
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
        this.setParamSimple(map, prefix + "InvolvedObjectName", this.InvolvedObjectName);
        this.setParamSimple(map, prefix + "SourceComponent", this.SourceComponent);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

