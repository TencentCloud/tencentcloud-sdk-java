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

public class PlatformEventSummary extends AbstractModel {

    /**
    * 平台事件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 平台事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventPattern")
    @Expose
    private String EventPattern;

    /**
     * Get 平台事件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName 平台事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 平台事件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName 平台事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 平台事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventPattern 平台事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventPattern() {
        return this.EventPattern;
    }

    /**
     * Set 平台事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventPattern 平台事件匹配规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventPattern(String EventPattern) {
        this.EventPattern = EventPattern;
    }

    public PlatformEventSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatformEventSummary(PlatformEventSummary source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventPattern != null) {
            this.EventPattern = new String(source.EventPattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventPattern", this.EventPattern);

    }
}

