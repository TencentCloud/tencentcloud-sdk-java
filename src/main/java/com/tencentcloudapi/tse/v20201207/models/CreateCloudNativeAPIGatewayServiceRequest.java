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

public class CreateCloudNativeAPIGatewayServiceRequest extends AbstractModel{

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 请求协议：
- https
- http
- tcp
- udp
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 请求路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 超时时间，单位ms
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 重试次数
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * 服务类型: 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * 服务配置信息
    */
    @SerializedName("UpstreamInfo")
    @Expose
    private KongUpstreamInfo UpstreamInfo;

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
     * Get 服务名称 
     * @return Name 服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名称
     * @param Name 服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 请求协议：
- https
- http
- tcp
- udp 
     * @return Protocol 请求协议：
- https
- http
- tcp
- udp
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 请求协议：
- https
- http
- tcp
- udp
     * @param Protocol 请求协议：
- https
- http
- tcp
- udp
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 请求路径 
     * @return Path 请求路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 请求路径
     * @param Path 请求路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 超时时间，单位ms 
     * @return Timeout 超时时间，单位ms
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，单位ms
     * @param Timeout 超时时间，单位ms
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 重试次数 
     * @return Retries 重试次数
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set 重试次数
     * @param Retries 重试次数
     */
    public void setRetries(Long Retries) {
        this.Retries = Retries;
    }

    /**
     * Get 服务类型: 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	 
     * @return UpstreamType 服务类型: 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set 服务类型: 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	
     * @param UpstreamType 服务类型: 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get 服务配置信息 
     * @return UpstreamInfo 服务配置信息
     */
    public KongUpstreamInfo getUpstreamInfo() {
        return this.UpstreamInfo;
    }

    /**
     * Set 服务配置信息
     * @param UpstreamInfo 服务配置信息
     */
    public void setUpstreamInfo(KongUpstreamInfo UpstreamInfo) {
        this.UpstreamInfo = UpstreamInfo;
    }

    public CreateCloudNativeAPIGatewayServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayServiceRequest(CreateCloudNativeAPIGatewayServiceRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Retries != null) {
            this.Retries = new Long(source.Retries);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.UpstreamInfo != null) {
            this.UpstreamInfo = new KongUpstreamInfo(source.UpstreamInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamObj(map, prefix + "UpstreamInfo.", this.UpstreamInfo);

    }
}

