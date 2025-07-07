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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HpaPolicy extends AbstractModel {

    /**
    * 策略类型
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略阈值
    */
    @SerializedName("PolicyThreshold")
    @Expose
    private Long PolicyThreshold;

    /**
     * Get 策略类型 
     * @return PolicyType 策略类型
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型
     * @param PolicyType 策略类型
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略阈值 
     * @return PolicyThreshold 策略阈值
     */
    public Long getPolicyThreshold() {
        return this.PolicyThreshold;
    }

    /**
     * Set 策略阈值
     * @param PolicyThreshold 策略阈值
     */
    public void setPolicyThreshold(Long PolicyThreshold) {
        this.PolicyThreshold = PolicyThreshold;
    }

    public HpaPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HpaPolicy(HpaPolicy source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyThreshold != null) {
            this.PolicyThreshold = new Long(source.PolicyThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyThreshold", this.PolicyThreshold);

    }
}

