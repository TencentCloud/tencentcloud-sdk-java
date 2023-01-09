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

public class DeleteClusterVirtualNodeRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 虚拟节点列表
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * 是否强制删除：如果虚拟节点上有运行中Pod，则非强制删除状态下不会进行删除
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
     * Get 虚拟节点列表 
     * @return NodeNames 虚拟节点列表
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set 虚拟节点列表
     * @param NodeNames 虚拟节点列表
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get 是否强制删除：如果虚拟节点上有运行中Pod，则非强制删除状态下不会进行删除 
     * @return Force 是否强制删除：如果虚拟节点上有运行中Pod，则非强制删除状态下不会进行删除
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制删除：如果虚拟节点上有运行中Pod，则非强制删除状态下不会进行删除
     * @param Force 是否强制删除：如果虚拟节点上有运行中Pod，则非强制删除状态下不会进行删除
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public DeleteClusterVirtualNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterVirtualNodeRequest(DeleteClusterVirtualNodeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
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
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

