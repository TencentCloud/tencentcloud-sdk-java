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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficMirror extends AbstractModel {

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 流量镜像实例。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像名字。
    */
    @SerializedName("TrafficMirrorName")
    @Expose
    private String TrafficMirrorName;

    /**
    * 流量镜像描述。
    */
    @SerializedName("TrafficMirrorDescribe")
    @Expose
    private String TrafficMirrorDescribe;

    /**
    * 流量镜像状态。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 流量镜像采集方向。
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 流量镜像采集对象。
    */
    @SerializedName("CollectorSrcs")
    @Expose
    private String [] CollectorSrcs;

    /**
    * 流量镜像过滤的nat网关实例ID。
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * 流量镜像过滤的五元组规则。
    */
    @SerializedName("CollectorNormalFilters")
    @Expose
    private TrafficMirrorFilter [] CollectorNormalFilters;

    /**
    * 流量镜接收目标。
    */
    @SerializedName("CollectorTarget")
    @Expose
    private TrafficMirrorTarget CollectorTarget;

    /**
    * 流量镜像创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 流量镜像的类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 流量镜像所属的子网ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 流量镜接收目标资源信息，当接收目标为ENI和CLB时返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetInfo")
    @Expose
    private TrafficMirrorTargetResourceInfo [] TargetInfo;

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 流量镜像实例。 
     * @return TrafficMirrorId 流量镜像实例。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像实例。
     * @param TrafficMirrorId 流量镜像实例。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 流量镜像名字。 
     * @return TrafficMirrorName 流量镜像名字。
     */
    public String getTrafficMirrorName() {
        return this.TrafficMirrorName;
    }

    /**
     * Set 流量镜像名字。
     * @param TrafficMirrorName 流量镜像名字。
     */
    public void setTrafficMirrorName(String TrafficMirrorName) {
        this.TrafficMirrorName = TrafficMirrorName;
    }

    /**
     * Get 流量镜像描述。 
     * @return TrafficMirrorDescribe 流量镜像描述。
     */
    public String getTrafficMirrorDescribe() {
        return this.TrafficMirrorDescribe;
    }

    /**
     * Set 流量镜像描述。
     * @param TrafficMirrorDescribe 流量镜像描述。
     */
    public void setTrafficMirrorDescribe(String TrafficMirrorDescribe) {
        this.TrafficMirrorDescribe = TrafficMirrorDescribe;
    }

    /**
     * Get 流量镜像状态。 
     * @return State 流量镜像状态。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 流量镜像状态。
     * @param State 流量镜像状态。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 流量镜像采集方向。 
     * @return Direction 流量镜像采集方向。
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 流量镜像采集方向。
     * @param Direction 流量镜像采集方向。
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 流量镜像采集对象。 
     * @return CollectorSrcs 流量镜像采集对象。
     */
    public String [] getCollectorSrcs() {
        return this.CollectorSrcs;
    }

    /**
     * Set 流量镜像采集对象。
     * @param CollectorSrcs 流量镜像采集对象。
     */
    public void setCollectorSrcs(String [] CollectorSrcs) {
        this.CollectorSrcs = CollectorSrcs;
    }

    /**
     * Get 流量镜像过滤的nat网关实例ID。 
     * @return NatId 流量镜像过滤的nat网关实例ID。
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set 流量镜像过滤的nat网关实例ID。
     * @param NatId 流量镜像过滤的nat网关实例ID。
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get 流量镜像过滤的五元组规则。 
     * @return CollectorNormalFilters 流量镜像过滤的五元组规则。
     */
    public TrafficMirrorFilter [] getCollectorNormalFilters() {
        return this.CollectorNormalFilters;
    }

    /**
     * Set 流量镜像过滤的五元组规则。
     * @param CollectorNormalFilters 流量镜像过滤的五元组规则。
     */
    public void setCollectorNormalFilters(TrafficMirrorFilter [] CollectorNormalFilters) {
        this.CollectorNormalFilters = CollectorNormalFilters;
    }

    /**
     * Get 流量镜接收目标。 
     * @return CollectorTarget 流量镜接收目标。
     */
    public TrafficMirrorTarget getCollectorTarget() {
        return this.CollectorTarget;
    }

    /**
     * Set 流量镜接收目标。
     * @param CollectorTarget 流量镜接收目标。
     */
    public void setCollectorTarget(TrafficMirrorTarget CollectorTarget) {
        this.CollectorTarget = CollectorTarget;
    }

    /**
     * Get 流量镜像创建时间。 
     * @return CreateTime 流量镜像创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 流量镜像创建时间。
     * @param CreateTime 流量镜像创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 流量镜像的类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 流量镜像的类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 流量镜像的类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 流量镜像的类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 流量镜像所属的子网ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 流量镜像所属的子网ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 流量镜像所属的子网ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 流量镜像所属的子网ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 流量镜接收目标资源信息，当接收目标为ENI和CLB时返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetInfo 流量镜接收目标资源信息，当接收目标为ENI和CLB时返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrafficMirrorTargetResourceInfo [] getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set 流量镜接收目标资源信息，当接收目标为ENI和CLB时返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetInfo 流量镜接收目标资源信息，当接收目标为ENI和CLB时返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetInfo(TrafficMirrorTargetResourceInfo [] TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    public TrafficMirror() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirror(TrafficMirror source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.TrafficMirrorName != null) {
            this.TrafficMirrorName = new String(source.TrafficMirrorName);
        }
        if (source.TrafficMirrorDescribe != null) {
            this.TrafficMirrorDescribe = new String(source.TrafficMirrorDescribe);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.CollectorSrcs != null) {
            this.CollectorSrcs = new String[source.CollectorSrcs.length];
            for (int i = 0; i < source.CollectorSrcs.length; i++) {
                this.CollectorSrcs[i] = new String(source.CollectorSrcs[i]);
            }
        }
        if (source.NatId != null) {
            this.NatId = new String(source.NatId);
        }
        if (source.CollectorNormalFilters != null) {
            this.CollectorNormalFilters = new TrafficMirrorFilter[source.CollectorNormalFilters.length];
            for (int i = 0; i < source.CollectorNormalFilters.length; i++) {
                this.CollectorNormalFilters[i] = new TrafficMirrorFilter(source.CollectorNormalFilters[i]);
            }
        }
        if (source.CollectorTarget != null) {
            this.CollectorTarget = new TrafficMirrorTarget(source.CollectorTarget);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.TargetInfo != null) {
            this.TargetInfo = new TrafficMirrorTargetResourceInfo[source.TargetInfo.length];
            for (int i = 0; i < source.TargetInfo.length; i++) {
                this.TargetInfo[i] = new TrafficMirrorTargetResourceInfo(source.TargetInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "TrafficMirrorName", this.TrafficMirrorName);
        this.setParamSimple(map, prefix + "TrafficMirrorDescribe", this.TrafficMirrorDescribe);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArraySimple(map, prefix + "CollectorSrcs.", this.CollectorSrcs);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamArrayObj(map, prefix + "CollectorNormalFilters.", this.CollectorNormalFilters);
        this.setParamObj(map, prefix + "CollectorTarget.", this.CollectorTarget);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "TargetInfo.", this.TargetInfo);

    }
}

