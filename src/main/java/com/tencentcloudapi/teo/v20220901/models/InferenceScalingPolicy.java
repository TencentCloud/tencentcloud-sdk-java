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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceScalingPolicy extends AbstractModel {

    /**
    * 策略名称。长度限制为 1~30 个字符。同一服务内策略名称需唯一。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略类型，创建后不可修改。取值：<li>ScheduledScaling：定时伸缩。</li>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 定时伸缩配置。当 PolicyType 取值为 ScheduledScaling 时，该字段必填。
    */
    @SerializedName("ScheduledScalingPolicy")
    @Expose
    private InferenceScheduledScalingPolicy ScheduledScalingPolicy;

    /**
     * Get 策略名称。长度限制为 1~30 个字符。同一服务内策略名称需唯一。 
     * @return PolicyName 策略名称。长度限制为 1~30 个字符。同一服务内策略名称需唯一。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称。长度限制为 1~30 个字符。同一服务内策略名称需唯一。
     * @param PolicyName 策略名称。长度限制为 1~30 个字符。同一服务内策略名称需唯一。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略类型，创建后不可修改。取值：<li>ScheduledScaling：定时伸缩。</li> 
     * @return PolicyType 策略类型，创建后不可修改。取值：<li>ScheduledScaling：定时伸缩。</li>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型，创建后不可修改。取值：<li>ScheduledScaling：定时伸缩。</li>
     * @param PolicyType 策略类型，创建后不可修改。取值：<li>ScheduledScaling：定时伸缩。</li>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 定时伸缩配置。当 PolicyType 取值为 ScheduledScaling 时，该字段必填。 
     * @return ScheduledScalingPolicy 定时伸缩配置。当 PolicyType 取值为 ScheduledScaling 时，该字段必填。
     */
    public InferenceScheduledScalingPolicy getScheduledScalingPolicy() {
        return this.ScheduledScalingPolicy;
    }

    /**
     * Set 定时伸缩配置。当 PolicyType 取值为 ScheduledScaling 时，该字段必填。
     * @param ScheduledScalingPolicy 定时伸缩配置。当 PolicyType 取值为 ScheduledScaling 时，该字段必填。
     */
    public void setScheduledScalingPolicy(InferenceScheduledScalingPolicy ScheduledScalingPolicy) {
        this.ScheduledScalingPolicy = ScheduledScalingPolicy;
    }

    public InferenceScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceScalingPolicy(InferenceScalingPolicy source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.ScheduledScalingPolicy != null) {
            this.ScheduledScalingPolicy = new InferenceScheduledScalingPolicy(source.ScheduledScalingPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamObj(map, prefix + "ScheduledScalingPolicy.", this.ScheduledScalingPolicy);

    }
}

