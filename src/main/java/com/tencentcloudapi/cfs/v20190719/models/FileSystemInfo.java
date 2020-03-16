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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSystemInfo extends AbstractModel{

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 用户自定义名称
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * 文件系统 ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 文件系统状态
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * 文件系统已使用容量
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * 文件系统最大空间限制
    */
    @SerializedName("SizeLimit")
    @Expose
    private Long SizeLimit;

    /**
    * 区域 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 区域名称
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 文件系统协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 文件系统存储类型
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 文件系统绑定的预付费存储包（暂未支持）
    */
    @SerializedName("StorageResourcePkg")
    @Expose
    private String StorageResourcePkg;

    /**
    * 文件系统绑定的预付费带宽包（暂未支持）
    */
    @SerializedName("BandwidthResourcePkg")
    @Expose
    private String BandwidthResourcePkg;

    /**
    * 文件系统绑定权限组信息
    */
    @SerializedName("PGroup")
    @Expose
    private PGroup PGroup;

    /**
    * 用户自定义名称
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * 文件系统是否加密
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * 加密所使用的密钥，可以为密钥的 ID 或者 ARN
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 用户自定义名称 
     * @return CreationToken 用户自定义名称
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set 用户自定义名称
     * @param CreationToken 用户自定义名称
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
    }

    /**
     * Get 文件系统 ID 
     * @return FileSystemId 文件系统 ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统 ID
     * @param FileSystemId 文件系统 ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 文件系统状态 
     * @return LifeCycleState 文件系统状态
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set 文件系统状态
     * @param LifeCycleState 文件系统状态
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get 文件系统已使用容量 
     * @return SizeByte 文件系统已使用容量
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set 文件系统已使用容量
     * @param SizeByte 文件系统已使用容量
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get 文件系统最大空间限制 
     * @return SizeLimit 文件系统最大空间限制
     */
    public Long getSizeLimit() {
        return this.SizeLimit;
    }

    /**
     * Set 文件系统最大空间限制
     * @param SizeLimit 文件系统最大空间限制
     */
    public void setSizeLimit(Long SizeLimit) {
        this.SizeLimit = SizeLimit;
    }

    /**
     * Get 区域 ID 
     * @return ZoneId 区域 ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域 ID
     * @param ZoneId 区域 ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 区域名称 
     * @return Zone 区域名称
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 区域名称
     * @param Zone 区域名称
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 文件系统协议类型 
     * @return Protocol 文件系统协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 文件系统协议类型
     * @param Protocol 文件系统协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 文件系统存储类型 
     * @return StorageType 文件系统存储类型
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 文件系统存储类型
     * @param StorageType 文件系统存储类型
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 文件系统绑定的预付费存储包（暂未支持） 
     * @return StorageResourcePkg 文件系统绑定的预付费存储包（暂未支持）
     */
    public String getStorageResourcePkg() {
        return this.StorageResourcePkg;
    }

    /**
     * Set 文件系统绑定的预付费存储包（暂未支持）
     * @param StorageResourcePkg 文件系统绑定的预付费存储包（暂未支持）
     */
    public void setStorageResourcePkg(String StorageResourcePkg) {
        this.StorageResourcePkg = StorageResourcePkg;
    }

    /**
     * Get 文件系统绑定的预付费带宽包（暂未支持） 
     * @return BandwidthResourcePkg 文件系统绑定的预付费带宽包（暂未支持）
     */
    public String getBandwidthResourcePkg() {
        return this.BandwidthResourcePkg;
    }

    /**
     * Set 文件系统绑定的预付费带宽包（暂未支持）
     * @param BandwidthResourcePkg 文件系统绑定的预付费带宽包（暂未支持）
     */
    public void setBandwidthResourcePkg(String BandwidthResourcePkg) {
        this.BandwidthResourcePkg = BandwidthResourcePkg;
    }

    /**
     * Get 文件系统绑定权限组信息 
     * @return PGroup 文件系统绑定权限组信息
     */
    public PGroup getPGroup() {
        return this.PGroup;
    }

    /**
     * Set 文件系统绑定权限组信息
     * @param PGroup 文件系统绑定权限组信息
     */
    public void setPGroup(PGroup PGroup) {
        this.PGroup = PGroup;
    }

    /**
     * Get 用户自定义名称 
     * @return FsName 用户自定义名称
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set 用户自定义名称
     * @param FsName 用户自定义名称
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get 文件系统是否加密 
     * @return Encrypted 文件系统是否加密
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set 文件系统是否加密
     * @param Encrypted 文件系统是否加密
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get 加密所使用的密钥，可以为密钥的 ID 或者 ARN 
     * @return KmsKeyId 加密所使用的密钥，可以为密钥的 ID 或者 ARN
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set 加密所使用的密钥，可以为密钥的 ID 或者 ARN
     * @param KmsKeyId 加密所使用的密钥，可以为密钥的 ID 或者 ARN
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "SizeByte", this.SizeByte);
        this.setParamSimple(map, prefix + "SizeLimit", this.SizeLimit);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageResourcePkg", this.StorageResourcePkg);
        this.setParamSimple(map, prefix + "BandwidthResourcePkg", this.BandwidthResourcePkg);
        this.setParamObj(map, prefix + "PGroup.", this.PGroup);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

