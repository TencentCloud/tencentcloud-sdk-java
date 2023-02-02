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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchRegisterRequest extends AbstractModel{

    /**
    * 批量注册用户信息列表
    */
    @SerializedName("Users")
    @Expose
    private BatchUserRequest [] Users;

    /**
     * Get 批量注册用户信息列表 
     * @return Users 批量注册用户信息列表
     */
    public BatchUserRequest [] getUsers() {
        return this.Users;
    }

    /**
     * Set 批量注册用户信息列表
     * @param Users 批量注册用户信息列表
     */
    public void setUsers(BatchUserRequest [] Users) {
        this.Users = Users;
    }

    public BatchRegisterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchRegisterRequest(BatchRegisterRequest source) {
        if (source.Users != null) {
            this.Users = new BatchUserRequest[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new BatchUserRequest(source.Users[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Users.", this.Users);

    }
}

