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
    * 实例名称。
<li>长度限制为6-36个字符。</li>
<li>只允许包含中文、字母、数字、-、_。</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 容器集群类型，取值范围
<li>EMR容器集群实例: EMR-TKE</li>
    */
    @SerializedName("ClusterClass")
    @Expose
    private String ClusterClass;

    /**
    * 部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：[组件版本](https://cloud.tencent.com/document/product/589/20279) ；

    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * 容器平台类型，取值范围
<li>EMR容器集群实例: tke</li>
    */
    @SerializedName("PlatFormType")
    @Expose
    private String PlatFormType;

    /**
    * cos存储桶
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * 容器集群id
    */
    @SerializedName("EksClusterId")
    @Expose
    private String EksClusterId;

    /**
    * 产品Id，不同产品ID表示不同的EMR产品版本。取值范围：
<li>60:表示EMR-TKE-V1.1.0</li>
<li>55:表示EMR-TKE-V1.0.1</li>
<li>52:表示EMR-TKE-V1.0.0</li>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280
示例值：a9a90aa6fae36063280
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * 所有组件角色及其对应的Pod资源请求信息
    */
    @SerializedName("CloudResources")
    @Expose
    private CloudResource [] CloudResources;

    /**
    * 安全组Id，为空默认创建新的安全组
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * 元数据库信息
MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaDBInfo MetaDBInfo;

    /**
    * 标签信息
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 登录密码，LoginSettings中的Password字段
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 共享服务信息
    */
    @SerializedName("ExternalService")
    @Expose
    private ExternalService [] ExternalService;

    /**
    * 可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 数据库版本
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * 是否开通审计
    */
    @SerializedName("NeedCdbAudit")
    @Expose
    private Long NeedCdbAudit;

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
     * Get 容器集群类型，取值范围
<li>EMR容器集群实例: EMR-TKE</li> 
     * @return ClusterClass 容器集群类型，取值范围
