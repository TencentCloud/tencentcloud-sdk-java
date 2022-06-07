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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUsersForUserManagerRequest extends AbstractModel{

    /**
    * 集群字符串ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户信息列表
    */
    @SerializedName("UserManagerUserList")
    @Expose
    private UserInfoForUserManager [] UserManagerUserList;

    /**
     * Get 集群字符串ID 
     * @return InstanceId 集群字符串ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群字符串ID
     * @param InstanceId 集群字符串ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户信息列表 
     * @return UserManagerUserList 用户信息列表
     */
    public UserInfoForUserManager [] getUserManagerUserList() {
        return this.UserManagerUserList;
    }

    /**
     * Set 用户信息列表
     * @param UserManagerUserList 用户信息列表
     */
    public void setUserManagerUserList(UserInfoForUserManager [] UserManagerUserList) {
        this.UserManagerUserList = UserManagerUserList;
    }

    public AddUsersForUserManagerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUsersForUserManagerRequest(AddUsersForUserManagerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserManagerUserList != null) {
            this.UserManagerUserList = new UserInfoForUserManager[source.UserManagerUserList.length];
            for (int i = 0; i < source.UserManagerUserList.length; i++) {
                this.UserManagerUserList[i] = new UserInfoForUserManager(source.UserManagerUserList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "UserManagerUserList.", this.UserManagerUserList);

    }
}

