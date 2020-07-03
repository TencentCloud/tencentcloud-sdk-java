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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel{

    /**
    * 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li>
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * 节点资源的规格。
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li>
    */
    @SerializedName("SupportHA")
    @Expose
    private Long SupportHA;

    /**
    * 实例名称。
<li>长度限制为6-36个字符。</li>
<li>只允许包含中文、字母、数字、-、_。</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。
<li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li>
<li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 开启COS访问需要设置的参数。
    */
    @SerializedName("COSSettings")
    @Expose
    private COSSettings COSSettings;

    /**
    * 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * 引导操作脚本设置。
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * 包年包月实例是否自动续费。取值范围：
<li>0：表示不自动续费。</li>
<li>1：表示自动续费。</li>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 客户端Token。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 是否开启集群Master节点公网。取值范围：
<li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li>
<li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
    */
    @SerializedName("NeedMasterWan")
    @Expose
    private String NeedMasterWan;

    /**
    * 是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。
    */
    @SerializedName("RemoteLoginAtCreate")
    @Expose
    private Long RemoteLoginAtCreate;

    /**
    * 是否开启安全集群。0表示不开启，非0表示开启。
    */
    @SerializedName("CheckSecurity")
    @Expose
    private Long CheckSecurity;

    /**
    * 访问外部文件系统。
    */
    @SerializedName("ExtendFsField")
    @Expose
    private String ExtendFsField;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 分散置放群组ID列表，当前只支持指定一个。
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * 集群维度CBS加密盘，默认0表示不加密，1表示加密
    */
    @SerializedName("CbsEncrypt")
    @Expose
    private Long CbsEncrypt;

    /**
    * hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * EMR-MetaDB实例
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * 自定义MetaDB信息
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
     * Get 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li> 
     * @return ProductId 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li>
     * @param ProductId 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。 
     * @return VPCSettings 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     * @param VPCSettings 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li> 
     * @return Software 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li>
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li>
     * @param Software 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li>
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get 节点资源的规格。 
     * @return ResourceSpec 节点资源的规格。
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set 节点资源的规格。
     * @param ResourceSpec 节点资源的规格。
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li> 
     * @return SupportHA 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li>
     */
    public Long getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li>
     * @param SupportHA 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li>
     */
    public void setSupportHA(Long SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get 实例名称。
<li>长度限制为6-36个字符。</li>
<li>只允许包含中文、字母、数字、-、_。</li> 
     * @return InstanceName 实例名称。
<li>长度限制为6-36个字符。</li>
<li>只允许包含中文、字母、数字、-、_。</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
<li>长度限制为6-36个字符。</li>
<li>只允许包含中文、字母、数字、-、_。</li>
     * @param InstanceName 实例名称。
<li>长度限制为6-36个字符。</li>
<li>只允许包含中文、字母、数字、-、_。</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li> 
     * @return PayMode 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     * @param PayMode 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。 
     * @return Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     * @param Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li> 
     * @return TimeSpan 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     * @param TimeSpan 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li> 
     * @return TimeUnit 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     * @param TimeUnit 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。
<li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li>
<li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li> 
     * @return LoginSettings 实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。
<li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li>
<li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。
<li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li>
<li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     * @param LoginSettings 实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。
<li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li>
<li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 开启COS访问需要设置的参数。 
     * @return COSSettings 开启COS访问需要设置的参数。
     */
    public COSSettings getCOSSettings() {
        return this.COSSettings;
    }

    /**
     * Set 开启COS访问需要设置的参数。
     * @param COSSettings 开启COS访问需要设置的参数。
     */
    public void setCOSSettings(COSSettings COSSettings) {
        this.COSSettings = COSSettings;
    }

    /**
     * Get 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。 
     * @return SgId 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。
     * @param SgId 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get 引导操作脚本设置。 
     * @return PreExecutedFileSettings 引导操作脚本设置。
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set 引导操作脚本设置。
     * @param PreExecutedFileSettings 引导操作脚本设置。
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * Get 包年包月实例是否自动续费。取值范围：
<li>0：表示不自动续费。</li>
<li>1：表示自动续费。</li> 
     * @return AutoRenew 包年包月实例是否自动续费。取值范围：
<li>0：表示不自动续费。</li>
<li>1：表示自动续费。</li>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 包年包月实例是否自动续费。取值范围：
<li>0：表示不自动续费。</li>
<li>1：表示自动续费。</li>
     * @param AutoRenew 包年包月实例是否自动续费。取值范围：
<li>0：表示不自动续费。</li>
<li>1：表示自动续费。</li>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 客户端Token。 
     * @return ClientToken 客户端Token。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token。
     * @param ClientToken 客户端Token。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 是否开启集群Master节点公网。取值范围：
<li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li>
<li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。 
     * @return NeedMasterWan 是否开启集群Master节点公网。取值范围：
<li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li>
<li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     */
    public String getNeedMasterWan() {
        return this.NeedMasterWan;
    }

    /**
     * Set 是否开启集群Master节点公网。取值范围：
<li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li>
<li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     * @param NeedMasterWan 是否开启集群Master节点公网。取值范围：
<li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li>
<li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     */
    public void setNeedMasterWan(String NeedMasterWan) {
        this.NeedMasterWan = NeedMasterWan;
    }

    /**
     * Get 是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。 
     * @return RemoteLoginAtCreate 是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。
     */
    public Long getRemoteLoginAtCreate() {
        return this.RemoteLoginAtCreate;
    }

    /**
     * Set 是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。
     * @param RemoteLoginAtCreate 是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。
     */
    public void setRemoteLoginAtCreate(Long RemoteLoginAtCreate) {
        this.RemoteLoginAtCreate = RemoteLoginAtCreate;
    }

    /**
     * Get 是否开启安全集群。0表示不开启，非0表示开启。 
     * @return CheckSecurity 是否开启安全集群。0表示不开启，非0表示开启。
     */
    public Long getCheckSecurity() {
        return this.CheckSecurity;
    }

    /**
     * Set 是否开启安全集群。0表示不开启，非0表示开启。
     * @param CheckSecurity 是否开启安全集群。0表示不开启，非0表示开启。
     */
    public void setCheckSecurity(Long CheckSecurity) {
        this.CheckSecurity = CheckSecurity;
    }

    /**
     * Get 访问外部文件系统。 
     * @return ExtendFsField 访问外部文件系统。
     */
    public String getExtendFsField() {
        return this.ExtendFsField;
    }

    /**
     * Set 访问外部文件系统。
     * @param ExtendFsField 访问外部文件系统。
     */
    public void setExtendFsField(String ExtendFsField) {
        this.ExtendFsField = ExtendFsField;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。 
     * @return Tags 标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。
     * @param Tags 标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 分散置放群组ID列表，当前只支持指定一个。 
     * @return DisasterRecoverGroupIds 分散置放群组ID列表，当前只支持指定一个。
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 分散置放群组ID列表，当前只支持指定一个。
     * @param DisasterRecoverGroupIds 分散置放群组ID列表，当前只支持指定一个。
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get 集群维度CBS加密盘，默认0表示不加密，1表示加密 
     * @return CbsEncrypt 集群维度CBS加密盘，默认0表示不加密，1表示加密
     */
    public Long getCbsEncrypt() {
        return this.CbsEncrypt;
    }

    /**
     * Set 集群维度CBS加密盘，默认0表示不加密，1表示加密
     * @param CbsEncrypt 集群维度CBS加密盘，默认0表示不加密，1表示加密
     */
    public void setCbsEncrypt(Long CbsEncrypt) {
        this.CbsEncrypt = CbsEncrypt;
    }

    /**
     * Get hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li> 
     * @return MetaType hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     * @param MetaType hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get EMR-MetaDB实例 
     * @return UnifyMetaInstanceId EMR-MetaDB实例
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set EMR-MetaDB实例
     * @param UnifyMetaInstanceId EMR-MetaDB实例
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get 自定义MetaDB信息 
     * @return MetaDBInfo 自定义MetaDB信息
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set 自定义MetaDB信息
     * @param MetaDBInfo 自定义MetaDB信息
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "COSSettings.", this.COSSettings);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "NeedMasterWan", this.NeedMasterWan);
        this.setParamSimple(map, prefix + "RemoteLoginAtCreate", this.RemoteLoginAtCreate);
        this.setParamSimple(map, prefix + "CheckSecurity", this.CheckSecurity);
        this.setParamSimple(map, prefix + "ExtendFsField", this.ExtendFsField);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "CbsEncrypt", this.CbsEncrypt);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);

    }
}

