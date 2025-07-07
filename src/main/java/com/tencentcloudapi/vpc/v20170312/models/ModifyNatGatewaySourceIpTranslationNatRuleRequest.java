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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatGatewaySourceIpTranslationNatRuleRequest extends AbstractModel {

    /**
    * NAT网关的ID，形如：`nat-df453454`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT网关的SNAT转换规则。
    */
    @SerializedName("SourceIpTranslationNatRule")
    @Expose
    private SourceIpTranslationNatRule SourceIpTranslationNatRule;

    /**
     * Get NAT网关的ID，形如：`nat-df453454`。 
     * @return NatGatewayId NAT网关的ID，形如：`nat-df453454`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关的ID，形如：`nat-df453454`。
     * @param NatGatewayId NAT网关的ID，形如：`nat-df453454`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get NAT网关的SNAT转换规则。 
     * @return SourceIpTranslationNatRule NAT网关的SNAT转换规则。
     */
    public SourceIpTranslationNatRule getSourceIpTranslationNatRule() {
        return this.SourceIpTranslationNatRule;
    }

    /**
     * Set NAT网关的SNAT转换规则。
     * @param SourceIpTranslationNatRule NAT网关的SNAT转换规则。
     */
    public void setSourceIpTranslationNatRule(SourceIpTranslationNatRule SourceIpTranslationNatRule) {
        this.SourceIpTranslationNatRule = SourceIpTranslationNatRule;
    }

    public ModifyNatGatewaySourceIpTranslationNatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatGatewaySourceIpTranslationNatRuleRequest(ModifyNatGatewaySourceIpTranslationNatRuleRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.SourceIpTranslationNatRule != null) {
            this.SourceIpTranslationNatRule = new SourceIpTranslationNatRule(source.SourceIpTranslationNatRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamObj(map, prefix + "SourceIpTranslationNatRule.", this.SourceIpTranslationNatRule);

    }
}

