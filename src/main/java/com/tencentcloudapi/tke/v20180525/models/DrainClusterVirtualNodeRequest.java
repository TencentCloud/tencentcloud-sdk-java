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

public class DrainClusterVirtualNodeRequest extends AbstractModel {

    /**
    * 集群ID，通过DescribeClusters接口获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点ID
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get 集群ID，通过DescribeClusters接口获取 
     * @return ClusterId 集群ID，通过DescribeClusters接口获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，通过DescribeClusters接口获取
     * @param ClusterId 集群ID，通过DescribeClusters接口获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点ID 
     * @return NodeName 节点ID
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点ID
     * @param NodeName 节点ID
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public DrainClusterVirtualNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrainClusterVirtualNodeRequest(DrainClusterVirtualNodeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

