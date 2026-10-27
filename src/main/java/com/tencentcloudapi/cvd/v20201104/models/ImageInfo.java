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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * <p>镜像名称</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>镜像类型：<br>PUBLIC_IMAGE-公共镜像<br>PRIVATE_IMAGE-自定义镜像<br>TENCENT_OFFICE_IMAGE-腾讯办公镜像</p>
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * <p>镜像状态：<br>CREATING-创建中<br>NORMAL-正常<br>CREATEFAILED-创建失败<br>USING-使用中<br>SYNCING-同步中<br>IMPORTING-导入中<br>IMPORTFAILED-导入失败<br>INVISIBLE-淘汰的镜像<br>DELETIING-删除中<br>DELETED-删除的</p>
    */
    @SerializedName("ImageState")
    @Expose
    private String ImageState;

    /**
    * <p>镜像操作系统</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>镜像大小（单位G）</p>
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * <p>镜像描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>镜像所在区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>内核类型：<br>CPU<br>GPU<br>GPU_A10<br>GPU_RTX6000<br>GPU_2080Ti<br>GPU_3080Ti</p>
    */
    @SerializedName("CoreType")
    @Expose
    private String CoreType;

    /**
    * <p>cvm侧镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmImageId")
    @Expose
    private String CvmImageId;

    /**
    * <p>是否是整机镜像，整机镜像无法用于桌面重置<br>true：整机镜像<br>false: 不是整机镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWhole")
    @Expose
    private Boolean IsWhole;

    /**
    * <p>整机镜像中数据盘大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

    /**
    * <p>镜像创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>镜像id</p> 
     * @return ImageID <p>镜像id</p>
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageID <p>镜像id</p>
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get <p>镜像名称</p> 
     * @return ImageName <p>镜像名称</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名称</p>
     * @param ImageName <p>镜像名称</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>镜像类型：<br>PUBLIC_IMAGE-公共镜像<br>PRIVATE_IMAGE-自定义镜像<br>TENCENT_OFFICE_IMAGE-腾讯办公镜像</p> 
     * @return ImageType <p>镜像类型：<br>PUBLIC_IMAGE-公共镜像<br>PRIVATE_IMAGE-自定义镜像<br>TENCENT_OFFICE_IMAGE-腾讯办公镜像</p>
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set <p>镜像类型：<br>PUBLIC_IMAGE-公共镜像<br>PRIVATE_IMAGE-自定义镜像<br>TENCENT_OFFICE_IMAGE-腾讯办公镜像</p>
     * @param ImageType <p>镜像类型：<br>PUBLIC_IMAGE-公共镜像<br>PRIVATE_IMAGE-自定义镜像<br>TENCENT_OFFICE_IMAGE-腾讯办公镜像</p>
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get <p>镜像状态：<br>CREATING-创建中<br>NORMAL-正常<br>CREATEFAILED-创建失败<br>USING-使用中<br>SYNCING-同步中<br>IMPORTING-导入中<br>IMPORTFAILED-导入失败<br>INVISIBLE-淘汰的镜像<br>DELETIING-删除中<br>DELETED-删除的</p> 
     * @return ImageState <p>镜像状态：<br>CREATING-创建中<br>NORMAL-正常<br>CREATEFAILED-创建失败<br>USING-使用中<br>SYNCING-同步中<br>IMPORTING-导入中<br>IMPORTFAILED-导入失败<br>INVISIBLE-淘汰的镜像<br>DELETIING-删除中<br>DELETED-删除的</p>
     */
    public String getImageState() {
        return this.ImageState;
    }

    /**
     * Set <p>镜像状态：<br>CREATING-创建中<br>NORMAL-正常<br>CREATEFAILED-创建失败<br>USING-使用中<br>SYNCING-同步中<br>IMPORTING-导入中<br>IMPORTFAILED-导入失败<br>INVISIBLE-淘汰的镜像<br>DELETIING-删除中<br>DELETED-删除的</p>
     * @param ImageState <p>镜像状态：<br>CREATING-创建中<br>NORMAL-正常<br>CREATEFAILED-创建失败<br>USING-使用中<br>SYNCING-同步中<br>IMPORTING-导入中<br>IMPORTFAILED-导入失败<br>INVISIBLE-淘汰的镜像<br>DELETIING-删除中<br>DELETED-删除的</p>
     */
    public void setImageState(String ImageState) {
        this.ImageState = ImageState;
    }

    /**
     * Get <p>镜像操作系统</p> 
     * @return OsName <p>镜像操作系统</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>镜像操作系统</p>
     * @param OsName <p>镜像操作系统</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>镜像大小（单位G）</p> 
     * @return ImageSize <p>镜像大小（单位G）</p>
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set <p>镜像大小（单位G）</p>
     * @param ImageSize <p>镜像大小（单位G）</p>
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get <p>镜像描述</p> 
     * @return Description <p>镜像描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>镜像描述</p>
     * @param Description <p>镜像描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>镜像所在区域</p> 
     * @return Region <p>镜像所在区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>镜像所在区域</p>
     * @param Region <p>镜像所在区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>内核类型：<br>CPU<br>GPU<br>GPU_A10<br>GPU_RTX6000<br>GPU_2080Ti<br>GPU_3080Ti</p> 
     * @return CoreType <p>内核类型：<br>CPU<br>GPU<br>GPU_A10<br>GPU_RTX6000<br>GPU_2080Ti<br>GPU_3080Ti</p>
     */
    public String getCoreType() {
        return this.CoreType;
    }

    /**
     * Set <p>内核类型：<br>CPU<br>GPU<br>GPU_A10<br>GPU_RTX6000<br>GPU_2080Ti<br>GPU_3080Ti</p>
     * @param CoreType <p>内核类型：<br>CPU<br>GPU<br>GPU_A10<br>GPU_RTX6000<br>GPU_2080Ti<br>GPU_3080Ti</p>
     */
    public void setCoreType(String CoreType) {
        this.CoreType = CoreType;
    }

    /**
     * Get <p>cvm侧镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmImageId <p>cvm侧镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvmImageId() {
        return this.CvmImageId;
    }

    /**
     * Set <p>cvm侧镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmImageId <p>cvm侧镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmImageId(String CvmImageId) {
        this.CvmImageId = CvmImageId;
    }

    /**
     * Get <p>是否是整机镜像，整机镜像无法用于桌面重置<br>true：整机镜像<br>false: 不是整机镜像</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWhole <p>是否是整机镜像，整机镜像无法用于桌面重置<br>true：整机镜像<br>false: 不是整机镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsWhole() {
        return this.IsWhole;
    }

    /**
     * Set <p>是否是整机镜像，整机镜像无法用于桌面重置<br>true：整机镜像<br>false: 不是整机镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWhole <p>是否是整机镜像，整机镜像无法用于桌面重置<br>true：整机镜像<br>false: 不是整机镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWhole(Boolean IsWhole) {
        this.IsWhole = IsWhole;
    }

    /**
     * Get <p>整机镜像中数据盘大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDiskSize <p>整机镜像中数据盘大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set <p>整机镜像中数据盘大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDiskSize <p>整机镜像中数据盘大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get <p>镜像创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>镜像创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>镜像创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>镜像创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ImageState != null) {
            this.ImageState = new String(source.ImageState);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CoreType != null) {
            this.CoreType = new String(source.CoreType);
        }
        if (source.CvmImageId != null) {
            this.CvmImageId = new String(source.CvmImageId);
        }
        if (source.IsWhole != null) {
            this.IsWhole = new Boolean(source.IsWhole);
        }
        if (source.DataDiskSize != null) {
            this.DataDiskSize = new Long(source.DataDiskSize);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageState", this.ImageState);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CoreType", this.CoreType);
        this.setParamSimple(map, prefix + "CvmImageId", this.CvmImageId);
        this.setParamSimple(map, prefix + "IsWhole", this.IsWhole);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

