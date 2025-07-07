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

public class DescribeClusterVirtualNodeRequest extends AbstractModel {

    /**
    * 集群ID，通过DescribeClusters接口获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点池ID，通过DescribeNodePools接口获取
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 节点名称，可搜索DescribeClusterVirtualNode接口节点
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

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
     * Get 节点池ID，通过DescribeNodePools接口获取 
     * @return NodePoolId 节点池ID，通过DescribeNodePools接口获取
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 节点池ID，通过DescribeNodePools接口获取
     * @param NodePoolId 节点池ID，通过DescribeNodePools接口获取
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 节点名称，可搜索DescribeClusterVirtualNode接口节点 
     * @return NodeNames 节点名称，可搜索DescribeClusterVirtualNode接口节点
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set 节点名称，可搜索DescribeClusterVirtualNode接口节点
     * @param NodeNames 节点名称，可搜索DescribeClusterVirtualNode接口节点
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    public DescribeClusterVirtualNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterVirtualNodeRequest(DescribeClusterVirtualNodeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);

    }
}

