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

public class DescribeCloudNativeAPIGatewayNodesResult extends AbstractModel{

    /**
    * 获取云原生API网关节点列表响应结果。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 云原生API网关节点列表。
    */
    @SerializedName("NodeList")
    @Expose
    private CloudNativeAPIGatewayNode [] NodeList;

    /**
     * Get 获取云原生API网关节点列表响应结果。 
     * @return TotalCount 获取云原生API网关节点列表响应结果。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 获取云原生API网关节点列表响应结果。
     * @param TotalCount 获取云原生API网关节点列表响应结果。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 云原生API网关节点列表。 
     * @return NodeList 云原生API网关节点列表。
     */
    public CloudNativeAPIGatewayNode [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set 云原生API网关节点列表。
     * @param NodeList 云原生API网关节点列表。
     */
    public void setNodeList(CloudNativeAPIGatewayNode [] NodeList) {
        this.NodeList = NodeList;
    }

    public DescribeCloudNativeAPIGatewayNodesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayNodesResult(DescribeCloudNativeAPIGatewayNodesResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.NodeList != null) {
            this.NodeList = new CloudNativeAPIGatewayNode[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new CloudNativeAPIGatewayNode(source.NodeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "NodeList.", this.NodeList);

    }
}

