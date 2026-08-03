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
    * <p>镜像地址</p>
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p>
    */
    @SerializedName("ImageRegistryType")
    @Expose
    private String ImageRegistryType;

    /**
    * <p>镜像内部的路径</p>
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * <p>镜像 Digest，请求时无需传入</p>
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
     * Get <p>镜像地址</p> 
     * @return Reference <p>镜像地址</p>
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set <p>镜像地址</p>
     * @param Reference <p>镜像地址</p>
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p> 
     * @return ImageRegistryType <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p>
     */
    public String getImageRegistryType() {
        return this.ImageRegistryType;
    }

    /**
     * Set <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p>
     * @param ImageRegistryType <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p>
     */
    public void setImageRegistryType(String ImageRegistryType) {
        this.ImageRegistryType = ImageRegistryType;
    }

    /**
     * Get <p>镜像内部的路径</p> 
     * @return SubPath <p>镜像内部的路径</p>
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set <p>镜像内部的路径</p>
     * @param SubPath <p>镜像内部的路径</p>
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get <p>镜像 Digest，请求时无需传入</p> 
     * @return Digest <p>镜像 Digest，请求时无需传入</p>
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set <p>镜像 Digest，请求时无需传入</p>
     * @param Digest <p>镜像 Digest，请求时无需传入</p>
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

