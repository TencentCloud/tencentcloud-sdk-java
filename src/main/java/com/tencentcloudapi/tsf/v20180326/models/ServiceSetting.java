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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSetting extends AbstractModel {

    /**
    * <p>0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问</p>
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * <p>容器端口映射</p>
    */
    @SerializedName("ProtocolPorts")
    @Expose
    private ProtocolPort [] ProtocolPorts;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>是否创建 k8s service，默认为 false</p>
    */
    @SerializedName("DisableService")
    @Expose
    private Boolean DisableService;

    /**
    * <p>service 是否为 headless 类型</p>
    */
    @SerializedName("HeadlessService")
    @Expose
    private Boolean HeadlessService;

    /**
    * <p>当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用</p>
    */
    @SerializedName("AllowDeleteService")
    @Expose
    private Boolean AllowDeleteService;

    /**
    * <p>开启SessionAffinity，true为开启，false为不开启，默认为false</p>
    */
    @SerializedName("OpenSessionAffinity")
    @Expose
    private Boolean OpenSessionAffinity;

    /**
    * <p>SessionAffinity会话时间，默认10800</p>
    */
    @SerializedName("SessionAffinityTimeoutSeconds")
    @Expose
    private Long SessionAffinityTimeoutSeconds;

    /**
    * <p>服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>外部流量策略</p>
    */
    @SerializedName("ExternalTrafficStrategy")
    @Expose
    private String ExternalTrafficStrategy;

    /**
    * <p>外部流量策略</p>
    */
    @SerializedName("ExternalTrafficPolicy")
    @Expose
    private String ExternalTrafficPolicy;

    /**
    * <p>负载均衡提供者</p>
    */
    @SerializedName("LoadBalancerProvisioner")
    @Expose
    private String LoadBalancerProvisioner;

    /**
    * <p>负载均衡类型，Intranet表示内网，Internet表示外网</p>
    */
    @SerializedName("LoadBalancingType")
    @Expose
    private String LoadBalancingType;

    /**
    * <p>k8s负载均衡内网vip</p>
    */
    @SerializedName("ClusterIp")
    @Expose
    private String ClusterIp;

    /**
    * <p>禁用服务Int记录</p>
    */
    @SerializedName("DisableServiceInt")
    @Expose
    private Long DisableServiceInt;

    /**
    * <p>开启SessionAffinity Int记录</p>
    */
    @SerializedName("OpenSessionAffinityInt")
    @Expose
    private Long OpenSessionAffinityInt;

    /**
    * <p>开启HeadlessService int记录</p>
    */
    @SerializedName("HeadlessServiceInt")
    @Expose
    private Long HeadlessServiceInt;

    /**
    * <p>服务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>VPC网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>负载均衡VIP</p>
    */
    @SerializedName("LoadBalancingIp")
    @Expose
    private String LoadBalancingIp;

    /**
    * <p>负载均衡id</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>已存在的负载均衡id</p>
    */
    @SerializedName("ExistingLoadBalancerId")
    @Expose
    private String ExistingLoadBalancerId;

    /**
    * <p>是否为全局服务（仅TCS环境使用）</p>
    */
    @SerializedName("EnableGlobalService")
    @Expose
    private Boolean EnableGlobalService;

    /**
     * Get <p>0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问</p> 
     * @return AccessType <p>0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问</p>
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问</p>
     * @param AccessType <p>0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问</p>
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>容器端口映射</p> 
     * @return ProtocolPorts <p>容器端口映射</p>
     */
    public ProtocolPort [] getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * Set <p>容器端口映射</p>
     * @param ProtocolPorts <p>容器端口映射</p>
     */
    public void setProtocolPorts(ProtocolPort [] ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>是否创建 k8s service，默认为 false</p> 
     * @return DisableService <p>是否创建 k8s service，默认为 false</p>
     */
    public Boolean getDisableService() {
        return this.DisableService;
    }

    /**
     * Set <p>是否创建 k8s service，默认为 false</p>
     * @param DisableService <p>是否创建 k8s service，默认为 false</p>
     */
    public void setDisableService(Boolean DisableService) {
        this.DisableService = DisableService;
    }

    /**
     * Get <p>service 是否为 headless 类型</p> 
     * @return HeadlessService <p>service 是否为 headless 类型</p>
     */
    public Boolean getHeadlessService() {
        return this.HeadlessService;
    }

    /**
     * Set <p>service 是否为 headless 类型</p>
     * @param HeadlessService <p>service 是否为 headless 类型</p>
     */
    public void setHeadlessService(Boolean HeadlessService) {
        this.HeadlessService = HeadlessService;
    }

    /**
     * Get <p>当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用</p> 
     * @return AllowDeleteService <p>当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用</p>
     */
    public Boolean getAllowDeleteService() {
        return this.AllowDeleteService;
    }

    /**
     * Set <p>当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用</p>
     * @param AllowDeleteService <p>当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用</p>
     */
    public void setAllowDeleteService(Boolean AllowDeleteService) {
        this.AllowDeleteService = AllowDeleteService;
    }

    /**
     * Get <p>开启SessionAffinity，true为开启，false为不开启，默认为false</p> 
     * @return OpenSessionAffinity <p>开启SessionAffinity，true为开启，false为不开启，默认为false</p>
     */
    public Boolean getOpenSessionAffinity() {
        return this.OpenSessionAffinity;
    }

    /**
     * Set <p>开启SessionAffinity，true为开启，false为不开启，默认为false</p>
     * @param OpenSessionAffinity <p>开启SessionAffinity，true为开启，false为不开启，默认为false</p>
     */
    public void setOpenSessionAffinity(Boolean OpenSessionAffinity) {
        this.OpenSessionAffinity = OpenSessionAffinity;
    }

    /**
     * Get <p>SessionAffinity会话时间，默认10800</p> 
     * @return SessionAffinityTimeoutSeconds <p>SessionAffinity会话时间，默认10800</p>
     */
    public Long getSessionAffinityTimeoutSeconds() {
        return this.SessionAffinityTimeoutSeconds;
    }

    /**
     * Set <p>SessionAffinity会话时间，默认10800</p>
     * @param SessionAffinityTimeoutSeconds <p>SessionAffinity会话时间，默认10800</p>
     */
    public void setSessionAffinityTimeoutSeconds(Long SessionAffinityTimeoutSeconds) {
        this.SessionAffinityTimeoutSeconds = SessionAffinityTimeoutSeconds;
    }

    /**
     * Get <p>服务名称</p> 
     * @return ServiceName <p>服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名称</p>
     * @param ServiceName <p>服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>外部流量策略</p> 
     * @return ExternalTrafficStrategy <p>外部流量策略</p>
     */
    public String getExternalTrafficStrategy() {
        return this.ExternalTrafficStrategy;
    }

    /**
     * Set <p>外部流量策略</p>
     * @param ExternalTrafficStrategy <p>外部流量策略</p>
     */
    public void setExternalTrafficStrategy(String ExternalTrafficStrategy) {
        this.ExternalTrafficStrategy = ExternalTrafficStrategy;
    }

    /**
     * Get <p>外部流量策略</p> 
     * @return ExternalTrafficPolicy <p>外部流量策略</p>
     */
    public String getExternalTrafficPolicy() {
        return this.ExternalTrafficPolicy;
    }

    /**
     * Set <p>外部流量策略</p>
     * @param ExternalTrafficPolicy <p>外部流量策略</p>
     */
    public void setExternalTrafficPolicy(String ExternalTrafficPolicy) {
        this.ExternalTrafficPolicy = ExternalTrafficPolicy;
    }

    /**
     * Get <p>负载均衡提供者</p> 
     * @return LoadBalancerProvisioner <p>负载均衡提供者</p>
     */
    public String getLoadBalancerProvisioner() {
        return this.LoadBalancerProvisioner;
    }

    /**
     * Set <p>负载均衡提供者</p>
     * @param LoadBalancerProvisioner <p>负载均衡提供者</p>
     */
    public void setLoadBalancerProvisioner(String LoadBalancerProvisioner) {
        this.LoadBalancerProvisioner = LoadBalancerProvisioner;
    }

    /**
     * Get <p>负载均衡类型，Intranet表示内网，Internet表示外网</p> 
     * @return LoadBalancingType <p>负载均衡类型，Intranet表示内网，Internet表示外网</p>
     */
    public String getLoadBalancingType() {
        return this.LoadBalancingType;
    }

    /**
     * Set <p>负载均衡类型，Intranet表示内网，Internet表示外网</p>
     * @param LoadBalancingType <p>负载均衡类型，Intranet表示内网，Internet表示外网</p>
     */
    public void setLoadBalancingType(String LoadBalancingType) {
        this.LoadBalancingType = LoadBalancingType;
    }

    /**
     * Get <p>k8s负载均衡内网vip</p> 
     * @return ClusterIp <p>k8s负载均衡内网vip</p>
     */
    public String getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set <p>k8s负载均衡内网vip</p>
     * @param ClusterIp <p>k8s负载均衡内网vip</p>
     */
    public void setClusterIp(String ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get <p>禁用服务Int记录</p> 
     * @return DisableServiceInt <p>禁用服务Int记录</p>
     */
    public Long getDisableServiceInt() {
        return this.DisableServiceInt;
    }

    /**
     * Set <p>禁用服务Int记录</p>
     * @param DisableServiceInt <p>禁用服务Int记录</p>
     */
    public void setDisableServiceInt(Long DisableServiceInt) {
        this.DisableServiceInt = DisableServiceInt;
    }

    /**
     * Get <p>开启SessionAffinity Int记录</p> 
     * @return OpenSessionAffinityInt <p>开启SessionAffinity Int记录</p>
     */
    public Long getOpenSessionAffinityInt() {
        return this.OpenSessionAffinityInt;
    }

    /**
     * Set <p>开启SessionAffinity Int记录</p>
     * @param OpenSessionAffinityInt <p>开启SessionAffinity Int记录</p>
     */
    public void setOpenSessionAffinityInt(Long OpenSessionAffinityInt) {
        this.OpenSessionAffinityInt = OpenSessionAffinityInt;
    }

    /**
     * Get <p>开启HeadlessService int记录</p> 
     * @return HeadlessServiceInt <p>开启HeadlessService int记录</p>
     */
    public Long getHeadlessServiceInt() {
        return this.HeadlessServiceInt;
    }

    /**
     * Set <p>开启HeadlessService int记录</p>
     * @param HeadlessServiceInt <p>开启HeadlessService int记录</p>
     */
    public void setHeadlessServiceInt(Long HeadlessServiceInt) {
        this.HeadlessServiceInt = HeadlessServiceInt;
    }

    /**
     * Get <p>服务名称</p> 
     * @return Name <p>服务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名称</p>
     * @param Name <p>服务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>VPC网络ID</p> 
     * @return VpcId <p>VPC网络ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC网络ID</p>
     * @param VpcId <p>VPC网络ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>负载均衡VIP</p> 
     * @return LoadBalancingIp <p>负载均衡VIP</p>
     */
    public String getLoadBalancingIp() {
        return this.LoadBalancingIp;
    }

    /**
     * Set <p>负载均衡VIP</p>
     * @param LoadBalancingIp <p>负载均衡VIP</p>
     */
    public void setLoadBalancingIp(String LoadBalancingIp) {
        this.LoadBalancingIp = LoadBalancingIp;
    }

    /**
     * Get <p>负载均衡id</p> 
     * @return LoadBalancerId <p>负载均衡id</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡id</p>
     * @param LoadBalancerId <p>负载均衡id</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>已存在的负载均衡id</p> 
     * @return ExistingLoadBalancerId <p>已存在的负载均衡id</p>
     */
    public String getExistingLoadBalancerId() {
        return this.ExistingLoadBalancerId;
    }

    /**
     * Set <p>已存在的负载均衡id</p>
     * @param ExistingLoadBalancerId <p>已存在的负载均衡id</p>
     */
    public void setExistingLoadBalancerId(String ExistingLoadBalancerId) {
        this.ExistingLoadBalancerId = ExistingLoadBalancerId;
    }

    /**
     * Get <p>是否为全局服务（仅TCS环境使用）</p> 
     * @return EnableGlobalService <p>是否为全局服务（仅TCS环境使用）</p>
     */
    public Boolean getEnableGlobalService() {
        return this.EnableGlobalService;
    }

    /**
     * Set <p>是否为全局服务（仅TCS环境使用）</p>
     * @param EnableGlobalService <p>是否为全局服务（仅TCS环境使用）</p>
     */
    public void setEnableGlobalService(Boolean EnableGlobalService) {
        this.EnableGlobalService = EnableGlobalService;
    }

    public ServiceSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceSetting(ServiceSetting source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.ProtocolPorts != null) {
            this.ProtocolPorts = new ProtocolPort[source.ProtocolPorts.length];
            for (int i = 0; i < source.ProtocolPorts.length; i++) {
                this.ProtocolPorts[i] = new ProtocolPort(source.ProtocolPorts[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DisableService != null) {
            this.DisableService = new Boolean(source.DisableService);
        }
        if (source.HeadlessService != null) {
            this.HeadlessService = new Boolean(source.HeadlessService);
        }
        if (source.AllowDeleteService != null) {
            this.AllowDeleteService = new Boolean(source.AllowDeleteService);
        }
        if (source.OpenSessionAffinity != null) {
            this.OpenSessionAffinity = new Boolean(source.OpenSessionAffinity);
        }
        if (source.SessionAffinityTimeoutSeconds != null) {
            this.SessionAffinityTimeoutSeconds = new Long(source.SessionAffinityTimeoutSeconds);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ExternalTrafficStrategy != null) {
            this.ExternalTrafficStrategy = new String(source.ExternalTrafficStrategy);
        }
        if (source.ExternalTrafficPolicy != null) {
            this.ExternalTrafficPolicy = new String(source.ExternalTrafficPolicy);
        }
        if (source.LoadBalancerProvisioner != null) {
            this.LoadBalancerProvisioner = new String(source.LoadBalancerProvisioner);
        }
        if (source.LoadBalancingType != null) {
            this.LoadBalancingType = new String(source.LoadBalancingType);
        }
        if (source.ClusterIp != null) {
            this.ClusterIp = new String(source.ClusterIp);
        }
        if (source.DisableServiceInt != null) {
            this.DisableServiceInt = new Long(source.DisableServiceInt);
        }
        if (source.OpenSessionAffinityInt != null) {
            this.OpenSessionAffinityInt = new Long(source.OpenSessionAffinityInt);
        }
        if (source.HeadlessServiceInt != null) {
            this.HeadlessServiceInt = new Long(source.HeadlessServiceInt);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.LoadBalancingIp != null) {
            this.LoadBalancingIp = new String(source.LoadBalancingIp);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ExistingLoadBalancerId != null) {
            this.ExistingLoadBalancerId = new String(source.ExistingLoadBalancerId);
        }
        if (source.EnableGlobalService != null) {
            this.EnableGlobalService = new Boolean(source.EnableGlobalService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "ProtocolPorts.", this.ProtocolPorts);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DisableService", this.DisableService);
        this.setParamSimple(map, prefix + "HeadlessService", this.HeadlessService);
        this.setParamSimple(map, prefix + "AllowDeleteService", this.AllowDeleteService);
        this.setParamSimple(map, prefix + "OpenSessionAffinity", this.OpenSessionAffinity);
        this.setParamSimple(map, prefix + "SessionAffinityTimeoutSeconds", this.SessionAffinityTimeoutSeconds);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ExternalTrafficStrategy", this.ExternalTrafficStrategy);
        this.setParamSimple(map, prefix + "ExternalTrafficPolicy", this.ExternalTrafficPolicy);
        this.setParamSimple(map, prefix + "LoadBalancerProvisioner", this.LoadBalancerProvisioner);
        this.setParamSimple(map, prefix + "LoadBalancingType", this.LoadBalancingType);
        this.setParamSimple(map, prefix + "ClusterIp", this.ClusterIp);
        this.setParamSimple(map, prefix + "DisableServiceInt", this.DisableServiceInt);
        this.setParamSimple(map, prefix + "OpenSessionAffinityInt", this.OpenSessionAffinityInt);
        this.setParamSimple(map, prefix + "HeadlessServiceInt", this.HeadlessServiceInt);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "LoadBalancingIp", this.LoadBalancingIp);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ExistingLoadBalancerId", this.ExistingLoadBalancerId);
        this.setParamSimple(map, prefix + "EnableGlobalService", this.EnableGlobalService);

    }
}

