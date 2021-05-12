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

public class ReplicaGroup extends AbstractModel{

    /**
    * 节点组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 节点组的名称，主节点为空
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 节点的可用区ID，比如ap-guangzhou-1
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 节点组类型，master为主节点，replica为副本节点
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 节点组节点列表
    */
    @SerializedName("RedisNodes")
    @Expose
    private RedisNode [] RedisNodes;

    /**
     * Get 节点组ID 
     * @return GroupId 节点组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 节点组ID
     * @param GroupId 节点组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 节点组的名称，主节点为空 
     * @return GroupName 节点组的名称，主节点为空
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 节点组的名称，主节点为空
     * @param GroupName 节点组的名称，主节点为空
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 节点的可用区ID，比如ap-guangzhou-1 
     * @return ZoneId 节点的可用区ID，比如ap-guangzhou-1
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 节点的可用区ID，比如ap-guangzhou-1
     * @param ZoneId 节点的可用区ID，比如ap-guangzhou-1
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 节点组类型，master为主节点，replica为副本节点 
     * @return Role 节点组类型，master为主节点，replica为副本节点
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 节点组类型，master为主节点，replica为副本节点
     * @param Role 节点组类型，master为主节点，replica为副本节点
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 节点组节点列表 
     * @return RedisNodes 节点组节点列表
     */
    public RedisNode [] getRedisNodes() {
        return this.RedisNodes;
    }

    /**
     * Set 节点组节点列表
     * @param RedisNodes 节点组节点列表
     */
    public void setRedisNodes(RedisNode [] RedisNodes) {
        this.RedisNodes = RedisNodes;
    }

    public ReplicaGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicaGroup(ReplicaGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.RedisNodes != null) {
            this.RedisNodes = new RedisNode[source.RedisNodes.length];
            for (int i = 0; i < source.RedisNodes.length; i++) {
                this.RedisNodes[i] = new RedisNode(source.RedisNodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamArrayObj(map, prefix + "RedisNodes.", this.RedisNodes);

    }
}

