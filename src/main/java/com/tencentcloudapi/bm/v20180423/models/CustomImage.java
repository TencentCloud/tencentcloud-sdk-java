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

public class CustomImage extends AbstractModel{

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像别名
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像状态码
    */
    @SerializedName("ImageStatus")
    @Expose
    private Long ImageStatus;

    /**
    * 镜像OS名
    */
    @SerializedName("OsClass")
    @Expose
    private String OsClass;

    /**
    * 镜像OS版本
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * OS是64还是32位
    */
    @SerializedName("OsBit")
    @Expose
    private Long OsBit;

    /**
    * 镜像大小(M)
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 分区信息
    */
    @SerializedName("PartitionInfoSet")
    @Expose
    private PartitionInfo [] PartitionInfoSet;

    /**
    * 适用机型
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * 备注
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 原始镜像id
    */
    @SerializedName("OsTypeId")
    @Expose
    private Long OsTypeId;

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
     * Get 镜像别名 
     * @return ImageName 镜像别名
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像别名
     * @param ImageName 镜像别名
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像状态码 
     * @return ImageStatus 镜像状态码
     */
    public Long getImageStatus() {
        return this.ImageStatus;
    }

    /**
     * Set 镜像状态码
     * @param ImageStatus 镜像状态码
     */
    public void setImageStatus(Long ImageStatus) {
        this.ImageStatus = ImageStatus;
    }

    /**
     * Get 镜像OS名 
     * @return OsClass 镜像OS名
     */
    public String getOsClass() {
        return this.OsClass;
    }

    /**
     * Set 镜像OS名
     * @param OsClass 镜像OS名
     */
    public void setOsClass(String OsClass) {
        this.OsClass = OsClass;
    }

    /**
     * Get 镜像OS版本 
     * @return OsVersion 镜像OS版本
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set 镜像OS版本
     * @param OsVersion 镜像OS版本
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get OS是64还是32位 
     * @return OsBit OS是64还是32位
     */
    public Long getOsBit() {
        return this.OsBit;
    }

    /**
     * Set OS是64还是32位
     * @param OsBit OS是64还是32位
     */
    public void setOsBit(Long OsBit) {
        this.OsBit = OsBit;
    }

    /**
     * Get 镜像大小(M) 
     * @return ImageSize 镜像大小(M)
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小(M)
     * @param ImageSize 镜像大小(M)
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 分区信息 
     * @return PartitionInfoSet 分区信息
     */
    public PartitionInfo [] getPartitionInfoSet() {
        return this.PartitionInfoSet;
    }

    /**
     * Set 分区信息
     * @param PartitionInfoSet 分区信息
     */
    public void setPartitionInfoSet(PartitionInfo [] PartitionInfoSet) {
        this.PartitionInfoSet = PartitionInfoSet;
    }

    /**
     * Get 适用机型 
     * @return DeviceClassCode 适用机型
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * Set 适用机型
     * @param DeviceClassCode 适用机型
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * Get 备注 
     * @return ImageDescription 备注
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 备注
     * @param ImageDescription 备注
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 原始镜像id 
     * @return OsTypeId 原始镜像id
     */
    public Long getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * Set 原始镜像id
     * @param OsTypeId 原始镜像id
     */
    public void setOsTypeId(Long OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageStatus", this.ImageStatus);
        this.setParamSimple(map, prefix + "OsClass", this.OsClass);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "OsBit", this.OsBit);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "PartitionInfoSet.", this.PartitionInfoSet);
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);

    }
}

