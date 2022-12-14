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

public class CreateClusterRequest extends AbstractModel{

    /**
    * EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：[产品版本名称](https://cloud.tencent.com/document/product/589/66338)
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * 是否开启节点高可用。取值范围：
<li>true：表示开启节点高可用。</li>
<li>false：表示不开启节点高可用。</li>
    */
    @SerializedName("EnableSupportHAFlag")
    @Expose
    private Boolean EnableSupportHAFlag;

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
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。
<li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li>
<li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 集群应用场景以及支持部署组件配置
    */
    @SerializedName("SceneSoftwareConfig")
    @Expose
    private SceneSoftwareConfig SceneSoftwareConfig;

    /**
    * 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-751a-41b6-aad6-fae360632808
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
    * 是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li>
    */
    @SerializedName("EnableRemoteLoginFlag")
    @Expose
    private Boolean EnableRemoteLoginFlag;

    /**
    * 是否开启Kerberos认证。默认不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li>
    */
    @SerializedName("EnableKerberosFlag")
    @Expose
    private Boolean EnableKerberosFlag;

    /**
    * [自定义软件配置](https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1)
    */
    @SerializedName("CustomConf")
    @Expose
    private String CustomConf;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * 是否开启集群维度CBS加密。默认不加密 取值范围：
<li>true：表示加密</li>
<li>false：表示不加密</li>
    */
    @SerializedName("EnableCbsEncryptFlag")
    @Expose
    private Boolean EnableCbsEncryptFlag;

    /**
    * MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaDBInfo MetaDBInfo;

    /**
    * 共享组件信息
    */
    @SerializedName("DependService")
    @Expose
    private DependService [] DependService;

    /**
    * 节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。
    */
    @SerializedName("ZoneResourceConfiguration")
    @Expose
    private ZoneResourceConfiguration [] ZoneResourceConfiguration;

    /**
     * Get EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：[产品版本名称](https://cloud.tencent.com/document/product/589/66338) 
     * @return ProductVersion EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：[产品版本名称](https://cloud.tencent.com/document/product/589/66338)
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：[产品版本名称](https://cloud.tencent.com/document/product/589/66338)
     * @param ProductVersion EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：[产品版本名称](https://cloud.tencent.com/document/product/589/66338)
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get 是否开启节点高可用。取值范围：
<li>true：表示开启节点高可用。</li>
<li>false：表示不开启节点高可用。</li> 
     * @return EnableSupportHAFlag 是否开启节点高可用。取值范围：
<li>true：表示开启节点高可用。</li>
<li>false：表示不开启节点高可用。</li>
     */
    public Boolean getEnableSupportHAFlag() {
        return this.EnableSupportHAFlag;
    }

