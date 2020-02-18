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

public class DescribePolicyConditionListEventMetric extends AbstractModel{

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 事件名称
    */
    @SerializedName("EventShowName")
    @Expose
    private String EventShowName;

    /**
    * 是否需要恢复
    */
    @SerializedName("NeedRecovered")
    @Expose
    private Boolean NeedRecovered;

    /**
    * 事件类型，预留字段，当前固定取值为2
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件名称 
     * @return EventShowName 事件名称
     */
    public String getEventShowName() {
        return this.EventShowName;
    }

    /**
     * Set 事件名称
     * @param EventShowName 事件名称
     */
    public void setEventShowName(String EventShowName) {
        this.EventShowName = EventShowName;
    }

    /**
     * Get 是否需要恢复 
     * @return NeedRecovered 是否需要恢复
     */
    public Boolean getNeedRecovered() {
        return this.NeedRecovered;
    }

    /**
     * Set 是否需要恢复
     * @param NeedRecovered 是否需要恢复
     */
    public void setNeedRecovered(Boolean NeedRecovered) {
        this.NeedRecovered = NeedRecovered;
    }

    /**
     * Get 事件类型，预留字段，当前固定取值为2 
     * @return Type 事件类型，预留字段，当前固定取值为2
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 事件类型，预留字段，当前固定取值为2
     * @param Type 事件类型，预留字段，当前固定取值为2
     */
    public void setType(Long Type) {
        this.Type = Type;
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

