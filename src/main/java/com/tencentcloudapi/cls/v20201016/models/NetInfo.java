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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetInfo extends AbstractModel {

    /**
    * 网络地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 认证token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 网络类型;1：内网；2:外网
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * 所属网络；如果网络类型为内网，该字段必填
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网络服务类型；如果网络类型为内网，该字段必填
- 0:云上cvm
- 3:云上专线网关
- 11:云联网
- 1025:云上clb
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
    * 认证机制，是否使用SSL，默认不使用
    */
    @SerializedName("IsSSL")
    @Expose
    private Boolean IsSSL;

    /**
     * Get 网络地址 
     * @return Host 网络地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 网络地址
     * @param Host 网络地址
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 认证token 
     * @return Token 认证token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 认证token
     * @param Token 认证token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 网络类型;1：内网；2:外网 
     * @return NetType 网络类型;1：内网；2:外网
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型;1：内网；2:外网
     * @param NetType 网络类型;1：内网；2:外网
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 所属网络；如果网络类型为内网，该字段必填 
     * @return VpcId 所属网络；如果网络类型为内网，该字段必填
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属网络；如果网络类型为内网，该字段必填
     * @param VpcId 所属网络；如果网络类型为内网，该字段必填
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网络服务类型；如果网络类型为内网，该字段必填
- 0:云上cvm
- 3:云上专线网关
- 11:云联网
- 1025:云上clb 
     * @return VirtualGatewayType 网络服务类型；如果网络类型为内网，该字段必填
- 0:云上cvm
- 3:云上专线网关
- 11:云联网
- 1025:云上clb
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set 网络服务类型；如果网络类型为内网，该字段必填
- 0:云上cvm
- 3:云上专线网关
- 11:云联网
- 1025:云上clb
     * @param VirtualGatewayType 网络服务类型；如果网络类型为内网，该字段必填
- 0:云上cvm
- 3:云上专线网关
- 11:云联网
- 1025:云上clb
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    /**
     * Get 认证机制，是否使用SSL，默认不使用 
     * @return IsSSL 认证机制，是否使用SSL，默认不使用
     */
    public Boolean getIsSSL() {
        return this.IsSSL;
    }

    /**
     * Set 认证机制，是否使用SSL，默认不使用
     * @param IsSSL 认证机制，是否使用SSL，默认不使用
     */
    public void setIsSSL(Boolean IsSSL) {
        this.IsSSL = IsSSL;
    }

    public NetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetInfo(NetInfo source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VirtualGatewayType != null) {
            this.VirtualGatewayType = new Long(source.VirtualGatewayType);
        }
        if (source.IsSSL != null) {
            this.IsSSL = new Boolean(source.IsSSL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);
        this.setParamSimple(map, prefix + "IsSSL", this.IsSSL);

    }
}

