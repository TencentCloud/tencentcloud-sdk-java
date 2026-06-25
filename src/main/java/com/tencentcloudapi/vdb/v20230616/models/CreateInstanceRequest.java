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
    * <p>私有网络 ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络 VPC 的子网 ID。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>指定实例计费方式。</p><ul><li>0：按量付费。</li><li>1：包年包月。</li></ul>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>安全组 ID。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>若计费方式为包年包月，指定包年包月续费的时长。</p><ul><li>单位：月。</li><li>取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。</li></ul>
    */
    @SerializedName("PayPeriod")
    @Expose
    private Long PayPeriod;

    /**
    * <p>若为包年包月计费，需指定是否开启自动续费。</p><ul><li>0：不开启自动续费。</li><li>1：开启自动续费。</li></ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>实例额外参数，通过json提交。</p>
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * <p>以数组形式列出标签信息。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>指定实例所属项目 ID。</p>
    */
    @SerializedName("Project")
    @Expose
    private String Project;

    /**
    * <p>产品版本，0-标准版，1-容量增强版</p>
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * <p>实例类型。</p><ul><li>base：免费测试版。</li><li>single：单机版。</li><li>cluster：高可用版。</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例类型为高可用版，需指定可用区选项。</p><ul><li>two：两可用区。</li><li>three：三可用区。</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>购买实例数量。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>网络类型。<br>VPC或TCS</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>实例所应用的参数模板 ID。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>组件具体设置列表。</p>
    */
    @SerializedName("Components")
    @Expose
    private CreateInstancesComponent [] Components;

    /**
    * <p>实例类型为高可用版，通过该参数指定主可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例类型为高可用版，通过该参数指定备可用区。</p>
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * <p>是否长期有效</p>
    */
    @SerializedName("IsNoExpired")
    @Expose
    private Boolean IsNoExpired;

    /**
    * <p>引擎名称，业务自定义。</p>
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * <p>引擎版本，业务自定义。</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>实例描述。</p>
    */
    @SerializedName("Brief")
    @Expose
    private String Brief;

    /**
    * <p>负责人信息。</p>
    */
    @SerializedName("Chief")
    @Expose
    private String Chief;

    /**
    * <p>DBA人员信息</p>
    */
    @SerializedName("DBA")
    @Expose
    private String DBA;

    /**
    * <p>指定实例的节点类型。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">选择节点类型</a>。</p><ul><li>compute：计费型。</li><li>normal：标准型。</li><li>store：存储型。</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。</p><ul><li>计算型： 1、2、4、8、16、24、32。</li><li>标准型： 1、2、4、8、12、16。</li><li>存储型： 1、2、4、6、8。</li></ul>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>指定实例所需的内存大小。单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>指定实例所需配置的节点数量。选择方法，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
    */
    @SerializedName("WorkerNodeNum")
    @Expose
    private Long WorkerNodeNum;

    /**
    * <p>是否开启磁盘数据存储加密（仅 CBS 数据盘生效，需落在 VECTORDB_DISK_ENCRYPT_REGION 白名单地域，默认 false 不开启）</p><p>默认值：true</p>
    */
    @SerializedName("EnableEncryption")
    @Expose
    private Boolean EnableEncryption;

    /**
     * Get <p>私有网络 ID。</p> 
     * @return VpcId <p>私有网络 ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络 ID。</p>
     * @param VpcId <p>私有网络 ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络 VPC 的子网 ID。</p> 
     * @return SubnetId <p>私有网络 VPC 的子网 ID。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络 VPC 的子网 ID。</p>
     * @param SubnetId <p>私有网络 VPC 的子网 ID。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>指定实例计费方式。</p><ul><li>0：按量付费。</li><li>1：包年包月。</li></ul> 
     * @return PayMode <p>指定实例计费方式。</p><ul><li>0：按量付费。</li><li>1：包年包月。</li></ul>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>指定实例计费方式。</p><ul><li>0：按量付费。</li><li>1：包年包月。</li></ul>
     * @param PayMode <p>指定实例计费方式。</p><ul><li>0：按量付费。</li><li>1：包年包月。</li></ul>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。</p> 
     * @return InstanceName <p>设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。</p>
     * @param InstanceName <p>设置实例名称。仅支持长度不超过 60 的中文/英文/数字/-/_。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>安全组 ID。</p> 
     * @return SecurityGroupIds <p>安全组 ID。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组 ID。</p>
     * @param SecurityGroupIds <p>安全组 ID。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>若计费方式为包年包月，指定包年包月续费的时长。</p><ul><li>单位：月。</li><li>取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。</li></ul> 
     * @return PayPeriod <p>若计费方式为包年包月，指定包年包月续费的时长。</p><ul><li>单位：月。</li><li>取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。</li></ul>
     */
    public Long getPayPeriod() {
        return this.PayPeriod;
    }

    /**
     * Set <p>若计费方式为包年包月，指定包年包月续费的时长。</p><ul><li>单位：月。</li><li>取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。</li></ul>
     * @param PayPeriod <p>若计费方式为包年包月，指定包年包月续费的时长。</p><ul><li>单位：月。</li><li>取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。</li></ul>
     */
    public void setPayPeriod(Long PayPeriod) {
        this.PayPeriod = PayPeriod;
    }

    /**
     * Get <p>若为包年包月计费，需指定是否开启自动续费。</p><ul><li>0：不开启自动续费。</li><li>1：开启自动续费。</li></ul> 
     * @return AutoRenew <p>若为包年包月计费，需指定是否开启自动续费。</p><ul><li>0：不开启自动续费。</li><li>1：开启自动续费。</li></ul>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>若为包年包月计费，需指定是否开启自动续费。</p><ul><li>0：不开启自动续费。</li><li>1：开启自动续费。</li></ul>
     * @param AutoRenew <p>若为包年包月计费，需指定是否开启自动续费。</p><ul><li>0：不开启自动续费。</li><li>1：开启自动续费。</li></ul>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>实例额外参数，通过json提交。</p> 
     * @return Params <p>实例额外参数，通过json提交。</p>
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>实例额外参数，通过json提交。</p>
     * @param Params <p>实例额外参数，通过json提交。</p>
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get <p>以数组形式列出标签信息。</p> 
     * @return ResourceTags <p>以数组形式列出标签信息。</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>以数组形式列出标签信息。</p>
     * @param ResourceTags <p>以数组形式列出标签信息。</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>指定实例所属项目 ID。</p> 
     * @return Project <p>指定实例所属项目 ID。</p>
     * @deprecated
     */
    @Deprecated
    public String getProject() {
        return this.Project;
    }

    /**
     * Set <p>指定实例所属项目 ID。</p>
     * @param Project <p>指定实例所属项目 ID。</p>
     * @deprecated
     */
    @Deprecated
    public void setProject(String Project) {
        this.Project = Project;
    }

    /**
     * Get <p>产品版本，0-标准版，1-容量增强版</p> 
     * @return ProductType <p>产品版本，0-标准版，1-容量增强版</p>
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品版本，0-标准版，1-容量增强版</p>
     * @param ProductType <p>产品版本，0-标准版，1-容量增强版</p>
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>实例类型。</p><ul><li>base：免费测试版。</li><li>single：单机版。</li><li>cluster：高可用版。</li></ul> 
     * @return InstanceType <p>实例类型。</p><ul><li>base：免费测试版。</li><li>single：单机版。</li><li>cluster：高可用版。</li></ul>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型。</p><ul><li>base：免费测试版。</li><li>single：单机版。</li><li>cluster：高可用版。</li></ul>
     * @param InstanceType <p>实例类型。</p><ul><li>base：免费测试版。</li><li>single：单机版。</li><li>cluster：高可用版。</li></ul>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例类型为高可用版，需指定可用区选项。</p><ul><li>two：两可用区。</li><li>three：三可用区。</li></ul> 
     * @return Mode <p>实例类型为高可用版，需指定可用区选项。</p><ul><li>two：两可用区。</li><li>three：三可用区。</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>实例类型为高可用版，需指定可用区选项。</p><ul><li>two：两可用区。</li><li>three：三可用区。</li></ul>
     * @param Mode <p>实例类型为高可用版，需指定可用区选项。</p><ul><li>two：两可用区。</li><li>three：三可用区。</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>购买实例数量。</p> 
     * @return GoodsNum <p>购买实例数量。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>购买实例数量。</p>
     * @param GoodsNum <p>购买实例数量。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>网络类型。<br>VPC或TCS</p> 
     * @return NetworkType <p>网络类型。<br>VPC或TCS</p>
     * @deprecated
     */
    @Deprecated
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>网络类型。<br>VPC或TCS</p>
     * @param NetworkType <p>网络类型。<br>VPC或TCS</p>
     * @deprecated
     */
    @Deprecated
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>实例所应用的参数模板 ID。</p> 
     * @return TemplateId <p>实例所应用的参数模板 ID。</p>
     * @deprecated
     */
    @Deprecated
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>实例所应用的参数模板 ID。</p>
     * @param TemplateId <p>实例所应用的参数模板 ID。</p>
     * @deprecated
     */
    @Deprecated
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>组件具体设置列表。</p> 
     * @return Components <p>组件具体设置列表。</p>
     * @deprecated
     */
    @Deprecated
    public CreateInstancesComponent [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>组件具体设置列表。</p>
     * @param Components <p>组件具体设置列表。</p>
     * @deprecated
     */
    @Deprecated
    public void setComponents(CreateInstancesComponent [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>实例类型为高可用版，通过该参数指定主可用区。</p> 
     * @return Zone <p>实例类型为高可用版，通过该参数指定主可用区。</p>
     * @deprecated
     */
    @Deprecated
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例类型为高可用版，通过该参数指定主可用区。</p>
     * @param Zone <p>实例类型为高可用版，通过该参数指定主可用区。</p>
     * @deprecated
     */
    @Deprecated
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例类型为高可用版，通过该参数指定备可用区。</p> 
     * @return SlaveZones <p>实例类型为高可用版，通过该参数指定备可用区。</p>
     * @deprecated
     */
    @Deprecated
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>实例类型为高可用版，通过该参数指定备可用区。</p>
     * @param SlaveZones <p>实例类型为高可用版，通过该参数指定备可用区。</p>
     * @deprecated
     */
    @Deprecated
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>是否长期有效</p> 
     * @return IsNoExpired <p>是否长期有效</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getIsNoExpired() {
        return this.IsNoExpired;
    }

    /**
     * Set <p>是否长期有效</p>
     * @param IsNoExpired <p>是否长期有效</p>
     * @deprecated
     */
    @Deprecated
    public void setIsNoExpired(Boolean IsNoExpired) {
        this.IsNoExpired = IsNoExpired;
    }

    /**
     * Get <p>引擎名称，业务自定义。</p> 
     * @return EngineName <p>引擎名称，业务自定义。</p>
     * @deprecated
     */
    @Deprecated
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set <p>引擎名称，业务自定义。</p>
     * @param EngineName <p>引擎名称，业务自定义。</p>
     * @deprecated
     */
    @Deprecated
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get <p>引擎版本，业务自定义。</p> 
     * @return EngineVersion <p>引擎版本，业务自定义。</p>
     * @deprecated
     */
    @Deprecated
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>引擎版本，业务自定义。</p>
     * @param EngineVersion <p>引擎版本，业务自定义。</p>
     * @deprecated
     */
    @Deprecated
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>实例描述。</p> 
     * @return Brief <p>实例描述。</p>
     * @deprecated
     */
    @Deprecated
    public String getBrief() {
        return this.Brief;
    }

    /**
     * Set <p>实例描述。</p>
     * @param Brief <p>实例描述。</p>
     * @deprecated
     */
    @Deprecated
    public void setBrief(String Brief) {
        this.Brief = Brief;
    }

    /**
     * Get <p>负责人信息。</p> 
     * @return Chief <p>负责人信息。</p>
     * @deprecated
     */
    @Deprecated
    public String getChief() {
        return this.Chief;
    }

    /**
     * Set <p>负责人信息。</p>
     * @param Chief <p>负责人信息。</p>
     * @deprecated
     */
    @Deprecated
    public void setChief(String Chief) {
        this.Chief = Chief;
    }

    /**
     * Get <p>DBA人员信息</p> 
     * @return DBA <p>DBA人员信息</p>
     * @deprecated
     */
    @Deprecated
    public String getDBA() {
        return this.DBA;
    }

    /**
     * Set <p>DBA人员信息</p>
     * @param DBA <p>DBA人员信息</p>
     * @deprecated
     */
    @Deprecated
    public void setDBA(String DBA) {
        this.DBA = DBA;
    }

    /**
     * Get <p>指定实例的节点类型。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">选择节点类型</a>。</p><ul><li>compute：计费型。</li><li>normal：标准型。</li><li>store：存储型。</li></ul> 
     * @return NodeType <p>指定实例的节点类型。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">选择节点类型</a>。</p><ul><li>compute：计费型。</li><li>normal：标准型。</li><li>store：存储型。</li></ul>
     * @deprecated
     */
    @Deprecated
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>指定实例的节点类型。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">选择节点类型</a>。</p><ul><li>compute：计费型。</li><li>normal：标准型。</li><li>store：存储型。</li></ul>
     * @param NodeType <p>指定实例的节点类型。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">选择节点类型</a>。</p><ul><li>compute：计费型。</li><li>normal：标准型。</li><li>store：存储型。</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。</p><ul><li>计算型： 1、2、4、8、16、24、32。</li><li>标准型： 1、2、4、8、12、16。</li><li>存储型： 1、2、4、6、8。</li></ul> 
     * @return Cpu <p>指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。</p><ul><li>计算型： 1、2、4、8、16、24、32。</li><li>标准型： 1、2、4、8、12、16。</li><li>存储型： 1、2、4、6、8。</li></ul>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。</p><ul><li>计算型： 1、2、4、8、16、24、32。</li><li>标准型： 1、2、4、8、12、16。</li><li>存储型： 1、2、4、6、8。</li></ul>
     * @param Cpu <p>指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。</p><ul><li>计算型： 1、2、4、8、16、24、32。</li><li>标准型： 1、2、4、8、12、16。</li><li>存储型： 1、2、4、6、8。</li></ul>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>指定实例所需的内存大小。单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p> 
     * @return Memory <p>指定实例所需的内存大小。单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>指定实例所需的内存大小。单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     * @param Memory <p>指定实例所需的内存大小。单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p> 
     * @return DiskSize <p>指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     * @param DiskSize <p>指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>指定实例所需配置的节点数量。选择方法，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p> 
     * @return WorkerNodeNum <p>指定实例所需配置的节点数量。选择方法，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     */
    public Long getWorkerNodeNum() {
        return this.WorkerNodeNum;
    }

    /**
     * Set <p>指定实例所需配置的节点数量。选择方法，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     * @param WorkerNodeNum <p>指定实例所需配置的节点数量。选择方法，请参见<a href="https://cloud.tencent.com/document/product/1709/113399">配置规格（选型）</a>。</p>
     */
    public void setWorkerNodeNum(Long WorkerNodeNum) {
        this.WorkerNodeNum = WorkerNodeNum;
    }

    /**
     * Get <p>是否开启磁盘数据存储加密（仅 CBS 数据盘生效，需落在 VECTORDB_DISK_ENCRYPT_REGION 白名单地域，默认 false 不开启）</p><p>默认值：true</p> 
     * @return EnableEncryption <p>是否开启磁盘数据存储加密（仅 CBS 数据盘生效，需落在 VECTORDB_DISK_ENCRYPT_REGION 白名单地域，默认 false 不开启）</p><p>默认值：true</p>
     */
    public Boolean getEnableEncryption() {
        return this.EnableEncryption;
    }

    /**
     * Set <p>是否开启磁盘数据存储加密（仅 CBS 数据盘生效，需落在 VECTORDB_DISK_ENCRYPT_REGION 白名单地域，默认 false 不开启）</p><p>默认值：true</p>
     * @param EnableEncryption <p>是否开启磁盘数据存储加密（仅 CBS 数据盘生效，需落在 VECTORDB_DISK_ENCRYPT_REGION 白名单地域，默认 false 不开启）</p><p>默认值：true</p>
     */
    public void setEnableEncryption(Boolean EnableEncryption) {
        this.EnableEncryption = EnableEncryption;
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
        if (source.EnableEncryption != null) {
            this.EnableEncryption = new Boolean(source.EnableEncryption);
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
        this.setParamSimple(map, prefix + "EnableEncryption", this.EnableEncryption);

    }
}

