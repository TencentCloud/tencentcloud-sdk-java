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

public class CreateVpnConnectionRequest extends AbstractModel {

    /**
    * <p>VPN网关实例ID。</p>
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * <p>对端网关ID。例如：cgw-2wqq41m9，可通过<a href="https://cloud.tencent.com/document/product/215/17516">DescribeCustomerGateways</a>接口查询对端网关。</p>
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * <p>通道名称，可任意命名，但不得超过60个字符。</p>
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;

    /**
    * <p>预共享密钥。</p>
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;

    /**
    * <p>VPC实例ID。VPC类型网关可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口返回值中的VpcId获取，CCN类型网关传空值即可。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>SPD策略组，例如：{&quot;10.0.0.5/24&quot;:[&quot;172.123.10.5/16&quot;]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。</p>
    */
    @SerializedName("SecurityPolicyDatabases")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabases;

    /**
    * <p>IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议</p>
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;

    /**
    * <p>IPSec配置，腾讯云提供IPSec安全会话设置</p>
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;

    /**
    * <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否支持隧道内健康检查，默认为False。</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>健康检查本端地址，默认值为随机在169.254.128.0/17分配一个IP。</p>
    */
    @SerializedName("HealthCheckLocalIp")
    @Expose
    private String HealthCheckLocalIp;

    /**
    * <p>健康检查对端地址，默认值为随机在169.254.128.0/17分配一个IP。</p>
    */
    @SerializedName("HealthCheckRemoteIp")
    @Expose
    private String HealthCheckRemoteIp;

    /**
    * <p>通道类型, 例如:[&quot;STATIC&quot;, &quot;StaticRoute&quot;, &quot;Policy&quot;, &quot;Bgp&quot;]</p><p>枚举值：</p><ul><li>StaticRoute： 目的路由类型</li><li>Policy： SPD策略类型</li><li>Bgp： BGP类型</li></ul><p>默认值：STATIC</p>
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * <p>协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）</p>
    */
    @SerializedName("NegotiationType")
    @Expose
    private String NegotiationType;

    /**
    * <p>DPD探测开关。默认为0，表示关闭DPD探测。可选值：0（关闭），1（开启）</p>
    */
    @SerializedName("DpdEnable")
    @Expose
    private Long DpdEnable;

    /**
    * <p>DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒</p>
    */
    @SerializedName("DpdTimeout")
    @Expose
    private String DpdTimeout;

    /**
    * <p>DPD超时后的动作。</p><p>入参限制：dpdEnable为1（开启）时有效。</p><p>枚举值：</p><ul><li>clear： 断开</li><li>restart： 重试</li></ul><p>默认值：restart</p>
    */
    @SerializedName("DpdAction")
    @Expose
    private String DpdAction;

    /**
    * <p>创建通道路由信息。</p>
    */
    @SerializedName("Route")
    @Expose
    private CreateVpnConnRoute Route;

    /**
    * <p>BGP配置。</p>
    */
    @SerializedName("BgpConfig")
    @Expose
    private BgpConfig BgpConfig;

    /**
    * <p>健康检查NQA配置。</p>
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfig HealthCheckConfig;

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
     * Get <p>对端网关ID。例如：cgw-2wqq41m9，可通过<a href="https://cloud.tencent.com/document/product/215/17516">DescribeCustomerGateways</a>接口查询对端网关。</p> 
     * @return CustomerGatewayId <p>对端网关ID。例如：cgw-2wqq41m9，可通过<a href="https://cloud.tencent.com/document/product/215/17516">DescribeCustomerGateways</a>接口查询对端网关。</p>
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set <p>对端网关ID。例如：cgw-2wqq41m9，可通过<a href="https://cloud.tencent.com/document/product/215/17516">DescribeCustomerGateways</a>接口查询对端网关。</p>
     * @param CustomerGatewayId <p>对端网关ID。例如：cgw-2wqq41m9，可通过<a href="https://cloud.tencent.com/document/product/215/17516">DescribeCustomerGateways</a>接口查询对端网关。</p>
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * Get <p>通道名称，可任意命名，但不得超过60个字符。</p> 
     * @return VpnConnectionName <p>通道名称，可任意命名，但不得超过60个字符。</p>
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * Set <p>通道名称，可任意命名，但不得超过60个字符。</p>
     * @param VpnConnectionName <p>通道名称，可任意命名，但不得超过60个字符。</p>
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
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
     * Get <p>VPC实例ID。VPC类型网关可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口返回值中的VpcId获取，CCN类型网关传空值即可。</p> 
     * @return VpcId <p>VPC实例ID。VPC类型网关可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口返回值中的VpcId获取，CCN类型网关传空值即可。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC实例ID。VPC类型网关可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口返回值中的VpcId获取，CCN类型网关传空值即可。</p>
     * @param VpcId <p>VPC实例ID。VPC类型网关可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口返回值中的VpcId获取，CCN类型网关传空值即可。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>SPD策略组，例如：{&quot;10.0.0.5/24&quot;:[&quot;172.123.10.5/16&quot;]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。</p> 
     * @return SecurityPolicyDatabases <p>SPD策略组，例如：{&quot;10.0.0.5/24&quot;:[&quot;172.123.10.5/16&quot;]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。</p>
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabases() {
        return this.SecurityPolicyDatabases;
    }

    /**
     * Set <p>SPD策略组，例如：{&quot;10.0.0.5/24&quot;:[&quot;172.123.10.5/16&quot;]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。</p>
     * @param SecurityPolicyDatabases <p>SPD策略组，例如：{&quot;10.0.0.5/24&quot;:[&quot;172.123.10.5/16&quot;]}，10.0.0.5/24是vpc内网段172.123.10.5/16是IDC网段。用户指定VPC内哪些网段可以和您IDC中哪些网段通信。</p>
     */
    public void setSecurityPolicyDatabases(SecurityPolicyDatabase [] SecurityPolicyDatabases) {
        this.SecurityPolicyDatabases = SecurityPolicyDatabases;
    }

