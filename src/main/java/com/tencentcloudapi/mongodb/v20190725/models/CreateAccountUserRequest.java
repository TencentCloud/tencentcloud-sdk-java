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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountUserRequest extends AbstractModel{

    /**
    * 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 新账号名称。其格式要求如下：<ul><li>字符范围[1,32]。</li><li>可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。</li></ul>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 新账号密码。密码复杂度要求如下：<ul><li>字符长度范围[8,32]。</li><li>至少包含字母、数字和特殊字符（叹号“!”、at"@"、井号“#”、百分号“%”、插入符“^”、星号“*”、小括号“()”、下划线“_”）中的两种。</li></ul>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * mongouser 账号对应的密码。mongouser 为系统默认账号，即为创建实例时，设置的密码。
    */
    @SerializedName("MongoUserPassword")
    @Expose
    private String MongoUserPassword;

    /**
    * 账号备注信息。
    */
    @SerializedName("UserDesc")
    @Expose
    private String UserDesc;

    /**
    * 账号的读写权限信息。
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
     * Get 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 新账号名称。其格式要求如下：<ul><li>字符范围[1,32]。</li><li>可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。</li></ul> 
     * @return UserName 新账号名称。其格式要求如下：<ul><li>字符范围[1,32]。</li><li>可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。</li></ul>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 新账号名称。其格式要求如下：<ul><li>字符范围[1,32]。</li><li>可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。</li></ul>
     * @param UserName 新账号名称。其格式要求如下：<ul><li>字符范围[1,32]。</li><li>可输入[A,Z]、[a,z]、[1,9]范围的字符以及下划线“_”与短划线“-”。</li></ul>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 新账号密码。密码复杂度要求如下：<ul><li>字符长度范围[8,32]。</li><li>至少包含字母、数字和特殊字符（叹号“!”、at"@"、井号“#”、百分号“%”、插入符“^”、星号“*”、小括号“()”、下划线“_”）中的两种。</li></ul> 
     * @return Password 新账号密码。密码复杂度要求如下：<ul><li>字符长度范围[8,32]。</li><li>至少包含字母、数字和特殊字符（叹号“!”、at"@"、井号“#”、百分号“%”、插入符“^”、星号“*”、小括号“()”、下划线“_”）中的两种。</li></ul>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 新账号密码。密码复杂度要求如下：<ul><li>字符长度范围[8,32]。</li><li>至少包含字母、数字和特殊字符（叹号“!”、at"@"、井号“#”、百分号“%”、插入符“^”、星号“*”、小括号“()”、下划线“_”）中的两种。</li></ul>
     * @param Password 新账号密码。密码复杂度要求如下：<ul><li>字符长度范围[8,32]。</li><li>至少包含字母、数字和特殊字符（叹号“!”、at"@"、井号“#”、百分号“%”、插入符“^”、星号“*”、小括号“()”、下划线“_”）中的两种。</li></ul>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get mongouser 账号对应的密码。mongouser 为系统默认账号，即为创建实例时，设置的密码。 
     * @return MongoUserPassword mongouser 账号对应的密码。mongouser 为系统默认账号，即为创建实例时，设置的密码。
     */
    public String getMongoUserPassword() {
        return this.MongoUserPassword;
    }

    /**
     * Set mongouser 账号对应的密码。mongouser 为系统默认账号，即为创建实例时，设置的密码。
     * @param MongoUserPassword mongouser 账号对应的密码。mongouser 为系统默认账号，即为创建实例时，设置的密码。
     */
    public void setMongoUserPassword(String MongoUserPassword) {
        this.MongoUserPassword = MongoUserPassword;
    }

    /**
     * Get 账号备注信息。 
     * @return UserDesc 账号备注信息。
     */
    public String getUserDesc() {
        return this.UserDesc;
    }

    /**
     * Set 账号备注信息。
     * @param UserDesc 账号备注信息。
     */
    public void setUserDesc(String UserDesc) {
        this.UserDesc = UserDesc;
    }

    /**
     * Get 账号的读写权限信息。 
     * @return AuthRole 账号的读写权限信息。
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set 账号的读写权限信息。
     * @param AuthRole 账号的读写权限信息。
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    public CreateAccountUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountUserRequest(CreateAccountUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.MongoUserPassword != null) {
            this.MongoUserPassword = new String(source.MongoUserPassword);
        }
        if (source.UserDesc != null) {
            this.UserDesc = new String(source.UserDesc);
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
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "MongoUserPassword", this.MongoUserPassword);
        this.setParamSimple(map, prefix + "UserDesc", this.UserDesc);
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);

    }
}

