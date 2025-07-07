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

public class AssetCluster extends AbstractModel {

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
    * 集群id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 集群名称
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 集群类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 集群创建时间
    */
    @SerializedName("InstanceCreateTime")
    @Expose
    private String InstanceCreateTime;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 集群防护状态，左边枚举,右边为显示
集群防护状态 
0:未接入
1:未防护 
2:部分防护 
3:防护中 
4:接入异常 
5:接入中 
6:卸载中 
7:卸载异常
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * 接入信息，不为空表示有接入异常信息
    */
    @SerializedName("ProtectInfo")
    @Expose
    private String ProtectInfo;

    /**
    * 私有网络id
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
    * kubernetes版本
    */
    @SerializedName("KubernetesVersion")
    @Expose
    private String KubernetesVersion;

    /**
    * 运行时组件
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 运行时组件版本
    */
    @SerializedName("ComponentVersion")
    @Expose
    private String ComponentVersion;

    /**
    * 组件状态
    */
    @SerializedName("ComponentStatus")
    @Expose
    private String ComponentStatus;

    /**
    * 体检时间
    */
    @SerializedName("CheckTime")
    @Expose
    private String CheckTime;

    /**
    * 关联主机数
    */
    @SerializedName("MachineCount")
    @Expose
    private Long MachineCount;

    /**
    * 关联pod数
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * 关联service数
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 漏洞风险
    */
    @SerializedName("VulRisk")
    @Expose
    private Long VulRisk;

    /**
    * 配置风险
    */
    @SerializedName("CFGRisk")
    @Expose
    private Long CFGRisk;

    /**
    * 体检数
    */
    @SerializedName("CheckCount")
    @Expose
    private Long CheckCount;

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
    * 云资产类型：0：腾讯云，1：aws，2：azure
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

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
     * Get 集群id 
     * @return AssetId 集群id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 集群id
     * @param AssetId 集群id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 集群名称 
     * @return AssetName 集群名称
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 集群名称
     * @param AssetName 集群名称
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 集群类型 
     * @return AssetType 集群类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 集群类型
     * @param AssetType 集群类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 集群创建时间 
     * @return InstanceCreateTime 集群创建时间
     */
    public String getInstanceCreateTime() {
        return this.InstanceCreateTime;
    }

