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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInferenceServiceRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>推理服务 ID。</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>模型服务需要监听的端口。仅支持 1-65535 之间的整数。</p>
    */
    @SerializedName("ListenPort")
    @Expose
    private Long ListenPort;

    /**
    * <p>推理服务的请求路径列表。最多支持 20 个路径。</p>
    */
    @SerializedName("RequestPaths")
    @Expose
    private String [] RequestPaths;

    /**
    * <p>推理服务的容器配置。当前仅支持设置 1 个容器。</p>
    */
    @SerializedName("Containers")
    @Expose
    private InferenceContainerConfigForModify [] Containers;

    /**
    * <p>推理服务的资源配置。</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private InferenceResourceConfigForModify ResourceConfig;

    /**
    * <p>描述信息。长度限制不超过 60 个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>推理服务 ID。</p> 
     * @return ServiceId <p>推理服务 ID。</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>推理服务 ID。</p>
     * @param ServiceId <p>推理服务 ID。</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>模型服务需要监听的端口。仅支持 1-65535 之间的整数。</p> 
     * @return ListenPort <p>模型服务需要监听的端口。仅支持 1-65535 之间的整数。</p>
     */
    public Long getListenPort() {
        return this.ListenPort;
    }

    /**
     * Set <p>模型服务需要监听的端口。仅支持 1-65535 之间的整数。</p>
     * @param ListenPort <p>模型服务需要监听的端口。仅支持 1-65535 之间的整数。</p>
     */
    public void setListenPort(Long ListenPort) {
        this.ListenPort = ListenPort;
    }

    /**
     * Get <p>推理服务的请求路径列表。最多支持 20 个路径。</p> 
     * @return RequestPaths <p>推理服务的请求路径列表。最多支持 20 个路径。</p>
     */
    public String [] getRequestPaths() {
        return this.RequestPaths;
    }

    /**
     * Set <p>推理服务的请求路径列表。最多支持 20 个路径。</p>
     * @param RequestPaths <p>推理服务的请求路径列表。最多支持 20 个路径。</p>
     */
    public void setRequestPaths(String [] RequestPaths) {
        this.RequestPaths = RequestPaths;
    }

    /**
     * Get <p>推理服务的容器配置。当前仅支持设置 1 个容器。</p> 
     * @return Containers <p>推理服务的容器配置。当前仅支持设置 1 个容器。</p>
     */
    public InferenceContainerConfigForModify [] getContainers() {
        return this.Containers;
    }

    /**
     * Set <p>推理服务的容器配置。当前仅支持设置 1 个容器。</p>
     * @param Containers <p>推理服务的容器配置。当前仅支持设置 1 个容器。</p>
     */
    public void setContainers(InferenceContainerConfigForModify [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get <p>推理服务的资源配置。</p> 
     * @return ResourceConfig <p>推理服务的资源配置。</p>
     */
    public InferenceResourceConfigForModify getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>推理服务的资源配置。</p>
     * @param ResourceConfig <p>推理服务的资源配置。</p>
     */
    public void setResourceConfig(InferenceResourceConfigForModify ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>描述信息。长度限制不超过 60 个字符。</p> 
     * @return Description <p>描述信息。长度限制不超过 60 个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息。长度限制不超过 60 个字符。</p>
     * @param Description <p>描述信息。长度限制不超过 60 个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyInferenceServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInferenceServiceRequest(ModifyInferenceServiceRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ListenPort != null) {
            this.ListenPort = new Long(source.ListenPort);
        }
        if (source.RequestPaths != null) {
            this.RequestPaths = new String[source.RequestPaths.length];
            for (int i = 0; i < source.RequestPaths.length; i++) {
                this.RequestPaths[i] = new String(source.RequestPaths[i]);
            }
        }
        if (source.Containers != null) {
            this.Containers = new InferenceContainerConfigForModify[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new InferenceContainerConfigForModify(source.Containers[i]);
            }
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new InferenceResourceConfigForModify(source.ResourceConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ListenPort", this.ListenPort);
        this.setParamArraySimple(map, prefix + "RequestPaths.", this.RequestPaths);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

