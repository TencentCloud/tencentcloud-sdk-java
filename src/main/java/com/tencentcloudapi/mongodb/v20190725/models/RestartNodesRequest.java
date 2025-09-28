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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartNodesRequest extends AbstractModel {

    /**
    * 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要重启的节点 ID 列表。
- 支持重启的节点类型包含：mongod节点、只读节点、mongos节点。
- 节点 ID，请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在**节点管理**页面复制，或者通过 [DescribeDBInstanceNodeProperty ](https://cloud.tencent.com/document/product/240/82022)接口获取。
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
     * Get 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要重启的节点 ID 列表。
- 支持重启的节点类型包含：mongod节点、只读节点、mongos节点。
- 节点 ID，请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在**节点管理**页面复制，或者通过 [DescribeDBInstanceNodeProperty ](https://cloud.tencent.com/document/product/240/82022)接口获取。 
     * @return NodeIds 需要重启的节点 ID 列表。
- 支持重启的节点类型包含：mongod节点、只读节点、mongos节点。
- 节点 ID，请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在**节点管理**页面复制，或者通过 [DescribeDBInstanceNodeProperty ](https://cloud.tencent.com/document/product/240/82022)接口获取。
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set 需要重启的节点 ID 列表。
- 支持重启的节点类型包含：mongod节点、只读节点、mongos节点。
- 节点 ID，请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在**节点管理**页面复制，或者通过 [DescribeDBInstanceNodeProperty ](https://cloud.tencent.com/document/product/240/82022)接口获取。
     * @param NodeIds 需要重启的节点 ID 列表。
- 支持重启的节点类型包含：mongod节点、只读节点、mongos节点。
- 节点 ID，请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在**节点管理**页面复制，或者通过 [DescribeDBInstanceNodeProperty ](https://cloud.tencent.com/document/product/240/82022)接口获取。
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    public RestartNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartNodesRequest(RestartNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);

    }
}

