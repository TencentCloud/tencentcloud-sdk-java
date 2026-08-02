/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountInfo extends AbstractModel {

    /**
    * <p>文件系统 ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>挂载点 ID</p>
    */
    @SerializedName("MountTargetId")
    @Expose
    private String MountTargetId;

    /**
    * <p>挂载点 IP</p>
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * <p>挂载根目录</p>
    */
    @SerializedName("FSID")
    @Expose
    private String FSID;

    /**
    * <p>挂载点状态，包括creating：创建中；available：运行中；<br>deleting：删除中；<br>create_failed： 创建失败</p>
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * <p>网络类型，包括VPC,CCN</p>
    */
    @SerializedName("NetworkInterface")
    @Expose
    private String NetworkInterface;

    /**
    * <p>私有网络 ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>子网 Id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>子网名称</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>CFS Turbo使用的云联网ID</p>
    */
    @SerializedName("CcnID")
    @Expose
    private String CcnID;

    /**
    * <p>云联网中CFS Turbo使用的网段</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>占用用户ip列表</p>
    */
    @SerializedName("ServerList")
    @Expose
    private String [] ServerList;

    /**
    * <p>是否占用超过200个ip</p>
    */
    @SerializedName("ServerListTruncated")
    @Expose
    private Boolean ServerListTruncated;

    /**
     * Get <p>文件系统 ID</p> 
     * @return FileSystemId <p>文件系统 ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统 ID</p>
     * @param FileSystemId <p>文件系统 ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>挂载点 ID</p> 
     * @return MountTargetId <p>挂载点 ID</p>
     */
    public String getMountTargetId() {
        return this.MountTargetId;
    }

    /**
     * Set <p>挂载点 ID</p>
     * @param MountTargetId <p>挂载点 ID</p>
     */
    public void setMountTargetId(String MountTargetId) {
        this.MountTargetId = MountTargetId;
    }

    /**
     * Get <p>挂载点 IP</p> 
     * @return IpAddress <p>挂载点 IP</p>
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set <p>挂载点 IP</p>
     * @param IpAddress <p>挂载点 IP</p>
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get <p>挂载根目录</p> 
     * @return FSID <p>挂载根目录</p>
     */
    public String getFSID() {
        return this.FSID;
    }

    /**
     * Set <p>挂载根目录</p>
     * @param FSID <p>挂载根目录</p>
     */
    public void setFSID(String FSID) {
        this.FSID = FSID;
    }

    /**
     * Get <p>挂载点状态，包括creating：创建中；available：运行中；<br>deleting：删除中；<br>create_failed： 创建失败</p> 
     * @return LifeCycleState <p>挂载点状态，包括creating：创建中；available：运行中；<br>deleting：删除中；<br>create_failed： 创建失败</p>
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set <p>挂载点状态，包括creating：创建中；available：运行中；<br>deleting：删除中；<br>create_failed： 创建失败</p>
     * @param LifeCycleState <p>挂载点状态，包括creating：创建中；available：运行中；<br>deleting：删除中；<br>create_failed： 创建失败</p>
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get <p>网络类型，包括VPC,CCN</p> 
     * @return NetworkInterface <p>网络类型，包括VPC,CCN</p>
     */
    public String getNetworkInterface() {
        return this.NetworkInterface;
    }

    /**
     * Set <p>网络类型，包括VPC,CCN</p>
     * @param NetworkInterface <p>网络类型，包括VPC,CCN</p>
     */
    public void setNetworkInterface(String NetworkInterface) {
        this.NetworkInterface = NetworkInterface;
    }

    /**
     * Get <p>私有网络 ID</p> 
     * @return VpcId <p>私有网络 ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络 ID</p>
     * @param VpcId <p>私有网络 ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络名称</p> 
     * @return VpcName <p>私有网络名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>私有网络名称</p>
     * @param VpcName <p>私有网络名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>子网 Id</p> 
     * @return SubnetId <p>子网 Id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 Id</p>
     * @param SubnetId <p>子网 Id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>子网名称</p> 
     * @return SubnetName <p>子网名称</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>子网名称</p>
     * @param SubnetName <p>子网名称</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>CFS Turbo使用的云联网ID</p> 
     * @return CcnID <p>CFS Turbo使用的云联网ID</p>
     */
    public String getCcnID() {
        return this.CcnID;
    }

    /**
     * Set <p>CFS Turbo使用的云联网ID</p>
     * @param CcnID <p>CFS Turbo使用的云联网ID</p>
     */
    public void setCcnID(String CcnID) {
        this.CcnID = CcnID;
    }

    /**
     * Get <p>云联网中CFS Turbo使用的网段</p> 
     * @return CidrBlock <p>云联网中CFS Turbo使用的网段</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>云联网中CFS Turbo使用的网段</p>
     * @param CidrBlock <p>云联网中CFS Turbo使用的网段</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>占用用户ip列表</p> 
     * @return ServerList <p>占用用户ip列表</p>
     */
    public String [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set <p>占用用户ip列表</p>
     * @param ServerList <p>占用用户ip列表</p>
     */
    public void setServerList(String [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get <p>是否占用超过200个ip</p> 
     * @return ServerListTruncated <p>是否占用超过200个ip</p>
     */
    public Boolean getServerListTruncated() {
        return this.ServerListTruncated;
    }

    /**
     * Set <p>是否占用超过200个ip</p>
     * @param ServerListTruncated <p>是否占用超过200个ip</p>
     */
    public void setServerListTruncated(Boolean ServerListTruncated) {
        this.ServerListTruncated = ServerListTruncated;
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
        if (source.ServerList != null) {
            this.ServerList = new String[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new String(source.ServerList[i]);
            }
        }
        if (source.ServerListTruncated != null) {
            this.ServerListTruncated = new Boolean(source.ServerListTruncated);
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
        this.setParamArraySimple(map, prefix + "ServerList.", this.ServerList);
        this.setParamSimple(map, prefix + "ServerListTruncated", this.ServerListTruncated);

    }
}

