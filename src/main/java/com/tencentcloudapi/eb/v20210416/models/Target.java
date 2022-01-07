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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Target extends AbstractModel{

    /**
    * 目标类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 目标ID
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 目标描述
    */
    @SerializedName("TargetDescription")
    @Expose
    private TargetDescription TargetDescription;

    /**
    * 事件规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 开启批量投递使能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableBatchDelivery")
    @Expose
    private Boolean EnableBatchDelivery;

    /**
    * 批量投递最长等待时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchTimeout")
    @Expose
    private Long BatchTimeout;

    /**
    * 批量投递最大事件条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchEventCount")
    @Expose
    private Long BatchEventCount;

    /**
     * Get 目标类型 
     * @return Type 目标类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 目标类型
     * @param Type 目标类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get 目标ID 
     * @return TargetId 目标ID
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 目标ID
     * @param TargetId 目标ID
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 目标描述 
     * @return TargetDescription 目标描述
     */
    public TargetDescription getTargetDescription() {
        return this.TargetDescription;
    }

    /**
     * Set 目标描述
     * @param TargetDescription 目标描述
     */
    public void setTargetDescription(TargetDescription TargetDescription) {
        this.TargetDescription = TargetDescription;
    }

    /**
     * Get 事件规则ID 
     * @return RuleId 事件规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 事件规则ID
     * @param RuleId 事件规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 开启批量投递使能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableBatchDelivery 开启批量投递使能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableBatchDelivery() {
        return this.EnableBatchDelivery;
    }

    /**
     * Set 开启批量投递使能
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableBatchDelivery 开启批量投递使能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableBatchDelivery(Boolean EnableBatchDelivery) {
        this.EnableBatchDelivery = EnableBatchDelivery;
    }

    /**
     * Get 批量投递最长等待时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchTimeout 批量投递最长等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchTimeout() {
        return this.BatchTimeout;
    }

    /**
     * Set 批量投递最长等待时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchTimeout 批量投递最长等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchTimeout(Long BatchTimeout) {
        this.BatchTimeout = BatchTimeout;
    }

    /**
     * Get 批量投递最大事件条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchEventCount 批量投递最大事件条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchEventCount() {
        return this.BatchEventCount;
    }

    /**
     * Set 批量投递最大事件条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchEventCount 批量投递最大事件条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchEventCount(Long BatchEventCount) {
        this.BatchEventCount = BatchEventCount;
    }

    public Target() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Target(Target source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetDescription != null) {
            this.TargetDescription = new TargetDescription(source.TargetDescription);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.EnableBatchDelivery != null) {
            this.EnableBatchDelivery = new Boolean(source.EnableBatchDelivery);
        }
        if (source.BatchTimeout != null) {
            this.BatchTimeout = new Long(source.BatchTimeout);
        }
        if (source.BatchEventCount != null) {
            this.BatchEventCount = new Long(source.BatchEventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamObj(map, prefix + "TargetDescription.", this.TargetDescription);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "EnableBatchDelivery", this.EnableBatchDelivery);
        this.setParamSimple(map, prefix + "BatchTimeout", this.BatchTimeout);
        this.setParamSimple(map, prefix + "BatchEventCount", this.BatchEventCount);

    }
}

