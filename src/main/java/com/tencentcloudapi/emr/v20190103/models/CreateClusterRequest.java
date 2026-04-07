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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel {

    /**
    * <p>EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：<a href="https://cloud.tencent.com/document/product/589/66338">产品版本名称</a></p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>是否开启节点高可用。取值范围：</p><li>true：表示开启节点高可用。</li><li>false：表示不开启节点高可用。</li>
    */
    @SerializedName("EnableSupportHAFlag")
    @Expose
    private Boolean EnableSupportHAFlag;

    /**
    * <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>集群应用场景以及支持部署组件配置</p>
    */
    @SerializedName("SceneSoftwareConfig")
    @Expose
    private SceneSoftwareConfig SceneSoftwareConfig;

    /**
    * <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
    */
    @SerializedName("NeedMasterWan")
    @Expose
    private String NeedMasterWan;

    /**
    * <p>是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li>
    */
    @SerializedName("EnableRemoteLoginFlag")
    @Expose
    private Boolean EnableRemoteLoginFlag;

    /**
    * <p>是否开启Kerberos认证。默认不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li>
    */
    @SerializedName("EnableKerberosFlag")
    @Expose
    private Boolean EnableKerberosFlag;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1">自定义软件配置</a></p>
    */
    @SerializedName("CustomConf")
    @Expose
    private String CustomConf;

    /**
    * <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>是否开启集群维度CBS加密。默认不加密 取值范围：</p><li>true：表示加密</li><li>false：表示不加密</li>
    */
    @SerializedName("EnableCbsEncryptFlag")
    @Expose
    private Boolean EnableCbsEncryptFlag;

    /**
    * <p>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p>
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaDBInfo MetaDBInfo;

    /**
    * <p>共享组件信息</p>
    */
    @SerializedName("DependService")
    @Expose
    private DependService [] DependService;

    /**
    * <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p>
    */
    @SerializedName("ZoneResourceConfiguration")
    @Expose
    private ZoneResourceConfiguration [] ZoneResourceConfiguration;

    /**
    * <p>cos桶路径，创建StarRocks存算分离集群时用到</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>节点标识信息，目前只提供给tf平台使用</p>
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark [] NodeMarks;

    /**
    * <p>clb id</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>数据库版本：mysql8/tdsql8/mysql5</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>是否开通数据库审计</p>
    */
    @SerializedName("NeedCdbAudit")
    @Expose
    private Long NeedCdbAudit;

    /**
    * <p>安全指定来源ip</p>
    */
    @SerializedName("SgIP")
    @Expose
    private String SgIP;

    /**
    * <p>分区置放群组分区</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
     * Get <p>EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：<a href="https://cloud.tencent.com/document/product/589/66338">产品版本名称</a></p> 
     * @return ProductVersion <p>EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：<a href="https://cloud.tencent.com/document/product/589/66338">产品版本名称</a></p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：<a href="https://cloud.tencent.com/document/product/589/66338">产品版本名称</a></p>
     * @param ProductVersion <p>EMR产品版本名称如EMR-V2.3.0 表示2.3.0版本的EMR， 当前支持产品版本名称查询：<a href="https://cloud.tencent.com/document/product/589/66338">产品版本名称</a></p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>是否开启节点高可用。取值范围：</p><li>true：表示开启节点高可用。</li><li>false：表示不开启节点高可用。</li> 
     * @return EnableSupportHAFlag <p>是否开启节点高可用。取值范围：</p><li>true：表示开启节点高可用。</li><li>false：表示不开启节点高可用。</li>
     */
    public Boolean getEnableSupportHAFlag() {
        return this.EnableSupportHAFlag;
    }

    /**
     * Set <p>是否开启节点高可用。取值范围：</p><li>true：表示开启节点高可用。</li><li>false：表示不开启节点高可用。</li>
     * @param EnableSupportHAFlag <p>是否开启节点高可用。取值范围：</p><li>true：表示开启节点高可用。</li><li>false：表示不开启节点高可用。</li>
     */
    public void setEnableSupportHAFlag(Boolean EnableSupportHAFlag) {
        this.EnableSupportHAFlag = EnableSupportHAFlag;
    }

    /**
     * Get <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li> 
     * @return InstanceName <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
     * @param InstanceName <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li> 
     * @return InstanceChargeType <p>实例计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li>
     * @param InstanceChargeType <p>实例计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li> 
     * @return LoginSettings <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     * @param LoginSettings <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>集群应用场景以及支持部署组件配置</p> 
     * @return SceneSoftwareConfig <p>集群应用场景以及支持部署组件配置</p>
     */
    public SceneSoftwareConfig getSceneSoftwareConfig() {
        return this.SceneSoftwareConfig;
    }

    /**
     * Set <p>集群应用场景以及支持部署组件配置</p>
     * @param SceneSoftwareConfig <p>集群应用场景以及支持部署组件配置</p>
     */
    public void setSceneSoftwareConfig(SceneSoftwareConfig SceneSoftwareConfig) {
        this.SceneSoftwareConfig = SceneSoftwareConfig;
    }

    /**
     * Get <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p> 
     * @return InstanceChargePrepaid <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     * @param InstanceChargePrepaid <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p> 
     * @return SecurityGroupIds <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     * @param SecurityGroupIds <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p> 
     * @return ScriptBootstrapActionConfig <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     * @param ScriptBootstrapActionConfig <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p> 
     * @return ClientToken <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     * @param ClientToken <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。 
     * @return NeedMasterWan <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     */
    public String getNeedMasterWan() {
        return this.NeedMasterWan;
    }

    /**
     * Set <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     * @param NeedMasterWan <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     */
    public void setNeedMasterWan(String NeedMasterWan) {
        this.NeedMasterWan = NeedMasterWan;
    }

    /**
     * Get <p>是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li> 
     * @return EnableRemoteLoginFlag <p>是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li>
     */
    public Boolean getEnableRemoteLoginFlag() {
        return this.EnableRemoteLoginFlag;
    }

    /**
     * Set <p>是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li>
     * @param EnableRemoteLoginFlag <p>是否开启外网远程登录。（在SecurityGroupId不为空时，该参数无效）不填默认为不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li>
     */
    public void setEnableRemoteLoginFlag(Boolean EnableRemoteLoginFlag) {
        this.EnableRemoteLoginFlag = EnableRemoteLoginFlag;
    }

    /**
     * Get <p>是否开启Kerberos认证。默认不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li> 
     * @return EnableKerberosFlag <p>是否开启Kerberos认证。默认不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li>
     */
    public Boolean getEnableKerberosFlag() {
        return this.EnableKerberosFlag;
    }

    /**
     * Set <p>是否开启Kerberos认证。默认不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li>
     * @param EnableKerberosFlag <p>是否开启Kerberos认证。默认不开启 取值范围：</p><li>true：表示开启</li><li>false：表示不开启</li>
     */
    public void setEnableKerberosFlag(Boolean EnableKerberosFlag) {
        this.EnableKerberosFlag = EnableKerberosFlag;
    }

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1">自定义软件配置</a></p> 
     * @return CustomConf <p><a href="https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1">自定义软件配置</a></p>
     */
    public String getCustomConf() {
        return this.CustomConf;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1">自定义软件配置</a></p>
     * @param CustomConf <p><a href="https://cloud.tencent.com/document/product/589/35655?from_cn_redirect=1">自定义软件配置</a></p>
     */
    public void setCustomConf(String CustomConf) {
        this.CustomConf = CustomConf;
    }

    /**
     * Get <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p> 
     * @return Tags <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p>
     * @param Tags <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p> 
     * @return DisasterRecoverGroupIds <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p>
     * @param DisasterRecoverGroupIds <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>是否开启集群维度CBS加密。默认不加密 取值范围：</p><li>true：表示加密</li><li>false：表示不加密</li> 
     * @return EnableCbsEncryptFlag <p>是否开启集群维度CBS加密。默认不加密 取值范围：</p><li>true：表示加密</li><li>false：表示不加密</li>
     */
    public Boolean getEnableCbsEncryptFlag() {
        return this.EnableCbsEncryptFlag;
    }

    /**
     * Set <p>是否开启集群维度CBS加密。默认不加密 取值范围：</p><li>true：表示加密</li><li>false：表示不加密</li>
     * @param EnableCbsEncryptFlag <p>是否开启集群维度CBS加密。默认不加密 取值范围：</p><li>true：表示加密</li><li>false：表示不加密</li>
     */
    public void setEnableCbsEncryptFlag(Boolean EnableCbsEncryptFlag) {
        this.EnableCbsEncryptFlag = EnableCbsEncryptFlag;
    }

    /**
     * Get <p>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p> 
     * @return MetaDBInfo <p>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p>
     */
    public CustomMetaDBInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set <p>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p>
     * @param MetaDBInfo <p>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p>
     */
    public void setMetaDBInfo(CustomMetaDBInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get <p>共享组件信息</p> 
     * @return DependService <p>共享组件信息</p>
     */
    public DependService [] getDependService() {
        return this.DependService;
    }

    /**
     * Set <p>共享组件信息</p>
     * @param DependService <p>共享组件信息</p>
     */
    public void setDependService(DependService [] DependService) {
        this.DependService = DependService;
    }

    /**
     * Get <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p> 
     * @return ZoneResourceConfiguration <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p>
     */
    public ZoneResourceConfiguration [] getZoneResourceConfiguration() {
        return this.ZoneResourceConfiguration;
    }

    /**
     * Set <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p>
     * @param ZoneResourceConfiguration <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p>
     */
    public void setZoneResourceConfiguration(ZoneResourceConfiguration [] ZoneResourceConfiguration) {
        this.ZoneResourceConfiguration = ZoneResourceConfiguration;
    }

    /**
     * Get <p>cos桶路径，创建StarRocks存算分离集群时用到</p> 
     * @return CosBucket <p>cos桶路径，创建StarRocks存算分离集群时用到</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>cos桶路径，创建StarRocks存算分离集群时用到</p>
     * @param CosBucket <p>cos桶路径，创建StarRocks存算分离集群时用到</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>节点标识信息，目前只提供给tf平台使用</p> 
     * @return NodeMarks <p>节点标识信息，目前只提供给tf平台使用</p>
     */
    public NodeMark [] getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set <p>节点标识信息，目前只提供给tf平台使用</p>
     * @param NodeMarks <p>节点标识信息，目前只提供给tf平台使用</p>
     */
    public void setNodeMarks(NodeMark [] NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get <p>clb id</p> 
     * @return LoadBalancerId <p>clb id</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>clb id</p>
     * @param LoadBalancerId <p>clb id</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>数据库版本：mysql8/tdsql8/mysql5</p> 
     * @return DefaultMetaVersion <p>数据库版本：mysql8/tdsql8/mysql5</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>数据库版本：mysql8/tdsql8/mysql5</p>
     * @param DefaultMetaVersion <p>数据库版本：mysql8/tdsql8/mysql5</p>
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get <p>是否开通数据库审计</p> 
     * @return NeedCdbAudit <p>是否开通数据库审计</p>
     */
    public Long getNeedCdbAudit() {
        return this.NeedCdbAudit;
    }

    /**
     * Set <p>是否开通数据库审计</p>
     * @param NeedCdbAudit <p>是否开通数据库审计</p>
     */
    public void setNeedCdbAudit(Long NeedCdbAudit) {
        this.NeedCdbAudit = NeedCdbAudit;
    }

    /**
     * Get <p>安全指定来源ip</p> 
     * @return SgIP <p>安全指定来源ip</p>
     */
    public String getSgIP() {
        return this.SgIP;
    }

    /**
     * Set <p>安全指定来源ip</p>
     * @param SgIP <p>安全指定来源ip</p>
     */
    public void setSgIP(String SgIP) {
        this.SgIP = SgIP;
    }

    /**
     * Get <p>分区置放群组分区</p> 
     * @return PartitionNumber <p>分区置放群组分区</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>分区置放群组分区</p>
     * @param PartitionNumber <p>分区置放群组分区</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
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
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.NodeMarks != null) {
            this.NodeMarks = new NodeMark[source.NodeMarks.length];
            for (int i = 0; i < source.NodeMarks.length; i++) {
                this.NodeMarks[i] = new NodeMark(source.NodeMarks[i]);
            }
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.NeedCdbAudit != null) {
            this.NeedCdbAudit = new Long(source.NeedCdbAudit);
        }
        if (source.SgIP != null) {
            this.SgIP = new String(source.SgIP);
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
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
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamArrayObj(map, prefix + "NodeMarks.", this.NodeMarks);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamSimple(map, prefix + "SgIP", this.SgIP);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);

    }
}

