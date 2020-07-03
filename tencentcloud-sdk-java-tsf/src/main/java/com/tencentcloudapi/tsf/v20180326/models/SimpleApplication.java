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

public class SimpleApplication extends AbstractModel{

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
    * 应用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationDesc")
    @Expose
    private String ApplicationDesc;

    /**
    * ProgLang
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgLang")
    @Expose
    private String ProgLang;

    /**
    * ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationResourceType")
    @Expose
    private String ApplicationResourceType;

    /**
    * CreateTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * UpdateTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * ApigatewayServiceId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApigatewayServiceId")
    @Expose
    private String ApigatewayServiceId;

    /**
    * ApplicationRuntimeType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationRuntimeType")
    @Expose
    private String ApplicationRuntimeType;

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
     * Get 应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceType 应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceType 应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationDesc ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationDesc() {
        return this.ApplicationDesc;
    }

    /**
     * Set ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationDesc ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationDesc(String ApplicationDesc) {
        this.ApplicationDesc = ApplicationDesc;
    }

    /**
     * Get ProgLang
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgLang ProgLang
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgLang() {
        return this.ProgLang;
    }

    /**
     * Set ProgLang
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgLang ProgLang
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgLang(String ProgLang) {
        this.ProgLang = ProgLang;
    }

    /**
     * Get ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationResourceType ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * Set ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationResourceType ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * Get CreateTime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get UpdateTime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime UpdateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set UpdateTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime UpdateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get ApigatewayServiceId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApigatewayServiceId ApigatewayServiceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApigatewayServiceId() {
        return this.ApigatewayServiceId;
    }

    /**
     * Set ApigatewayServiceId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApigatewayServiceId ApigatewayServiceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApigatewayServiceId(String ApigatewayServiceId) {
        this.ApigatewayServiceId = ApigatewayServiceId;
    }

    /**
     * Get ApplicationRuntimeType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationRuntimeType ApplicationRuntimeType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationRuntimeType() {
        return this.ApplicationRuntimeType;
    }

    /**
     * Set ApplicationRuntimeType
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationRuntimeType ApplicationRuntimeType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationRuntimeType(String ApplicationRuntimeType) {
        this.ApplicationRuntimeType = ApplicationRuntimeType;
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

    }
}

