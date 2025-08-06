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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * 私有网络 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络 VPC 的子网 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 安全组 ID。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。
    */
    @SerializedName("PayPeriod")
    @Expose
    private Long PayPeriod;

    /**
    * 若为包年包月计费，需指定是否开启自动续费。
- 0：不开启自动续费。
- 1：开启自动续费。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 实例额外参数，通过json提交。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 以数组形式列出标签信息。
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * 指定实例所属项目 ID。
    */
    @SerializedName("Project")
    @Expose
    private String Project;

    /**
    * 产品版本，0-标准版，1-容量增强版
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 购买实例数量。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 网络类型。
VPC或TCS
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 实例所应用的参数模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 组件具体设置列表。
    */
    @SerializedName("Components")
    @Expose
    private CreateInstancesComponent [] Components;

    /**
    * 实例类型为高可用版，通过该参数指定主可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例类型为高可用版，通过该参数指定备可用区。
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * 是否长期有效
    */
    @SerializedName("IsNoExpired")
    @Expose
    private Boolean IsNoExpired;

    /**
    * 引擎名称，业务自定义。
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 引擎版本，业务自定义。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 实例描述。
    */
    @SerializedName("Brief")
    @Expose
    private String Brief;

    /**
    * 负责人信息。
    */
    @SerializedName("Chief")
    @Expose
    private String Chief;

    /**
    * DBA人员信息
    */
    @SerializedName("DBA")
    @Expose
    private String DBA;

    /**
    * 指定实例的节点类型。具体信息，请参见[选择节点类型](https://cloud.tencent.com/document/product/1709/113399)。
- compute：计费型。
- normal：标准型。
- store：存储型。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
    */
    @SerializedName("WorkerNodeNum")
    @Expose
    private Long WorkerNodeNum;

    /**
     * Get 私有网络 ID。 
     * @return VpcId 私有网络 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 ID。
     * @param VpcId 私有网络 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络 VPC 的子网 ID。 
     * @return SubnetId 私有网络 VPC 的子网 ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络 VPC 的子网 ID。
     * @param SubnetId 私有网络 VPC 的子网 ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。 
     * @return PayMode 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。
     * @param PayMode 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。 
     * @return InstanceName 设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。
     * @param InstanceName 设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 安全组 ID。 
     * @return SecurityGroupIds 安全组 ID。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组 ID。
     * @param SecurityGroupIds 安全组 ID。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。 
     * @return PayPeriod 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。
     */
    public Long getPayPeriod() {
        return this.PayPeriod;
    }

    /**
     * Set 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。
     * @param PayPeriod 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。
     */
    public void setPayPeriod(Long PayPeriod) {
        this.PayPeriod = PayPeriod;
    }

    /**
     * Get 若为包年包月计费，需指定是否开启自动续费。
- 0：不开启自动续费。
- 1：开启自动续费。 
     * @return AutoRenew 若为包年包月计费，需指定是否开启自动续费。
- 0：不开启自动续费。
- 1：开启自动续费。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 若为包年包月计费，需指定是否开启自动续费。
- 0：不开启自动续费。
- 1：开启自动续费。
     * @param AutoRenew 若为包年包月计费，需指定是否开启自动续费。
- 0：不开启自动续费。
- 1：开启自动续费。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 实例额外参数，通过json提交。 
     * @return Params 实例额外参数，通过json提交。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 实例额外参数，通过json提交。
     * @param Params 实例额外参数，通过json提交。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 以数组形式列出标签信息。 
     * @return ResourceTags 以数组形式列出标签信息。
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 以数组形式列出标签信息。
     * @param ResourceTags 以数组形式列出标签信息。
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 指定实例所属项目 ID。 
     * @return Project 指定实例所属项目 ID。
     * @deprecated
     */
    @Deprecated
    public String getProject() {
        return this.Project;
    }

    /**
     * Set 指定实例所属项目 ID。
     * @param Project 指定实例所属项目 ID。
     * @deprecated
     */
    @Deprecated
    public void setProject(String Project) {
        this.Project = Project;
    }

    /**
     * Get 产品版本，0-标准版，1-容量增强版 
     * @return ProductType 产品版本，0-标准版，1-容量增强版
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品版本，0-标准版，1-容量增强版
     * @param ProductType 产品版本，0-标准版，1-容量增强版
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。 
     * @return InstanceType 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。
     * @param InstanceType 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。 
     * @return Mode 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。
     * @param Mode 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 购买实例数量。 
     * @return GoodsNum 购买实例数量。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 购买实例数量。
     * @param GoodsNum 购买实例数量。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 网络类型。
VPC或TCS 
     * @return NetworkType 网络类型。
VPC或TCS
     * @deprecated
     */
    @Deprecated
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型。
VPC或TCS
     * @param NetworkType 网络类型。
