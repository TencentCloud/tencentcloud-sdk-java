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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationForPage extends AbstractModel{

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 编程语言
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgLang")
    @Expose
    private String ProgLang;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 应用资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationResourceType")
    @Expose
    private String ApplicationResourceType;

    /**
    * 应用runtime类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationRuntimeType")
    @Expose
    private String ApplicationRuntimeType;

    /**
    * Apigateway的serviceId
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 微服务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceType 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceType 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get 编程语言
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgLang 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgLang() {
        return this.ProgLang;
    }

    /**
     * Set 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgLang 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgLang(String ProgLang) {
        this.ProgLang = ProgLang;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 应用资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationResourceType 应用资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * Set 应用资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationResourceType 应用资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * Get 应用runtime类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationRuntimeType 应用runtime类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationRuntimeType() {
        return this.ApplicationRuntimeType;
    }

    /**
     * Set 应用runtime类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationRuntimeType 应用runtime类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationRuntimeType(String ApplicationRuntimeType) {
        this.ApplicationRuntimeType = ApplicationRuntimeType;
    }

    /**
     * Get Apigateway的serviceId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApigatewayServiceId Apigateway的serviceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApigatewayServiceId() {
        return this.ApigatewayServiceId;
    }

    /**
     * Set Apigateway的serviceId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApigatewayServiceId Apigateway的serviceId
注意：此字段可能返回 null，表示取不到有效值。
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

    }
}

