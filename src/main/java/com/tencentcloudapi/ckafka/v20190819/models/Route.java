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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Route extends AbstractModel {

    /**
    * <p>实例接入方式0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）</p>
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * <p>路由Id</p>
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p>
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * <p>虚拟IP列表</p>
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名port</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainPort")
    @Expose
    private Long DomainPort;

    /**
    * <p>时间戳</p>
    */
    @SerializedName("DeleteTimestamp")
    @Expose
    private String DeleteTimestamp;

    /**
    * <p>子网Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subnet")
    @Expose
    private String Subnet;

    /**
    * <p>虚拟IP列表(1对1 broker节点)</p>
    */
    @SerializedName("BrokerVipList")
    @Expose
    private VipEntity [] BrokerVipList;

    /**
    * <p>私有网络Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>路由的状态。1: 创建中，2: 创建成功，3: 创建失败，4: 删除中，6: 删除失败</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>实例接入方式0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）</p> 
     * @return AccessType <p>实例接入方式0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）</p>
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>实例接入方式0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）</p>
     * @param AccessType <p>实例接入方式0：PLAINTEXT (明文方式，没有带用户信息老版本及社区版本都支持)1：SASL_PLAINTEXT（明文方式，不过在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）2：SSL（SSL加密通信，没有带用户信息，老版本及社区版本都支持）3：SASL_SSL（SSL加密通信，在数据开始时，会通过SASL方式登录鉴权，仅社区版本支持）</p>
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>路由Id</p> 
     * @return RouteId <p>路由Id</p>
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>路由Id</p>
     * @param RouteId <p>路由Id</p>
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p> 
     * @return VipType <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p>
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p>
     * @param VipType <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p>
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get <p>虚拟IP列表</p> 
     * @return VipList <p>虚拟IP列表</p>
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set <p>虚拟IP列表</p>
     * @param VipList <p>虚拟IP列表</p>
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名port</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainPort <p>域名port</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set <p>域名port</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainPort <p>域名port</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainPort(Long DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get <p>时间戳</p> 
     * @return DeleteTimestamp <p>时间戳</p>
     */
    public String getDeleteTimestamp() {
        return this.DeleteTimestamp;
    }

    /**
     * Set <p>时间戳</p>
     * @param DeleteTimestamp <p>时间戳</p>
     */
    public void setDeleteTimestamp(String DeleteTimestamp) {
        this.DeleteTimestamp = DeleteTimestamp;
    }

    /**
     * Get <p>子网Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subnet <p>子网Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnet() {
        return this.Subnet;
    }

    /**
     * Set <p>子网Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subnet <p>子网Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnet(String Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get <p>虚拟IP列表(1对1 broker节点)</p> 
     * @return BrokerVipList <p>虚拟IP列表(1对1 broker节点)</p>
     */
    public VipEntity [] getBrokerVipList() {
        return this.BrokerVipList;
    }

    /**
     * Set <p>虚拟IP列表(1对1 broker节点)</p>
     * @param BrokerVipList <p>虚拟IP列表(1对1 broker节点)</p>
     */
    public void setBrokerVipList(VipEntity [] BrokerVipList) {
        this.BrokerVipList = BrokerVipList;
    }

    /**
     * Get <p>私有网络Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>私有网络Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>私有网络Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Note <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Note <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>路由的状态。1: 创建中，2: 创建成功，3: 创建失败，4: 删除中，6: 删除失败</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>路由的状态。1: 创建中，2: 创建成功，3: 创建失败，4: 删除中，6: 删除失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>路由的状态。1: 创建中，2: 创建成功，3: 创建失败，4: 删除中，6: 删除失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>路由的状态。1: 创建中，2: 创建成功，3: 创建失败，4: 删除中，6: 删除失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

