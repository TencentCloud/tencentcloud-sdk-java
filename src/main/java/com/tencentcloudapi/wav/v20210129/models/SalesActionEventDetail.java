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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SalesActionEventDetail extends AbstractModel{

    /**
    * 事件码
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 事件来源
    */
    @SerializedName("EventSource")
    @Expose
    private Long EventSource;

    /**
    * 销售顾问id
    */
    @SerializedName("SalesId")
    @Expose
    private Long SalesId;

    /**
    * 素材类型
    */
    @SerializedName("MaterialType")
    @Expose
    private Long MaterialType;

    /**
    * 素材编号id
    */
    @SerializedName("MaterialId")
    @Expose
    private Long MaterialId;

    /**
    * 事件上报时间，单位：秒
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
     * Get 事件码 
     * @return EventCode 事件码
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set 事件码
     * @param EventCode 事件码
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件来源 
     * @return EventSource 事件来源
     */
    public Long getEventSource() {
        return this.EventSource;
    }

    /**
     * Set 事件来源
     * @param EventSource 事件来源
     */
    public void setEventSource(Long EventSource) {
        this.EventSource = EventSource;
    }

    /**
     * Get 销售顾问id 
     * @return SalesId 销售顾问id
     */
    public Long getSalesId() {
        return this.SalesId;
    }

    /**
     * Set 销售顾问id
     * @param SalesId 销售顾问id
     */
    public void setSalesId(Long SalesId) {
        this.SalesId = SalesId;
    }

    /**
     * Get 素材类型 
     * @return MaterialType 素材类型
     */
    public Long getMaterialType() {
        return this.MaterialType;
    }

    /**
     * Set 素材类型
     * @param MaterialType 素材类型
     */
    public void setMaterialType(Long MaterialType) {
        this.MaterialType = MaterialType;
    }

    /**
     * Get 素材编号id 
     * @return MaterialId 素材编号id
     */
    public Long getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 素材编号id
     * @param MaterialId 素材编号id
     */
    public void setMaterialId(Long MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 事件上报时间，单位：秒 
     * @return EventTime 事件上报时间，单位：秒
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件上报时间，单位：秒
     * @param EventTime 事件上报时间，单位：秒
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    public SalesActionEventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SalesActionEventDetail(SalesActionEventDetail source) {
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventSource != null) {
            this.EventSource = new Long(source.EventSource);
        }
        if (source.SalesId != null) {
            this.SalesId = new Long(source.SalesId);
        }
        if (source.MaterialType != null) {
            this.MaterialType = new Long(source.MaterialType);
        }
        if (source.MaterialId != null) {
            this.MaterialId = new Long(source.MaterialId);
        }
        if (source.EventTime != null) {
            this.EventTime = new Long(source.EventTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventSource", this.EventSource);
        this.setParamSimple(map, prefix + "SalesId", this.SalesId);
        this.setParamSimple(map, prefix + "MaterialType", this.MaterialType);
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);

    }
}

