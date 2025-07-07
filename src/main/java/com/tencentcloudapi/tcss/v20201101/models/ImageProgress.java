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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageProgress extends AbstractModel {

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 仓库类型
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 镜像仓库地址
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 仓库名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像tag
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 镜像扫描状态
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * 镜像cve扫描进度
    */
    @SerializedName("CveProgress")
    @Expose
    private Long CveProgress;

    /**
    * 镜像敏感扫描进度
    */
    @SerializedName("RiskProgress")
    @Expose
    private Long RiskProgress;

    /**
    * 镜像木马扫描进度
    */
    @SerializedName("VirusProgress")
    @Expose
    private Long VirusProgress;

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 仓库类型 
     * @return RegistryType 仓库类型
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 仓库类型
     * @param RegistryType 仓库类型
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 镜像仓库地址 
     * @return ImageRepoAddress 镜像仓库地址
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set 镜像仓库地址
     * @param ImageRepoAddress 镜像仓库地址
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 仓库名称 
     * @return ImageName 仓库名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 仓库名称
     * @param ImageName 仓库名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像tag 
     * @return ImageTag 镜像tag
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 镜像tag
     * @param ImageTag 镜像tag
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 镜像扫描状态 
     * @return ScanStatus 镜像扫描状态
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 镜像扫描状态
     * @param ScanStatus 镜像扫描状态
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 镜像cve扫描进度 
     * @return CveProgress 镜像cve扫描进度
     */
    public Long getCveProgress() {
        return this.CveProgress;
    }

    /**
     * Set 镜像cve扫描进度
     * @param CveProgress 镜像cve扫描进度
     */
    public void setCveProgress(Long CveProgress) {
        this.CveProgress = CveProgress;
    }

    /**
     * Get 镜像敏感扫描进度 
     * @return RiskProgress 镜像敏感扫描进度
     */
    public Long getRiskProgress() {
        return this.RiskProgress;
    }

    /**
     * Set 镜像敏感扫描进度
     * @param RiskProgress 镜像敏感扫描进度
     */
    public void setRiskProgress(Long RiskProgress) {
        this.RiskProgress = RiskProgress;
    }

    /**
     * Get 镜像木马扫描进度 
     * @return VirusProgress 镜像木马扫描进度
     */
    public Long getVirusProgress() {
        return this.VirusProgress;
    }

    /**
     * Set 镜像木马扫描进度
     * @param VirusProgress 镜像木马扫描进度
     */
    public void setVirusProgress(Long VirusProgress) {
        this.VirusProgress = VirusProgress;
    }

    public ImageProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProgress(ImageProgress source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.CveProgress != null) {
            this.CveProgress = new Long(source.CveProgress);
        }
        if (source.RiskProgress != null) {
            this.RiskProgress = new Long(source.RiskProgress);
        }
        if (source.VirusProgress != null) {
            this.VirusProgress = new Long(source.VirusProgress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "CveProgress", this.CveProgress);
        this.setParamSimple(map, prefix + "RiskProgress", this.RiskProgress);
        this.setParamSimple(map, prefix + "VirusProgress", this.VirusProgress);

    }
}

