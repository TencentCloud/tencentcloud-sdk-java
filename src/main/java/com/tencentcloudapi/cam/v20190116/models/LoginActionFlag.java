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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginActionFlag extends AbstractModel{

    /**
    * 手机
    */
    @SerializedName("Phone")
    @Expose
    private Long Phone;

    /**
    * 硬token
    */
    @SerializedName("Token")
    @Expose
    private Long Token;

    /**
    * 软token
    */
    @SerializedName("Stoken")
    @Expose
    private Long Stoken;

    /**
    * 微信
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
    * 自定义
    */
    @SerializedName("Custom")
    @Expose
    private Long Custom;

    /**
     * Get 手机 
     * @return Phone 手机
     */
    public Long getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机
     * @param Phone 手机
     */
    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 硬token 
     * @return Token 硬token
     */
    public Long getToken() {
        return this.Token;
    }

    /**
     * Set 硬token
     * @param Token 硬token
     */
    public void setToken(Long Token) {
        this.Token = Token;
    }

    /**
     * Get 软token 
     * @return Stoken 软token
     */
    public Long getStoken() {
        return this.Stoken;
    }

    /**
     * Set 软token
     * @param Stoken 软token
     */
    public void setStoken(Long Stoken) {
        this.Stoken = Stoken;
    }

    /**
     * Get 微信 
     * @return Wechat 微信
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * Set 微信
     * @param Wechat 微信
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get 自定义 
     * @return Custom 自定义
     */
    public Long getCustom() {
        return this.Custom;
    }

    /**
     * Set 自定义
     * @param Custom 自定义
     */
    public void setCustom(Long Custom) {
        this.Custom = Custom;
    }

    public LoginActionFlag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginActionFlag(LoginActionFlag source) {
        if (source.Phone != null) {
            this.Phone = new Long(source.Phone);
        }
        if (source.Token != null) {
            this.Token = new Long(source.Token);
        }
        if (source.Stoken != null) {
            this.Stoken = new Long(source.Stoken);
        }
        if (source.Wechat != null) {
            this.Wechat = new Long(source.Wechat);
        }
        if (source.Custom != null) {
            this.Custom = new Long(source.Custom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Stoken", this.Stoken);
        this.setParamSimple(map, prefix + "Wechat", this.Wechat);
        this.setParamSimple(map, prefix + "Custom", this.Custom);

    }
}

