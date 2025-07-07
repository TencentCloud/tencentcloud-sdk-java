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

public class ModifyVpnGatewayAttributeRequest extends AbstractModel {

    /**
    * VPN网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * VPN网关名称，最大长度不能超过60个字节。
    */
    @SerializedName("VpnGatewayName")
    @Expose
    private String VpnGatewayName;

    /**
    * VPN网关计费模式，目前只支持预付费（即包年包月）到后付费（即按量计费）的转换。即参数只支持：POSTPAID_BY_HOUR。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * BGP ASN。ASN取值范围为1- 4294967295，默认值64551，其中139341、45090和58835不可用。
    */
    @SerializedName("BgpAsn")
    @Expose
    private Long BgpAsn;

    /**
    * 服务端最大连接数个数。
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
     * Get VPN网关实例ID。 
     * @return VpnGatewayId VPN网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set VPN网关实例ID。
     * @param VpnGatewayId VPN网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get VPN网关名称，最大长度不能超过60个字节。 
     * @return VpnGatewayName VPN网关名称，最大长度不能超过60个字节。
     */
    public String getVpnGatewayName() {
        return this.VpnGatewayName;
    }

    /**
     * Set VPN网关名称，最大长度不能超过60个字节。
     * @param VpnGatewayName VPN网关名称，最大长度不能超过60个字节。
     */
    public void setVpnGatewayName(String VpnGatewayName) {
        this.VpnGatewayName = VpnGatewayName;
    }

    /**
     * Get VPN网关计费模式，目前只支持预付费（即包年包月）到后付费（即按量计费）的转换。即参数只支持：POSTPAID_BY_HOUR。 
     * @return InstanceChargeType VPN网关计费模式，目前只支持预付费（即包年包月）到后付费（即按量计费）的转换。即参数只支持：POSTPAID_BY_HOUR。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set VPN网关计费模式，目前只支持预付费（即包年包月）到后付费（即按量计费）的转换。即参数只支持：POSTPAID_BY_HOUR。
     * @param InstanceChargeType VPN网关计费模式，目前只支持预付费（即包年包月）到后付费（即按量计费）的转换。即参数只支持：POSTPAID_BY_HOUR。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get BGP ASN。ASN取值范围为1- 4294967295，默认值64551，其中139341、45090和58835不可用。 
     * @return BgpAsn BGP ASN。ASN取值范围为1- 4294967295，默认值64551，其中139341、45090和58835不可用。
     */
    public Long getBgpAsn() {
        return this.BgpAsn;
    }

    /**
     * Set BGP ASN。ASN取值范围为1- 4294967295，默认值64551，其中139341、45090和58835不可用。
     * @param BgpAsn BGP ASN。ASN取值范围为1- 4294967295，默认值64551，其中139341、45090和58835不可用。
     */
    public void setBgpAsn(Long BgpAsn) {
        this.BgpAsn = BgpAsn;
    }

    /**
     * Get 服务端最大连接数个数。 
     * @return MaxConnection 服务端最大连接数个数。
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set 服务端最大连接数个数。
     * @param MaxConnection 服务端最大连接数个数。
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    public ModifyVpnGatewayAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpnGatewayAttributeRequest(ModifyVpnGatewayAttributeRequest source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.VpnGatewayName != null) {
            this.VpnGatewayName = new String(source.VpnGatewayName);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.BgpAsn != null) {
            this.BgpAsn = new Long(source.BgpAsn);
        }
        if (source.MaxConnection != null) {
            this.MaxConnection = new Long(source.MaxConnection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "VpnGatewayName", this.VpnGatewayName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "BgpAsn", this.BgpAsn);
        this.setParamSimple(map, prefix + "MaxConnection", this.MaxConnection);

    }
}

