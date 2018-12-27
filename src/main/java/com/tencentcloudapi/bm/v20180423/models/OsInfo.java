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

public class OsInfo  extends AbstractModel{

    /**
    * 操作系统ID
    */
    @SerializedName("OsTypeId")
    @Expose
    private Integer OsTypeId;

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
    private Integer MaxPartitionSize;

    /**
     * 获取操作系统ID
     * @return OsTypeId 操作系统ID
     */
    public Integer getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * 设置操作系统ID
     * @param OsTypeId 操作系统ID
     */
    public void setOsTypeId(Integer OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * 获取操作系统名称
     * @return OsName 操作系统名称
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * 设置操作系统名称
     * @param OsName 操作系统名称
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * 获取操作系统名称描述
     * @return OsDescription 操作系统名称描述
     */
    public String getOsDescription() {
        return this.OsDescription;
    }

    /**
     * 设置操作系统名称描述
     * @param OsDescription 操作系统名称描述
     */
    public void setOsDescription(String OsDescription) {
        this.OsDescription = OsDescription;
    }

    /**
     * 获取操作系统英文名称
     * @return OsEnglishDescription 操作系统英文名称
     */
    public String getOsEnglishDescription() {
        return this.OsEnglishDescription;
    }

    /**
     * 设置操作系统英文名称
     * @param OsEnglishDescription 操作系统英文名称
     */
    public void setOsEnglishDescription(String OsEnglishDescription) {
        this.OsEnglishDescription = OsEnglishDescription;
    }

    /**
     * 获取操作系统的分类，如CentOs Debian
     * @return OsClass 操作系统的分类，如CentOs Debian
     */
    public String getOsClass() {
        return this.OsClass;
    }

    /**
     * 设置操作系统的分类，如CentOs Debian
     * @param OsClass 操作系统的分类，如CentOs Debian
     */
    public void setOsClass(String OsClass) {
        this.OsClass = OsClass;
    }

    /**
     * 获取标识镜像分类。public:公共镜像; private: 专属镜像
     * @return ImageTag 标识镜像分类。public:公共镜像; private: 专属镜像
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * 设置标识镜像分类。public:公共镜像; private: 专属镜像
     * @param ImageTag 标识镜像分类。public:公共镜像; private: 专属镜像
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * 获取操作系统，ext4文件下所支持的最大的磁盘大小。单位为T
     * @return MaxPartitionSize 操作系统，ext4文件下所支持的最大的磁盘大小。单位为T
     */
    public Integer getMaxPartitionSize() {
        return this.MaxPartitionSize;
    }

    /**
     * 设置操作系统，ext4文件下所支持的最大的磁盘大小。单位为T
     * @param MaxPartitionSize 操作系统，ext4文件下所支持的最大的磁盘大小。单位为T
     */
    public void setMaxPartitionSize(Integer MaxPartitionSize) {
        this.MaxPartitionSize = MaxPartitionSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "OsDescription", this.OsDescription);
        this.setParamSimple(map, prefix + "OsEnglishDescription", this.OsEnglishDescription);
        this.setParamSimple(map, prefix + "OsClass", this.OsClass);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "MaxPartitionSize", this.MaxPartitionSize);

    }
}

