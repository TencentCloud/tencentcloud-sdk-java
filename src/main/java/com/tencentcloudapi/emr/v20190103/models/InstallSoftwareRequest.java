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

public class InstallSoftwareRequest extends AbstractModel {

    /**
    * <p>集群实例号</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>组件版本号，例如presto-0.161，可根据InstallSoftWareInfo查看当前集群可安装的组件</p>
    */
    @SerializedName("SoftInfo")
    @Expose
    private String [] SoftInfo;

    /**
    * <p>如果需要购买CDB，如果是包年包月集群，是否为这个cdb自动续费，默认AUTO_RENEW,如不自动续费新增的CDB，则填入NOT_AUTO_RENEW</p>
    */
    @SerializedName("CdbAutoRenew")
    @Expose
    private String CdbAutoRenew;

    /**
    * <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>EMR-MetaDB实例</p>
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * <p>自定义MetaDB信息</p>
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
    * <p>共用组件信息</p>
    */
    @SerializedName("ExternalService")
    @Expose
    private ExternalService [] ExternalService;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>角色的Pod规格信息</p>
    */
    @SerializedName("CloudResources")
    @Expose
    private CloudResource [] CloudResources;

    /**
    * <p>自定义部署信息</p>
    */
    @SerializedName("ServiceDeployInfoList")
    @Expose
    private ServiceDeployInfo [] ServiceDeployInfoList;

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
    * <p>额外容器相关配置</p>
    */
    @SerializedName("ContainerExtraConf")
    @Expose
    private ContainerExtraConf ContainerExtraConf;

    /**
     * Get <p>集群实例号</p> 
     * @return InstanceId <p>集群实例号</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群实例号</p>
     * @param InstanceId <p>集群实例号</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>组件版本号，例如presto-0.161，可根据InstallSoftWareInfo查看当前集群可安装的组件</p> 
     * @return SoftInfo <p>组件版本号，例如presto-0.161，可根据InstallSoftWareInfo查看当前集群可安装的组件</p>
     */
    public String [] getSoftInfo() {
        return this.SoftInfo;
    }

    /**
     * Set <p>组件版本号，例如presto-0.161，可根据InstallSoftWareInfo查看当前集群可安装的组件</p>
     * @param SoftInfo <p>组件版本号，例如presto-0.161，可根据InstallSoftWareInfo查看当前集群可安装的组件</p>
     */
    public void setSoftInfo(String [] SoftInfo) {
        this.SoftInfo = SoftInfo;
    }

    /**
     * Get <p>如果需要购买CDB，如果是包年包月集群，是否为这个cdb自动续费，默认AUTO_RENEW,如不自动续费新增的CDB，则填入NOT_AUTO_RENEW</p> 
     * @return CdbAutoRenew <p>如果需要购买CDB，如果是包年包月集群，是否为这个cdb自动续费，默认AUTO_RENEW,如不自动续费新增的CDB，则填入NOT_AUTO_RENEW</p>
     */
    public String getCdbAutoRenew() {
        return this.CdbAutoRenew;
    }

    /**
     * Set <p>如果需要购买CDB，如果是包年包月集群，是否为这个cdb自动续费，默认AUTO_RENEW,如不自动续费新增的CDB，则填入NOT_AUTO_RENEW</p>
     * @param CdbAutoRenew <p>如果需要购买CDB，如果是包年包月集群，是否为这个cdb自动续费，默认AUTO_RENEW,如不自动续费新增的CDB，则填入NOT_AUTO_RENEW</p>
     */
    public void setCdbAutoRenew(String CdbAutoRenew) {
        this.CdbAutoRenew = CdbAutoRenew;
    }

