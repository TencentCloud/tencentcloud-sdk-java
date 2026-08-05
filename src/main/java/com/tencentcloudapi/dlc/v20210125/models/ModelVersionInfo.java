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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelVersionInfo extends AbstractModel {

    /**
    * <p>版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>关联的模型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>版本号（如 v1, v2）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>该版本的存储 URI</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageUri")
    @Expose
    private String StorageUri;

    /**
    * <p>版本说明</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>关联的推理服务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkedServices")
    @Expose
    private LinkedServiceInfo [] LinkedServices;

    /**
    * <p>是否使用用户自带存储桶（true=用户自带桶，false=平台托管）</p>
    */
    @SerializedName("UseCustomStorage")
    @Expose
    private Boolean UseCustomStorage;

    /**
     * Get <p>版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId <p>版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId <p>版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>关联的模型ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId <p>关联的模型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>关联的模型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId <p>关联的模型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>版本号（如 v1, v2）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>版本号（如 v1, v2）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号（如 v1, v2）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>版本号（如 v1, v2）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>该版本的存储 URI</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageUri <p>该版本的存储 URI</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageUri() {
        return this.StorageUri;
    }

    /**
     * Set <p>该版本的存储 URI</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageUri <p>该版本的存储 URI</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageUri(String StorageUri) {
        this.StorageUri = StorageUri;
    }

    /**
     * Get <p>版本说明</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>版本说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>版本说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>版本说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>关联的推理服务列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkedServices <p>关联的推理服务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LinkedServiceInfo [] getLinkedServices() {
        return this.LinkedServices;
    }

    /**
     * Set <p>关联的推理服务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkedServices <p>关联的推理服务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkedServices(LinkedServiceInfo [] LinkedServices) {
        this.LinkedServices = LinkedServices;
    }

    /**
     * Get <p>是否使用用户自带存储桶（true=用户自带桶，false=平台托管）</p> 
     * @return UseCustomStorage <p>是否使用用户自带存储桶（true=用户自带桶，false=平台托管）</p>
     */
    public Boolean getUseCustomStorage() {
        return this.UseCustomStorage;
    }

    /**
     * Set <p>是否使用用户自带存储桶（true=用户自带桶，false=平台托管）</p>
     * @param UseCustomStorage <p>是否使用用户自带存储桶（true=用户自带桶，false=平台托管）</p>
     */
    public void setUseCustomStorage(Boolean UseCustomStorage) {
        this.UseCustomStorage = UseCustomStorage;
    }

    public ModelVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelVersionInfo(ModelVersionInfo source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.StorageUri != null) {
            this.StorageUri = new String(source.StorageUri);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.LinkedServices != null) {
            this.LinkedServices = new LinkedServiceInfo[source.LinkedServices.length];
            for (int i = 0; i < source.LinkedServices.length; i++) {
                this.LinkedServices[i] = new LinkedServiceInfo(source.LinkedServices[i]);
            }
        }
        if (source.UseCustomStorage != null) {
            this.UseCustomStorage = new Boolean(source.UseCustomStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "StorageUri", this.StorageUri);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "LinkedServices.", this.LinkedServices);
        this.setParamSimple(map, prefix + "UseCustomStorage", this.UseCustomStorage);

    }
}

