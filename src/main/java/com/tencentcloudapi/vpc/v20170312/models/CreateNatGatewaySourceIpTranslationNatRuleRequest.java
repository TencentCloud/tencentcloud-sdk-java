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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNatGatewaySourceIpTranslationNatRuleRequest extends AbstractModel{

    /**
    * NAT网关的ID，形如："nat-df45454"
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT网关的SNAT转换规则
    */
    @SerializedName("SourceIpTranslationNatRules")
    @Expose
    private SourceIpTranslationNatRule [] SourceIpTranslationNatRules;

    /**
     * Get NAT网关的ID，形如："nat-df45454" 
     * @return NatGatewayId NAT网关的ID，形如："nat-df45454"
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关的ID，形如："nat-df45454"
     * @param NatGatewayId NAT网关的ID，形如："nat-df45454"
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get NAT网关的SNAT转换规则 
     * @return SourceIpTranslationNatRules NAT网关的SNAT转换规则
     */
    public SourceIpTranslationNatRule [] getSourceIpTranslationNatRules() {
        return this.SourceIpTranslationNatRules;
    }

    /**
     * Set NAT网关的SNAT转换规则
     * @param SourceIpTranslationNatRules NAT网关的SNAT转换规则
     */
    public void setSourceIpTranslationNatRules(SourceIpTranslationNatRule [] SourceIpTranslationNatRules) {
        this.SourceIpTranslationNatRules = SourceIpTranslationNatRules;
    }

    public CreateNatGatewaySourceIpTranslationNatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatGatewaySourceIpTranslationNatRuleRequest(CreateNatGatewaySourceIpTranslationNatRuleRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.SourceIpTranslationNatRules != null) {
            this.SourceIpTranslationNatRules = new SourceIpTranslationNatRule[source.SourceIpTranslationNatRules.length];
            for (int i = 0; i < source.SourceIpTranslationNatRules.length; i++) {
                this.SourceIpTranslationNatRules[i] = new SourceIpTranslationNatRule(source.SourceIpTranslationNatRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamArrayObj(map, prefix + "SourceIpTranslationNatRules.", this.SourceIpTranslationNatRules);

    }
}

