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

public class SimpleApplication  extends AbstractModel{

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
     * 获取应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * 设置应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * 获取应用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * 设置应用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * 获取应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return MicroserviceType 应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * 设置应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceType 应用微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * 获取ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationDesc ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationDesc() {
        return this.ApplicationDesc;
    }

    /**
     * 设置ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationDesc ApplicationDesc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationDesc(String ApplicationDesc) {
        this.ApplicationDesc = ApplicationDesc;
    }

    /**
     * 获取ProgLang
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProgLang ProgLang
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgLang() {
        return this.ProgLang;
    }

    /**
     * 设置ProgLang
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgLang ProgLang
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgLang(String ProgLang) {
        this.ProgLang = ProgLang;
    }

    /**
     * 获取ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationResourceType ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * 设置ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationResourceType ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * 获取CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     * @return CreateTime CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取UpdateTime
注意：此字段可能返回 null，表示取不到有效值。
     * @return UpdateTime UpdateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置UpdateTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime UpdateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

