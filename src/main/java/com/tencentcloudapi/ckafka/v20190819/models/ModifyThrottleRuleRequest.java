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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyThrottleRuleRequest extends AbstractModel {

    /**
    * 规则标识
    */
    @SerializedName("ThrottleRuleId")
    @Expose
    private Long ThrottleRuleId;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 消费限流值单位MB/s
    */
    @SerializedName("ConsumeThrottle")
    @Expose
    private Long ConsumeThrottle;

    /**
     * Get 规则标识 
     * @return ThrottleRuleId 规则标识
     */
    public Long getThrottleRuleId() {
        return this.ThrottleRuleId;
    }

    /**
     * Set 规则标识
     * @param ThrottleRuleId 规则标识
     */
    public void setThrottleRuleId(Long ThrottleRuleId) {
        this.ThrottleRuleId = ThrottleRuleId;
    }

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 消费限流值单位MB/s 
     * @return ConsumeThrottle 消费限流值单位MB/s
     */
    public Long getConsumeThrottle() {
        return this.ConsumeThrottle;
    }

    /**
     * Set 消费限流值单位MB/s
     * @param ConsumeThrottle 消费限流值单位MB/s
     */
    public void setConsumeThrottle(Long ConsumeThrottle) {
        this.ConsumeThrottle = ConsumeThrottle;
    }

    public ModifyThrottleRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyThrottleRuleRequest(ModifyThrottleRuleRequest source) {
        if (source.ThrottleRuleId != null) {
            this.ThrottleRuleId = new Long(source.ThrottleRuleId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConsumeThrottle != null) {
            this.ConsumeThrottle = new Long(source.ConsumeThrottle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThrottleRuleId", this.ThrottleRuleId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConsumeThrottle", this.ConsumeThrottle);

    }
}

