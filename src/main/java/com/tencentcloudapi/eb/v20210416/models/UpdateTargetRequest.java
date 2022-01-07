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

public class UpdateTargetRequest extends AbstractModel{

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 事件规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 事件目标ID
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 开启批量投递使能
    */
    @SerializedName("EnableBatchDelivery")
    @Expose
    private Boolean EnableBatchDelivery;

    /**
    * 批量投递最长等待时间
    */
    @SerializedName("BatchTimeout")
    @Expose
    private Long BatchTimeout;

    /**
    * 批量投递最大事件条数
    */
    @SerializedName("BatchEventCount")
    @Expose
    private Long BatchEventCount;

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
     * Get 事件目标ID 
     * @return TargetId 事件目标ID
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 事件目标ID
     * @param TargetId 事件目标ID
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 开启批量投递使能 
     * @return EnableBatchDelivery 开启批量投递使能
     */
    public Boolean getEnableBatchDelivery() {
        return this.EnableBatchDelivery;
    }

    /**
     * Set 开启批量投递使能
     * @param EnableBatchDelivery 开启批量投递使能
     */
    public void setEnableBatchDelivery(Boolean EnableBatchDelivery) {
        this.EnableBatchDelivery = EnableBatchDelivery;
    }

    /**
     * Get 批量投递最长等待时间 
     * @return BatchTimeout 批量投递最长等待时间
     */
    public Long getBatchTimeout() {
        return this.BatchTimeout;
    }

    /**
     * Set 批量投递最长等待时间
     * @param BatchTimeout 批量投递最长等待时间
     */
    public void setBatchTimeout(Long BatchTimeout) {
        this.BatchTimeout = BatchTimeout;
    }

    /**
     * Get 批量投递最大事件条数 
     * @return BatchEventCount 批量投递最大事件条数
     */
    public Long getBatchEventCount() {
        return this.BatchEventCount;
    }

    /**
     * Set 批量投递最大事件条数
     * @param BatchEventCount 批量投递最大事件条数
     */
    public void setBatchEventCount(Long BatchEventCount) {
        this.BatchEventCount = BatchEventCount;
    }

    public UpdateTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTargetRequest(UpdateTargetRequest source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
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
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "EnableBatchDelivery", this.EnableBatchDelivery);
        this.setParamSimple(map, prefix + "BatchTimeout", this.BatchTimeout);
        this.setParamSimple(map, prefix + "BatchEventCount", this.BatchEventCount);

    }
}

