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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Route extends AbstractModel{

    /**
    * 实例接入方式
0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 路由ID
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * vip网络类型（1:外网TGW  2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境）
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * 虚拟IP列表
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainPort")
    @Expose
    private Long DomainPort;

    /**
    * 时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteTimestamp")
    @Expose
    private String DeleteTimestamp;

    /**
    * 子网信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subnet")
    @Expose
    private String Subnet;

    /**
    * 虚拟IP列表(1对1 broker节点)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerVipList")
    @Expose
    private VipEntity [] BrokerVipList;

    /**
    * vpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 实例接入方式
0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持） 
     * @return AccessType 实例接入方式
0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 实例接入方式
0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
     * @param AccessType 实例接入方式
0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)
1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）
3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 路由ID 
     * @return RouteId 路由ID
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 路由ID
     * @param RouteId 路由ID
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get vip网络类型（1:外网TGW  2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境） 
     * @return VipType vip网络类型（1:外网TGW  2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境）
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set vip网络类型（1:外网TGW  2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境）
     * @param VipType vip网络类型（1:外网TGW  2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境）
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get 虚拟IP列表 
     * @return VipList 虚拟IP列表
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set 虚拟IP列表
     * @param VipList 虚拟IP列表
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainPort 域名port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set 域名port
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainPort 域名port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainPort(Long DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get 时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteTimestamp 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeleteTimestamp() {
        return this.DeleteTimestamp;
    }

    /**
     * Set 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteTimestamp 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteTimestamp(String DeleteTimestamp) {
        this.DeleteTimestamp = DeleteTimestamp;
    }

    /**
     * Get 子网信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subnet 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnet() {
        return this.Subnet;
    }

    /**
     * Set 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subnet 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnet(String Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get 虚拟IP列表(1对1 broker节点)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerVipList 虚拟IP列表(1对1 broker节点)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VipEntity [] getBrokerVipList() {
        return this.BrokerVipList;
    }

    /**
     * Set 虚拟IP列表(1对1 broker节点)
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerVipList 虚拟IP列表(1对1 broker节点)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerVipList(VipEntity [] BrokerVipList) {
        this.BrokerVipList = BrokerVipList;
    }

    /**
     * Get vpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public Route() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Route(Route source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.VipList != null) {
            this.VipList = new VipEntity[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new VipEntity(source.VipList[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new Long(source.DomainPort);
        }
        if (source.DeleteTimestamp != null) {
            this.DeleteTimestamp = new String(source.DeleteTimestamp);
        }
        if (source.Subnet != null) {
            this.Subnet = new String(source.Subnet);
        }
        if (source.BrokerVipList != null) {
            this.BrokerVipList = new VipEntity[source.BrokerVipList.length];
            for (int i = 0; i < source.BrokerVipList.length; i++) {
                this.BrokerVipList[i] = new VipEntity(source.BrokerVipList[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamArrayObj(map, prefix + "VipList.", this.VipList);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "DeleteTimestamp", this.DeleteTimestamp);
        this.setParamSimple(map, prefix + "Subnet", this.Subnet);
        this.setParamArrayObj(map, prefix + "BrokerVipList.", this.BrokerVipList);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

