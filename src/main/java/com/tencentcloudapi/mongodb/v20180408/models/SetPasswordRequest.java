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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetPasswordRequest extends AbstractModel {

    /**
    * 实例ID，格式如：cmgo-p8vn****。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例账户名。初始化实例密码，本参数传mongouser。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 指定账户的新密码， 密码格式为8-32个字符长度，至少包含字母、数字和字符（!@#%^*()_）中的两种
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 实例ID，格式如：cmgo-p8vn****。与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceId 实例ID，格式如：cmgo-p8vn****。与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cmgo-p8vn****。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID，格式如：cmgo-p8vn****。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例账户名。初始化实例密码，本参数传mongouser。 
     * @return UserName 实例账户名。初始化实例密码，本参数传mongouser。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 实例账户名。初始化实例密码，本参数传mongouser。
     * @param UserName 实例账户名。初始化实例密码，本参数传mongouser。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 指定账户的新密码， 密码格式为8-32个字符长度，至少包含字母、数字和字符（!@#%^*()_）中的两种 
     * @return Password 指定账户的新密码， 密码格式为8-32个字符长度，至少包含字母、数字和字符（!@#%^*()_）中的两种
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 指定账户的新密码， 密码格式为8-32个字符长度，至少包含字母、数字和字符（!@#%^*()_）中的两种
     * @param Password 指定账户的新密码， 密码格式为8-32个字符长度，至少包含字母、数字和字符（!@#%^*()_）中的两种
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public SetPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetPasswordRequest(SetPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

