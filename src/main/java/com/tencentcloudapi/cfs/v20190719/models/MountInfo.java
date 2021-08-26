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

public class MountInfo extends AbstractModel{

    /**
    * 文件系统 ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 挂载点 ID
    */
    @SerializedName("MountTargetId")
    @Expose
    private String MountTargetId;

    /**
    * 挂载点 IP
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 挂载根目录
    */
    @SerializedName("FSID")
    @Expose
    private String FSID;

    /**
    * 挂载点状态
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * 网络类型
    */
    @SerializedName("NetworkInterface")
    @Expose
    private String NetworkInterface;

    /**
    * 私有网络 ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 子网 Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * CFS Turbo使用的云联网ID
    */
    @SerializedName("CcnID")
    @Expose
    private String CcnID;

    /**
    * 云联网中CFS Turbo使用的网段
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

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
     * Get 挂载点 ID 
     * @return MountTargetId 挂载点 ID
     */
    public String getMountTargetId() {
        return this.MountTargetId;
    }

    /**
     * Set 挂载点 ID
     * @param MountTargetId 挂载点 ID
     */
    public void setMountTargetId(String MountTargetId) {
        this.MountTargetId = MountTargetId;
    }

    /**
     * Get 挂载点 IP 
     * @return IpAddress 挂载点 IP
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 挂载点 IP
     * @param IpAddress 挂载点 IP
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 挂载根目录 
     * @return FSID 挂载根目录
     */
    public String getFSID() {
        return this.FSID;
    }

    /**
     * Set 挂载根目录
     * @param FSID 挂载根目录
     */
    public void setFSID(String FSID) {
        this.FSID = FSID;
    }

    /**
     * Get 挂载点状态 
     * @return LifeCycleState 挂载点状态
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set 挂载点状态
     * @param LifeCycleState 挂载点状态
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get 网络类型 
     * @return NetworkInterface 网络类型
     */
    public String getNetworkInterface() {
        return this.NetworkInterface;
    }

    /**
     * Set 网络类型
     * @param NetworkInterface 网络类型
     */
    public void setNetworkInterface(String NetworkInterface) {
        this.NetworkInterface = NetworkInterface;
    }

    /**
     * Get 私有网络 ID 
     * @return VpcId 私有网络 ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 ID
     * @param VpcId 私有网络 ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络名称 
     * @return VpcName 私有网络名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称
     * @param VpcName 私有网络名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 子网 Id 
     * @return SubnetId 子网 Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 Id
     * @param SubnetId 子网 Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名称 
     * @return SubnetName 子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
     * @param SubnetName 子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get CFS Turbo使用的云联网ID 
     * @return CcnID CFS Turbo使用的云联网ID
     */
    public String getCcnID() {
        return this.CcnID;
    }

    /**
     * Set CFS Turbo使用的云联网ID
     * @param CcnID CFS Turbo使用的云联网ID
     */
    public void setCcnID(String CcnID) {
        this.CcnID = CcnID;
    }

    /**
     * Get 云联网中CFS Turbo使用的网段 
     * @return CidrBlock 云联网中CFS Turbo使用的网段
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 云联网中CFS Turbo使用的网段
     * @param CidrBlock 云联网中CFS Turbo使用的网段
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    public MountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountInfo(MountInfo source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.MountTargetId != null) {
            this.MountTargetId = new String(source.MountTargetId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.FSID != null) {
            this.FSID = new String(source.FSID);
        }
        if (source.LifeCycleState != null) {
            this.LifeCycleState = new String(source.LifeCycleState);
        }
        if (source.NetworkInterface != null) {
            this.NetworkInterface = new String(source.NetworkInterface);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.CcnID != null) {
            this.CcnID = new String(source.CcnID);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "MountTargetId", this.MountTargetId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "FSID", this.FSID);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "NetworkInterface", this.NetworkInterface);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CcnID", this.CcnID);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);

    }
}