<li>EMR容器集群实例: EMR-TKE</li>
     */
    public String getClusterClass() {
        return this.ClusterClass;
    }

    /**
     * Set 容器集群类型，取值范围
<li>EMR容器集群实例: EMR-TKE</li>
     * @param ClusterClass 容器集群类型，取值范围
<li>EMR容器集群实例: EMR-TKE</li>
     */
    public void setClusterClass(String ClusterClass) {
        this.ClusterClass = ClusterClass;
    }

    /**
     * Get 部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：[组件版本](https://cloud.tencent.com/document/product/589/20279) ；
 
     * @return Software 部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：[组件版本](https://cloud.tencent.com/document/product/589/20279) ；

     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set 部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：[组件版本](https://cloud.tencent.com/document/product/589/20279) ；

     * @param Software 部署的组件列表，不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：[组件版本](https://cloud.tencent.com/document/product/589/20279) ；

     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get 容器平台类型，取值范围
<li>EMR容器集群实例: tke</li> 
     * @return PlatFormType 容器平台类型，取值范围
<li>EMR容器集群实例: tke</li>
     */
    public String getPlatFormType() {
        return this.PlatFormType;
    }

    /**
     * Set 容器平台类型，取值范围
<li>EMR容器集群实例: tke</li>
     * @param PlatFormType 容器平台类型，取值范围
<li>EMR容器集群实例: tke</li>
     */
    public void setPlatFormType(String PlatFormType) {
        this.PlatFormType = PlatFormType;
    }

    /**
     * Get cos存储桶 
     * @return CosBucket cos存储桶
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set cos存储桶
     * @param CosBucket cos存储桶
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get 容器集群id 
     * @return EksClusterId 容器集群id
     */
    public String getEksClusterId() {
        return this.EksClusterId;
    }

    /**
     * Set 容器集群id
     * @param EksClusterId 容器集群id
     */
    public void setEksClusterId(String EksClusterId) {
        this.EksClusterId = EksClusterId;
    }

    /**
     * Get 产品Id，不同产品ID表示不同的EMR产品版本。取值范围：
<li>60:表示EMR-TKE-V1.1.0</li>
<li>55:表示EMR-TKE-V1.0.1</li>
<li>52:表示EMR-TKE-V1.0.0</li> 
     * @return ProductId 产品Id，不同产品ID表示不同的EMR产品版本。取值范围：
<li>60:表示EMR-TKE-V1.1.0</li>
<li>55:表示EMR-TKE-V1.0.1</li>
<li>52:表示EMR-TKE-V1.0.0</li>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id，不同产品ID表示不同的EMR产品版本。取值范围：
<li>60:表示EMR-TKE-V1.1.0</li>
<li>55:表示EMR-TKE-V1.0.1</li>
<li>52:表示EMR-TKE-V1.0.0</li>
     * @param ProductId 产品Id，不同产品ID表示不同的EMR产品版本。取值范围：
<li>60:表示EMR-TKE-V1.1.0</li>
<li>55:表示EMR-TKE-V1.0.1</li>
<li>52:表示EMR-TKE-V1.0.0</li>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280
示例值：a9a90aa6fae36063280 
     * @return ClientToken 客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280
示例值：a9a90aa6fae36063280
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280
示例值：a9a90aa6fae36063280
     * @param ClientToken 客户端token，唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，小于等于64个字符，例如 a9a90aa6fae36063280
示例值：a9a90aa6fae36063280
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
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
     * Get 所有组件角色及其对应的Pod资源请求信息 
     * @return CloudResources 所有组件角色及其对应的Pod资源请求信息
     */
    public CloudResource [] getCloudResources() {
        return this.CloudResources;
    }

    /**
     * Set 所有组件角色及其对应的Pod资源请求信息
     * @param CloudResources 所有组件角色及其对应的Pod资源请求信息
     */
    public void setCloudResources(CloudResource [] CloudResources) {
        this.CloudResources = CloudResources;
    }

    /**
     * Get 安全组Id，为空默认创建新的安全组 
     * @return SgId 安全组Id，为空默认创建新的安全组
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set 安全组Id，为空默认创建新的安全组
     * @param SgId 安全组Id，为空默认创建新的安全组
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get 元数据库信息
MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass 
     * @return MetaDBInfo 元数据库信息
MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass
     */
    public CustomMetaDBInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set 元数据库信息
MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass
     * @param MetaDBInfo 元数据库信息
MetaDB信息，当MetaType选择EMR_NEW_META时，MetaDataJdbcUrl MetaDataUser MetaDataPass UnifyMetaInstanceId不用填
当MetaType选择EMR_EXIT_META时，填写UnifyMetaInstanceId
当MetaType选择USER_CUSTOM_META时，填写MetaDataJdbcUrl MetaDataUser MetaDataPass
     */
    public void setMetaDBInfo(CustomMetaDBInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get 标签信息 
     * @return Tags 标签信息
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
     * @param Tags 标签信息
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 登录密码，LoginSettings中的Password字段 
     * @return LoginSettings 登录密码，LoginSettings中的Password字段
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 登录密码，LoginSettings中的Password字段
     * @param LoginSettings 登录密码，LoginSettings中的Password字段
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 共享服务信息 
     * @return ExternalService 共享服务信息
     */
    public ExternalService [] getExternalService() {
        return this.ExternalService;
    }

    /**
     * Set 共享服务信息
     * @param ExternalService 共享服务信息
     */
    public void setExternalService(ExternalService [] ExternalService) {
        this.ExternalService = ExternalService;
    }

    /**
     * Get 可用区id 
     * @return ZoneId 可用区id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区id
     * @param ZoneId 可用区id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 数据库版本 
     * @return DefaultMetaVersion 数据库版本
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set 数据库版本
     * @param DefaultMetaVersion 数据库版本
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get 是否开通审计 
     * @return NeedCdbAudit 是否开通审计
     */
    public Long getNeedCdbAudit() {
        return this.NeedCdbAudit;
    }

    /**
     * Set 是否开通审计
     * @param NeedCdbAudit 是否开通审计
     */
    public void setNeedCdbAudit(Long NeedCdbAudit) {
        this.NeedCdbAudit = NeedCdbAudit;
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

    }
}

