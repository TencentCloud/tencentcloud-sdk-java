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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpnConnection extends AbstractModel {

    /**
    * <p>通道实例ID。</p>
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * <p>通道名称。</p>
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;

    /**
    * <p>VPC实例ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>VPN网关实例ID。</p>
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * <p>对端网关实例ID。</p>
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * <p>预共享密钥。</p>
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;

    /**
    * <p>通道传输协议。</p>
    */
    @SerializedName("VpnProto")
    @Expose
    private String VpnProto;

    /**
    * <p>通道加密协议。</p>
    */
    @SerializedName("EncryptProto")
    @Expose
    private String EncryptProto;

    /**
    * <p>路由类型。</p>
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>通道连接状态，AVAILABLE：已连接。</p>
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * <p>SPD。</p>
    */
    @SerializedName("SecurityPolicyDatabaseSet")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabaseSet;

    /**
    * <p>IKE选项。</p>
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;

    /**
    * <p>IPSEC选择。</p>
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;

    /**
    * <p>是否支持健康状态探测</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>本端探测ip</p>
    */
    @SerializedName("HealthCheckLocalIp")
    @Expose
    private String HealthCheckLocalIp;

    /**
    * <p>对端探测ip</p>
    */
    @SerializedName("HealthCheckRemoteIp")
    @Expose
    private String HealthCheckRemoteIp;

    /**
    * <p>通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象</p>
    */
    @SerializedName("HealthCheckStatus")
    @Expose
    private String HealthCheckStatus;

    /**
    * <p>DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）</p>
    */
    @SerializedName("DpdEnable")
    @Expose
    private Long DpdEnable;

    /**
    * <p>DPD超时时间。即探测确认对端不存在需要的时间。</p>
    */
    @SerializedName("DpdTimeout")
    @Expose
    private String DpdTimeout;

    /**
    * <p>DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）</p>
    */
    @SerializedName("DpdAction")
    @Expose
    private String DpdAction;

    /**
    * <p>标签键值对数组</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>协商类型</p><p>枚举值：</p><ul><li>active： 主动协商</li><li>passive： 被动协商</li><li>flowTrigger： 流量协商</li></ul>
    */
    @SerializedName("NegotiationType")
    @Expose
    private String NegotiationType;

    /**
    * <p>Bgp配置信息</p>
    */
    @SerializedName("BgpConfig")
    @Expose
    private BgpConfigAndAsn BgpConfig;

    /**
    * <p>Nqa配置信息</p>
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfig HealthCheckConfig;

    /**
     * Get <p>通道实例ID。</p> 
     * @return VpnConnectionId <p>通道实例ID。</p>
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * Set <p>通道实例ID。</p>
     * @param VpnConnectionId <p>通道实例ID。</p>
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * Get <p>通道名称。</p> 
     * @return VpnConnectionName <p>通道名称。</p>
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * Set <p>通道名称。</p>
     * @param VpnConnectionName <p>通道名称。</p>
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
    }

    /**
     * Get <p>VPC实例ID。</p> 
     * @return VpcId <p>VPC实例ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC实例ID。</p>
     * @param VpcId <p>VPC实例ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>VPN网关实例ID。</p> 
     * @return VpnGatewayId <p>VPN网关实例ID。</p>
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set <p>VPN网关实例ID。</p>
     * @param VpnGatewayId <p>VPN网关实例ID。</p>
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get <p>对端网关实例ID。</p> 
     * @return CustomerGatewayId <p>对端网关实例ID。</p>
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set <p>对端网关实例ID。</p>
     * @param CustomerGatewayId <p>对端网关实例ID。</p>
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * Get <p>预共享密钥。</p> 
     * @return PreShareKey <p>预共享密钥。</p>
     */
    public String getPreShareKey() {
        return this.PreShareKey;
    }

    /**
     * Set <p>预共享密钥。</p>
     * @param PreShareKey <p>预共享密钥。</p>
     */
    public void setPreShareKey(String PreShareKey) {
        this.PreShareKey = PreShareKey;
    }

    /**
     * Get <p>通道传输协议。</p> 
     * @return VpnProto <p>通道传输协议。</p>
     */
    public String getVpnProto() {
        return this.VpnProto;
    }

    /**
     * Set <p>通道传输协议。</p>
     * @param VpnProto <p>通道传输协议。</p>
     */
    public void setVpnProto(String VpnProto) {
        this.VpnProto = VpnProto;
    }

    /**
     * Get <p>通道加密协议。</p> 
     * @return EncryptProto <p>通道加密协议。</p>
     */
    public String getEncryptProto() {
        return this.EncryptProto;
    }

    /**
     * Set <p>通道加密协议。</p>
     * @param EncryptProto <p>通道加密协议。</p>
     */
    public void setEncryptProto(String EncryptProto) {
        this.EncryptProto = EncryptProto;
    }

    /**
     * Get <p>路由类型。</p> 
     * @return RouteType <p>路由类型。</p>
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set <p>路由类型。</p>
     * @param RouteType <p>路由类型。</p>
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedTime <p>创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedTime <p>创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。</p> 
     * @return State <p>通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。</p>
     * @param State <p>通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>通道连接状态，AVAILABLE：已连接。</p> 
     * @return NetStatus <p>通道连接状态，AVAILABLE：已连接。</p>
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set <p>通道连接状态，AVAILABLE：已连接。</p>
     * @param NetStatus <p>通道连接状态，AVAILABLE：已连接。</p>
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * Get <p>SPD。</p> 
     * @return SecurityPolicyDatabaseSet <p>SPD。</p>
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabaseSet() {
        return this.SecurityPolicyDatabaseSet;
    }

    /**
     * Set <p>SPD。</p>
     * @param SecurityPolicyDatabaseSet <p>SPD。</p>
     */
    public void setSecurityPolicyDatabaseSet(SecurityPolicyDatabase [] SecurityPolicyDatabaseSet) {
        this.SecurityPolicyDatabaseSet = SecurityPolicyDatabaseSet;
    }

    /**
     * Get <p>IKE选项。</p> 
     * @return IKEOptionsSpecification <p>IKE选项。</p>
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * Set <p>IKE选项。</p>
     * @param IKEOptionsSpecification <p>IKE选项。</p>
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * Get <p>IPSEC选择。</p> 
     * @return IPSECOptionsSpecification <p>IPSEC选择。</p>
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * Set <p>IPSEC选择。</p>
     * @param IPSECOptionsSpecification <p>IPSEC选择。</p>
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * Get <p>是否支持健康状态探测</p> 
     * @return EnableHealthCheck <p>是否支持健康状态探测</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>是否支持健康状态探测</p>
     * @param EnableHealthCheck <p>是否支持健康状态探测</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>本端探测ip</p> 
     * @return HealthCheckLocalIp <p>本端探测ip</p>
     */
    public String getHealthCheckLocalIp() {
        return this.HealthCheckLocalIp;
    }

    /**
     * Set <p>本端探测ip</p>
     * @param HealthCheckLocalIp <p>本端探测ip</p>
     */
    public void setHealthCheckLocalIp(String HealthCheckLocalIp) {
        this.HealthCheckLocalIp = HealthCheckLocalIp;
    }

    /**
     * Get <p>对端探测ip</p> 
     * @return HealthCheckRemoteIp <p>对端探测ip</p>
     */
    public String getHealthCheckRemoteIp() {
        return this.HealthCheckRemoteIp;
    }

    /**
     * Set <p>对端探测ip</p>
     * @param HealthCheckRemoteIp <p>对端探测ip</p>
     */
    public void setHealthCheckRemoteIp(String HealthCheckRemoteIp) {
        this.HealthCheckRemoteIp = HealthCheckRemoteIp;
    }

    /**
     * Get <p>通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象</p> 
     * @return HealthCheckStatus <p>通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象</p>
     */
    public String getHealthCheckStatus() {
        return this.HealthCheckStatus;
    }

    /**
     * Set <p>通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象</p>
     * @param HealthCheckStatus <p>通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象</p>
     */
    public void setHealthCheckStatus(String HealthCheckStatus) {
        this.HealthCheckStatus = HealthCheckStatus;
    }

    /**
     * Get <p>DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）</p> 
     * @return DpdEnable <p>DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）</p>
     */
    public Long getDpdEnable() {
        return this.DpdEnable;
    }

    /**
     * Set <p>DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）</p>
     * @param DpdEnable <p>DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）</p>
     */
    public void setDpdEnable(Long DpdEnable) {
        this.DpdEnable = DpdEnable;
    }

    /**
     * Get <p>DPD超时时间。即探测确认对端不存在需要的时间。</p> 
     * @return DpdTimeout <p>DPD超时时间。即探测确认对端不存在需要的时间。</p>
     */
    public String getDpdTimeout() {
        return this.DpdTimeout;
    }

    /**
     * Set <p>DPD超时时间。即探测确认对端不存在需要的时间。</p>
     * @param DpdTimeout <p>DPD超时时间。即探测确认对端不存在需要的时间。</p>
     */
    public void setDpdTimeout(String DpdTimeout) {
        this.DpdTimeout = DpdTimeout;
    }

    /**
     * Get <p>DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）</p> 
     * @return DpdAction <p>DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）</p>
     */
    public String getDpdAction() {
        return this.DpdAction;
    }

    /**
     * Set <p>DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）</p>
     * @param DpdAction <p>DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）</p>
     */
    public void setDpdAction(String DpdAction) {
        this.DpdAction = DpdAction;
    }

    /**
     * Get <p>标签键值对数组</p> 
     * @return TagSet <p>标签键值对数组</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对数组</p>
     * @param TagSet <p>标签键值对数组</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>协商类型</p><p>枚举值：</p><ul><li>active： 主动协商</li><li>passive： 被动协商</li><li>flowTrigger： 流量协商</li></ul> 
     * @return NegotiationType <p>协商类型</p><p>枚举值：</p><ul><li>active： 主动协商</li><li>passive： 被动协商</li><li>flowTrigger： 流量协商</li></ul>
     */
    public String getNegotiationType() {
        return this.NegotiationType;
    }

    /**
     * Set <p>协商类型</p><p>枚举值：</p><ul><li>active： 主动协商</li><li>passive： 被动协商</li><li>flowTrigger： 流量协商</li></ul>
     * @param NegotiationType <p>协商类型</p><p>枚举值：</p><ul><li>active： 主动协商</li><li>passive： 被动协商</li><li>flowTrigger： 流量协商</li></ul>
     */
    public void setNegotiationType(String NegotiationType) {
        this.NegotiationType = NegotiationType;
    }

    /**
     * Get <p>Bgp配置信息</p> 
     * @return BgpConfig <p>Bgp配置信息</p>
     */
    public BgpConfigAndAsn getBgpConfig() {
        return this.BgpConfig;
    }

    /**
     * Set <p>Bgp配置信息</p>
     * @param BgpConfig <p>Bgp配置信息</p>
     */
    public void setBgpConfig(BgpConfigAndAsn BgpConfig) {
        this.BgpConfig = BgpConfig;
    }

    /**
     * Get <p>Nqa配置信息</p> 
     * @return HealthCheckConfig <p>Nqa配置信息</p>
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set <p>Nqa配置信息</p>
     * @param HealthCheckConfig <p>Nqa配置信息</p>
     */
    public void setHealthCheckConfig(HealthCheckConfig HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    public VpnConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpnConnection(VpnConnection source) {
        if (source.VpnConnectionId != null) {
            this.VpnConnectionId = new String(source.VpnConnectionId);
        }
        if (source.VpnConnectionName != null) {
            this.VpnConnectionName = new String(source.VpnConnectionName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.CustomerGatewayId != null) {
            this.CustomerGatewayId = new String(source.CustomerGatewayId);
        }
        if (source.PreShareKey != null) {
            this.PreShareKey = new String(source.PreShareKey);
        }
        if (source.VpnProto != null) {
            this.VpnProto = new String(source.VpnProto);
        }
        if (source.EncryptProto != null) {
            this.EncryptProto = new String(source.EncryptProto);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.NetStatus != null) {
            this.NetStatus = new String(source.NetStatus);
        }
        if (source.SecurityPolicyDatabaseSet != null) {
            this.SecurityPolicyDatabaseSet = new SecurityPolicyDatabase[source.SecurityPolicyDatabaseSet.length];
            for (int i = 0; i < source.SecurityPolicyDatabaseSet.length; i++) {
                this.SecurityPolicyDatabaseSet[i] = new SecurityPolicyDatabase(source.SecurityPolicyDatabaseSet[i]);
            }
        }
        if (source.IKEOptionsSpecification != null) {
            this.IKEOptionsSpecification = new IKEOptionsSpecification(source.IKEOptionsSpecification);
        }
        if (source.IPSECOptionsSpecification != null) {
            this.IPSECOptionsSpecification = new IPSECOptionsSpecification(source.IPSECOptionsSpecification);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.HealthCheckLocalIp != null) {
            this.HealthCheckLocalIp = new String(source.HealthCheckLocalIp);
        }
        if (source.HealthCheckRemoteIp != null) {
            this.HealthCheckRemoteIp = new String(source.HealthCheckRemoteIp);
        }
        if (source.HealthCheckStatus != null) {
            this.HealthCheckStatus = new String(source.HealthCheckStatus);
        }
        if (source.DpdEnable != null) {
            this.DpdEnable = new Long(source.DpdEnable);
        }
        if (source.DpdTimeout != null) {
            this.DpdTimeout = new String(source.DpdTimeout);
        }
        if (source.DpdAction != null) {
            this.DpdAction = new String(source.DpdAction);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.NegotiationType != null) {
            this.NegotiationType = new String(source.NegotiationType);
        }
        if (source.BgpConfig != null) {
            this.BgpConfig = new BgpConfigAndAsn(source.BgpConfig);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfig(source.HealthCheckConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamSimple(map, prefix + "VpnProto", this.VpnProto);
        this.setParamSimple(map, prefix + "EncryptProto", this.EncryptProto);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabaseSet.", this.SecurityPolicyDatabaseSet);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "HealthCheckLocalIp", this.HealthCheckLocalIp);
        this.setParamSimple(map, prefix + "HealthCheckRemoteIp", this.HealthCheckRemoteIp);
        this.setParamSimple(map, prefix + "HealthCheckStatus", this.HealthCheckStatus);
        this.setParamSimple(map, prefix + "DpdEnable", this.DpdEnable);
        this.setParamSimple(map, prefix + "DpdTimeout", this.DpdTimeout);
        this.setParamSimple(map, prefix + "DpdAction", this.DpdAction);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "NegotiationType", this.NegotiationType);
        this.setParamObj(map, prefix + "BgpConfig.", this.BgpConfig);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);

    }
}

