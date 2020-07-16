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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodSpec extends AbstractModel{

    /**
    * 外部资源提供者的标识符，例如"cls-a1cd23fa"。
    */
    @SerializedName("ResourceProviderIdentifier")
    @Expose
    private String ResourceProviderIdentifier;

    /**
    * 外部资源提供者类型，例如"tke",当前仅支持"tke"。
    */
    @SerializedName("ResourceProviderType")
    @Expose
    private String ResourceProviderType;

    /**
    * 资源的用途，即节点类型，当前仅支持"TASK"。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * CPU核数。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位为GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。
    */
    @SerializedName("DataVolumes")
    @Expose
    private String [] DataVolumes;

    /**
     * Get 外部资源提供者的标识符，例如"cls-a1cd23fa"。 
     * @return ResourceProviderIdentifier 外部资源提供者的标识符，例如"cls-a1cd23fa"。
     */
    public String getResourceProviderIdentifier() {
        return this.ResourceProviderIdentifier;
    }

    /**
     * Set 外部资源提供者的标识符，例如"cls-a1cd23fa"。
     * @param ResourceProviderIdentifier 外部资源提供者的标识符，例如"cls-a1cd23fa"。
     */
    public void setResourceProviderIdentifier(String ResourceProviderIdentifier) {
        this.ResourceProviderIdentifier = ResourceProviderIdentifier;
    }

    /**
     * Get 外部资源提供者类型，例如"tke",当前仅支持"tke"。 
     * @return ResourceProviderType 外部资源提供者类型，例如"tke",当前仅支持"tke"。
     */
    public String getResourceProviderType() {
        return this.ResourceProviderType;
    }

    /**
     * Set 外部资源提供者类型，例如"tke",当前仅支持"tke"。
     * @param ResourceProviderType 外部资源提供者类型，例如"tke",当前仅支持"tke"。
     */
    public void setResourceProviderType(String ResourceProviderType) {
        this.ResourceProviderType = ResourceProviderType;
    }

    /**
     * Get 资源的用途，即节点类型，当前仅支持"TASK"。 
     * @return NodeType 资源的用途，即节点类型，当前仅支持"TASK"。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 资源的用途，即节点类型，当前仅支持"TASK"。
     * @param NodeType 资源的用途，即节点类型，当前仅支持"TASK"。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get CPU核数。 
     * @return Cpu CPU核数。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数。
     * @param Cpu CPU核数。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位为GB。 
     * @return Memory 内存大小，单位为GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位为GB。
     * @param Memory 内存大小，单位为GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。 
     * @return DataVolumes 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。
     */
    public String [] getDataVolumes() {
        return this.DataVolumes;
    }

    /**
     * Set 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。
     * @param DataVolumes 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。
     */
    public void setDataVolumes(String [] DataVolumes) {
        this.DataVolumes = DataVolumes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceProviderIdentifier", this.ResourceProviderIdentifier);
        this.setParamSimple(map, prefix + "ResourceProviderType", this.ResourceProviderType);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArraySimple(map, prefix + "DataVolumes.", this.DataVolumes);

    }
}

