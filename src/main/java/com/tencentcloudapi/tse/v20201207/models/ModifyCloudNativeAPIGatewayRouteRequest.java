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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudNativeAPIGatewayRouteRequest extends AbstractModel {

    /**
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>所属服务的ID</p>
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * <p>路由的ID，实例级别唯一</p>
    */
    @SerializedName("RouteID")
    @Expose
    private String RouteID;

    /**
    * <p>路由的名字，实例级别唯一，可以不提供</p>
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * <p>路由的方法，其中方法可选值：</p><ul><li>GET</li><li>POST</li><li>DELETE</li><li>PUT</li><li>OPTIONS</li><li>PATCH</li><li>HEAD</li><li>ANY</li><li>TRACE</li><li>COPY</li><li>MOVE</li><li>PROPFIND</li><li>PROPPATCH</li><li>MKCOL</li><li>LOCK</li><li>UNLOCK</li></ul>
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * <p>路由的域名</p>
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * <p>路由的路径</p>
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * <p>路由的协议，可选</p><ul><li>https</li><li>http</li></ul>
    */
    @SerializedName("Protocols")
    @Expose
    private String [] Protocols;

    /**
    * <p>转发到后端时是否保留Host</p>
    */
    @SerializedName("PreserveHost")
    @Expose
    private Boolean PreserveHost;

    /**
    * <p>https重定向状态码</p>
    */
    @SerializedName("HttpsRedirectStatusCode")
    @Expose
    private Long HttpsRedirectStatusCode;

    /**
    * <p>转发到后端时是否StripPath</p>
    */
    @SerializedName("StripPath")
    @Expose
    private Boolean StripPath;

    /**
    * <p>是否开启强制HTTPS</p>
    */
    @SerializedName("ForceHttps")
    @Expose
    private Boolean ForceHttps;

    /**
    * <p>四层匹配的目的端口</p>
    */
    @SerializedName("DestinationPorts")
    @Expose
    private Long [] DestinationPorts;

    /**
    * <p>路由的Headers</p>
    */
    @SerializedName("Headers")
    @Expose
    private KVMapping [] Headers;

    /**
    * <p>是否缓存请求body，默认true</p>
    */
    @SerializedName("RequestBuffering")
    @Expose
    private Boolean RequestBuffering;

    /**
    * <p>是否缓存响应body，默认true</p>
    */
    @SerializedName("ResponseBuffering")
    @Expose
    private Boolean ResponseBuffering;

    /**
    * <p>增加优先级</p>
    */
    @SerializedName("RegexPriority")
    @Expose
    private Long RegexPriority;

    /**
    * <p>querysring参数</p>
    */
    @SerializedName("QueryStringParameters")
    @Expose
    private KVMapping [] QueryStringParameters;

    /**
     * Get <p>网关ID</p> 
     * @return GatewayId <p>网关ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID</p>
     * @param GatewayId <p>网关ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>所属服务的ID</p> 
     * @return ServiceID <p>所属服务的ID</p>
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>所属服务的ID</p>
     * @param ServiceID <p>所属服务的ID</p>
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get <p>路由的ID，实例级别唯一</p> 
     * @return RouteID <p>路由的ID，实例级别唯一</p>
     */
    public String getRouteID() {
        return this.RouteID;
    }

    /**
     * Set <p>路由的ID，实例级别唯一</p>
     * @param RouteID <p>路由的ID，实例级别唯一</p>
     */
    public void setRouteID(String RouteID) {
        this.RouteID = RouteID;
    }

    /**
     * Get <p>路由的名字，实例级别唯一，可以不提供</p> 
     * @return RouteName <p>路由的名字，实例级别唯一，可以不提供</p>
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set <p>路由的名字，实例级别唯一，可以不提供</p>
     * @param RouteName <p>路由的名字，实例级别唯一，可以不提供</p>
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get <p>路由的方法，其中方法可选值：</p><ul><li>GET</li><li>POST</li><li>DELETE</li><li>PUT</li><li>OPTIONS</li><li>PATCH</li><li>HEAD</li><li>ANY</li><li>TRACE</li><li>COPY</li><li>MOVE</li><li>PROPFIND</li><li>PROPPATCH</li><li>MKCOL</li><li>LOCK</li><li>UNLOCK</li></ul> 
     * @return Methods <p>路由的方法，其中方法可选值：</p><ul><li>GET</li><li>POST</li><li>DELETE</li><li>PUT</li><li>OPTIONS</li><li>PATCH</li><li>HEAD</li><li>ANY</li><li>TRACE</li><li>COPY</li><li>MOVE</li><li>PROPFIND</li><li>PROPPATCH</li><li>MKCOL</li><li>LOCK</li><li>UNLOCK</li></ul>
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set <p>路由的方法，其中方法可选值：</p><ul><li>GET</li><li>POST</li><li>DELETE</li><li>PUT</li><li>OPTIONS</li><li>PATCH</li><li>HEAD</li><li>ANY</li><li>TRACE</li><li>COPY</li><li>MOVE</li><li>PROPFIND</li><li>PROPPATCH</li><li>MKCOL</li><li>LOCK</li><li>UNLOCK</li></ul>
     * @param Methods <p>路由的方法，其中方法可选值：</p><ul><li>GET</li><li>POST</li><li>DELETE</li><li>PUT</li><li>OPTIONS</li><li>PATCH</li><li>HEAD</li><li>ANY</li><li>TRACE</li><li>COPY</li><li>MOVE</li><li>PROPFIND</li><li>PROPPATCH</li><li>MKCOL</li><li>LOCK</li><li>UNLOCK</li></ul>
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get <p>路由的域名</p> 
     * @return Hosts <p>路由的域名</p>
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set <p>路由的域名</p>
     * @param Hosts <p>路由的域名</p>
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get <p>路由的路径</p> 
     * @return Paths <p>路由的路径</p>
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>路由的路径</p>
     * @param Paths <p>路由的路径</p>
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get <p>路由的协议，可选</p><ul><li>https</li><li>http</li></ul> 
     * @return Protocols <p>路由的协议，可选</p><ul><li>https</li><li>http</li></ul>
     */
    public String [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set <p>路由的协议，可选</p><ul><li>https</li><li>http</li></ul>
     * @param Protocols <p>路由的协议，可选</p><ul><li>https</li><li>http</li></ul>
     */
    public void setProtocols(String [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get <p>转发到后端时是否保留Host</p> 
     * @return PreserveHost <p>转发到后端时是否保留Host</p>
     */
    public Boolean getPreserveHost() {
        return this.PreserveHost;
    }

    /**
     * Set <p>转发到后端时是否保留Host</p>
     * @param PreserveHost <p>转发到后端时是否保留Host</p>
     */
    public void setPreserveHost(Boolean PreserveHost) {
        this.PreserveHost = PreserveHost;
    }

    /**
     * Get <p>https重定向状态码</p> 
     * @return HttpsRedirectStatusCode <p>https重定向状态码</p>
     */
    public Long getHttpsRedirectStatusCode() {
        return this.HttpsRedirectStatusCode;
    }

    /**
     * Set <p>https重定向状态码</p>
     * @param HttpsRedirectStatusCode <p>https重定向状态码</p>
     */
    public void setHttpsRedirectStatusCode(Long HttpsRedirectStatusCode) {
        this.HttpsRedirectStatusCode = HttpsRedirectStatusCode;
    }

    /**
     * Get <p>转发到后端时是否StripPath</p> 
     * @return StripPath <p>转发到后端时是否StripPath</p>
     */
    public Boolean getStripPath() {
        return this.StripPath;
    }

    /**
     * Set <p>转发到后端时是否StripPath</p>
     * @param StripPath <p>转发到后端时是否StripPath</p>
     */
    public void setStripPath(Boolean StripPath) {
        this.StripPath = StripPath;
    }

    /**
     * Get <p>是否开启强制HTTPS</p> 
     * @return ForceHttps <p>是否开启强制HTTPS</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getForceHttps() {
        return this.ForceHttps;
    }

    /**
     * Set <p>是否开启强制HTTPS</p>
     * @param ForceHttps <p>是否开启强制HTTPS</p>
     * @deprecated
     */
    @Deprecated
    public void setForceHttps(Boolean ForceHttps) {
        this.ForceHttps = ForceHttps;
    }

    /**
     * Get <p>四层匹配的目的端口</p> 
     * @return DestinationPorts <p>四层匹配的目的端口</p>
     */
    public Long [] getDestinationPorts() {
        return this.DestinationPorts;
    }

    /**
     * Set <p>四层匹配的目的端口</p>
     * @param DestinationPorts <p>四层匹配的目的端口</p>
     */
    public void setDestinationPorts(Long [] DestinationPorts) {
        this.DestinationPorts = DestinationPorts;
    }

    /**
     * Get <p>路由的Headers</p> 
     * @return Headers <p>路由的Headers</p>
     */
    public KVMapping [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>路由的Headers</p>
     * @param Headers <p>路由的Headers</p>
     */
    public void setHeaders(KVMapping [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>是否缓存请求body，默认true</p> 
     * @return RequestBuffering <p>是否缓存请求body，默认true</p>
     */
    public Boolean getRequestBuffering() {
        return this.RequestBuffering;
    }

    /**
     * Set <p>是否缓存请求body，默认true</p>
     * @param RequestBuffering <p>是否缓存请求body，默认true</p>
     */
    public void setRequestBuffering(Boolean RequestBuffering) {
        this.RequestBuffering = RequestBuffering;
    }

    /**
     * Get <p>是否缓存响应body，默认true</p> 
     * @return ResponseBuffering <p>是否缓存响应body，默认true</p>
     */
    public Boolean getResponseBuffering() {
        return this.ResponseBuffering;
    }

    /**
     * Set <p>是否缓存响应body，默认true</p>
     * @param ResponseBuffering <p>是否缓存响应body，默认true</p>
     */
    public void setResponseBuffering(Boolean ResponseBuffering) {
        this.ResponseBuffering = ResponseBuffering;
    }

    /**
     * Get <p>增加优先级</p> 
     * @return RegexPriority <p>增加优先级</p>
     */
    public Long getRegexPriority() {
        return this.RegexPriority;
    }

    /**
     * Set <p>增加优先级</p>
     * @param RegexPriority <p>增加优先级</p>
     */
    public void setRegexPriority(Long RegexPriority) {
        this.RegexPriority = RegexPriority;
    }

    /**
     * Get <p>querysring参数</p> 
     * @return QueryStringParameters <p>querysring参数</p>
     */
    public KVMapping [] getQueryStringParameters() {
        return this.QueryStringParameters;
    }

    /**
     * Set <p>querysring参数</p>
     * @param QueryStringParameters <p>querysring参数</p>
     */
    public void setQueryStringParameters(KVMapping [] QueryStringParameters) {
        this.QueryStringParameters = QueryStringParameters;
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
        if (source.RequestBuffering != null) {
            this.RequestBuffering = new Boolean(source.RequestBuffering);
        }
        if (source.ResponseBuffering != null) {
            this.ResponseBuffering = new Boolean(source.ResponseBuffering);
        }
        if (source.RegexPriority != null) {
            this.RegexPriority = new Long(source.RegexPriority);
        }
        if (source.QueryStringParameters != null) {
            this.QueryStringParameters = new KVMapping[source.QueryStringParameters.length];
            for (int i = 0; i < source.QueryStringParameters.length; i++) {
                this.QueryStringParameters[i] = new KVMapping(source.QueryStringParameters[i]);
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
        this.setParamSimple(map, prefix + "RequestBuffering", this.RequestBuffering);
        this.setParamSimple(map, prefix + "ResponseBuffering", this.ResponseBuffering);
        this.setParamSimple(map, prefix + "RegexPriority", this.RegexPriority);
        this.setParamArrayObj(map, prefix + "QueryStringParameters.", this.QueryStringParameters);

    }
}

