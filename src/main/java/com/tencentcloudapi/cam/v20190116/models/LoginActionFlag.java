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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginActionFlag extends AbstractModel {

    /**
    * <p>0: 非安全手机校验 1: 安全手机校验。</p>
    */
    @SerializedName("Phone")
    @Expose
    private Long Phone;

    /**
    * <p>0: 非硬token校验 1: 硬token校验。</p>
    */
    @SerializedName("Token")
    @Expose
    private Long Token;

    /**
    * <p>0: 非软token校验 1: 软token校验</p>
    */
    @SerializedName("Stoken")
    @Expose
    private Long Stoken;

    /**
    * <p>0: 非微信校验 1: 微信校验</p>
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
    * <p>0: 非自定义校验 1: 自定义校验</p>
    */
    @SerializedName("Custom")
    @Expose
    private Long Custom;

    /**
    * <p>0: 非邮箱校验 1: 邮箱校验</p>
    */
    @SerializedName("Mail")
    @Expose
    private Long Mail;

    /**
    * <p>0: 非u2f硬件token 1: u2f硬件token</p>
    */
    @SerializedName("U2FToken")
    @Expose
    private Long U2FToken;

    /**
    * <p>0: 非passkey 校验 1: passkey校验</p>
    */
    @SerializedName("Passkey")
    @Expose
    private Long Passkey;

    /**
     * Get <p>0: 非安全手机校验 1: 安全手机校验。</p> 
     * @return Phone <p>0: 非安全手机校验 1: 安全手机校验。</p>
     */
    public Long getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>0: 非安全手机校验 1: 安全手机校验。</p>
     * @param Phone <p>0: 非安全手机校验 1: 安全手机校验。</p>
     */
    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>0: 非硬token校验 1: 硬token校验。</p> 
     * @return Token <p>0: 非硬token校验 1: 硬token校验。</p>
     */
    public Long getToken() {
        return this.Token;
    }

    /**
     * Set <p>0: 非硬token校验 1: 硬token校验。</p>
     * @param Token <p>0: 非硬token校验 1: 硬token校验。</p>
     */
    public void setToken(Long Token) {
        this.Token = Token;
    }

    /**
     * Get <p>0: 非软token校验 1: 软token校验</p> 
     * @return Stoken <p>0: 非软token校验 1: 软token校验</p>
     */
    public Long getStoken() {
        return this.Stoken;
    }

    /**
     * Set <p>0: 非软token校验 1: 软token校验</p>
     * @param Stoken <p>0: 非软token校验 1: 软token校验</p>
     */
    public void setStoken(Long Stoken) {
        this.Stoken = Stoken;
    }

    /**
     * Get <p>0: 非微信校验 1: 微信校验</p> 
     * @return Wechat <p>0: 非微信校验 1: 微信校验</p>
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * Set <p>0: 非微信校验 1: 微信校验</p>
     * @param Wechat <p>0: 非微信校验 1: 微信校验</p>
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get <p>0: 非自定义校验 1: 自定义校验</p> 
     * @return Custom <p>0: 非自定义校验 1: 自定义校验</p>
     */
    public Long getCustom() {
        return this.Custom;
    }

    /**
     * Set <p>0: 非自定义校验 1: 自定义校验</p>
     * @param Custom <p>0: 非自定义校验 1: 自定义校验</p>
     */
    public void setCustom(Long Custom) {
        this.Custom = Custom;
    }

    /**
     * Get <p>0: 非邮箱校验 1: 邮箱校验</p> 
     * @return Mail <p>0: 非邮箱校验 1: 邮箱校验</p>
     */
    public Long getMail() {
        return this.Mail;
    }

    /**
     * Set <p>0: 非邮箱校验 1: 邮箱校验</p>
     * @param Mail <p>0: 非邮箱校验 1: 邮箱校验</p>
     */
    public void setMail(Long Mail) {
        this.Mail = Mail;
    }

    /**
     * Get <p>0: 非u2f硬件token 1: u2f硬件token</p> 
     * @return U2FToken <p>0: 非u2f硬件token 1: u2f硬件token</p>
     */
    public Long getU2FToken() {
        return this.U2FToken;
    }

    /**
     * Set <p>0: 非u2f硬件token 1: u2f硬件token</p>
     * @param U2FToken <p>0: 非u2f硬件token 1: u2f硬件token</p>
     */
    public void setU2FToken(Long U2FToken) {
        this.U2FToken = U2FToken;
    }

    /**
     * Get <p>0: 非passkey 校验 1: passkey校验</p> 
     * @return Passkey <p>0: 非passkey 校验 1: passkey校验</p>
     */
    public Long getPasskey() {
        return this.Passkey;
    }

    /**
     * Set <p>0: 非passkey 校验 1: passkey校验</p>
     * @param Passkey <p>0: 非passkey 校验 1: passkey校验</p>
     */
    public void setPasskey(Long Passkey) {
        this.Passkey = Passkey;
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
        if (source.Passkey != null) {
            this.Passkey = new Long(source.Passkey);
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
        this.setParamSimple(map, prefix + "Passkey", this.Passkey);

    }
}

