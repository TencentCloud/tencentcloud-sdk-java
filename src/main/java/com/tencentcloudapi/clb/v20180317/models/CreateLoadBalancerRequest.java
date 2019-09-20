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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest  extends AbstractModel{

    /**
    * 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1
    */
    @SerializedName("Forward")
    @Expose
    private Integer Forward;

    /**
    * 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 DescribeVpcEx 接口获取。 不传此参数则默认为基础网络（"0"）。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其它情况不支持该参数。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不传此参数则视为默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 仅适用于公网负载均衡。IP版本，IPV4 | IPV6，默认值 IPV4。
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * 创建负载均衡的个数，默认值 1。
    */
    @SerializedName("Number")
    @Expose
    private Integer Number;

    /**
    * 仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 DescribeMasterZones 接口查询一个地域的主可用区的列表。
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * 仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 仅适用于公网负载均衡。Anycast的发布域，可取 ZONE_A 或 ZONE_B。仅带宽非上移用户支持此参数。
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
    * 仅适用于公网负载均衡。负载均衡的网络计费方式，此参数仅对带宽上移用户生效。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 购买负载均衡同时，给负载均衡打上标签
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * 获取负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * 设置负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * 获取负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1
     * @return Forward 负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1
     */
    public Integer getForward() {
        return this.Forward;
    }

    /**
     * 设置负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1
     * @param Forward 负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1
     */
    public void setForward(Integer Forward) {
        this.Forward = Forward;
    }

    /**
     * 获取负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     * @return LoadBalancerName 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * 设置负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     * @param LoadBalancerName 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * 获取负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 DescribeVpcEx 接口获取。 不传此参数则默认为基础网络（"0"）。
     * @return VpcId 负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 DescribeVpcEx 接口获取。 不传此参数则默认为基础网络（"0"）。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 DescribeVpcEx 接口获取。 不传此参数则默认为基础网络（"0"）。
     * @param VpcId 负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 DescribeVpcEx 接口获取。 不传此参数则默认为基础网络（"0"）。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其它情况不支持该参数。
     * @return SubnetId 在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其它情况不支持该参数。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其它情况不支持该参数。
     * @param SubnetId 在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其它情况不支持该参数。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不传此参数则视为默认项目。
     * @return ProjectId 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不传此参数则视为默认项目。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不传此参数则视为默认项目。
     * @param ProjectId 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不传此参数则视为默认项目。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取仅适用于公网负载均衡。IP版本，IPV4 | IPV6，默认值 IPV4。
     * @return AddressIPVersion 仅适用于公网负载均衡。IP版本，IPV4 | IPV6，默认值 IPV4。
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * 设置仅适用于公网负载均衡。IP版本，IPV4 | IPV6，默认值 IPV4。
     * @param AddressIPVersion 仅适用于公网负载均衡。IP版本，IPV4 | IPV6，默认值 IPV4。
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * 获取创建负载均衡的个数，默认值 1。
     * @return Number 创建负载均衡的个数，默认值 1。
     */
    public Integer getNumber() {
        return this.Number;
    }

    /**
     * 设置创建负载均衡的个数，默认值 1。
     * @param Number 创建负载均衡的个数，默认值 1。
     */
    public void setNumber(Integer Number) {
        this.Number = Number;
    }

    /**
     * 获取仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 DescribeMasterZones 接口查询一个地域的主可用区的列表。
     * @return MasterZoneId 仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 DescribeMasterZones 接口查询一个地域的主可用区的列表。
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * 设置仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 DescribeMasterZones 接口查询一个地域的主可用区的列表。
     * @param MasterZoneId 仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 DescribeMasterZones 接口查询一个地域的主可用区的列表。
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * 获取仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1
     * @return ZoneId 仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1
     * @param ZoneId 仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取仅适用于公网负载均衡。Anycast的发布域，可取 ZONE_A 或 ZONE_B。仅带宽非上移用户支持此参数。
     * @return AnycastZone 仅适用于公网负载均衡。Anycast的发布域，可取 ZONE_A 或 ZONE_B。仅带宽非上移用户支持此参数。
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * 设置仅适用于公网负载均衡。Anycast的发布域，可取 ZONE_A 或 ZONE_B。仅带宽非上移用户支持此参数。
     * @param AnycastZone 仅适用于公网负载均衡。Anycast的发布域，可取 ZONE_A 或 ZONE_B。仅带宽非上移用户支持此参数。
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * 获取仅适用于公网负载均衡。负载均衡的网络计费方式，此参数仅对带宽上移用户生效。
     * @return InternetAccessible 仅适用于公网负载均衡。负载均衡的网络计费方式，此参数仅对带宽上移用户生效。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * 设置仅适用于公网负载均衡。负载均衡的网络计费方式，此参数仅对带宽上移用户生效。
     * @param InternetAccessible 仅适用于公网负载均衡。负载均衡的网络计费方式，此参数仅对带宽上移用户生效。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * 获取购买负载均衡同时，给负载均衡打上标签
     * @return Tags 购买负载均衡同时，给负载均衡打上标签
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * 设置购买负载均衡同时，给负载均衡打上标签
     * @param Tags 购买负载均衡同时，给负载均衡打上标签
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AnycastZone", this.AnycastZone);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

