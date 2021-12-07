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

public class ImageProgress extends AbstractModel{

    /**
    * 镜像id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * 镜像cve扫描进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CveProgress")
    @Expose
    private Long CveProgress;

    /**
    * 镜像敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskProgress")
    @Expose
    private Long RiskProgress;

    /**
    * 镜像木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusProgress")
    @Expose
    private Long VirusProgress;

    /**
     * Get 镜像id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 镜像id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 镜像id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 仓库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryType 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryType 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageRepoAddress 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageRepoAddress 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 仓库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageName 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageName 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageTag 镜像tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 镜像tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageTag 镜像tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanStatus 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanStatus 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 镜像cve扫描进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CveProgress 镜像cve扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCveProgress() {
        return this.CveProgress;
    }

    /**
     * Set 镜像cve扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param CveProgress 镜像cve扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCveProgress(Long CveProgress) {
        this.CveProgress = CveProgress;
    }

    /**
     * Get 镜像敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskProgress 镜像敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskProgress() {
        return this.RiskProgress;
    }

    /**
     * Set 镜像敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskProgress 镜像敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskProgress(Long RiskProgress) {
        this.RiskProgress = RiskProgress;
    }

    /**
     * Get 镜像木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusProgress 镜像木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVirusProgress() {
        return this.VirusProgress;
    }

    /**
     * Set 镜像木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusProgress 镜像木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。
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

