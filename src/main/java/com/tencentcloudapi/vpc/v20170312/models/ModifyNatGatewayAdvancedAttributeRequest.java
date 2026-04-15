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

public class ModifyNatGatewayAdvancedAttributeRequest extends AbstractModel {

    /**
    * NAT网关的ID，形如：`nat-df45454`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * UDP映射空闲时间，单位：秒。含义为UDP流空闲多少秒以后从NAT映射中释放。取值范围为：3-7200，默认为180。
    */
    @SerializedName("UDPMappingTimeout")
    @Expose
    private Long UDPMappingTimeout;

    /**
    * TCP已建立的连接空闲超时时间，单位：秒。含义为TCP已建立的连接空闲多少秒以后从NAT映射中释放。取值范围为：40-10800，默认为10800。
    */
    @SerializedName("TCPEstablishedConnectionTimeout")
    @Expose
    private Long TCPEstablishedConnectionTimeout;

    /**
    * TCP TIME_WAIT超时时间，单位：秒。含义为完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600，默认为120。
    */
    @SerializedName("TCPTimeWaitTimeout")
    @Expose
    private Long TCPTimeWaitTimeout;

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
     * Get UDP映射空闲时间，单位：秒。含义为UDP流空闲多少秒以后从NAT映射中释放。取值范围为：3-7200，默认为180。 
     * @return UDPMappingTimeout UDP映射空闲时间，单位：秒。含义为UDP流空闲多少秒以后从NAT映射中释放。取值范围为：3-7200，默认为180。
     */
    public Long getUDPMappingTimeout() {
        return this.UDPMappingTimeout;
    }

    /**
     * Set UDP映射空闲时间，单位：秒。含义为UDP流空闲多少秒以后从NAT映射中释放。取值范围为：3-7200，默认为180。
     * @param UDPMappingTimeout UDP映射空闲时间，单位：秒。含义为UDP流空闲多少秒以后从NAT映射中释放。取值范围为：3-7200，默认为180。
     */
    public void setUDPMappingTimeout(Long UDPMappingTimeout) {
        this.UDPMappingTimeout = UDPMappingTimeout;
    }

    /**
     * Get TCP已建立的连接空闲超时时间，单位：秒。含义为TCP已建立的连接空闲多少秒以后从NAT映射中释放。取值范围为：40-10800，默认为10800。 
     * @return TCPEstablishedConnectionTimeout TCP已建立的连接空闲超时时间，单位：秒。含义为TCP已建立的连接空闲多少秒以后从NAT映射中释放。取值范围为：40-10800，默认为10800。
     */
    public Long getTCPEstablishedConnectionTimeout() {
        return this.TCPEstablishedConnectionTimeout;
    }

    /**
     * Set TCP已建立的连接空闲超时时间，单位：秒。含义为TCP已建立的连接空闲多少秒以后从NAT映射中释放。取值范围为：40-10800，默认为10800。
     * @param TCPEstablishedConnectionTimeout TCP已建立的连接空闲超时时间，单位：秒。含义为TCP已建立的连接空闲多少秒以后从NAT映射中释放。取值范围为：40-10800，默认为10800。
     */
    public void setTCPEstablishedConnectionTimeout(Long TCPEstablishedConnectionTimeout) {
        this.TCPEstablishedConnectionTimeout = TCPEstablishedConnectionTimeout;
    }

    /**
     * Get TCP TIME_WAIT超时时间，单位：秒。含义为完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600，默认为120。 
     * @return TCPTimeWaitTimeout TCP TIME_WAIT超时时间，单位：秒。含义为完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600，默认为120。
     */
    public Long getTCPTimeWaitTimeout() {
        return this.TCPTimeWaitTimeout;
    }

    /**
     * Set TCP TIME_WAIT超时时间，单位：秒。含义为完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600，默认为120。
     * @param TCPTimeWaitTimeout TCP TIME_WAIT超时时间，单位：秒。含义为完全关闭的TCP连接在到期后保留在NAT映射中的秒数。取值范围为：10-600，默认为120。
     */
    public void setTCPTimeWaitTimeout(Long TCPTimeWaitTimeout) {
        this.TCPTimeWaitTimeout = TCPTimeWaitTimeout;
    }

    public ModifyNatGatewayAdvancedAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatGatewayAdvancedAttributeRequest(ModifyNatGatewayAdvancedAttributeRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.UDPMappingTimeout != null) {
            this.UDPMappingTimeout = new Long(source.UDPMappingTimeout);
        }
        if (source.TCPEstablishedConnectionTimeout != null) {
            this.TCPEstablishedConnectionTimeout = new Long(source.TCPEstablishedConnectionTimeout);
        }
        if (source.TCPTimeWaitTimeout != null) {
            this.TCPTimeWaitTimeout = new Long(source.TCPTimeWaitTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "UDPMappingTimeout", this.UDPMappingTimeout);
        this.setParamSimple(map, prefix + "TCPEstablishedConnectionTimeout", this.TCPEstablishedConnectionTimeout);
        this.setParamSimple(map, prefix + "TCPTimeWaitTimeout", this.TCPTimeWaitTimeout);

    }
}

