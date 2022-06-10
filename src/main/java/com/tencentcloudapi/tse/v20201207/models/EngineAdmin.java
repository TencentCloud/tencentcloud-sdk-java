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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineAdmin extends AbstractModel{

    /**
    * 控制台初始用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 控制台初始密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 引擎接口的管理员 Token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
     * Get 控制台初始用户名 
     * @return Name 控制台初始用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 控制台初始用户名
     * @param Name 控制台初始用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 控制台初始密码 
     * @return Password 控制台初始密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 控制台初始密码
     * @param Password 控制台初始密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 引擎接口的管理员 Token 
     * @return Token 引擎接口的管理员 Token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 引擎接口的管理员 Token
     * @param Token 引擎接口的管理员 Token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    public EngineAdmin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineAdmin(EngineAdmin source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Token", this.Token);

    }
}

