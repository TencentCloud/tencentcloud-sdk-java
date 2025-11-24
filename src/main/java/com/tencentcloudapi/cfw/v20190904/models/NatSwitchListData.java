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

public class NatSwitchListData extends AbstractModel {

    /**
    * 列表ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetCidr")
    @Expose
    private String SubnetCidr;

    /**
    * 关联路由ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * 关联路由名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * 云服务器个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmNum")
    @Expose
    private Long CvmNum;

    /**
    * 所属VPC ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 所属VPC名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 是否生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 开关状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * NAT网关ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * NAT网关名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatName")
    @Expose
    private String NatName;

    /**
    * NAT防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
    * NAT防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatInsName")
    @Expose
    private String NatInsName;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 开关是否异常,0:正常,1:异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Abnormal")
    @Expose
    private Long Abnormal;

    /**
    * nat防火墙出口路由表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ORTableId")
    @Expose
    private String ORTableId;

    /**
    * nat防火墙出口路由表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ORTableName")
    @Expose
    private String ORTableName;

    /**
    * 出口Snat Ip列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ohavips")
    @Expose
    private String [] Ohavips;

    /**
     * Get 列表ID 
     * @return Id 列表ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 列表ID
     * @param Id 列表ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetName 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetName 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetCidr IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetCidr() {
        return this.SubnetCidr;
    }

    /**
     * Set IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetCidr IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetCidr(String SubnetCidr) {
        this.SubnetCidr = SubnetCidr;
    }

    /**
     * Get 关联路由ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteId 关联路由ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 关联路由ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteId 关联路由ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get 关联路由名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteName 关联路由名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set 关联路由名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteName 关联路由名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get 云服务器个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmNum 云服务器个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCvmNum() {
        return this.CvmNum;
    }

    /**
     * Set 云服务器个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmNum 云服务器个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmNum(Long CvmNum) {
        this.CvmNum = CvmNum;
    }

    /**
     * Get 所属VPC ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 所属VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 所属VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 所属VPC名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName 所属VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 所属VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName 所属VPC名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 是否生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 是否生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 是否生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 开关状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get NAT网关ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatId NAT网关ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set NAT网关ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatId NAT网关ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get NAT网关名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatName NAT网关名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatName() {
        return this.NatName;
    }

    /**
     * Set NAT网关名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatName NAT网关名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatName(String NatName) {
        this.NatName = NatName;
    }

    /**
     * Get NAT防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatInsId NAT防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set NAT防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatInsId NAT防火墙实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    /**
     * Get NAT防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatInsName NAT防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatInsName() {
        return this.NatInsName;
    }

    /**
     * Set NAT防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatInsName NAT防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatInsName(String NatInsName) {
        this.NatInsName = NatInsName;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 开关是否异常,0:正常,1:异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Abnormal 开关是否异常,0:正常,1:异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAbnormal() {
        return this.Abnormal;
    }

    /**
     * Set 开关是否异常,0:正常,1:异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param Abnormal 开关是否异常,0:正常,1:异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormal(Long Abnormal) {
        this.Abnormal = Abnormal;
    }

    /**
     * Get nat防火墙出口路由表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ORTableId nat防火墙出口路由表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getORTableId() {
        return this.ORTableId;
    }

    /**
     * Set nat防火墙出口路由表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ORTableId nat防火墙出口路由表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setORTableId(String ORTableId) {
        this.ORTableId = ORTableId;
    }

    /**
     * Get nat防火墙出口路由表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ORTableName nat防火墙出口路由表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getORTableName() {
        return this.ORTableName;
    }

    /**
     * Set nat防火墙出口路由表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ORTableName nat防火墙出口路由表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setORTableName(String ORTableName) {
        this.ORTableName = ORTableName;
    }

    /**
     * Get 出口Snat Ip列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ohavips 出口Snat Ip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOhavips() {
        return this.Ohavips;
    }

    /**
     * Set 出口Snat Ip列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ohavips 出口Snat Ip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOhavips(String [] Ohavips) {
        this.Ohavips = Ohavips;
    }

    public NatSwitchListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatSwitchListData(NatSwitchListData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.SubnetCidr != null) {
            this.SubnetCidr = new String(source.SubnetCidr);
        }
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.CvmNum != null) {
            this.CvmNum = new Long(source.CvmNum);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NatId != null) {
            this.NatId = new String(source.NatId);
        }
        if (source.NatName != null) {
            this.NatName = new String(source.NatName);
        }
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
        if (source.NatInsName != null) {
            this.NatInsName = new String(source.NatInsName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Abnormal != null) {
            this.Abnormal = new Long(source.Abnormal);
        }
        if (source.ORTableId != null) {
            this.ORTableId = new String(source.ORTableId);
        }
        if (source.ORTableName != null) {
            this.ORTableName = new String(source.ORTableName);
        }
        if (source.Ohavips != null) {
            this.Ohavips = new String[source.Ohavips.length];
            for (int i = 0; i < source.Ohavips.length; i++) {
                this.Ohavips[i] = new String(source.Ohavips[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetCidr", this.SubnetCidr);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamSimple(map, prefix + "CvmNum", this.CvmNum);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "NatName", this.NatName);
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);
        this.setParamSimple(map, prefix + "NatInsName", this.NatInsName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Abnormal", this.Abnormal);
        this.setParamSimple(map, prefix + "ORTableId", this.ORTableId);
        this.setParamSimple(map, prefix + "ORTableName", this.ORTableName);
        this.setParamArraySimple(map, prefix + "Ohavips.", this.Ohavips);

    }
}

