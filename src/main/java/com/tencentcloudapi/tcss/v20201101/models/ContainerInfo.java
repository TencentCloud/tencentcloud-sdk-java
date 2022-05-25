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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerInfo extends AbstractModel{

    /**
    * 容器id
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 容器运行状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 运行用户
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * 命令行
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * CPU使用率 *1000
    */
    @SerializedName("CPUUsage")
    @Expose
    private Long CPUUsage;

    /**
    * 内存使用 kb
    */
    @SerializedName("RamUsage")
    @Expose
    private Long RamUsage;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像id
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像id
    */
    @SerializedName("POD")
    @Expose
    private String POD;

    /**
    * 主机id
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 主机ip
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 外网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * 网络子状态
    */
    @SerializedName("NetSubStatus")
    @Expose
    private String NetSubStatus;

    /**
    * 隔离来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateSource")
    @Expose
    private String IsolateSource;

    /**
    * 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
     * Get 容器id 
     * @return ContainerID 容器id
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set 容器id
     * @param ContainerID 容器id
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get 容器名称 
     * @return ContainerName 容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
     * @param ContainerName 容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 容器运行状态 
     * @return Status 容器运行状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 容器运行状态
     * @param Status 容器运行状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 运行用户 
     * @return RunAs 运行用户
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 运行用户
     * @param RunAs 运行用户
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get 命令行 
     * @return Cmd 命令行
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 命令行
     * @param Cmd 命令行
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get CPU使用率 *1000 
     * @return CPUUsage CPU使用率 *1000
     */
    public Long getCPUUsage() {
        return this.CPUUsage;
    }

    /**
     * Set CPU使用率 *1000
     * @param CPUUsage CPU使用率 *1000
     */
    public void setCPUUsage(Long CPUUsage) {
        this.CPUUsage = CPUUsage;
    }

    /**
     * Get 内存使用 kb 
     * @return RamUsage 内存使用 kb
     */
    public Long getRamUsage() {
        return this.RamUsage;
    }

    /**
     * Set 内存使用 kb
     * @param RamUsage 内存使用 kb
     */
    public void setRamUsage(Long RamUsage) {
        this.RamUsage = RamUsage;
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
     * Get 镜像id 
     * @return ImageID 镜像id
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像id
     * @param ImageID 镜像id
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 镜像id 
     * @return POD 镜像id
     */
    public String getPOD() {
        return this.POD;
    }

    /**
     * Set 镜像id
     * @param POD 镜像id
     */
    public void setPOD(String POD) {
        this.POD = POD;
    }

    /**
     * Get 主机id 
     * @return HostID 主机id
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set 主机id
     * @param HostID 主机id
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get 主机ip 
     * @return HostIP 主机ip
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机ip
     * @param HostIP 主机ip
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 外网ip 
     * @return PublicIp 外网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 外网ip
     * @param PublicIp 外网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED 
     * @return NetStatus 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
     * @param NetStatus 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * Get 网络子状态 
     * @return NetSubStatus 网络子状态
     */
    public String getNetSubStatus() {
        return this.NetSubStatus;
    }

    /**
     * Set 网络子状态
     * @param NetSubStatus 网络子状态
     */
    public void setNetSubStatus(String NetSubStatus) {
        this.NetSubStatus = NetSubStatus;
    }

    /**
     * Get 隔离来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateSource 隔离来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolateSource() {
        return this.IsolateSource;
    }

    /**
     * Set 隔离来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateSource 隔离来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateSource(String IsolateSource) {
        this.IsolateSource = IsolateSource;
    }

    /**
     * Get 隔离时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateTime 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateTime 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    public ContainerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerInfo(ContainerInfo source) {
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.CPUUsage != null) {
            this.CPUUsage = new Long(source.CPUUsage);
        }
        if (source.RamUsage != null) {
            this.RamUsage = new Long(source.RamUsage);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.POD != null) {
            this.POD = new String(source.POD);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.NetStatus != null) {
            this.NetStatus = new String(source.NetStatus);
        }
        if (source.NetSubStatus != null) {
            this.NetSubStatus = new String(source.NetSubStatus);
        }
        if (source.IsolateSource != null) {
            this.IsolateSource = new String(source.IsolateSource);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "CPUUsage", this.CPUUsage);
        this.setParamSimple(map, prefix + "RamUsage", this.RamUsage);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "POD", this.POD);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamSimple(map, prefix + "NetSubStatus", this.NetSubStatus);
        this.setParamSimple(map, prefix + "IsolateSource", this.IsolateSource);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);

    }
}

