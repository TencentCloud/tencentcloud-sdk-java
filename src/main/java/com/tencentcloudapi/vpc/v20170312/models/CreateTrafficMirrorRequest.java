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

public class CreateTrafficMirrorRequest extends AbstractModel {

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

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
    * 流量镜像状态, 支持RUNNING/STOPED（vpc），RUNNING（公网IP），当采集vpc流量镜像时，此参数为必填。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 流量镜像采集方向，支持EGRESS/INGRESS/ALL（vpc），ALL（公网IP）。
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 流量镜像的采集对象，支持eni_xxxx。
    */
    @SerializedName("CollectorSrcs")
    @Expose
    private String [] CollectorSrcs;

    /**
    * 流量镜像过滤的natgw实例。
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * 需要过滤的五元组规则。
    */
    @SerializedName("CollectorNormalFilters")
    @Expose
    private TrafficMirrorFilter [] CollectorNormalFilters;

    /**
    * 流量镜像的目的地址。
    */
    @SerializedName("CollectorTarget")
    @Expose
    private TrafficMirrorTarget CollectorTarget;

    /**
    * 流量镜像采集流量的发送端所属子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 创建的流量镜像的类型，支持VPC/PUBLICIP，默认为VPC类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get 流量镜像状态, 支持RUNNING/STOPED（vpc），RUNNING（公网IP），当采集vpc流量镜像时，此参数为必填。 
     * @return State 流量镜像状态, 支持RUNNING/STOPED（vpc），RUNNING（公网IP），当采集vpc流量镜像时，此参数为必填。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 流量镜像状态, 支持RUNNING/STOPED（vpc），RUNNING（公网IP），当采集vpc流量镜像时，此参数为必填。
     * @param State 流量镜像状态, 支持RUNNING/STOPED（vpc），RUNNING（公网IP），当采集vpc流量镜像时，此参数为必填。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 流量镜像采集方向，支持EGRESS/INGRESS/ALL（vpc），ALL（公网IP）。 
     * @return Direction 流量镜像采集方向，支持EGRESS/INGRESS/ALL（vpc），ALL（公网IP）。
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 流量镜像采集方向，支持EGRESS/INGRESS/ALL（vpc），ALL（公网IP）。
     * @param Direction 流量镜像采集方向，支持EGRESS/INGRESS/ALL（vpc），ALL（公网IP）。
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 流量镜像的采集对象，支持eni_xxxx。 
     * @return CollectorSrcs 流量镜像的采集对象，支持eni_xxxx。
     */
    public String [] getCollectorSrcs() {
        return this.CollectorSrcs;
    }

    /**
     * Set 流量镜像的采集对象，支持eni_xxxx。
     * @param CollectorSrcs 流量镜像的采集对象，支持eni_xxxx。
     */
    public void setCollectorSrcs(String [] CollectorSrcs) {
        this.CollectorSrcs = CollectorSrcs;
    }

    /**
     * Get 流量镜像过滤的natgw实例。 
     * @return NatId 流量镜像过滤的natgw实例。
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set 流量镜像过滤的natgw实例。
     * @param NatId 流量镜像过滤的natgw实例。
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get 需要过滤的五元组规则。 
     * @return CollectorNormalFilters 需要过滤的五元组规则。
     */
    public TrafficMirrorFilter [] getCollectorNormalFilters() {
        return this.CollectorNormalFilters;
    }

    /**
     * Set 需要过滤的五元组规则。
     * @param CollectorNormalFilters 需要过滤的五元组规则。
     */
    public void setCollectorNormalFilters(TrafficMirrorFilter [] CollectorNormalFilters) {
        this.CollectorNormalFilters = CollectorNormalFilters;
    }

    /**
     * Get 流量镜像的目的地址。 
     * @return CollectorTarget 流量镜像的目的地址。
     */
    public TrafficMirrorTarget getCollectorTarget() {
        return this.CollectorTarget;
    }

    /**
     * Set 流量镜像的目的地址。
     * @param CollectorTarget 流量镜像的目的地址。
     */
    public void setCollectorTarget(TrafficMirrorTarget CollectorTarget) {
        this.CollectorTarget = CollectorTarget;
    }

    /**
     * Get 流量镜像采集流量的发送端所属子网ID。 
     * @return SubnetId 流量镜像采集流量的发送端所属子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 流量镜像采集流量的发送端所属子网ID。
     * @param SubnetId 流量镜像采集流量的发送端所属子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 创建的流量镜像的类型，支持VPC/PUBLICIP，默认为VPC类型。 
     * @return Type 创建的流量镜像的类型，支持VPC/PUBLICIP，默认为VPC类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 创建的流量镜像的类型，支持VPC/PUBLICIP，默认为VPC类型。
     * @param Type 创建的流量镜像的类型，支持VPC/PUBLICIP，默认为VPC类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateTrafficMirrorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrafficMirrorRequest(CreateTrafficMirrorRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
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
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TrafficMirrorName", this.TrafficMirrorName);
        this.setParamSimple(map, prefix + "TrafficMirrorDescribe", this.TrafficMirrorDescribe);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArraySimple(map, prefix + "CollectorSrcs.", this.CollectorSrcs);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamArrayObj(map, prefix + "CollectorNormalFilters.", this.CollectorNormalFilters);
        this.setParamObj(map, prefix + "CollectorTarget.", this.CollectorTarget);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

