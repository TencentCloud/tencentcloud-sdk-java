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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CkafkaRouteInfo extends AbstractModel{

    /**
    * 路由ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteID")
    @Expose
    private Long RouteID;

    /**
    * 域名名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainPort")
    @Expose
    private Long DomainPort;

    /**
    * 虚拟ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 虚拟ip类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * 接入类型
// 0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
	// 1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
	// 2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
	// 3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
     * Get 路由ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteID 路由ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRouteID() {
        return this.RouteID;
    }

    /**
     * Set 路由ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteID 路由ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteID(Long RouteID) {
        this.RouteID = RouteID;
    }

    /**
     * Get 域名名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainPort 域名端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set 域名端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainPort 域名端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainPort(Long DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get 虚拟ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 虚拟ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 虚拟ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 虚拟ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 虚拟ip类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipType 虚拟ip类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set 虚拟ip类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipType 虚拟ip类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get 接入类型
// 0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
	// 1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
	// 2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
	// 3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 接入类型
// 0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
	// 1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
	// 2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
	// 3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 接入类型
// 0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
	// 1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
	// 2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
	// 3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 接入类型
// 0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
	// 1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
	// 2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
	// 3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    public CkafkaRouteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CkafkaRouteInfo(CkafkaRouteInfo source) {
        if (source.RouteID != null) {
            this.RouteID = new Long(source.RouteID);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new Long(source.DomainPort);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteID", this.RouteID);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);

    }
}

