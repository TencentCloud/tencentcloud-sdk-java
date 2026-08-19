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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterDetailResponse extends AbstractModel {

    /**
    * <p>集群基础信息</p>
    */
    @SerializedName("ClusterBaseInfo")
    @Expose
    private ClusterListItem ClusterBaseInfo;

    /**
    * <p>运行时组件</p>
    */
    @SerializedName("RuntimeComponent")
    @Expose
    private String RuntimeComponent;

    /**
    * <p>master ip</p>
    */
    @SerializedName("MasterIP")
    @Expose
    private String MasterIP;

    /**
    * <p>节点数</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>命名空间数</p>
    */
    @SerializedName("NamespaceCount")
    @Expose
    private Long NamespaceCount;

    /**
    * <p>pod数</p>
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * <p>容器数</p>
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * <p>service数</p>
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>ingress数</p>
    */
    @SerializedName("IngressCount")
    @Expose
    private Long IngressCount;

    /**
    * <p>镜像数</p>
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * <p>系统组件数量</p>
    */
    @SerializedName("SystemComponentCount")
    @Expose
    private Long SystemComponentCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>集群基础信息</p> 
     * @return ClusterBaseInfo <p>集群基础信息</p>
     */
    public ClusterListItem getClusterBaseInfo() {
        return this.ClusterBaseInfo;
    }

    /**
     * Set <p>集群基础信息</p>
     * @param ClusterBaseInfo <p>集群基础信息</p>
     */
    public void setClusterBaseInfo(ClusterListItem ClusterBaseInfo) {
        this.ClusterBaseInfo = ClusterBaseInfo;
    }

    /**
     * Get <p>运行时组件</p> 
     * @return RuntimeComponent <p>运行时组件</p>
     */
    public String getRuntimeComponent() {
        return this.RuntimeComponent;
    }

    /**
     * Set <p>运行时组件</p>
     * @param RuntimeComponent <p>运行时组件</p>
     */
    public void setRuntimeComponent(String RuntimeComponent) {
        this.RuntimeComponent = RuntimeComponent;
    }

    /**
     * Get <p>master ip</p> 
     * @return MasterIP <p>master ip</p>
     */
    public String getMasterIP() {
        return this.MasterIP;
    }

    /**
     * Set <p>master ip</p>
     * @param MasterIP <p>master ip</p>
     */
    public void setMasterIP(String MasterIP) {
        this.MasterIP = MasterIP;
    }

    /**
     * Get <p>节点数</p> 
     * @return NodeCount <p>节点数</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>节点数</p>
     * @param NodeCount <p>节点数</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>命名空间数</p> 
     * @return NamespaceCount <p>命名空间数</p>
     */
    public Long getNamespaceCount() {
        return this.NamespaceCount;
    }

    /**
     * Set <p>命名空间数</p>
     * @param NamespaceCount <p>命名空间数</p>
     */
    public void setNamespaceCount(Long NamespaceCount) {
        this.NamespaceCount = NamespaceCount;
    }

    /**
     * Get <p>pod数</p> 
     * @return PodCount <p>pod数</p>
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set <p>pod数</p>
     * @param PodCount <p>pod数</p>
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get <p>容器数</p> 
     * @return ContainerCount <p>容器数</p>
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set <p>容器数</p>
     * @param ContainerCount <p>容器数</p>
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get <p>service数</p> 
     * @return ServiceCount <p>service数</p>
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>service数</p>
     * @param ServiceCount <p>service数</p>
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>ingress数</p> 
     * @return IngressCount <p>ingress数</p>
     */
    public Long getIngressCount() {
        return this.IngressCount;
    }

    /**
     * Set <p>ingress数</p>
     * @param IngressCount <p>ingress数</p>
     */
    public void setIngressCount(Long IngressCount) {
        this.IngressCount = IngressCount;
    }

    /**
     * Get <p>镜像数</p> 
     * @return ImageCount <p>镜像数</p>
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set <p>镜像数</p>
     * @param ImageCount <p>镜像数</p>
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get <p>系统组件数量</p> 
     * @return SystemComponentCount <p>系统组件数量</p>
     */
    public Long getSystemComponentCount() {
        return this.SystemComponentCount;
    }

    /**
     * Set <p>系统组件数量</p>
     * @param SystemComponentCount <p>系统组件数量</p>
     */
    public void setSystemComponentCount(Long SystemComponentCount) {
        this.SystemComponentCount = SystemComponentCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDetailResponse(DescribeClusterDetailResponse source) {
        if (source.ClusterBaseInfo != null) {
            this.ClusterBaseInfo = new ClusterListItem(source.ClusterBaseInfo);
        }
        if (source.RuntimeComponent != null) {
            this.RuntimeComponent = new String(source.RuntimeComponent);
        }
        if (source.MasterIP != null) {
            this.MasterIP = new String(source.MasterIP);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.NamespaceCount != null) {
            this.NamespaceCount = new Long(source.NamespaceCount);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.IngressCount != null) {
            this.IngressCount = new Long(source.IngressCount);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.SystemComponentCount != null) {
            this.SystemComponentCount = new Long(source.SystemComponentCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterBaseInfo.", this.ClusterBaseInfo);
        this.setParamSimple(map, prefix + "RuntimeComponent", this.RuntimeComponent);
        this.setParamSimple(map, prefix + "MasterIP", this.MasterIP);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "NamespaceCount", this.NamespaceCount);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "IngressCount", this.IngressCount);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "SystemComponentCount", this.SystemComponentCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

