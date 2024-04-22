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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelatedEvent extends AbstractModel {

    /**
    * 事件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventID")
    @Expose
    private String EventID;

    /**
    * 事件描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 与事件关联的告警数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedCount")
    @Expose
    private Long RelatedCount;

    /**
     * Get 事件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventID 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventID() {
        return this.EventID;
    }

    /**
     * Set 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventID 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    /**
     * Get 事件描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 与事件关联的告警数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedCount 与事件关联的告警数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRelatedCount() {
        return this.RelatedCount;
    }

    /**
     * Set 与事件关联的告警数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedCount 与事件关联的告警数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedCount(Long RelatedCount) {
        this.RelatedCount = RelatedCount;
    }

    public RelatedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelatedEvent(RelatedEvent source) {
        if (source.EventID != null) {
            this.EventID = new String(source.EventID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RelatedCount != null) {
            this.RelatedCount = new Long(source.RelatedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RelatedCount", this.RelatedCount);

    }
}

