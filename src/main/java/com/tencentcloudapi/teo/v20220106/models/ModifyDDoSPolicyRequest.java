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

public class ModifyDDoSPolicyRequest extends AbstractModel{

    /**
    * 策略组ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 一级域名
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DDoS具体防护配置
    */
    @SerializedName("DdosRule")
    @Expose
    private DdosRule DdosRule;

    /**
     * Get 策略组ID 
     * @return PolicyId 策略组ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略组ID
     * @param PolicyId 策略组ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 一级域名 
     * @return ZoneId 一级域名
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 一级域名
     * @param ZoneId 一级域名
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get DDoS具体防护配置 
     * @return DdosRule DDoS具体防护配置
     */
    public DdosRule getDdosRule() {
        return this.DdosRule;
    }

    /**
     * Set DDoS具体防护配置
     * @param DdosRule DDoS具体防护配置
     */
    public void setDdosRule(DdosRule DdosRule) {
        this.DdosRule = DdosRule;
    }

    public ModifyDDoSPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSPolicyRequest(ModifyDDoSPolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DdosRule != null) {
            this.DdosRule = new DdosRule(source.DdosRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "DdosRule.", this.DdosRule);

    }
}

