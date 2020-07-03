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

public class CreateNatGatewayRequest extends AbstractModel{

    /**
    * 转发模式，其中0表示IP方式，1表示网段方式；通过cidr方式可支持更多的IP接入到NAT网关
    */
    @SerializedName("ForwardMode")
    @Expose
    private String ForwardMode;

    /**
    * 私有网络ID，例如：vpc-kd7d06of
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * NAT名称
    */
    @SerializedName("NatName")
    @Expose
    private String NatName;

    /**
    * 并发连接数规格；取值为1000000、3000000、10000000，分别对应小型、中型、大型NAT网关
    */
    @SerializedName("MaxConcurrent")
    @Expose
    private Long MaxConcurrent;

    /**
    * 子网ID列表，子网下全部IP将加入NAT，不区分网关转发方式
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 部分IP信息，子网下只有该部分IP将加入NAT，仅当网关转发模式为IP方式有效；IpInfoSet和SubnetIds中的子网ID不能同时存在
    */
    @SerializedName("IpInfoSet")
    @Expose
    private IpInfo [] IpInfoSet;

    /**
    * 已分配的EIP列表, AssignedEips和AutoAllocEipNum至少输入一个
    */
    @SerializedName("AssignedEips")
    @Expose
    private String [] AssignedEips;

    /**
    * 新建EIP数目，系统将会按您的要求生产该数目个数EIP, AssignedEips和AutoAllocEipNum至少输入一个
    */
    @SerializedName("AutoAllocEipNum")
    @Expose
    private Long AutoAllocEipNum;

    /**
    * 独占标识，取值为0和1，默认值为0；0和1分别表示创建共享型NAT网关和独占NAT型网关；由于同一个VPC网络内，指向NAT集群的默认路由只有一条，因此VPC内只能创建一种类型NAT网关；创建独占型NAT网关时，需联系对应架构师进行独占NAT集群搭建，否则无法创建独占型NAT网关。
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
     * Get 转发模式，其中0表示IP方式，1表示网段方式；通过cidr方式可支持更多的IP接入到NAT网关 
     * @return ForwardMode 转发模式，其中0表示IP方式，1表示网段方式；通过cidr方式可支持更多的IP接入到NAT网关
     */
    public String getForwardMode() {
        return this.ForwardMode;
    }

    /**
     * Set 转发模式，其中0表示IP方式，1表示网段方式；通过cidr方式可支持更多的IP接入到NAT网关
     * @param ForwardMode 转发模式，其中0表示IP方式，1表示网段方式；通过cidr方式可支持更多的IP接入到NAT网关
     */
    public void setForwardMode(String ForwardMode) {
        this.ForwardMode = ForwardMode;
    }

    /**
     * Get 私有网络ID，例如：vpc-kd7d06of 
     * @return VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，例如：vpc-kd7d06of
     * @param VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get NAT名称 
     * @return NatName NAT名称
     */
    public String getNatName() {
        return this.NatName;
    }

    /**
     * Set NAT名称
     * @param NatName NAT名称
     */
    public void setNatName(String NatName) {
        this.NatName = NatName;
    }

    /**
     * Get 并发连接数规格；取值为1000000、3000000、10000000，分别对应小型、中型、大型NAT网关 
     * @return MaxConcurrent 并发连接数规格；取值为1000000、3000000、10000000，分别对应小型、中型、大型NAT网关
     */
    public Long getMaxConcurrent() {
        return this.MaxConcurrent;
    }

    /**
     * Set 并发连接数规格；取值为1000000、3000000、10000000，分别对应小型、中型、大型NAT网关
     * @param MaxConcurrent 并发连接数规格；取值为1000000、3000000、10000000，分别对应小型、中型、大型NAT网关
     */
    public void setMaxConcurrent(Long MaxConcurrent) {
        this.MaxConcurrent = MaxConcurrent;
    }

    /**
     * Get 子网ID列表，子网下全部IP将加入NAT，不区分网关转发方式 
     * @return SubnetIds 子网ID列表，子网下全部IP将加入NAT，不区分网关转发方式
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID列表，子网下全部IP将加入NAT，不区分网关转发方式
     * @param SubnetIds 子网ID列表，子网下全部IP将加入NAT，不区分网关转发方式
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 部分IP信息，子网下只有该部分IP将加入NAT，仅当网关转发模式为IP方式有效；IpInfoSet和SubnetIds中的子网ID不能同时存在 
     * @return IpInfoSet 部分IP信息，子网下只有该部分IP将加入NAT，仅当网关转发模式为IP方式有效；IpInfoSet和SubnetIds中的子网ID不能同时存在
     */
    public IpInfo [] getIpInfoSet() {
        return this.IpInfoSet;
    }

