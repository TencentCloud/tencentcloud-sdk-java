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

public class ExportImagesRequest extends AbstractModel{

    /**
    * COS存储桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 镜像ID列表
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 镜像文件导出格式。取值范围：RAW，QCOW2，VHD，VMDK。默认为RAW
    */
    @SerializedName("ExportFormat")
    @Expose
    private String ExportFormat;

    /**
    * 导出文件的名称前缀列表
    */
    @SerializedName("FileNamePrefixList")
    @Expose
    private String [] FileNamePrefixList;

    /**
    * 是否只导出系统盘
    */
    @SerializedName("OnlyExportRootDisk")
    @Expose
    private Boolean OnlyExportRootDisk;

    /**
    * 检测镜像是否支持导出
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 角色名称。默认为CVM_QcsRole，发起请求前请确认是否存在该角色，以及是否已正确配置COS写入权限。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get COS存储桶名称 
     * @return BucketName COS存储桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set COS存储桶名称
     * @param BucketName COS存储桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 镜像ID列表 
     * @return ImageIds 镜像ID列表
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 镜像ID列表
     * @param ImageIds 镜像ID列表
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 镜像文件导出格式。取值范围：RAW，QCOW2，VHD，VMDK。默认为RAW 
     * @return ExportFormat 镜像文件导出格式。取值范围：RAW，QCOW2，VHD，VMDK。默认为RAW
     */
    public String getExportFormat() {
        return this.ExportFormat;
    }

    /**
     * Set 镜像文件导出格式。取值范围：RAW，QCOW2，VHD，VMDK。默认为RAW
     * @param ExportFormat 镜像文件导出格式。取值范围：RAW，QCOW2，VHD，VMDK。默认为RAW
     */
    public void setExportFormat(String ExportFormat) {
        this.ExportFormat = ExportFormat;
    }

    /**
     * Get 导出文件的名称前缀列表 
     * @return FileNamePrefixList 导出文件的名称前缀列表
     */
    public String [] getFileNamePrefixList() {
        return this.FileNamePrefixList;
    }

    /**
     * Set 导出文件的名称前缀列表
     * @param FileNamePrefixList 导出文件的名称前缀列表
     */
    public void setFileNamePrefixList(String [] FileNamePrefixList) {
        this.FileNamePrefixList = FileNamePrefixList;
    }

    /**
     * Get 是否只导出系统盘 
     * @return OnlyExportRootDisk 是否只导出系统盘
     */
    public Boolean getOnlyExportRootDisk() {
        return this.OnlyExportRootDisk;
    }

    /**
     * Set 是否只导出系统盘
     * @param OnlyExportRootDisk 是否只导出系统盘
     */
    public void setOnlyExportRootDisk(Boolean OnlyExportRootDisk) {
        this.OnlyExportRootDisk = OnlyExportRootDisk;
    }

    /**
     * Get 检测镜像是否支持导出 
     * @return DryRun 检测镜像是否支持导出
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 检测镜像是否支持导出
     * @param DryRun 检测镜像是否支持导出
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 角色名称。默认为CVM_QcsRole，发起请求前请确认是否存在该角色，以及是否已正确配置COS写入权限。 
     * @return RoleName 角色名称。默认为CVM_QcsRole，发起请求前请确认是否存在该角色，以及是否已正确配置COS写入权限。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称。默认为CVM_QcsRole，发起请求前请确认是否存在该角色，以及是否已正确配置COS写入权限。
     * @param RoleName 角色名称。默认为CVM_QcsRole，发起请求前请确认是否存在该角色，以及是否已正确配置COS写入权限。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public ExportImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportImagesRequest(ExportImagesRequest source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.ExportFormat != null) {
            this.ExportFormat = new String(source.ExportFormat);
        }
        if (source.FileNamePrefixList != null) {
            this.FileNamePrefixList = new String[source.FileNamePrefixList.length];
            for (int i = 0; i < source.FileNamePrefixList.length; i++) {
                this.FileNamePrefixList[i] = new String(source.FileNamePrefixList[i]);
            }
        }
        if (source.OnlyExportRootDisk != null) {
            this.OnlyExportRootDisk = new Boolean(source.OnlyExportRootDisk);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "ExportFormat", this.ExportFormat);
        this.setParamArraySimple(map, prefix + "FileNamePrefixList.", this.FileNamePrefixList);
        this.setParamSimple(map, prefix + "OnlyExportRootDisk", this.OnlyExportRootDisk);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

