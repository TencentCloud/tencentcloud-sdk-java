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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputDetectAccountActivity extends AbstractModel{

    /**
    * 用户ID值，如微信/QQ openid，或 手机号等（如15912345687）
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 用户账号类型 
1：QQ开放帐号 
2：微信开放账号 
4：手机号 （暂仅支持国内手机号）
10004： 手机号MD5
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 用户真实外网IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * accountType是QQ或微信开放账号时，该参数必填，表示QQ或微信分配给网站或应用的appId，用来唯一标识网站或应用
    */
    @SerializedName("AppIdU")
    @Expose
    private String AppIdU;

    /**
    * 昵称，UTF-8 编码
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 用户邮箱地址（非系统自动生成）
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可
    */
    @SerializedName("CookieHash")
    @Expose
    private Float CookieHash;

    /**
    * 用户HTTP请求的 userAgent
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 用户HTTP请求中的 x_forward_for
    */
    @SerializedName("XForwardedFor")
    @Expose
    private String XForwardedFor;

    /**
    * Mac地址或设备唯一标识
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 手机制造商ID，如果手机注册，请带上此信息
    */
    @SerializedName("VendorId")
    @Expose
    private String VendorId;

    /**
    * 手机设备号
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
     * Get 用户ID值，如微信/QQ openid，或 手机号等（如15912345687） 
     * @return Uid 用户ID值，如微信/QQ openid，或 手机号等（如15912345687）
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户ID值，如微信/QQ openid，或 手机号等（如15912345687）
     * @param Uid 用户ID值，如微信/QQ openid，或 手机号等（如15912345687）
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 用户账号类型 
1：QQ开放帐号 
2：微信开放账号 
4：手机号 （暂仅支持国内手机号）
10004： 手机号MD5 
     * @return AccountType 用户账号类型 
1：QQ开放帐号 
2：微信开放账号 
4：手机号 （暂仅支持国内手机号）
10004： 手机号MD5
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 用户账号类型 
1：QQ开放帐号 
2：微信开放账号 
4：手机号 （暂仅支持国内手机号）
10004： 手机号MD5
     * @param AccountType 用户账号类型 
1：QQ开放帐号 
2：微信开放账号 
4：手机号 （暂仅支持国内手机号）
10004： 手机号MD5
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 用户真实外网IP 
     * @return UserIp 用户真实外网IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户真实外网IP
     * @param UserIp 用户真实外网IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972） 
     * @return PostTime 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）
     * @param PostTime 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get accountType是QQ或微信开放账号时，该参数必填，表示QQ或微信分配给网站或应用的appId，用来唯一标识网站或应用 
     * @return AppIdU accountType是QQ或微信开放账号时，该参数必填，表示QQ或微信分配给网站或应用的appId，用来唯一标识网站或应用
     */
    public String getAppIdU() {
        return this.AppIdU;
    }

    /**
     * Set accountType是QQ或微信开放账号时，该参数必填，表示QQ或微信分配给网站或应用的appId，用来唯一标识网站或应用
     * @param AppIdU accountType是QQ或微信开放账号时，该参数必填，表示QQ或微信分配给网站或应用的appId，用来唯一标识网站或应用
     */
    public void setAppIdU(String AppIdU) {
        this.AppIdU = AppIdU;
    }

    /**
     * Get 昵称，UTF-8 编码 
     * @return NickName 昵称，UTF-8 编码
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称，UTF-8 编码
     * @param NickName 昵称，UTF-8 编码
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687） 
     * @return PhoneNumber 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）
     * @param PhoneNumber 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 用户邮箱地址（非系统自动生成） 
     * @return EmailAddress 用户邮箱地址（非系统自动生成）
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 用户邮箱地址（非系统自动生成）
     * @param EmailAddress 用户邮箱地址（非系统自动生成）
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可 
     * @return CookieHash 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可
     */
    public Float getCookieHash() {
        return this.CookieHash;
    }

    /**
     * Set 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可
     * @param CookieHash 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可
     */
    public void setCookieHash(Float CookieHash) {
        this.CookieHash = CookieHash;
    }

    /**
     * Get 用户HTTP请求的 userAgent 
     * @return UserAgent 用户HTTP请求的 userAgent
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 用户HTTP请求的 userAgent
     * @param UserAgent 用户HTTP请求的 userAgent
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 用户HTTP请求中的 x_forward_for 
     * @return XForwardedFor 用户HTTP请求中的 x_forward_for
     */
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    /**
     * Set 用户HTTP请求中的 x_forward_for
     * @param XForwardedFor 用户HTTP请求中的 x_forward_for
     */
    public void setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
    }

    /**
     * Get Mac地址或设备唯一标识 
     * @return MacAddress Mac地址或设备唯一标识
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set Mac地址或设备唯一标识
     * @param MacAddress Mac地址或设备唯一标识
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get 手机制造商ID，如果手机注册，请带上此信息 
     * @return VendorId 手机制造商ID，如果手机注册，请带上此信息
     */
    public String getVendorId() {
        return this.VendorId;
    }

    /**
     * Set 手机制造商ID，如果手机注册，请带上此信息
     * @param VendorId 手机制造商ID，如果手机注册，请带上此信息
     */
    public void setVendorId(String VendorId) {
        this.VendorId = VendorId;
    }

    /**
     * Get 手机设备号 
     * @return Imei 手机设备号
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 手机设备号
     * @param Imei 手机设备号
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "AppIdU", this.AppIdU);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "CookieHash", this.CookieHash);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "XForwardedFor", this.XForwardedFor);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "VendorId", this.VendorId);
        this.setParamSimple(map, prefix + "Imei", this.Imei);

    }
}

