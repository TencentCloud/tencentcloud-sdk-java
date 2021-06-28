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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserGroupRequest extends AbstractModel{

    /**
    * 用户组ID，是用户组的全局唯一标识。
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
     * Get 用户组ID，是用户组的全局唯一标识。 
     * @return UserGroupId 用户组ID，是用户组的全局唯一标识。
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 用户组ID，是用户组的全局唯一标识。
     * @param UserGroupId 用户组ID，是用户组的全局唯一标识。
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    public DescribeUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserGroupRequest(DescribeUserGroupRequest source) {
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);

    }
}

