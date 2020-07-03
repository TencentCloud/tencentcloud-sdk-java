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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNode extends AbstractModel{

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 节点详细信息
    */
    @SerializedName("InstanceClusterNode")
    @Expose
    private InstanceClusterNode [] InstanceClusterNode;

    /**
     * Get Id 
     * @return Id Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 节点详细信息 
     * @return InstanceClusterNode 节点详细信息
     */
    public InstanceClusterNode [] getInstanceClusterNode() {
        return this.InstanceClusterNode;
    }

    /**
     * Set 节点详细信息
     * @param InstanceClusterNode 节点详细信息
     */
    public void setInstanceClusterNode(InstanceClusterNode [] InstanceClusterNode) {
        this.InstanceClusterNode = InstanceClusterNode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "InstanceClusterNode.", this.InstanceClusterNode);

    }
}

