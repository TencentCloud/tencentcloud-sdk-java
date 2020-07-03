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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OsInfo extends AbstractModel{

    /**
    * 操作系统ID
    */
    @SerializedName("OsTypeId")
    @Expose
    private Long OsTypeId;

    /**
    * 操作系统名称
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 操作系统名称描述
    */
    @SerializedName("OsDescription")
    @Expose
    private String OsDescription;

    /**
    * 操作系统英文名称
    */
    @SerializedName("OsEnglishDescription")
    @Expose
    private String OsEnglishDescription;

    /**
    * 操作系统的分类，如CentOs Debian
    */
    @SerializedName("OsClass")
    @Expose
    private String OsClass;

    /**
    * 标识镜像分类。public:公共镜像; private: 专属镜像
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 操作系统，ext4文件下所支持的最大的磁盘大小。单位为T
    */
    @SerializedName("MaxPartitionSize")
    @Expose
    private Long MaxPartitionSize;

    /**
    * 黑石版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsMinorVersion")
    @Expose
    private String OsMinorVersion;

    /**
    * 黑石版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsMinorClass")
    @Expose
    private String OsMinorClass;

    /**
     * Get 操作系统ID 
     * @return OsTypeId 操作系统ID
     */
    public Long getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * Set 操作系统ID
     * @param OsTypeId 操作系统ID
     */
    public void setOsTypeId(Long OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * Get 操作系统名称 
     * @return OsName 操作系统名称
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称
     * @param OsName 操作系统名称
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 操作系统名称描述 
     * @return OsDescription 操作系统名称描述
     */
    public String getOsDescription() {
        return this.OsDescription;
    }

    /**
     * Set 操作系统名称描述
     * @param OsDescription 操作系统名称描述
     */
    public void setOsDescription(String OsDescription) {
        this.OsDescription = OsDescription;
    }

    /**
     * Get 操作系统英文名称 
     * @return OsEnglishDescription 操作系统英文名称
     */
    public String getOsEnglishDescription() {
        return this.OsEnglishDescription;
    }

    /**
     * Set 操作系统英文名称
     * @param OsEnglishDescription 操作系统英文名称
     */
    public void setOsEnglishDescription(String OsEnglishDescription) {
        this.OsEnglishDescription = OsEnglishDescription;
    }

    /**
     * Get 操作系统的分类，如CentOs Debian 
     * @return OsClass 操作系统的分类，如CentOs Debian
     */
    public String getOsClass() {
        return this.OsClass;
    }

    /**
     * Set 操作系统的分类，如CentOs Debian
     * @param OsClass 操作系统的分类，如CentOs Debian
     */
    public void setOsClass(String OsClass) {
        this.OsClass = OsClass;
    }

    /**
     * Get 标识镜像分类。public:公共镜像; private: 专属镜像 
     * @return ImageTag 标识镜像分类。public:公共镜像; private: 专属镜像
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 标识镜像分类。public:公共镜像; private: 专属镜像
     * @param ImageTag 标识镜像分类。public:公共镜像; private: 专属镜像
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 操作系统，ext4文件下所支持的最大的磁盘大小。单位为T 
     * @return MaxPartitionSize 操作系统，ext4文件下所支持的最大的磁盘大小。单位为T
     */
    public Long getMaxPartitionSize() {
        return this.MaxPartitionSize;
    }

    /**
     * Set 操作系统，ext4文件下所支持的最大的磁盘大小。单位为T
     * @param MaxPartitionSize 操作系统，ext4文件下所支持的最大的磁盘大小。单位为T
     */
    public void setMaxPartitionSize(Long MaxPartitionSize) {
        this.MaxPartitionSize = MaxPartitionSize;
    }

    /**
     * Get 黑石版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsMinorVersion 黑石版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsMinorVersion() {
        return this.OsMinorVersion;
    }

    /**
     * Set 黑石版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsMinorVersion 黑石版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsMinorVersion(String OsMinorVersion) {
        this.OsMinorVersion = OsMinorVersion;
    }

    /**
     * Get 黑石版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsMinorClass 黑石版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsMinorClass() {
        return this.OsMinorClass;
    }

    /**
     * Set 黑石版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsMinorClass 黑石版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsMinorClass(String OsMinorClass) {
        this.OsMinorClass = OsMinorClass;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "OsDescription", this.OsDescription);
        this.setParamSimple(map, prefix + "OsEnglishDescription", this.OsEnglishDescription);
        this.setParamSimple(map, prefix + "OsClass", this.OsClass);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "MaxPartitionSize", this.MaxPartitionSize);
        this.setParamSimple(map, prefix + "OsMinorVersion", this.OsMinorVersion);
        this.setParamSimple(map, prefix + "OsMinorClass", this.OsMinorClass);

    }
}

