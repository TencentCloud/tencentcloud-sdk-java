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

public class AssistantCidr  extends AbstractModel{

    /**
    * `VPC`实例`ID`。形如：`vpc-6v2ht8q5`
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 辅助CIDR。形如：`172.16.0.0/16`
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。
    */
    @SerializedName("AssistantType")
    @Expose
    private Integer AssistantType;

    /**
    * 辅助CIDR拆分的子网。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetSet")
    @Expose
    private Subnet [] SubnetSet;

    /**
     * 获取`VPC`实例`ID`。形如：`vpc-6v2ht8q5`
     * @return VpcId `VPC`实例`ID`。形如：`vpc-6v2ht8q5`
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置`VPC`实例`ID`。形如：`vpc-6v2ht8q5`
     * @param VpcId `VPC`实例`ID`。形如：`vpc-6v2ht8q5`
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取辅助CIDR。形如：`172.16.0.0/16`
     * @return CidrBlock 辅助CIDR。形如：`172.16.0.0/16`
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置辅助CIDR。形如：`172.16.0.0/16`
     * @param CidrBlock 辅助CIDR。形如：`172.16.0.0/16`
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。
     * @return AssistantType 辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。
     */
    public Integer getAssistantType() {
        return this.AssistantType;
    }

    /**
     * 设置辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。
     * @param AssistantType 辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。
     */
    public void setAssistantType(Integer AssistantType) {
        this.AssistantType = AssistantType;
    }

    /**
     * 获取辅助CIDR拆分的子网。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SubnetSet 辅助CIDR拆分的子网。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Subnet [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * 设置辅助CIDR拆分的子网。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetSet 辅助CIDR拆分的子网。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetSet(Subnet [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "AssistantType", this.AssistantType);
        this.setParamArrayObj(map, prefix + "SubnetSet.", this.SubnetSet);

    }
}