    /**
     * Get <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li> 
     * @return MetaType <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     * @param MetaType <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>EMR-MetaDB实例</p> 
     * @return UnifyMetaInstanceId <p>EMR-MetaDB实例</p>
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set <p>EMR-MetaDB实例</p>
     * @param UnifyMetaInstanceId <p>EMR-MetaDB实例</p>
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get <p>自定义MetaDB信息</p> 
     * @return MetaDBInfo <p>自定义MetaDB信息</p>
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set <p>自定义MetaDB信息</p>
     * @param MetaDBInfo <p>自定义MetaDB信息</p>
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get <p>共用组件信息</p> 
     * @return ExternalService <p>共用组件信息</p>
     */
    public ExternalService [] getExternalService() {
        return this.ExternalService;
    }

    /**
     * Set <p>共用组件信息</p>
     * @param ExternalService <p>共用组件信息</p>
     */
    public void setExternalService(ExternalService [] ExternalService) {
        this.ExternalService = ExternalService;
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
     * Get <p>角色的Pod规格信息</p> 
     * @return CloudResources <p>角色的Pod规格信息</p>
     */
    public CloudResource [] getCloudResources() {
        return this.CloudResources;
    }

    /**
     * Set <p>角色的Pod规格信息</p>
     * @param CloudResources <p>角色的Pod规格信息</p>
     */
    public void setCloudResources(CloudResource [] CloudResources) {
        this.CloudResources = CloudResources;
    }

    /**
     * Get <p>自定义部署信息</p> 
     * @return ServiceDeployInfoList <p>自定义部署信息</p>
     */
    public ServiceDeployInfo [] getServiceDeployInfoList() {
        return this.ServiceDeployInfoList;
    }

    /**
     * Set <p>自定义部署信息</p>
     * @param ServiceDeployInfoList <p>自定义部署信息</p>
     */
    public void setServiceDeployInfoList(ServiceDeployInfo [] ServiceDeployInfoList) {
        this.ServiceDeployInfoList = ServiceDeployInfoList;
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

    public InstallSoftwareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallSoftwareRequest(InstallSoftwareRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SoftInfo != null) {
            this.SoftInfo = new String[source.SoftInfo.length];
            for (int i = 0; i < source.SoftInfo.length; i++) {
                this.SoftInfo[i] = new String(source.SoftInfo[i]);
            }
        }
        if (source.CdbAutoRenew != null) {
            this.CdbAutoRenew = new String(source.CdbAutoRenew);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaInfo(source.MetaDBInfo);
        }
        if (source.ExternalService != null) {
            this.ExternalService = new ExternalService[source.ExternalService.length];
            for (int i = 0; i < source.ExternalService.length; i++) {
                this.ExternalService[i] = new ExternalService(source.ExternalService[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CloudResources != null) {
            this.CloudResources = new CloudResource[source.CloudResources.length];
            for (int i = 0; i < source.CloudResources.length; i++) {
                this.CloudResources[i] = new CloudResource(source.CloudResources[i]);
            }
        }
        if (source.ServiceDeployInfoList != null) {
            this.ServiceDeployInfoList = new ServiceDeployInfo[source.ServiceDeployInfoList.length];
            for (int i = 0; i < source.ServiceDeployInfoList.length; i++) {
                this.ServiceDeployInfoList[i] = new ServiceDeployInfo(source.ServiceDeployInfoList[i]);
            }
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.NeedCdbAudit != null) {
            this.NeedCdbAudit = new Long(source.NeedCdbAudit);
        }
        if (source.ContainerExtraConf != null) {
            this.ContainerExtraConf = new ContainerExtraConf(source.ContainerExtraConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SoftInfo.", this.SoftInfo);
        this.setParamSimple(map, prefix + "CdbAutoRenew", this.CdbAutoRenew);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamArrayObj(map, prefix + "ExternalService.", this.ExternalService);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "CloudResources.", this.CloudResources);
        this.setParamArrayObj(map, prefix + "ServiceDeployInfoList.", this.ServiceDeployInfoList);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamObj(map, prefix + "ContainerExtraConf.", this.ContainerExtraConf);

    }
}

