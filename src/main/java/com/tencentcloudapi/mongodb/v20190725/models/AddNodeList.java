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

public class AddNodeList extends AbstractModel {

    /**
    * 需要新增的节点角色。
- SECONDARY：Mongod 节点。
- READONLY：只读节点。
- MONGOS：Mongos 节点。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 节点所对应的可用区。当前支持的可用区，请参见[地域和可用区](https://cloud.tencent.com/document/product/240/3637)。
- 单可用区，所有节点在同一可用区。
- 多可用区：当前标准规格是三可用区分布，主从节点不在同一可用区，需注意配置新增节点对应的可用区，且新增后必须满足任意2个可用区节点数大于第3个可用区原则。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 需要新增的节点角色。
- SECONDARY：Mongod 节点。
- READONLY：只读节点。
- MONGOS：Mongos 节点。 
     * @return Role 需要新增的节点角色。
- SECONDARY：Mongod 节点。
- READONLY：只读节点。
- MONGOS：Mongos 节点。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 需要新增的节点角色。
- SECONDARY：Mongod 节点。
- READONLY：只读节点。
- MONGOS：Mongos 节点。
     * @param Role 需要新增的节点角色。
- SECONDARY：Mongod 节点。
- READONLY：只读节点。
- MONGOS：Mongos 节点。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 节点所对应的可用区。当前支持的可用区，请参见[地域和可用区](https://cloud.tencent.com/document/product/240/3637)。
- 单可用区，所有节点在同一可用区。
- 多可用区：当前标准规格是三可用区分布，主从节点不在同一可用区，需注意配置新增节点对应的可用区，且新增后必须满足任意2个可用区节点数大于第3个可用区原则。 
     * @return Zone 节点所对应的可用区。当前支持的可用区，请参见[地域和可用区](https://cloud.tencent.com/document/product/240/3637)。
- 单可用区，所有节点在同一可用区。
- 多可用区：当前标准规格是三可用区分布，主从节点不在同一可用区，需注意配置新增节点对应的可用区，且新增后必须满足任意2个可用区节点数大于第3个可用区原则。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 节点所对应的可用区。当前支持的可用区，请参见[地域和可用区](https://cloud.tencent.com/document/product/240/3637)。
- 单可用区，所有节点在同一可用区。
- 多可用区：当前标准规格是三可用区分布，主从节点不在同一可用区，需注意配置新增节点对应的可用区，且新增后必须满足任意2个可用区节点数大于第3个可用区原则。
     * @param Zone 节点所对应的可用区。当前支持的可用区，请参见[地域和可用区](https://cloud.tencent.com/document/product/240/3637)。
- 单可用区，所有节点在同一可用区。
- 多可用区：当前标准规格是三可用区分布，主从节点不在同一可用区，需注意配置新增节点对应的可用区，且新增后必须满足任意2个可用区节点数大于第3个可用区原则。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public AddNodeList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddNodeList(AddNodeList source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

