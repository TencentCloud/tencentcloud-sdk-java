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

public class DescribePolicyConditionListEventMetric extends AbstractModel {

    /**
    * <p>事件id</p>
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * <p>事件名称</p>
    */
    @SerializedName("EventShowName")
    @Expose
    private String EventShowName;

    /**
    * <p>是否需要恢复</p>
    */
    @SerializedName("NeedRecovered")
    @Expose
    private Boolean NeedRecovered;

    /**
    * <p>事件类型，预留字段，当前固定取值为2</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>事件id</p> 
     * @return EventId <p>事件id</p>
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件id</p>
     * @param EventId <p>事件id</p>
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>事件名称</p> 
     * @return EventShowName <p>事件名称</p>
     */
    public String getEventShowName() {
        return this.EventShowName;
    }

    /**
     * Set <p>事件名称</p>
     * @param EventShowName <p>事件名称</p>
     */
    public void setEventShowName(String EventShowName) {
        this.EventShowName = EventShowName;
    }

    /**
     * Get <p>是否需要恢复</p> 
     * @return NeedRecovered <p>是否需要恢复</p>
     */
    public Boolean getNeedRecovered() {
        return this.NeedRecovered;
    }

    /**
     * Set <p>是否需要恢复</p>
     * @param NeedRecovered <p>是否需要恢复</p>
     */
    public void setNeedRecovered(Boolean NeedRecovered) {
        this.NeedRecovered = NeedRecovered;
    }

    /**
     * Get <p>事件类型，预留字段，当前固定取值为2</p> 
     * @return Type <p>事件类型，预留字段，当前固定取值为2</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>事件类型，预留字段，当前固定取值为2</p>
     * @param Type <p>事件类型，预留字段，当前固定取值为2</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribePolicyConditionListEventMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListEventMetric(DescribePolicyConditionListEventMetric source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.EventShowName != null) {
            this.EventShowName = new String(source.EventShowName);
        }
        if (source.NeedRecovered != null) {
            this.NeedRecovered = new Boolean(source.NeedRecovered);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventShowName", this.EventShowName);
        this.setParamSimple(map, prefix + "NeedRecovered", this.NeedRecovered);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

