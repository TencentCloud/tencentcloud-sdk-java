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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimedScanTaskPreviewInfo extends AbstractModel {

    /**
    * <p>预览数据id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>镜像名</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>镜像tag</p>
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * <p>镜像仓库类型</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>定时任务所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>定时任务所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>定时任务所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>是否最新镜像</p>
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
     * Get <p>预览数据id</p> 
     * @return Id <p>预览数据id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>预览数据id</p>
     * @param Id <p>预览数据id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageId <p>镜像id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageId <p>镜像id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>镜像名</p> 
     * @return ImageName <p>镜像名</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名</p>
     * @param ImageName <p>镜像名</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>镜像tag</p> 
     * @return ImageTag <p>镜像tag</p>
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set <p>镜像tag</p>
     * @param ImageTag <p>镜像tag</p>
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get <p>镜像仓库类型</p> 
     * @return RegistryType <p>镜像仓库类型</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>镜像仓库类型</p>
     * @param RegistryType <p>镜像仓库类型</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>定时任务所属账号名</p> 
     * @return OwnerAccountName <p>定时任务所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>定时任务所属账号名</p>
     * @param OwnerAccountName <p>定时任务所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>定时任务所属账号uin</p> 
     * @return OwnerUin <p>定时任务所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>定时任务所属账号uin</p>
     * @param OwnerUin <p>定时任务所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>定时任务所属账号appid</p> 
     * @return OwnerAppId <p>定时任务所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>定时任务所属账号appid</p>
     * @param OwnerAppId <p>定时任务所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>是否最新镜像</p> 
     * @return IsLatestImage <p>是否最新镜像</p>
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set <p>是否最新镜像</p>
     * @param IsLatestImage <p>是否最新镜像</p>
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    /**
     * Get <p>镜像地址</p> 
     * @return ImageRepoAddress <p>镜像地址</p>
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set <p>镜像地址</p>
     * @param ImageRepoAddress <p>镜像地址</p>
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    public TimedScanTaskPreviewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimedScanTaskPreviewInfo(TimedScanTaskPreviewInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);

    }
}

