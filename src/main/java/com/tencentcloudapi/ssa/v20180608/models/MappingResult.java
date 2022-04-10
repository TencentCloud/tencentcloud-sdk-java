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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MappingResult extends AbstractModel{

    /**
    * 资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetIp")
    @Expose
    private String AssetIp;

    /**
    * 内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 服务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 组件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 进程
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Process")
    @Expose
    private String Process;

    /**
    * 操作系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * 测绘时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastMappingTime")
    @Expose
    private String LastMappingTime;

    /**
    * 处置建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisposalRecommendations")
    @Expose
    private String DisposalRecommendations;

    /**
    * 处置建议详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisposalRecommendationDetails")
    @Expose
    private String DisposalRecommendationDetails;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 测绘状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MappingStatus")
    @Expose
    private Long MappingStatus;

    /**
    * 区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 安全防护状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityStatus")
    @Expose
    private SecurityStatus [] SecurityStatus;

    /**
     * Get 资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetIp() {
        return this.AssetIp;
    }

    /**
     * Set 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetIp(String AssetIp) {
        this.AssetIp = AssetIp;
    }

    /**
     * Get 内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 资产id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 服务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 组件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Component 组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Component 组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 进程
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Process 进程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcess() {
        return this.Process;
    }

    /**
     * Set 进程
注意：此字段可能返回 null，表示取不到有效值。
     * @param Process 进程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcess(String Process) {
        this.Process = Process;
    }

    /**
     * Get 操作系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OS 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param OS 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get 测绘时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastMappingTime 测绘时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastMappingTime() {
        return this.LastMappingTime;
    }

    /**
     * Set 测绘时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastMappingTime 测绘时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastMappingTime(String LastMappingTime) {
        this.LastMappingTime = LastMappingTime;
    }

    /**
     * Get 处置建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisposalRecommendations 处置建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisposalRecommendations() {
        return this.DisposalRecommendations;
    }

    /**
     * Set 处置建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisposalRecommendations 处置建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisposalRecommendations(String DisposalRecommendations) {
        this.DisposalRecommendations = DisposalRecommendations;
    }

    /**
     * Get 处置建议详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisposalRecommendationDetails 处置建议详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisposalRecommendationDetails() {
        return this.DisposalRecommendationDetails;
    }

    /**
     * Set 处置建议详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisposalRecommendationDetails 处置建议详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisposalRecommendationDetails(String DisposalRecommendationDetails) {
        this.DisposalRecommendationDetails = DisposalRecommendationDetails;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 测绘状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MappingStatus 测绘状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMappingStatus() {
        return this.MappingStatus;
    }

    /**
     * Set 测绘状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param MappingStatus 测绘状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMappingStatus(Long MappingStatus) {
        this.MappingStatus = MappingStatus;
    }

    /**
     * Get 区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 安全防护状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityStatus 安全防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityStatus [] getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set 安全防护状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityStatus 安全防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityStatus(SecurityStatus [] SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    public MappingResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MappingResult(MappingResult source) {
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetIp != null) {
            this.AssetIp = new String(source.AssetIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Process != null) {
            this.Process = new String(source.Process);
        }
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.LastMappingTime != null) {
            this.LastMappingTime = new String(source.LastMappingTime);
        }
        if (source.DisposalRecommendations != null) {
            this.DisposalRecommendations = new String(source.DisposalRecommendations);
        }
        if (source.DisposalRecommendationDetails != null) {
            this.DisposalRecommendationDetails = new String(source.DisposalRecommendationDetails);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.MappingStatus != null) {
            this.MappingStatus = new Long(source.MappingStatus);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SecurityStatus != null) {
            this.SecurityStatus = new SecurityStatus[source.SecurityStatus.length];
            for (int i = 0; i < source.SecurityStatus.length; i++) {
                this.SecurityStatus[i] = new SecurityStatus(source.SecurityStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetIp", this.AssetIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "LastMappingTime", this.LastMappingTime);
        this.setParamSimple(map, prefix + "DisposalRecommendations", this.DisposalRecommendations);
        this.setParamSimple(map, prefix + "DisposalRecommendationDetails", this.DisposalRecommendationDetails);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "MappingStatus", this.MappingStatus);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "SecurityStatus.", this.SecurityStatus);

    }
}

