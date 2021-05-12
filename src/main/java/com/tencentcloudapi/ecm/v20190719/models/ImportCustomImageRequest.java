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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportCustomImageRequest extends AbstractModel{

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 导入镜像的操作系统架构，x86_64 或 i386
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 导入镜像的操作系统类型，通过DescribeImportImageOs获取
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * 导入镜像的操作系统版本，通过DescribeImportImageOs获取
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * 镜像描述
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 镜像启动方式，cloudinit或nbd， 默认cloudinit
    */
    @SerializedName("InitFlag")
    @Expose
    private String InitFlag;

    /**
    * 镜像文件描述，多层镜像按顺序传入
    */
    @SerializedName("ImageUrls")
    @Expose
    private ImageUrl [] ImageUrls;

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
     * Get 导入镜像的操作系统架构，x86_64 或 i386 
     * @return Architecture 导入镜像的操作系统架构，x86_64 或 i386
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 导入镜像的操作系统架构，x86_64 或 i386
     * @param Architecture 导入镜像的操作系统架构，x86_64 或 i386
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 导入镜像的操作系统类型，通过DescribeImportImageOs获取 
     * @return OsType 导入镜像的操作系统类型，通过DescribeImportImageOs获取
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 导入镜像的操作系统类型，通过DescribeImportImageOs获取
     * @param OsType 导入镜像的操作系统类型，通过DescribeImportImageOs获取
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 导入镜像的操作系统版本，通过DescribeImportImageOs获取 
     * @return OsVersion 导入镜像的操作系统版本，通过DescribeImportImageOs获取
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set 导入镜像的操作系统版本，通过DescribeImportImageOs获取
     * @param OsVersion 导入镜像的操作系统版本，通过DescribeImportImageOs获取
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
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
     * Get 镜像启动方式，cloudinit或nbd， 默认cloudinit 
     * @return InitFlag 镜像启动方式，cloudinit或nbd， 默认cloudinit
     */
    public String getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set 镜像启动方式，cloudinit或nbd， 默认cloudinit
     * @param InitFlag 镜像启动方式，cloudinit或nbd， 默认cloudinit
     */
    public void setInitFlag(String InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get 镜像文件描述，多层镜像按顺序传入 
     * @return ImageUrls 镜像文件描述，多层镜像按顺序传入
     */
    public ImageUrl [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set 镜像文件描述，多层镜像按顺序传入
     * @param ImageUrls 镜像文件描述，多层镜像按顺序传入
     */
    public void setImageUrls(ImageUrl [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    public ImportCustomImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportCustomImageRequest(ImportCustomImageRequest source) {
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.OsVersion != null) {
            this.OsVersion = new String(source.OsVersion);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.InitFlag != null) {
            this.InitFlag = new String(source.InitFlag);
        }
        if (source.ImageUrls != null) {
            this.ImageUrls = new ImageUrl[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new ImageUrl(source.ImageUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamArrayObj(map, prefix + "ImageUrls.", this.ImageUrls);

    }
}

