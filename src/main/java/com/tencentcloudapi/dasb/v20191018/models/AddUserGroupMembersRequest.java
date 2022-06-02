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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUserGroupMembersRequest extends AbstractModel{

    /**
    * 用户组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 成员用户ID集合
    */
    @SerializedName("MemberIdSet")
    @Expose
    private Long [] MemberIdSet;

    /**
     * Get 用户组ID 
     * @return Id 用户组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 用户组ID
     * @param Id 用户组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 成员用户ID集合 
     * @return MemberIdSet 成员用户ID集合
     */
    public Long [] getMemberIdSet() {
        return this.MemberIdSet;
    }

    /**
     * Set 成员用户ID集合
     * @param MemberIdSet 成员用户ID集合
     */
    public void setMemberIdSet(Long [] MemberIdSet) {
        this.MemberIdSet = MemberIdSet;
    }

    public AddUserGroupMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUserGroupMembersRequest(AddUserGroupMembersRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MemberIdSet != null) {
            this.MemberIdSet = new Long[source.MemberIdSet.length];
            for (int i = 0; i < source.MemberIdSet.length; i++) {
                this.MemberIdSet[i] = new Long(source.MemberIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "MemberIdSet.", this.MemberIdSet);

    }
}

