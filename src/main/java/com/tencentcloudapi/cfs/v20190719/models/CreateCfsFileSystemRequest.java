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

public class CreateCfsFileSystemRequest  extends AbstractModel{

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
    * 文件系统存储类型，值为 SD ；其中 SD 为标准型存储
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 私有网路（VPC） ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID
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
     * 获取可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     * @return Zone 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     * @param Zone 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络
     * @return NetInterface 网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络
     */
    public String getNetInterface() {
        return this.NetInterface;
    }

    /**
     * 设置网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络
     * @param NetInterface 网络类型，值为 VPC，BASIC；其中 VPC 为私有网络，BASIC 为基础网络
     */
    public void setNetInterface(String NetInterface) {
        this.NetInterface = NetInterface;
    }

    /**
     * 获取权限组 ID
     * @return PGroupId 权限组 ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * 设置权限组 ID
     * @param PGroupId 权限组 ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * 获取文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议
     * @return Protocol 文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议
     * @param Protocol 文件系统协议类型， 值为 NFS、CIFS; 若留空则默认为 NFS协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取文件系统存储类型，值为 SD ；其中 SD 为标准型存储
     * @return StorageType 文件系统存储类型，值为 SD ；其中 SD 为标准型存储
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * 设置文件系统存储类型，值为 SD ；其中 SD 为标准型存储
     * @param StorageType 文件系统存储类型，值为 SD ；其中 SD 为标准型存储
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * 获取私有网路（VPC） ID
     * @return VpcId 私有网路（VPC） ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网路（VPC） ID
     * @param VpcId 私有网路（VPC） ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网 ID
     * @return SubnetId 子网 ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网 ID
     * @param SubnetId 子网 ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP
     * @return MountIP 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP
     */
    public String getMountIP() {
        return this.MountIP;
    }

    /**
     * 设置指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP
     * @param MountIP 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP
     */
    public void setMountIP(String MountIP) {
        this.MountIP = MountIP;
    }

    /**
     * 获取用户自定义文件系统名称
     * @return FsName 用户自定义文件系统名称
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * 设置用户自定义文件系统名称
     * @param FsName 用户自定义文件系统名称
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

