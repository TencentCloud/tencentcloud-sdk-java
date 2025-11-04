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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterRuntimeConfigRequest extends AbstractModel {

    /**
    * 集群ID，必填
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 运行时版本需依据指定的Kubernetes版本进行设置。典型情况为，在升级过程中因版本冲突而需要调整运行时版本时。
    */
    @SerializedName("DstK8SVersion")
    @Expose
    private String DstK8SVersion;

    /**
    * 需要修改集群运行时填写
    */
    @SerializedName("ClusterRuntimeConfig")
    @Expose
    private RuntimeConfig ClusterRuntimeConfig;

    /**
    * 需要修改节点池运行时，填需要修改的部分
    */
    @SerializedName("NodePoolRuntimeConfig")
    @Expose
    private NodePoolRuntime [] NodePoolRuntimeConfig;

    /**
     * Get 集群ID，必填 
     * @return ClusterId 集群ID，必填
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，必填
     * @param ClusterId 集群ID，必填
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 运行时版本需依据指定的Kubernetes版本进行设置。典型情况为，在升级过程中因版本冲突而需要调整运行时版本时。 
     * @return DstK8SVersion 运行时版本需依据指定的Kubernetes版本进行设置。典型情况为，在升级过程中因版本冲突而需要调整运行时版本时。
     */
    public String getDstK8SVersion() {
        return this.DstK8SVersion;
    }

    /**
     * Set 运行时版本需依据指定的Kubernetes版本进行设置。典型情况为，在升级过程中因版本冲突而需要调整运行时版本时。
     * @param DstK8SVersion 运行时版本需依据指定的Kubernetes版本进行设置。典型情况为，在升级过程中因版本冲突而需要调整运行时版本时。
     */
    public void setDstK8SVersion(String DstK8SVersion) {
        this.DstK8SVersion = DstK8SVersion;
    }

    /**
     * Get 需要修改集群运行时填写 
     * @return ClusterRuntimeConfig 需要修改集群运行时填写
     */
    public RuntimeConfig getClusterRuntimeConfig() {
        return this.ClusterRuntimeConfig;
    }

    /**
     * Set 需要修改集群运行时填写
     * @param ClusterRuntimeConfig 需要修改集群运行时填写
     */
    public void setClusterRuntimeConfig(RuntimeConfig ClusterRuntimeConfig) {
        this.ClusterRuntimeConfig = ClusterRuntimeConfig;
    }

    /**
     * Get 需要修改节点池运行时，填需要修改的部分 
     * @return NodePoolRuntimeConfig 需要修改节点池运行时，填需要修改的部分
     */
    public NodePoolRuntime [] getNodePoolRuntimeConfig() {
        return this.NodePoolRuntimeConfig;
    }

    /**
     * Set 需要修改节点池运行时，填需要修改的部分
     * @param NodePoolRuntimeConfig 需要修改节点池运行时，填需要修改的部分
     */
    public void setNodePoolRuntimeConfig(NodePoolRuntime [] NodePoolRuntimeConfig) {
        this.NodePoolRuntimeConfig = NodePoolRuntimeConfig;
    }

    public ModifyClusterRuntimeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterRuntimeConfigRequest(ModifyClusterRuntimeConfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DstK8SVersion != null) {
            this.DstK8SVersion = new String(source.DstK8SVersion);
        }
        if (source.ClusterRuntimeConfig != null) {
            this.ClusterRuntimeConfig = new RuntimeConfig(source.ClusterRuntimeConfig);
        }
        if (source.NodePoolRuntimeConfig != null) {
            this.NodePoolRuntimeConfig = new NodePoolRuntime[source.NodePoolRuntimeConfig.length];
            for (int i = 0; i < source.NodePoolRuntimeConfig.length; i++) {
                this.NodePoolRuntimeConfig[i] = new NodePoolRuntime(source.NodePoolRuntimeConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DstK8SVersion", this.DstK8SVersion);
        this.setParamObj(map, prefix + "ClusterRuntimeConfig.", this.ClusterRuntimeConfig);
        this.setParamArrayObj(map, prefix + "NodePoolRuntimeConfig.", this.NodePoolRuntimeConfig);

    }
}

