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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostInfo extends AbstractModel {

    /**
    * <p>主机id</p>
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * <p>主机ip即内网ip</p>
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * <p>主机名称</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>业务组</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>docker 版本</p>
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * <p>docker 文件系统类型</p>
    */
    @SerializedName("DockerFileSystemDriver")
    @Expose
    private String DockerFileSystemDriver;

    /**
    * <p>镜像个数</p>
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * <p>容器个数</p>
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * <p>agent运行状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否是Containerd</p>
    */
    @SerializedName("IsContainerd")
    @Expose
    private Boolean IsContainerd;

    /**
    * <p>主机来源：[&quot;CVM&quot;, &quot;ECM&quot;, &quot;LH&quot;, &quot;BM&quot;]  中的之一为腾讯云服务器；[&quot;Other&quot;]之一非腾讯云服务器；</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>外网ip</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>主机uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>主机实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * <p>所属项目</p>
    */
    @SerializedName("Project")
    @Expose
    private ProjectInfo Project;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群接入状态</p>
    */
    @SerializedName("ClusterAccessedStatus")
    @Expose
    private String ClusterAccessedStatus;

    /**
    * <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul>
    */
    @SerializedName("ClusterAccessedSubStatus")
    @Expose
    private String ClusterAccessedSubStatus;

    /**
    * <p>失败具体原因描述</p>
    */
    @SerializedName("ClusterAccessedErrorReason")
    @Expose
    private String ClusterAccessedErrorReason;

    /**
    * <p>计费核数</p>
    */
    @SerializedName("ChargeCoresCnt")
    @Expose
    private Long ChargeCoresCnt;

    /**
    * <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>核数</p>
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * <p>最近在线时间</p>
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private String LastOnlineTime;

    /**
     * Get <p>主机id</p> 
     * @return HostID <p>主机id</p>
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set <p>主机id</p>
     * @param HostID <p>主机id</p>
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get <p>主机ip即内网ip</p> 
     * @return HostIP <p>主机ip即内网ip</p>
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set <p>主机ip即内网ip</p>
     * @param HostIP <p>主机ip即内网ip</p>
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get <p>主机名称</p> 
     * @return HostName <p>主机名称</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>主机名称</p>
     * @param HostName <p>主机名称</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>业务组</p> 
     * @return Group <p>业务组</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>业务组</p>
     * @param Group <p>业务组</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>docker 版本</p> 
     * @return DockerVersion <p>docker 版本</p>
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set <p>docker 版本</p>
     * @param DockerVersion <p>docker 版本</p>
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get <p>docker 文件系统类型</p> 
     * @return DockerFileSystemDriver <p>docker 文件系统类型</p>
     */
    public String getDockerFileSystemDriver() {
        return this.DockerFileSystemDriver;
    }

    /**
     * Set <p>docker 文件系统类型</p>
     * @param DockerFileSystemDriver <p>docker 文件系统类型</p>
     */
    public void setDockerFileSystemDriver(String DockerFileSystemDriver) {
        this.DockerFileSystemDriver = DockerFileSystemDriver;
    }

    /**
     * Get <p>镜像个数</p> 
     * @return ImageCnt <p>镜像个数</p>
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set <p>镜像个数</p>
     * @param ImageCnt <p>镜像个数</p>
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get <p>容器个数</p> 
     * @return ContainerCnt <p>容器个数</p>
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set <p>容器个数</p>
     * @param ContainerCnt <p>容器个数</p>
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get <p>agent运行状态</p> 
     * @return Status <p>agent运行状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>agent运行状态</p>
     * @param Status <p>agent运行状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否是Containerd</p> 
     * @return IsContainerd <p>是否是Containerd</p>
     */
    public Boolean getIsContainerd() {
        return this.IsContainerd;
    }

    /**
     * Set <p>是否是Containerd</p>
     * @param IsContainerd <p>是否是Containerd</p>
     */
    public void setIsContainerd(Boolean IsContainerd) {
        this.IsContainerd = IsContainerd;
    }

    /**
     * Get <p>主机来源：[&quot;CVM&quot;, &quot;ECM&quot;, &quot;LH&quot;, &quot;BM&quot;]  中的之一为腾讯云服务器；[&quot;Other&quot;]之一非腾讯云服务器；</p> 
     * @return MachineType <p>主机来源：[&quot;CVM&quot;, &quot;ECM&quot;, &quot;LH&quot;, &quot;BM&quot;]  中的之一为腾讯云服务器；[&quot;Other&quot;]之一非腾讯云服务器；</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>主机来源：[&quot;CVM&quot;, &quot;ECM&quot;, &quot;LH&quot;, &quot;BM&quot;]  中的之一为腾讯云服务器；[&quot;Other&quot;]之一非腾讯云服务器；</p>
     * @param MachineType <p>主机来源：[&quot;CVM&quot;, &quot;ECM&quot;, &quot;LH&quot;, &quot;BM&quot;]  中的之一为腾讯云服务器；[&quot;Other&quot;]之一非腾讯云服务器；</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>外网ip</p> 
     * @return PublicIp <p>外网ip</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>外网ip</p>
     * @param PublicIp <p>外网ip</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>主机uuid</p> 
     * @return Uuid <p>主机uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机uuid</p>
     * @param Uuid <p>主机uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>主机实例ID</p> 
     * @return InstanceID <p>主机实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>主机实例ID</p>
     * @param InstanceID <p>主机实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>地域ID</p> 
     * @return RegionID <p>地域ID</p>
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set <p>地域ID</p>
     * @param RegionID <p>地域ID</p>
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get <p>所属项目</p> 
     * @return Project <p>所属项目</p>
     */
    public ProjectInfo getProject() {
        return this.Project;
    }

    /**
     * Set <p>所属项目</p>
     * @param Project <p>所属项目</p>
     */
    public void setProject(ProjectInfo Project) {
        this.Project = Project;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterID <p>集群id</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterID <p>集群id</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群接入状态</p> 
     * @return ClusterAccessedStatus <p>集群接入状态</p>
     */
    public String getClusterAccessedStatus() {
        return this.ClusterAccessedStatus;
    }

    /**
     * Set <p>集群接入状态</p>
     * @param ClusterAccessedStatus <p>集群接入状态</p>
     */
    public void setClusterAccessedStatus(String ClusterAccessedStatus) {
        this.ClusterAccessedStatus = ClusterAccessedStatus;
    }

    /**
     * Get <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul> 
     * @return ClusterAccessedSubStatus <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul>
     */
    public String getClusterAccessedSubStatus() {
        return this.ClusterAccessedSubStatus;
    }

    /**
     * Set <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul>
     * @param ClusterAccessedSubStatus <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul>
     */
    public void setClusterAccessedSubStatus(String ClusterAccessedSubStatus) {
        this.ClusterAccessedSubStatus = ClusterAccessedSubStatus;
    }

    /**
     * Get <p>失败具体原因描述</p> 
     * @return ClusterAccessedErrorReason <p>失败具体原因描述</p>
     */
    public String getClusterAccessedErrorReason() {
        return this.ClusterAccessedErrorReason;
    }

    /**
     * Set <p>失败具体原因描述</p>
     * @param ClusterAccessedErrorReason <p>失败具体原因描述</p>
     */
    public void setClusterAccessedErrorReason(String ClusterAccessedErrorReason) {
        this.ClusterAccessedErrorReason = ClusterAccessedErrorReason;
    }

    /**
     * Get <p>计费核数</p> 
     * @return ChargeCoresCnt <p>计费核数</p>
     */
    public Long getChargeCoresCnt() {
        return this.ChargeCoresCnt;
    }

    /**
     * Set <p>计费核数</p>
     * @param ChargeCoresCnt <p>计费核数</p>
     */
    public void setChargeCoresCnt(Long ChargeCoresCnt) {
        this.ChargeCoresCnt = ChargeCoresCnt;
    }

    /**
     * Get <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p> 
     * @return DefendStatus <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p>
     * @param DefendStatus <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>核数</p> 
     * @return CoresCnt <p>核数</p>
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set <p>核数</p>
     * @param CoresCnt <p>核数</p>
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get <p>最近在线时间</p> 
     * @return LastOnlineTime <p>最近在线时间</p>
     */
    public String getLastOnlineTime() {
        return this.LastOnlineTime;
    }

    /**
     * Set <p>最近在线时间</p>
     * @param LastOnlineTime <p>最近在线时间</p>
     */
    public void setLastOnlineTime(String LastOnlineTime) {
        this.LastOnlineTime = LastOnlineTime;
    }

    public HostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostInfo(HostInfo source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.DockerFileSystemDriver != null) {
            this.DockerFileSystemDriver = new String(source.DockerFileSystemDriver);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsContainerd != null) {
            this.IsContainerd = new Boolean(source.IsContainerd);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.RegionID != null) {
            this.RegionID = new Long(source.RegionID);
        }
        if (source.Project != null) {
            this.Project = new ProjectInfo(source.Project);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterAccessedStatus != null) {
            this.ClusterAccessedStatus = new String(source.ClusterAccessedStatus);
        }
        if (source.ClusterAccessedSubStatus != null) {
            this.ClusterAccessedSubStatus = new String(source.ClusterAccessedSubStatus);
        }
        if (source.ClusterAccessedErrorReason != null) {
            this.ClusterAccessedErrorReason = new String(source.ClusterAccessedErrorReason);
        }
        if (source.ChargeCoresCnt != null) {
            this.ChargeCoresCnt = new Long(source.ChargeCoresCnt);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
        if (source.LastOnlineTime != null) {
            this.LastOnlineTime = new String(source.LastOnlineTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "DockerFileSystemDriver", this.DockerFileSystemDriver);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsContainerd", this.IsContainerd);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterAccessedStatus", this.ClusterAccessedStatus);
        this.setParamSimple(map, prefix + "ClusterAccessedSubStatus", this.ClusterAccessedSubStatus);
        this.setParamSimple(map, prefix + "ClusterAccessedErrorReason", this.ClusterAccessedErrorReason);
        this.setParamSimple(map, prefix + "ChargeCoresCnt", this.ChargeCoresCnt);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);

    }
}

