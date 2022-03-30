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

public class AssociateNatGatewayAddressRequest extends AbstractModel{

    /**
    * NAT网关的ID，形如：`nat-df45454`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 弹性IP可用区，自动分配弹性IP时传递。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 绑定NAT网关的弹性IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
    */
    @SerializedName("StockPublicIpAddressesBandwidthOut")
    @Expose
    private Long StockPublicIpAddressesBandwidthOut;

    /**
    * 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
    */
    @SerializedName("PublicIpAddressesBandwidthOut")
    @Expose
    private Long PublicIpAddressesBandwidthOut;

    /**
    * 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。
    */
    @SerializedName("PublicIpFromSameZone")
    @Expose
    private Boolean PublicIpFromSameZone;

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
     * Get 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。 
     * @return AddressCount 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
     * @param AddressCount 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。 
     * @return PublicIpAddresses 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
     * @param PublicIpAddresses 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 弹性IP可用区，自动分配弹性IP时传递。 
     * @return Zone 弹性IP可用区，自动分配弹性IP时传递。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 弹性IP可用区，自动分配弹性IP时传递。
     * @param Zone 弹性IP可用区，自动分配弹性IP时传递。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 绑定NAT网关的弹性IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。 
     * @return StockPublicIpAddressesBandwidthOut 绑定NAT网关的弹性IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     */
    public Long getStockPublicIpAddressesBandwidthOut() {
        return this.StockPublicIpAddressesBandwidthOut;
    }

    /**
     * Set 绑定NAT网关的弹性IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     * @param StockPublicIpAddressesBandwidthOut 绑定NAT网关的弹性IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     */
    public void setStockPublicIpAddressesBandwidthOut(Long StockPublicIpAddressesBandwidthOut) {
        this.StockPublicIpAddressesBandwidthOut = StockPublicIpAddressesBandwidthOut;
    }

    /**
     * Get 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。 
     * @return PublicIpAddressesBandwidthOut 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     */
    public Long getPublicIpAddressesBandwidthOut() {
        return this.PublicIpAddressesBandwidthOut;
    }

    /**
     * Set 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     * @param PublicIpAddressesBandwidthOut 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     */
    public void setPublicIpAddressesBandwidthOut(Long PublicIpAddressesBandwidthOut) {
        this.PublicIpAddressesBandwidthOut = PublicIpAddressesBandwidthOut;
    }

    /**
     * Get 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。 
     * @return PublicIpFromSameZone 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。
     */
    public Boolean getPublicIpFromSameZone() {
        return this.PublicIpFromSameZone;
    }

    /**
     * Set 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。
     * @param PublicIpFromSameZone 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。
     */
    public void setPublicIpFromSameZone(Boolean PublicIpFromSameZone) {
        this.PublicIpFromSameZone = PublicIpFromSameZone;
    }

    public AssociateNatGatewayAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateNatGatewayAddressRequest(AssociateNatGatewayAddressRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.StockPublicIpAddressesBandwidthOut != null) {
            this.StockPublicIpAddressesBandwidthOut = new Long(source.StockPublicIpAddressesBandwidthOut);
        }
        if (source.PublicIpAddressesBandwidthOut != null) {
            this.PublicIpAddressesBandwidthOut = new Long(source.PublicIpAddressesBandwidthOut);
        }
        if (source.PublicIpFromSameZone != null) {
            this.PublicIpFromSameZone = new Boolean(source.PublicIpFromSameZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "StockPublicIpAddressesBandwidthOut", this.StockPublicIpAddressesBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAddressesBandwidthOut", this.PublicIpAddressesBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpFromSameZone", this.PublicIpFromSameZone);

    }
}

