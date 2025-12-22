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

public class EsInfo extends AbstractModel {

    /**
    * es类型。 1:云es, 2:自建es
    */
    @SerializedName("EsType")
    @Expose
    private Long EsType;

    /**
    * 访问方式 1:内网, 2:外网。自建es必填
    */
    @SerializedName("AccessMode")
    @Expose
    private Long AccessMode;

    /**
    * 实例id。云es实例必填
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 访问地址。自建es必填
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 访问端口。自建es必填
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 所属网络。自建es且访问方式为内网访问时必填
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网络服务类型。自建es且访问方式为内网访问时必填。
负载均衡 CLB:1025 云服务器CVM:0
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
    * 密码。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get es类型。 1:云es, 2:自建es 
     * @return EsType es类型。 1:云es, 2:自建es
     */
    public Long getEsType() {
        return this.EsType;
    }

    /**
     * Set es类型。 1:云es, 2:自建es
     * @param EsType es类型。 1:云es, 2:自建es
     */
    public void setEsType(Long EsType) {
        this.EsType = EsType;
    }

    /**
     * Get 访问方式 1:内网, 2:外网。自建es必填 
     * @return AccessMode 访问方式 1:内网, 2:外网。自建es必填
     */
    public Long getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 访问方式 1:内网, 2:外网。自建es必填
     * @param AccessMode 访问方式 1:内网, 2:外网。自建es必填
     */
    public void setAccessMode(Long AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get 实例id。云es实例必填 
     * @return InstanceId 实例id。云es实例必填
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id。云es实例必填
     * @param InstanceId 实例id。云es实例必填
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名。 
     * @return User 用户名。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名。
     * @param User 用户名。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 访问地址。自建es必填 
     * @return Address 访问地址。自建es必填
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 访问地址。自建es必填
     * @param Address 访问地址。自建es必填
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 访问端口。自建es必填 
     * @return Port 访问端口。自建es必填
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 访问端口。自建es必填
     * @param Port 访问端口。自建es必填
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 所属网络。自建es且访问方式为内网访问时必填 
     * @return VpcId 所属网络。自建es且访问方式为内网访问时必填
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属网络。自建es且访问方式为内网访问时必填
     * @param VpcId 所属网络。自建es且访问方式为内网访问时必填
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网络服务类型。自建es且访问方式为内网访问时必填。
负载均衡 CLB:1025 云服务器CVM:0 
     * @return VirtualGatewayType 网络服务类型。自建es且访问方式为内网访问时必填。
负载均衡 CLB:1025 云服务器CVM:0
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set 网络服务类型。自建es且访问方式为内网访问时必填。
负载均衡 CLB:1025 云服务器CVM:0
     * @param VirtualGatewayType 网络服务类型。自建es且访问方式为内网访问时必填。
负载均衡 CLB:1025 云服务器CVM:0
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    /**
     * Get 密码。 
     * @return Password 密码。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码。
     * @param Password 密码。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public EsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsInfo(EsInfo source) {
        if (source.EsType != null) {
            this.EsType = new Long(source.EsType);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new Long(source.AccessMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VirtualGatewayType != null) {
            this.VirtualGatewayType = new Long(source.VirtualGatewayType);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EsType", this.EsType);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

