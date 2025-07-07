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

public class ModifyPrivateNatGatewayTranslationNatRuleRequest extends AbstractModel {

    /**
    * 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 转换规则对象数组。仅支持修改单个转换规则
    */
    @SerializedName("TranslationNatRules")
    @Expose
    private TranslationNatRuleDiff [] TranslationNatRules;

    /**
    * 跨域参数，当VPC为跨域时填写为True。
    */
    @SerializedName("CrossDomain")
    @Expose
    private Boolean CrossDomain;

    /**
     * Get 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。 
     * @return NatGatewayId 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     * @param NatGatewayId 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 转换规则对象数组。仅支持修改单个转换规则 
     * @return TranslationNatRules 转换规则对象数组。仅支持修改单个转换规则
     */
    public TranslationNatRuleDiff [] getTranslationNatRules() {
        return this.TranslationNatRules;
    }

    /**
     * Set 转换规则对象数组。仅支持修改单个转换规则
     * @param TranslationNatRules 转换规则对象数组。仅支持修改单个转换规则
     */
    public void setTranslationNatRules(TranslationNatRuleDiff [] TranslationNatRules) {
        this.TranslationNatRules = TranslationNatRules;
    }

    /**
     * Get 跨域参数，当VPC为跨域时填写为True。 
     * @return CrossDomain 跨域参数，当VPC为跨域时填写为True。
     */
    public Boolean getCrossDomain() {
        return this.CrossDomain;
    }

    /**
     * Set 跨域参数，当VPC为跨域时填写为True。
     * @param CrossDomain 跨域参数，当VPC为跨域时填写为True。
     */
    public void setCrossDomain(Boolean CrossDomain) {
        this.CrossDomain = CrossDomain;
    }

    public ModifyPrivateNatGatewayTranslationNatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrivateNatGatewayTranslationNatRuleRequest(ModifyPrivateNatGatewayTranslationNatRuleRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.TranslationNatRules != null) {
            this.TranslationNatRules = new TranslationNatRuleDiff[source.TranslationNatRules.length];
            for (int i = 0; i < source.TranslationNatRules.length; i++) {
                this.TranslationNatRules[i] = new TranslationNatRuleDiff(source.TranslationNatRules[i]);
            }
        }
        if (source.CrossDomain != null) {
            this.CrossDomain = new Boolean(source.CrossDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamArrayObj(map, prefix + "TranslationNatRules.", this.TranslationNatRules);
        this.setParamSimple(map, prefix + "CrossDomain", this.CrossDomain);

    }
}

