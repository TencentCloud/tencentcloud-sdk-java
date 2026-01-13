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

public class DescribePreCacheImageTaskRequest extends AbstractModel {

    /**
    * 镜像地址
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 镜像 Digest
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * 镜像仓库类型：`enterprise`、`personal`。
    */
    @SerializedName("ImageRegistryType")
    @Expose
    private String ImageRegistryType;

    /**
     * Get 镜像地址 
     * @return Image 镜像地址
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像地址
     * @param Image 镜像地址
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 镜像 Digest 
     * @return ImageDigest 镜像 Digest
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set 镜像 Digest
     * @param ImageDigest 镜像 Digest
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
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

    public DescribePreCacheImageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePreCacheImageTaskRequest(DescribePreCacheImageTaskRequest source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ImageDigest != null) {
            this.ImageDigest = new String(source.ImageDigest);
        }
        if (source.ImageRegistryType != null) {
            this.ImageRegistryType = new String(source.ImageRegistryType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImageDigest", this.ImageDigest);
        this.setParamSimple(map, prefix + "ImageRegistryType", this.ImageRegistryType);

    }
}

