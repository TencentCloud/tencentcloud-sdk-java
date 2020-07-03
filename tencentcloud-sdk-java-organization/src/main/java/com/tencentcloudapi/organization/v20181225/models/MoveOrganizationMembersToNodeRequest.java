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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoveOrganizationMembersToNodeRequest extends AbstractModel{

    /**
    * 组织单元ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 成员UIN列表
    */
    @SerializedName("Uins")
    @Expose
    private Long [] Uins;

    /**
     * Get 组织单元ID 
     * @return NodeId 组织单元ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 组织单元ID
     * @param NodeId 组织单元ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 成员UIN列表 
     * @return Uins 成员UIN列表
     */
    public Long [] getUins() {
        return this.Uins;
    }

    /**
     * Set 成员UIN列表
     * @param Uins 成员UIN列表
     */
    public void setUins(Long [] Uins) {
        this.Uins = Uins;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamArraySimple(map, prefix + "Uins.", this.Uins);

    }
}

