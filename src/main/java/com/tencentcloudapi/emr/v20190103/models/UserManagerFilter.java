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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserManagerFilter extends AbstractModel {

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户来源
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 组名
    */
    @SerializedName("Groups")
    @Expose
    private String Groups;

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户来源 
     * @return UserType 用户来源
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户来源
     * @param UserType 用户来源
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 组名 
     * @return Groups 组名
     */
    public String getGroups() {
        return this.Groups;
    }

    /**
     * Set 组名
     * @param Groups 组名
     */
    public void setGroups(String Groups) {
        this.Groups = Groups;
    }

    public UserManagerFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserManagerFilter(UserManagerFilter source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.Groups != null) {
            this.Groups = new String(source.Groups);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "Groups", this.Groups);

    }
}