    /**
     * Set 是否开启节点高可用。取值范围：
<li>true：表示开启节点高可用。</li>
<li>false：表示不开启节点高可用。</li>
     * @param EnableSupportHAFlag 是否开启节点高可用。取值范围：
<li>true：表示开启节点高可用。</li>
<li>false：表示不开启节点高可用。</li>
     */
    public void setEnableSupportHAFlag(Boolean EnableSupportHAFlag) {
        this.EnableSupportHAFlag = EnableSupportHAFlag;
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
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li> 
     * @return InstanceChargeType 实例计费模式。取值范围：
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围：
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
     * @param InstanceChargeType 实例计费模式。取值范围：
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
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
     * Get 集群应用场景以及支持部署组件配置 
     * @return SceneSoftwareConfig 集群应用场景以及支持部署组件配置
     */
    public SceneSoftwareConfig getSceneSoftwareConfig() {
        return this.SceneSoftwareConfig;
    }

    /**
     * Set 集群应用场景以及支持部署组件配置
     * @param SceneSoftwareConfig 集群应用场景以及支持部署组件配置
     */
    public void setSceneSoftwareConfig(SceneSoftwareConfig SceneSoftwareConfig) {
        this.SceneSoftwareConfig = SceneSoftwareConfig;
    }

    /**
     * Get 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。 
     * @return InstanceChargePrepaid 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     * @param InstanceChargePrepaid 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。 
     * @return SecurityGroupIds 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。
     * @param SecurityGroupIds 实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的SecurityGroupId字段来获取。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。 
     * @return ScriptBootstrapActionConfig [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。
     * @param ScriptBootstrapActionConfig [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-751a-41b6-aad6-fae360632808 
     * @return ClientToken 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-751a-41b6-aad6-fae360632808
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-751a-41b6-aad6-fae360632808
     * @param ClientToken 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-751a-41b6-aad6-fae360632808
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
     * Get 是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li> 
     * @return EnableRemoteLoginFlag 是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li>
     */
    public Boolean getEnableRemoteLoginFlag() {
        return this.EnableRemoteLoginFlag;
    }

    /**
     * Set 是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li>
     * @param EnableRemoteLoginFlag 是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li>
     */
    public void setEnableRemoteLoginFlag(Boolean EnableRemoteLoginFlag) {
        this.EnableRemoteLoginFlag = EnableRemoteLoginFlag;
    }

    /**
     * Get 是否开启Kerberos认证。默认不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li> 
     * @return EnableKerberosFlag 是否开启Kerberos认证。默认不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li>
     */
    public Boolean getEnableKerberosFlag() {
        return this.EnableKerberosFlag;
    }

    /**
     * Set 是否开启Kerberos认证。默认不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li>
     * @param EnableKerberosFlag 是否开启Kerberos认证。默认不开启 取值范围：
<li>true：表示开启</li>
<li>false：表示不开启</li>
     */
    public void setEnableKerberosFlag(Boolean EnableKerberosFlag) {
        this.EnableKerberosFlag = EnableKerberosFlag;
    }

    /**
     * Get [自定义软件配置](https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1) 
     * @return CustomConf [自定义软件配置](https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1)
     */
    public String getCustomConf() {
        return this.CustomConf;
    }

    /**
     * Set [自定义软件配置](https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1)
     * @param CustomConf [自定义软件配置](https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1)
     */
    public void setCustomConf(String CustomConf) {
        this.CustomConf = CustomConf;
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
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。 
     * @return DisasterRecoverGroupIds 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。
     * @param DisasterRecoverGroupIds 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get 是否开启集群维度CBS加密。默认不加密 取值范围：
<li>true：表示加密</li>
<li>false：表示不加密</li> 
     * @return EnableCbsEncryptFlag 是否开启集群维度CBS加密。默认不加密 取值范围：
<li>true：表示加密</li>
<li>false：表示不加密</li>
     */
    public Boolean getEnableCbsEncryptFlag() {
        return this.EnableCbsEncryptFlag;
    }

    /**
     * Set 是否开启集群维度CBS加密。默认不加密 取值范围：
<li>true：表示加密</li>
<li>false：表示不加密</li>
     * @param EnableCbsEncryptFlag 是否开启集群维度CBS加密。默认不加密 取值范围：
<li>true：表示加密</li>
<li>false：表示不加密</li>
     */
    public void setEnableCbsEncryptFlag(Boolean EnableCbsEncryptFlag) {
        this.EnableCbsEncryptFlag = EnableCbsEncryptFlag;
    }

    /**
     * Get MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass 
     * @return MetaDBInfo MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass
     */
    public CustomMetaDBInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass
     * @param MetaDBInfo MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass
     */
    public void setMetaDBInfo(CustomMetaDBInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get 共享组件信息 
     * @return DependService 共享组件信息
     */
    public DependService [] getDependService() {
        return this.DependService;
    }

    /**
     * Set 共享组件信息
     * @param DependService 共享组件信息
     */
    public void setDependService(DependService [] DependService) {
        this.DependService = DependService;
    }

    /**
     * Get 节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。 
     * @return ZoneResourceConfiguration 节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。
     */
    public ZoneResourceConfiguration [] getZoneResourceConfiguration() {
        return this.ZoneResourceConfiguration;
    }

    /**
     * Set 节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。
     * @param ZoneResourceConfiguration 节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。
     */
    public void setZoneResourceConfiguration(ZoneResourceConfiguration [] ZoneResourceConfiguration) {
        this.ZoneResourceConfiguration = ZoneResourceConfiguration;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.EnableSupportHAFlag != null) {
            this.EnableSupportHAFlag = new Boolean(source.EnableSupportHAFlag);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.SceneSoftwareConfig != null) {
            this.SceneSoftwareConfig = new SceneSoftwareConfig(source.SceneSoftwareConfig);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.ScriptBootstrapActionConfig != null) {
            this.ScriptBootstrapActionConfig = new ScriptBootstrapActionConfig[source.ScriptBootstrapActionConfig.length];
            for (int i = 0; i < source.ScriptBootstrapActionConfig.length; i++) {
                this.ScriptBootstrapActionConfig[i] = new ScriptBootstrapActionConfig(source.ScriptBootstrapActionConfig[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.NeedMasterWan != null) {
            this.NeedMasterWan = new String(source.NeedMasterWan);
        }
        if (source.EnableRemoteLoginFlag != null) {
            this.EnableRemoteLoginFlag = new Boolean(source.EnableRemoteLoginFlag);
        }
        if (source.EnableKerberosFlag != null) {
            this.EnableKerberosFlag = new Boolean(source.EnableKerberosFlag);
        }
        if (source.CustomConf != null) {
            this.CustomConf = new String(source.CustomConf);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.EnableCbsEncryptFlag != null) {
            this.EnableCbsEncryptFlag = new Boolean(source.EnableCbsEncryptFlag);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaDBInfo(source.MetaDBInfo);
        }
        if (source.DependService != null) {
            this.DependService = new DependService[source.DependService.length];
            for (int i = 0; i < source.DependService.length; i++) {
                this.DependService[i] = new DependService(source.DependService[i]);
            }
        }
        if (source.ZoneResourceConfiguration != null) {
            this.ZoneResourceConfiguration = new ZoneResourceConfiguration[source.ZoneResourceConfiguration.length];
            for (int i = 0; i < source.ZoneResourceConfiguration.length; i++) {
                this.ZoneResourceConfiguration[i] = new ZoneResourceConfiguration(source.ZoneResourceConfiguration[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamSimple(map, prefix + "EnableSupportHAFlag", this.EnableSupportHAFlag);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "SceneSoftwareConfig.", this.SceneSoftwareConfig);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "ScriptBootstrapActionConfig.", this.ScriptBootstrapActionConfig);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "NeedMasterWan", this.NeedMasterWan);
        this.setParamSimple(map, prefix + "EnableRemoteLoginFlag", this.EnableRemoteLoginFlag);
        this.setParamSimple(map, prefix + "EnableKerberosFlag", this.EnableKerberosFlag);
        this.setParamSimple(map, prefix + "CustomConf", this.CustomConf);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "EnableCbsEncryptFlag", this.EnableCbsEncryptFlag);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamArrayObj(map, prefix + "DependService.", this.DependService);
        this.setParamArrayObj(map, prefix + "ZoneResourceConfiguration.", this.ZoneResourceConfiguration);

    }
}

