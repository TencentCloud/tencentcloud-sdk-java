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

public class InferenceModelInfo extends AbstractModel {

    /**
    * <p>Model ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>模型业务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
    * <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>支持的引擎</p>
    */
    @SerializedName("SupportedEngines")
    @Expose
    private String [] SupportedEngines;

    /**
    * <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterSize")
    @Expose
    private String ParameterSize;

    /**
    * <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>最新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * <p>版本总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionCount")
    @Expose
    private Long VersionCount;

    /**
    * <p>关联的推理服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>是否有存储（内置模型和用户上传模型均为 true）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasStorage")
    @Expose
    private Boolean HasStorage;

    /**
    * <p>存储地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p>是否使用用户自带存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasCustomStorage")
    @Expose
    private Boolean HasCustomStorage;

    /**
    * <p>存储后端类型（如 COS、GOOSEFS、CFSTURBO）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuiltIn")
    @Expose
    private Boolean BuiltIn;

    /**
    * <p>任务类型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
    * <p>云账户的 APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>云账户的 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

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
    * <p>云账户的 Sub UIN</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
     * Get <p>Model ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId <p>Model ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>Model ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId <p>Model ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>模型业务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelUid <p>模型业务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>模型业务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelUid <p>模型业务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    /**
     * Get <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Provider <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Provider <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelType <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelType <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>支持的引擎</p> 
     * @return SupportedEngines <p>支持的引擎</p>
     */
    public String [] getSupportedEngines() {
        return this.SupportedEngines;
    }

    /**
     * Set <p>支持的引擎</p>
     * @param SupportedEngines <p>支持的引擎</p>
     */
    public void setSupportedEngines(String [] SupportedEngines) {
        this.SupportedEngines = SupportedEngines;
    }

    /**
     * Get <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterSize <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterSize() {
        return this.ParameterSize;
    }

    /**
     * Set <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterSize <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterSize(String ParameterSize) {
        this.ParameterSize = ParameterSize;
    }

    /**
     * Get <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>最新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersion <p>最新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set <p>最新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersion <p>最新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get <p>版本总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionCount <p>版本总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionCount() {
        return this.VersionCount;
    }

    /**
     * Set <p>版本总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionCount <p>版本总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionCount(Long VersionCount) {
        this.VersionCount = VersionCount;
    }

    /**
     * Get <p>关联的推理服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCount <p>关联的推理服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>关联的推理服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCount <p>关联的推理服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>是否有存储（内置模型和用户上传模型均为 true）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasStorage <p>是否有存储（内置模型和用户上传模型均为 true）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasStorage() {
        return this.HasStorage;
    }

    /**
     * Set <p>是否有存储（内置模型和用户上传模型均为 true）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasStorage <p>是否有存储（内置模型和用户上传模型均为 true）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasStorage(Boolean HasStorage) {
        this.HasStorage = HasStorage;
    }

    /**
     * Get <p>存储地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageRegion <p>存储地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>存储地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageRegion <p>存储地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p>是否使用用户自带存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasCustomStorage <p>是否使用用户自带存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasCustomStorage() {
        return this.HasCustomStorage;
    }

    /**
     * Set <p>是否使用用户自带存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasCustomStorage <p>是否使用用户自带存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasCustomStorage(Boolean HasCustomStorage) {
        this.HasCustomStorage = HasCustomStorage;
    }

    /**
     * Get <p>存储后端类型（如 COS、GOOSEFS、CFSTURBO）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType <p>存储后端类型（如 COS、GOOSEFS、CFSTURBO）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储后端类型（如 COS、GOOSEFS、CFSTURBO）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType <p>存储后端类型（如 COS、GOOSEFS、CFSTURBO）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuiltIn <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBuiltIn() {
        return this.BuiltIn;
    }

    /**
     * Set <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuiltIn <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuiltIn(Boolean BuiltIn) {
        this.BuiltIn = BuiltIn;
    }

    /**
     * Get <p>任务类型列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks <p>任务类型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务类型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks <p>任务类型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>云账户的 APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>云账户的 APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>云账户的 APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>云账户的 APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>云账户的 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin <p>云账户的 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>云账户的 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin <p>云账户的 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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
     * Get <p>云账户的 Sub UIN</p> 
     * @return SubAccountUin <p>云账户的 Sub UIN</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>云账户的 Sub UIN</p>
     * @param SubAccountUin <p>云账户的 Sub UIN</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    public InferenceModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceModelInfo(InferenceModelInfo source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.SupportedEngines != null) {
            this.SupportedEngines = new String[source.SupportedEngines.length];
            for (int i = 0; i < source.SupportedEngines.length; i++) {
                this.SupportedEngines[i] = new String(source.SupportedEngines[i]);
            }
        }
        if (source.ParameterSize != null) {
            this.ParameterSize = new String(source.ParameterSize);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.VersionCount != null) {
            this.VersionCount = new Long(source.VersionCount);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.HasStorage != null) {
            this.HasStorage = new Boolean(source.HasStorage);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.HasCustomStorage != null) {
            this.HasCustomStorage = new Boolean(source.HasCustomStorage);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.BuiltIn != null) {
            this.BuiltIn = new Boolean(source.BuiltIn);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamArraySimple(map, prefix + "SupportedEngines.", this.SupportedEngines);
        this.setParamSimple(map, prefix + "ParameterSize", this.ParameterSize);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "VersionCount", this.VersionCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "HasStorage", this.HasStorage);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "HasCustomStorage", this.HasCustomStorage);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "BuiltIn", this.BuiltIn);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

