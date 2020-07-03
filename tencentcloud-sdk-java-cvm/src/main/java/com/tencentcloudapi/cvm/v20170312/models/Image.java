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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel{

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像操作系统
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 镜像类型
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * 镜像创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像描述
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 镜像大小
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 镜像架构
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 镜像状态:
CREATING-创建中
NORMAL-正常
CREATEFAILED-创建失败
USING-使用中
SYNCING-同步中
IMPORTING-导入中
IMPORTFAILED-导入失败
    */
    @SerializedName("ImageState")
    @Expose
    private String ImageState;

    /**
    * 镜像来源平台
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 镜像创建者
    */
    @SerializedName("ImageCreator")
    @Expose
    private String ImageCreator;

    /**
    * 镜像来源
    */
    @SerializedName("ImageSource")
    @Expose
    private String ImageSource;

    /**
    * 同步百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncPercent")
    @Expose
    private Long SyncPercent;

    /**
    * 镜像是否支持cloud-init
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportCloudinit")
    @Expose
    private Boolean IsSupportCloudinit;

    /**
    * 镜像关联的快照信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotSet")
    @Expose
    private Snapshot [] SnapshotSet;

    /**
     * Get 镜像ID 
     * @return ImageId 镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
     * @param ImageId 镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像操作系统 
     * @return OsName 镜像操作系统
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 镜像操作系统
     * @param OsName 镜像操作系统
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 镜像类型 
     * @return ImageType 镜像类型
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型
     * @param ImageType 镜像类型
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 镜像创建时间 
     * @return CreatedTime 镜像创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 镜像创建时间
     * @param CreatedTime 镜像创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
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
     * Get 镜像描述 
     * @return ImageDescription 镜像描述
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 镜像描述
     * @param ImageDescription 镜像描述
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 镜像大小 
     * @return ImageSize 镜像大小
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小
     * @param ImageSize 镜像大小
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 镜像架构 
     * @return Architecture 镜像架构
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 镜像架构
     * @param Architecture 镜像架构
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 镜像状态:
CREATING-创建中
NORMAL-正常
CREATEFAILED-创建失败
USING-使用中
SYNCING-同步中
IMPORTING-导入中
IMPORTFAILED-导入失败 
     * @return ImageState 镜像状态:
CREATING-创建中
NORMAL-正常
CREATEFAILED-创建失败
USING-使用中
SYNCING-同步中
IMPORTING-导入中
IMPORTFAILED-导入失败
     */
    public String getImageState() {
        return this.ImageState;
    }

    /**
     * Set 镜像状态:
CREATING-创建中
NORMAL-正常
CREATEFAILED-创建失败
USING-使用中
SYNCING-同步中
IMPORTING-导入中
IMPORTFAILED-导入失败
     * @param ImageState 镜像状态:
CREATING-创建中
NORMAL-正常
CREATEFAILED-创建失败
USING-使用中
SYNCING-同步中
IMPORTING-导入中
IMPORTFAILED-导入失败
     */
    public void setImageState(String ImageState) {
        this.ImageState = ImageState;
    }

    /**
     * Get 镜像来源平台 
     * @return Platform 镜像来源平台
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 镜像来源平台
     * @param Platform 镜像来源平台
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 镜像创建者 
     * @return ImageCreator 镜像创建者
     */
    public String getImageCreator() {
        return this.ImageCreator;
    }

    /**
     * Set 镜像创建者
     * @param ImageCreator 镜像创建者
     */
    public void setImageCreator(String ImageCreator) {
        this.ImageCreator = ImageCreator;
    }

    /**
     * Get 镜像来源 
     * @return ImageSource 镜像来源
     */
    public String getImageSource() {
        return this.ImageSource;
    }

    /**
     * Set 镜像来源
     * @param ImageSource 镜像来源
     */
    public void setImageSource(String ImageSource) {
        this.ImageSource = ImageSource;
    }

    /**
     * Get 同步百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncPercent 同步百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSyncPercent() {
        return this.SyncPercent;
    }

    /**
     * Set 同步百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncPercent 同步百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncPercent(Long SyncPercent) {
        this.SyncPercent = SyncPercent;
    }

    /**
     * Get 镜像是否支持cloud-init
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportCloudinit 镜像是否支持cloud-init
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSupportCloudinit() {
        return this.IsSupportCloudinit;
    }

    /**
     * Set 镜像是否支持cloud-init
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportCloudinit 镜像是否支持cloud-init
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportCloudinit(Boolean IsSupportCloudinit) {
        this.IsSupportCloudinit = IsSupportCloudinit;
    }

    /**
     * Get 镜像关联的快照信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotSet 镜像关联的快照信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Snapshot [] getSnapshotSet() {
        return this.SnapshotSet;
    }

    /**
     * Set 镜像关联的快照信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotSet 镜像关联的快照信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotSet(Snapshot [] SnapshotSet) {
        this.SnapshotSet = SnapshotSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "ImageState", this.ImageState);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ImageCreator", this.ImageCreator);
        this.setParamSimple(map, prefix + "ImageSource", this.ImageSource);
        this.setParamSimple(map, prefix + "SyncPercent", this.SyncPercent);
        this.setParamSimple(map, prefix + "IsSupportCloudinit", this.IsSupportCloudinit);
        this.setParamArrayObj(map, prefix + "SnapshotSet.", this.SnapshotSet);

    }
}

