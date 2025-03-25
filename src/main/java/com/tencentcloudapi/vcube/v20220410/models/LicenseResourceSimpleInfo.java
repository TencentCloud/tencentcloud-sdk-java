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

public class LicenseResourceSimpleInfo extends AbstractModel {

    /**
    * 授权功能Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 有效期时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 功能Id
    */
    @SerializedName("FeatureId")
    @Expose
    private Long FeatureId;

    /**
    * 此license资源的开始生效时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 此license资源的生效结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
    * 此资源是否可用于续期和更新有效期
    */
    @SerializedName("IsUse")
    @Expose
    private Boolean IsUse;

    /**
    * 此资源的状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 销毁时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTimestamp")
    @Expose
    private String IsolatedTimestamp;

    /**
    * 功能模块名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 功能模块类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资源包信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Package")
    @Expose
    private Package Package;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 自动续费状态
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get 授权功能Id 
     * @return Id 授权功能Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 授权功能Id
     * @param Id 授权功能Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 有效期时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 有效期时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 有效期时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 有效期时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 功能Id 
     * @return FeatureId 功能Id
     */
    public Long getFeatureId() {
        return this.FeatureId;
    }

    /**
     * Set 功能Id
     * @param FeatureId 功能Id
     */
    public void setFeatureId(Long FeatureId) {
        this.FeatureId = FeatureId;
    }

    /**
     * Get 此license资源的开始生效时间 
     * @return StartTime 此license资源的开始生效时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 此license资源的开始生效时间
     * @param StartTime 此license资源的开始生效时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 此license资源的生效结束时间 
     * @return EndTime 此license资源的生效结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 此license资源的生效结束时间
     * @param EndTime 此license资源的生效结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 此资源是否可用于续期和更新有效期 
     * @return IsUse 此资源是否可用于续期和更新有效期
     */
    public Boolean getIsUse() {
        return this.IsUse;
    }

    /**
     * Set 此资源是否可用于续期和更新有效期
     * @param IsUse 此资源是否可用于续期和更新有效期
     */
    public void setIsUse(Boolean IsUse) {
        this.IsUse = IsUse;
    }

    /**
     * Get 此资源的状态 
     * @return Status 此资源的状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 此资源的状态
     * @param Status 此资源的状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 销毁时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTimestamp 销毁时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * Set 销毁时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTimestamp 销毁时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * Get 功能模块名称 
     * @return Name 功能模块名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 功能模块名称
     * @param Name 功能模块名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 功能模块类型 
     * @return Type 功能模块类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 功能模块类型
     * @param Type 功能模块类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资源包信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Package 资源包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Package getPackage() {
        return this.Package;
    }

    /**
     * Set 资源包信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Package 资源包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackage(Package Package) {
        this.Package = Package;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 自动续费状态 
     * @return AutoRenewFlag 自动续费状态
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费状态
     * @param AutoRenewFlag 自动续费状态
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public LicenseResourceSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseResourceSimpleInfo(LicenseResourceSimpleInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.FeatureId != null) {
            this.FeatureId = new Long(source.FeatureId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.IsUse != null) {
            this.IsUse = new Boolean(source.IsUse);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsolatedTimestamp != null) {
            this.IsolatedTimestamp = new String(source.IsolatedTimestamp);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Package != null) {
            this.Package = new Package(source.Package);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "FeatureId", this.FeatureId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "IsUse", this.IsUse);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsolatedTimestamp", this.IsolatedTimestamp);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Package.", this.Package);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

