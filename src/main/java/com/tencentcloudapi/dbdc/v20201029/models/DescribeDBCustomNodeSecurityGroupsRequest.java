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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBCustomNodeSecurityGroupsRequest extends AbstractModel {

    /**
    * <p>节点id</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
     * Get <p>节点id</p> 
     * @return NodeId <p>节点id</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点id</p>
     * @param NodeId <p>节点id</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    public DescribeDBCustomNodeSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBCustomNodeSecurityGroupsRequest(DescribeDBCustomNodeSecurityGroupsRequest source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

