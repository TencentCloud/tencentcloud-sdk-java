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

public class ModifyNatGatewayAttributeRequest extends AbstractModel{

    /**
    * NAT网关的ID，形如：`nat-df45454`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT网关的名称，形如：`test_nat`。
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * NAT网关最大外网出带宽(单位:Mbps)。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 是否修改NAT网关绑定的安全组。
    */
    @SerializedName("ModifySecurityGroup")
    @Expose
    private Boolean ModifySecurityGroup;

    /**
    * NAT网关绑定的安全组列表，最终状态，空列表表示删除所有安全组，形如: `['sg-1n232323', 'sg-o4242424']`
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

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
     * Get NAT网关的名称，形如：`test_nat`。 
     * @return NatGatewayName NAT网关的名称，形如：`test_nat`。
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set NAT网关的名称，形如：`test_nat`。
     * @param NatGatewayName NAT网关的名称，形如：`test_nat`。
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get NAT网关最大外网出带宽(单位:Mbps)。 
     * @return InternetMaxBandwidthOut NAT网关最大外网出带宽(单位:Mbps)。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set NAT网关最大外网出带宽(单位:Mbps)。
     * @param InternetMaxBandwidthOut NAT网关最大外网出带宽(单位:Mbps)。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 是否修改NAT网关绑定的安全组。 
     * @return ModifySecurityGroup 是否修改NAT网关绑定的安全组。
     */
    public Boolean getModifySecurityGroup() {
        return this.ModifySecurityGroup;
    }

    /**
     * Set 是否修改NAT网关绑定的安全组。
     * @param ModifySecurityGroup 是否修改NAT网关绑定的安全组。
     */
    public void setModifySecurityGroup(Boolean ModifySecurityGroup) {
        this.ModifySecurityGroup = ModifySecurityGroup;
    }

    /**
     * Get NAT网关绑定的安全组列表，最终状态，空列表表示删除所有安全组，形如: `['sg-1n232323', 'sg-o4242424']` 
     * @return SecurityGroupIds NAT网关绑定的安全组列表，最终状态，空列表表示删除所有安全组，形如: `['sg-1n232323', 'sg-o4242424']`
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set NAT网关绑定的安全组列表，最终状态，空列表表示删除所有安全组，形如: `['sg-1n232323', 'sg-o4242424']`
     * @param SecurityGroupIds NAT网关绑定的安全组列表，最终状态，空列表表示删除所有安全组，形如: `['sg-1n232323', 'sg-o4242424']`
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public ModifyNatGatewayAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatGatewayAttributeRequest(ModifyNatGatewayAttributeRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.NatGatewayName != null) {
            this.NatGatewayName = new String(source.NatGatewayName);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.ModifySecurityGroup != null) {
            this.ModifySecurityGroup = new Boolean(source.ModifySecurityGroup);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ModifySecurityGroup", this.ModifySecurityGroup);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

