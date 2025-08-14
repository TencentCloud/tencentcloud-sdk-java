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
    * 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 容器端口映射
    */
    @SerializedName("ProtocolPorts")
    @Expose
    private ProtocolPort [] ProtocolPorts;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 是否创建 k8s service，默认为 false
    */
    @SerializedName("DisableService")
    @Expose
    private Boolean DisableService;

    /**
    * service 是否为 headless 类型
    */
    @SerializedName("HeadlessService")
    @Expose
    private Boolean HeadlessService;

    /**
    * 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
    */
    @SerializedName("AllowDeleteService")
    @Expose
    private Boolean AllowDeleteService;

    /**
    * 开启SessionAffinity，true为开启，false为不开启，默认为false
    */
    @SerializedName("OpenSessionAffinity")
    @Expose
    private Boolean OpenSessionAffinity;

    /**
    * SessionAffinity会话时间，默认10800
    */
    @SerializedName("SessionAffinityTimeoutSeconds")
    @Expose
    private Long SessionAffinityTimeoutSeconds;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 外部流量策略
    */
    @SerializedName("ExternalTrafficStrategy")
    @Expose
    private String ExternalTrafficStrategy;

    /**
    * 外部流量策略
    */
    @SerializedName("ExternalTrafficPolicy")
    @Expose
    private String ExternalTrafficPolicy;

    /**
    * 负载均衡提供者
    */
    @SerializedName("LoadBalancerProvisioner")
    @Expose
    private String LoadBalancerProvisioner;

    /**
    * 负载均衡类型，Intranet表示内网，Internet表示外网
    */
    @SerializedName("LoadBalancingType")
    @Expose
    private String LoadBalancingType;

    /**
    * k8s负载均衡内网vip
    */
    @SerializedName("ClusterIp")
    @Expose
    private String ClusterIp;

    /**
    * 禁用服务Int记录
    */
    @SerializedName("DisableServiceInt")
    @Expose
    private Long DisableServiceInt;

    /**
    * 开启SessionAffinity Int记录
    */
    @SerializedName("OpenSessionAffinityInt")
    @Expose
    private Long OpenSessionAffinityInt;

    /**
    * 开启HeadlessService int记录
    */
    @SerializedName("HeadlessServiceInt")
    @Expose
    private Long HeadlessServiceInt;

    /**
    * 服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * VPC网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 负载均衡VIP
    */
    @SerializedName("LoadBalancingIp")
    @Expose
    private String LoadBalancingIp;

    /**
    * 负载均衡id
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 已存在的负载均衡id
    */
    @SerializedName("ExistingLoadBalancerId")
    @Expose
    private String ExistingLoadBalancerId;

    /**
     * Get 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问 
     * @return AccessType 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
     * @param AccessType 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 容器端口映射 
     * @return ProtocolPorts 容器端口映射
     */
    public ProtocolPort [] getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * Set 容器端口映射
     * @param ProtocolPorts 容器端口映射
     */
    public void setProtocolPorts(ProtocolPort [] ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 是否创建 k8s service，默认为 false 
     * @return DisableService 是否创建 k8s service，默认为 false
     */
    public Boolean getDisableService() {
        return this.DisableService;
    }

    /**
     * Set 是否创建 k8s service，默认为 false
     * @param DisableService 是否创建 k8s service，默认为 false
     */
    public void setDisableService(Boolean DisableService) {
        this.DisableService = DisableService;
    }

    /**
     * Get service 是否为 headless 类型 
     * @return HeadlessService service 是否为 headless 类型
     */
    public Boolean getHeadlessService() {
        return this.HeadlessService;
    }

    /**
     * Set service 是否为 headless 类型
     * @param HeadlessService service 是否为 headless 类型
     */
    public void setHeadlessService(Boolean HeadlessService) {
        this.HeadlessService = HeadlessService;
    }

    /**
     * Get 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用 
     * @return AllowDeleteService 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
     */
    public Boolean getAllowDeleteService() {
        return this.AllowDeleteService;
    }

    /**
     * Set 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
     * @param AllowDeleteService 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
     */
    public void setAllowDeleteService(Boolean AllowDeleteService) {
        this.AllowDeleteService = AllowDeleteService;
    }

    /**
     * Get 开启SessionAffinity，true为开启，false为不开启，默认为false 
     * @return OpenSessionAffinity 开启SessionAffinity，true为开启，false为不开启，默认为false
     */
    public Boolean getOpenSessionAffinity() {
        return this.OpenSessionAffinity;
    }

    /**
     * Set 开启SessionAffinity，true为开启，false为不开启，默认为false
     * @param OpenSessionAffinity 开启SessionAffinity，true为开启，false为不开启，默认为false
     */
    public void setOpenSessionAffinity(Boolean OpenSessionAffinity) {
        this.OpenSessionAffinity = OpenSessionAffinity;
    }

    /**
     * Get SessionAffinity会话时间，默认10800 
     * @return SessionAffinityTimeoutSeconds SessionAffinity会话时间，默认10800
     */
    public Long getSessionAffinityTimeoutSeconds() {
        return this.SessionAffinityTimeoutSeconds;
    }

    /**
     * Set SessionAffinity会话时间，默认10800
     * @param SessionAffinityTimeoutSeconds SessionAffinity会话时间，默认10800
     */
    public void setSessionAffinityTimeoutSeconds(Long SessionAffinityTimeoutSeconds) {
        this.SessionAffinityTimeoutSeconds = SessionAffinityTimeoutSeconds;
    }

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 外部流量策略 
     * @return ExternalTrafficStrategy 外部流量策略
     */
    public String getExternalTrafficStrategy() {
        return this.ExternalTrafficStrategy;
    }

    /**
     * Set 外部流量策略
     * @param ExternalTrafficStrategy 外部流量策略
     */
    public void setExternalTrafficStrategy(String ExternalTrafficStrategy) {
        this.ExternalTrafficStrategy = ExternalTrafficStrategy;
    }

    /**
     * Get 外部流量策略 
     * @return ExternalTrafficPolicy 外部流量策略
     */
    public String getExternalTrafficPolicy() {
        return this.ExternalTrafficPolicy;
    }

    /**
     * Set 外部流量策略
     * @param ExternalTrafficPolicy 外部流量策略
     */
    public void setExternalTrafficPolicy(String ExternalTrafficPolicy) {
        this.ExternalTrafficPolicy = ExternalTrafficPolicy;
    }

    /**
     * Get 负载均衡提供者 
     * @return LoadBalancerProvisioner 负载均衡提供者
     */
    public String getLoadBalancerProvisioner() {
        return this.LoadBalancerProvisioner;
    }

    /**
     * Set 负载均衡提供者
     * @param LoadBalancerProvisioner 负载均衡提供者
     */
    public void setLoadBalancerProvisioner(String LoadBalancerProvisioner) {
        this.LoadBalancerProvisioner = LoadBalancerProvisioner;
    }

    /**
     * Get 负载均衡类型，Intranet表示内网，Internet表示外网 
     * @return LoadBalancingType 负载均衡类型，Intranet表示内网，Internet表示外网
     */
    public String getLoadBalancingType() {
        return this.LoadBalancingType;
    }

    /**
     * Set 负载均衡类型，Intranet表示内网，Internet表示外网
     * @param LoadBalancingType 负载均衡类型，Intranet表示内网，Internet表示外网
     */
    public void setLoadBalancingType(String LoadBalancingType) {
        this.LoadBalancingType = LoadBalancingType;
    }

    /**
     * Get k8s负载均衡内网vip 
     * @return ClusterIp k8s负载均衡内网vip
     */
    public String getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set k8s负载均衡内网vip
     * @param ClusterIp k8s负载均衡内网vip
     */
    public void setClusterIp(String ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get 禁用服务Int记录 
     * @return DisableServiceInt 禁用服务Int记录
     */
    public Long getDisableServiceInt() {
        return this.DisableServiceInt;
    }

    /**
     * Set 禁用服务Int记录
     * @param DisableServiceInt 禁用服务Int记录
     */
    public void setDisableServiceInt(Long DisableServiceInt) {
        this.DisableServiceInt = DisableServiceInt;
    }

    /**
     * Get 开启SessionAffinity Int记录 
     * @return OpenSessionAffinityInt 开启SessionAffinity Int记录
     */
    public Long getOpenSessionAffinityInt() {
        return this.OpenSessionAffinityInt;
    }

    /**
     * Set 开启SessionAffinity Int记录
     * @param OpenSessionAffinityInt 开启SessionAffinity Int记录
     */
    public void setOpenSessionAffinityInt(Long OpenSessionAffinityInt) {
        this.OpenSessionAffinityInt = OpenSessionAffinityInt;
    }

    /**
     * Get 开启HeadlessService int记录 
     * @return HeadlessServiceInt 开启HeadlessService int记录
     */
    public Long getHeadlessServiceInt() {
        return this.HeadlessServiceInt;
    }

    /**
     * Set 开启HeadlessService int记录
     * @param HeadlessServiceInt 开启HeadlessService int记录
     */
    public void setHeadlessServiceInt(Long HeadlessServiceInt) {
        this.HeadlessServiceInt = HeadlessServiceInt;
    }

    /**
     * Get 服务名称 
     * @return Name 服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名称
     * @param Name 服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get VPC网络ID 
     * @return VpcId VPC网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC网络ID
     * @param VpcId VPC网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 负载均衡VIP 
     * @return LoadBalancingIp 负载均衡VIP
     */
    public String getLoadBalancingIp() {
        return this.LoadBalancingIp;
    }

    /**
     * Set 负载均衡VIP
     * @param LoadBalancingIp 负载均衡VIP
     */
    public void setLoadBalancingIp(String LoadBalancingIp) {
        this.LoadBalancingIp = LoadBalancingIp;
    }

    /**
     * Get 负载均衡id 
     * @return LoadBalancerId 负载均衡id
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡id
     * @param LoadBalancerId 负载均衡id
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 已存在的负载均衡id 
     * @return ExistingLoadBalancerId 已存在的负载均衡id
     */
    public String getExistingLoadBalancerId() {
        return this.ExistingLoadBalancerId;
    }

    /**
     * Set 已存在的负载均衡id
     * @param ExistingLoadBalancerId 已存在的负载均衡id
     */
    public void setExistingLoadBalancerId(String ExistingLoadBalancerId) {
        this.ExistingLoadBalancerId = ExistingLoadBalancerId;
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

    }
}

