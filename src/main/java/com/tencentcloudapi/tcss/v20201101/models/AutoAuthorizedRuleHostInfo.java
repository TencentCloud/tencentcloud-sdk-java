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

public class AutoAuthorizedRuleHostInfo extends AbstractModel{

    /**
    * 主机id
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 主机ip即内网ip
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 镜像个数
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * 容器个数
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 外网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 主机实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * docker 版本
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * agent运行状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get 主机ip即内网ip 
     * @return HostIP 主机ip即内网ip
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机ip即内网ip
     * @param HostIP 主机ip即内网ip
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
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
     * Get 镜像个数 
     * @return ImageCnt 镜像个数
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set 镜像个数
     * @param ImageCnt 镜像个数
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get 容器个数 
     * @return ContainerCnt 容器个数
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 容器个数
     * @param ContainerCnt 容器个数
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
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
     * Get 主机实例ID 
     * @return InstanceID 主机实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 主机实例ID
     * @param InstanceID 主机实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器； 
     * @return MachineType 主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；
     * @param MachineType 主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get docker 版本 
     * @return DockerVersion docker 版本
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set docker 版本
     * @param DockerVersion docker 版本
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get agent运行状态 
     * @return Status agent运行状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set agent运行状态
     * @param Status agent运行状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AutoAuthorizedRuleHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoAuthorizedRuleHostInfo(AutoAuthorizedRuleHostInfo source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

