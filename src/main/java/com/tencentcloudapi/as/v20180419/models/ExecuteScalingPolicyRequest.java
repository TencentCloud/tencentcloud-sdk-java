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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteScalingPolicyRequest extends AbstractModel {

    /**
    * <p>告警伸缩策略ID，不支持目标追踪策略。可通过 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> 接口返回的 <code>ScalingPolicyType</code> 参数获取告警策略类型。</p>
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
    * <p>是否检查伸缩组活动处于冷却时间内，默认值为false</p>
    */
    @SerializedName("HonorCooldown")
    @Expose
    private Boolean HonorCooldown;

    /**
    * <p>执行伸缩策略的触发来源，取值包括 API 和 CLOUD_MONITOR，默认值为 API。CLOUD_MONITOR 专门供云监控触发调用。</p>
    */
    @SerializedName("TriggerSource")
    @Expose
    private String TriggerSource;

    /**
     * Get <p>告警伸缩策略ID，不支持目标追踪策略。可通过 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> 接口返回的 <code>ScalingPolicyType</code> 参数获取告警策略类型。</p> 
     * @return AutoScalingPolicyId <p>告警伸缩策略ID，不支持目标追踪策略。可通过 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> 接口返回的 <code>ScalingPolicyType</code> 参数获取告警策略类型。</p>
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Set <p>告警伸缩策略ID，不支持目标追踪策略。可通过 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> 接口返回的 <code>ScalingPolicyType</code> 参数获取告警策略类型。</p>
     * @param AutoScalingPolicyId <p>告警伸缩策略ID，不支持目标追踪策略。可通过 <a href="https://cloud.tencent.com/document/api/377/33178">DescribeScalingPolicies</a> 接口返回的 <code>ScalingPolicyType</code> 参数获取告警策略类型。</p>
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    /**
     * Get <p>是否检查伸缩组活动处于冷却时间内，默认值为false</p> 
     * @return HonorCooldown <p>是否检查伸缩组活动处于冷却时间内，默认值为false</p>
     */
    public Boolean getHonorCooldown() {
        return this.HonorCooldown;
    }

    /**
     * Set <p>是否检查伸缩组活动处于冷却时间内，默认值为false</p>
     * @param HonorCooldown <p>是否检查伸缩组活动处于冷却时间内，默认值为false</p>
     */
    public void setHonorCooldown(Boolean HonorCooldown) {
        this.HonorCooldown = HonorCooldown;
    }

    /**
     * Get <p>执行伸缩策略的触发来源，取值包括 API 和 CLOUD_MONITOR，默认值为 API。CLOUD_MONITOR 专门供云监控触发调用。</p> 
     * @return TriggerSource <p>执行伸缩策略的触发来源，取值包括 API 和 CLOUD_MONITOR，默认值为 API。CLOUD_MONITOR 专门供云监控触发调用。</p>
     */
    public String getTriggerSource() {
        return this.TriggerSource;
    }

    /**
     * Set <p>执行伸缩策略的触发来源，取值包括 API 和 CLOUD_MONITOR，默认值为 API。CLOUD_MONITOR 专门供云监控触发调用。</p>
     * @param TriggerSource <p>执行伸缩策略的触发来源，取值包括 API 和 CLOUD_MONITOR，默认值为 API。CLOUD_MONITOR 专门供云监控触发调用。</p>
     */
    public void setTriggerSource(String TriggerSource) {
        this.TriggerSource = TriggerSource;
    }

    public ExecuteScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteScalingPolicyRequest(ExecuteScalingPolicyRequest source) {
        if (source.AutoScalingPolicyId != null) {
            this.AutoScalingPolicyId = new String(source.AutoScalingPolicyId);
        }
        if (source.HonorCooldown != null) {
            this.HonorCooldown = new Boolean(source.HonorCooldown);
        }
        if (source.TriggerSource != null) {
            this.TriggerSource = new String(source.TriggerSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);
        this.setParamSimple(map, prefix + "HonorCooldown", this.HonorCooldown);
        this.setParamSimple(map, prefix + "TriggerSource", this.TriggerSource);

    }
}

