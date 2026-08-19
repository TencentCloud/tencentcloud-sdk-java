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

public class LoginActionFlagIntl extends AbstractModel {

    /**
    * <p>手机</p>
    */
    @SerializedName("Phone")
    @Expose
    private Long Phone;

    /**
    * <p>硬token</p>
    */
    @SerializedName("Token")
    @Expose
    private Long Token;

    /**
    * <p>软token</p>
    */
    @SerializedName("Stoken")
    @Expose
    private Long Stoken;

    /**
    * <p>微信</p>
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
    * <p>自定义</p>
    */
    @SerializedName("Custom")
    @Expose
    private Long Custom;

    /**
    * <p>邮件</p>
    */
    @SerializedName("Mail")
    @Expose
    private Long Mail;

    /**
    * <p>u2f硬件token</p>
    */
    @SerializedName("U2FToken")
    @Expose
    private Long U2FToken;

    /**
    * <p>passkey通行密钥</p>
    */
    @SerializedName("Passkey")
    @Expose
    private Long Passkey;

    /**
     * Get <p>手机</p> 
     * @return Phone <p>手机</p>
     */
    public Long getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>手机</p>
     * @param Phone <p>手机</p>
     */
    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>硬token</p> 
     * @return Token <p>硬token</p>
     */
    public Long getToken() {
        return this.Token;
    }

    /**
     * Set <p>硬token</p>
     * @param Token <p>硬token</p>
     */
    public void setToken(Long Token) {
        this.Token = Token;
    }

    /**
     * Get <p>软token</p> 
     * @return Stoken <p>软token</p>
     */
    public Long getStoken() {
        return this.Stoken;
    }

    /**
     * Set <p>软token</p>
     * @param Stoken <p>软token</p>
     */
    public void setStoken(Long Stoken) {
        this.Stoken = Stoken;
    }

    /**
     * Get <p>微信</p> 
     * @return Wechat <p>微信</p>
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * Set <p>微信</p>
     * @param Wechat <p>微信</p>
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get <p>自定义</p> 
     * @return Custom <p>自定义</p>
     */
    public Long getCustom() {
        return this.Custom;
    }

    /**
     * Set <p>自定义</p>
     * @param Custom <p>自定义</p>
     */
    public void setCustom(Long Custom) {
        this.Custom = Custom;
    }

    /**
     * Get <p>邮件</p> 
     * @return Mail <p>邮件</p>
     */
    public Long getMail() {
        return this.Mail;
    }

    /**
     * Set <p>邮件</p>
     * @param Mail <p>邮件</p>
     */
    public void setMail(Long Mail) {
        this.Mail = Mail;
    }

    /**
     * Get <p>u2f硬件token</p> 
     * @return U2FToken <p>u2f硬件token</p>
     */
    public Long getU2FToken() {
        return this.U2FToken;
    }

    /**
     * Set <p>u2f硬件token</p>
     * @param U2FToken <p>u2f硬件token</p>
     */
    public void setU2FToken(Long U2FToken) {
        this.U2FToken = U2FToken;
    }

    /**
     * Get <p>passkey通行密钥</p> 
     * @return Passkey <p>passkey通行密钥</p>
     */
    public Long getPasskey() {
        return this.Passkey;
    }

    /**
     * Set <p>passkey通行密钥</p>
     * @param Passkey <p>passkey通行密钥</p>
     */
    public void setPasskey(Long Passkey) {
        this.Passkey = Passkey;
    }

    public LoginActionFlagIntl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginActionFlagIntl(LoginActionFlagIntl source) {
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

