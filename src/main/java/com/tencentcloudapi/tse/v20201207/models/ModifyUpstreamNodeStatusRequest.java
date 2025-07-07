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

public class ModifyUpstreamNodeStatusRequest extends AbstractModel {

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 访问IP地址或域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 访问端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * HEALTHY或UNHEALTHY
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 网关实例ID 
     * @return GatewayId 网关实例ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例ID
     * @param GatewayId 网关实例ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 访问IP地址或域名 
     * @return Host 访问IP地址或域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 访问IP地址或域名
     * @param Host 访问IP地址或域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 访问端口 
     * @return Port 访问端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 访问端口
     * @param Port 访问端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get HEALTHY或UNHEALTHY 
     * @return Status HEALTHY或UNHEALTHY
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set HEALTHY或UNHEALTHY
     * @param Status HEALTHY或UNHEALTHY
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyUpstreamNodeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUpstreamNodeStatusRequest(ModifyUpstreamNodeStatusRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

