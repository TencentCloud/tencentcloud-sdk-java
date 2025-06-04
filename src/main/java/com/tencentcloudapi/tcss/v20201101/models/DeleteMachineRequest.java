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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMachineRequest extends AbstractModel {

    /**
    * 客户端Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 超级节点唯一id
    */
    @SerializedName("NodeUniqueIds")
    @Expose
    private String [] NodeUniqueIds;

    /**
    * uuid列表
    */
    @SerializedName("UUIDs")
    @Expose
    private String [] UUIDs;

    /**
     * Get 客户端Uuid 
     * @return Uuid 客户端Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 客户端Uuid
     * @param Uuid 客户端Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 超级节点唯一id 
     * @return NodeUniqueIds 超级节点唯一id
     */
    public String [] getNodeUniqueIds() {
        return this.NodeUniqueIds;
    }

    /**
     * Set 超级节点唯一id
     * @param NodeUniqueIds 超级节点唯一id
     */
    public void setNodeUniqueIds(String [] NodeUniqueIds) {
        this.NodeUniqueIds = NodeUniqueIds;
    }

    /**
     * Get uuid列表 
     * @return UUIDs uuid列表
     */
    public String [] getUUIDs() {
        return this.UUIDs;
    }

    /**
     * Set uuid列表
     * @param UUIDs uuid列表
     */
    public void setUUIDs(String [] UUIDs) {
        this.UUIDs = UUIDs;
    }

    public DeleteMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMachineRequest(DeleteMachineRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.NodeUniqueIds != null) {
            this.NodeUniqueIds = new String[source.NodeUniqueIds.length];
            for (int i = 0; i < source.NodeUniqueIds.length; i++) {
                this.NodeUniqueIds[i] = new String(source.NodeUniqueIds[i]);
            }
        }
        if (source.UUIDs != null) {
            this.UUIDs = new String[source.UUIDs.length];
            for (int i = 0; i < source.UUIDs.length; i++) {
                this.UUIDs[i] = new String(source.UUIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamArraySimple(map, prefix + "NodeUniqueIds.", this.NodeUniqueIds);
        this.setParamArraySimple(map, prefix + "UUIDs.", this.UUIDs);

    }
}

