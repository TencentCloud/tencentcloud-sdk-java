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

public class KongRoutePreview extends AbstractModel {

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>服务名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * <p>无</p>
    */
    @SerializedName("Protocols")
    @Expose
    private String [] Protocols;

    /**
    * <p>无</p>
    */
    @SerializedName("PreserveHost")
    @Expose
    private Boolean PreserveHost;

    /**
    * <p>无</p>
    */
    @SerializedName("HttpsRedirectStatusCode")
    @Expose
    private Long HttpsRedirectStatusCode;

    /**
    * <p>无</p>
    */
    @SerializedName("StripPath")
    @Expose
    private Boolean StripPath;

    /**
    * <p>无</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>是否开启了强制HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceHttps")
    @Expose
    private Boolean ForceHttps;

    /**
    * <p>服务名</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * <p>目的端口</p>
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
    * <p>正则优先级</p>
    */
    @SerializedName("RegexPriority")
    @Expose
    private Long RegexPriority;

    /**
    * <p>querystring参数</p>
    */
    @SerializedName("QueryStringParameters")
    @Expose
    private KVMapping [] QueryStringParameters;

    /**
    * <p>路由来源</p>
    */
    @SerializedName("RouteSource")
    @Expose
    private String RouteSource;

    /**
     * Get <p>服务ID</p> 
     * @return ID <p>服务ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>服务ID</p>
     * @param ID <p>服务ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>服务名字</p> 
     * @return Name <p>服务名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名字</p>
     * @param Name <p>服务名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Methods <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Methods <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paths <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paths <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hosts <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hosts <p>无</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get <p>无</p> 
     * @return Protocols <p>无</p>
     */
    public String [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set <p>无</p>
     * @param Protocols <p>无</p>
     */
    public void setProtocols(String [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get <p>无</p> 
     * @return PreserveHost <p>无</p>
     */
    public Boolean getPreserveHost() {
        return this.PreserveHost;
    }

    /**
     * Set <p>无</p>
     * @param PreserveHost <p>无</p>
     */
    public void setPreserveHost(Boolean PreserveHost) {
        this.PreserveHost = PreserveHost;
    }

    /**
     * Get <p>无</p> 
     * @return HttpsRedirectStatusCode <p>无</p>
     */
    public Long getHttpsRedirectStatusCode() {
        return this.HttpsRedirectStatusCode;
    }

    /**
     * Set <p>无</p>
     * @param HttpsRedirectStatusCode <p>无</p>
     */
    public void setHttpsRedirectStatusCode(Long HttpsRedirectStatusCode) {
        this.HttpsRedirectStatusCode = HttpsRedirectStatusCode;
    }

    /**
     * Get <p>无</p> 
     * @return StripPath <p>无</p>
     */
    public Boolean getStripPath() {
        return this.StripPath;
    }

    /**
     * Set <p>无</p>
     * @param StripPath <p>无</p>
     */
    public void setStripPath(Boolean StripPath) {
        this.StripPath = StripPath;
    }

    /**
     * Get <p>无</p> 
     * @return CreatedTime <p>无</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>无</p>
     * @param CreatedTime <p>无</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>是否开启了强制HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceHttps <p>是否开启了强制HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Boolean getForceHttps() {
        return this.ForceHttps;
    }

    /**
     * Set <p>是否开启了强制HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceHttps <p>是否开启了强制HTTPS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setForceHttps(Boolean ForceHttps) {
        this.ForceHttps = ForceHttps;
    }

    /**
     * Get <p>服务名</p> 
     * @return ServiceName <p>服务名</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名</p>
     * @param ServiceName <p>服务名</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>服务ID</p> 
     * @return ServiceID <p>服务ID</p>
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>服务ID</p>
     * @param ServiceID <p>服务ID</p>
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get <p>目的端口</p> 
     * @return DestinationPorts <p>目的端口</p>
     */
    public Long [] getDestinationPorts() {
        return this.DestinationPorts;
    }

    /**
     * Set <p>目的端口</p>
     * @param DestinationPorts <p>目的端口</p>
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
     * Get <p>正则优先级</p> 
     * @return RegexPriority <p>正则优先级</p>
     */
    public Long getRegexPriority() {
        return this.RegexPriority;
    }

    /**
     * Set <p>正则优先级</p>
     * @param RegexPriority <p>正则优先级</p>
     */
    public void setRegexPriority(Long RegexPriority) {
        this.RegexPriority = RegexPriority;
    }

    /**
     * Get <p>querystring参数</p> 
     * @return QueryStringParameters <p>querystring参数</p>
     */
    public KVMapping [] getQueryStringParameters() {
        return this.QueryStringParameters;
    }

    /**
     * Set <p>querystring参数</p>
     * @param QueryStringParameters <p>querystring参数</p>
     */
    public void setQueryStringParameters(KVMapping [] QueryStringParameters) {
        this.QueryStringParameters = QueryStringParameters;
    }

    /**
     * Get <p>路由来源</p> 
     * @return RouteSource <p>路由来源</p>
     */
    public String getRouteSource() {
        return this.RouteSource;
    }

    /**
     * Set <p>路由来源</p>
     * @param RouteSource <p>路由来源</p>
     */
    public void setRouteSource(String RouteSource) {
        this.RouteSource = RouteSource;
    }

    public KongRoutePreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongRoutePreview(KongRoutePreview source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
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
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ForceHttps != null) {
            this.ForceHttps = new Boolean(source.ForceHttps);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
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
        if (source.RouteSource != null) {
            this.RouteSource = new String(source.RouteSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArraySimple(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "PreserveHost", this.PreserveHost);
        this.setParamSimple(map, prefix + "HttpsRedirectStatusCode", this.HttpsRedirectStatusCode);
        this.setParamSimple(map, prefix + "StripPath", this.StripPath);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ForceHttps", this.ForceHttps);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamArraySimple(map, prefix + "DestinationPorts.", this.DestinationPorts);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "RequestBuffering", this.RequestBuffering);
        this.setParamSimple(map, prefix + "ResponseBuffering", this.ResponseBuffering);
        this.setParamSimple(map, prefix + "RegexPriority", this.RegexPriority);
        this.setParamArrayObj(map, prefix + "QueryStringParameters.", this.QueryStringParameters);
        this.setParamSimple(map, prefix + "RouteSource", this.RouteSource);

    }
}

