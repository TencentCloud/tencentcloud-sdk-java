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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpnConnectionAttributeRequest extends AbstractModel{

    /**
    * VPN通道实例ID。形如：vpnx-f49l6u0z。
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * VPN通道名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;

    /**
    * 预共享密钥。
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;

    /**
    * SPD策略组，例如：{"10.0.0.5/24":["172.123.10.5/16"]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。
    */
    @SerializedName("SecurityPolicyDatabases")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabases;

    /**
    * IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议。
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;

    /**
    * IPSec配置，腾讯云提供IPSec安全会话设置。
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;

    /**
    * 是否启用通道健康检查
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * 本端通道探测ip
    */
    @SerializedName("HealthCheckLocalIp")
    @Expose
    private String HealthCheckLocalIp;

    /**
    * 对端通道探测ip
    */
    @SerializedName("HealthCheckRemoteIp")
    @Expose
    private String HealthCheckRemoteIp;

    /**
    * 协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）
    */
    @SerializedName("NegotiationType")
    @Expose
    private String NegotiationType;

    /**
    * DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）
    */
    @SerializedName("DpdEnable")
    @Expose
    private Long DpdEnable;

    /**
    * DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒
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
     * Get VPN通道实例ID。形如：vpnx-f49l6u0z。 
     * @return VpnConnectionId VPN通道实例ID。形如：vpnx-f49l6u0z。
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * Set VPN通道实例ID。形如：vpnx-f49l6u0z。
     * @param VpnConnectionId VPN通道实例ID。形如：vpnx-f49l6u0z。
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * Get VPN通道名称，可任意命名，但不得超过60个字符。 
     * @return VpnConnectionName VPN通道名称，可任意命名，但不得超过60个字符。
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * Set VPN通道名称，可任意命名，但不得超过60个字符。
     * @param VpnConnectionName VPN通道名称，可任意命名，但不得超过60个字符。
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
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
     * Get SPD策略组，例如：{"10.0.0.5/24":["172.123.10.5/16"]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。 
     * @return SecurityPolicyDatabases SPD策略组，例如：{"10.0.0.5/24":["172.123.10.5/16"]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabases() {
        return this.SecurityPolicyDatabases;
    }

    /**
     * Set SPD策略组，例如：{"10.0.0.5/24":["172.123.10.5/16"]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。
     * @param SecurityPolicyDatabases SPD策略组，例如：{"10.0.0.5/24":["172.123.10.5/16"]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。
     */
    public void setSecurityPolicyDatabases(SecurityPolicyDatabase [] SecurityPolicyDatabases) {
        this.SecurityPolicyDatabases = SecurityPolicyDatabases;
    }

    /**
     * Get IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议。 
     * @return IKEOptionsSpecification IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议。
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * Set IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议。
     * @param IKEOptionsSpecification IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议。
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * Get IPSec配置，腾讯云提供IPSec安全会话设置。 
     * @return IPSECOptionsSpecification IPSec配置，腾讯云提供IPSec安全会话设置。
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * Set IPSec配置，腾讯云提供IPSec安全会话设置。
     * @param IPSECOptionsSpecification IPSec配置，腾讯云提供IPSec安全会话设置。
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * Get 是否启用通道健康检查 
     * @return EnableHealthCheck 是否启用通道健康检查
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set 是否启用通道健康检查
     * @param EnableHealthCheck 是否启用通道健康检查
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get 本端通道探测ip 
     * @return HealthCheckLocalIp 本端通道探测ip
     */
    public String getHealthCheckLocalIp() {
        return this.HealthCheckLocalIp;
    }

    /**
     * Set 本端通道探测ip
     * @param HealthCheckLocalIp 本端通道探测ip
     */
    public void setHealthCheckLocalIp(String HealthCheckLocalIp) {
        this.HealthCheckLocalIp = HealthCheckLocalIp;
    }

    /**
     * Get 对端通道探测ip 
     * @return HealthCheckRemoteIp 对端通道探测ip
     */
    public String getHealthCheckRemoteIp() {
        return this.HealthCheckRemoteIp;
    }

    /**
     * Set 对端通道探测ip
     * @param HealthCheckRemoteIp 对端通道探测ip
     */
    public void setHealthCheckRemoteIp(String HealthCheckRemoteIp) {
        this.HealthCheckRemoteIp = HealthCheckRemoteIp;
    }

    /**
     * Get 协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商） 
     * @return NegotiationType 协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）
     */
    public String getNegotiationType() {
        return this.NegotiationType;
    }

    /**
     * Set 协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）
     * @param NegotiationType 协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）
     */
    public void setNegotiationType(String NegotiationType) {
        this.NegotiationType = NegotiationType;
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
     * Get DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒 
     * @return DpdTimeout DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒
     */
    public String getDpdTimeout() {
        return this.DpdTimeout;
    }

    /**
     * Set DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒
     * @param DpdTimeout DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒
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

    public ModifyVpnConnectionAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpnConnectionAttributeRequest(ModifyVpnConnectionAttributeRequest source) {
        if (source.VpnConnectionId != null) {
            this.VpnConnectionId = new String(source.VpnConnectionId);
        }
        if (source.VpnConnectionName != null) {
            this.VpnConnectionName = new String(source.VpnConnectionName);
        }
        if (source.PreShareKey != null) {
            this.PreShareKey = new String(source.PreShareKey);
        }
        if (source.SecurityPolicyDatabases != null) {
            this.SecurityPolicyDatabases = new SecurityPolicyDatabase[source.SecurityPolicyDatabases.length];
            for (int i = 0; i < source.SecurityPolicyDatabases.length; i++) {
                this.SecurityPolicyDatabases[i] = new SecurityPolicyDatabase(source.SecurityPolicyDatabases[i]);
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
        if (source.NegotiationType != null) {
            this.NegotiationType = new String(source.NegotiationType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabases.", this.SecurityPolicyDatabases);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "HealthCheckLocalIp", this.HealthCheckLocalIp);
        this.setParamSimple(map, prefix + "HealthCheckRemoteIp", this.HealthCheckRemoteIp);
        this.setParamSimple(map, prefix + "NegotiationType", this.NegotiationType);
        this.setParamSimple(map, prefix + "DpdEnable", this.DpdEnable);
        this.setParamSimple(map, prefix + "DpdTimeout", this.DpdTimeout);
        this.setParamSimple(map, prefix + "DpdAction", this.DpdAction);

    }
}

