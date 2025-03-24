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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserResponse extends AbstractModel {

    /**
    * 符合条件的用户列表
    */
    @SerializedName("Users")
    @Expose
    private User [] Users;

    /**
    * 符合条件的总用户数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 符合条件的用户列表 
     * @return Users 符合条件的用户列表
     */
    public User [] getUsers() {
        return this.Users;
    }

    /**
     * Set 符合条件的用户列表
     * @param Users 符合条件的用户列表
     */
    public void setUsers(User [] Users) {
        this.Users = Users;
    }

    /**
     * Get 符合条件的总用户数 
     * @return TotalCount 符合条件的总用户数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的总用户数
     * @param TotalCount 符合条件的总用户数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public UserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserResponse(UserResponse source) {
        if (source.Users != null) {
            this.Users = new User[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new User(source.Users[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

