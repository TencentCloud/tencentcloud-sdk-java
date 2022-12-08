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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateImageCacheRequest extends AbstractModel{

    /**
    * 镜像缓存Id
    */
    @SerializedName("ImageCacheId")
    @Expose
    private String ImageCacheId;

    /**
    * 镜像缓存名称
    */
    @SerializedName("ImageCacheName")
    @Expose
    private String ImageCacheName;

    /**
    * 镜像仓库凭证数组
    */
    @SerializedName("ImageRegistryCredentials")
    @Expose
    private ImageRegistryCredential [] ImageRegistryCredentials;

    /**
    * 用于制作镜像缓存的容器镜像列表
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。
    */
    @SerializedName("ImageCacheSize")
    @Expose
    private Long ImageCacheSize;

    /**
    * 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * 安全组Id
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get 镜像缓存Id 
     * @return ImageCacheId 镜像缓存Id
     */
    public String getImageCacheId() {
        return this.ImageCacheId;
    }

    /**
     * Set 镜像缓存Id
     * @param ImageCacheId 镜像缓存Id
     */
    public void setImageCacheId(String ImageCacheId) {
        this.ImageCacheId = ImageCacheId;
    }

    /**
     * Get 镜像缓存名称 
     * @return ImageCacheName 镜像缓存名称
     */
    public String getImageCacheName() {
        return this.ImageCacheName;
    }

    /**
     * Set 镜像缓存名称
     * @param ImageCacheName 镜像缓存名称
     */
    public void setImageCacheName(String ImageCacheName) {
        this.ImageCacheName = ImageCacheName;
    }

    /**
     * Get 镜像仓库凭证数组 
     * @return ImageRegistryCredentials 镜像仓库凭证数组
     */
    public ImageRegistryCredential [] getImageRegistryCredentials() {
        return this.ImageRegistryCredentials;
    }

    /**
     * Set 镜像仓库凭证数组
     * @param ImageRegistryCredentials 镜像仓库凭证数组
     */
    public void setImageRegistryCredentials(ImageRegistryCredential [] ImageRegistryCredentials) {
        this.ImageRegistryCredentials = ImageRegistryCredentials;
    }

    /**
     * Get 用于制作镜像缓存的容器镜像列表 
     * @return Images 用于制作镜像缓存的容器镜像列表
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set 用于制作镜像缓存的容器镜像列表
     * @param Images 用于制作镜像缓存的容器镜像列表
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。 
     * @return ImageCacheSize 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。
     */
    public Long getImageCacheSize() {
        return this.ImageCacheSize;
    }

    /**
     * Set 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。
     * @param ImageCacheSize 镜像缓存的大小。默认为20 GiB。取值范围参考[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)中的高性能云盘类型的大小限制。
     */
    public void setImageCacheSize(Long ImageCacheSize) {
        this.ImageCacheSize = ImageCacheSize;
    }

    /**
     * Get 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。 
     * @return RetentionDays 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。
     * @param RetentionDays 镜像缓存保留时间天数，过期将会自动清理，默认为0，永不过期。
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get 安全组Id 
     * @return SecurityGroupIds 安全组Id
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组Id
     * @param SecurityGroupIds 安全组Id
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public UpdateImageCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateImageCacheRequest(UpdateImageCacheRequest source) {
        if (source.ImageCacheId != null) {
            this.ImageCacheId = new String(source.ImageCacheId);
        }
        if (source.ImageCacheName != null) {
            this.ImageCacheName = new String(source.ImageCacheName);
        }
        if (source.ImageRegistryCredentials != null) {
            this.ImageRegistryCredentials = new ImageRegistryCredential[source.ImageRegistryCredentials.length];
            for (int i = 0; i < source.ImageRegistryCredentials.length; i++) {
                this.ImageRegistryCredentials[i] = new ImageRegistryCredential(source.ImageRegistryCredentials[i]);
            }
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.ImageCacheSize != null) {
            this.ImageCacheSize = new Long(source.ImageCacheSize);
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageCacheId", this.ImageCacheId);
        this.setParamSimple(map, prefix + "ImageCacheName", this.ImageCacheName);
        this.setParamArrayObj(map, prefix + "ImageRegistryCredentials.", this.ImageRegistryCredentials);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ImageCacheSize", this.ImageCacheSize);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

