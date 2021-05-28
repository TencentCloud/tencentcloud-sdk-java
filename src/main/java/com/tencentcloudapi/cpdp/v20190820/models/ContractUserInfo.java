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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContractUserInfo extends AbstractModel{

    /**
    * USER_ID: 用户ID
ANONYMOUS: 匿名类型用户ID
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 用户类型
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get USER_ID: 用户ID
ANONYMOUS: 匿名类型用户ID 
     * @return UserType USER_ID: 用户ID
ANONYMOUS: 匿名类型用户ID
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set USER_ID: 用户ID
ANONYMOUS: 匿名类型用户ID
     * @param UserType USER_ID: 用户ID
ANONYMOUS: 匿名类型用户ID
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 用户类型 
     * @return UserId 用户类型
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户类型
     * @param UserId 用户类型
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public ContractUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractUserInfo(ContractUserInfo source) {
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