    /**
     * Set 部分IP信息，子网下只有该部分IP将加入NAT，仅当网关转发模式为IP方式有效；IpInfoSet和SubnetIds中的子网ID不能同时存在
     * @param IpInfoSet 部分IP信息，子网下只有该部分IP将加入NAT，仅当网关转发模式为IP方式有效；IpInfoSet和SubnetIds中的子网ID不能同时存在
     */
    public void setIpInfoSet(IpInfo [] IpInfoSet) {
        this.IpInfoSet = IpInfoSet;
    }

    /**
     * Get 已分配的EIP列表, AssignedEips和AutoAllocEipNum至少输入一个 
     * @return AssignedEips 已分配的EIP列表, AssignedEips和AutoAllocEipNum至少输入一个
     */
    public String [] getAssignedEips() {
        return this.AssignedEips;
    }

    /**
     * Set 已分配的EIP列表, AssignedEips和AutoAllocEipNum至少输入一个
     * @param AssignedEips 已分配的EIP列表, AssignedEips和AutoAllocEipNum至少输入一个
     */
    public void setAssignedEips(String [] AssignedEips) {
        this.AssignedEips = AssignedEips;
    }

    /**
     * Get 新建EIP数目，系统将会按您的要求生产该数目个数EIP, AssignedEips和AutoAllocEipNum至少输入一个 
     * @return AutoAllocEipNum 新建EIP数目，系统将会按您的要求生产该数目个数EIP, AssignedEips和AutoAllocEipNum至少输入一个
     */
    public Long getAutoAllocEipNum() {
        return this.AutoAllocEipNum;
    }

    /**
     * Set 新建EIP数目，系统将会按您的要求生产该数目个数EIP, AssignedEips和AutoAllocEipNum至少输入一个
     * @param AutoAllocEipNum 新建EIP数目，系统将会按您的要求生产该数目个数EIP, AssignedEips和AutoAllocEipNum至少输入一个
     */
    public void setAutoAllocEipNum(Long AutoAllocEipNum) {
        this.AutoAllocEipNum = AutoAllocEipNum;
    }

    /**
     * Get 独占标识，取值为0和1，默认值为0；0和1分别表示创建共享型NAT网关和独占NAT型网关；由于同一个VPC网络内，指向NAT集群的默认路由只有一条，因此VPC内只能创建一种类型NAT网关；创建独占型NAT网关时，需联系对应架构师进行独占NAT集群搭建，否则无法创建独占型NAT网关。 
     * @return Exclusive 独占标识，取值为0和1，默认值为0；0和1分别表示创建共享型NAT网关和独占NAT型网关；由于同一个VPC网络内，指向NAT集群的默认路由只有一条，因此VPC内只能创建一种类型NAT网关；创建独占型NAT网关时，需联系对应架构师进行独占NAT集群搭建，否则无法创建独占型NAT网关。
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 独占标识，取值为0和1，默认值为0；0和1分别表示创建共享型NAT网关和独占NAT型网关；由于同一个VPC网络内，指向NAT集群的默认路由只有一条，因此VPC内只能创建一种类型NAT网关；创建独占型NAT网关时，需联系对应架构师进行独占NAT集群搭建，否则无法创建独占型NAT网关。
     * @param Exclusive 独占标识，取值为0和1，默认值为0；0和1分别表示创建共享型NAT网关和独占NAT型网关；由于同一个VPC网络内，指向NAT集群的默认路由只有一条，因此VPC内只能创建一种类型NAT网关；创建独占型NAT网关时，需联系对应架构师进行独占NAT集群搭建，否则无法创建独占型NAT网关。
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ForwardMode", this.ForwardMode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NatName", this.NatName);
        this.setParamSimple(map, prefix + "MaxConcurrent", this.MaxConcurrent);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArrayObj(map, prefix + "IpInfoSet.", this.IpInfoSet);
        this.setParamArraySimple(map, prefix + "AssignedEips.", this.AssignedEips);
        this.setParamSimple(map, prefix + "AutoAllocEipNum", this.AutoAllocEipNum);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);

    }
}

