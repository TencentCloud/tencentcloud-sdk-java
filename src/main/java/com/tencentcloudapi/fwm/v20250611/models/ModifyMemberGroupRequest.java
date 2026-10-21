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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMemberGroupRequest extends AbstractModel {

    /**
    * 目标成员 AppId
    */
    @SerializedName("UserMemberId")
    @Expose
    private String UserMemberId;

    /**
    * 账户组ID（空字符串表示移出账户组）
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 目标成员 AppId 
     * @return UserMemberId 目标成员 AppId
     */
    public String getUserMemberId() {
        return this.UserMemberId;
    }

    /**
     * Set 目标成员 AppId
     * @param UserMemberId 目标成员 AppId
     */
    public void setUserMemberId(String UserMemberId) {
        this.UserMemberId = UserMemberId;
    }

    /**
     * Get 账户组ID（空字符串表示移出账户组） 
     * @return GroupId 账户组ID（空字符串表示移出账户组）
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 账户组ID（空字符串表示移出账户组）
     * @param GroupId 账户组ID（空字符串表示移出账户组）
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public ModifyMemberGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMemberGroupRequest(ModifyMemberGroupRequest source) {
        if (source.UserMemberId != null) {
            this.UserMemberId = new String(source.UserMemberId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserMemberId", this.UserMemberId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

