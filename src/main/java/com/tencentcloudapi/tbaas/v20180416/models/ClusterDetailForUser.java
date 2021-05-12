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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterDetailForUser extends AbstractModel{

    /**
    * 网络ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 组织列表
    */
    @SerializedName("GroupList")
    @Expose
    private GroupDetailForUser [] GroupList;

    /**
    * 网络名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get 网络ID 
     * @return ClusterId 网络ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID
     * @param ClusterId 网络ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 组织列表 
     * @return GroupList 组织列表
     */
    public GroupDetailForUser [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set 组织列表
     * @param GroupList 组织列表
     */
    public void setGroupList(GroupDetailForUser [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Get 网络名称 
     * @return ClusterName 网络名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 网络名称
     * @param ClusterName 网络名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public ClusterDetailForUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterDetailForUser(ClusterDetailForUser source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupList != null) {
            this.GroupList = new GroupDetailForUser[source.GroupList.length];
            for (int i = 0; i < source.GroupList.length; i++) {
                this.GroupList[i] = new GroupDetailForUser(source.GroupList[i]);
            }
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

