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

public class GovernanceInstanceInput extends AbstractModel {

    /**
    * 实例所在服务名。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 实例服务所在命名空间。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 实例负载均衡权重信息。不填默认为100。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 实例默认健康信息。不填默认为健康。
    */
    @SerializedName("Healthy")
    @Expose
    private Boolean Healthy;

    /**
    * 实例隔离信息。不填默认为非隔离。
    */
    @SerializedName("Isolate")
    @Expose
    private Boolean Isolate;

    /**
    * 实例ip。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 实例监听端口。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 实例使用协议。不填默认为空。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 实例版本。不填默认为空。
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * 是否启用健康检查。不填默认不启用。
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * 上报心跳时间间隔。若 EnableHealthCheck 为不启用，则此参数不生效；若 EnableHealthCheck 启用，此参数不填，则默认 ttl 为 5s。
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
     * Get 实例所在服务名。 
     * @return Service 实例所在服务名。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 实例所在服务名。
     * @param Service 实例所在服务名。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 实例服务所在命名空间。 
     * @return Namespace 实例服务所在命名空间。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 实例服务所在命名空间。
     * @param Namespace 实例服务所在命名空间。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 实例负载均衡权重信息。不填默认为100。 
     * @return Weight 实例负载均衡权重信息。不填默认为100。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 实例负载均衡权重信息。不填默认为100。
     * @param Weight 实例负载均衡权重信息。不填默认为100。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 实例默认健康信息。不填默认为健康。 
     * @return Healthy 实例默认健康信息。不填默认为健康。
     */
    public Boolean getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 实例默认健康信息。不填默认为健康。
     * @param Healthy 实例默认健康信息。不填默认为健康。
     */
    public void setHealthy(Boolean Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 实例隔离信息。不填默认为非隔离。 
     * @return Isolate 实例隔离信息。不填默认为非隔离。
     */
    public Boolean getIsolate() {
        return this.Isolate;
    }

    /**
     * Set 实例隔离信息。不填默认为非隔离。
     * @param Isolate 实例隔离信息。不填默认为非隔离。
     */
    public void setIsolate(Boolean Isolate) {
        this.Isolate = Isolate;
    }

    /**
     * Get 实例ip。 
     * @return Host 实例ip。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 实例ip。
     * @param Host 实例ip。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 实例监听端口。 
     * @return Port 实例监听端口。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例监听端口。
     * @param Port 实例监听端口。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 实例使用协议。不填默认为空。 
     * @return Protocol 实例使用协议。不填默认为空。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 实例使用协议。不填默认为空。
     * @param Protocol 实例使用协议。不填默认为空。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 实例版本。不填默认为空。 
     * @return InstanceVersion 实例版本。不填默认为空。
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 实例版本。不填默认为空。
     * @param InstanceVersion 实例版本。不填默认为空。
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get 是否启用健康检查。不填默认不启用。 
     * @return EnableHealthCheck 是否启用健康检查。不填默认不启用。
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set 是否启用健康检查。不填默认不启用。
     * @param EnableHealthCheck 是否启用健康检查。不填默认不启用。
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get 上报心跳时间间隔。若 EnableHealthCheck 为不启用，则此参数不生效；若 EnableHealthCheck 启用，此参数不填，则默认 ttl 为 5s。 
     * @return Ttl 上报心跳时间间隔。若 EnableHealthCheck 为不启用，则此参数不生效；若 EnableHealthCheck 启用，此参数不填，则默认 ttl 为 5s。
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set 上报心跳时间间隔。若 EnableHealthCheck 为不启用，则此参数不生效；若 EnableHealthCheck 启用，此参数不填，则默认 ttl 为 5s。
     * @param Ttl 上报心跳时间间隔。若 EnableHealthCheck 为不启用，则此参数不生效；若 EnableHealthCheck 启用，此参数不填，则默认 ttl 为 5s。
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    public GovernanceInstanceInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceInstanceInput(GovernanceInstanceInput source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Healthy != null) {
            this.Healthy = new Boolean(source.Healthy);
        }
        if (source.Isolate != null) {
            this.Isolate = new Boolean(source.Isolate);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "Isolate", this.Isolate);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);

    }
}

