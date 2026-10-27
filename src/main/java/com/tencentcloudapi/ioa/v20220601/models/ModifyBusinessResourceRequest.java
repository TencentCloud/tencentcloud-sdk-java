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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBusinessResourceRequest extends AbstractModel {

    /**
    * <p>业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)</p>
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
    */
    @SerializedName("Protocol")
    @Expose
    private Long Protocol;

    /**
    * <p>业务资源名称，同一个资源模块下面不可重复</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>业务资源优先级 1-65535(只支持32位)</p>
    */
    @SerializedName("Levels")
    @Expose
    private Long Levels;

    /**
    * <p>业务资源类型:ip,domain,ip_section，对应ip、域名、ip段</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>业务资源端口 all,1-65535</p>
    */
    @SerializedName("ServicePort")
    @Expose
    private String ServicePort;

    /**
    * <p>修改业务资源的id(只支持32位)</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * <p>业务资源地址(ip、域名、ip段)</p>
    */
    @SerializedName("ServiceAddress")
    @Expose
    private String ServiceAddress;

    /**
    * <p>是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)</p>
    */
    @SerializedName("DirectConn")
    @Expose
    private Long DirectConn;

    /**
    * <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p>
    */
    @SerializedName("ConnectivityCheckSwitch")
    @Expose
    private Long ConnectivityCheckSwitch;

    /**
    * <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p>
    */
    @SerializedName("ConnectivityCheckInterval")
    @Expose
    private Long ConnectivityCheckInterval;

    /**
    * <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p>
    */
    @SerializedName("ConnectivityCheckIntervalUnit")
    @Expose
    private String ConnectivityCheckIntervalUnit;

    /**
    * <p>资源网络类型：1-内网资源 2-外网资源，默认1</p>
    */
    @SerializedName("ServiceNetwork")
    @Expose
    private Long ServiceNetwork;

    /**
    * <p>是否启用L3网络：1-不启用 2-启用，默认1</p>
    */
    @SerializedName("WireGuardTunnel")
    @Expose
    private Long WireGuardTunnel;

    /**
    * <p>资源描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>URL审计开关：0-关闭 1-开启，默认0</p>
    */
    @SerializedName("URLAuditState")
    @Expose
    private Long URLAuditState;

    /**
    * <p>URL审计证书ID列表，多个用分号分隔</p>
    */
    @SerializedName("URLAuditId")
    @Expose
    private String URLAuditId;

    /**
    * <p>URL审计路径，多个用分号分隔</p>
    */
    @SerializedName("URLPath")
    @Expose
    private String URLPath;

    /**
     * Get <p>业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)</p> 
     * @return AreaId <p>业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)</p>
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set <p>业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)</p>
     * @param AreaId <p>业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)</p>
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p> 
     * @return Protocol <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
     */
    public Long getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
     * @param Protocol <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
     */
    public void setProtocol(Long Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>业务资源名称，同一个资源模块下面不可重复</p> 
     * @return ServiceName <p>业务资源名称，同一个资源模块下面不可重复</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>业务资源名称，同一个资源模块下面不可重复</p>
     * @param ServiceName <p>业务资源名称，同一个资源模块下面不可重复</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>业务资源优先级 1-65535(只支持32位)</p> 
     * @return Levels <p>业务资源优先级 1-65535(只支持32位)</p>
     */
    public Long getLevels() {
        return this.Levels;
    }

    /**
     * Set <p>业务资源优先级 1-65535(只支持32位)</p>
     * @param Levels <p>业务资源优先级 1-65535(只支持32位)</p>
     */
    public void setLevels(Long Levels) {
        this.Levels = Levels;
    }

    /**
     * Get <p>业务资源类型:ip,domain,ip_section，对应ip、域名、ip段</p> 
     * @return ServiceType <p>业务资源类型:ip,domain,ip_section，对应ip、域名、ip段</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>业务资源类型:ip,domain,ip_section，对应ip、域名、ip段</p>
     * @param ServiceType <p>业务资源类型:ip,domain,ip_section，对应ip、域名、ip段</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>业务资源端口 all,1-65535</p> 
     * @return ServicePort <p>业务资源端口 all,1-65535</p>
     */
    public String getServicePort() {
        return this.ServicePort;
    }

    /**
     * Set <p>业务资源端口 all,1-65535</p>
     * @param ServicePort <p>业务资源端口 all,1-65535</p>
     */
    public void setServicePort(String ServicePort) {
        this.ServicePort = ServicePort;
    }

    /**
     * Get <p>修改业务资源的id(只支持32位)</p> 
     * @return ServiceId <p>修改业务资源的id(只支持32位)</p>
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>修改业务资源的id(只支持32位)</p>
     * @param ServiceId <p>修改业务资源的id(只支持32位)</p>
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>业务资源地址(ip、域名、ip段)</p> 
     * @return ServiceAddress <p>业务资源地址(ip、域名、ip段)</p>
     */
    public String getServiceAddress() {
        return this.ServiceAddress;
    }

    /**
     * Set <p>业务资源地址(ip、域名、ip段)</p>
     * @param ServiceAddress <p>业务资源地址(ip、域名、ip段)</p>
     */
    public void setServiceAddress(String ServiceAddress) {
        this.ServiceAddress = ServiceAddress;
    }

    /**
     * Get <p>是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)</p> 
     * @return DirectConn <p>是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)</p>
     */
    public Long getDirectConn() {
        return this.DirectConn;
    }

    /**
     * Set <p>是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)</p>
     * @param DirectConn <p>是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)</p>
     */
    public void setDirectConn(Long DirectConn) {
        this.DirectConn = DirectConn;
    }

    /**
     * Get <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p> 
     * @return ConnectivityCheckSwitch <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p>
     */
    public Long getConnectivityCheckSwitch() {
        return this.ConnectivityCheckSwitch;
    }

    /**
     * Set <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p>
     * @param ConnectivityCheckSwitch <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p>
     */
    public void setConnectivityCheckSwitch(Long ConnectivityCheckSwitch) {
        this.ConnectivityCheckSwitch = ConnectivityCheckSwitch;
    }

    /**
     * Get <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p> 
     * @return ConnectivityCheckInterval <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p>
     */
    public Long getConnectivityCheckInterval() {
        return this.ConnectivityCheckInterval;
    }

    /**
     * Set <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p>
     * @param ConnectivityCheckInterval <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p>
     */
    public void setConnectivityCheckInterval(Long ConnectivityCheckInterval) {
        this.ConnectivityCheckInterval = ConnectivityCheckInterval;
    }

    /**
     * Get <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p> 
     * @return ConnectivityCheckIntervalUnit <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p>
     */
    public String getConnectivityCheckIntervalUnit() {
        return this.ConnectivityCheckIntervalUnit;
    }

    /**
     * Set <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p>
     * @param ConnectivityCheckIntervalUnit <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p>
     */
    public void setConnectivityCheckIntervalUnit(String ConnectivityCheckIntervalUnit) {
        this.ConnectivityCheckIntervalUnit = ConnectivityCheckIntervalUnit;
    }

    /**
     * Get <p>资源网络类型：1-内网资源 2-外网资源，默认1</p> 
     * @return ServiceNetwork <p>资源网络类型：1-内网资源 2-外网资源，默认1</p>
     */
    public Long getServiceNetwork() {
        return this.ServiceNetwork;
    }

    /**
     * Set <p>资源网络类型：1-内网资源 2-外网资源，默认1</p>
     * @param ServiceNetwork <p>资源网络类型：1-内网资源 2-外网资源，默认1</p>
     */
    public void setServiceNetwork(Long ServiceNetwork) {
        this.ServiceNetwork = ServiceNetwork;
    }

    /**
     * Get <p>是否启用L3网络：1-不启用 2-启用，默认1</p> 
     * @return WireGuardTunnel <p>是否启用L3网络：1-不启用 2-启用，默认1</p>
     */
    public Long getWireGuardTunnel() {
        return this.WireGuardTunnel;
    }

    /**
     * Set <p>是否启用L3网络：1-不启用 2-启用，默认1</p>
     * @param WireGuardTunnel <p>是否启用L3网络：1-不启用 2-启用，默认1</p>
     */
    public void setWireGuardTunnel(Long WireGuardTunnel) {
        this.WireGuardTunnel = WireGuardTunnel;
    }

    /**
     * Get <p>资源描述</p> 
     * @return Description <p>资源描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>资源描述</p>
     * @param Description <p>资源描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>URL审计开关：0-关闭 1-开启，默认0</p> 
     * @return URLAuditState <p>URL审计开关：0-关闭 1-开启，默认0</p>
     */
    public Long getURLAuditState() {
        return this.URLAuditState;
    }

    /**
     * Set <p>URL审计开关：0-关闭 1-开启，默认0</p>
     * @param URLAuditState <p>URL审计开关：0-关闭 1-开启，默认0</p>
     */
    public void setURLAuditState(Long URLAuditState) {
        this.URLAuditState = URLAuditState;
    }

    /**
     * Get <p>URL审计证书ID列表，多个用分号分隔</p> 
     * @return URLAuditId <p>URL审计证书ID列表，多个用分号分隔</p>
     */
    public String getURLAuditId() {
        return this.URLAuditId;
    }

    /**
     * Set <p>URL审计证书ID列表，多个用分号分隔</p>
     * @param URLAuditId <p>URL审计证书ID列表，多个用分号分隔</p>
     */
    public void setURLAuditId(String URLAuditId) {
        this.URLAuditId = URLAuditId;
    }

    /**
     * Get <p>URL审计路径，多个用分号分隔</p> 
     * @return URLPath <p>URL审计路径，多个用分号分隔</p>
     */
    public String getURLPath() {
        return this.URLPath;
    }

    /**
     * Set <p>URL审计路径，多个用分号分隔</p>
     * @param URLPath <p>URL审计路径，多个用分号分隔</p>
     */
    public void setURLPath(String URLPath) {
        this.URLPath = URLPath;
    }

    public ModifyBusinessResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBusinessResourceRequest(ModifyBusinessResourceRequest source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.Protocol != null) {
            this.Protocol = new Long(source.Protocol);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Levels != null) {
            this.Levels = new Long(source.Levels);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServicePort != null) {
            this.ServicePort = new String(source.ServicePort);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ServiceAddress != null) {
            this.ServiceAddress = new String(source.ServiceAddress);
        }
        if (source.DirectConn != null) {
            this.DirectConn = new Long(source.DirectConn);
        }
        if (source.ConnectivityCheckSwitch != null) {
            this.ConnectivityCheckSwitch = new Long(source.ConnectivityCheckSwitch);
        }
        if (source.ConnectivityCheckInterval != null) {
            this.ConnectivityCheckInterval = new Long(source.ConnectivityCheckInterval);
        }
        if (source.ConnectivityCheckIntervalUnit != null) {
            this.ConnectivityCheckIntervalUnit = new String(source.ConnectivityCheckIntervalUnit);
        }
        if (source.ServiceNetwork != null) {
            this.ServiceNetwork = new Long(source.ServiceNetwork);
        }
        if (source.WireGuardTunnel != null) {
            this.WireGuardTunnel = new Long(source.WireGuardTunnel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.URLAuditState != null) {
            this.URLAuditState = new Long(source.URLAuditState);
        }
        if (source.URLAuditId != null) {
            this.URLAuditId = new String(source.URLAuditId);
        }
        if (source.URLPath != null) {
            this.URLPath = new String(source.URLPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Levels", this.Levels);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServicePort", this.ServicePort);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceAddress", this.ServiceAddress);
        this.setParamSimple(map, prefix + "DirectConn", this.DirectConn);
        this.setParamSimple(map, prefix + "ConnectivityCheckSwitch", this.ConnectivityCheckSwitch);
        this.setParamSimple(map, prefix + "ConnectivityCheckInterval", this.ConnectivityCheckInterval);
        this.setParamSimple(map, prefix + "ConnectivityCheckIntervalUnit", this.ConnectivityCheckIntervalUnit);
        this.setParamSimple(map, prefix + "ServiceNetwork", this.ServiceNetwork);
        this.setParamSimple(map, prefix + "WireGuardTunnel", this.WireGuardTunnel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "URLAuditState", this.URLAuditState);
        this.setParamSimple(map, prefix + "URLAuditId", this.URLAuditId);
        this.setParamSimple(map, prefix + "URLPath", this.URLPath);

    }
}

