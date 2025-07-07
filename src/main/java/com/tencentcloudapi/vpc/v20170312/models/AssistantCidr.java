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

public class AssistantCidr extends AbstractModel {

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
    private Long AssistantType;

    /**
    * 辅助CIDR拆分的子网。
    */
    @SerializedName("SubnetSet")
    @Expose
    private Subnet [] SubnetSet;

    /**
     * Get `VPC`实例`ID`。形如：`vpc-6v2ht8q5` 
     * @return VpcId `VPC`实例`ID`。形如：`vpc-6v2ht8q5`
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC`实例`ID`。形如：`vpc-6v2ht8q5`
     * @param VpcId `VPC`实例`ID`。形如：`vpc-6v2ht8q5`
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 辅助CIDR。形如：`172.16.0.0/16` 
     * @return CidrBlock 辅助CIDR。形如：`172.16.0.0/16`
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 辅助CIDR。形如：`172.16.0.0/16`
     * @param CidrBlock 辅助CIDR。形如：`172.16.0.0/16`
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。 
     * @return AssistantType 辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。
     */
    public Long getAssistantType() {
        return this.AssistantType;
    }

    /**
     * Set 辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。
     * @param AssistantType 辅助CIDR类型（0：普通辅助CIDR，1：容器辅助CIDR），默认都是0。
     */
    public void setAssistantType(Long AssistantType) {
        this.AssistantType = AssistantType;
    }

    /**
     * Get 辅助CIDR拆分的子网。 
     * @return SubnetSet 辅助CIDR拆分的子网。
     */
    public Subnet [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set 辅助CIDR拆分的子网。
     * @param SubnetSet 辅助CIDR拆分的子网。
     */
    public void setSubnetSet(Subnet [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    public AssistantCidr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssistantCidr(AssistantCidr source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.AssistantType != null) {
            this.AssistantType = new Long(source.AssistantType);
        }
        if (source.SubnetSet != null) {
            this.SubnetSet = new Subnet[source.SubnetSet.length];
            for (int i = 0; i < source.SubnetSet.length; i++) {
                this.SubnetSet[i] = new Subnet(source.SubnetSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "AssistantType", this.AssistantType);
        this.setParamArrayObj(map, prefix + "SubnetSet.", this.SubnetSet);

    }
}

