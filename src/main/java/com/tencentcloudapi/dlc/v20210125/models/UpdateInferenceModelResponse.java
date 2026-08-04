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

public class UpdateInferenceModelResponse extends AbstractModel {

    /**
    * <p>推理模型ID</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>推理模型UID</p>
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模型提供方</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>模型描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模型类型</p>
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>模型参数量</p>
    */
    @SerializedName("ParameterSize")
    @Expose
    private String ParameterSize;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>最新版本号</p>
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * <p>版本总数</p>
    */
    @SerializedName("VersionCount")
    @Expose
    private Long VersionCount;

    /**
    * <p>关联的推理服务数量</p>
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>是否有存储</p>
    */
    @SerializedName("HasStorage")
    @Expose
    private Boolean HasStorage;

    /**
    * <p>是否使用用户自带存储桶</p>
    */
    @SerializedName("HasCustomStorage")
    @Expose
    private Boolean HasCustomStorage;

    /**
    * <p>存储后端类型</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>是否内置模型</p>
    */
    @SerializedName("BuiltIn")
    @Expose
    private Boolean BuiltIn;

    /**
    * <p>任务类型列表</p>
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
    * <p>APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>SUB UIN</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>推理模型ID</p> 
     * @return ModelId <p>推理模型ID</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>推理模型ID</p>
     * @param ModelId <p>推理模型ID</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>推理模型UID</p> 
     * @return ModelUid <p>推理模型UID</p>
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>推理模型UID</p>
     * @param ModelUid <p>推理模型UID</p>
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    /**
     * Get <p>模型名称</p> 
     * @return Name <p>模型名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型名称</p>
     * @param Name <p>模型名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模型提供方</p> 
     * @return Provider <p>模型提供方</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>模型提供方</p>
     * @param Provider <p>模型提供方</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>模型描述</p> 
     * @return Description <p>模型描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模型描述</p>
     * @param Description <p>模型描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模型类型</p> 
     * @return ModelType <p>模型类型</p>
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型</p>
     * @param ModelType <p>模型类型</p>
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>模型参数量</p> 
     * @return ParameterSize <p>模型参数量</p>
     */
    public String getParameterSize() {
        return this.ParameterSize;
    }

    /**
     * Set <p>模型参数量</p>
     * @param ParameterSize <p>模型参数量</p>
     */
    public void setParameterSize(String ParameterSize) {
        this.ParameterSize = ParameterSize;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>最新版本号</p> 
     * @return LatestVersion <p>最新版本号</p>
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set <p>最新版本号</p>
     * @param LatestVersion <p>最新版本号</p>
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get <p>版本总数</p> 
     * @return VersionCount <p>版本总数</p>
     */
    public Long getVersionCount() {
        return this.VersionCount;
    }

    /**
     * Set <p>版本总数</p>
     * @param VersionCount <p>版本总数</p>
     */
    public void setVersionCount(Long VersionCount) {
        this.VersionCount = VersionCount;
    }

    /**
     * Get <p>关联的推理服务数量</p> 
     * @return ServiceCount <p>关联的推理服务数量</p>
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>关联的推理服务数量</p>
     * @param ServiceCount <p>关联的推理服务数量</p>
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>是否有存储</p> 
     * @return HasStorage <p>是否有存储</p>
     */
    public Boolean getHasStorage() {
        return this.HasStorage;
    }

    /**
     * Set <p>是否有存储</p>
     * @param HasStorage <p>是否有存储</p>
     */
    public void setHasStorage(Boolean HasStorage) {
        this.HasStorage = HasStorage;
    }

    /**
     * Get <p>是否使用用户自带存储桶</p> 
     * @return HasCustomStorage <p>是否使用用户自带存储桶</p>
     */
    public Boolean getHasCustomStorage() {
        return this.HasCustomStorage;
    }

    /**
     * Set <p>是否使用用户自带存储桶</p>
     * @param HasCustomStorage <p>是否使用用户自带存储桶</p>
     */
    public void setHasCustomStorage(Boolean HasCustomStorage) {
        this.HasCustomStorage = HasCustomStorage;
    }

    /**
     * Get <p>存储后端类型</p> 
     * @return StorageType <p>存储后端类型</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储后端类型</p>
     * @param StorageType <p>存储后端类型</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>是否内置模型</p> 
     * @return BuiltIn <p>是否内置模型</p>
     */
    public Boolean getBuiltIn() {
        return this.BuiltIn;
    }

    /**
     * Set <p>是否内置模型</p>
     * @param BuiltIn <p>是否内置模型</p>
     */
    public void setBuiltIn(Boolean BuiltIn) {
        this.BuiltIn = BuiltIn;
    }

    /**
     * Get <p>任务类型列表</p> 
     * @return Tasks <p>任务类型列表</p>
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务类型列表</p>
     * @param Tasks <p>任务类型列表</p>
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>APPID</p> 
     * @return AppId <p>APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID</p>
     * @param AppId <p>APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>SUB UIN</p> 
     * @return SubAccountUin <p>SUB UIN</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>SUB UIN</p>
     * @param SubAccountUin <p>SUB UIN</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UpdateInferenceModelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateInferenceModelResponse(UpdateInferenceModelResponse source) {
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
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "ParameterSize", this.ParameterSize);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "VersionCount", this.VersionCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "HasStorage", this.HasStorage);
        this.setParamSimple(map, prefix + "HasCustomStorage", this.HasCustomStorage);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "BuiltIn", this.BuiltIn);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

