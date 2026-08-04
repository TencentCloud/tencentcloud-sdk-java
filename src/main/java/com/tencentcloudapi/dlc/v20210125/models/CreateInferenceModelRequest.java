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

public class CreateInferenceModelRequest extends AbstractModel {

    /**
    * <p>模型名称（最长 256）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模型类型（如 LLM、Embedding、Reranker、ASR、TTS 等）</p>
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>初始版本号（必填，如 v1、v1.5）</p>
    */
    @SerializedName("InitialVersion")
    @Expose
    private String InitialVersion;

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
    * <p>模型参数量（如 7B、1.5B）</p>
    */
    @SerializedName("ParameterSize")
    @Expose
    private String ParameterSize;

    /**
    * <p>模型标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>模型存储 URI（可选，如 cos://bucket-name/models/name/）</p>
    */
    @SerializedName("StorageUri")
    @Expose
    private String StorageUri;

    /**
    * <p>是否使用用户自带存储桶（默认 false 表示平台托管）</p>
    */
    @SerializedName("UseCustomStorage")
    @Expose
    private Boolean UseCustomStorage;

    /**
    * <p>任务类型列表（如 [&quot;Text Generation&quot;, &quot;Embedding&quot;]）</p>
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
    * <p>模型 UID（可选，前端预先生成的 UID，不传则后端自动生成）</p>
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
     * Get <p>模型名称（最长 256）</p> 
     * @return Name <p>模型名称（最长 256）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型名称（最长 256）</p>
     * @param Name <p>模型名称（最长 256）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模型类型（如 LLM、Embedding、Reranker、ASR、TTS 等）</p> 
     * @return ModelType <p>模型类型（如 LLM、Embedding、Reranker、ASR、TTS 等）</p>
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型（如 LLM、Embedding、Reranker、ASR、TTS 等）</p>
     * @param ModelType <p>模型类型（如 LLM、Embedding、Reranker、ASR、TTS 等）</p>
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>初始版本号（必填，如 v1、v1.5）</p> 
     * @return InitialVersion <p>初始版本号（必填，如 v1、v1.5）</p>
     */
    public String getInitialVersion() {
        return this.InitialVersion;
    }

    /**
     * Set <p>初始版本号（必填，如 v1、v1.5）</p>
     * @param InitialVersion <p>初始版本号（必填，如 v1、v1.5）</p>
     */
    public void setInitialVersion(String InitialVersion) {
        this.InitialVersion = InitialVersion;
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
     * Get <p>模型参数量（如 7B、1.5B）</p> 
     * @return ParameterSize <p>模型参数量（如 7B、1.5B）</p>
     */
    public String getParameterSize() {
        return this.ParameterSize;
    }

    /**
     * Set <p>模型参数量（如 7B、1.5B）</p>
     * @param ParameterSize <p>模型参数量（如 7B、1.5B）</p>
     */
    public void setParameterSize(String ParameterSize) {
        this.ParameterSize = ParameterSize;
    }

    /**
     * Get <p>模型标签列表</p> 
     * @return Tags <p>模型标签列表</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>模型标签列表</p>
     * @param Tags <p>模型标签列表</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>模型存储 URI（可选，如 cos://bucket-name/models/name/）</p> 
     * @return StorageUri <p>模型存储 URI（可选，如 cos://bucket-name/models/name/）</p>
     */
    public String getStorageUri() {
        return this.StorageUri;
    }

    /**
     * Set <p>模型存储 URI（可选，如 cos://bucket-name/models/name/）</p>
     * @param StorageUri <p>模型存储 URI（可选，如 cos://bucket-name/models/name/）</p>
     */
    public void setStorageUri(String StorageUri) {
        this.StorageUri = StorageUri;
    }

    /**
     * Get <p>是否使用用户自带存储桶（默认 false 表示平台托管）</p> 
     * @return UseCustomStorage <p>是否使用用户自带存储桶（默认 false 表示平台托管）</p>
     */
    public Boolean getUseCustomStorage() {
        return this.UseCustomStorage;
    }

    /**
     * Set <p>是否使用用户自带存储桶（默认 false 表示平台托管）</p>
     * @param UseCustomStorage <p>是否使用用户自带存储桶（默认 false 表示平台托管）</p>
     */
    public void setUseCustomStorage(Boolean UseCustomStorage) {
        this.UseCustomStorage = UseCustomStorage;
    }

    /**
     * Get <p>任务类型列表（如 [&quot;Text Generation&quot;, &quot;Embedding&quot;]）</p> 
     * @return Tasks <p>任务类型列表（如 [&quot;Text Generation&quot;, &quot;Embedding&quot;]）</p>
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务类型列表（如 [&quot;Text Generation&quot;, &quot;Embedding&quot;]）</p>
     * @param Tasks <p>任务类型列表（如 [&quot;Text Generation&quot;, &quot;Embedding&quot;]）</p>
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>模型 UID（可选，前端预先生成的 UID，不传则后端自动生成）</p> 
     * @return ModelUid <p>模型 UID（可选，前端预先生成的 UID，不传则后端自动生成）</p>
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>模型 UID（可选，前端预先生成的 UID，不传则后端自动生成）</p>
     * @param ModelUid <p>模型 UID（可选，前端预先生成的 UID，不传则后端自动生成）</p>
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    public CreateInferenceModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInferenceModelRequest(CreateInferenceModelRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.InitialVersion != null) {
            this.InitialVersion = new String(source.InitialVersion);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.StorageUri != null) {
            this.StorageUri = new String(source.StorageUri);
        }
        if (source.UseCustomStorage != null) {
            this.UseCustomStorage = new Boolean(source.UseCustomStorage);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "InitialVersion", this.InitialVersion);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParameterSize", this.ParameterSize);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "StorageUri", this.StorageUri);
        this.setParamSimple(map, prefix + "UseCustomStorage", this.UseCustomStorage);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);

    }
}

