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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分片变量名称
    */
    @SerializedName("ShardName")
    @Expose
    private String ShardName;

    /**
    * 副本变量名称
    */
    @SerializedName("ReplicaName")
    @Expose
    private String ReplicaName;

    /**
     * Get 分组名称 
     * @return GroupName 分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
     * @param GroupName 分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 分片变量名称 
     * @return ShardName 分片变量名称
     */
    public String getShardName() {
        return this.ShardName;
    }

    /**
     * Set 分片变量名称
     * @param ShardName 分片变量名称
     */
    public void setShardName(String ShardName) {
        this.ShardName = ShardName;
    }

    /**
     * Get 副本变量名称 
     * @return ReplicaName 副本变量名称
     */
    public String getReplicaName() {
        return this.ReplicaName;
    }

    /**
     * Set 副本变量名称
     * @param ReplicaName 副本变量名称
     */
    public void setReplicaName(String ReplicaName) {
        this.ReplicaName = ReplicaName;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ShardName != null) {
            this.ShardName = new String(source.ShardName);
        }
        if (source.ReplicaName != null) {
            this.ReplicaName = new String(source.ReplicaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ShardName", this.ShardName);
        this.setParamSimple(map, prefix + "ReplicaName", this.ReplicaName);

    }
}

