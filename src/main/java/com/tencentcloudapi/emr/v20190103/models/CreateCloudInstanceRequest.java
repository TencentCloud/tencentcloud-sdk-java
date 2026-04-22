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

public class CreateCloudInstanceRequest extends AbstractModel {

    /**
    * <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>容器集群类型，取值范围</p><li>EMR容器集群实例: EMR-TKE</li>
    */
    @SerializedName("ClusterClass")
    @Expose
    private String ClusterClass;

    /**
    * <p>部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；</p>
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * <p>容器平台类型，取值范围</p><li>EMR容器集群实例: tke</li>
    */
    @SerializedName("PlatFormType")
    @Expose
    private String PlatFormType;

    /**
    * <p>cos存储桶</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>容器集群id</p>
    */
    @SerializedName("EksClusterId")
    @Expose
    private String EksClusterId;

    /**
    * <p>产品Id，不同产品ID表示不同的EMR产品版本。取值范围：</p><li>60:表示EMR-TKE-V1.1.0</li><li>55:表示EMR-TKE-V1.0.1</li><li>52:表示EMR-TKE-V1.0.0</li>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280<br>示例值：a9a90aa6fae36063280</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * <p>所有组件角色及其对应的Pod资源请求信息</p>
    */
    @SerializedName("CloudResources")
    @Expose
    private CloudResource [] CloudResources;

    /**
    * <p>安全组Id，为空默认创建新的安全组</p>
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * <p>元数据库信息<br>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p>
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaDBInfo MetaDBInfo;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>登录密码，LoginSettings中的Password字段</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>共享服务信息</p>
    */
    @SerializedName("ExternalService")
    @Expose
    private ExternalService [] ExternalService;

    /**
    * <p>可用区id</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>是否开通审计</p>
    */
    @SerializedName("NeedCdbAudit")
    @Expose
    private Long NeedCdbAudit;

    /**
    * <p>安全组来源IP</p>
    */
    @SerializedName("SgIP")
    @Expose
    private String SgIP;

    /**
    * <p>额外容器相关配置</p>
    */
    @SerializedName("ContainerExtraConf")
    @Expose
    private ContainerExtraConf ContainerExtraConf;

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
     * Get <p>容器集群类型，取值范围</p><li>EMR容器集群实例: EMR-TKE</li> 
     * @return ClusterClass <p>容器集群类型，取值范围</p><li>EMR容器集群实例: EMR-TKE</li>
     */
    public String getClusterClass() {
        return this.ClusterClass;
    }

    /**
     * Set <p>容器集群类型，取值范围</p><li>EMR容器集群实例: EMR-TKE</li>
     * @param ClusterClass <p>容器集群类型，取值范围</p><li>EMR容器集群实例: EMR-TKE</li>
     */
    public void setClusterClass(String ClusterClass) {
        this.ClusterClass = ClusterClass;
    }

    /**
     * Get <p>部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；</p> 
     * @return Software <p>部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；</p>
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set <p>部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；</p>
     * @param Software <p>部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；</p>
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get <p>容器平台类型，取值范围</p><li>EMR容器集群实例: tke</li> 
     * @return PlatFormType <p>容器平台类型，取值范围</p><li>EMR容器集群实例: tke</li>
     */
    public String getPlatFormType() {
        return this.PlatFormType;
    }

    /**
     * Set <p>容器平台类型，取值范围</p><li>EMR容器集群实例: tke</li>
     * @param PlatFormType <p>容器平台类型，取值范围</p><li>EMR容器集群实例: tke</li>
     */
    public void setPlatFormType(String PlatFormType) {
        this.PlatFormType = PlatFormType;
    }

    /**
     * Get <p>cos存储桶</p> 
     * @return CosBucket <p>cos存储桶</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>cos存储桶</p>
     * @param CosBucket <p>cos存储桶</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>容器集群id</p> 
     * @return EksClusterId <p>容器集群id</p>
     */
    public String getEksClusterId() {
        return this.EksClusterId;
    }

    /**
     * Set <p>容器集群id</p>
     * @param EksClusterId <p>容器集群id</p>
     */
    public void setEksClusterId(String EksClusterId) {
        this.EksClusterId = EksClusterId;
    }

    /**
     * Get <p>产品Id，不同产品ID表示不同的EMR产品版本。取值范围：</p><li>60:表示EMR-TKE-V1.1.0</li><li>55:表示EMR-TKE-V1.0.1</li><li>52:表示EMR-TKE-V1.0.0</li> 
     * @return ProductId <p>产品Id，不同产品ID表示不同的EMR产品版本。取值范围：</p><li>60:表示EMR-TKE-V1.1.0</li><li>55:表示EMR-TKE-V1.0.1</li><li>52:表示EMR-TKE-V1.0.0</li>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品Id，不同产品ID表示不同的EMR产品版本。取值范围：</p><li>60:表示EMR-TKE-V1.1.0</li><li>55:表示EMR-TKE-V1.0.1</li><li>52:表示EMR-TKE-V1.0.0</li>
     * @param ProductId <p>产品Id，不同产品ID表示不同的EMR产品版本。取值范围：</p><li>60:表示EMR-TKE-V1.1.0</li><li>55:表示EMR-TKE-V1.0.1</li><li>52:表示EMR-TKE-V1.0.0</li>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280<br>示例值：a9a90aa6fae36063280</p> 
     * @return ClientToken <p>客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280<br>示例值：a9a90aa6fae36063280</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280<br>示例值：a9a90aa6fae36063280</p>
     * @param ClientToken <p>客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280<br>示例值：a9a90aa6fae36063280</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p> 
     * @return VPCSettings <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     * @param VPCSettings <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get <p>所有组件角色及其对应的Pod资源请求信息</p> 
     * @return CloudResources <p>所有组件角色及其对应的Pod资源请求信息</p>
     */
    public CloudResource [] getCloudResources() {
        return this.CloudResources;
    }

