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
    * 通道实例ID。
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * 通道名称。
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPN网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * 对端网关实例ID。
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * 预共享密钥。
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;

    /**
    * 通道传输协议。
    */
    @SerializedName("VpnProto")
    @Expose
    private String VpnProto;

    /**
    * 通道加密协议。
    */
    @SerializedName("EncryptProto")
    @Expose
    private String EncryptProto;

    /**
    * 路由类型。
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 通道连接状态，AVAILABLE：已连接。
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * SPD。
    */
    @SerializedName("SecurityPolicyDatabaseSet")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabaseSet;

    /**
    * IKE选项。
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;

    /**
    * IPSEC选择。
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;

    /**
    * 是否支持健康状态探测
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * 本端探测ip
    */
    @SerializedName("HealthCheckLocalIp")
    @Expose
    private String HealthCheckLocalIp;

    /**
    * 对端探测ip
    */
    @SerializedName("HealthCheckRemoteIp")
    @Expose
    private String HealthCheckRemoteIp;

    /**
    * 通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象
    */
    @SerializedName("HealthCheckStatus")
    @Expose
    private String HealthCheckStatus;

    /**
    * DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）
    */
    @SerializedName("DpdEnable")
    @Expose
    private Long DpdEnable;

    /**
    * DPD超时时间。即探测确认对端不存在需要的时间。
    */
    @SerializedName("DpdTimeout")
    @Expose
    private String DpdTimeout;

    /**
    * DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）
    */
    @SerializedName("DpdAction")
    @Expose
    private String DpdAction;

    /**
    * 标签键值对数组
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 协商类型
    */
    @SerializedName("NegotiationType")
    @Expose
    private String NegotiationType;

    /**
    * Bgp配置信息
    */
    @SerializedName("BgpConfig")
    @Expose
    private BgpConfigAndAsn BgpConfig;

    /**
    * Nqa配置信息
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfig HealthCheckConfig;

    /**
     * Get 通道实例ID。 
     * @return VpnConnectionId 通道实例ID。
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * Set 通道实例ID。
     * @param VpnConnectionId 通道实例ID。
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * Get 通道名称。 
     * @return VpnConnectionName 通道名称。
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * Set 通道名称。
     * @param VpnConnectionName 通道名称。
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
    }

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPN网关实例ID。 
     * @return VpnGatewayId VPN网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set VPN网关实例ID。
     * @param VpnGatewayId VPN网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get 对端网关实例ID。 
     * @return CustomerGatewayId 对端网关实例ID。
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set 对端网关实例ID。
     * @param CustomerGatewayId 对端网关实例ID。
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * Get 预共享密钥。 
     * @return PreShareKey 预共享密钥。
     */
    public String getPreShareKey() {
        return this.PreShareKey;
    }

    /**
     * Set 预共享密钥。
     * @param PreShareKey 预共享密钥。
     */
    public void setPreShareKey(String PreShareKey) {
        this.PreShareKey = PreShareKey;
    }

    /**
     * Get 通道传输协议。 
     * @return VpnProto 通道传输协议。
     */
    public String getVpnProto() {
        return this.VpnProto;
    }

    /**
     * Set 通道传输协议。
     * @param VpnProto 通道传输协议。
     */
    public void setVpnProto(String VpnProto) {
        this.VpnProto = VpnProto;
    }

    /**
     * Get 通道加密协议。 
     * @return EncryptProto 通道加密协议。
     */
    public String getEncryptProto() {
        return this.EncryptProto;
    }

    /**
     * Set 通道加密协议。
     * @param EncryptProto 通道加密协议。
     */
    public void setEncryptProto(String EncryptProto) {
        this.EncryptProto = EncryptProto;
    }

    /**
     * Get 路由类型。 
     * @return RouteType 路由类型。
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set 路由类型。
     * @param RouteType 路由类型。
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。 
     * @return State 通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
     * @param State 通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 通道连接状态，AVAILABLE：已连接。 
     * @return NetStatus 通道连接状态，AVAILABLE：已连接。
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set 通道连接状态，AVAILABLE：已连接。
     * @param NetStatus 通道连接状态，AVAILABLE：已连接。
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * Get SPD。 
     * @return SecurityPolicyDatabaseSet SPD。
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabaseSet() {
        return this.SecurityPolicyDatabaseSet;
    }

    /**
     * Set SPD。
     * @param SecurityPolicyDatabaseSet SPD。
     */
    public void setSecurityPolicyDatabaseSet(SecurityPolicyDatabase [] SecurityPolicyDatabaseSet) {
        this.SecurityPolicyDatabaseSet = SecurityPolicyDatabaseSet;
    }

    /**
     * Get IKE选项。 
     * @return IKEOptionsSpecification IKE选项。
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * Set IKE选项。
     * @param IKEOptionsSpecification IKE选项。
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * Get IPSEC选择。 
     * @return IPSECOptionsSpecification IPSEC选择。
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * Set IPSEC选择。
     * @param IPSECOptionsSpecification IPSEC选择。
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * Get 是否支持健康状态探测 
     * @return EnableHealthCheck 是否支持健康状态探测
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set 是否支持健康状态探测
     * @param EnableHealthCheck 是否支持健康状态探测
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get 本端探测ip 
     * @return HealthCheckLocalIp 本端探测ip
     */
    public String getHealthCheckLocalIp() {
        return this.HealthCheckLocalIp;
    }

    /**
     * Set 本端探测ip
     * @param HealthCheckLocalIp 本端探测ip
     */
    public void setHealthCheckLocalIp(String HealthCheckLocalIp) {
        this.HealthCheckLocalIp = HealthCheckLocalIp;
    }

    /**
     * Get 对端探测ip 
     * @return HealthCheckRemoteIp 对端探测ip
     */
    public String getHealthCheckRemoteIp() {
        return this.HealthCheckRemoteIp;
    }

    /**
     * Set 对端探测ip
     * @param HealthCheckRemoteIp 对端探测ip
     */
    public void setHealthCheckRemoteIp(String HealthCheckRemoteIp) {
        this.HealthCheckRemoteIp = HealthCheckRemoteIp;
    }

    /**
     * Get 通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象 
     * @return HealthCheckStatus 通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象
     */
    public String getHealthCheckStatus() {
        return this.HealthCheckStatus;
    }

    /**
     * Set 通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象
     * @param HealthCheckStatus 通道健康检查状态，AVAILABLE：正常，UNAVAILABLE：不正常。 未配置健康检查不返回该对象
     */
    public void setHealthCheckStatus(String HealthCheckStatus) {
        this.HealthCheckStatus = HealthCheckStatus;
    }

    /**
     * Get DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启） 
     * @return DpdEnable DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）
     */
    public Long getDpdEnable() {
        return this.DpdEnable;
    }

    /**
     * Set DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）
     * @param DpdEnable DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）
     */
    public void setDpdEnable(Long DpdEnable) {
        this.DpdEnable = DpdEnable;
    }

    /**
     * Get DPD超时时间。即探测确认对端不存在需要的时间。 
     * @return DpdTimeout DPD超时时间。即探测确认对端不存在需要的时间。
     */
    public String getDpdTimeout() {
        return this.DpdTimeout;
    }

    /**
     * Set DPD超时时间。即探测确认对端不存在需要的时间。
     * @param DpdTimeout DPD超时时间。即探测确认对端不存在需要的时间。
     */
    public void setDpdTimeout(String DpdTimeout) {
        this.DpdTimeout = DpdTimeout;
    }

    /**
     * Get DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试） 
     * @return DpdAction DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）
     */
    public String getDpdAction() {
        return this.DpdAction;
    }

    /**
     * Set DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）
     * @param DpdAction DPD超时后的动作。默认为clear。dpdEnable为1（开启）时有效。可取值为clear（断开）和restart（重试）
     */
    public void setDpdAction(String DpdAction) {
        this.DpdAction = DpdAction;
    }

    /**
     * Get 标签键值对数组 
     * @return TagSet 标签键值对数组
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对数组
     * @param TagSet 标签键值对数组
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 协商类型 
     * @return NegotiationType 协商类型
     */
    public String getNegotiationType() {
        return this.NegotiationType;
    }

    /**
     * Set 协商类型
     * @param NegotiationType 协商类型
     */
    public void setNegotiationType(String NegotiationType) {
        this.NegotiationType = NegotiationType;
    }

    /**
     * Get Bgp配置信息 
     * @return BgpConfig Bgp配置信息
     */
    public BgpConfigAndAsn getBgpConfig() {
        return this.BgpConfig;
    }

    /**
     * Set Bgp配置信息
     * @param BgpConfig Bgp配置信息
     */
    public void setBgpConfig(BgpConfigAndAsn BgpConfig) {
        this.BgpConfig = BgpConfig;
    }

    /**
     * Get Nqa配置信息 
     * @return HealthCheckConfig Nqa配置信息
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set Nqa配置信息
     * @param HealthCheckConfig Nqa配置信息
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

