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

public class EndPoint extends AbstractModel{

    /**
    * 终端节点ID。
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * VPCID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * APPID。
    */
    @SerializedName("EndPointOwner")
    @Expose
    private String EndPointOwner;

    /**
    * 终端节点名称。
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * 终端节点服务的VPCID。
    */
    @SerializedName("ServiceVpcId")
    @Expose
    private String ServiceVpcId;

    /**
    * 终端节点服务的VIP。
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * 终端节点服务的ID。
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 终端节点的VIP。
    */
    @SerializedName("EndPointVip")
    @Expose
    private String EndPointVip;

    /**
    * 终端节点状态，ACTIVE：可用，PENDING：待接受，ACCEPTING：接受中，REJECTED：已拒绝，FAILED：失败。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 终端节点绑定的安全组实例ID列表。
    */
    @SerializedName("GroupSet")
    @Expose
    private String [] GroupSet;

    /**
    * 终端节点服务名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get 终端节点ID。 
     * @return EndPointId 终端节点ID。
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID。
     * @param EndPointId 终端节点ID。
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get VPCID。 
     * @return VpcId VPCID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPCID。
     * @param VpcId VPCID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID。 
     * @return SubnetId 子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID。
     * @param SubnetId 子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get APPID。 
     * @return EndPointOwner APPID。
     */
    public String getEndPointOwner() {
        return this.EndPointOwner;
    }

    /**
     * Set APPID。
     * @param EndPointOwner APPID。
     */
    public void setEndPointOwner(String EndPointOwner) {
        this.EndPointOwner = EndPointOwner;
    }

    /**
     * Get 终端节点名称。 
     * @return EndPointName 终端节点名称。
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set 终端节点名称。
     * @param EndPointName 终端节点名称。
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get 终端节点服务的VPCID。 
     * @return ServiceVpcId 终端节点服务的VPCID。
     */
    public String getServiceVpcId() {
        return this.ServiceVpcId;
    }

    /**
     * Set 终端节点服务的VPCID。
     * @param ServiceVpcId 终端节点服务的VPCID。
     */
    public void setServiceVpcId(String ServiceVpcId) {
        this.ServiceVpcId = ServiceVpcId;
    }

    /**
     * Get 终端节点服务的VIP。 
     * @return ServiceVip 终端节点服务的VIP。
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set 终端节点服务的VIP。
     * @param ServiceVip 终端节点服务的VIP。
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get 终端节点服务的ID。 
     * @return EndPointServiceId 终端节点服务的ID。
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务的ID。
     * @param EndPointServiceId 终端节点服务的ID。
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 终端节点的VIP。 
     * @return EndPointVip 终端节点的VIP。
     */
    public String getEndPointVip() {
        return this.EndPointVip;
    }

    /**
     * Set 终端节点的VIP。
     * @param EndPointVip 终端节点的VIP。
     */
    public void setEndPointVip(String EndPointVip) {
        this.EndPointVip = EndPointVip;
    }

    /**
     * Get 终端节点状态，ACTIVE：可用，PENDING：待接受，ACCEPTING：接受中，REJECTED：已拒绝，FAILED：失败。 
     * @return State 终端节点状态，ACTIVE：可用，PENDING：待接受，ACCEPTING：接受中，REJECTED：已拒绝，FAILED：失败。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 终端节点状态，ACTIVE：可用，PENDING：待接受，ACCEPTING：接受中，REJECTED：已拒绝，FAILED：失败。
     * @param State 终端节点状态，ACTIVE：可用，PENDING：待接受，ACCEPTING：接受中，REJECTED：已拒绝，FAILED：失败。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 终端节点绑定的安全组实例ID列表。 
     * @return GroupSet 终端节点绑定的安全组实例ID列表。
     */
    public String [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set 终端节点绑定的安全组实例ID列表。
     * @param GroupSet 终端节点绑定的安全组实例ID列表。
     */
    public void setGroupSet(String [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get 终端节点服务名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 终端节点服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 终端节点服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 终端节点服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public EndPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndPoint(EndPoint source) {
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EndPointOwner != null) {
            this.EndPointOwner = new String(source.EndPointOwner);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.ServiceVpcId != null) {
            this.ServiceVpcId = new String(source.ServiceVpcId);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVip != null) {
            this.EndPointVip = new String(source.EndPointVip);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GroupSet != null) {
            this.GroupSet = new String[source.GroupSet.length];
            for (int i = 0; i < source.GroupSet.length; i++) {
                this.GroupSet[i] = new String(source.GroupSet[i]);
            }
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EndPointOwner", this.EndPointOwner);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "ServiceVpcId", this.ServiceVpcId);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "EndPointVip", this.EndPointVip);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

