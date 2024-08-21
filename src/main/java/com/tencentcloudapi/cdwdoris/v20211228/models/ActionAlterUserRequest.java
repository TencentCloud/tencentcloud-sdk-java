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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionAlterUserRequest extends AbstractModel {

    /**
    * 用户信息
    */
    @SerializedName("UserInfo")
    @Expose
    private UserInfo UserInfo;

    /**
    * api接口类型
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * 用户权限类型 0:普通用户 1:管理员
    */
    @SerializedName("UserPrivilege")
    @Expose
    private Long UserPrivilege;

    /**
     * Get 用户信息 
     * @return UserInfo 用户信息
     */
    public UserInfo getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 用户信息
     * @param UserInfo 用户信息
     */
    public void setUserInfo(UserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get api接口类型 
     * @return ApiType api接口类型
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set api接口类型
     * @param ApiType api接口类型
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get 用户权限类型 0:普通用户 1:管理员 
     * @return UserPrivilege 用户权限类型 0:普通用户 1:管理员
     */
    public Long getUserPrivilege() {
        return this.UserPrivilege;
    }

    /**
     * Set 用户权限类型 0:普通用户 1:管理员
     * @param UserPrivilege 用户权限类型 0:普通用户 1:管理员
     */
    public void setUserPrivilege(Long UserPrivilege) {
        this.UserPrivilege = UserPrivilege;
    }

    public ActionAlterUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionAlterUserRequest(ActionAlterUserRequest source) {
        if (source.UserInfo != null) {
            this.UserInfo = new UserInfo(source.UserInfo);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.UserPrivilege != null) {
            this.UserPrivilege = new Long(source.UserPrivilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "UserPrivilege", this.UserPrivilege);

    }
}