    /**
     * Set <p>所有组件角色及其对应的Pod资源请求信息</p>
     * @param CloudResources <p>所有组件角色及其对应的Pod资源请求信息</p>
     */
    public void setCloudResources(CloudResource [] CloudResources) {
        this.CloudResources = CloudResources;
    }

    /**
     * Get <p>安全组Id，为空默认创建新的安全组</p> 
     * @return SgId <p>安全组Id，为空默认创建新的安全组</p>
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set <p>安全组Id，为空默认创建新的安全组</p>
     * @param SgId <p>安全组Id，为空默认创建新的安全组</p>
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get <p>元数据库信息<br>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p> 
     * @return MetaDBInfo <p>元数据库信息<br>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p>
     */
    public CustomMetaDBInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set <p>元数据库信息<br>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p>
     * @param MetaDBInfo <p>元数据库信息<br>MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填<br>当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId<br>当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass</p>
     */
    public void setMetaDBInfo(CustomMetaDBInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>登录密码，LoginSettings中的Password字段</p> 
     * @return LoginSettings <p>登录密码，LoginSettings中的Password字段</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>登录密码，LoginSettings中的Password字段</p>
     * @param LoginSettings <p>登录密码，LoginSettings中的Password字段</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>共享服务信息</p> 
     * @return ExternalService <p>共享服务信息</p>
     */
    public ExternalService [] getExternalService() {
        return this.ExternalService;
    }

    /**
     * Set <p>共享服务信息</p>
     * @param ExternalService <p>共享服务信息</p>
     */
    public void setExternalService(ExternalService [] ExternalService) {
        this.ExternalService = ExternalService;
    }

    /**
     * Get <p>可用区id</p> 
     * @return ZoneId <p>可用区id</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区id</p>
     * @param ZoneId <p>可用区id</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>数据库版本</p> 
     * @return DefaultMetaVersion <p>数据库版本</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>数据库版本</p>
     * @param DefaultMetaVersion <p>数据库版本</p>
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get <p>是否开通审计</p> 
     * @return NeedCdbAudit <p>是否开通审计</p>
     */
    public Long getNeedCdbAudit() {
        return this.NeedCdbAudit;
    }

    /**
     * Set <p>是否开通审计</p>
     * @param NeedCdbAudit <p>是否开通审计</p>
     */
    public void setNeedCdbAudit(Long NeedCdbAudit) {
        this.NeedCdbAudit = NeedCdbAudit;
    }

    /**
     * Get <p>安全组来源IP</p> 
     * @return SgIP <p>安全组来源IP</p>
     */
    public String getSgIP() {
        return this.SgIP;
    }

    /**
     * Set <p>安全组来源IP</p>
     * @param SgIP <p>安全组来源IP</p>
     */
    public void setSgIP(String SgIP) {
        this.SgIP = SgIP;
    }

    /**
     * Get <p>额外容器相关配置</p> 
     * @return ContainerExtraConf <p>额外容器相关配置</p>
     */
    public ContainerExtraConf getContainerExtraConf() {
        return this.ContainerExtraConf;
    }

    /**
     * Set <p>额外容器相关配置</p>
     * @param ContainerExtraConf <p>额外容器相关配置</p>
     */
    public void setContainerExtraConf(ContainerExtraConf ContainerExtraConf) {
        this.ContainerExtraConf = ContainerExtraConf;
    }

    public CreateCloudInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudInstanceRequest(CreateCloudInstanceRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClusterClass != null) {
            this.ClusterClass = new String(source.ClusterClass);
        }
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.PlatFormType != null) {
            this.PlatFormType = new String(source.PlatFormType);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.EksClusterId != null) {
            this.EksClusterId = new String(source.EksClusterId);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.CloudResources != null) {
            this.CloudResources = new CloudResource[source.CloudResources.length];
            for (int i = 0; i < source.CloudResources.length; i++) {
                this.CloudResources[i] = new CloudResource(source.CloudResources[i]);
            }
        }
        if (source.SgId != null) {
            this.SgId = new String(source.SgId);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaDBInfo(source.MetaDBInfo);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.ExternalService != null) {
            this.ExternalService = new ExternalService[source.ExternalService.length];
            for (int i = 0; i < source.ExternalService.length; i++) {
                this.ExternalService[i] = new ExternalService(source.ExternalService[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
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
        if (source.ContainerExtraConf != null) {
            this.ContainerExtraConf = new ContainerExtraConf(source.ContainerExtraConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClusterClass", this.ClusterClass);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamSimple(map, prefix + "PlatFormType", this.PlatFormType);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "EksClusterId", this.EksClusterId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamArrayObj(map, prefix + "CloudResources.", this.CloudResources);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArrayObj(map, prefix + "ExternalService.", this.ExternalService);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamSimple(map, prefix + "SgIP", this.SgIP);
        this.setParamObj(map, prefix + "ContainerExtraConf.", this.ContainerExtraConf);

    }
}

