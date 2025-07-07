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

public class SslVpnSever extends AbstractModel {

    /**
    * VPC实例ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * SSL-VPN-SERVER 实例ID。
    */
    @SerializedName("SslVpnServerId")
    @Expose
    private String SslVpnServerId;

    /**
    * VPN 实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * SSL-VPN-SERVER name。
    */
    @SerializedName("SslVpnServerName")
    @Expose
    private String SslVpnServerName;

    /**
    * 本端地址段。
    */
    @SerializedName("LocalAddress")
    @Expose
    private String [] LocalAddress;

    /**
    * 客户端地址段。
    */
    @SerializedName("RemoteAddress")
    @Expose
    private String RemoteAddress;

    /**
    * 客户端最大连接数。
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
    * SSL-VPN 网关公网IP。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * SSL VPN服务端监听协议
    */
    @SerializedName("SslVpnProtocol")
    @Expose
    private String SslVpnProtocol;

    /**
    * SSL VPN服务端监听协议端口
    */
    @SerializedName("SslVpnPort")
    @Expose
    private Long SslVpnPort;

    /**
    * 加密算法。
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * 认证算法。
    */
    @SerializedName("IntegrityAlgorithm")
    @Expose
    private String IntegrityAlgorithm;

    /**
    * 是否支持压缩。
    */
    @SerializedName("Compress")
    @Expose
    private Long Compress;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * SSL-VPN-SERVER 创建状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出错
6 已连通
7 未知
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 是否开启SSO认证。1：开启  0： 不开启
    */
    @SerializedName("SsoEnabled")
    @Expose
    private Long SsoEnabled;

    /**
    * EIAM应用ID
    */
    @SerializedName("EiamApplicationId")
    @Expose
    private String EiamApplicationId;

    /**
    * 是否开启策略控制。0：不开启 1： 开启
    */
    @SerializedName("AccessPolicyEnabled")
    @Expose
    private Long AccessPolicyEnabled;

    /**
    * 策略信息
    */
    @SerializedName("AccessPolicy")
    @Expose
    private AccessPolicy [] AccessPolicy;

    /**
    * CAM服务提供商Name
    */
    @SerializedName("SpName")
    @Expose
    private String SpName;

    /**
     * Get VPC实例ID. 
     * @return VpcId VPC实例ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID.
     * @param VpcId VPC实例ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get SSL-VPN-SERVER 实例ID。 
     * @return SslVpnServerId SSL-VPN-SERVER 实例ID。
     */
    public String getSslVpnServerId() {
        return this.SslVpnServerId;
    }

    /**
     * Set SSL-VPN-SERVER 实例ID。
     * @param SslVpnServerId SSL-VPN-SERVER 实例ID。
     */
    public void setSslVpnServerId(String SslVpnServerId) {
        this.SslVpnServerId = SslVpnServerId;
    }

    /**
     * Get VPN 实例ID。 
     * @return VpnGatewayId VPN 实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set VPN 实例ID。
     * @param VpnGatewayId VPN 实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get SSL-VPN-SERVER name。 
     * @return SslVpnServerName SSL-VPN-SERVER name。
     */
    public String getSslVpnServerName() {
        return this.SslVpnServerName;
    }

    /**
     * Set SSL-VPN-SERVER name。
     * @param SslVpnServerName SSL-VPN-SERVER name。
     */
    public void setSslVpnServerName(String SslVpnServerName) {
        this.SslVpnServerName = SslVpnServerName;
    }

    /**
     * Get 本端地址段。 
     * @return LocalAddress 本端地址段。
     */
    public String [] getLocalAddress() {
        return this.LocalAddress;
    }

