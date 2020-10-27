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

public class DeleteClusterNodePoolRequest extends AbstractModel{

    /**
    * 节点池对应的 ClusterId
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 需要删除的节点池 Id 列表
    */
    @SerializedName("NodePoolIds")
    @Expose
    private String [] NodePoolIds;

    /**
    * 删除节点池时是否保留节点池内节点(节点仍然会被移出集群，但对应的实例不会被销毁)
    */
    @SerializedName("KeepInstance")
    @Expose
    private Boolean KeepInstance;

    /**
     * Get 节点池对应的 ClusterId 
     * @return ClusterId 节点池对应的 ClusterId
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 节点池对应的 ClusterId
     * @param ClusterId 节点池对应的 ClusterId
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 需要删除的节点池 Id 列表 
     * @return NodePoolIds 需要删除的节点池 Id 列表
     */
    public String [] getNodePoolIds() {
        return this.NodePoolIds;
    }

    /**
     * Set 需要删除的节点池 Id 列表
     * @param NodePoolIds 需要删除的节点池 Id 列表
     */
    public void setNodePoolIds(String [] NodePoolIds) {
        this.NodePoolIds = NodePoolIds;
    }

    /**
     * Get 删除节点池时是否保留节点池内节点(节点仍然会被移出集群，但对应的实例不会被销毁) 
     * @return KeepInstance 删除节点池时是否保留节点池内节点(节点仍然会被移出集群，但对应的实例不会被销毁)
     */
    public Boolean getKeepInstance() {
        return this.KeepInstance;
    }

    /**
     * Set 删除节点池时是否保留节点池内节点(节点仍然会被移出集群，但对应的实例不会被销毁)
     * @param KeepInstance 删除节点池时是否保留节点池内节点(节点仍然会被移出集群，但对应的实例不会被销毁)
     */
    public void setKeepInstance(Boolean KeepInstance) {
        this.KeepInstance = KeepInstance;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "NodePoolIds.", this.NodePoolIds);
        this.setParamSimple(map, prefix + "KeepInstance", this.KeepInstance);

    }
}

