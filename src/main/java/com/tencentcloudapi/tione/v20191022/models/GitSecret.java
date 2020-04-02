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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GitSecret extends AbstractModel{

    /**
    * 无秘钥，默认选项
    */
    @SerializedName("NoSecret")
    @Expose
    private Boolean NoSecret;

    /**
    * Git用户名密码base64编码后的字符串
编码前的内容应为Json字符串，如
{"UserName": "用户名", "Password":"密码"}
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
     * Get 无秘钥，默认选项 
     * @return NoSecret 无秘钥，默认选项
     */
    public Boolean getNoSecret() {
        return this.NoSecret;
    }

    /**
     * Set 无秘钥，默认选项
     * @param NoSecret 无秘钥，默认选项
     */
    public void setNoSecret(Boolean NoSecret) {
        this.NoSecret = NoSecret;
    }

    /**
     * Get Git用户名密码base64编码后的字符串
编码前的内容应为Json字符串，如
{"UserName": "用户名", "Password":"密码"} 
     * @return Secret Git用户名密码base64编码后的字符串
编码前的内容应为Json字符串，如
{"UserName": "用户名", "Password":"密码"}
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set Git用户名密码base64编码后的字符串
编码前的内容应为Json字符串，如
{"UserName": "用户名", "Password":"密码"}
     * @param Secret Git用户名密码base64编码后的字符串
编码前的内容应为Json字符串，如
{"UserName": "用户名", "Password":"密码"}
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoSecret", this.NoSecret);
        this.setParamSimple(map, prefix + "Secret", this.Secret);

    }
}

