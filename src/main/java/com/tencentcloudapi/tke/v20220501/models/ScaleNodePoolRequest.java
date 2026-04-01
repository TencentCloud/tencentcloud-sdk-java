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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleNodePoolRequest extends AbstractModel {

    /**
    * <p>集群 ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>节点池 ID</p>
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * <p>期望节点数</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
     * Get <p>集群 ID</p> 
     * @return ClusterId <p>集群 ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID</p>
     * @param ClusterId <p>集群 ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>节点池 ID</p> 
     * @return NodePoolId <p>节点池 ID</p>
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set <p>节点池 ID</p>
     * @param NodePoolId <p>节点池 ID</p>
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get <p>期望节点数</p> 
     * @return Replicas <p>期望节点数</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>期望节点数</p>
     * @param Replicas <p>期望节点数</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    public ScaleNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleNodePoolRequest(ScaleNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);

    }
}

