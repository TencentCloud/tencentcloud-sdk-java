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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckConnectivityHostInfo extends AbstractModel {

    /**
    * <p>主机id</p>
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * <p>主机ip</p>
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * <p>主机名</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>docker版本</p>
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * <p>docker文件系统类型</p>
    */
    @SerializedName("DockerFileSystemDriver")
    @Expose
    private String DockerFileSystemDriver;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否是容器</p>
    */
    @SerializedName("IsContainerd")
    @Expose
    private Boolean IsContainerd;

    /**
    * <p>主机类型</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>公网ip</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>主机UUID</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主机所在region id</p>
    */
    @SerializedName("HostRegionId")
    @Expose
    private Long HostRegionId;

    /**
    * <p>主机所在地域</p>
    */
    @SerializedName("HostRegion")
    @Expose
    private String HostRegion;

    /**
    * <p>集群所属项目</p>
    */
    @SerializedName("Project")
    @Expose
    private ProjectInfo Project;

    /**
    * <p>集群标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>主机id</p> 
     * @return HostId <p>主机id</p>
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set <p>主机id</p>
     * @param HostId <p>主机id</p>
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get <p>主机ip</p> 
     * @return HostIp <p>主机ip</p>
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set <p>主机ip</p>
     * @param HostIp <p>主机ip</p>
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get <p>主机名</p> 
     * @return HostName <p>主机名</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>主机名</p>
     * @param HostName <p>主机名</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>docker版本</p> 
     * @return DockerVersion <p>docker版本</p>
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set <p>docker版本</p>
     * @param DockerVersion <p>docker版本</p>
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get <p>docker文件系统类型</p> 
     * @return DockerFileSystemDriver <p>docker文件系统类型</p>
     */
    public String getDockerFileSystemDriver() {
        return this.DockerFileSystemDriver;
    }

    /**
     * Set <p>docker文件系统类型</p>
     * @param DockerFileSystemDriver <p>docker文件系统类型</p>
     */
    public void setDockerFileSystemDriver(String DockerFileSystemDriver) {
        this.DockerFileSystemDriver = DockerFileSystemDriver;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否是容器</p> 
     * @return IsContainerd <p>是否是容器</p>
     */
    public Boolean getIsContainerd() {
        return this.IsContainerd;
    }

    /**
     * Set <p>是否是容器</p>
     * @param IsContainerd <p>是否是容器</p>
     */
    public void setIsContainerd(Boolean IsContainerd) {
        this.IsContainerd = IsContainerd;
    }

    /**
     * Get <p>主机类型</p> 
     * @return MachineType <p>主机类型</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>主机类型</p>
     * @param MachineType <p>主机类型</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>公网ip</p> 
     * @return PublicIp <p>公网ip</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网ip</p>
     * @param PublicIp <p>公网ip</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>主机UUID</p> 
     * @return Uuid <p>主机UUID</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机UUID</p>
     * @param Uuid <p>主机UUID</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主机所在region id</p> 
     * @return HostRegionId <p>主机所在region id</p>
     */
    public Long getHostRegionId() {
        return this.HostRegionId;
    }

    /**
     * Set <p>主机所在region id</p>
     * @param HostRegionId <p>主机所在region id</p>
     */
    public void setHostRegionId(Long HostRegionId) {
        this.HostRegionId = HostRegionId;
    }

    /**
     * Get <p>主机所在地域</p> 
     * @return HostRegion <p>主机所在地域</p>
     */
    public String getHostRegion() {
        return this.HostRegion;
    }

    /**
     * Set <p>主机所在地域</p>
     * @param HostRegion <p>主机所在地域</p>
     */
    public void setHostRegion(String HostRegion) {
        this.HostRegion = HostRegion;
    }

    /**
     * Get <p>集群所属项目</p> 
     * @return Project <p>集群所属项目</p>
     */
    public ProjectInfo getProject() {
        return this.Project;
    }

    /**
     * Set <p>集群所属项目</p>
     * @param Project <p>集群所属项目</p>
     */
    public void setProject(ProjectInfo Project) {
        this.Project = Project;
    }

    /**
     * Get <p>集群标签</p> 
     * @return Tags <p>集群标签</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>集群标签</p>
     * @param Tags <p>集群标签</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名</p> 
     * @return ClusterName <p>集群名</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名</p>
     * @param ClusterName <p>集群名</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public CheckConnectivityHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckConnectivityHostInfo(CheckConnectivityHostInfo source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.DockerFileSystemDriver != null) {
            this.DockerFileSystemDriver = new String(source.DockerFileSystemDriver);
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.HostRegionId != null) {
            this.HostRegionId = new Long(source.HostRegionId);
        }
        if (source.HostRegion != null) {
            this.HostRegion = new String(source.HostRegion);
        }
        if (source.Project != null) {
            this.Project = new ProjectInfo(source.Project);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "DockerFileSystemDriver", this.DockerFileSystemDriver);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsContainerd", this.IsContainerd);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "HostRegionId", this.HostRegionId);
        this.setParamSimple(map, prefix + "HostRegion", this.HostRegion);
        this.setParamObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

