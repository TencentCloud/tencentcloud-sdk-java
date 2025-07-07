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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WxGatewayRountItem extends AbstractModel {

    /**
    * 安全网关路由名称
    */
    @SerializedName("GatewayRouteName")
    @Expose
    private String GatewayRouteName;

    /**
    * 安全网关路由协议
    */
    @SerializedName("GatewayRouteProtocol")
    @Expose
    private String GatewayRouteProtocol;

    /**
    * 安全网关路由地址
    */
    @SerializedName("GatewayRouteAddr")
    @Expose
    private String GatewayRouteAddr;

    /**
    * 安全网关路由描述
    */
    @SerializedName("GatewayRouteDesc")
    @Expose
    private String GatewayRouteDesc;

    /**
    * 安全网关后端集群id，如果是外网服务，该id与GatewayRountName相同
    */
    @SerializedName("GatewayRouteClusterId")
    @Expose
    private String GatewayRouteClusterId;

    /**
    * 安全网关创建时间
    */
    @SerializedName("GatewayRouteCreateTime")
    @Expose
    private String GatewayRouteCreateTime;

    /**
    * 安全网关路由限制
    */
    @SerializedName("FrequencyLimitConfig")
    @Expose
    private FrequencyLimitConfig [] FrequencyLimitConfig;

    /**
    * ip代表绑定后端ip。cbr代表云托管服务
    */
    @SerializedName("GatewayRouteServerType")
    @Expose
    private String GatewayRouteServerType;

    /**
    * 服务名
    */
    @SerializedName("GatewayRouteServerName")
    @Expose
    private String GatewayRouteServerName;

    /**
    * ip
    */
    @SerializedName("GatewayRewriteHost")
    @Expose
    private String GatewayRewriteHost;

    /**
    * 网关版本
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

    /**
    * 请求路径
    */
    @SerializedName("GatewayRoutePath")
    @Expose
    private String GatewayRoutePath;

    /**
    * 请求模式
    */
    @SerializedName("GatewayRouteMethod")
    @Expose
    private String GatewayRouteMethod;

    /**
    * 4层端口
    */
    @SerializedName("GatewayRoutePort")
    @Expose
    private Long GatewayRoutePort;

    /**
    * 路由环境ID
    */
    @SerializedName("GatewayRouteEnvId")
    @Expose
    private String GatewayRouteEnvId;

    /**
    * 路径匹配类型，支持prefix(前缀匹配)，regex(正则匹配)， 默认prefix
    */
    @SerializedName("GatewayRoutePathMatchType")
    @Expose
    private String GatewayRoutePathMatchType;

    /**
    * 安全网关自定义头部
    */
    @SerializedName("CustomHeader")
    @Expose
    private CustomHeader CustomHeader;

    /**
     * Get 安全网关路由名称 
     * @return GatewayRouteName 安全网关路由名称
     */
    public String getGatewayRouteName() {
        return this.GatewayRouteName;
    }

    /**
     * Set 安全网关路由名称
     * @param GatewayRouteName 安全网关路由名称
     */
    public void setGatewayRouteName(String GatewayRouteName) {
        this.GatewayRouteName = GatewayRouteName;
    }

    /**
     * Get 安全网关路由协议 
     * @return GatewayRouteProtocol 安全网关路由协议
     */
    public String getGatewayRouteProtocol() {
        return this.GatewayRouteProtocol;
    }

    /**
     * Set 安全网关路由协议
     * @param GatewayRouteProtocol 安全网关路由协议
     */
    public void setGatewayRouteProtocol(String GatewayRouteProtocol) {
        this.GatewayRouteProtocol = GatewayRouteProtocol;
    }

    /**
     * Get 安全网关路由地址 
     * @return GatewayRouteAddr 安全网关路由地址
     */
    public String getGatewayRouteAddr() {
        return this.GatewayRouteAddr;
    }

    /**
     * Set 安全网关路由地址
     * @param GatewayRouteAddr 安全网关路由地址
     */
    public void setGatewayRouteAddr(String GatewayRouteAddr) {
        this.GatewayRouteAddr = GatewayRouteAddr;
    }

    /**
     * Get 安全网关路由描述 
     * @return GatewayRouteDesc 安全网关路由描述
     */
    public String getGatewayRouteDesc() {
        return this.GatewayRouteDesc;
    }

    /**
     * Set 安全网关路由描述
     * @param GatewayRouteDesc 安全网关路由描述
     */
    public void setGatewayRouteDesc(String GatewayRouteDesc) {
        this.GatewayRouteDesc = GatewayRouteDesc;
    }

    /**
     * Get 安全网关后端集群id，如果是外网服务，该id与GatewayRountName相同 
     * @return GatewayRouteClusterId 安全网关后端集群id，如果是外网服务，该id与GatewayRountName相同
     */
    public String getGatewayRouteClusterId() {
        return this.GatewayRouteClusterId;
    }

    /**
     * Set 安全网关后端集群id，如果是外网服务，该id与GatewayRountName相同
     * @param GatewayRouteClusterId 安全网关后端集群id，如果是外网服务，该id与GatewayRountName相同
     */
    public void setGatewayRouteClusterId(String GatewayRouteClusterId) {
        this.GatewayRouteClusterId = GatewayRouteClusterId;
    }

    /**
     * Get 安全网关创建时间 
     * @return GatewayRouteCreateTime 安全网关创建时间
     */
    public String getGatewayRouteCreateTime() {
        return this.GatewayRouteCreateTime;
    }

    /**
     * Set 安全网关创建时间
     * @param GatewayRouteCreateTime 安全网关创建时间
     */
    public void setGatewayRouteCreateTime(String GatewayRouteCreateTime) {
        this.GatewayRouteCreateTime = GatewayRouteCreateTime;
    }

    /**
     * Get 安全网关路由限制 
     * @return FrequencyLimitConfig 安全网关路由限制
     */
    public FrequencyLimitConfig [] getFrequencyLimitConfig() {
        return this.FrequencyLimitConfig;
    }

    /**
     * Set 安全网关路由限制
     * @param FrequencyLimitConfig 安全网关路由限制
     */
    public void setFrequencyLimitConfig(FrequencyLimitConfig [] FrequencyLimitConfig) {
        this.FrequencyLimitConfig = FrequencyLimitConfig;
    }

    /**
     * Get ip代表绑定后端ip。cbr代表云托管服务 
     * @return GatewayRouteServerType ip代表绑定后端ip。cbr代表云托管服务
     */
    public String getGatewayRouteServerType() {
        return this.GatewayRouteServerType;
    }

    /**
     * Set ip代表绑定后端ip。cbr代表云托管服务
     * @param GatewayRouteServerType ip代表绑定后端ip。cbr代表云托管服务
     */
    public void setGatewayRouteServerType(String GatewayRouteServerType) {
        this.GatewayRouteServerType = GatewayRouteServerType;
    }

    /**
     * Get 服务名 
     * @return GatewayRouteServerName 服务名
     */
    public String getGatewayRouteServerName() {
        return this.GatewayRouteServerName;
    }

    /**
     * Set 服务名
     * @param GatewayRouteServerName 服务名
     */
    public void setGatewayRouteServerName(String GatewayRouteServerName) {
        this.GatewayRouteServerName = GatewayRouteServerName;
    }

    /**
     * Get ip 
     * @return GatewayRewriteHost ip
     */
    public String getGatewayRewriteHost() {
        return this.GatewayRewriteHost;
    }

    /**
     * Set ip
     * @param GatewayRewriteHost ip
     */
    public void setGatewayRewriteHost(String GatewayRewriteHost) {
        this.GatewayRewriteHost = GatewayRewriteHost;
    }

    /**
     * Get 网关版本 
     * @return GatewayVersion 网关版本
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set 网关版本
     * @param GatewayVersion 网关版本
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    /**
     * Get 请求路径 
     * @return GatewayRoutePath 请求路径
     */
    public String getGatewayRoutePath() {
        return this.GatewayRoutePath;
    }

    /**
     * Set 请求路径
     * @param GatewayRoutePath 请求路径
     */
    public void setGatewayRoutePath(String GatewayRoutePath) {
        this.GatewayRoutePath = GatewayRoutePath;
    }

    /**
     * Get 请求模式 
     * @return GatewayRouteMethod 请求模式
     */
    public String getGatewayRouteMethod() {
        return this.GatewayRouteMethod;
    }

    /**
     * Set 请求模式
     * @param GatewayRouteMethod 请求模式
     */
    public void setGatewayRouteMethod(String GatewayRouteMethod) {
        this.GatewayRouteMethod = GatewayRouteMethod;
    }

    /**
     * Get 4层端口 
     * @return GatewayRoutePort 4层端口
     */
    public Long getGatewayRoutePort() {
        return this.GatewayRoutePort;
    }

    /**
     * Set 4层端口
     * @param GatewayRoutePort 4层端口
     */
    public void setGatewayRoutePort(Long GatewayRoutePort) {
        this.GatewayRoutePort = GatewayRoutePort;
    }

    /**
     * Get 路由环境ID 
     * @return GatewayRouteEnvId 路由环境ID
     */
    public String getGatewayRouteEnvId() {
        return this.GatewayRouteEnvId;
    }

    /**
     * Set 路由环境ID
     * @param GatewayRouteEnvId 路由环境ID
     */
    public void setGatewayRouteEnvId(String GatewayRouteEnvId) {
        this.GatewayRouteEnvId = GatewayRouteEnvId;
    }

    /**
     * Get 路径匹配类型，支持prefix(前缀匹配)，regex(正则匹配)， 默认prefix 
     * @return GatewayRoutePathMatchType 路径匹配类型，支持prefix(前缀匹配)，regex(正则匹配)， 默认prefix
     */
    public String getGatewayRoutePathMatchType() {
        return this.GatewayRoutePathMatchType;
    }

    /**
     * Set 路径匹配类型，支持prefix(前缀匹配)，regex(正则匹配)， 默认prefix
     * @param GatewayRoutePathMatchType 路径匹配类型，支持prefix(前缀匹配)，regex(正则匹配)， 默认prefix
     */
    public void setGatewayRoutePathMatchType(String GatewayRoutePathMatchType) {
        this.GatewayRoutePathMatchType = GatewayRoutePathMatchType;
    }

    /**
     * Get 安全网关自定义头部 
     * @return CustomHeader 安全网关自定义头部
     */
    public CustomHeader getCustomHeader() {
        return this.CustomHeader;
    }

    /**
     * Set 安全网关自定义头部
     * @param CustomHeader 安全网关自定义头部
     */
    public void setCustomHeader(CustomHeader CustomHeader) {
        this.CustomHeader = CustomHeader;
    }

    public WxGatewayRountItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WxGatewayRountItem(WxGatewayRountItem source) {
        if (source.GatewayRouteName != null) {
            this.GatewayRouteName = new String(source.GatewayRouteName);
        }
        if (source.GatewayRouteProtocol != null) {
            this.GatewayRouteProtocol = new String(source.GatewayRouteProtocol);
        }
        if (source.GatewayRouteAddr != null) {
            this.GatewayRouteAddr = new String(source.GatewayRouteAddr);
        }
        if (source.GatewayRouteDesc != null) {
            this.GatewayRouteDesc = new String(source.GatewayRouteDesc);
        }
        if (source.GatewayRouteClusterId != null) {
            this.GatewayRouteClusterId = new String(source.GatewayRouteClusterId);
        }
        if (source.GatewayRouteCreateTime != null) {
            this.GatewayRouteCreateTime = new String(source.GatewayRouteCreateTime);
        }
        if (source.FrequencyLimitConfig != null) {
            this.FrequencyLimitConfig = new FrequencyLimitConfig[source.FrequencyLimitConfig.length];
            for (int i = 0; i < source.FrequencyLimitConfig.length; i++) {
                this.FrequencyLimitConfig[i] = new FrequencyLimitConfig(source.FrequencyLimitConfig[i]);
            }
        }
        if (source.GatewayRouteServerType != null) {
            this.GatewayRouteServerType = new String(source.GatewayRouteServerType);
        }
        if (source.GatewayRouteServerName != null) {
            this.GatewayRouteServerName = new String(source.GatewayRouteServerName);
        }
        if (source.GatewayRewriteHost != null) {
            this.GatewayRewriteHost = new String(source.GatewayRewriteHost);
        }
        if (source.GatewayVersion != null) {
            this.GatewayVersion = new String(source.GatewayVersion);
        }
        if (source.GatewayRoutePath != null) {
            this.GatewayRoutePath = new String(source.GatewayRoutePath);
        }
        if (source.GatewayRouteMethod != null) {
            this.GatewayRouteMethod = new String(source.GatewayRouteMethod);
        }
        if (source.GatewayRoutePort != null) {
            this.GatewayRoutePort = new Long(source.GatewayRoutePort);
        }
        if (source.GatewayRouteEnvId != null) {
            this.GatewayRouteEnvId = new String(source.GatewayRouteEnvId);
        }
        if (source.GatewayRoutePathMatchType != null) {
            this.GatewayRoutePathMatchType = new String(source.GatewayRoutePathMatchType);
        }
        if (source.CustomHeader != null) {
            this.CustomHeader = new CustomHeader(source.CustomHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayRouteName", this.GatewayRouteName);
        this.setParamSimple(map, prefix + "GatewayRouteProtocol", this.GatewayRouteProtocol);
        this.setParamSimple(map, prefix + "GatewayRouteAddr", this.GatewayRouteAddr);
        this.setParamSimple(map, prefix + "GatewayRouteDesc", this.GatewayRouteDesc);
        this.setParamSimple(map, prefix + "GatewayRouteClusterId", this.GatewayRouteClusterId);
        this.setParamSimple(map, prefix + "GatewayRouteCreateTime", this.GatewayRouteCreateTime);
        this.setParamArrayObj(map, prefix + "FrequencyLimitConfig.", this.FrequencyLimitConfig);
        this.setParamSimple(map, prefix + "GatewayRouteServerType", this.GatewayRouteServerType);
        this.setParamSimple(map, prefix + "GatewayRouteServerName", this.GatewayRouteServerName);
        this.setParamSimple(map, prefix + "GatewayRewriteHost", this.GatewayRewriteHost);
        this.setParamSimple(map, prefix + "GatewayVersion", this.GatewayVersion);
        this.setParamSimple(map, prefix + "GatewayRoutePath", this.GatewayRoutePath);
        this.setParamSimple(map, prefix + "GatewayRouteMethod", this.GatewayRouteMethod);
        this.setParamSimple(map, prefix + "GatewayRoutePort", this.GatewayRoutePort);
        this.setParamSimple(map, prefix + "GatewayRouteEnvId", this.GatewayRouteEnvId);
        this.setParamSimple(map, prefix + "GatewayRoutePathMatchType", this.GatewayRoutePathMatchType);
        this.setParamObj(map, prefix + "CustomHeader.", this.CustomHeader);

    }
}

