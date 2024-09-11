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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckPolicyBinding extends AbstractModel {

    /**
    * 健康检测策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 关联节点池数组
    */
    @SerializedName("NodePools")
    @Expose
    private String [] NodePools;

    /**
     * Get 健康检测策略名称 
     * @return Name 健康检测策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 健康检测策略名称
     * @param Name 健康检测策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则创建时间 
     * @return CreatedAt 规则创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 规则创建时间
     * @param CreatedAt 规则创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 关联节点池数组 
     * @return NodePools 关联节点池数组
     */
    public String [] getNodePools() {
        return this.NodePools;
    }

    /**
     * Set 关联节点池数组
     * @param NodePools 关联节点池数组
     */
    public void setNodePools(String [] NodePools) {
        this.NodePools = NodePools;
    }

    public HealthCheckPolicyBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckPolicyBinding(HealthCheckPolicyBinding source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.NodePools != null) {
            this.NodePools = new String[source.NodePools.length];
            for (int i = 0; i < source.NodePools.length; i++) {
                this.NodePools[i] = new String(source.NodePools[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamArraySimple(map, prefix + "NodePools.", this.NodePools);

    }
}

