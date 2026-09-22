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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentRoutingRequest extends AbstractModel {

    /**
    * Agent 业务 ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 路由配置，覆盖式写入（与出参 AgentInfo.RoutingSet 命名对齐）
    */
    @SerializedName("RoutingSet")
    @Expose
    private RoutingItem [] RoutingSet;

    /**
     * Get Agent 业务 ID 
     * @return AgentId Agent 业务 ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent 业务 ID
     * @param AgentId Agent 业务 ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 路由配置，覆盖式写入（与出参 AgentInfo.RoutingSet 命名对齐） 
     * @return RoutingSet 路由配置，覆盖式写入（与出参 AgentInfo.RoutingSet 命名对齐）
     */
    public RoutingItem [] getRoutingSet() {
        return this.RoutingSet;
    }

    /**
     * Set 路由配置，覆盖式写入（与出参 AgentInfo.RoutingSet 命名对齐）
     * @param RoutingSet 路由配置，覆盖式写入（与出参 AgentInfo.RoutingSet 命名对齐）
     */
    public void setRoutingSet(RoutingItem [] RoutingSet) {
        this.RoutingSet = RoutingSet;
    }

    public ModifyAgentRoutingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentRoutingRequest(ModifyAgentRoutingRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.RoutingSet != null) {
            this.RoutingSet = new RoutingItem[source.RoutingSet.length];
            for (int i = 0; i < source.RoutingSet.length; i++) {
                this.RoutingSet[i] = new RoutingItem(source.RoutingSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamArrayObj(map, prefix + "RoutingSet.", this.RoutingSet);

    }
}

