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

public class ModifyPrivateNatGatewayTranslationAclRuleRequest extends AbstractModel {

    /**
    * 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 转换规则目标，可选值"LOCAL"。
    */
    @SerializedName("TranslationDirection")
    @Expose
    private String TranslationDirection;

    /**
    * 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
    */
    @SerializedName("TranslationType")
    @Expose
    private String TranslationType;

    /**
    * 转换`IP`,当转换规则类型为四层时为`IP`池
    */
    @SerializedName("TranslationIp")
    @Expose
    private String TranslationIp;

    /**
    * 访问控制列表，需要附带AclRuleId参数。
    */
    @SerializedName("TranslationAclRules")
    @Expose
    private TranslationAclRule [] TranslationAclRules;

    /**
    * 源`IP`,当转换规则类型为三层时有效
    */
    @SerializedName("OriginalIp")
    @Expose
    private String OriginalIp;

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
     * Get 转换规则目标，可选值"LOCAL"。 
     * @return TranslationDirection 转换规则目标，可选值"LOCAL"。
     */
    public String getTranslationDirection() {
        return this.TranslationDirection;
    }

    /**
     * Set 转换规则目标，可选值"LOCAL"。
     * @param TranslationDirection 转换规则目标，可选值"LOCAL"。
     */
    public void setTranslationDirection(String TranslationDirection) {
        this.TranslationDirection = TranslationDirection;
    }

    /**
     * Get 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。 
     * @return TranslationType 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     */
    public String getTranslationType() {
        return this.TranslationType;
    }

    /**
     * Set 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     * @param TranslationType 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     */
    public void setTranslationType(String TranslationType) {
        this.TranslationType = TranslationType;
    }

    /**
     * Get 转换`IP`,当转换规则类型为四层时为`IP`池 
     * @return TranslationIp 转换`IP`,当转换规则类型为四层时为`IP`池
     */
    public String getTranslationIp() {
        return this.TranslationIp;
    }

    /**
     * Set 转换`IP`,当转换规则类型为四层时为`IP`池
     * @param TranslationIp 转换`IP`,当转换规则类型为四层时为`IP`池
     */
    public void setTranslationIp(String TranslationIp) {
        this.TranslationIp = TranslationIp;
    }

    /**
     * Get 访问控制列表，需要附带AclRuleId参数。 
     * @return TranslationAclRules 访问控制列表，需要附带AclRuleId参数。
     */
    public TranslationAclRule [] getTranslationAclRules() {
        return this.TranslationAclRules;
    }

    /**
     * Set 访问控制列表，需要附带AclRuleId参数。
     * @param TranslationAclRules 访问控制列表，需要附带AclRuleId参数。
     */
    public void setTranslationAclRules(TranslationAclRule [] TranslationAclRules) {
        this.TranslationAclRules = TranslationAclRules;
    }

    /**
     * Get 源`IP`,当转换规则类型为三层时有效 
     * @return OriginalIp 源`IP`,当转换规则类型为三层时有效
     */
    public String getOriginalIp() {
        return this.OriginalIp;
    }

    /**
     * Set 源`IP`,当转换规则类型为三层时有效
     * @param OriginalIp 源`IP`,当转换规则类型为三层时有效
     */
    public void setOriginalIp(String OriginalIp) {
        this.OriginalIp = OriginalIp;
    }

    public ModifyPrivateNatGatewayTranslationAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrivateNatGatewayTranslationAclRuleRequest(ModifyPrivateNatGatewayTranslationAclRuleRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.TranslationDirection != null) {
            this.TranslationDirection = new String(source.TranslationDirection);
        }
        if (source.TranslationType != null) {
            this.TranslationType = new String(source.TranslationType);
        }
        if (source.TranslationIp != null) {
            this.TranslationIp = new String(source.TranslationIp);
        }
        if (source.TranslationAclRules != null) {
            this.TranslationAclRules = new TranslationAclRule[source.TranslationAclRules.length];
            for (int i = 0; i < source.TranslationAclRules.length; i++) {
                this.TranslationAclRules[i] = new TranslationAclRule(source.TranslationAclRules[i]);
            }
        }
        if (source.OriginalIp != null) {
            this.OriginalIp = new String(source.OriginalIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "TranslationDirection", this.TranslationDirection);
        this.setParamSimple(map, prefix + "TranslationType", this.TranslationType);
        this.setParamSimple(map, prefix + "TranslationIp", this.TranslationIp);
        this.setParamArrayObj(map, prefix + "TranslationAclRules.", this.TranslationAclRules);
        this.setParamSimple(map, prefix + "OriginalIp", this.OriginalIp);

    }
}

