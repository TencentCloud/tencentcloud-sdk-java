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

public class DeletePrivateNatGatewayTranslationAclRuleRequest extends AbstractModel {

    /**
    * 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 转换规则目标，可选值LOCAL。
    */
    @SerializedName("TranslationDirection")
    @Expose
    private String TranslationDirection;

    /**
    * 转换规则类型，可选值NETWORK_LAYER、TRANSPORT_LAYER。分别对应三层、四层。
    */
    @SerializedName("TranslationType")
    @Expose
    private String TranslationType;

    /**
    * 映射后`IP`,当转换规则类型为四层时为`IP`池
    */
    @SerializedName("TranslationIp")
    @Expose
    private String TranslationIp;

    /**
    * 访问控制规则对应`ID`
    */
    @SerializedName("AclRuleIds")
    @Expose
    private Long [] AclRuleIds;

    /**
    * 映射前`IP`,当转换规则类型为三层时有效
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
     * Get 转换规则目标，可选值LOCAL。 
     * @return TranslationDirection 转换规则目标，可选值LOCAL。
     */
    public String getTranslationDirection() {
        return this.TranslationDirection;
    }

    /**
     * Set 转换规则目标，可选值LOCAL。
     * @param TranslationDirection 转换规则目标，可选值LOCAL。
     */
    public void setTranslationDirection(String TranslationDirection) {
        this.TranslationDirection = TranslationDirection;
    }

    /**
     * Get 转换规则类型，可选值NETWORK_LAYER、TRANSPORT_LAYER。分别对应三层、四层。 
     * @return TranslationType 转换规则类型，可选值NETWORK_LAYER、TRANSPORT_LAYER。分别对应三层、四层。
     */
    public String getTranslationType() {
        return this.TranslationType;
    }

    /**
     * Set 转换规则类型，可选值NETWORK_LAYER、TRANSPORT_LAYER。分别对应三层、四层。
     * @param TranslationType 转换规则类型，可选值NETWORK_LAYER、TRANSPORT_LAYER。分别对应三层、四层。
     */
    public void setTranslationType(String TranslationType) {
        this.TranslationType = TranslationType;
    }

    /**
     * Get 映射后`IP`,当转换规则类型为四层时为`IP`池 
     * @return TranslationIp 映射后`IP`,当转换规则类型为四层时为`IP`池
     */
    public String getTranslationIp() {
        return this.TranslationIp;
    }

    /**
     * Set 映射后`IP`,当转换规则类型为四层时为`IP`池
     * @param TranslationIp 映射后`IP`,当转换规则类型为四层时为`IP`池
     */
    public void setTranslationIp(String TranslationIp) {
        this.TranslationIp = TranslationIp;
    }

    /**
     * Get 访问控制规则对应`ID` 
     * @return AclRuleIds 访问控制规则对应`ID`
     */
    public Long [] getAclRuleIds() {
        return this.AclRuleIds;
    }

    /**
     * Set 访问控制规则对应`ID`
     * @param AclRuleIds 访问控制规则对应`ID`
     */
    public void setAclRuleIds(Long [] AclRuleIds) {
        this.AclRuleIds = AclRuleIds;
    }

    /**
     * Get 映射前`IP`,当转换规则类型为三层时有效 
     * @return OriginalIp 映射前`IP`,当转换规则类型为三层时有效
     */
    public String getOriginalIp() {
        return this.OriginalIp;
    }

    /**
     * Set 映射前`IP`,当转换规则类型为三层时有效
     * @param OriginalIp 映射前`IP`,当转换规则类型为三层时有效
     */
    public void setOriginalIp(String OriginalIp) {
        this.OriginalIp = OriginalIp;
    }

    public DeletePrivateNatGatewayTranslationAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrivateNatGatewayTranslationAclRuleRequest(DeletePrivateNatGatewayTranslationAclRuleRequest source) {
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
        if (source.AclRuleIds != null) {
            this.AclRuleIds = new Long[source.AclRuleIds.length];
            for (int i = 0; i < source.AclRuleIds.length; i++) {
                this.AclRuleIds[i] = new Long(source.AclRuleIds[i]);
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
        this.setParamArraySimple(map, prefix + "AclRuleIds.", this.AclRuleIds);
        this.setParamSimple(map, prefix + "OriginalIp", this.OriginalIp);

    }
}