    /**
     * Set 本端地址段。
     * @param LocalAddress 本端地址段。
     */
    public void setLocalAddress(String [] LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    /**
     * Get 客户端地址段。 
     * @return RemoteAddress 客户端地址段。
     */
    public String getRemoteAddress() {
        return this.RemoteAddress;
    }

    /**
     * Set 客户端地址段。
     * @param RemoteAddress 客户端地址段。
     */
    public void setRemoteAddress(String RemoteAddress) {
        this.RemoteAddress = RemoteAddress;
    }

    /**
     * Get 客户端最大连接数。 
     * @return MaxConnection 客户端最大连接数。
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set 客户端最大连接数。
     * @param MaxConnection 客户端最大连接数。
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    /**
     * Get SSL-VPN 网关公网IP。 
     * @return WanIp SSL-VPN 网关公网IP。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set SSL-VPN 网关公网IP。
     * @param WanIp SSL-VPN 网关公网IP。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get SSL VPN服务端监听协议 
     * @return SslVpnProtocol SSL VPN服务端监听协议
     */
    public String getSslVpnProtocol() {
        return this.SslVpnProtocol;
    }

    /**
     * Set SSL VPN服务端监听协议
     * @param SslVpnProtocol SSL VPN服务端监听协议
     */
    public void setSslVpnProtocol(String SslVpnProtocol) {
        this.SslVpnProtocol = SslVpnProtocol;
    }

    /**
     * Get SSL VPN服务端监听协议端口 
     * @return SslVpnPort SSL VPN服务端监听协议端口
     */
    public Long getSslVpnPort() {
        return this.SslVpnPort;
    }

    /**
     * Set SSL VPN服务端监听协议端口
     * @param SslVpnPort SSL VPN服务端监听协议端口
     */
    public void setSslVpnPort(Long SslVpnPort) {
        this.SslVpnPort = SslVpnPort;
    }

    /**
     * Get 加密算法。 
     * @return EncryptAlgorithm 加密算法。
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set 加密算法。
     * @param EncryptAlgorithm 加密算法。
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get 认证算法。 
     * @return IntegrityAlgorithm 认证算法。
     */
    public String getIntegrityAlgorithm() {
        return this.IntegrityAlgorithm;
    }

    /**
     * Set 认证算法。
     * @param IntegrityAlgorithm 认证算法。
     */
    public void setIntegrityAlgorithm(String IntegrityAlgorithm) {
        this.IntegrityAlgorithm = IntegrityAlgorithm;
    }

    /**
     * Get 是否支持压缩。 
     * @return Compress 是否支持压缩。
     */
    public Long getCompress() {
        return this.Compress;
    }

    /**
     * Set 是否支持压缩。
     * @param Compress 是否支持压缩。
     */
    public void setCompress(Long Compress) {
        this.Compress = Compress;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get SSL-VPN-SERVER 创建状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出错
6 已连通
7 未知 
     * @return State SSL-VPN-SERVER 创建状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出错
6 已连通
7 未知
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set SSL-VPN-SERVER 创建状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出错
6 已连通
7 未知
     * @param State SSL-VPN-SERVER 创建状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出错
6 已连通
7 未知
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 是否开启SSO认证。1：开启  0： 不开启 
     * @return SsoEnabled 是否开启SSO认证。1：开启  0： 不开启
     */
    public Long getSsoEnabled() {
        return this.SsoEnabled;
    }

    /**
     * Set 是否开启SSO认证。1：开启  0： 不开启
     * @param SsoEnabled 是否开启SSO认证。1：开启  0： 不开启
     */
    public void setSsoEnabled(Long SsoEnabled) {
        this.SsoEnabled = SsoEnabled;
    }

    /**
     * Get EIAM应用ID 
     * @return EiamApplicationId EIAM应用ID
     */
    public String getEiamApplicationId() {
        return this.EiamApplicationId;
    }

    /**
     * Set EIAM应用ID
     * @param EiamApplicationId EIAM应用ID
     */
    public void setEiamApplicationId(String EiamApplicationId) {
        this.EiamApplicationId = EiamApplicationId;
    }

    /**
     * Get 是否开启策略控制。0：不开启 1： 开启 
     * @return AccessPolicyEnabled 是否开启策略控制。0：不开启 1： 开启
     */
    public Long getAccessPolicyEnabled() {
        return this.AccessPolicyEnabled;
    }

    /**
     * Set 是否开启策略控制。0：不开启 1： 开启
     * @param AccessPolicyEnabled 是否开启策略控制。0：不开启 1： 开启
     */
    public void setAccessPolicyEnabled(Long AccessPolicyEnabled) {
        this.AccessPolicyEnabled = AccessPolicyEnabled;
    }

    /**
     * Get 策略信息 
     * @return AccessPolicy 策略信息
     */
    public AccessPolicy [] getAccessPolicy() {
        return this.AccessPolicy;
    }

    /**
     * Set 策略信息
     * @param AccessPolicy 策略信息
     */
    public void setAccessPolicy(AccessPolicy [] AccessPolicy) {
        this.AccessPolicy = AccessPolicy;
    }

    /**
     * Get CAM服务提供商Name 
     * @return SpName CAM服务提供商Name
     */
    public String getSpName() {
        return this.SpName;
    }

    /**
     * Set CAM服务提供商Name
     * @param SpName CAM服务提供商Name
     */
    public void setSpName(String SpName) {
        this.SpName = SpName;
    }

    public SslVpnSever() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SslVpnSever(SslVpnSever source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SslVpnServerId != null) {
            this.SslVpnServerId = new String(source.SslVpnServerId);
        }
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.SslVpnServerName != null) {
            this.SslVpnServerName = new String(source.SslVpnServerName);
        }
        if (source.LocalAddress != null) {
            this.LocalAddress = new String[source.LocalAddress.length];
            for (int i = 0; i < source.LocalAddress.length; i++) {
                this.LocalAddress[i] = new String(source.LocalAddress[i]);
            }
        }
        if (source.RemoteAddress != null) {
            this.RemoteAddress = new String(source.RemoteAddress);
        }
        if (source.MaxConnection != null) {
            this.MaxConnection = new Long(source.MaxConnection);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.SslVpnProtocol != null) {
            this.SslVpnProtocol = new String(source.SslVpnProtocol);
        }
        if (source.SslVpnPort != null) {
            this.SslVpnPort = new Long(source.SslVpnPort);
        }
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.IntegrityAlgorithm != null) {
            this.IntegrityAlgorithm = new String(source.IntegrityAlgorithm);
        }
        if (source.Compress != null) {
            this.Compress = new Long(source.Compress);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.SsoEnabled != null) {
            this.SsoEnabled = new Long(source.SsoEnabled);
        }
        if (source.EiamApplicationId != null) {
            this.EiamApplicationId = new String(source.EiamApplicationId);
        }
        if (source.AccessPolicyEnabled != null) {
            this.AccessPolicyEnabled = new Long(source.AccessPolicyEnabled);
        }
        if (source.AccessPolicy != null) {
            this.AccessPolicy = new AccessPolicy[source.AccessPolicy.length];
            for (int i = 0; i < source.AccessPolicy.length; i++) {
                this.AccessPolicy[i] = new AccessPolicy(source.AccessPolicy[i]);
            }
        }
        if (source.SpName != null) {
            this.SpName = new String(source.SpName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SslVpnServerId", this.SslVpnServerId);
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "SslVpnServerName", this.SslVpnServerName);
        this.setParamArraySimple(map, prefix + "LocalAddress.", this.LocalAddress);
        this.setParamSimple(map, prefix + "RemoteAddress", this.RemoteAddress);
        this.setParamSimple(map, prefix + "MaxConnection", this.MaxConnection);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "SslVpnProtocol", this.SslVpnProtocol);
        this.setParamSimple(map, prefix + "SslVpnPort", this.SslVpnPort);
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamSimple(map, prefix + "IntegrityAlgorithm", this.IntegrityAlgorithm);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SsoEnabled", this.SsoEnabled);
        this.setParamSimple(map, prefix + "EiamApplicationId", this.EiamApplicationId);
        this.setParamSimple(map, prefix + "AccessPolicyEnabled", this.AccessPolicyEnabled);
        this.setParamArrayObj(map, prefix + "AccessPolicy.", this.AccessPolicy);
        this.setParamSimple(map, prefix + "SpName", this.SpName);

    }
}

