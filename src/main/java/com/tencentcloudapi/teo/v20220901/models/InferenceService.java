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

public class InferenceService extends AbstractModel {

    /**
    * 推理服务 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 推理服务的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模型服务需要监听的端口。仅支持 1-65535 之间的整数。
    */
    @SerializedName("ListenPort")
    @Expose
    private Long ListenPort;

    /**
    * 推理服务的请求路径列表。最多支持 20 个路径。
    */
    @SerializedName("RequestPaths")
    @Expose
    private String [] RequestPaths;

    /**
    * 推理服务的容器配置。
    */
    @SerializedName("Containers")
    @Expose
    private InferenceContainerConfig [] Containers;

    /**
    * 推理服务的资源配置。
    */
    @SerializedName("ResourceConfig")
    @Expose
    private InferenceResourceConfig ResourceConfig;

    /**
    * 推理服务状态，包含以下几种状态：<li>Deploying：部署中；</li><li>Running：运行中；</li><li>Stopping：停止中；</li><li>Stopped：已停止；</li><li>Exception：异常；</li><li>Banned：被封禁。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 伸缩状态。取值有：<li>Normal：稳定运行，无进行中的伸缩操作；</li><li>ScalingOut：扩容中；</li><li>ScalingIn：缩容中。</li>
    */
    @SerializedName("ScalingStatus")
    @Expose
    private String ScalingStatus;

    /**
    * 当前运行中的实例数量。
    */
    @SerializedName("CurrentInstanceCount")
    @Expose
    private Long CurrentInstanceCount;

    /**
    * 推理访问地址，可通过链接访问底层模型进行推理。
    */
    @SerializedName("InferenceURL")
    @Expose
    private String InferenceURL;

    /**
    * 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 推理服务 ID。 
     * @return ServiceId 推理服务 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 推理服务 ID。
     * @param ServiceId 推理服务 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 推理服务的名称。 
     * @return Name 推理服务的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 推理服务的名称。
     * @param Name 推理服务的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述信息。 
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
     * @param Description 描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模型服务需要监听的端口。仅支持 1-65535 之间的整数。 
     * @return ListenPort 模型服务需要监听的端口。仅支持 1-65535 之间的整数。
     */
    public Long getListenPort() {
        return this.ListenPort;
    }

    /**
     * Set 模型服务需要监听的端口。仅支持 1-65535 之间的整数。
     * @param ListenPort 模型服务需要监听的端口。仅支持 1-65535 之间的整数。
     */
    public void setListenPort(Long ListenPort) {
        this.ListenPort = ListenPort;
    }

    /**
     * Get 推理服务的请求路径列表。最多支持 20 个路径。 
     * @return RequestPaths 推理服务的请求路径列表。最多支持 20 个路径。
     */
    public String [] getRequestPaths() {
        return this.RequestPaths;
    }

    /**
     * Set 推理服务的请求路径列表。最多支持 20 个路径。
     * @param RequestPaths 推理服务的请求路径列表。最多支持 20 个路径。
     */
    public void setRequestPaths(String [] RequestPaths) {
        this.RequestPaths = RequestPaths;
    }

    /**
     * Get 推理服务的容器配置。 
     * @return Containers 推理服务的容器配置。
     */
    public InferenceContainerConfig [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 推理服务的容器配置。
     * @param Containers 推理服务的容器配置。
     */
    public void setContainers(InferenceContainerConfig [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get 推理服务的资源配置。 
     * @return ResourceConfig 推理服务的资源配置。
     */
    public InferenceResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set 推理服务的资源配置。
     * @param ResourceConfig 推理服务的资源配置。
     */
    public void setResourceConfig(InferenceResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get 推理服务状态，包含以下几种状态：<li>Deploying：部署中；</li><li>Running：运行中；</li><li>Stopping：停止中；</li><li>Stopped：已停止；</li><li>Exception：异常；</li><li>Banned：被封禁。</li> 
     * @return Status 推理服务状态，包含以下几种状态：<li>Deploying：部署中；</li><li>Running：运行中；</li><li>Stopping：停止中；</li><li>Stopped：已停止；</li><li>Exception：异常；</li><li>Banned：被封禁。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 推理服务状态，包含以下几种状态：<li>Deploying：部署中；</li><li>Running：运行中；</li><li>Stopping：停止中；</li><li>Stopped：已停止；</li><li>Exception：异常；</li><li>Banned：被封禁。</li>
     * @param Status 推理服务状态，包含以下几种状态：<li>Deploying：部署中；</li><li>Running：运行中；</li><li>Stopping：停止中；</li><li>Stopped：已停止；</li><li>Exception：异常；</li><li>Banned：被封禁。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 伸缩状态。取值有：<li>Normal：稳定运行，无进行中的伸缩操作；</li><li>ScalingOut：扩容中；</li><li>ScalingIn：缩容中。</li> 
     * @return ScalingStatus 伸缩状态。取值有：<li>Normal：稳定运行，无进行中的伸缩操作；</li><li>ScalingOut：扩容中；</li><li>ScalingIn：缩容中。</li>
     */
    public String getScalingStatus() {
        return this.ScalingStatus;
    }

    /**
     * Set 伸缩状态。取值有：<li>Normal：稳定运行，无进行中的伸缩操作；</li><li>ScalingOut：扩容中；</li><li>ScalingIn：缩容中。</li>
     * @param ScalingStatus 伸缩状态。取值有：<li>Normal：稳定运行，无进行中的伸缩操作；</li><li>ScalingOut：扩容中；</li><li>ScalingIn：缩容中。</li>
     */
    public void setScalingStatus(String ScalingStatus) {
        this.ScalingStatus = ScalingStatus;
    }

    /**
     * Get 当前运行中的实例数量。 
     * @return CurrentInstanceCount 当前运行中的实例数量。
     */
    public Long getCurrentInstanceCount() {
        return this.CurrentInstanceCount;
    }

    /**
     * Set 当前运行中的实例数量。
     * @param CurrentInstanceCount 当前运行中的实例数量。
     */
    public void setCurrentInstanceCount(Long CurrentInstanceCount) {
        this.CurrentInstanceCount = CurrentInstanceCount;
    }

    /**
     * Get 推理访问地址，可通过链接访问底层模型进行推理。 
     * @return InferenceURL 推理访问地址，可通过链接访问底层模型进行推理。
     */
    public String getInferenceURL() {
        return this.InferenceURL;
    }

    /**
     * Set 推理访问地址，可通过链接访问底层模型进行推理。
     * @param InferenceURL 推理访问地址，可通过链接访问底层模型进行推理。
     */
    public void setInferenceURL(String InferenceURL) {
        this.InferenceURL = InferenceURL;
    }

    /**
     * Get 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public InferenceService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceService(InferenceService source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
            this.Containers = new InferenceContainerConfig[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new InferenceContainerConfig(source.Containers[i]);
            }
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new InferenceResourceConfig(source.ResourceConfig);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScalingStatus != null) {
            this.ScalingStatus = new String(source.ScalingStatus);
        }
        if (source.CurrentInstanceCount != null) {
            this.CurrentInstanceCount = new Long(source.CurrentInstanceCount);
        }
        if (source.InferenceURL != null) {
            this.InferenceURL = new String(source.InferenceURL);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ListenPort", this.ListenPort);
        this.setParamArraySimple(map, prefix + "RequestPaths.", this.RequestPaths);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScalingStatus", this.ScalingStatus);
        this.setParamSimple(map, prefix + "CurrentInstanceCount", this.CurrentInstanceCount);
        this.setParamSimple(map, prefix + "InferenceURL", this.InferenceURL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

