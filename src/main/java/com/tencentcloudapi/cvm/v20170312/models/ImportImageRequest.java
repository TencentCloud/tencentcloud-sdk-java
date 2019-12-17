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

public class ImportImageRequest extends AbstractModel{

    /**
    * 导入镜像的操作系统架构，`x86_64` 或 `i386`
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 导入镜像的操作系统类型，通过`DescribeImportImageOs`获取
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * 导入镜像的操作系统版本，通过`DescribeImportImageOs`获取
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * 导入镜像存放的cos地址
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

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
    * 只检查参数，不执行任务
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 是否强制导入，参考[强制导入镜像](https://cloud.tencent.com/document/product/213/12849)
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get 导入镜像的操作系统架构，`x86_64` 或 `i386` 
     * @return Architecture 导入镜像的操作系统架构，`x86_64` 或 `i386`
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 导入镜像的操作系统架构，`x86_64` 或 `i386`
     * @param Architecture 导入镜像的操作系统架构，`x86_64` 或 `i386`
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 导入镜像的操作系统类型，通过`DescribeImportImageOs`获取 
     * @return OsType 导入镜像的操作系统类型，通过`DescribeImportImageOs`获取
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 导入镜像的操作系统类型，通过`DescribeImportImageOs`获取
     * @param OsType 导入镜像的操作系统类型，通过`DescribeImportImageOs`获取
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 导入镜像的操作系统版本，通过`DescribeImportImageOs`获取 
     * @return OsVersion 导入镜像的操作系统版本，通过`DescribeImportImageOs`获取
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set 导入镜像的操作系统版本，通过`DescribeImportImageOs`获取
     * @param OsVersion 导入镜像的操作系统版本，通过`DescribeImportImageOs`获取
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get 导入镜像存放的cos地址 
     * @return ImageUrl 导入镜像存放的cos地址
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 导入镜像存放的cos地址
     * @param ImageUrl 导入镜像存放的cos地址
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
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
     * Get 只检查参数，不执行任务 
     * @return DryRun 只检查参数，不执行任务
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 只检查参数，不执行任务
     * @param DryRun 只检查参数，不执行任务
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 是否强制导入，参考[强制导入镜像](https://cloud.tencent.com/document/product/213/12849) 
     * @return Force 是否强制导入，参考[强制导入镜像](https://cloud.tencent.com/document/product/213/12849)
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制导入，参考[强制导入镜像](https://cloud.tencent.com/document/product/213/12849)
     * @param Force 是否强制导入，参考[强制导入镜像](https://cloud.tencent.com/document/product/213/12849)
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

