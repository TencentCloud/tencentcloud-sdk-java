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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatCcnSwitchConfig extends AbstractModel {

    /**
    * <p>NAT防火墙实例ID</p>
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
    * <p>云联网实例ID</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>开关接入模式，1:自动接入，2:手动接入</p>
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * <p>引流路由方法，0:多路由表，1:策略路由。自动接入模式仅支持策略路由(1)；手动接入模式支持多路由表(0)和策略路由(1)</p>
    */
    @SerializedName("RoutingMode")
    @Expose
    private Long RoutingMode;

    /**
    * <p>接入的实例列表</p>
    */
    @SerializedName("AccessInstanceList")
    @Expose
    private AccessInstanceInfo [] AccessInstanceList;

    /**
    * <p>引流VPC的CIDR网段</p>
    */
    @SerializedName("LeadVpcCidr")
    @Expose
    private String LeadVpcCidr;

    /**
     * Get <p>NAT防火墙实例ID</p> 
     * @return NatInsId <p>NAT防火墙实例ID</p>
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set <p>NAT防火墙实例ID</p>
     * @param NatInsId <p>NAT防火墙实例ID</p>
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    /**
     * Get <p>云联网实例ID</p> 
     * @return CcnId <p>云联网实例ID</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网实例ID</p>
     * @param CcnId <p>云联网实例ID</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>开关接入模式，1:自动接入，2:手动接入</p> 
     * @return SwitchMode <p>开关接入模式，1:自动接入，2:手动接入</p>
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set <p>开关接入模式，1:自动接入，2:手动接入</p>
     * @param SwitchMode <p>开关接入模式，1:自动接入，2:手动接入</p>
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get <p>引流路由方法，0:多路由表，1:策略路由。自动接入模式仅支持策略路由(1)；手动接入模式支持多路由表(0)和策略路由(1)</p> 
     * @return RoutingMode <p>引流路由方法，0:多路由表，1:策略路由。自动接入模式仅支持策略路由(1)；手动接入模式支持多路由表(0)和策略路由(1)</p>
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set <p>引流路由方法，0:多路由表，1:策略路由。自动接入模式仅支持策略路由(1)；手动接入模式支持多路由表(0)和策略路由(1)</p>
     * @param RoutingMode <p>引流路由方法，0:多路由表，1:策略路由。自动接入模式仅支持策略路由(1)；手动接入模式支持多路由表(0)和策略路由(1)</p>
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    /**
     * Get <p>接入的实例列表</p> 
     * @return AccessInstanceList <p>接入的实例列表</p>
     */
    public AccessInstanceInfo [] getAccessInstanceList() {
        return this.AccessInstanceList;
    }

    /**
     * Set <p>接入的实例列表</p>
     * @param AccessInstanceList <p>接入的实例列表</p>
     */
    public void setAccessInstanceList(AccessInstanceInfo [] AccessInstanceList) {
        this.AccessInstanceList = AccessInstanceList;
    }

    /**
     * Get <p>引流VPC的CIDR网段</p> 
     * @return LeadVpcCidr <p>引流VPC的CIDR网段</p>
     */
    public String getLeadVpcCidr() {
        return this.LeadVpcCidr;
    }

    /**
     * Set <p>引流VPC的CIDR网段</p>
     * @param LeadVpcCidr <p>引流VPC的CIDR网段</p>
     */
    public void setLeadVpcCidr(String LeadVpcCidr) {
        this.LeadVpcCidr = LeadVpcCidr;
    }

    public NatCcnSwitchConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatCcnSwitchConfig(NatCcnSwitchConfig source) {
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.RoutingMode != null) {
            this.RoutingMode = new Long(source.RoutingMode);
        }
        if (source.AccessInstanceList != null) {
            this.AccessInstanceList = new AccessInstanceInfo[source.AccessInstanceList.length];
            for (int i = 0; i < source.AccessInstanceList.length; i++) {
                this.AccessInstanceList[i] = new AccessInstanceInfo(source.AccessInstanceList[i]);
            }
        }
        if (source.LeadVpcCidr != null) {
            this.LeadVpcCidr = new String(source.LeadVpcCidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "RoutingMode", this.RoutingMode);
        this.setParamArrayObj(map, prefix + "AccessInstanceList.", this.AccessInstanceList);
        this.setParamSimple(map, prefix + "LeadVpcCidr", this.LeadVpcCidr);

    }
}

