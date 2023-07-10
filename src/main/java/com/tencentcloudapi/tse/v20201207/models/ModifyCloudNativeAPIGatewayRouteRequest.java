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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudNativeAPIGatewayRouteRequest extends AbstractModel{

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 所属服务的ID
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * 路由的ID，实例级别唯一
    */
    @SerializedName("RouteID")
    @Expose
    private String RouteID;

    /**
    * 路由的名字，实例级别唯一，可以不提供
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * 路由的方法，其中方法可选值：
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * 路由的域名
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 路由的路径
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * 路由的协议，可选
- https
- http
    */
    @SerializedName("Protocols")
    @Expose
    private String [] Protocols;

    /**
    * 转发到后端时是否保留Host
    */
    @SerializedName("PreserveHost")
    @Expose
    private Boolean PreserveHost;

    /**
    * https重定向状态码
    */
    @SerializedName("HttpsRedirectStatusCode")
    @Expose
    private Long HttpsRedirectStatusCode;

    /**
    * 转发到后端时是否StripPath
    */
    @SerializedName("StripPath")
    @Expose
    private Boolean StripPath;

    /**
    * 是否开启强制HTTPS
    */
    @SerializedName("ForceHttps")
    @Expose
    private Boolean ForceHttps;

    /**
    * 四层匹配的目的端口	
    */
    @SerializedName("DestinationPorts")
    @Expose
    private Long [] DestinationPorts;

    /**
    * 路由的Headers
    */
    @SerializedName("Headers")
    @Expose
    private KVMapping [] Headers;

    /**
     * Get 网关ID 
     * @return GatewayId 网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID
     * @param GatewayId 网关ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 所属服务的ID 
     * @return ServiceID 所属服务的ID
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set 所属服务的ID
     * @param ServiceID 所属服务的ID
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get 路由的ID，实例级别唯一 
     * @return RouteID 路由的ID，实例级别唯一
     */
    public String getRouteID() {
        return this.RouteID;
    }

    /**
     * Set 路由的ID，实例级别唯一
     * @param RouteID 路由的ID，实例级别唯一
     */
    public void setRouteID(String RouteID) {
        this.RouteID = RouteID;
    }

    /**
     * Get 路由的名字，实例级别唯一，可以不提供 
     * @return RouteName 路由的名字，实例级别唯一，可以不提供
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set 路由的名字，实例级别唯一，可以不提供
     * @param RouteName 路由的名字，实例级别唯一，可以不提供
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get 路由的方法，其中方法可选值：
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK 
     * @return Methods 路由的方法，其中方法可选值：
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set 路由的方法，其中方法可选值：
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK
     * @param Methods 路由的方法，其中方法可选值：
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get 路由的域名 
     * @return Hosts 路由的域名
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 路由的域名
     * @param Hosts 路由的域名
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 路由的路径 
     * @return Paths 路由的路径
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set 路由的路径
     * @param Paths 路由的路径
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get 路由的协议，可选
- https
- http 
     * @return Protocols 路由的协议，可选
- https
- http
     */
    public String [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set 路由的协议，可选
- https
- http
     * @param Protocols 路由的协议，可选
- https
- http
     */
    public void setProtocols(String [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get 转发到后端时是否保留Host 
     * @return PreserveHost 转发到后端时是否保留Host
     */
    public Boolean getPreserveHost() {
        return this.PreserveHost;
    }

    /**
     * Set 转发到后端时是否保留Host
     * @param PreserveHost 转发到后端时是否保留Host
     */
    public void setPreserveHost(Boolean PreserveHost) {
        this.PreserveHost = PreserveHost;
    }

    /**
     * Get https重定向状态码 
     * @return HttpsRedirectStatusCode https重定向状态码
     */
    public Long getHttpsRedirectStatusCode() {
        return this.HttpsRedirectStatusCode;
    }

    /**
     * Set https重定向状态码
     * @param HttpsRedirectStatusCode https重定向状态码
     */
    public void setHttpsRedirectStatusCode(Long HttpsRedirectStatusCode) {
        this.HttpsRedirectStatusCode = HttpsRedirectStatusCode;
    }

    /**
     * Get 转发到后端时是否StripPath 
     * @return StripPath 转发到后端时是否StripPath
     */
    public Boolean getStripPath() {
        return this.StripPath;
    }

    /**
     * Set 转发到后端时是否StripPath
     * @param StripPath 转发到后端时是否StripPath
     */
    public void setStripPath(Boolean StripPath) {
        this.StripPath = StripPath;
    }

    /**
     * Get 是否开启强制HTTPS 
     * @return ForceHttps 是否开启强制HTTPS
     * @deprecated
     */
    @Deprecated
    public Boolean getForceHttps() {
        return this.ForceHttps;
    }

    /**
     * Set 是否开启强制HTTPS
     * @param ForceHttps 是否开启强制HTTPS
     * @deprecated
     */
    @Deprecated
    public void setForceHttps(Boolean ForceHttps) {
        this.ForceHttps = ForceHttps;
    }

    /**
     * Get 四层匹配的目的端口	 
     * @return DestinationPorts 四层匹配的目的端口	
     */
    public Long [] getDestinationPorts() {
        return this.DestinationPorts;
    }

    /**
     * Set 四层匹配的目的端口	
     * @param DestinationPorts 四层匹配的目的端口	
     */
    public void setDestinationPorts(Long [] DestinationPorts) {
        this.DestinationPorts = DestinationPorts;
    }

    /**
     * Get 路由的Headers 
     * @return Headers 路由的Headers
     */
    public KVMapping [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 路由的Headers
     * @param Headers 路由的Headers
     */
    public void setHeaders(KVMapping [] Headers) {
        this.Headers = Headers;
    }

    public ModifyCloudNativeAPIGatewayRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayRouteRequest(ModifyCloudNativeAPIGatewayRouteRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.RouteID != null) {
            this.RouteID = new String(source.RouteID);
        }
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.Protocols != null) {
            this.Protocols = new String[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new String(source.Protocols[i]);
            }
        }
        if (source.PreserveHost != null) {
            this.PreserveHost = new Boolean(source.PreserveHost);
        }
        if (source.HttpsRedirectStatusCode != null) {
            this.HttpsRedirectStatusCode = new Long(source.HttpsRedirectStatusCode);
        }
        if (source.StripPath != null) {
            this.StripPath = new Boolean(source.StripPath);
        }
        if (source.ForceHttps != null) {
            this.ForceHttps = new Boolean(source.ForceHttps);
        }
        if (source.DestinationPorts != null) {
            this.DestinationPorts = new Long[source.DestinationPorts.length];
            for (int i = 0; i < source.DestinationPorts.length; i++) {
                this.DestinationPorts[i] = new Long(source.DestinationPorts[i]);
            }
        }
        if (source.Headers != null) {
            this.Headers = new KVMapping[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new KVMapping(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "RouteID", this.RouteID);
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamArraySimple(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "PreserveHost", this.PreserveHost);
        this.setParamSimple(map, prefix + "HttpsRedirectStatusCode", this.HttpsRedirectStatusCode);
        this.setParamSimple(map, prefix + "StripPath", this.StripPath);
        this.setParamSimple(map, prefix + "ForceHttps", this.ForceHttps);
        this.setParamArraySimple(map, prefix + "DestinationPorts.", this.DestinationPorts);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

