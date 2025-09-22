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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceFileItem extends AbstractModel {

    /**
    * 资源文件ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源文件名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源文件类型
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * 资源路径
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
     * Get 资源文件ID 
     * @return ResourceId 资源文件ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源文件ID
     * @param ResourceId 资源文件ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源文件名称 
     * @return ResourceName 资源文件名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源文件名称
     * @param ResourceName 资源文件名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源文件类型 
     * @return FileExtensionType 资源文件类型
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set 资源文件类型
     * @param FileExtensionType 资源文件类型
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get 资源路径 
     * @return LocalPath 资源路径
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set 资源路径
     * @param LocalPath 资源路径
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    public ResourceFileItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceFileItem(ResourceFileItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);

    }
}

