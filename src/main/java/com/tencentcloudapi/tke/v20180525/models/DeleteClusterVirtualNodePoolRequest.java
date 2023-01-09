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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteClusterVirtualNodePoolRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 虚拟节点池ID列表
    */
    @SerializedName("NodePoolIds")
    @Expose
    private String [] NodePoolIds;

    /**
    * 是否强制删除，在虚拟节点上有pod的情况下，如果选择非强制删除，则删除会失败
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 虚拟节点池ID列表 
     * @return NodePoolIds 虚拟节点池ID列表
     */
    public String [] getNodePoolIds() {
        return this.NodePoolIds;
    }

    /**
     * Set 虚拟节点池ID列表
     * @param NodePoolIds 虚拟节点池ID列表
     */
    public void setNodePoolIds(String [] NodePoolIds) {
        this.NodePoolIds = NodePoolIds;
    }

    /**
     * Get 是否强制删除，在虚拟节点上有pod的情况下，如果选择非强制删除，则删除会失败 
     * @return Force 是否强制删除，在虚拟节点上有pod的情况下，如果选择非强制删除，则删除会失败
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制删除，在虚拟节点上有pod的情况下，如果选择非强制删除，则删除会失败
     * @param Force 是否强制删除，在虚拟节点上有pod的情况下，如果选择非强制删除，则删除会失败
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public DeleteClusterVirtualNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterVirtualNodePoolRequest(DeleteClusterVirtualNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolIds != null) {
            this.NodePoolIds = new String[source.NodePoolIds.length];
            for (int i = 0; i < source.NodePoolIds.length; i++) {
                this.NodePoolIds[i] = new String(source.NodePoolIds[i]);
            }
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "NodePoolIds.", this.NodePoolIds);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

