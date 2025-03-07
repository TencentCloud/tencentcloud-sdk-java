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

public class SimpleApplication extends AbstractModel {

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
    * 应用类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 应用微服务类型
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * ApplicationDesc
    */
    @SerializedName("ApplicationDesc")
    @Expose
    private String ApplicationDesc;

    /**
    * ProgLang
    */
    @SerializedName("ProgLang")
    @Expose
    private String ProgLang;

    /**
    * ApplicationResourceType
    */
    @SerializedName("ApplicationResourceType")
    @Expose
    private String ApplicationResourceType;

    /**
    * CreateTime
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * UpdateTime
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * ApigatewayServiceId
    */
    @SerializedName("ApigatewayServiceId")
    @Expose
    private String ApigatewayServiceId;

    /**
    * ApplicationRuntimeType
    */
    @SerializedName("ApplicationRuntimeType")
    @Expose
    private String ApplicationRuntimeType;

    /**
    * Apm业务系统id
    */
    @SerializedName("AmpInstanceId")
    @Expose
    private String AmpInstanceId;

    /**
    * Apm业务系统Name
    */
    @SerializedName("ApmInstanceName")
    @Expose
    private String ApmInstanceName;

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
     * Get 应用微服务类型 
     * @return MicroserviceType 应用微服务类型
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 应用微服务类型
     * @param MicroserviceType 应用微服务类型
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get ApplicationDesc 
     * @return ApplicationDesc ApplicationDesc
     */
    public String getApplicationDesc() {
        return this.ApplicationDesc;
    }

    /**
     * Set ApplicationDesc
     * @param ApplicationDesc ApplicationDesc
     */
    public void setApplicationDesc(String ApplicationDesc) {
        this.ApplicationDesc = ApplicationDesc;
    }

    /**
     * Get ProgLang 
     * @return ProgLang ProgLang
     */
    public String getProgLang() {
        return this.ProgLang;
    }

    /**
     * Set ProgLang
     * @param ProgLang ProgLang
     */
    public void setProgLang(String ProgLang) {
        this.ProgLang = ProgLang;
    }

    /**
     * Get ApplicationResourceType 
     * @return ApplicationResourceType ApplicationResourceType
     */
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * Set ApplicationResourceType
     * @param ApplicationResourceType ApplicationResourceType
     */
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * Get CreateTime 
     * @return CreateTime CreateTime
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CreateTime
     * @param CreateTime CreateTime
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get UpdateTime 
     * @return UpdateTime UpdateTime
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set UpdateTime
     * @param UpdateTime UpdateTime
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get ApigatewayServiceId 
     * @return ApigatewayServiceId ApigatewayServiceId
     */
    public String getApigatewayServiceId() {
        return this.ApigatewayServiceId;
    }

    /**
     * Set ApigatewayServiceId
     * @param ApigatewayServiceId ApigatewayServiceId
     */
    public void setApigatewayServiceId(String ApigatewayServiceId) {
        this.ApigatewayServiceId = ApigatewayServiceId;
    }

    /**
     * Get ApplicationRuntimeType 
     * @return ApplicationRuntimeType ApplicationRuntimeType
     */
    public String getApplicationRuntimeType() {
        return this.ApplicationRuntimeType;
    }

    /**
     * Set ApplicationRuntimeType
     * @param ApplicationRuntimeType ApplicationRuntimeType
     */
    public void setApplicationRuntimeType(String ApplicationRuntimeType) {
        this.ApplicationRuntimeType = ApplicationRuntimeType;
    }

    /**
     * Get Apm业务系统id 
     * @return AmpInstanceId Apm业务系统id
     */
    public String getAmpInstanceId() {
        return this.AmpInstanceId;
    }

    /**
     * Set Apm业务系统id
     * @param AmpInstanceId Apm业务系统id
     */
    public void setAmpInstanceId(String AmpInstanceId) {
        this.AmpInstanceId = AmpInstanceId;
    }

    /**
     * Get Apm业务系统Name 
     * @return ApmInstanceName Apm业务系统Name
     */
    public String getApmInstanceName() {
        return this.ApmInstanceName;
    }

    /**
     * Set Apm业务系统Name
     * @param ApmInstanceName Apm业务系统Name
     */
    public void setApmInstanceName(String ApmInstanceName) {
        this.ApmInstanceName = ApmInstanceName;
    }

    public SimpleApplication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleApplication(SimpleApplication source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.ApplicationDesc != null) {
            this.ApplicationDesc = new String(source.ApplicationDesc);
        }
        if (source.ProgLang != null) {
            this.ProgLang = new String(source.ProgLang);
        }
        if (source.ApplicationResourceType != null) {
            this.ApplicationResourceType = new String(source.ApplicationResourceType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ApigatewayServiceId != null) {
            this.ApigatewayServiceId = new String(source.ApigatewayServiceId);
        }
        if (source.ApplicationRuntimeType != null) {
            this.ApplicationRuntimeType = new String(source.ApplicationRuntimeType);
        }
        if (source.AmpInstanceId != null) {
            this.AmpInstanceId = new String(source.AmpInstanceId);
        }
        if (source.ApmInstanceName != null) {
            this.ApmInstanceName = new String(source.ApmInstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamSimple(map, prefix + "ApplicationDesc", this.ApplicationDesc);
        this.setParamSimple(map, prefix + "ProgLang", this.ProgLang);
        this.setParamSimple(map, prefix + "ApplicationResourceType", this.ApplicationResourceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ApigatewayServiceId", this.ApigatewayServiceId);
        this.setParamSimple(map, prefix + "ApplicationRuntimeType", this.ApplicationRuntimeType);
        this.setParamSimple(map, prefix + "AmpInstanceId", this.AmpInstanceId);
        this.setParamSimple(map, prefix + "ApmInstanceName", this.ApmInstanceName);

    }
}

