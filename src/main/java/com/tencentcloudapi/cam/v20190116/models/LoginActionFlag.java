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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginActionFlag extends AbstractModel {

    /**
    * 0: 非安全手机校验 1: 安全手机校验。
    */
    @SerializedName("Phone")
    @Expose
    private Long Phone;

    /**
    * 0: 非硬token校验 1: 硬token校验。
    */
    @SerializedName("Token")
    @Expose
    private Long Token;

    /**
    * 0: 非软token校验 1: 软token校验
    */
    @SerializedName("Stoken")
    @Expose
    private Long Stoken;

    /**
    * 0: 非微信校验 1: 微信校验
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
    * 0: 非自定义校验 1: 自定义校验
    */
    @SerializedName("Custom")
    @Expose
    private Long Custom;

    /**
    * 0: 非邮箱校验 1: 邮箱校验
    */
    @SerializedName("Mail")
    @Expose
    private Long Mail;

    /**
    * 0: 非u2f硬件token 1: u2f硬件token
    */
    @SerializedName("U2FToken")
    @Expose
    private Long U2FToken;

    /**
     * Get 0: 非安全手机校验 1: 安全手机校验。 
     * @return Phone 0: 非安全手机校验 1: 安全手机校验。
     */
    public Long getPhone() {
        return this.Phone;
    }

    /**
     * Set 0: 非安全手机校验 1: 安全手机校验。
     * @param Phone 0: 非安全手机校验 1: 安全手机校验。
     */
    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 0: 非硬token校验 1: 硬token校验。 
     * @return Token 0: 非硬token校验 1: 硬token校验。
     */
    public Long getToken() {
        return this.Token;
    }

    /**
     * Set 0: 非硬token校验 1: 硬token校验。
     * @param Token 0: 非硬token校验 1: 硬token校验。
     */
    public void setToken(Long Token) {
        this.Token = Token;
    }

    /**
     * Get 0: 非软token校验 1: 软token校验 
     * @return Stoken 0: 非软token校验 1: 软token校验
     */
    public Long getStoken() {
        return this.Stoken;
    }

    /**
     * Set 0: 非软token校验 1: 软token校验
     * @param Stoken 0: 非软token校验 1: 软token校验
     */
    public void setStoken(Long Stoken) {
        this.Stoken = Stoken;
    }

    /**
     * Get 0: 非微信校验 1: 微信校验 
     * @return Wechat 0: 非微信校验 1: 微信校验
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * Set 0: 非微信校验 1: 微信校验
     * @param Wechat 0: 非微信校验 1: 微信校验
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get 0: 非自定义校验 1: 自定义校验 
     * @return Custom 0: 非自定义校验 1: 自定义校验
     */
    public Long getCustom() {
        return this.Custom;
    }

    /**
     * Set 0: 非自定义校验 1: 自定义校验
     * @param Custom 0: 非自定义校验 1: 自定义校验
     */
    public void setCustom(Long Custom) {
        this.Custom = Custom;
    }

    /**
     * Get 0: 非邮箱校验 1: 邮箱校验 
     * @return Mail 0: 非邮箱校验 1: 邮箱校验
     */
    public Long getMail() {
        return this.Mail;
    }

    /**
     * Set 0: 非邮箱校验 1: 邮箱校验
     * @param Mail 0: 非邮箱校验 1: 邮箱校验
     */
    public void setMail(Long Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 0: 非u2f硬件token 1: u2f硬件token 
     * @return U2FToken 0: 非u2f硬件token 1: u2f硬件token
     */
    public Long getU2FToken() {
        return this.U2FToken;
    }

    /**
     * Set 0: 非u2f硬件token 1: u2f硬件token
     * @param U2FToken 0: 非u2f硬件token 1: u2f硬件token
     */
    public void setU2FToken(Long U2FToken) {
        this.U2FToken = U2FToken;
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
        if (source.Mail != null) {
            this.Mail = new Long(source.Mail);
        }
        if (source.U2FToken != null) {
            this.U2FToken = new Long(source.U2FToken);
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
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "U2FToken", this.U2FToken);

    }
}

