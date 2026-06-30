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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Target extends AbstractModel {

    /**
    * <p>目标类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>事件集ID</p>
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * <p>目标ID</p>
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * <p>目标描述</p>
    */
    @SerializedName("TargetDescription")
    @Expose
    private TargetDescription TargetDescription;

    /**
    * <p>事件规则ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>开启批量投递使能</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableBatchDelivery")
    @Expose
    private Boolean EnableBatchDelivery;

    /**
    * <p>批量投递最长等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchTimeout")
    @Expose
    private Long BatchTimeout;

    /**
    * <p>批量投递最大事件条数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchEventCount")
    @Expose
    private Long BatchEventCount;

    /**
     * Get <p>目标类型</p> 
     * @return Type <p>目标类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>目标类型</p>
     * @param Type <p>目标类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>事件集ID</p> 
     * @return EventBusId <p>事件集ID</p>
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set <p>事件集ID</p>
     * @param EventBusId <p>事件集ID</p>
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get <p>目标ID</p> 
     * @return TargetId <p>目标ID</p>
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set <p>目标ID</p>
     * @param TargetId <p>目标ID</p>
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get <p>目标描述</p> 
     * @return TargetDescription <p>目标描述</p>
     */
    public TargetDescription getTargetDescription() {
        return this.TargetDescription;
    }

    /**
     * Set <p>目标描述</p>
     * @param TargetDescription <p>目标描述</p>
     */
    public void setTargetDescription(TargetDescription TargetDescription) {
        this.TargetDescription = TargetDescription;
    }

    /**
     * Get <p>事件规则ID</p> 
     * @return RuleId <p>事件规则ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>事件规则ID</p>
     * @param RuleId <p>事件规则ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>开启批量投递使能</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableBatchDelivery <p>开启批量投递使能</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableBatchDelivery() {
        return this.EnableBatchDelivery;
    }

    /**
     * Set <p>开启批量投递使能</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableBatchDelivery <p>开启批量投递使能</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableBatchDelivery(Boolean EnableBatchDelivery) {
        this.EnableBatchDelivery = EnableBatchDelivery;
    }

    /**
     * Get <p>批量投递最长等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchTimeout <p>批量投递最长等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchTimeout() {
        return this.BatchTimeout;
    }

    /**
     * Set <p>批量投递最长等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchTimeout <p>批量投递最长等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchTimeout(Long BatchTimeout) {
        this.BatchTimeout = BatchTimeout;
    }

    /**
     * Get <p>批量投递最大事件条数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchEventCount <p>批量投递最大事件条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchEventCount() {
        return this.BatchEventCount;
    }

    /**
     * Set <p>批量投递最大事件条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchEventCount <p>批量投递最大事件条数</p>
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

