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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventCaseConsumeLogOptDto extends AbstractModel{

    /**
    * 消费ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumeLogId")
    @Expose
    private String ConsumeLogId;

    /**
    * 事件案例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventCaseId")
    @Expose
    private String EventCaseId;

    /**
    * 消费者ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * 消费时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private String CreationTimestamp;

    /**
    * 任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerDetail")
    @Expose
    private TaskOpsDto ConsumerDetail;

    /**
     * Get 消费ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumeLogId 消费ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumeLogId() {
        return this.ConsumeLogId;
    }

    /**
     * Set 消费ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumeLogId 消费ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumeLogId(String ConsumeLogId) {
        this.ConsumeLogId = ConsumeLogId;
    }

    /**
     * Get 事件案例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventCaseId 事件案例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventCaseId() {
        return this.EventCaseId;
    }

    /**
     * Set 事件案例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventCaseId 事件案例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventCaseId(String EventCaseId) {
        this.EventCaseId = EventCaseId;
    }

    /**
     * Get 消费者ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerId 消费者ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set 消费者ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerId 消费者ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get 消费时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTimestamp 消费时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set 消费时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTimestamp 消费时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTimestamp(String CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    /**
     * Get 任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerDetail 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOpsDto getConsumerDetail() {
        return this.ConsumerDetail;
    }

    /**
     * Set 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerDetail 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerDetail(TaskOpsDto ConsumerDetail) {
        this.ConsumerDetail = ConsumerDetail;
    }

    public EventCaseConsumeLogOptDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCaseConsumeLogOptDto(EventCaseConsumeLogOptDto source) {
        if (source.ConsumeLogId != null) {
            this.ConsumeLogId = new String(source.ConsumeLogId);
        }
        if (source.EventCaseId != null) {
            this.EventCaseId = new String(source.EventCaseId);
        }
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new String(source.CreationTimestamp);
        }
        if (source.ConsumerDetail != null) {
            this.ConsumerDetail = new TaskOpsDto(source.ConsumerDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumeLogId", this.ConsumeLogId);
        this.setParamSimple(map, prefix + "EventCaseId", this.EventCaseId);
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);
        this.setParamObj(map, prefix + "ConsumerDetail.", this.ConsumerDetail);

    }
}

