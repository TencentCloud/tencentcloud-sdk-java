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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeMainInfo extends AbstractModel {

    /**
    * 部门ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 部门名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get 部门ID 
     * @return NodeId 部门ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 部门ID
     * @param NodeId 部门ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 部门名称 
     * @return NodeName 部门名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 部门名称
     * @param NodeName 部门名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public NodeMainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeMainInfo(NodeMainInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

