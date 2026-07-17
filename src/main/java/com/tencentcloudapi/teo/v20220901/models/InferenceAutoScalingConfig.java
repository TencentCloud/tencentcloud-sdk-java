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

public class InferenceAutoScalingConfig extends AbstractModel {

    /**
    * <p>最小实例数量。当配置了伸缩策略并且策略处于有效期时，将不会生效。</p>
    */
    @SerializedName("MinInstanceCount")
    @Expose
    private Long MinInstanceCount;

    /**
    * <p>伸缩策略列表。最多支持 5 个策略。</p>
    */
    @SerializedName("ScalingPolicies")
    @Expose
    private InferenceScalingPolicy [] ScalingPolicies;

    /**
     * Get <p>最小实例数量。当配置了伸缩策略并且策略处于有效期时，将不会生效。</p> 
     * @return MinInstanceCount <p>最小实例数量。当配置了伸缩策略并且策略处于有效期时，将不会生效。</p>
     */
    public Long getMinInstanceCount() {
        return this.MinInstanceCount;
    }

    /**
     * Set <p>最小实例数量。当配置了伸缩策略并且策略处于有效期时，将不会生效。</p>
     * @param MinInstanceCount <p>最小实例数量。当配置了伸缩策略并且策略处于有效期时，将不会生效。</p>
     */
    public void setMinInstanceCount(Long MinInstanceCount) {
        this.MinInstanceCount = MinInstanceCount;
    }

    /**
     * Get <p>伸缩策略列表。最多支持 5 个策略。</p> 
     * @return ScalingPolicies <p>伸缩策略列表。最多支持 5 个策略。</p>
     */
    public InferenceScalingPolicy [] getScalingPolicies() {
        return this.ScalingPolicies;
    }

    /**
     * Set <p>伸缩策略列表。最多支持 5 个策略。</p>
     * @param ScalingPolicies <p>伸缩策略列表。最多支持 5 个策略。</p>
     */
    public void setScalingPolicies(InferenceScalingPolicy [] ScalingPolicies) {
        this.ScalingPolicies = ScalingPolicies;
    }

    public InferenceAutoScalingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceAutoScalingConfig(InferenceAutoScalingConfig source) {
        if (source.MinInstanceCount != null) {
            this.MinInstanceCount = new Long(source.MinInstanceCount);
        }
        if (source.ScalingPolicies != null) {
            this.ScalingPolicies = new InferenceScalingPolicy[source.ScalingPolicies.length];
            for (int i = 0; i < source.ScalingPolicies.length; i++) {
                this.ScalingPolicies[i] = new InferenceScalingPolicy(source.ScalingPolicies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinInstanceCount", this.MinInstanceCount);
        this.setParamArrayObj(map, prefix + "ScalingPolicies.", this.ScalingPolicies);

    }
}

