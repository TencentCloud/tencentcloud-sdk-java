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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppResetPasswordRequest extends AbstractModel{

    /**
    * 访问Token
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * 旧密码
    */
    @SerializedName("OldPassword")
    @Expose
    private String OldPassword;

    /**
    * 新密码
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
     * Get 访问Token 
     * @return AccessToken 访问Token
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set 访问Token
     * @param AccessToken 访问Token
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get 旧密码 
     * @return OldPassword 旧密码
     */
    public String getOldPassword() {
        return this.OldPassword;
    }

    /**
     * Set 旧密码
     * @param OldPassword 旧密码
     */
    public void setOldPassword(String OldPassword) {
        this.OldPassword = OldPassword;
    }

    /**
     * Get 新密码 
     * @return NewPassword 新密码
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * Set 新密码
     * @param NewPassword 新密码
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "OldPassword", this.OldPassword);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);

    }
}

