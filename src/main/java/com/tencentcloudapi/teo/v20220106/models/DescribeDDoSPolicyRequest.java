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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSPolicyRequest extends AbstractModel{

    /**
    * 策略组id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 一级域名zone
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
     * Get 策略组id 
     * @return PolicyId 策略组id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略组id
     * @param PolicyId 策略组id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 一级域名zone 
     * @return ZoneId 一级域名zone
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 一级域名zone
     * @param ZoneId 一级域名zone
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    public DescribeDDoSPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSPolicyRequest(DescribeDDoSPolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

