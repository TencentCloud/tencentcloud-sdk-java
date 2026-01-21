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

public class ModifyNatGatewayAttributeRequest extends AbstractModel {

    /**
    * NAT网关的ID，形如：`nat-df45454`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT网关的名称，形如：`test_nat`，边界值：[1,60] 字符。
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * NAT网关最大外网出带宽(单位:Mbps)，边界值：[0,50000]。
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
    * NAT实例是否开启删除保护
    */
    @SerializedName("DeletionProtectionEnabled")
    @Expose
    private Boolean DeletionProtectionEnabled;

    /**
    * 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。当前适用于标准型NAT网关。
    */
    @SerializedName("PublicAddressAffinity")
    @Expose
    private Boolean PublicAddressAffinity;

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
     * Get NAT网关的名称，形如：`test_nat`，边界值：[1,60] 字符。 
     * @return NatGatewayName NAT网关的名称，形如：`test_nat`，边界值：[1,60] 字符。
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set NAT网关的名称，形如：`test_nat`，边界值：[1,60] 字符。
     * @param NatGatewayName NAT网关的名称，形如：`test_nat`，边界值：[1,60] 字符。
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get NAT网关最大外网出带宽(单位:Mbps)，边界值：[0,50000]。 
     * @return InternetMaxBandwidthOut NAT网关最大外网出带宽(单位:Mbps)，边界值：[0,50000]。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set NAT网关最大外网出带宽(单位:Mbps)，边界值：[0,50000]。
     * @param InternetMaxBandwidthOut NAT网关最大外网出带宽(单位:Mbps)，边界值：[0,50000]。
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

    /**
     * Get NAT实例是否开启删除保护 
     * @return DeletionProtectionEnabled NAT实例是否开启删除保护
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.DeletionProtectionEnabled;
    }

    /**
     * Set NAT实例是否开启删除保护
     * @param DeletionProtectionEnabled NAT实例是否开启删除保护
     */
    public void setDeletionProtectionEnabled(Boolean DeletionProtectionEnabled) {
        this.DeletionProtectionEnabled = DeletionProtectionEnabled;
    }

    /**
     * Get 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。当前适用于标准型NAT网关。 
     * @return PublicAddressAffinity 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。当前适用于标准型NAT网关。
     */
    public Boolean getPublicAddressAffinity() {
        return this.PublicAddressAffinity;
    }

    /**
     * Set 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。当前适用于标准型NAT网关。
     * @param PublicAddressAffinity 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。当前适用于标准型NAT网关。
     */
    public void setPublicAddressAffinity(Boolean PublicAddressAffinity) {
        this.PublicAddressAffinity = PublicAddressAffinity;
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
        if (source.DeletionProtectionEnabled != null) {
            this.DeletionProtectionEnabled = new Boolean(source.DeletionProtectionEnabled);
        }
        if (source.PublicAddressAffinity != null) {
            this.PublicAddressAffinity = new Boolean(source.PublicAddressAffinity);
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
        this.setParamSimple(map, prefix + "DeletionProtectionEnabled", this.DeletionProtectionEnabled);
        this.setParamSimple(map, prefix + "PublicAddressAffinity", this.PublicAddressAffinity);

    }
}

