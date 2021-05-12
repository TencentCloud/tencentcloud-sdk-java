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

public class GroupDetailForUser extends AbstractModel{

    /**
    * 组织名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 组织MSP Identity
    */
    @SerializedName("GroupMSPId")
    @Expose
    private String GroupMSPId;

    /**
     * Get 组织名称 
     * @return GroupName 组织名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 组织名称
     * @param GroupName 组织名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 组织MSP Identity 
     * @return GroupMSPId 组织MSP Identity
     */
    public String getGroupMSPId() {
        return this.GroupMSPId;
    }

    /**
     * Set 组织MSP Identity
     * @param GroupMSPId 组织MSP Identity
     */
    public void setGroupMSPId(String GroupMSPId) {
        this.GroupMSPId = GroupMSPId;
    }

    public GroupDetailForUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupDetailForUser(GroupDetailForUser source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupMSPId != null) {
            this.GroupMSPId = new String(source.GroupMSPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupMSPId", this.GroupMSPId);

    }
}

