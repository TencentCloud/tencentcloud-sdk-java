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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulAffectedRegistryImageInfo extends AbstractModel{

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像版本
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 镜像命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 镜像地址
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * 组件列表
    */
    @SerializedName("ComponentList")
    @Expose
    private VulAffectedImageComponentInfo [] ComponentList;

    /**
    * 是否为镜像的最新版本
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
    * 内部镜像资产ID
    */
    @SerializedName("ImageAssetId")
    @Expose
    private Long ImageAssetId;

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像版本 
     * @return ImageTag 镜像版本
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 镜像版本
     * @param ImageTag 镜像版本
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 镜像命名空间 
     * @return Namespace 镜像命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 镜像命名空间
     * @param Namespace 镜像命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 镜像地址 
     * @return ImageRepoAddress 镜像地址
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set 镜像地址
     * @param ImageRepoAddress 镜像地址
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get 组件列表 
     * @return ComponentList 组件列表
     */
    public VulAffectedImageComponentInfo [] getComponentList() {
        return this.ComponentList;
    }

    /**
     * Set 组件列表
     * @param ComponentList 组件列表
     */
    public void setComponentList(VulAffectedImageComponentInfo [] ComponentList) {
        this.ComponentList = ComponentList;
    }

    /**
     * Get 是否为镜像的最新版本 
     * @return IsLatestImage 是否为镜像的最新版本
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set 是否为镜像的最新版本
     * @param IsLatestImage 是否为镜像的最新版本
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    /**
     * Get 内部镜像资产ID 
     * @return ImageAssetId 内部镜像资产ID
     */
    public Long getImageAssetId() {
        return this.ImageAssetId;
    }

    /**
     * Set 内部镜像资产ID
     * @param ImageAssetId 内部镜像资产ID
     */
    public void setImageAssetId(Long ImageAssetId) {
        this.ImageAssetId = ImageAssetId;
    }

    public VulAffectedRegistryImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedRegistryImageInfo(VulAffectedRegistryImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
        if (source.ComponentList != null) {
            this.ComponentList = new VulAffectedImageComponentInfo[source.ComponentList.length];
            for (int i = 0; i < source.ComponentList.length; i++) {
                this.ComponentList[i] = new VulAffectedImageComponentInfo(source.ComponentList[i]);
            }
        }
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
        }
        if (source.ImageAssetId != null) {
            this.ImageAssetId = new Long(source.ImageAssetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamArrayObj(map, prefix + "ComponentList.", this.ComponentList);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);
        this.setParamSimple(map, prefix + "ImageAssetId", this.ImageAssetId);

    }
}