    /**
     * Get <p>IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议</p> 
     * @return IKEOptionsSpecification <p>IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议</p>
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * Set <p>IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议</p>
     * @param IKEOptionsSpecification <p>IKE配置（Internet Key Exchange，因特网密钥交换），IKE具有一套自我保护机制，用户配置网络安全协议</p>
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * Get <p>IPSec配置，腾讯云提供IPSec安全会话设置</p> 
     * @return IPSECOptionsSpecification <p>IPSec配置，腾讯云提供IPSec安全会话设置</p>
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * Set <p>IPSec配置，腾讯云提供IPSec安全会话设置</p>
     * @param IPSECOptionsSpecification <p>IPSec配置，腾讯云提供IPSec安全会话设置</p>
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * Get <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p> 
     * @return Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     * @param Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否支持隧道内健康检查，默认为False。</p> 
     * @return EnableHealthCheck <p>是否支持隧道内健康检查，默认为False。</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>是否支持隧道内健康检查，默认为False。</p>
     * @param EnableHealthCheck <p>是否支持隧道内健康检查，默认为False。</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>健康检查本端地址，默认值为随机在169.254.128.0/17分配一个IP。</p> 
     * @return HealthCheckLocalIp <p>健康检查本端地址，默认值为随机在169.254.128.0/17分配一个IP。</p>
     */
    public String getHealthCheckLocalIp() {
        return this.HealthCheckLocalIp;
    }

    /**
     * Set <p>健康检查本端地址，默认值为随机在169.254.128.0/17分配一个IP。</p>
     * @param HealthCheckLocalIp <p>健康检查本端地址，默认值为随机在169.254.128.0/17分配一个IP。</p>
     */
    public void setHealthCheckLocalIp(String HealthCheckLocalIp) {
        this.HealthCheckLocalIp = HealthCheckLocalIp;
    }

    /**
     * Get <p>健康检查对端地址，默认值为随机在169.254.128.0/17分配一个IP。</p> 
     * @return HealthCheckRemoteIp <p>健康检查对端地址，默认值为随机在169.254.128.0/17分配一个IP。</p>
     */
    public String getHealthCheckRemoteIp() {
        return this.HealthCheckRemoteIp;
    }

    /**
     * Set <p>健康检查对端地址，默认值为随机在169.254.128.0/17分配一个IP。</p>
     * @param HealthCheckRemoteIp <p>健康检查对端地址，默认值为随机在169.254.128.0/17分配一个IP。</p>
     */
    public void setHealthCheckRemoteIp(String HealthCheckRemoteIp) {
        this.HealthCheckRemoteIp = HealthCheckRemoteIp;
    }

    /**
     * Get <p>通道类型, 例如:[&quot;STATIC&quot;, &quot;StaticRoute&quot;, &quot;Policy&quot;, &quot;Bgp&quot;]</p><p>枚举值：</p><ul><li>StaticRoute： 目的路由类型</li><li>Policy： SPD策略类型</li><li>Bgp： BGP类型</li></ul><p>默认值：STATIC</p> 
     * @return RouteType <p>通道类型, 例如:[&quot;STATIC&quot;, &quot;StaticRoute&quot;, &quot;Policy&quot;, &quot;Bgp&quot;]</p><p>枚举值：</p><ul><li>StaticRoute： 目的路由类型</li><li>Policy： SPD策略类型</li><li>Bgp： BGP类型</li></ul><p>默认值：STATIC</p>
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set <p>通道类型, 例如:[&quot;STATIC&quot;, &quot;StaticRoute&quot;, &quot;Policy&quot;, &quot;Bgp&quot;]</p><p>枚举值：</p><ul><li>StaticRoute： 目的路由类型</li><li>Policy： SPD策略类型</li><li>Bgp： BGP类型</li></ul><p>默认值：STATIC</p>
     * @param RouteType <p>通道类型, 例如:[&quot;STATIC&quot;, &quot;StaticRoute&quot;, &quot;Policy&quot;, &quot;Bgp&quot;]</p><p>枚举值：</p><ul><li>StaticRoute： 目的路由类型</li><li>Policy： SPD策略类型</li><li>Bgp： BGP类型</li></ul><p>默认值：STATIC</p>
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get <p>协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）</p> 
     * @return NegotiationType <p>协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）</p>
     */
    public String getNegotiationType() {
        return this.NegotiationType;
    }

