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

public class AppUpdateUserRequest extends AbstractModel{

    /**
    * 访问Token
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

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
     * Get 昵称 
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "NickName", this.NickName);

    }
}

