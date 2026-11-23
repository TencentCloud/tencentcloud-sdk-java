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

public class DescribeGovernanceInstancesRequest extends AbstractModel {

    /**
    * <p>实例所在的服务名。</p>
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * <p>实例所在命名空间名。</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>tse实例id。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>根据实例ip过滤，多个ip使用英文逗号分隔。</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>根据实例版本过滤。</p>
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * <p>根据实例协议过滤。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>根据实例健康状态过滤。false：表示不健康，true：表示健康。</p>
    */
    @SerializedName("HealthStatus")
    @Expose
    private Boolean HealthStatus;

    /**
    * <p>根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。</p>
    */
    @SerializedName("Isolate")
    @Expose
    private Boolean Isolate;

    /**
    * <p>根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。</p>
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>地域</p>
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
     * Get <p>实例所在的服务名。</p> 
     * @return Service <p>实例所在的服务名。</p>
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set <p>实例所在的服务名。</p>
     * @param Service <p>实例所在的服务名。</p>
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get <p>实例所在命名空间名。</p> 
     * @return Namespace <p>实例所在命名空间名。</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>实例所在命名空间名。</p>
     * @param Namespace <p>实例所在命名空间名。</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>tse实例id。</p> 
     * @return InstanceId <p>tse实例id。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>tse实例id。</p>
     * @param InstanceId <p>tse实例id。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>根据实例ip过滤，多个ip使用英文逗号分隔。</p> 
     * @return Host <p>根据实例ip过滤，多个ip使用英文逗号分隔。</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>根据实例ip过滤，多个ip使用英文逗号分隔。</p>
     * @param Host <p>根据实例ip过滤，多个ip使用英文逗号分隔。</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>根据实例版本过滤。</p> 
     * @return InstanceVersion <p>根据实例版本过滤。</p>
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set <p>根据实例版本过滤。</p>
     * @param InstanceVersion <p>根据实例版本过滤。</p>
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get <p>根据实例协议过滤。</p> 
     * @return Protocol <p>根据实例协议过滤。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>根据实例协议过滤。</p>
     * @param Protocol <p>根据实例协议过滤。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>根据实例健康状态过滤。false：表示不健康，true：表示健康。</p> 
     * @return HealthStatus <p>根据实例健康状态过滤。false：表示不健康，true：表示健康。</p>
     */
    public Boolean getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set <p>根据实例健康状态过滤。false：表示不健康，true：表示健康。</p>
     * @param HealthStatus <p>根据实例健康状态过滤。false：表示不健康，true：表示健康。</p>
     */
    public void setHealthStatus(Boolean HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get <p>根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。</p> 
     * @return Isolate <p>根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。</p>
     */
    public Boolean getIsolate() {
        return this.Isolate;
    }

    /**
     * Set <p>根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。</p>
     * @param Isolate <p>根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。</p>
     */
    public void setIsolate(Boolean Isolate) {
        this.Isolate = Isolate;
    }

    /**
     * Get <p>根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。</p> 
     * @return Metadatas <p>根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。</p>
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set <p>根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。</p>
     * @param Metadatas <p>根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。</p>
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>地域</p> 
     * @return Location <p>地域</p>
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set <p>地域</p>
     * @param Location <p>地域</p>
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public DescribeGovernanceInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGovernanceInstancesRequest(DescribeGovernanceInstancesRequest source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new Boolean(source.HealthStatus);
        }
        if (source.Isolate != null) {
            this.Isolate = new Boolean(source.Isolate);
        }
        if (source.Metadatas != null) {
            this.Metadatas = new Metadata[source.Metadatas.length];
            for (int i = 0; i < source.Metadatas.length; i++) {
                this.Metadatas[i] = new Metadata(source.Metadatas[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "Isolate", this.Isolate);
        this.setParamArrayObj(map, prefix + "Metadatas.", this.Metadatas);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