    /**
     * Set <p>协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）</p>
     * @param NegotiationType <p>协商类型，默认为active（主动协商）。可选值：active（主动协商），passive（被动协商），flowTrigger（流量协商）</p>
     */
    public void setNegotiationType(String NegotiationType) {
        this.NegotiationType = NegotiationType;
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
     * Get <p>DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒</p> 
     * @return DpdTimeout <p>DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒</p>
     */
    public String getDpdTimeout() {
        return this.DpdTimeout;
    }

    /**
     * Set <p>DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒</p>
     * @param DpdTimeout <p>DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。默认30，单位为秒</p>
     */
    public void setDpdTimeout(String DpdTimeout) {
        this.DpdTimeout = DpdTimeout;
    }

    /**
     * Get <p>DPD超时后的动作。</p><p>入参限制：dpdEnable为1（开启）时有效。</p><p>枚举值：</p><ul><li>clear： 断开</li><li>restart： 重试</li></ul><p>默认值：restart</p> 
     * @return DpdAction <p>DPD超时后的动作。</p><p>入参限制：dpdEnable为1（开启）时有效。</p><p>枚举值：</p><ul><li>clear： 断开</li><li>restart： 重试</li></ul><p>默认值：restart</p>
     */
    public String getDpdAction() {
        return this.DpdAction;
    }

    /**
     * Set <p>DPD超时后的动作。</p><p>入参限制：dpdEnable为1（开启）时有效。</p><p>枚举值：</p><ul><li>clear： 断开</li><li>restart： 重试</li></ul><p>默认值：restart</p>
     * @param DpdAction <p>DPD超时后的动作。</p><p>入参限制：dpdEnable为1（开启）时有效。</p><p>枚举值：</p><ul><li>clear： 断开</li><li>restart： 重试</li></ul><p>默认值：restart</p>
     */
    public void setDpdAction(String DpdAction) {
        this.DpdAction = DpdAction;
    }

    /**
     * Get <p>创建通道路由信息。</p> 
     * @return Route <p>创建通道路由信息。</p>
     * @deprecated
     */
    @Deprecated
    public CreateVpnConnRoute getRoute() {
        return this.Route;
    }

    /**
     * Set <p>创建通道路由信息。</p>
     * @param Route <p>创建通道路由信息。</p>
     * @deprecated
     */
    @Deprecated
    public void setRoute(CreateVpnConnRoute Route) {
        this.Route = Route;
    }

    /**
     * Get <p>BGP配置。</p> 
     * @return BgpConfig <p>BGP配置。</p>
     */
    public BgpConfig getBgpConfig() {
        return this.BgpConfig;
    }

    /**
     * Set <p>BGP配置。</p>
     * @param BgpConfig <p>BGP配置。</p>
     */
    public void setBgpConfig(BgpConfig BgpConfig) {
        this.BgpConfig = BgpConfig;
    }

    /**
     * Get <p>健康检查NQA配置。</p> 
     * @return HealthCheckConfig <p>健康检查NQA配置。</p>
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set <p>健康检查NQA配置。</p>
     * @param HealthCheckConfig <p>健康检查NQA配置。</p>
     */
    public void setHealthCheckConfig(HealthCheckConfig HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    public CreateVpnConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpnConnectionRequest(CreateVpnConnectionRequest source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.CustomerGatewayId != null) {
            this.CustomerGatewayId = new String(source.CustomerGatewayId);
        }
        if (source.VpnConnectionName != null) {
            this.VpnConnectionName = new String(source.VpnConnectionName);
        }
        if (source.PreShareKey != null) {
            this.PreShareKey = new String(source.PreShareKey);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
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
        if (source.Route != null) {
            this.Route = new CreateVpnConnRoute(source.Route);
        }
        if (source.BgpConfig != null) {
            this.BgpConfig = new BgpConfig(source.BgpConfig);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfig(source.HealthCheckConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabases.", this.SecurityPolicyDatabases);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "HealthCheckLocalIp", this.HealthCheckLocalIp);
        this.setParamSimple(map, prefix + "HealthCheckRemoteIp", this.HealthCheckRemoteIp);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "NegotiationType", this.NegotiationType);
        this.setParamSimple(map, prefix + "DpdEnable", this.DpdEnable);
        this.setParamSimple(map, prefix + "DpdTimeout", this.DpdTimeout);
        this.setParamSimple(map, prefix + "DpdAction", this.DpdAction);
        this.setParamObj(map, prefix + "Route.", this.Route);
        this.setParamObj(map, prefix + "BgpConfig.", this.BgpConfig);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);

    }
}

