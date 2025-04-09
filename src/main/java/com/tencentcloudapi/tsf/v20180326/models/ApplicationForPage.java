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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationForPage extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 应用描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationDesc")
    @Expose
    private String ApplicationDesc;

    /**
    * 应用类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 微服务类型
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 编程语言
    */
    @SerializedName("ProgLang")
    @Expose
    private String ProgLang;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 应用资源类型
    */
    @SerializedName("ApplicationResourceType")
    @Expose
    private String ApplicationResourceType;

    /**
    * 应用runtime类型
    */
    @SerializedName("ApplicationRuntimeType")
    @Expose
    private String ApplicationRuntimeType;

    /**
    * Apigateway的serviceId
    */
    @SerializedName("ApigatewayServiceId")
    @Expose
    private String ApigatewayServiceId;

    /**
    * 应用备注名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationRemarkName")
    @Expose
    private String ApplicationRemarkName;

    /**
    * 服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceConfigList")
    @Expose
    private ServiceConfig [] ServiceConfigList;

    /**
    * IgnoreCreateImageRepository
    */
    @SerializedName("IgnoreCreateImageRepository")
    @Expose
    private Boolean IgnoreCreateImageRepository;

    /**
    * Apm业务系统id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApmInstanceId")
    @Expose
    private String ApmInstanceId;

    /**
    * Apm业务系统Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApmInstanceName")
    @Expose
    private String ApmInstanceName;

    /**
    * 同步删除镜像仓库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncDeleteImageRepository")
    @Expose
    private Boolean SyncDeleteImageRepository;

    /**
    * 应用微服务子类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceSubType")
    @Expose
    private String MicroserviceSubType;

    /**
    * 应用编程语言类型
    */
    @SerializedName("ProgramLanguage")
    @Expose
    private String ProgramLanguage;

    /**
    * 开发框架类型[SpringCloud，Dubbo，Go-GRPC，Other]
    */
    @SerializedName("FrameworkType")
    @Expose
    private String FrameworkType;

    /**
    * 注册配置治理信息
    */
    @SerializedName("ServiceGovernanceConfig")
    @Expose
    private ServiceGovernanceConfig ServiceGovernanceConfig;

    /**
    * 微服务类型列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceTypeList")
    @Expose
    private String [] MicroserviceTypeList;

    /**
    * 是否同时创建镜像仓库
    */
    @SerializedName("CreateSameNameImageRepository")
    @Expose
    private Boolean CreateSameNameImageRepository;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称 
     * @return ApplicationName 应用名称
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
     * @param ApplicationName 应用名称
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 应用描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationDesc 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationDesc() {
        return this.ApplicationDesc;
    }

    /**
     * Set 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationDesc 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationDesc(String ApplicationDesc) {
        this.ApplicationDesc = ApplicationDesc;
    }

    /**
     * Get 应用类型 
     * @return ApplicationType 应用类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型
     * @param ApplicationType 应用类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 微服务类型 
     * @return MicroserviceType 微服务类型
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 微服务类型
     * @param MicroserviceType 微服务类型
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get 编程语言 
     * @return ProgLang 编程语言
     */
    public String getProgLang() {
        return this.ProgLang;
    }

    /**
     * Set 编程语言
     * @param ProgLang 编程语言
     */
    public void setProgLang(String ProgLang) {
        this.ProgLang = ProgLang;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 应用资源类型 
     * @return ApplicationResourceType 应用资源类型
     */
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * Set 应用资源类型
     * @param ApplicationResourceType 应用资源类型
     */
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * Get 应用runtime类型 
     * @return ApplicationRuntimeType 应用runtime类型
     */
    public String getApplicationRuntimeType() {
        return this.ApplicationRuntimeType;
    }

    /**
     * Set 应用runtime类型
     * @param ApplicationRuntimeType 应用runtime类型
     */
    public void setApplicationRuntimeType(String ApplicationRuntimeType) {
        this.ApplicationRuntimeType = ApplicationRuntimeType;
    }

    /**
     * Get Apigateway的serviceId 
     * @return ApigatewayServiceId Apigateway的serviceId
     */
    public String getApigatewayServiceId() {
        return this.ApigatewayServiceId;
    }

    /**
     * Set Apigateway的serviceId
     * @param ApigatewayServiceId Apigateway的serviceId
     */
    public void setApigatewayServiceId(String ApigatewayServiceId) {
        this.ApigatewayServiceId = ApigatewayServiceId;
    }

    /**
     * Get 应用备注名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationRemarkName 应用备注名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationRemarkName() {
        return this.ApplicationRemarkName;
    }

    /**
     * Set 应用备注名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationRemarkName 应用备注名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationRemarkName(String ApplicationRemarkName) {
        this.ApplicationRemarkName = ApplicationRemarkName;
    }

    /**
     * Get 服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceConfigList 服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceConfig [] getServiceConfigList() {
        return this.ServiceConfigList;
    }

    /**
     * Set 服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceConfigList 服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceConfigList(ServiceConfig [] ServiceConfigList) {
        this.ServiceConfigList = ServiceConfigList;
    }

    /**
     * Get IgnoreCreateImageRepository 
     * @return IgnoreCreateImageRepository IgnoreCreateImageRepository
     */
    public Boolean getIgnoreCreateImageRepository() {
        return this.IgnoreCreateImageRepository;
    }

    /**
     * Set IgnoreCreateImageRepository
     * @param IgnoreCreateImageRepository IgnoreCreateImageRepository
     */
    public void setIgnoreCreateImageRepository(Boolean IgnoreCreateImageRepository) {
        this.IgnoreCreateImageRepository = IgnoreCreateImageRepository;
    }

    /**
     * Get Apm业务系统id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApmInstanceId Apm业务系统id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApmInstanceId() {
        return this.ApmInstanceId;
    }

    /**
     * Set Apm业务系统id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApmInstanceId Apm业务系统id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApmInstanceId(String ApmInstanceId) {
        this.ApmInstanceId = ApmInstanceId;
    }

    /**
     * Get Apm业务系统Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApmInstanceName Apm业务系统Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApmInstanceName() {
        return this.ApmInstanceName;
    }

    /**
     * Set Apm业务系统Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApmInstanceName Apm业务系统Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApmInstanceName(String ApmInstanceName) {
        this.ApmInstanceName = ApmInstanceName;
    }

    /**
     * Get 同步删除镜像仓库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncDeleteImageRepository 同步删除镜像仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSyncDeleteImageRepository() {
        return this.SyncDeleteImageRepository;
    }

    /**
     * Set 同步删除镜像仓库
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncDeleteImageRepository 同步删除镜像仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncDeleteImageRepository(Boolean SyncDeleteImageRepository) {
        this.SyncDeleteImageRepository = SyncDeleteImageRepository;
    }

    /**
     * Get 应用微服务子类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceSubType 应用微服务子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceSubType() {
        return this.MicroserviceSubType;
    }

    /**
     * Set 应用微服务子类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceSubType 应用微服务子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceSubType(String MicroserviceSubType) {
        this.MicroserviceSubType = MicroserviceSubType;
    }

    /**
     * Get 应用编程语言类型 
     * @return ProgramLanguage 应用编程语言类型
     */
    public String getProgramLanguage() {
        return this.ProgramLanguage;
    }

    /**
     * Set 应用编程语言类型
     * @param ProgramLanguage 应用编程语言类型
     */
    public void setProgramLanguage(String ProgramLanguage) {
        this.ProgramLanguage = ProgramLanguage;
    }

    /**
     * Get 开发框架类型[SpringCloud，Dubbo，Go-GRPC，Other] 
     * @return FrameworkType 开发框架类型[SpringCloud，Dubbo，Go-GRPC，Other]
     */
    public String getFrameworkType() {
        return this.FrameworkType;
    }

    /**
     * Set 开发框架类型[SpringCloud，Dubbo，Go-GRPC，Other]
     * @param FrameworkType 开发框架类型[SpringCloud，Dubbo，Go-GRPC，Other]
     */
    public void setFrameworkType(String FrameworkType) {
        this.FrameworkType = FrameworkType;
    }

    /**
     * Get 注册配置治理信息 
     * @return ServiceGovernanceConfig 注册配置治理信息
     */
    public ServiceGovernanceConfig getServiceGovernanceConfig() {
        return this.ServiceGovernanceConfig;
    }

    /**
     * Set 注册配置治理信息
     * @param ServiceGovernanceConfig 注册配置治理信息
     */
    public void setServiceGovernanceConfig(ServiceGovernanceConfig ServiceGovernanceConfig) {
        this.ServiceGovernanceConfig = ServiceGovernanceConfig;
    }

    /**
     * Get 微服务类型列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceTypeList 微服务类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMicroserviceTypeList() {
        return this.MicroserviceTypeList;
    }

    /**
     * Set 微服务类型列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceTypeList 微服务类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceTypeList(String [] MicroserviceTypeList) {
        this.MicroserviceTypeList = MicroserviceTypeList;
    }

    /**
     * Get 是否同时创建镜像仓库 
     * @return CreateSameNameImageRepository 是否同时创建镜像仓库
     */
    public Boolean getCreateSameNameImageRepository() {
        return this.CreateSameNameImageRepository;
    }

    /**
     * Set 是否同时创建镜像仓库
     * @param CreateSameNameImageRepository 是否同时创建镜像仓库
     */
    public void setCreateSameNameImageRepository(Boolean CreateSameNameImageRepository) {
        this.CreateSameNameImageRepository = CreateSameNameImageRepository;
    }

    public ApplicationForPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationForPage(ApplicationForPage source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationDesc != null) {
            this.ApplicationDesc = new String(source.ApplicationDesc);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.ProgLang != null) {
            this.ProgLang = new String(source.ProgLang);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ApplicationResourceType != null) {
            this.ApplicationResourceType = new String(source.ApplicationResourceType);
        }
        if (source.ApplicationRuntimeType != null) {
            this.ApplicationRuntimeType = new String(source.ApplicationRuntimeType);
        }
        if (source.ApigatewayServiceId != null) {
            this.ApigatewayServiceId = new String(source.ApigatewayServiceId);
        }
        if (source.ApplicationRemarkName != null) {
            this.ApplicationRemarkName = new String(source.ApplicationRemarkName);
        }
        if (source.ServiceConfigList != null) {
            this.ServiceConfigList = new ServiceConfig[source.ServiceConfigList.length];
            for (int i = 0; i < source.ServiceConfigList.length; i++) {
                this.ServiceConfigList[i] = new ServiceConfig(source.ServiceConfigList[i]);
            }
        }
        if (source.IgnoreCreateImageRepository != null) {
            this.IgnoreCreateImageRepository = new Boolean(source.IgnoreCreateImageRepository);
        }
        if (source.ApmInstanceId != null) {
            this.ApmInstanceId = new String(source.ApmInstanceId);
        }
        if (source.ApmInstanceName != null) {
            this.ApmInstanceName = new String(source.ApmInstanceName);
        }
        if (source.SyncDeleteImageRepository != null) {
            this.SyncDeleteImageRepository = new Boolean(source.SyncDeleteImageRepository);
        }
        if (source.MicroserviceSubType != null) {
            this.MicroserviceSubType = new String(source.MicroserviceSubType);
        }
        if (source.ProgramLanguage != null) {
            this.ProgramLanguage = new String(source.ProgramLanguage);
        }
        if (source.FrameworkType != null) {
            this.FrameworkType = new String(source.FrameworkType);
        }
        if (source.ServiceGovernanceConfig != null) {
            this.ServiceGovernanceConfig = new ServiceGovernanceConfig(source.ServiceGovernanceConfig);
        }
        if (source.MicroserviceTypeList != null) {
            this.MicroserviceTypeList = new String[source.MicroserviceTypeList.length];
            for (int i = 0; i < source.MicroserviceTypeList.length; i++) {
                this.MicroserviceTypeList[i] = new String(source.MicroserviceTypeList[i]);
            }
        }
        if (source.CreateSameNameImageRepository != null) {
            this.CreateSameNameImageRepository = new Boolean(source.CreateSameNameImageRepository);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationDesc", this.ApplicationDesc);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamSimple(map, prefix + "ProgLang", this.ProgLang);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ApplicationResourceType", this.ApplicationResourceType);
        this.setParamSimple(map, prefix + "ApplicationRuntimeType", this.ApplicationRuntimeType);
        this.setParamSimple(map, prefix + "ApigatewayServiceId", this.ApigatewayServiceId);
        this.setParamSimple(map, prefix + "ApplicationRemarkName", this.ApplicationRemarkName);
        this.setParamArrayObj(map, prefix + "ServiceConfigList.", this.ServiceConfigList);
        this.setParamSimple(map, prefix + "IgnoreCreateImageRepository", this.IgnoreCreateImageRepository);
        this.setParamSimple(map, prefix + "ApmInstanceId", this.ApmInstanceId);
        this.setParamSimple(map, prefix + "ApmInstanceName", this.ApmInstanceName);
        this.setParamSimple(map, prefix + "SyncDeleteImageRepository", this.SyncDeleteImageRepository);
        this.setParamSimple(map, prefix + "MicroserviceSubType", this.MicroserviceSubType);
        this.setParamSimple(map, prefix + "ProgramLanguage", this.ProgramLanguage);
        this.setParamSimple(map, prefix + "FrameworkType", this.FrameworkType);
        this.setParamObj(map, prefix + "ServiceGovernanceConfig.", this.ServiceGovernanceConfig);
        this.setParamArraySimple(map, prefix + "MicroserviceTypeList.", this.MicroserviceTypeList);
        this.setParamSimple(map, prefix + "CreateSameNameImageRepository", this.CreateSameNameImageRepository);

    }
}

