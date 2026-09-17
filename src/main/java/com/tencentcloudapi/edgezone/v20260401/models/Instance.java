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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>绑定的物理机ID</p>
    */
    @SerializedName("MachineId")
    @Expose
    private String MachineId;

    /**
    * <p>机型规格</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>可用区代码</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>镜像ID</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>镜像版本号</p>
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * <p>实例状态，可选值：allocating、running、isolating、isolated、terminating、error</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>操作状态，可选值：normal、starting、stopping、stopped、rebooting</p>
    */
    @SerializedName("OperateStatus")
    @Expose
    private String OperateStatus;

    /**
    * <p>私有网络ID</p>
    */
    @SerializedName("PrivateNetworkId")
    @Expose
    private String PrivateNetworkId;

    /**
    * <p>私有IPv4地址</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>私有IPv6地址</p>
    */
    @SerializedName("PrivateIpV6")
    @Expose
    private String PrivateIpV6;

    /**
    * <p>公网网络ID</p>
    */
    @SerializedName("PublicNetworkId")
    @Expose
    private String PublicNetworkId;

    /**
    * <p>公网IPv4地址</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>公网IPv6地址</p>
    */
    @SerializedName("PublicIpV6")
    @Expose
    private String PublicIpV6;

    /**
    * <p>文件系统类型</p>
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
    * <p>创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>机型族标识</p>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * <p>机型族名称</p>
    */
    @SerializedName("InstanceFamilyName")
    @Expose
    private String InstanceFamilyName;

    /**
    * <p>CPU 型号</p>
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * <p>CPU 核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存大小</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>绑定的物理机ID</p> 
     * @return MachineId <p>绑定的物理机ID</p>
     */
    public String getMachineId() {
        return this.MachineId;
    }

    /**
     * Set <p>绑定的物理机ID</p>
     * @param MachineId <p>绑定的物理机ID</p>
     */
    public void setMachineId(String MachineId) {
        this.MachineId = MachineId;
    }

    /**
     * Get <p>机型规格</p> 
     * @return InstanceType <p>机型规格</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>机型规格</p>
     * @param InstanceType <p>机型规格</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>可用区代码</p> 
     * @return Zone <p>可用区代码</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区代码</p>
     * @param Zone <p>可用区代码</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>镜像ID</p> 
     * @return ImageId <p>镜像ID</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像ID</p>
     * @param ImageId <p>镜像ID</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>镜像版本号</p> 
     * @return VersionNumber <p>镜像版本号</p>
     * @deprecated
     */
    @Deprecated
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set <p>镜像版本号</p>
     * @param VersionNumber <p>镜像版本号</p>
     * @deprecated
     */
    @Deprecated
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get <p>实例状态，可选值：allocating、running、isolating、isolated、terminating、error</p> 
     * @return InstanceStatus <p>实例状态，可选值：allocating、running、isolating、isolated、terminating、error</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态，可选值：allocating、running、isolating、isolated、terminating、error</p>
     * @param InstanceStatus <p>实例状态，可选值：allocating、running、isolating、isolated、terminating、error</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>操作状态，可选值：normal、starting、stopping、stopped、rebooting</p> 
     * @return OperateStatus <p>操作状态，可选值：normal、starting、stopping、stopped、rebooting</p>
     */
    public String getOperateStatus() {
        return this.OperateStatus;
    }

    /**
     * Set <p>操作状态，可选值：normal、starting、stopping、stopped、rebooting</p>
     * @param OperateStatus <p>操作状态，可选值：normal、starting、stopping、stopped、rebooting</p>
     */
    public void setOperateStatus(String OperateStatus) {
        this.OperateStatus = OperateStatus;
    }

    /**
     * Get <p>私有网络ID</p> 
     * @return PrivateNetworkId <p>私有网络ID</p>
     */
    public String getPrivateNetworkId() {
        return this.PrivateNetworkId;
    }

    /**
     * Set <p>私有网络ID</p>
     * @param PrivateNetworkId <p>私有网络ID</p>
     */
    public void setPrivateNetworkId(String PrivateNetworkId) {
        this.PrivateNetworkId = PrivateNetworkId;
    }

    /**
     * Get <p>私有IPv4地址</p> 
     * @return PrivateIp <p>私有IPv4地址</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>私有IPv4地址</p>
     * @param PrivateIp <p>私有IPv4地址</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>私有IPv6地址</p> 
     * @return PrivateIpV6 <p>私有IPv6地址</p>
     */
    public String getPrivateIpV6() {
        return this.PrivateIpV6;
    }

    /**
     * Set <p>私有IPv6地址</p>
     * @param PrivateIpV6 <p>私有IPv6地址</p>
     */
    public void setPrivateIpV6(String PrivateIpV6) {
        this.PrivateIpV6 = PrivateIpV6;
    }

    /**
     * Get <p>公网网络ID</p> 
     * @return PublicNetworkId <p>公网网络ID</p>
     */
    public String getPublicNetworkId() {
        return this.PublicNetworkId;
    }

    /**
     * Set <p>公网网络ID</p>
     * @param PublicNetworkId <p>公网网络ID</p>
     */
    public void setPublicNetworkId(String PublicNetworkId) {
        this.PublicNetworkId = PublicNetworkId;
    }

    /**
     * Get <p>公网IPv4地址</p> 
     * @return PublicIp <p>公网IPv4地址</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网IPv4地址</p>
     * @param PublicIp <p>公网IPv4地址</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>公网IPv6地址</p> 
     * @return PublicIpV6 <p>公网IPv6地址</p>
     */
    public String getPublicIpV6() {
        return this.PublicIpV6;
    }

    /**
     * Set <p>公网IPv6地址</p>
     * @param PublicIpV6 <p>公网IPv6地址</p>
     */
    public void setPublicIpV6(String PublicIpV6) {
        this.PublicIpV6 = PublicIpV6;
    }

    /**
     * Get <p>文件系统类型</p> 
     * @return FileSystemType <p>文件系统类型</p>
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set <p>文件系统类型</p>
     * @param FileSystemType <p>文件系统类型</p>
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    /**
     * Get <p>创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p> 
     * @return CreatedTime <p>创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p>
     * @param CreatedTime <p>创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>机型族标识</p> 
     * @return InstanceFamily <p>机型族标识</p>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set <p>机型族标识</p>
     * @param InstanceFamily <p>机型族标识</p>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get <p>机型族名称</p> 
     * @return InstanceFamilyName <p>机型族名称</p>
     */
    public String getInstanceFamilyName() {
        return this.InstanceFamilyName;
    }

    /**
     * Set <p>机型族名称</p>
     * @param InstanceFamilyName <p>机型族名称</p>
     */
    public void setInstanceFamilyName(String InstanceFamilyName) {
        this.InstanceFamilyName = InstanceFamilyName;
    }

    /**
     * Get <p>CPU 型号</p> 
     * @return CpuType <p>CPU 型号</p>
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set <p>CPU 型号</p>
     * @param CpuType <p>CPU 型号</p>
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get <p>CPU 核数</p> 
     * @return Cpu <p>CPU 核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU 核数</p>
     * @param Cpu <p>CPU 核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存大小</p> 
     * @return Memory <p>内存大小</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小</p>
     * @param Memory <p>内存大小</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MachineId != null) {
            this.MachineId = new String(source.MachineId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.OperateStatus != null) {
            this.OperateStatus = new String(source.OperateStatus);
        }
        if (source.PrivateNetworkId != null) {
            this.PrivateNetworkId = new String(source.PrivateNetworkId);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PrivateIpV6 != null) {
            this.PrivateIpV6 = new String(source.PrivateIpV6);
        }
        if (source.PublicNetworkId != null) {
            this.PublicNetworkId = new String(source.PublicNetworkId);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PublicIpV6 != null) {
            this.PublicIpV6 = new String(source.PublicIpV6);
        }
        if (source.FileSystemType != null) {
            this.FileSystemType = new String(source.FileSystemType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.InstanceFamilyName != null) {
            this.InstanceFamilyName = new String(source.InstanceFamilyName);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "MachineId", this.MachineId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "OperateStatus", this.OperateStatus);
        this.setParamSimple(map, prefix + "PrivateNetworkId", this.PrivateNetworkId);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PrivateIpV6", this.PrivateIpV6);
        this.setParamSimple(map, prefix + "PublicNetworkId", this.PublicNetworkId);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PublicIpV6", this.PublicIpV6);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "InstanceFamilyName", this.InstanceFamilyName);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

