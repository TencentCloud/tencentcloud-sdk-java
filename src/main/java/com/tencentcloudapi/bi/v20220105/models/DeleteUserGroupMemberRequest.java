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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUserGroupMemberRequest extends AbstractModel {

    /**
    * 用户组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 用户id集合
    */
    @SerializedName("UserIdList")
    @Expose
    private String [] UserIdList;

    /**
     * Get 用户组id 
     * @return GroupId 用户组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 用户组id
     * @param GroupId 用户组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 用户id集合 
     * @return UserIdList 用户id集合
     */
    public String [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户id集合
     * @param UserIdList 用户id集合
     */
    public void setUserIdList(String [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    public DeleteUserGroupMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUserGroupMemberRequest(DeleteUserGroupMemberRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.UserIdList != null) {
            this.UserIdList = new String[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new String(source.UserIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "UserIdList.", this.UserIdList);

    }
}

