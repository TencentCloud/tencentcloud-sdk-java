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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndpointGroupConfigurationSet extends AbstractModel {

    /**
    * <p>全球加速实例ID。</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>监听器实例ID。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>终端节点组ID。</p>
    */
    @SerializedName("EndpointGroupId")
    @Expose
    private String EndpointGroupId;

    /**
    * <p>名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>地域。</p>
    */
    @SerializedName("EndpointGroupRegion")
    @Expose
    private String EndpointGroupRegion;

    /**
    * <p>描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>终端节点信息。</p>
    */
    @SerializedName("EndpointConfigurations")
    @Expose
    private EndpointConfigurations [] EndpointConfigurations;

    /**
    * <p>是否开启健康检查。</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>响应超时时间。</p>
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * <p>健康检查间隔。</p>
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * <p>不健康阈值。</p>
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
    * <p>健康阈值。</p>
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * <p>检查协议。</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>检查端口。</p>
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * <p>检查内容。</p>
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * <p>检查请求。</p>
    */
    @SerializedName("CheckSendContext")
    @Expose
    private String CheckSendContext;

    /**
    * <p>检查返回结果。</p>
    */
    @SerializedName("CheckRecvContext")
    @Expose
    private String CheckRecvContext;

    /**
    * <p>检查域名。</p>
    */
    @SerializedName("CheckDomain")
    @Expose
    private String CheckDomain;

    /**
    * <p>检查URL。</p>
    */
    @SerializedName("CheckPath")
    @Expose
    private String CheckPath;

    /**
    * <p>请求方式。</p>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * <p>状态检测码。</p>
    */
    @SerializedName("StatusMask")
    @Expose
    private String [] StatusMask;

    /**
    * <p>终端节点组类型。</p>
    */
    @SerializedName("EndpointGroupType")
    @Expose
    private String EndpointGroupType;

    /**
    * <p>回源协议。</p>
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * <p>端口映射信息。</p>
    */
    @SerializedName("PortOverrides")
    @Expose
    private PortOverride [] PortOverrides;

    /**
    * <p>自定义终端节点组是否绑定七层转发规则。</p>
    */
    @SerializedName("VirtualExistForwardingRuleFlag")
    @Expose
    private Boolean VirtualExistForwardingRuleFlag;

    /**
    * <p>出终端节点组公网IP。</p>
    */
    @SerializedName("OriginPublicIps")
    @Expose
    private String [] OriginPublicIps;

    /**
    * <p>运营商类型；中国移动(CMCC)，中国联通(CUCC)，中国电信(CTCC)。</p>
    */
    @SerializedName("IspType")
    @Expose
    private String IspType;

    /**
    * <p>HPPTS加密算法套件</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
     * Get <p>全球加速实例ID。</p> 
     * @return GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>全球加速实例ID。</p>
     * @param GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>监听器实例ID。</p> 
     * @return ListenerId <p>监听器实例ID。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器实例ID。</p>
     * @param ListenerId <p>监听器实例ID。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>终端节点组ID。</p> 
     * @return EndpointGroupId <p>终端节点组ID。</p>
     */
    public String getEndpointGroupId() {
        return this.EndpointGroupId;
    }

    /**
     * Set <p>终端节点组ID。</p>
     * @param EndpointGroupId <p>终端节点组ID。</p>
     */
    public void setEndpointGroupId(String EndpointGroupId) {
        this.EndpointGroupId = EndpointGroupId;
    }

    /**
     * Get <p>名称。</p> 
     * @return Name <p>名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称。</p>
     * @param Name <p>名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>地域。</p> 
     * @return EndpointGroupRegion <p>地域。</p>
     */
    public String getEndpointGroupRegion() {
        return this.EndpointGroupRegion;
    }

    /**
     * Set <p>地域。</p>
     * @param EndpointGroupRegion <p>地域。</p>
     */
    public void setEndpointGroupRegion(String EndpointGroupRegion) {
        this.EndpointGroupRegion = EndpointGroupRegion;
    }

    /**
     * Get <p>描述。</p> 
     * @return Description <p>描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述。</p>
     * @param Description <p>描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>终端节点信息。</p> 
     * @return EndpointConfigurations <p>终端节点信息。</p>
     */
    public EndpointConfigurations [] getEndpointConfigurations() {
        return this.EndpointConfigurations;
    }

    /**
     * Set <p>终端节点信息。</p>
     * @param EndpointConfigurations <p>终端节点信息。</p>
     */
    public void setEndpointConfigurations(EndpointConfigurations [] EndpointConfigurations) {
        this.EndpointConfigurations = EndpointConfigurations;
    }

    /**
     * Get <p>是否开启健康检查。</p> 
     * @return EnableHealthCheck <p>是否开启健康检查。</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>是否开启健康检查。</p>
     * @param EnableHealthCheck <p>是否开启健康检查。</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>响应超时时间。</p> 
     * @return ConnectTimeout <p>响应超时时间。</p>
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set <p>响应超时时间。</p>
     * @param ConnectTimeout <p>响应超时时间。</p>
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get <p>健康检查间隔。</p> 
     * @return HealthCheckInterval <p>健康检查间隔。</p>
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set <p>健康检查间隔。</p>
     * @param HealthCheckInterval <p>健康检查间隔。</p>
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get <p>不健康阈值。</p> 
     * @return UnhealthyThreshold <p>不健康阈值。</p>
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set <p>不健康阈值。</p>
     * @param UnhealthyThreshold <p>不健康阈值。</p>
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    /**
     * Get <p>健康阈值。</p> 
     * @return HealthyThreshold <p>健康阈值。</p>
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set <p>健康阈值。</p>
     * @param HealthyThreshold <p>健康阈值。</p>
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get <p>检查协议。</p> 
     * @return CheckType <p>检查协议。</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>检查协议。</p>
     * @param CheckType <p>检查协议。</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>检查端口。</p> 
     * @return CheckPort <p>检查端口。</p>
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set <p>检查端口。</p>
     * @param CheckPort <p>检查端口。</p>
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get <p>检查内容。</p> 
     * @return ContextType <p>检查内容。</p>
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set <p>检查内容。</p>
     * @param ContextType <p>检查内容。</p>
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get <p>检查请求。</p> 
     * @return CheckSendContext <p>检查请求。</p>
     */
    public String getCheckSendContext() {
        return this.CheckSendContext;
    }

    /**
     * Set <p>检查请求。</p>
     * @param CheckSendContext <p>检查请求。</p>
     */
    public void setCheckSendContext(String CheckSendContext) {
        this.CheckSendContext = CheckSendContext;
    }

    /**
     * Get <p>检查返回结果。</p> 
     * @return CheckRecvContext <p>检查返回结果。</p>
     */
    public String getCheckRecvContext() {
        return this.CheckRecvContext;
    }

    /**
     * Set <p>检查返回结果。</p>
     * @param CheckRecvContext <p>检查返回结果。</p>
     */
    public void setCheckRecvContext(String CheckRecvContext) {
        this.CheckRecvContext = CheckRecvContext;
    }

    /**
     * Get <p>检查域名。</p> 
     * @return CheckDomain <p>检查域名。</p>
     */
    public String getCheckDomain() {
        return this.CheckDomain;
    }

    /**
     * Set <p>检查域名。</p>
     * @param CheckDomain <p>检查域名。</p>
     */
    public void setCheckDomain(String CheckDomain) {
        this.CheckDomain = CheckDomain;
    }

    /**
     * Get <p>检查URL。</p> 
     * @return CheckPath <p>检查URL。</p>
     */
    public String getCheckPath() {
        return this.CheckPath;
    }

    /**
     * Set <p>检查URL。</p>
     * @param CheckPath <p>检查URL。</p>
     */
    public void setCheckPath(String CheckPath) {
        this.CheckPath = CheckPath;
    }

    /**
     * Get <p>请求方式。</p> 
     * @return CheckMethod <p>请求方式。</p>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>请求方式。</p>
     * @param CheckMethod <p>请求方式。</p>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get <p>状态检测码。</p> 
     * @return StatusMask <p>状态检测码。</p>
     */
    public String [] getStatusMask() {
        return this.StatusMask;
    }

    /**
     * Set <p>状态检测码。</p>
     * @param StatusMask <p>状态检测码。</p>
     */
    public void setStatusMask(String [] StatusMask) {
        this.StatusMask = StatusMask;
    }

    /**
     * Get <p>终端节点组类型。</p> 
     * @return EndpointGroupType <p>终端节点组类型。</p>
     */
    public String getEndpointGroupType() {
        return this.EndpointGroupType;
    }

    /**
     * Set <p>终端节点组类型。</p>
     * @param EndpointGroupType <p>终端节点组类型。</p>
     */
    public void setEndpointGroupType(String EndpointGroupType) {
        this.EndpointGroupType = EndpointGroupType;
    }

    /**
     * Get <p>回源协议。</p> 
     * @return ForwardProtocol <p>回源协议。</p>
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set <p>回源协议。</p>
     * @param ForwardProtocol <p>回源协议。</p>
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get <p>端口映射信息。</p> 
     * @return PortOverrides <p>端口映射信息。</p>
     */
    public PortOverride [] getPortOverrides() {
        return this.PortOverrides;
    }

    /**
     * Set <p>端口映射信息。</p>
     * @param PortOverrides <p>端口映射信息。</p>
     */
    public void setPortOverrides(PortOverride [] PortOverrides) {
        this.PortOverrides = PortOverrides;
    }

    /**
     * Get <p>自定义终端节点组是否绑定七层转发规则。</p> 
     * @return VirtualExistForwardingRuleFlag <p>自定义终端节点组是否绑定七层转发规则。</p>
     */
    public Boolean getVirtualExistForwardingRuleFlag() {
        return this.VirtualExistForwardingRuleFlag;
    }

    /**
     * Set <p>自定义终端节点组是否绑定七层转发规则。</p>
     * @param VirtualExistForwardingRuleFlag <p>自定义终端节点组是否绑定七层转发规则。</p>
     */
    public void setVirtualExistForwardingRuleFlag(Boolean VirtualExistForwardingRuleFlag) {
        this.VirtualExistForwardingRuleFlag = VirtualExistForwardingRuleFlag;
    }

    /**
     * Get <p>出终端节点组公网IP。</p> 
     * @return OriginPublicIps <p>出终端节点组公网IP。</p>
     */
    public String [] getOriginPublicIps() {
        return this.OriginPublicIps;
    }

    /**
     * Set <p>出终端节点组公网IP。</p>
     * @param OriginPublicIps <p>出终端节点组公网IP。</p>
     */
    public void setOriginPublicIps(String [] OriginPublicIps) {
        this.OriginPublicIps = OriginPublicIps;
    }

    /**
     * Get <p>运营商类型；中国移动(CMCC)，中国联通(CUCC)，中国电信(CTCC)。</p> 
     * @return IspType <p>运营商类型；中国移动(CMCC)，中国联通(CUCC)，中国电信(CTCC)。</p>
     */
    public String getIspType() {
        return this.IspType;
    }

    /**
     * Set <p>运营商类型；中国移动(CMCC)，中国联通(CUCC)，中国电信(CTCC)。</p>
     * @param IspType <p>运营商类型；中国移动(CMCC)，中国联通(CUCC)，中国电信(CTCC)。</p>
     */
    public void setIspType(String IspType) {
        this.IspType = IspType;
    }

    /**
     * Get <p>HPPTS加密算法套件</p> 
     * @return CipherPolicyId <p>HPPTS加密算法套件</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>HPPTS加密算法套件</p>
     * @param CipherPolicyId <p>HPPTS加密算法套件</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    public EndpointGroupConfigurationSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointGroupConfigurationSet(EndpointGroupConfigurationSet source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.EndpointGroupId != null) {
            this.EndpointGroupId = new String(source.EndpointGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EndpointGroupRegion != null) {
            this.EndpointGroupRegion = new String(source.EndpointGroupRegion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EndpointConfigurations != null) {
            this.EndpointConfigurations = new EndpointConfigurations[source.EndpointConfigurations.length];
            for (int i = 0; i < source.EndpointConfigurations.length; i++) {
                this.EndpointConfigurations[i] = new EndpointConfigurations(source.EndpointConfigurations[i]);
            }
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.HealthCheckInterval != null) {
            this.HealthCheckInterval = new Long(source.HealthCheckInterval);
        }
        if (source.UnhealthyThreshold != null) {
            this.UnhealthyThreshold = new Long(source.UnhealthyThreshold);
        }
        if (source.HealthyThreshold != null) {
            this.HealthyThreshold = new Long(source.HealthyThreshold);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.CheckPort != null) {
            this.CheckPort = new Long(source.CheckPort);
        }
        if (source.ContextType != null) {
            this.ContextType = new String(source.ContextType);
        }
        if (source.CheckSendContext != null) {
            this.CheckSendContext = new String(source.CheckSendContext);
        }
        if (source.CheckRecvContext != null) {
            this.CheckRecvContext = new String(source.CheckRecvContext);
        }
        if (source.CheckDomain != null) {
            this.CheckDomain = new String(source.CheckDomain);
        }
        if (source.CheckPath != null) {
            this.CheckPath = new String(source.CheckPath);
        }
        if (source.CheckMethod != null) {
            this.CheckMethod = new String(source.CheckMethod);
        }
        if (source.StatusMask != null) {
            this.StatusMask = new String[source.StatusMask.length];
            for (int i = 0; i < source.StatusMask.length; i++) {
                this.StatusMask[i] = new String(source.StatusMask[i]);
            }
        }
        if (source.EndpointGroupType != null) {
            this.EndpointGroupType = new String(source.EndpointGroupType);
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.PortOverrides != null) {
            this.PortOverrides = new PortOverride[source.PortOverrides.length];
            for (int i = 0; i < source.PortOverrides.length; i++) {
                this.PortOverrides[i] = new PortOverride(source.PortOverrides[i]);
            }
        }
        if (source.VirtualExistForwardingRuleFlag != null) {
            this.VirtualExistForwardingRuleFlag = new Boolean(source.VirtualExistForwardingRuleFlag);
        }
        if (source.OriginPublicIps != null) {
            this.OriginPublicIps = new String[source.OriginPublicIps.length];
            for (int i = 0; i < source.OriginPublicIps.length; i++) {
                this.OriginPublicIps[i] = new String(source.OriginPublicIps[i]);
            }
        }
        if (source.IspType != null) {
            this.IspType = new String(source.IspType);
        }
        if (source.CipherPolicyId != null) {
            this.CipherPolicyId = new String(source.CipherPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "EndpointGroupId", this.EndpointGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EndpointGroupRegion", this.EndpointGroupRegion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "EndpointConfigurations.", this.EndpointConfigurations);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "CheckSendContext", this.CheckSendContext);
        this.setParamSimple(map, prefix + "CheckRecvContext", this.CheckRecvContext);
        this.setParamSimple(map, prefix + "CheckDomain", this.CheckDomain);
        this.setParamSimple(map, prefix + "CheckPath", this.CheckPath);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamArraySimple(map, prefix + "StatusMask.", this.StatusMask);
        this.setParamSimple(map, prefix + "EndpointGroupType", this.EndpointGroupType);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamArrayObj(map, prefix + "PortOverrides.", this.PortOverrides);
        this.setParamSimple(map, prefix + "VirtualExistForwardingRuleFlag", this.VirtualExistForwardingRuleFlag);
        this.setParamArraySimple(map, prefix + "OriginPublicIps.", this.OriginPublicIps);
        this.setParamSimple(map, prefix + "IspType", this.IspType);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);

    }
}

