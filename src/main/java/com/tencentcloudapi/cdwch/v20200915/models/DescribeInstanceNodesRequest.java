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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceNodesRequest extends AbstractModel {

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群角色类型，“DATA” 为数据节点、“COMMON” 为 ZooKeeper 节点，默认为 "DATA" 数据节点。
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * 分页参数，第一页为0，第二页为10
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数，分页步长，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 展现策略，All时显示所有
    */
    @SerializedName("DisplayPolicy")
    @Expose
    private String DisplayPolicy;

    /**
    * 当true的时候返回所有节点，即Limit无限大
    */
    @SerializedName("ForceAll")
    @Expose
    private Boolean ForceAll;

    /**
     * Get 集群实例ID 
     * @return InstanceId 集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID
     * @param InstanceId 集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群角色类型，“DATA” 为数据节点、“COMMON” 为 ZooKeeper 节点，默认为 "DATA" 数据节点。 
     * @return NodeRole 集群角色类型，“DATA” 为数据节点、“COMMON” 为 ZooKeeper 节点，默认为 "DATA" 数据节点。
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set 集群角色类型，“DATA” 为数据节点、“COMMON” 为 ZooKeeper 节点，默认为 "DATA" 数据节点。
     * @param NodeRole 集群角色类型，“DATA” 为数据节点、“COMMON” 为 ZooKeeper 节点，默认为 "DATA" 数据节点。
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get 分页参数，第一页为0，第二页为10 
     * @return Offset 分页参数，第一页为0，第二页为10
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，第一页为0，第二页为10
     * @param Offset 分页参数，第一页为0，第二页为10
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数，分页步长，默认为10 
     * @return Limit 分页参数，分页步长，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，分页步长，默认为10
     * @param Limit 分页参数，分页步长，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 展现策略，All时显示所有 
     * @return DisplayPolicy 展现策略，All时显示所有
     */
    public String getDisplayPolicy() {
        return this.DisplayPolicy;
    }

    /**
     * Set 展现策略，All时显示所有
     * @param DisplayPolicy 展现策略，All时显示所有
     */
    public void setDisplayPolicy(String DisplayPolicy) {
        this.DisplayPolicy = DisplayPolicy;
    }

    /**
     * Get 当true的时候返回所有节点，即Limit无限大 
     * @return ForceAll 当true的时候返回所有节点，即Limit无限大
     */
    public Boolean getForceAll() {
        return this.ForceAll;
    }

    /**
     * Set 当true的时候返回所有节点，即Limit无限大
     * @param ForceAll 当true的时候返回所有节点，即Limit无限大
     */
    public void setForceAll(Boolean ForceAll) {
        this.ForceAll = ForceAll;
    }

    public DescribeInstanceNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceNodesRequest(DescribeInstanceNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DisplayPolicy != null) {
            this.DisplayPolicy = new String(source.DisplayPolicy);
        }
        if (source.ForceAll != null) {
            this.ForceAll = new Boolean(source.ForceAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DisplayPolicy", this.DisplayPolicy);
        this.setParamSimple(map, prefix + "ForceAll", this.ForceAll);

    }
}

