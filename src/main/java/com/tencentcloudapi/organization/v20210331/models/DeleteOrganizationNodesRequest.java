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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOrganizationNodesRequest extends AbstractModel{

    /**
    * 节点ID列表。
    */
    @SerializedName("NodeId")
    @Expose
    private Long [] NodeId;

    /**
     * Get 节点ID列表。 
     * @return NodeId 节点ID列表。
     */
    public Long [] getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID列表。
     * @param NodeId 节点ID列表。
     */
    public void setNodeId(Long [] NodeId) {
        this.NodeId = NodeId;
    }

    public DeleteOrganizationNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOrganizationNodesRequest(DeleteOrganizationNodesRequest source) {
        if (source.NodeId != null) {
            this.NodeId = new Long[source.NodeId.length];
            for (int i = 0; i < source.NodeId.length; i++) {
                this.NodeId[i] = new Long(source.NodeId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NodeId.", this.NodeId);

    }
}

