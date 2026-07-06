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

public class AccountGroupInfo extends AbstractModel {

    /**
    * 账户组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 账户组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 账户组ID 
     * @return GroupId 账户组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 账户组ID
     * @param GroupId 账户组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 账户组名称 
     * @return GroupName 账户组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 账户组名称
     * @param GroupName 账户组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public AccountGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountGroupInfo(AccountGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

