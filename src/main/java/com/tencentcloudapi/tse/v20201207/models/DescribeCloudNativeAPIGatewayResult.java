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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayResult extends AbstractModel {

    /**
    * 云原生API网关ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 云原生API网关状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 云原生API网关名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云原生API网关类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例版本：
- 2.4.1
- 2.5.1
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

    /**
    * 云原生API网关节点信息。
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * 云原生API网关vpc配置。
    */
    @SerializedName("VpcConfig")
    @Expose
    private CloudNativeAPIGatewayVpcConfig VpcConfig;

    /**
    * 云原生API网关描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 云原生API网关创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例的标签信息
    */
    @SerializedName("Tags")
    @Expose
    private InstanceTagInfo [] Tags;

    /**
    * 是否开启 cls 日志
    */
    @SerializedName("EnableCls")
    @Expose
    private Boolean EnableCls;

    /**
    * 付费模式，0表示后付费，1预付费
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * 实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】
    */
    @SerializedName("FeatureVersion")
    @Expose
    private String FeatureVersion;

    /**
    * 公网出流量带宽，[1,2048]Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 自动续费标记，0表示默认状态(用户未设置，即初始状态)；
1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 到期时间，预付费时使用
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * 隔离时间，实例隔离时使用
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 是否开启客户端公网。
    */
    @SerializedName("EnableInternet")
    @Expose
    private Boolean EnableInternet;

    /**
    * 实例实际的地域信息
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * Ingress class名称
    */
    @SerializedName("IngressClassName")
    @Expose
    private String IngressClassName;

    /**
    * 公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。
    */
    @SerializedName("InternetPayMode")
    @Expose
    private String InternetPayMode;

    /**
    * 云原生API网关小版本号
    */
    @SerializedName("GatewayMinorVersion")
    @Expose
    private String GatewayMinorVersion;

    /**
    * 实例监听的端口信息
    */
    @SerializedName("InstancePort")
    @Expose
    private InstancePort InstancePort;

    /**
    * 公网CLB默认类型
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 公网IP地址列表
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 是否开启删除保护
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * 表示可以升级的版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableVersions")
    @Expose
    private String [] AvailableVersions;

    /**
     * Get 云原生API网关ID。 
     * @return GatewayId 云原生API网关ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 云原生API网关ID。
     * @param GatewayId 云原生API网关ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 云原生API网关状态。 
     * @return Status 云原生API网关状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 云原生API网关状态。
     * @param Status 云原生API网关状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 云原生API网关名。 
     * @return Name 云原生API网关名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 云原生API网关名。
     * @param Name 云原生API网关名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云原生API网关类型。 
     * @return Type 云原生API网关类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 云原生API网关类型。
     * @param Type 云原生API网关类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例版本：
- 2.4.1
- 2.5.1 
     * @return GatewayVersion 实例版本：
- 2.4.1
- 2.5.1
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set 实例版本：
- 2.4.1
- 2.5.1
     * @param GatewayVersion 实例版本：
- 2.4.1
- 2.5.1
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    /**
     * Get 云原生API网关节点信息。 
     * @return NodeConfig 云原生API网关节点信息。
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set 云原生API网关节点信息。
     * @param NodeConfig 云原生API网关节点信息。
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get 云原生API网关vpc配置。 
     * @return VpcConfig 云原生API网关vpc配置。
     */
    public CloudNativeAPIGatewayVpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set 云原生API网关vpc配置。
     * @param VpcConfig 云原生API网关vpc配置。
     */
    public void setVpcConfig(CloudNativeAPIGatewayVpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get 云原生API网关描述。 
     * @return Description 云原生API网关描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 云原生API网关描述。
     * @param Description 云原生API网关描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 云原生API网关创建时间。 
     * @return CreateTime 云原生API网关创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 云原生API网关创建时间。
     * @param CreateTime 云原生API网关创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例的标签信息 
     * @return Tags 实例的标签信息
     */
    public InstanceTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例的标签信息
     * @param Tags 实例的标签信息
     */
    public void setTags(InstanceTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启 cls 日志 
     * @return EnableCls 是否开启 cls 日志
     */
    public Boolean getEnableCls() {
        return this.EnableCls;
    }

    /**
     * Set 是否开启 cls 日志
     * @param EnableCls 是否开启 cls 日志
     */
    public void setEnableCls(Boolean EnableCls) {
        this.EnableCls = EnableCls;
    }

    /**
     * Get 付费模式，0表示后付费，1预付费 
     * @return TradeType 付费模式，0表示后付费，1预付费
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set 付费模式，0表示后付费，1预付费
     * @param TradeType 付费模式，0表示后付费，1预付费
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get 实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】 
     * @return FeatureVersion 实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】
     */
    public String getFeatureVersion() {
        return this.FeatureVersion;
    }

    /**
     * Set 实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】
     * @param FeatureVersion 实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】
     */
    public void setFeatureVersion(String FeatureVersion) {
        this.FeatureVersion = FeatureVersion;
    }

    /**
     * Get 公网出流量带宽，[1,2048]Mbps 
     * @return InternetMaxBandwidthOut 公网出流量带宽，[1,2048]Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网出流量带宽，[1,2048]Mbps
     * @param InternetMaxBandwidthOut 公网出流量带宽，[1,2048]Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 自动续费标记，0表示默认状态(用户未设置，即初始状态)；
1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0 
     * @return AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态)；
1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记，0表示默认状态(用户未设置，即初始状态)；
1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
     * @param AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态)；
1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 到期时间，预付费时使用 
     * @return CurDeadline 到期时间，预付费时使用
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set 到期时间，预付费时使用
     * @param CurDeadline 到期时间，预付费时使用
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get 隔离时间，实例隔离时使用 
     * @return IsolateTime 隔离时间，实例隔离时使用
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间，实例隔离时使用
     * @param IsolateTime 隔离时间，实例隔离时使用
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 是否开启客户端公网。 
     * @return EnableInternet 是否开启客户端公网。
     */
    public Boolean getEnableInternet() {
        return this.EnableInternet;
    }

    /**
     * Set 是否开启客户端公网。
     * @param EnableInternet 是否开启客户端公网。
     */
    public void setEnableInternet(Boolean EnableInternet) {
        this.EnableInternet = EnableInternet;
    }

    /**
     * Get 实例实际的地域信息 
     * @return EngineRegion 实例实际的地域信息
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 实例实际的地域信息
     * @param EngineRegion 实例实际的地域信息
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get Ingress class名称 
     * @return IngressClassName Ingress class名称
     */
    public String getIngressClassName() {
        return this.IngressClassName;
    }

    /**
     * Set Ingress class名称
     * @param IngressClassName Ingress class名称
     */
    public void setIngressClassName(String IngressClassName) {
        this.IngressClassName = IngressClassName;
    }

    /**
     * Get 公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。 
     * @return InternetPayMode 公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。
     */
    public String getInternetPayMode() {
        return this.InternetPayMode;
    }

    /**
     * Set 公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。
     * @param InternetPayMode 公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。
     */
    public void setInternetPayMode(String InternetPayMode) {
        this.InternetPayMode = InternetPayMode;
    }

    /**
     * Get 云原生API网关小版本号 
     * @return GatewayMinorVersion 云原生API网关小版本号
     */
    public String getGatewayMinorVersion() {
        return this.GatewayMinorVersion;
    }

    /**
     * Set 云原生API网关小版本号
     * @param GatewayMinorVersion 云原生API网关小版本号
     */
    public void setGatewayMinorVersion(String GatewayMinorVersion) {
        this.GatewayMinorVersion = GatewayMinorVersion;
    }

    /**
     * Get 实例监听的端口信息 
     * @return InstancePort 实例监听的端口信息
     */
    public InstancePort getInstancePort() {
        return this.InstancePort;
    }

    /**
     * Set 实例监听的端口信息
     * @param InstancePort 实例监听的端口信息
     */
    public void setInstancePort(InstancePort InstancePort) {
        this.InstancePort = InstancePort;
    }

    /**
     * Get 公网CLB默认类型 
     * @return LoadBalancerType 公网CLB默认类型
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 公网CLB默认类型
     * @param LoadBalancerType 公网CLB默认类型
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 公网IP地址列表 
     * @return PublicIpAddresses 公网IP地址列表
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 公网IP地址列表
     * @param PublicIpAddresses 公网IP地址列表
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 是否开启删除保护 
     * @return DeleteProtect 是否开启删除保护
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set 是否开启删除保护
     * @param DeleteProtect 是否开启删除保护
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get 表示可以升级的版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableVersions 表示可以升级的版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAvailableVersions() {
        return this.AvailableVersions;
    }

    /**
     * Set 表示可以升级的版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableVersions 表示可以升级的版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableVersions(String [] AvailableVersions) {
        this.AvailableVersions = AvailableVersions;
    }

    public DescribeCloudNativeAPIGatewayResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayResult(DescribeCloudNativeAPIGatewayResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GatewayVersion != null) {
            this.GatewayVersion = new String(source.GatewayVersion);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new CloudNativeAPIGatewayVpcConfig(source.VpcConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new InstanceTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new InstanceTagInfo(source.Tags[i]);
            }
        }
        if (source.EnableCls != null) {
            this.EnableCls = new Boolean(source.EnableCls);
        }
        if (source.TradeType != null) {
            this.TradeType = new Long(source.TradeType);
        }
        if (source.FeatureVersion != null) {
            this.FeatureVersion = new String(source.FeatureVersion);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.EnableInternet != null) {
            this.EnableInternet = new Boolean(source.EnableInternet);
        }
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.IngressClassName != null) {
            this.IngressClassName = new String(source.IngressClassName);
        }
        if (source.InternetPayMode != null) {
            this.InternetPayMode = new String(source.InternetPayMode);
        }
        if (source.GatewayMinorVersion != null) {
            this.GatewayMinorVersion = new String(source.GatewayMinorVersion);
        }
        if (source.InstancePort != null) {
            this.InstancePort = new InstancePort(source.InstancePort);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
        if (source.AvailableVersions != null) {
            this.AvailableVersions = new String[source.AvailableVersions.length];
            for (int i = 0; i < source.AvailableVersions.length; i++) {
                this.AvailableVersions[i] = new String(source.AvailableVersions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GatewayVersion", this.GatewayVersion);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableCls", this.EnableCls);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamSimple(map, prefix + "FeatureVersion", this.FeatureVersion);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "EnableInternet", this.EnableInternet);
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "IngressClassName", this.IngressClassName);
        this.setParamSimple(map, prefix + "InternetPayMode", this.InternetPayMode);
        this.setParamSimple(map, prefix + "GatewayMinorVersion", this.GatewayMinorVersion);
        this.setParamObj(map, prefix + "InstancePort.", this.InstancePort);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);
        this.setParamArraySimple(map, prefix + "AvailableVersions.", this.AvailableVersions);

    }
}

