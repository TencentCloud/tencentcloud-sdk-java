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

public class ModifyApplicationRequest extends AbstractModel {

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
    * 应用备注
    */
    @SerializedName("ApplicationDesc")
    @Expose
    private String ApplicationDesc;

    /**
    * 应用备注名
    */
    @SerializedName("ApplicationRemarkName")
    @Expose
    private String ApplicationRemarkName;

    /**
    * 服务配置信息列表
    */
    @SerializedName("ServiceConfigList")
    @Expose
    private ServiceConfig [] ServiceConfigList;

    /**
    * 应用的微服务类型
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 注册配置治理信息
    */
    @SerializedName("ServiceGovernanceConfig")
    @Expose
    private ServiceGovernanceConfig ServiceGovernanceConfig;

    /**
    * 应用开发框架
    */
    @SerializedName("FrameworkType")
    @Expose
    private String FrameworkType;

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
     * Get 应用备注 
     * @return ApplicationDesc 应用备注
     */
    public String getApplicationDesc() {
        return this.ApplicationDesc;
    }

    /**
     * Set 应用备注
     * @param ApplicationDesc 应用备注
     */
    public void setApplicationDesc(String ApplicationDesc) {
        this.ApplicationDesc = ApplicationDesc;
    }

    /**
     * Get 应用备注名 
     * @return ApplicationRemarkName 应用备注名
     */
    public String getApplicationRemarkName() {
        return this.ApplicationRemarkName;
    }

    /**
     * Set 应用备注名
     * @param ApplicationRemarkName 应用备注名
     */
    public void setApplicationRemarkName(String ApplicationRemarkName) {
        this.ApplicationRemarkName = ApplicationRemarkName;
    }

    /**
     * Get 服务配置信息列表 
     * @return ServiceConfigList 服务配置信息列表
     */
    public ServiceConfig [] getServiceConfigList() {
        return this.ServiceConfigList;
    }

    /**
     * Set 服务配置信息列表
     * @param ServiceConfigList 服务配置信息列表
     */
    public void setServiceConfigList(ServiceConfig [] ServiceConfigList) {
        this.ServiceConfigList = ServiceConfigList;
    }

    /**
     * Get 应用的微服务类型 
     * @return MicroserviceType 应用的微服务类型
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 应用的微服务类型
     * @param MicroserviceType 应用的微服务类型
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
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
     * Get 应用开发框架 
     * @return FrameworkType 应用开发框架
     */
    public String getFrameworkType() {
        return this.FrameworkType;
    }

    /**
     * Set 应用开发框架
     * @param FrameworkType 应用开发框架
     */
    public void setFrameworkType(String FrameworkType) {
        this.FrameworkType = FrameworkType;
    }

    public ModifyApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationRequest(ModifyApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationDesc != null) {
            this.ApplicationDesc = new String(source.ApplicationDesc);
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
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.ServiceGovernanceConfig != null) {
            this.ServiceGovernanceConfig = new ServiceGovernanceConfig(source.ServiceGovernanceConfig);
        }
        if (source.FrameworkType != null) {
            this.FrameworkType = new String(source.FrameworkType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationDesc", this.ApplicationDesc);
        this.setParamSimple(map, prefix + "ApplicationRemarkName", this.ApplicationRemarkName);
        this.setParamArrayObj(map, prefix + "ServiceConfigList.", this.ServiceConfigList);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamObj(map, prefix + "ServiceGovernanceConfig.", this.ServiceGovernanceConfig);
        this.setParamSimple(map, prefix + "FrameworkType", this.FrameworkType);

    }
}

