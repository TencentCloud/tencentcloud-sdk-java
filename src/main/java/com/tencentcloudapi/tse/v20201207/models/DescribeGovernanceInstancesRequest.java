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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGovernanceInstancesRequest extends AbstractModel {

    /**
    * 实例所在的服务名。
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
    * tse实例id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 根据实例ip过滤，多个ip使用英文逗号分隔。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 根据实例版本过滤。
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * 根据实例协议过滤。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 根据实例健康状态过滤。false：表示不健康，true：表示健康。
    */
    @SerializedName("HealthStatus")
    @Expose
    private Boolean HealthStatus;

    /**
    * 根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。
    */
    @SerializedName("Isolate")
    @Expose
    private Boolean Isolate;

    /**
    * 根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 地域
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
     * Get 实例所在的服务名。 
     * @return Service 实例所在的服务名。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 实例所在的服务名。
     * @param Service 实例所在的服务名。
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
     * Get tse实例id。 
     * @return InstanceId tse实例id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tse实例id。
     * @param InstanceId tse实例id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 根据实例ip过滤，多个ip使用英文逗号分隔。 
     * @return Host 根据实例ip过滤，多个ip使用英文逗号分隔。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 根据实例ip过滤，多个ip使用英文逗号分隔。
     * @param Host 根据实例ip过滤，多个ip使用英文逗号分隔。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 根据实例版本过滤。 
     * @return InstanceVersion 根据实例版本过滤。
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 根据实例版本过滤。
     * @param InstanceVersion 根据实例版本过滤。
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get 根据实例协议过滤。 
     * @return Protocol 根据实例协议过滤。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 根据实例协议过滤。
     * @param Protocol 根据实例协议过滤。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 根据实例健康状态过滤。false：表示不健康，true：表示健康。 
     * @return HealthStatus 根据实例健康状态过滤。false：表示不健康，true：表示健康。
     */
    public Boolean getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 根据实例健康状态过滤。false：表示不健康，true：表示健康。
     * @param HealthStatus 根据实例健康状态过滤。false：表示不健康，true：表示健康。
     */
    public void setHealthStatus(Boolean HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get 根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。 
     * @return Isolate 根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。
     */
    public Boolean getIsolate() {
        return this.Isolate;
    }

    /**
     * Set 根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。
     * @param Isolate 根据实例隔离状态过滤。false：表示非隔离，true：表示隔离中。
     */
    public void setIsolate(Boolean Isolate) {
        this.Isolate = Isolate;
    }

    /**
     * Get 根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。 
     * @return Metadatas 根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set 根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。
     * @param Metadatas 根据元数据信息过滤。目前只支持一组元数据键值，若传了多个键值对，只会以第一个过滤。
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 地域 
     * @return Location 地域
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 地域
     * @param Location 地域
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

