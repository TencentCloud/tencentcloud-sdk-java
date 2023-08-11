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

public class KongRoutePreview extends AbstractModel{

    /**
    * 服务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 服务名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocols")
    @Expose
    private String [] Protocols;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreserveHost")
    @Expose
    private Boolean PreserveHost;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpsRedirectStatusCode")
    @Expose
    private Long HttpsRedirectStatusCode;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StripPath")
    @Expose
    private Boolean StripPath;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 是否开启了强制HTTPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceHttps")
    @Expose
    private Boolean ForceHttps;

    /**
    * 服务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 服务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * 目的端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestinationPorts")
    @Expose
    private Long [] DestinationPorts;

    /**
    * 路由的Headers
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private KVMapping [] Headers;

    /**
     * Get 服务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 服务名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Methods 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Methods 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paths 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paths 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hosts 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hosts 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocols 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocols 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocols(String [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreserveHost 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPreserveHost() {
        return this.PreserveHost;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreserveHost 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreserveHost(Boolean PreserveHost) {
        this.PreserveHost = PreserveHost;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpsRedirectStatusCode 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttpsRedirectStatusCode() {
        return this.HttpsRedirectStatusCode;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpsRedirectStatusCode 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpsRedirectStatusCode(Long HttpsRedirectStatusCode) {
        this.HttpsRedirectStatusCode = HttpsRedirectStatusCode;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StripPath 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStripPath() {
        return this.StripPath;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param StripPath 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStripPath(Boolean StripPath) {
        this.StripPath = StripPath;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 是否开启了强制HTTPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceHttps 是否开启了强制HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Boolean getForceHttps() {
        return this.ForceHttps;
    }

    /**
     * Set 是否开启了强制HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceHttps 是否开启了强制HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setForceHttps(Boolean ForceHttps) {
        this.ForceHttps = ForceHttps;
    }

    /**
     * Get 服务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 服务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceID 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceID 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get 目的端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestinationPorts 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDestinationPorts() {
        return this.DestinationPorts;
    }

    /**
     * Set 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestinationPorts 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinationPorts(Long [] DestinationPorts) {
        this.DestinationPorts = DestinationPorts;
    }

    /**
     * Get 路由的Headers
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers 路由的Headers
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVMapping [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 路由的Headers
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers 路由的Headers
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(KVMapping [] Headers) {
        this.Headers = Headers;
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

    }
}

