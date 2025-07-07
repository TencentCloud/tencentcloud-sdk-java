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

public class CreateClusterVirtualNodeRequest extends AbstractModel {

    /**
    * 集群ID，通过DescribeClusters接口获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 虚拟节点所属节点池，通过DescribeNodePools接口获取
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 虚拟节点所属子网，SubnetId、SubnetIds、VirtualNodes必选一个。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 虚拟节点子网ID列表，SubnetId、SubnetIds、VirtualNodes必选一个。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 虚拟节点列表，SubnetId、SubnetIds、VirtualNodes必选一个。
    */
    @SerializedName("VirtualNodes")
    @Expose
    private VirtualNodeSpec [] VirtualNodes;

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
     * Get 虚拟节点所属节点池，通过DescribeNodePools接口获取 
     * @return NodePoolId 虚拟节点所属节点池，通过DescribeNodePools接口获取
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 虚拟节点所属节点池，通过DescribeNodePools接口获取
     * @param NodePoolId 虚拟节点所属节点池，通过DescribeNodePools接口获取
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 虚拟节点所属子网，SubnetId、SubnetIds、VirtualNodes必选一个。 
     * @return SubnetId 虚拟节点所属子网，SubnetId、SubnetIds、VirtualNodes必选一个。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 虚拟节点所属子网，SubnetId、SubnetIds、VirtualNodes必选一个。
     * @param SubnetId 虚拟节点所属子网，SubnetId、SubnetIds、VirtualNodes必选一个。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 虚拟节点子网ID列表，SubnetId、SubnetIds、VirtualNodes必选一个。 
     * @return SubnetIds 虚拟节点子网ID列表，SubnetId、SubnetIds、VirtualNodes必选一个。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 虚拟节点子网ID列表，SubnetId、SubnetIds、VirtualNodes必选一个。
     * @param SubnetIds 虚拟节点子网ID列表，SubnetId、SubnetIds、VirtualNodes必选一个。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 虚拟节点列表，SubnetId、SubnetIds、VirtualNodes必选一个。 
     * @return VirtualNodes 虚拟节点列表，SubnetId、SubnetIds、VirtualNodes必选一个。
     */
    public VirtualNodeSpec [] getVirtualNodes() {
        return this.VirtualNodes;
    }

    /**
     * Set 虚拟节点列表，SubnetId、SubnetIds、VirtualNodes必选一个。
     * @param VirtualNodes 虚拟节点列表，SubnetId、SubnetIds、VirtualNodes必选一个。
     */
    public void setVirtualNodes(VirtualNodeSpec [] VirtualNodes) {
        this.VirtualNodes = VirtualNodes;
    }

    public CreateClusterVirtualNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterVirtualNodeRequest(CreateClusterVirtualNodeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.VirtualNodes != null) {
            this.VirtualNodes = new VirtualNodeSpec[source.VirtualNodes.length];
            for (int i = 0; i < source.VirtualNodes.length; i++) {
                this.VirtualNodes[i] = new VirtualNodeSpec(source.VirtualNodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArrayObj(map, prefix + "VirtualNodes.", this.VirtualNodes);

    }
}

