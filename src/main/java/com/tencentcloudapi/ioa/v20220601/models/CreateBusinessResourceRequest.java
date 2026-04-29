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

public class CreateBusinessResourceRequest extends AbstractModel {

    /**
    * 业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * 业务资源协议类型, 1:UDP, 2:TCP, 3:所有协议(只支持32位)
    */
    @SerializedName("Protocol")
    @Expose
    private Long Protocol;

    /**
    * 业务资源名称，同一个资源模块下面不可重复
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 业务资源类型:ip,domain,ip_section，对应ip、域名、ip段
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 业务资源端口 all,1-65535
    */
    @SerializedName("ServicePort")
    @Expose
    private String ServicePort;

    /**
    * 业务资源优先级 1-65535(只支持32位)
    */
    @SerializedName("Levels")
    @Expose
    private Long Levels;

    /**
    * 业务资源地址(ip、域名、ip段)
    */
    @SerializedName("ServiceAddress")
    @Expose
    private String ServiceAddress;

    /**
    * 是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)
    */
    @SerializedName("DirectConn")
    @Expose
    private Long DirectConn;

    /**
     * Get 业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位) 
     * @return AreaId 业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set 业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)
     * @param AreaId 业务资源所在的模块id，没有资源模块先创建资源模块(只支持32位)
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get 业务资源协议类型, 1:UDP, 2:TCP, 3:所有协议(只支持32位) 
     * @return Protocol 业务资源协议类型, 1:UDP, 2:TCP, 3:所有协议(只支持32位)
     */
    public Long getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 业务资源协议类型, 1:UDP, 2:TCP, 3:所有协议(只支持32位)
     * @param Protocol 业务资源协议类型, 1:UDP, 2:TCP, 3:所有协议(只支持32位)
     */
    public void setProtocol(Long Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 业务资源名称，同一个资源模块下面不可重复 
     * @return ServiceName 业务资源名称，同一个资源模块下面不可重复
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 业务资源名称，同一个资源模块下面不可重复
     * @param ServiceName 业务资源名称，同一个资源模块下面不可重复
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 业务资源类型:ip,domain,ip_section，对应ip、域名、ip段 
     * @return ServiceType 业务资源类型:ip,domain,ip_section，对应ip、域名、ip段
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 业务资源类型:ip,domain,ip_section，对应ip、域名、ip段
     * @param ServiceType 业务资源类型:ip,domain,ip_section，对应ip、域名、ip段
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 业务资源端口 all,1-65535 
     * @return ServicePort 业务资源端口 all,1-65535
     */
    public String getServicePort() {
        return this.ServicePort;
    }

    /**
     * Set 业务资源端口 all,1-65535
     * @param ServicePort 业务资源端口 all,1-65535
     */
    public void setServicePort(String ServicePort) {
        this.ServicePort = ServicePort;
    }

    /**
     * Get 业务资源优先级 1-65535(只支持32位) 
     * @return Levels 业务资源优先级 1-65535(只支持32位)
     */
    public Long getLevels() {
        return this.Levels;
    }

    /**
     * Set 业务资源优先级 1-65535(只支持32位)
     * @param Levels 业务资源优先级 1-65535(只支持32位)
     */
    public void setLevels(Long Levels) {
        this.Levels = Levels;
    }

    /**
     * Get 业务资源地址(ip、域名、ip段) 
     * @return ServiceAddress 业务资源地址(ip、域名、ip段)
     */
    public String getServiceAddress() {
        return this.ServiceAddress;
    }

    /**
     * Set 业务资源地址(ip、域名、ip段)
     * @param ServiceAddress 业务资源地址(ip、域名、ip段)
     */
    public void setServiceAddress(String ServiceAddress) {
        this.ServiceAddress = ServiceAddress;
    }

    /**
     * Get 是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位) 
     * @return DirectConn 是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)
     */
    public Long getDirectConn() {
        return this.DirectConn;
    }

    /**
     * Set 是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)
     * @param DirectConn 是否走代理,该参数不传，默认为0, 2：内外网直连，1：内网直连， 0：不启用代理配置(只支持32位)
     */
    public void setDirectConn(Long DirectConn) {
        this.DirectConn = DirectConn;
    }

    public CreateBusinessResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBusinessResourceRequest(CreateBusinessResourceRequest source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.Protocol != null) {
            this.Protocol = new Long(source.Protocol);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServicePort != null) {
            this.ServicePort = new String(source.ServicePort);
        }
        if (source.Levels != null) {
            this.Levels = new Long(source.Levels);
        }
        if (source.ServiceAddress != null) {
            this.ServiceAddress = new String(source.ServiceAddress);
        }
        if (source.DirectConn != null) {
            this.DirectConn = new Long(source.DirectConn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServicePort", this.ServicePort);
        this.setParamSimple(map, prefix + "Levels", this.Levels);
        this.setParamSimple(map, prefix + "ServiceAddress", this.ServiceAddress);
        this.setParamSimple(map, prefix + "DirectConn", this.DirectConn);

    }
}

