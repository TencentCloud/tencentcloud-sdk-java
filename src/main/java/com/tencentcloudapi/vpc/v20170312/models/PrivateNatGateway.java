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

public class PrivateNatGateway extends AbstractModel {

    /**
    * 私网网关`ID`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 私网网关名称。
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * 私网网关关联`VPC`实例`ID`。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私网网关当前状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 私网网关跨域标志。
    */
    @SerializedName("CrossDomain")
    @Expose
    private Boolean CrossDomain;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 专线网关唯一`ID`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectConnectGatewayIds")
    @Expose
    private String [] DirectConnectGatewayIds;

    /**
    * 私网网关类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatType")
    @Expose
    private String NatType;

    /**
    * 私网NAT跨域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossDomainInfo")
    @Expose
    private PrivateNatCrossDomainInfo CrossDomainInfo;

    /**
    * 是否VPC型私网网关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcType")
    @Expose
    private Boolean VpcType;

    /**
    * 跨域私网NAT关联的云联网ID	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
     * Get 私网网关`ID`。 
     * @return NatGatewayId 私网网关`ID`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set 私网网关`ID`。
     * @param NatGatewayId 私网网关`ID`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 私网网关名称。 
     * @return NatGatewayName 私网网关名称。
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set 私网网关名称。
     * @param NatGatewayName 私网网关名称。
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get 私网网关关联`VPC`实例`ID`。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私网网关关联`VPC`实例`ID`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私网网关关联`VPC`实例`ID`。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私网网关关联`VPC`实例`ID`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私网网关当前状态。 
     * @return Status 私网网关当前状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 私网网关当前状态。
     * @param Status 私网网关当前状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 私网网关跨域标志。 
     * @return CrossDomain 私网网关跨域标志。
     */
    public Boolean getCrossDomain() {
        return this.CrossDomain;
    }

    /**
     * Set 私网网关跨域标志。
     * @param CrossDomain 私网网关跨域标志。
     */
    public void setCrossDomain(Boolean CrossDomain) {
        this.CrossDomain = CrossDomain;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签键值对。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 专线网关唯一`ID`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectConnectGatewayIds 专线网关唯一`ID`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDirectConnectGatewayIds() {
        return this.DirectConnectGatewayIds;
    }

    /**
     * Set 专线网关唯一`ID`
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectConnectGatewayIds 专线网关唯一`ID`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectConnectGatewayIds(String [] DirectConnectGatewayIds) {
        this.DirectConnectGatewayIds = DirectConnectGatewayIds;
    }

    /**
     * Get 私网网关类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatType 私网网关类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatType() {
        return this.NatType;
    }

    /**
     * Set 私网网关类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatType 私网网关类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatType(String NatType) {
        this.NatType = NatType;
    }

    /**
     * Get 私网NAT跨域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossDomainInfo 私网NAT跨域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivateNatCrossDomainInfo getCrossDomainInfo() {
        return this.CrossDomainInfo;
    }

    /**
     * Set 私网NAT跨域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossDomainInfo 私网NAT跨域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossDomainInfo(PrivateNatCrossDomainInfo CrossDomainInfo) {
        this.CrossDomainInfo = CrossDomainInfo;
    }

    /**
     * Get 是否VPC型私网网关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcType 是否VPC型私网网关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVpcType() {
        return this.VpcType;
    }

    /**
     * Set 是否VPC型私网网关
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcType 是否VPC型私网网关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcType(Boolean VpcType) {
        this.VpcType = VpcType;
    }

    /**
     * Get 跨域私网NAT关联的云联网ID	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId 跨域私网NAT关联的云联网ID	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 跨域私网NAT关联的云联网ID	
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId 跨域私网NAT关联的云联网ID	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    public PrivateNatGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateNatGateway(PrivateNatGateway source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.NatGatewayName != null) {
            this.NatGatewayName = new String(source.NatGatewayName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CrossDomain != null) {
            this.CrossDomain = new Boolean(source.CrossDomain);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.DirectConnectGatewayIds != null) {
            this.DirectConnectGatewayIds = new String[source.DirectConnectGatewayIds.length];
            for (int i = 0; i < source.DirectConnectGatewayIds.length; i++) {
                this.DirectConnectGatewayIds[i] = new String(source.DirectConnectGatewayIds[i]);
            }
        }
        if (source.NatType != null) {
            this.NatType = new String(source.NatType);
        }
        if (source.CrossDomainInfo != null) {
            this.CrossDomainInfo = new PrivateNatCrossDomainInfo(source.CrossDomainInfo);
        }
        if (source.VpcType != null) {
            this.VpcType = new Boolean(source.VpcType);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CrossDomain", this.CrossDomain);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArraySimple(map, prefix + "DirectConnectGatewayIds.", this.DirectConnectGatewayIds);
        this.setParamSimple(map, prefix + "NatType", this.NatType);
        this.setParamObj(map, prefix + "CrossDomainInfo.", this.CrossDomainInfo);
        this.setParamSimple(map, prefix + "VpcType", this.VpcType);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);

    }
}

