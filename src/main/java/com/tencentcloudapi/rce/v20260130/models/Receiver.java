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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Receiver extends AbstractModel {

    /**
    * <p>接收者账号ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>接收者账号信息</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * <p>接收者角色信息</p>
    */
    @SerializedName("RoleInfo")
    @Expose
    private Role RoleInfo;

    /**
     * Get <p>接收者账号ID</p> 
     * @return UserId <p>接收者账号ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>接收者账号ID</p>
     * @param UserId <p>接收者账号ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>接收者账号信息</p> 
     * @return UserInfo <p>接收者账号信息</p>
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>接收者账号信息</p>
     * @param UserInfo <p>接收者账号信息</p>
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>接收者角色信息</p> 
     * @return RoleInfo <p>接收者角色信息</p>
     */
    public Role getRoleInfo() {
        return this.RoleInfo;
    }

    /**
     * Set <p>接收者角色信息</p>
     * @param RoleInfo <p>接收者角色信息</p>
     */
    public void setRoleInfo(Role RoleInfo) {
        this.RoleInfo = RoleInfo;
    }

    public Receiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Receiver(Receiver source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.RoleInfo != null) {
            this.RoleInfo = new Role(source.RoleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "RoleInfo.", this.RoleInfo);

    }
}