    /**
     * Set 集群创建时间
     * @param InstanceCreateTime 集群创建时间
     */
    public void setInstanceCreateTime(String InstanceCreateTime) {
        this.InstanceCreateTime = InstanceCreateTime;
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
     * Get 集群防护状态，左边枚举,右边为显示
集群防护状态 
0:未接入
1:未防护 
2:部分防护 
3:防护中 
4:接入异常 
5:接入中 
6:卸载中 
7:卸载异常 
     * @return ProtectStatus 集群防护状态，左边枚举,右边为显示
集群防护状态 
0:未接入
1:未防护 
2:部分防护 
3:防护中 
4:接入异常 
5:接入中 
6:卸载中 
7:卸载异常
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set 集群防护状态，左边枚举,右边为显示
集群防护状态 
0:未接入
1:未防护 
2:部分防护 
3:防护中 
4:接入异常 
5:接入中 
6:卸载中 
7:卸载异常
     * @param ProtectStatus 集群防护状态，左边枚举,右边为显示
集群防护状态 
0:未接入
1:未防护 
2:部分防护 
3:防护中 
4:接入异常 
5:接入中 
6:卸载中 
7:卸载异常
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get 接入信息，不为空表示有接入异常信息 
     * @return ProtectInfo 接入信息，不为空表示有接入异常信息
     */
    public String getProtectInfo() {
        return this.ProtectInfo;
    }

    /**
     * Set 接入信息，不为空表示有接入异常信息
     * @param ProtectInfo 接入信息，不为空表示有接入异常信息
     */
    public void setProtectInfo(String ProtectInfo) {
        this.ProtectInfo = ProtectInfo;
    }

    /**
     * Get 私有网络id 
     * @return VpcId 私有网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络id
     * @param VpcId 私有网络id
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
     * Get kubernetes版本 
     * @return KubernetesVersion kubernetes版本
     */
    public String getKubernetesVersion() {
        return this.KubernetesVersion;
    }

    /**
     * Set kubernetes版本
     * @param KubernetesVersion kubernetes版本
     */
    public void setKubernetesVersion(String KubernetesVersion) {
        this.KubernetesVersion = KubernetesVersion;
    }

    /**
     * Get 运行时组件 
     * @return Component 运行时组件
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 运行时组件
     * @param Component 运行时组件
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 运行时组件版本 
     * @return ComponentVersion 运行时组件版本
     */
    public String getComponentVersion() {
        return this.ComponentVersion;
    }

    /**
     * Set 运行时组件版本
     * @param ComponentVersion 运行时组件版本
     */
    public void setComponentVersion(String ComponentVersion) {
        this.ComponentVersion = ComponentVersion;
    }

    /**
     * Get 组件状态 
     * @return ComponentStatus 组件状态
     */
    public String getComponentStatus() {
        return this.ComponentStatus;
    }

    /**
     * Set 组件状态
     * @param ComponentStatus 组件状态
     */
    public void setComponentStatus(String ComponentStatus) {
        this.ComponentStatus = ComponentStatus;
    }

    /**
     * Get 体检时间 
     * @return CheckTime 体检时间
     */
    public String getCheckTime() {
        return this.CheckTime;
    }

    /**
     * Set 体检时间
     * @param CheckTime 体检时间
     */
    public void setCheckTime(String CheckTime) {
        this.CheckTime = CheckTime;
    }

    /**
     * Get 关联主机数 
     * @return MachineCount 关联主机数
     */
    public Long getMachineCount() {
        return this.MachineCount;
    }

    /**
     * Set 关联主机数
     * @param MachineCount 关联主机数
     */
    public void setMachineCount(Long MachineCount) {
        this.MachineCount = MachineCount;
    }

    /**
     * Get 关联pod数 
     * @return PodCount 关联pod数
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set 关联pod数
     * @param PodCount 关联pod数
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
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
     * Get 漏洞风险 
     * @return VulRisk 漏洞风险
     */
    public Long getVulRisk() {
        return this.VulRisk;
    }

    /**
     * Set 漏洞风险
     * @param VulRisk 漏洞风险
     */
    public void setVulRisk(Long VulRisk) {
        this.VulRisk = VulRisk;
    }

    /**
     * Get 配置风险 
     * @return CFGRisk 配置风险
     */
    public Long getCFGRisk() {
        return this.CFGRisk;
    }

    /**
     * Set 配置风险
     * @param CFGRisk 配置风险
     */
    public void setCFGRisk(Long CFGRisk) {
        this.CFGRisk = CFGRisk;
    }

    /**
     * Get 体检数 
     * @return CheckCount 体检数
     */
    public Long getCheckCount() {
        return this.CheckCount;
    }

    /**
     * Set 体检数
     * @param CheckCount 体检数
     */
    public void setCheckCount(Long CheckCount) {
        this.CheckCount = CheckCount;
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

    /**
     * Get 云资产类型：0：腾讯云，1：aws，2：azure 
     * @return CloudType 云资产类型：0：腾讯云，1：aws，2：azure
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 云资产类型：0：腾讯云，1：aws，2：azure
     * @param CloudType 云资产类型：0：腾讯云，1：aws，2：azure
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public AssetCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetCluster(AssetCluster source) {
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
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.InstanceCreateTime != null) {
            this.InstanceCreateTime = new String(source.InstanceCreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.ProtectInfo != null) {
            this.ProtectInfo = new String(source.ProtectInfo);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.KubernetesVersion != null) {
            this.KubernetesVersion = new String(source.KubernetesVersion);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.ComponentVersion != null) {
            this.ComponentVersion = new String(source.ComponentVersion);
        }
        if (source.ComponentStatus != null) {
            this.ComponentStatus = new String(source.ComponentStatus);
        }
        if (source.CheckTime != null) {
            this.CheckTime = new String(source.CheckTime);
        }
        if (source.MachineCount != null) {
            this.MachineCount = new Long(source.MachineCount);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.VulRisk != null) {
            this.VulRisk = new Long(source.VulRisk);
        }
        if (source.CFGRisk != null) {
            this.CFGRisk = new Long(source.CFGRisk);
        }
        if (source.CheckCount != null) {
            this.CheckCount = new Long(source.CheckCount);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
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
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "InstanceCreateTime", this.InstanceCreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "ProtectInfo", this.ProtectInfo);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "KubernetesVersion", this.KubernetesVersion);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "ComponentVersion", this.ComponentVersion);
        this.setParamSimple(map, prefix + "ComponentStatus", this.ComponentStatus);
        this.setParamSimple(map, prefix + "CheckTime", this.CheckTime);
        this.setParamSimple(map, prefix + "MachineCount", this.MachineCount);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "VulRisk", this.VulRisk);
        this.setParamSimple(map, prefix + "CFGRisk", this.CFGRisk);
        this.setParamSimple(map, prefix + "CheckCount", this.CheckCount);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

