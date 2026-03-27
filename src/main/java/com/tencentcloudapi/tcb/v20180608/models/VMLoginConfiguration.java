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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VMLoginConfiguration extends AbstractModel {

    /**
    * 登录方式。扫码登录时指定为 SCAN_LOGIN
    */
    @SerializedName("LoginType")
    @Expose
    private String LoginType;

    /**
    * 是否自动生成密码
    */
    @SerializedName("AutoGeneratePassword")
    @Expose
    private String AutoGeneratePassword;

    /**
    * 指定密码登录
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 绑定密钥ID
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
     * Get 登录方式。扫码登录时指定为 SCAN_LOGIN 
     * @return LoginType 登录方式。扫码登录时指定为 SCAN_LOGIN
     */
    public String getLoginType() {
        return this.LoginType;
    }

    /**
     * Set 登录方式。扫码登录时指定为 SCAN_LOGIN
     * @param LoginType 登录方式。扫码登录时指定为 SCAN_LOGIN
     */
    public void setLoginType(String LoginType) {
        this.LoginType = LoginType;
    }

    /**
     * Get 是否自动生成密码 
     * @return AutoGeneratePassword 是否自动生成密码
     */
    public String getAutoGeneratePassword() {
        return this.AutoGeneratePassword;
    }

    /**
     * Set 是否自动生成密码
     * @param AutoGeneratePassword 是否自动生成密码
     */
    public void setAutoGeneratePassword(String AutoGeneratePassword) {
        this.AutoGeneratePassword = AutoGeneratePassword;
    }

    /**
     * Get 指定密码登录 
     * @return Password 指定密码登录
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 指定密码登录
     * @param Password 指定密码登录
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 绑定密钥ID 
     * @return KeyIds 绑定密钥ID
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set 绑定密钥ID
     * @param KeyIds 绑定密钥ID
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    public VMLoginConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VMLoginConfiguration(VMLoginConfiguration source) {
        if (source.LoginType != null) {
            this.LoginType = new String(source.LoginType);
        }
        if (source.AutoGeneratePassword != null) {
            this.AutoGeneratePassword = new String(source.AutoGeneratePassword);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamSimple(map, prefix + "AutoGeneratePassword", this.AutoGeneratePassword);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);

    }
}

