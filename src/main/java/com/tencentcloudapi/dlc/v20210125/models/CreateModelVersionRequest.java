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

public class CreateModelVersionRequest extends AbstractModel {

    /**
    * <p>模型UID</p>
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
    * <p>模型版本号</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>版本说明</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>该版本的存储 URI（可选，如 cos://bucket-name/models/name/v2/）</p>
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
     * Get <p>模型UID</p> 
     * @return ModelUid <p>模型UID</p>
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>模型UID</p>
     * @param ModelUid <p>模型UID</p>
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    /**
     * Get <p>模型版本号</p> 
     * @return ModelVersion <p>模型版本号</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本号</p>
     * @param ModelVersion <p>模型版本号</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>版本说明</p> 
     * @return Description <p>版本说明</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>版本说明</p>
     * @param Description <p>版本说明</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>该版本的存储 URI（可选，如 cos://bucket-name/models/name/v2/）</p> 
     * @return StorageUri <p>该版本的存储 URI（可选，如 cos://bucket-name/models/name/v2/）</p>
     */
    public String getStorageUri() {
        return this.StorageUri;
    }

    /**
     * Set <p>该版本的存储 URI（可选，如 cos://bucket-name/models/name/v2/）</p>
     * @param StorageUri <p>该版本的存储 URI（可选，如 cos://bucket-name/models/name/v2/）</p>
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

    public CreateModelVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelVersionRequest(CreateModelVersionRequest source) {
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StorageUri != null) {
            this.StorageUri = new String(source.StorageUri);
        }
        if (source.UseCustomStorage != null) {
            this.UseCustomStorage = new Boolean(source.UseCustomStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StorageUri", this.StorageUri);
        this.setParamSimple(map, prefix + "UseCustomStorage", this.UseCustomStorage);

    }
}

