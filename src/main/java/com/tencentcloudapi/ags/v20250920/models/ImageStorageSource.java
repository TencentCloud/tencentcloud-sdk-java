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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageStorageSource extends AbstractModel {

    /**
    * 镜像地址
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * 镜像仓库类型：`enterprise`、`personal`。
    */
    @SerializedName("ImageRegistryType")
    @Expose
    private String ImageRegistryType;

    /**
    * 镜像内部的路径
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * 镜像 Digest，请求时无需传入
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
     * Get 镜像地址 
     * @return Reference 镜像地址
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 镜像地址
     * @param Reference 镜像地址
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get 镜像仓库类型：`enterprise`、`personal`。 
     * @return ImageRegistryType 镜像仓库类型：`enterprise`、`personal`。
     */
    public String getImageRegistryType() {
        return this.ImageRegistryType;
    }

    /**
     * Set 镜像仓库类型：`enterprise`、`personal`。
     * @param ImageRegistryType 镜像仓库类型：`enterprise`、`personal`。
     */
    public void setImageRegistryType(String ImageRegistryType) {
        this.ImageRegistryType = ImageRegistryType;
    }

    /**
     * Get 镜像内部的路径 
     * @return SubPath 镜像内部的路径
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set 镜像内部的路径
     * @param SubPath 镜像内部的路径
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get 镜像 Digest，请求时无需传入 
     * @return Digest 镜像 Digest，请求时无需传入
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set 镜像 Digest，请求时无需传入
     * @param Digest 镜像 Digest，请求时无需传入
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    public ImageStorageSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageStorageSource(ImageStorageSource source) {
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.ImageRegistryType != null) {
            this.ImageRegistryType = new String(source.ImageRegistryType);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "ImageRegistryType", this.ImageRegistryType);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "Digest", this.Digest);

    }
}

