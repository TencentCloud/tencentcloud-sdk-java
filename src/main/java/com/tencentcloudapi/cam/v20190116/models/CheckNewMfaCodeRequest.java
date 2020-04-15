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

public class CheckNewMfaCodeRequest extends AbstractModel{

    /**
    * 登录态Skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * 接口名
    */
    @SerializedName("Interface")
    @Expose
    private String Interface;

    /**
    * IP
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 浏览器UA
    */
    @SerializedName("ClientUA")
    @Expose
    private String ClientUA;

    /**
    * 验证类型
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 主账号uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 手机验证码
    */
    @SerializedName("PhoneCode")
    @Expose
    private Long PhoneCode;

    /**
    * 手机号码
    */
    @SerializedName("PhoneNumber")
    @Expose
    private Long PhoneNumber;

    /**
    * 邮箱验证码
    */
    @SerializedName("MailCode")
    @Expose
    private Long MailCode;

    /**
    * 邮箱
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 手机国码
    */
    @SerializedName("CountryCode")
    @Expose
    private Long CountryCode;

    /**
     * Get 登录态Skey 
     * @return Skey 登录态Skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 登录态Skey
     * @param Skey 登录态Skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get 接口名 
     * @return Interface 接口名
     */
    public String getInterface() {
        return this.Interface;
    }

    /**
     * Set 接口名
     * @param Interface 接口名
     */
    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    /**
     * Get IP 
     * @return ClientIP IP
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set IP
     * @param ClientIP IP
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 浏览器UA 
     * @return ClientUA 浏览器UA
     */
    public String getClientUA() {
        return this.ClientUA;
    }

    /**
     * Set 浏览器UA
     * @param ClientUA 浏览器UA
     */
    public void setClientUA(String ClientUA) {
        this.ClientUA = ClientUA;
    }

    /**
     * Get 验证类型 
     * @return AuthType 验证类型
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 验证类型
     * @param AuthType 验证类型
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 主账号uin 
     * @return OwnerUin 主账号uin
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号uin
     * @param OwnerUin 主账号uin
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 手机验证码 
     * @return PhoneCode 手机验证码
     */
    public Long getPhoneCode() {
        return this.PhoneCode;
    }

    /**
     * Set 手机验证码
     * @param PhoneCode 手机验证码
     */
    public void setPhoneCode(Long PhoneCode) {
        this.PhoneCode = PhoneCode;
    }

    /**
     * Get 手机号码 
     * @return PhoneNumber 手机号码
     */
    public Long getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码
     * @param PhoneNumber 手机号码
     */
    public void setPhoneNumber(Long PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 邮箱验证码 
     * @return MailCode 邮箱验证码
     */
    public Long getMailCode() {
        return this.MailCode;
    }

    /**
     * Set 邮箱验证码
     * @param MailCode 邮箱验证码
     */
    public void setMailCode(Long MailCode) {
        this.MailCode = MailCode;
    }

    /**
     * Get 邮箱 
     * @return Mail 邮箱
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 邮箱
     * @param Mail 邮箱
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 手机国码 
     * @return CountryCode 手机国码
     */
    public Long getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 手机国码
     * @param CountryCode 手机国码
     */
    public void setCountryCode(Long CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "Interface", this.Interface);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "ClientUA", this.ClientUA);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "PhoneCode", this.PhoneCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "MailCode", this.MailCode);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);

    }
}

