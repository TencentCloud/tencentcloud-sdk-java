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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class License extends AbstractModel {

    /**
    * license类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 老系统迁移备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
    * 测试license 是否可以续期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Renewal")
    @Expose
    private Boolean Renewal;

    /**
    * license索引
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * license名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 测试license 是否升级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Update")
    @Expose
    private Boolean Update;

    /**
    * 兼容老的licenseUrl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldLicenseUrl")
    @Expose
    private String OldLicenseUrl;

    /**
    * 视立方url分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Group")
    @Expose
    private Long Group;

    /**
    * 过期：true ，未过期：其它
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * 返回还有多少秒过期，过期返回0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestTime")
    @Expose
    private Long RestTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 计费资源相关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private RenewResource Resource;

    /**
    * 是否为马甲包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVest")
    @Expose
    private Boolean IsVest;

    /**
     * Get license类型 
     * @return Type license类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set license类型
     * @param Type license类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 老系统迁移备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 老系统迁移备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 老系统迁移备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 老系统迁移备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * @return FeatureId license对应的功能Id
     */
    public Long getFeatureId() {
        return this.FeatureId;
    }

    /**
     * Set license对应的功能Id
     * @param FeatureId license对应的功能Id
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
     * Get 测试license 是否可以续期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Renewal 测试license 是否可以续期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRenewal() {
        return this.Renewal;
    }

    /**
     * Set 测试license 是否可以续期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Renewal 测试license 是否可以续期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewal(Boolean Renewal) {
        this.Renewal = Renewal;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name license名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set license名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name license名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 测试license 是否升级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Update 测试license 是否升级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUpdate() {
        return this.Update;
    }

    /**
     * Set 测试license 是否升级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Update 测试license 是否升级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdate(Boolean Update) {
        this.Update = Update;
    }

    /**
     * Get 兼容老的licenseUrl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldLicenseUrl 兼容老的licenseUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldLicenseUrl() {
        return this.OldLicenseUrl;
    }

    /**
     * Set 兼容老的licenseUrl
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldLicenseUrl 兼容老的licenseUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldLicenseUrl(String OldLicenseUrl) {
        this.OldLicenseUrl = OldLicenseUrl;
    }

    /**
     * Get 视立方url分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Group 视立方url分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroup() {
        return this.Group;
    }

    /**
     * Set 视立方url分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Group 视立方url分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroup(Long Group) {
        this.Group = Group;
    }

    /**
     * Get 过期：true ，未过期：其它
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expired 过期：true ，未过期：其它
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set 过期：true ，未过期：其它
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expired 过期：true ，未过期：其它
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get 返回还有多少秒过期，过期返回0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestTime 返回还有多少秒过期，过期返回0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestTime() {
        return this.RestTime;
    }

    /**
     * Set 返回还有多少秒过期，过期返回0
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestTime 返回还有多少秒过期，过期返回0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestTime(Long RestTime) {
        this.RestTime = RestTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 计费资源相关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 计费资源相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RenewResource getResource() {
        return this.Resource;
    }

    /**
     * Set 计费资源相关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 计费资源相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(RenewResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 是否为马甲包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVest 是否为马甲包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVest() {
        return this.IsVest;
    }

    /**
     * Set 是否为马甲包
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVest 是否为马甲包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVest(Boolean IsVest) {
        this.IsVest = IsVest;
    }

    public License() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public License(License source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        if (source.Renewal != null) {
            this.Renewal = new Boolean(source.Renewal);
        }
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Update != null) {
            this.Update = new Boolean(source.Update);
        }
        if (source.OldLicenseUrl != null) {
            this.OldLicenseUrl = new String(source.OldLicenseUrl);
        }
        if (source.Group != null) {
            this.Group = new Long(source.Group);
        }
        if (source.Expired != null) {
            this.Expired = new Boolean(source.Expired);
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
        if (source.Resource != null) {
            this.Resource = new RenewResource(source.Resource);
        }
        if (source.IsVest != null) {
            this.IsVest = new Boolean(source.IsVest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FeatureId", this.FeatureId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "Renewal", this.Renewal);
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Update", this.Update);
        this.setParamSimple(map, prefix + "OldLicenseUrl", this.OldLicenseUrl);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "RestTime", this.RestTime);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "IsVest", this.IsVest);

    }
}

