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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetAccountUserPrivilegeRequest extends AbstractModel {

    /**
    * 指定待设置账号的实例ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设置访问实例的账号名称。设置要求为：字母开头的1-64个字符，只可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 设置权限信息。
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
     * Get 指定待设置账号的实例ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 指定待设置账号的实例ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定待设置账号的实例ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 指定待设置账号的实例ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 设置访问实例的账号名称。设置要求为：字母开头的1-64个字符，只可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。 
     * @return UserName 设置访问实例的账号名称。设置要求为：字母开头的1-64个字符，只可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 设置访问实例的账号名称。设置要求为：字母开头的1-64个字符，只可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。
     * @param UserName 设置访问实例的账号名称。设置要求为：字母开头的1-64个字符，只可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 设置权限信息。 
     * @return AuthRole 设置权限信息。
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set 设置权限信息。
     * @param AuthRole 设置权限信息。
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    public SetAccountUserPrivilegeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetAccountUserPrivilegeRequest(SetAccountUserPrivilegeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AuthRole != null) {
            this.AuthRole = new Auth[source.AuthRole.length];
            for (int i = 0; i < source.AuthRole.length; i++) {
                this.AuthRole[i] = new Auth(source.AuthRole[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);

    }
}

