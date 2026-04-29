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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * 镜像所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * tcr实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 命名空间
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 镜像仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 镜像版本
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 镜像拉取策略
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * 镜像地址
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * Get 镜像所属地域 
     * @return Region 镜像所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 镜像所属地域
     * @param Region 镜像所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get tcr实例Id 
     * @return RegistryId tcr实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set tcr实例Id
     * @param RegistryId tcr实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 域名 
     * @return DomainName 域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名
     * @param DomainName 域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 命名空间 
     * @return NamespaceName 命名空间
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间
     * @param NamespaceName 命名空间
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 镜像仓库名称 
     * @return RepositoryName 镜像仓库名称
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 镜像仓库名称
     * @param RepositoryName 镜像仓库名称
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get 镜像版本 
     * @return ImageVersion 镜像版本
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 镜像版本
     * @param ImageVersion 镜像版本
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 镜像拉取策略 
     * @return ImagePullPolicy 镜像拉取策略
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set 镜像拉取策略
     * @param ImagePullPolicy 镜像拉取策略
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
    }

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

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

