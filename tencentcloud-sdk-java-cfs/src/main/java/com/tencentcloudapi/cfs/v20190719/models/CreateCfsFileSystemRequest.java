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

public class CreateCfsFileSystemRequest extends AbstractModel{

    /**
    * 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络
    */
    @SerializedName("NetInterface")
    @Expose
    private String NetInterface;

    /**
    * 权限组 ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 文件系统存储类型，值为 SD ；其中 SD 为标准型存储， HP为性能存储。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID，若网络类型选择的是VPC，该字段为必填。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP
    */
    @SerializedName("MountIP")
    @Expose
    private String MountIP;

    /**
    * 用户自定义文件系统名称
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * 文件系统标签
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
     * Get 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表 
     * @return Zone 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     * @param Zone 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络 
     * @return NetInterface 网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络
     */
    public String getNetInterface() {
        return this.NetInterface;
    }

    /**
     * Set 网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络
     * @param NetInterface 网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络
     */
    public void setNetInterface(String NetInterface) {
        this.NetInterface = NetInterface;
    }

    /**
     * Get 权限组 ID 
     * @return PGroupId 权限组 ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID
     * @param PGroupId 权限组 ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get 文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议 
     * @return Protocol 文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议
     * @param Protocol 文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 文件系统存储类型，值为 SD ；其中 SD 为标准型存储， HP为性能存储。 
     * @return StorageType 文件系统存储类型，值为 SD ；其中 SD 为标准型存储， HP为性能存储。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 文件系统存储类型，值为 SD ；其中 SD 为标准型存储， HP为性能存储。
     * @param StorageType 文件系统存储类型，值为 SD ；其中 SD 为标准型存储， HP为性能存储。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。 
     * @return VpcId 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。
     * @param VpcId 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID，若网络类型选择的是VPC，该字段为必填。 
     * @return SubnetId 子网 ID，若网络类型选择的是VPC，该字段为必填。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID，若网络类型选择的是VPC，该字段为必填。
     * @param SubnetId 子网 ID，若网络类型选择的是VPC，该字段为必填。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP 
     * @return MountIP 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP
     */
    public String getMountIP() {
        return this.MountIP;
    }

    /**
     * Set 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP
     * @param MountIP 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP
     */
    public void setMountIP(String MountIP) {
        this.MountIP = MountIP;
    }

    /**
     * Get 用户自定义文件系统名称 
     * @return FsName 用户自定义文件系统名称
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set 用户自定义文件系统名称
     * @param FsName 用户自定义文件系统名称
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get 文件系统标签 
     * @return ResourceTags 文件系统标签
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 文件系统标签
     * @param ResourceTags 文件系统标签
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NetInterface", this.NetInterface);
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "MountIP", this.MountIP);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

