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
    * <p>云原生API网关ID。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>云原生API网关状态。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>云原生API网关名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>云原生API网关类型。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>实例版本：</p><ul><li>2.4.1</li><li>2.5.1</li></ul>
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

    /**
    * <p>云原生API网关节点信息。</p>
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * <p>云原生API网关vpc配置。</p>
    */
    @SerializedName("VpcConfig")
    @Expose
    private CloudNativeAPIGatewayVpcConfig VpcConfig;

    /**
    * <p>云原生API网关描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>云原生API网关创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例的标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private InstanceTagInfo [] Tags;

    /**
    * <p>是否开启 cls 日志</p>
    */
    @SerializedName("EnableCls")
    @Expose
    private Boolean EnableCls;

    /**
    * <p>付费模式，0表示后付费，1预付费</p>
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * <p>实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】</p>
    */
    @SerializedName("FeatureVersion")
    @Expose
    private String FeatureVersion;

    /**
    * <p>公网出流量带宽，[1,2048]Mbps</p>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * <p>自动续费标记，0表示默认状态(用户未设置，即初始状态)；<br>1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>到期时间，预付费时使用</p>
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * <p>隔离时间，实例隔离时使用</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>是否开启客户端公网。</p>
    */
    @SerializedName("EnableInternet")
    @Expose
    private Boolean EnableInternet;

    /**
    * <p>实例实际的地域信息</p>
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * <p>Ingress class名称</p>
    */
    @SerializedName("IngressClassName")
    @Expose
    private String IngressClassName;

    /**
    * <p>公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。</p>
    */
    @SerializedName("InternetPayMode")
    @Expose
    private String InternetPayMode;

    /**
    * <p>云原生API网关小版本号</p>
    */
    @SerializedName("GatewayMinorVersion")
    @Expose
    private String GatewayMinorVersion;

    /**
    * <p>实例监听的端口信息</p>
    */
    @SerializedName("InstancePort")
    @Expose
    private InstancePort InstancePort;

    /**
    * <p>公网CLB默认类型</p>
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * <p>公网IP地址列表</p>
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * <p>是否开启删除保护</p>
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * <p>表示可以升级的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableVersions")
    @Expose
    private String [] AvailableVersions;

    /**
    * <p>网关可以升级的版本号列表</p>
    */
    @SerializedName("AvailableUpgradeVersions")
    @Expose
    private String [] AvailableUpgradeVersions;

    /**
    * <p>是否提示可升级</p>
    */
    @SerializedName("AvailableUpgrade")
    @Expose
    private Boolean AvailableUpgrade;

    /**
    * <p>可回退的版本</p>
    */
    @SerializedName("AvailableRollbackVersion")
    @Expose
    private String AvailableRollbackVersion;

    /**
    * <p>强制跳转HTTPS开关</p>
    */
    @SerializedName("ForceHTTPSRedirect")
    @Expose
    private Boolean ForceHTTPSRedirect;

    /**
     * Get <p>云原生API网关ID。</p> 
     * @return GatewayId <p>云原生API网关ID。</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>云原生API网关ID。</p>
     * @param GatewayId <p>云原生API网关ID。</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>云原生API网关状态。</p> 
     * @return Status <p>云原生API网关状态。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>云原生API网关状态。</p>
     * @param Status <p>云原生API网关状态。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>云原生API网关名。</p> 
     * @return Name <p>云原生API网关名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>云原生API网关名。</p>
     * @param Name <p>云原生API网关名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>云原生API网关类型。</p> 
     * @return Type <p>云原生API网关类型。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>云原生API网关类型。</p>
     * @param Type <p>云原生API网关类型。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>实例版本：</p><ul><li>2.4.1</li><li>2.5.1</li></ul> 
     * @return GatewayVersion <p>实例版本：</p><ul><li>2.4.1</li><li>2.5.1</li></ul>
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set <p>实例版本：</p><ul><li>2.4.1</li><li>2.5.1</li></ul>
     * @param GatewayVersion <p>实例版本：</p><ul><li>2.4.1</li><li>2.5.1</li></ul>
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    /**
     * Get <p>云原生API网关节点信息。</p> 
     * @return NodeConfig <p>云原生API网关节点信息。</p>
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set <p>云原生API网关节点信息。</p>
     * @param NodeConfig <p>云原生API网关节点信息。</p>
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get <p>云原生API网关vpc配置。</p> 
     * @return VpcConfig <p>云原生API网关vpc配置。</p>
     */
    public CloudNativeAPIGatewayVpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set <p>云原生API网关vpc配置。</p>
     * @param VpcConfig <p>云原生API网关vpc配置。</p>
     */
    public void setVpcConfig(CloudNativeAPIGatewayVpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get <p>云原生API网关描述。</p> 
     * @return Description <p>云原生API网关描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>云原生API网关描述。</p>
     * @param Description <p>云原生API网关描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>云原生API网关创建时间。</p> 
     * @return CreateTime <p>云原生API网关创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>云原生API网关创建时间。</p>
     * @param CreateTime <p>云原生API网关创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例的标签信息</p> 
     * @return Tags <p>实例的标签信息</p>
     */
    public InstanceTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例的标签信息</p>
     * @param Tags <p>实例的标签信息</p>
     */
    public void setTags(InstanceTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否开启 cls 日志</p> 
     * @return EnableCls <p>是否开启 cls 日志</p>
     */
    public Boolean getEnableCls() {
        return this.EnableCls;
    }

    /**
     * Set <p>是否开启 cls 日志</p>
     * @param EnableCls <p>是否开启 cls 日志</p>
     */
    public void setEnableCls(Boolean EnableCls) {
        this.EnableCls = EnableCls;
    }

    /**
     * Get <p>付费模式，0表示后付费，1预付费</p> 
     * @return TradeType <p>付费模式，0表示后付费，1预付费</p>
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set <p>付费模式，0表示后付费，1预付费</p>
     * @param TradeType <p>付费模式，0表示后付费，1预付费</p>
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get <p>实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】</p> 
     * @return FeatureVersion <p>实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】</p>
     */
    public String getFeatureVersion() {
        return this.FeatureVersion;
    }

    /**
     * Set <p>实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】</p>
     * @param FeatureVersion <p>实例版本，当前支持开发版、标准版、专业版【TRIAL、STANDARD、PROFESSIONAL】</p>
     */
    public void setFeatureVersion(String FeatureVersion) {
        this.FeatureVersion = FeatureVersion;
    }

    /**
     * Get <p>公网出流量带宽，[1,2048]Mbps</p> 
     * @return InternetMaxBandwidthOut <p>公网出流量带宽，[1,2048]Mbps</p>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set <p>公网出流量带宽，[1,2048]Mbps</p>
     * @param InternetMaxBandwidthOut <p>公网出流量带宽，[1,2048]Mbps</p>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get <p>自动续费标记，0表示默认状态(用户未设置，即初始状态)；<br>1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0</p> 
     * @return AutoRenewFlag <p>自动续费标记，0表示默认状态(用户未设置，即初始状态)；<br>1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记，0表示默认状态(用户未设置，即初始状态)；<br>1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0</p>
     * @param AutoRenewFlag <p>自动续费标记，0表示默认状态(用户未设置，即初始状态)；<br>1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>到期时间，预付费时使用</p> 
     * @return CurDeadline <p>到期时间，预付费时使用</p>
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set <p>到期时间，预付费时使用</p>
     * @param CurDeadline <p>到期时间，预付费时使用</p>
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get <p>隔离时间，实例隔离时使用</p> 
     * @return IsolateTime <p>隔离时间，实例隔离时使用</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>隔离时间，实例隔离时使用</p>
     * @param IsolateTime <p>隔离时间，实例隔离时使用</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>是否开启客户端公网。</p> 
     * @return EnableInternet <p>是否开启客户端公网。</p>
     */
    public Boolean getEnableInternet() {
        return this.EnableInternet;
    }

    /**
     * Set <p>是否开启客户端公网。</p>
     * @param EnableInternet <p>是否开启客户端公网。</p>
     */
    public void setEnableInternet(Boolean EnableInternet) {
        this.EnableInternet = EnableInternet;
    }

    /**
     * Get <p>实例实际的地域信息</p> 
     * @return EngineRegion <p>实例实际的地域信息</p>
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set <p>实例实际的地域信息</p>
     * @param EngineRegion <p>实例实际的地域信息</p>
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get <p>Ingress class名称</p> 
     * @return IngressClassName <p>Ingress class名称</p>
     */
    public String getIngressClassName() {
        return this.IngressClassName;
    }

    /**
     * Set <p>Ingress class名称</p>
     * @param IngressClassName <p>Ingress class名称</p>
     */
    public void setIngressClassName(String IngressClassName) {
        this.IngressClassName = IngressClassName;
    }

    /**
     * Get <p>公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。</p> 
     * @return InternetPayMode <p>公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。</p>
     */
    public String getInternetPayMode() {
        return this.InternetPayMode;
    }

    /**
     * Set <p>公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。</p>
     * @param InternetPayMode <p>公网计费方式。可选取值 BANDWIDTH | TRAFFIC ，表示按带宽和按流量计费。</p>
     */
    public void setInternetPayMode(String InternetPayMode) {
        this.InternetPayMode = InternetPayMode;
    }

    /**
     * Get <p>云原生API网关小版本号</p> 
     * @return GatewayMinorVersion <p>云原生API网关小版本号</p>
     */
    public String getGatewayMinorVersion() {
        return this.GatewayMinorVersion;
    }

    /**
     * Set <p>云原生API网关小版本号</p>
     * @param GatewayMinorVersion <p>云原生API网关小版本号</p>
     */
    public void setGatewayMinorVersion(String GatewayMinorVersion) {
        this.GatewayMinorVersion = GatewayMinorVersion;
    }

    /**
     * Get <p>实例监听的端口信息</p> 
     * @return InstancePort <p>实例监听的端口信息</p>
     */
    public InstancePort getInstancePort() {
        return this.InstancePort;
    }

    /**
     * Set <p>实例监听的端口信息</p>
     * @param InstancePort <p>实例监听的端口信息</p>
     */
    public void setInstancePort(InstancePort InstancePort) {
        this.InstancePort = InstancePort;
    }

    /**
     * Get <p>公网CLB默认类型</p> 
     * @return LoadBalancerType <p>公网CLB默认类型</p>
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set <p>公网CLB默认类型</p>
     * @param LoadBalancerType <p>公网CLB默认类型</p>
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get <p>公网IP地址列表</p> 
     * @return PublicIpAddresses <p>公网IP地址列表</p>
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set <p>公网IP地址列表</p>
     * @param PublicIpAddresses <p>公网IP地址列表</p>
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get <p>是否开启删除保护</p> 
     * @return DeleteProtect <p>是否开启删除保护</p>
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set <p>是否开启删除保护</p>
     * @param DeleteProtect <p>是否开启删除保护</p>
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get <p>表示可以升级的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableVersions <p>表示可以升级的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAvailableVersions() {
        return this.AvailableVersions;
    }

    /**
     * Set <p>表示可以升级的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableVersions <p>表示可以升级的版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableVersions(String [] AvailableVersions) {
        this.AvailableVersions = AvailableVersions;
    }

    /**
     * Get <p>网关可以升级的版本号列表</p> 
     * @return AvailableUpgradeVersions <p>网关可以升级的版本号列表</p>
     */
    public String [] getAvailableUpgradeVersions() {
        return this.AvailableUpgradeVersions;
    }

    /**
     * Set <p>网关可以升级的版本号列表</p>
     * @param AvailableUpgradeVersions <p>网关可以升级的版本号列表</p>
     */
    public void setAvailableUpgradeVersions(String [] AvailableUpgradeVersions) {
        this.AvailableUpgradeVersions = AvailableUpgradeVersions;
    }

    /**
     * Get <p>是否提示可升级</p> 
     * @return AvailableUpgrade <p>是否提示可升级</p>
     */
    public Boolean getAvailableUpgrade() {
        return this.AvailableUpgrade;
    }

    /**
     * Set <p>是否提示可升级</p>
     * @param AvailableUpgrade <p>是否提示可升级</p>
     */
    public void setAvailableUpgrade(Boolean AvailableUpgrade) {
        this.AvailableUpgrade = AvailableUpgrade;
    }

    /**
     * Get <p>可回退的版本</p> 
     * @return AvailableRollbackVersion <p>可回退的版本</p>
     */
    public String getAvailableRollbackVersion() {
        return this.AvailableRollbackVersion;
    }

    /**
     * Set <p>可回退的版本</p>
     * @param AvailableRollbackVersion <p>可回退的版本</p>
     */
    public void setAvailableRollbackVersion(String AvailableRollbackVersion) {
        this.AvailableRollbackVersion = AvailableRollbackVersion;
    }

    /**
     * Get <p>强制跳转HTTPS开关</p> 
     * @return ForceHTTPSRedirect <p>强制跳转HTTPS开关</p>
     */
    public Boolean getForceHTTPSRedirect() {
        return this.ForceHTTPSRedirect;
    }

    /**
     * Set <p>强制跳转HTTPS开关</p>
     * @param ForceHTTPSRedirect <p>强制跳转HTTPS开关</p>
     */
    public void setForceHTTPSRedirect(Boolean ForceHTTPSRedirect) {
        this.ForceHTTPSRedirect = ForceHTTPSRedirect;
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
        if (source.AvailableUpgradeVersions != null) {
            this.AvailableUpgradeVersions = new String[source.AvailableUpgradeVersions.length];
            for (int i = 0; i < source.AvailableUpgradeVersions.length; i++) {
                this.AvailableUpgradeVersions[i] = new String(source.AvailableUpgradeVersions[i]);
            }
        }
        if (source.AvailableUpgrade != null) {
            this.AvailableUpgrade = new Boolean(source.AvailableUpgrade);
        }
        if (source.AvailableRollbackVersion != null) {
            this.AvailableRollbackVersion = new String(source.AvailableRollbackVersion);
        }
        if (source.ForceHTTPSRedirect != null) {
            this.ForceHTTPSRedirect = new Boolean(source.ForceHTTPSRedirect);
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
        this.setParamArraySimple(map, prefix + "AvailableUpgradeVersions.", this.AvailableUpgradeVersions);
        this.setParamSimple(map, prefix + "AvailableUpgrade", this.AvailableUpgrade);
        this.setParamSimple(map, prefix + "AvailableRollbackVersion", this.AvailableRollbackVersion);
        this.setParamSimple(map, prefix + "ForceHTTPSRedirect", this.ForceHTTPSRedirect);

    }
}

