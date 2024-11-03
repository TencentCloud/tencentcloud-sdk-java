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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetClusterPod extends AbstractModel {

    /**
    * 租户id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 租户uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 租户昵称
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * pod id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * pod名称
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * pod创建时间
    */
    @SerializedName("InstanceCreateTime")
    @Expose
    private String InstanceCreateTime;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 主机id
    */
    @SerializedName("MachineId")
    @Expose
    private String MachineId;

    /**
    * 主机名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * pod ip
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * 关联service数
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 关联容器数
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * 公网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 是否核心：1:核心，2:非核心
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * 是否新资产 1新
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
     * Get 租户id 
     * @return AppId 租户id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
     * @param AppId 租户id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 租户uin 
     * @return Uin 租户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 租户uin
     * @param Uin 租户uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 租户昵称 
     * @return Nick 租户昵称
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 租户昵称
     * @param Nick 租户昵称
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get pod id 
     * @return AssetId pod id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set pod id
     * @param AssetId pod id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get pod名称 
     * @return AssetName pod名称
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set pod名称
     * @param AssetName pod名称
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get pod创建时间 
     * @return InstanceCreateTime pod创建时间
     */
    public String getInstanceCreateTime() {
        return this.InstanceCreateTime;
    }

    /**
     * Set pod创建时间
     * @param InstanceCreateTime pod创建时间
     */
    public void setInstanceCreateTime(String InstanceCreateTime) {
        this.InstanceCreateTime = InstanceCreateTime;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 主机id 
     * @return MachineId 主机id
     */
    public String getMachineId() {
        return this.MachineId;
    }

    /**
     * Set 主机id
     * @param MachineId 主机id
     */
    public void setMachineId(String MachineId) {
        this.MachineId = MachineId;
    }

    /**
     * Get 主机名 
     * @return MachineName 主机名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名
     * @param MachineName 主机名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get pod ip 
     * @return PodIp pod ip
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set pod ip
     * @param PodIp pod ip
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get 关联service数 
     * @return ServiceCount 关联service数
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 关联service数
     * @param ServiceCount 关联service数
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get 关联容器数 
     * @return ContainerCount 关联容器数
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set 关联容器数
     * @param ContainerCount 关联容器数
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get 公网ip 
     * @return PublicIp 公网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
     * @param PublicIp 公网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网ip 
     * @return PrivateIp 内网ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
     * @param PrivateIp 内网ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 是否核心：1:核心，2:非核心 
     * @return IsCore 是否核心：1:核心，2:非核心
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set 是否核心：1:核心，2:非核心
     * @param IsCore 是否核心：1:核心，2:非核心
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get 是否新资产 1新 
     * @return IsNewAsset 是否新资产 1新
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set 是否新资产 1新
     * @param IsNewAsset 是否新资产 1新
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    public AssetClusterPod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetClusterPod(AssetClusterPod source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.InstanceCreateTime != null) {
            this.InstanceCreateTime = new String(source.InstanceCreateTime);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.MachineId != null) {
            this.MachineId = new String(source.MachineId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "InstanceCreateTime", this.InstanceCreateTime);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "MachineId", this.MachineId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);

    }
}

