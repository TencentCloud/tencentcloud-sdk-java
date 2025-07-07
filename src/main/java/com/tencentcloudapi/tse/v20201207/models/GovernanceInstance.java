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

public class GovernanceInstance extends AbstractModel {

    /**
    * 实例id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 实例所在服务名。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 实例所在命名空间名。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 实例ip地址。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 实例端口信息。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 通信协议。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 版本信息。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 负载均衡权重。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 是否开启健康检查。
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * 实例是否健康。
    */
    @SerializedName("Healthy")
    @Expose
    private Boolean Healthy;

    /**
    * 实例是否隔离。
    */
    @SerializedName("Isolate")
    @Expose
    private Boolean Isolate;

    /**
    * 实例创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例修改时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 元数据数组。
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
    * 上报心跳间隔。
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * 版本信息。
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * 状态信息
    */
    @SerializedName("HealthStatus")
    @Expose
    private String HealthStatus;

    /**
    * 描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 实例id。 
     * @return Id 实例id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 实例id。
     * @param Id 实例id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

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
     * Get 实例所在命名空间名。 
     * @return Namespace 实例所在命名空间名。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 实例所在命名空间名。
     * @param Namespace 实例所在命名空间名。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 实例ip地址。 
     * @return Host 实例ip地址。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 实例ip地址。
     * @param Host 实例ip地址。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 实例端口信息。 
     * @return Port 实例端口信息。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例端口信息。
     * @param Port 实例端口信息。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 通信协议。 
     * @return Protocol 通信协议。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 通信协议。
     * @param Protocol 通信协议。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 版本信息。 
     * @return Version 版本信息。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本信息。
     * @param Version 版本信息。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 负载均衡权重。 
     * @return Weight 负载均衡权重。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 负载均衡权重。
     * @param Weight 负载均衡权重。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 是否开启健康检查。 
     * @return EnableHealthCheck 是否开启健康检查。
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set 是否开启健康检查。
     * @param EnableHealthCheck 是否开启健康检查。
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get 实例是否健康。 
     * @return Healthy 实例是否健康。
     */
    public Boolean getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 实例是否健康。
     * @param Healthy 实例是否健康。
     */
    public void setHealthy(Boolean Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 实例是否隔离。 
     * @return Isolate 实例是否隔离。
     */
    public Boolean getIsolate() {
        return this.Isolate;
    }

    /**
     * Set 实例是否隔离。
     * @param Isolate 实例是否隔离。
     */
    public void setIsolate(Boolean Isolate) {
        this.Isolate = Isolate;
    }

    /**
     * Get 实例创建时间。 
     * @return CreateTime 实例创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间。
     * @param CreateTime 实例创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例修改时间。 
     * @return ModifyTime 实例修改时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 实例修改时间。
     * @param ModifyTime 实例修改时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 元数据数组。 
     * @return Metadatas 元数据数组。
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set 元数据数组。
     * @param Metadatas 元数据数组。
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get 上报心跳间隔。 
     * @return Ttl 上报心跳间隔。
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set 上报心跳间隔。
     * @param Ttl 上报心跳间隔。
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get 版本信息。 
     * @return InstanceVersion 版本信息。
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 版本信息。
     * @param InstanceVersion 版本信息。
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get 状态信息 
     * @return HealthStatus 状态信息
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 状态信息
     * @param HealthStatus 状态信息
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get 描述 
     * @return Comment 描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 描述
     * @param Comment 描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public GovernanceInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceInstance(GovernanceInstance source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
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
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.Healthy != null) {
            this.Healthy = new Boolean(source.Healthy);
        }
        if (source.Isolate != null) {
            this.Isolate = new Boolean(source.Isolate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Metadatas != null) {
            this.Metadatas = new Metadata[source.Metadatas.length];
            for (int i = 0; i < source.Metadatas.length; i++) {
                this.Metadatas[i] = new Metadata(source.Metadatas[i]);
            }
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new String(source.HealthStatus);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "Isolate", this.Isolate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArrayObj(map, prefix + "Metadatas.", this.Metadatas);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

