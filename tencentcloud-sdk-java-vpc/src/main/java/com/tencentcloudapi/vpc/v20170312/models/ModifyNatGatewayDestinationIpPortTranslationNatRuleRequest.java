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

public class ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest extends AbstractModel{

    /**
    * NAT网关的ID，形如：`nat-df45454`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 源NAT网关的端口转换规则。
    */
    @SerializedName("SourceNatRule")
    @Expose
    private DestinationIpPortTranslationNatRule SourceNatRule;

    /**
    * 目的NAT网关的端口转换规则。
    */
    @SerializedName("DestinationNatRule")
    @Expose
    private DestinationIpPortTranslationNatRule DestinationNatRule;

    /**
     * Get NAT网关的ID，形如：`nat-df45454`。 
     * @return NatGatewayId NAT网关的ID，形如：`nat-df45454`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关的ID，形如：`nat-df45454`。
     * @param NatGatewayId NAT网关的ID，形如：`nat-df45454`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 源NAT网关的端口转换规则。 
     * @return SourceNatRule 源NAT网关的端口转换规则。
     */
    public DestinationIpPortTranslationNatRule getSourceNatRule() {
        return this.SourceNatRule;
    }

    /**
     * Set 源NAT网关的端口转换规则。
     * @param SourceNatRule 源NAT网关的端口转换规则。
     */
    public void setSourceNatRule(DestinationIpPortTranslationNatRule SourceNatRule) {
        this.SourceNatRule = SourceNatRule;
    }

    /**
     * Get 目的NAT网关的端口转换规则。 
     * @return DestinationNatRule 目的NAT网关的端口转换规则。
     */
    public DestinationIpPortTranslationNatRule getDestinationNatRule() {
        return this.DestinationNatRule;
    }

    /**
     * Set 目的NAT网关的端口转换规则。
     * @param DestinationNatRule 目的NAT网关的端口转换规则。
     */
    public void setDestinationNatRule(DestinationIpPortTranslationNatRule DestinationNatRule) {
        this.DestinationNatRule = DestinationNatRule;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamObj(map, prefix + "SourceNatRule.", this.SourceNatRule);
        this.setParamObj(map, prefix + "DestinationNatRule.", this.DestinationNatRule);

    }
}

