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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGatewayInfo extends AbstractModel{

    /**
    * NAT网关ID
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * 网关名称
    */
    @SerializedName("NatName")
    @Expose
    private String NatName;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 网关创建状态，其中0表示创建中，1表示运行中，2表示创建失败
    */
    @SerializedName("ProductionStatus")
    @Expose
    private Long ProductionStatus;

    /**
    * EIP列表
    */
    @SerializedName("Eips")
    @Expose
    private String [] Eips;

    /**
    * 并发连接数规格，取值为1000000, 3000000, 10000000
    */
    @SerializedName("MaxConcurrent")
    @Expose
    private Long MaxConcurrent;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 独占标识，其中0表示共享，1表示独占，默认值为0
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * 转发模式，其中0表示IP方式，1表示网段方式
    */
    @SerializedName("ForwardMode")
    @Expose
    private Long ForwardMode;

    /**
    * 私有网络网段
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 网关类型，取值为 small，middle，big，分别对应小型、中型、大型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 网关启用状态，1为禁用，0为启用。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 私有网络整型ID
    */
    @SerializedName("IntVpcId")
    @Expose
    private Long IntVpcId;

    /**
    * NAT资源ID
    */
    @SerializedName("NatResourceId")
    @Expose
    private Long NatResourceId;

    /**
     * Get NAT网关ID 
     * @return NatId NAT网关ID
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set NAT网关ID
     * @param NatId NAT网关ID
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get 网关名称 
     * @return NatName 网关名称
     */
    public String getNatName() {
        return this.NatName;
    }

    /**
     * Set 网关名称
     * @param NatName 网关名称
     */
    public void setNatName(String NatName) {
        this.NatName = NatName;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络名称 
     * @return VpcName 私有网络名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称
     * @param VpcName 私有网络名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 网关创建状态，其中0表示创建中，1表示运行中，2表示创建失败 
     * @return ProductionStatus 网关创建状态，其中0表示创建中，1表示运行中，2表示创建失败
     */
    public Long getProductionStatus() {
        return this.ProductionStatus;
    }

    /**
     * Set 网关创建状态，其中0表示创建中，1表示运行中，2表示创建失败
     * @param ProductionStatus 网关创建状态，其中0表示创建中，1表示运行中，2表示创建失败
     */
    public void setProductionStatus(Long ProductionStatus) {
        this.ProductionStatus = ProductionStatus;
    }

    /**
     * Get EIP列表 
     * @return Eips EIP列表
     */
    public String [] getEips() {
        return this.Eips;
    }

    /**
     * Set EIP列表
     * @param Eips EIP列表
     */
    public void setEips(String [] Eips) {
        this.Eips = Eips;
    }

    /**
     * Get 并发连接数规格，取值为1000000, 3000000, 10000000 
     * @return MaxConcurrent 并发连接数规格，取值为1000000, 3000000, 10000000
     */
    public Long getMaxConcurrent() {
        return this.MaxConcurrent;
    }

    /**
     * Set 并发连接数规格，取值为1000000, 3000000, 10000000
     * @param MaxConcurrent 并发连接数规格，取值为1000000, 3000000, 10000000
     */
    public void setMaxConcurrent(Long MaxConcurrent) {
        this.MaxConcurrent = MaxConcurrent;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 独占标识，其中0表示共享，1表示独占，默认值为0 
     * @return Exclusive 独占标识，其中0表示共享，1表示独占，默认值为0
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 独占标识，其中0表示共享，1表示独占，默认值为0
     * @param Exclusive 独占标识，其中0表示共享，1表示独占，默认值为0
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get 转发模式，其中0表示IP方式，1表示网段方式 
     * @return ForwardMode 转发模式，其中0表示IP方式，1表示网段方式
     */
    public Long getForwardMode() {
        return this.ForwardMode;
    }

    /**
     * Set 转发模式，其中0表示IP方式，1表示网段方式
     * @param ForwardMode 转发模式，其中0表示IP方式，1表示网段方式
     */
    public void setForwardMode(Long ForwardMode) {
        this.ForwardMode = ForwardMode;
    }

    /**
     * Get 私有网络网段 
     * @return VpcCidrBlock 私有网络网段
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set 私有网络网段
     * @param VpcCidrBlock 私有网络网段
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 网关类型，取值为 small，middle，big，分别对应小型、中型、大型 
     * @return Type 网关类型，取值为 small，middle，big，分别对应小型、中型、大型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 网关类型，取值为 small，middle，big，分别对应小型、中型、大型
     * @param Type 网关类型，取值为 small，middle，big，分别对应小型、中型、大型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 网关启用状态，1为禁用，0为启用。 
     * @return State 网关启用状态，1为禁用，0为启用。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 网关启用状态，1为禁用，0为启用。
     * @param State 网关启用状态，1为禁用，0为启用。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 私有网络整型ID 
     * @return IntVpcId 私有网络整型ID
     */
    public Long getIntVpcId() {
        return this.IntVpcId;
    }

    /**
     * Set 私有网络整型ID
     * @param IntVpcId 私有网络整型ID
     */
    public void setIntVpcId(Long IntVpcId) {
        this.IntVpcId = IntVpcId;
    }

    /**
     * Get NAT资源ID 
     * @return NatResourceId NAT资源ID
     */
    public Long getNatResourceId() {
        return this.NatResourceId;
    }

    /**
     * Set NAT资源ID
     * @param NatResourceId NAT资源ID
     */
    public void setNatResourceId(Long NatResourceId) {
        this.NatResourceId = NatResourceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "NatName", this.NatName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "ProductionStatus", this.ProductionStatus);
        this.setParamArraySimple(map, prefix + "Eips.", this.Eips);
        this.setParamSimple(map, prefix + "MaxConcurrent", this.MaxConcurrent);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "ForwardMode", this.ForwardMode);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "IntVpcId", this.IntVpcId);
        this.setParamSimple(map, prefix + "NatResourceId", this.NatResourceId);

    }
}