VPC或TCS
     * @deprecated
     */
    @Deprecated
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 实例所应用的参数模板 ID。 
     * @return TemplateId 实例所应用的参数模板 ID。
     * @deprecated
     */
    @Deprecated
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 实例所应用的参数模板 ID。
     * @param TemplateId 实例所应用的参数模板 ID。
     * @deprecated
     */
    @Deprecated
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 组件具体设置列表。 
     * @return Components 组件具体设置列表。
     * @deprecated
     */
    @Deprecated
    public CreateInstancesComponent [] getComponents() {
        return this.Components;
    }

    /**
     * Set 组件具体设置列表。
     * @param Components 组件具体设置列表。
     * @deprecated
     */
    @Deprecated
    public void setComponents(CreateInstancesComponent [] Components) {
        this.Components = Components;
    }

    /**
     * Get 实例类型为高可用版，通过该参数指定主可用区。 
     * @return Zone 实例类型为高可用版，通过该参数指定主可用区。
     * @deprecated
     */
    @Deprecated
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例类型为高可用版，通过该参数指定主可用区。
     * @param Zone 实例类型为高可用版，通过该参数指定主可用区。
     * @deprecated
     */
    @Deprecated
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例类型为高可用版，通过该参数指定备可用区。 
     * @return SlaveZones 实例类型为高可用版，通过该参数指定备可用区。
     * @deprecated
     */
    @Deprecated
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set 实例类型为高可用版，通过该参数指定备可用区。
     * @param SlaveZones 实例类型为高可用版，通过该参数指定备可用区。
     * @deprecated
     */
    @Deprecated
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get 是否长期有效 
     * @return IsNoExpired 是否长期有效
     * @deprecated
     */
    @Deprecated
    public Boolean getIsNoExpired() {
        return this.IsNoExpired;
    }

    /**
     * Set 是否长期有效
     * @param IsNoExpired 是否长期有效
     * @deprecated
     */
    @Deprecated
    public void setIsNoExpired(Boolean IsNoExpired) {
        this.IsNoExpired = IsNoExpired;
    }

    /**
     * Get 引擎名称，业务自定义。 
     * @return EngineName 引擎名称，业务自定义。
     * @deprecated
     */
    @Deprecated
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 引擎名称，业务自定义。
     * @param EngineName 引擎名称，业务自定义。
     * @deprecated
     */
    @Deprecated
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 引擎版本，业务自定义。 
     * @return EngineVersion 引擎版本，业务自定义。
     * @deprecated
     */
    @Deprecated
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 引擎版本，业务自定义。
     * @param EngineVersion 引擎版本，业务自定义。
     * @deprecated
     */
    @Deprecated
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 实例描述。 
     * @return Brief 实例描述。
     * @deprecated
     */
    @Deprecated
    public String getBrief() {
        return this.Brief;
    }

    /**
     * Set 实例描述。
     * @param Brief 实例描述。
     * @deprecated
     */
    @Deprecated
    public void setBrief(String Brief) {
        this.Brief = Brief;
    }

    /**
     * Get 负责人信息。 
     * @return Chief 负责人信息。
     * @deprecated
     */
    @Deprecated
    public String getChief() {
        return this.Chief;
    }

    /**
     * Set 负责人信息。
     * @param Chief 负责人信息。
     * @deprecated
     */
    @Deprecated
    public void setChief(String Chief) {
        this.Chief = Chief;
    }

    /**
     * Get DBA人员信息 
     * @return DBA DBA人员信息
     * @deprecated
     */
    @Deprecated
    public String getDBA() {
        return this.DBA;
    }

    /**
     * Set DBA人员信息
     * @param DBA DBA人员信息
     * @deprecated
     */
    @Deprecated
    public void setDBA(String DBA) {
        this.DBA = DBA;
    }

    /**
     * Get 指定实例的节点类型。具体信息，请参见[选择节点类型](https://cloud.tencent.com/document/product/1709/113399)。
- compute：计费型。
- normal：标准型。
- store：存储型。 
     * @return NodeType 指定实例的节点类型。具体信息，请参见[选择节点类型](https://cloud.tencent.com/document/product/1709/113399)。
- compute：计费型。
- normal：标准型。
- store：存储型。
     * @deprecated
     */
    @Deprecated
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 指定实例的节点类型。具体信息，请参见[选择节点类型](https://cloud.tencent.com/document/product/1709/113399)。
- compute：计费型。
- normal：标准型。
- store：存储型。
     * @param NodeType 指定实例的节点类型。具体信息，请参见[选择节点类型](https://cloud.tencent.com/document/product/1709/113399)。
- compute：计费型。
- normal：标准型。
- store：存储型。
     * @deprecated
     */
    @Deprecated
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。 
     * @return Cpu 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。
     * @param Cpu 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。 
     * @return Memory 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     * @param Memory 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。 
     * @return DiskSize 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     * @param DiskSize 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。 
     * @return WorkerNodeNum 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public Long getWorkerNodeNum() {
        return this.WorkerNodeNum;
    }

    /**
     * Set 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     * @param WorkerNodeNum 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public void setWorkerNodeNum(Long WorkerNodeNum) {
        this.WorkerNodeNum = WorkerNodeNum;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.PayPeriod != null) {
            this.PayPeriod = new Long(source.PayPeriod);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new String(source.Project);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Components != null) {
            this.Components = new CreateInstancesComponent[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new CreateInstancesComponent(source.Components[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new String[source.SlaveZones.length];
            for (int i = 0; i < source.SlaveZones.length; i++) {
                this.SlaveZones[i] = new String(source.SlaveZones[i]);
            }
        }
        if (source.IsNoExpired != null) {
            this.IsNoExpired = new Boolean(source.IsNoExpired);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Brief != null) {
            this.Brief = new String(source.Brief);
        }
        if (source.Chief != null) {
            this.Chief = new String(source.Chief);
        }
        if (source.DBA != null) {
            this.DBA = new String(source.DBA);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.WorkerNodeNum != null) {
            this.WorkerNodeNum = new Long(source.WorkerNodeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "PayPeriod", this.PayPeriod);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamSimple(map, prefix + "IsNoExpired", this.IsNoExpired);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Brief", this.Brief);
        this.setParamSimple(map, prefix + "Chief", this.Chief);
        this.setParamSimple(map, prefix + "DBA", this.DBA);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "WorkerNodeNum", this.WorkerNodeNum);

    }
}

