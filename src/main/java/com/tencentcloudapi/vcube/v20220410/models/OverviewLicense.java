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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewLicense extends AbstractModel {

    /**
    * 所属应用
    */
    @SerializedName("Application")
    @Expose
    private OverviewAppInfo Application;

    /**
    * license生效时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * license失效时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * license对应的功能Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeatureId")
    @Expose
    private Long FeatureId;

    /**
    * license是测试：test还是正式：formal
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * license索引
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * license名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 返回还有多少秒过期，过期返回负值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestTime")
    @Expose
    private Long RestTime;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 优图套餐名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Plan")
    @Expose
    private String Plan;

    /**
    * licenseType
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 所属应用 
     * @return Application 所属应用
     */
    public OverviewAppInfo getApplication() {
        return this.Application;
    }

    /**
     * Set 所属应用
     * @param Application 所属应用
     */
    public void setApplication(OverviewAppInfo Application) {
        this.Application = Application;
    }

    /**
     * Get license生效时间 
     * @return StartTime license生效时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set license生效时间
     * @param StartTime license生效时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get license失效时间 
     * @return EndTime license失效时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set license失效时间
     * @param EndTime license失效时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get license对应的功能Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeatureId license对应的功能Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFeatureId() {
        return this.FeatureId;
    }

    /**
     * Set license对应的功能Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeatureId license对应的功能Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatureId(Long FeatureId) {
        this.FeatureId = FeatureId;
    }

    /**
     * Get license是测试：test还是正式：formal 
     * @return LicenseType license是测试：test还是正式：formal
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set license是测试：test还是正式：formal
     * @param LicenseType license是测试：test还是正式：formal
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get license索引 
     * @return LicenseId license索引
     */
    public Long getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set license索引
     * @param LicenseId license索引
     */
    public void setLicenseId(Long LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get license名称 
     * @return Name license名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set license名称
     * @param Name license名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 返回还有多少秒过期，过期返回负值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestTime 返回还有多少秒过期，过期返回负值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestTime() {
        return this.RestTime;
    }

    /**
     * Set 返回还有多少秒过期，过期返回负值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestTime 返回还有多少秒过期，过期返回负值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestTime(Long RestTime) {
        this.RestTime = RestTime;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 优图套餐名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Plan 优图套餐名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlan() {
        return this.Plan;
    }

    /**
     * Set 优图套餐名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Plan 优图套餐名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlan(String Plan) {
        this.Plan = Plan;
    }

    /**
     * Get licenseType 
     * @return Type licenseType
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set licenseType
     * @param Type licenseType
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public OverviewLicense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewLicense(OverviewLicense source) {
        if (source.Application != null) {
            this.Application = new OverviewAppInfo(source.Application);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FeatureId != null) {
            this.FeatureId = new Long(source.FeatureId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RestTime != null) {
            this.RestTime = new Long(source.RestTime);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Plan != null) {
            this.Plan = new String(source.Plan);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Application.", this.Application);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FeatureId", this.FeatureId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RestTime", this.RestTime);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Plan", this.Plan);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

