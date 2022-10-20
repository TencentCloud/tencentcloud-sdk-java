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

public class VulAffectedContainerInfo extends AbstractModel{

    /**
    * 内网IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 容器ID
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
    * Pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * PodIP值
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 外网IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
     * Get 内网IP 
     * @return HostIP 内网IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 内网IP
     * @param HostIP 内网IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 容器ID 
     * @return ContainerID 容器ID
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set 容器ID
     * @param ContainerID 容器ID
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
     * Get Pod名称 
     * @return PodName Pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名称
     * @param PodName Pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get PodIP值 
     * @return PodIP PodIP值
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set PodIP值
     * @param PodIP PodIP值
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
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
     * Get 主机ID 
     * @return HostID 主机ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set 主机ID
     * @param HostID 主机ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get 外网IP 
     * @return PublicIP 外网IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 外网IP
     * @param PublicIP 外网IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    public VulAffectedContainerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedContainerInfo(VulAffectedContainerInfo source) {
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);

    }
}

