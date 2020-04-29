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
package com.tencentcloudapi.lp.v20200224.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryLoginProtectionRequest extends AbstractModel{

    /**
    * 登录来源的外网 IP。
    */
    @SerializedName("LoginIp")
    @Expose
    private String LoginIp;

    /**
    * 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 登录时间戳，单位：秒。
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * 用户账号类型（QQ 开放帐号、微信开放账号需要 提交工单 由腾讯云进行资格审核）：
1：QQ 开放帐号。
2：微信开放账号。
4：手机号。
0：其他。
10004：手机号 MD5。
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * accountType 是 QQ 或微信开放账号时，该参数必填，表示 QQ 或微信分配给网站或应用的 AppID，用来唯一标识网站或应用。
    */
    @SerializedName("AppIdU")
    @Expose
    private String AppIdU;

    /**
    * accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
    */
    @SerializedName("AssociateAccount")
    @Expose
    private String AssociateAccount;

    /**
    * 昵称，UTF-8 编码。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 手机号：国家代码-手机号， 如0086-15912345687（0086前不需要+号）。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 用户邮箱地址（非系统自动生成）。
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 注册来源的外网 IP。
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * 地址。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
    */
    @SerializedName("CookieHash")
    @Expose
    private String CookieHash;

    /**
    * 登录来源：
0：其他
1：PC 网页
2：移动页面
3：App
4：微信公众号
    */
    @SerializedName("LoginSource")
    @Expose
    private String LoginSource;

    /**
    * 登录方式：
0：其他
1：手动帐号密码输入
2：动态短信密码登录
3：二维码扫描登录
    */
    @SerializedName("LoginType")
    @Expose
    private String LoginType;

    /**
    * 用户 HTTP 请求的 referer 值。
    */
    @SerializedName("Referer")
    @Expose
    private String Referer;

    /**
    * 登录成功后跳转页面。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 用户 HTTP 请求的 userAgent。
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 用户 HTTP 请求中的 x_forward_for。
    */
    @SerializedName("XForwardedFor")
    @Expose
    private String XForwardedFor;

    /**
    * 用户操作过程中鼠标单击次数。
    */
    @SerializedName("MouseClickCount")
    @Expose
    private String MouseClickCount;

    /**
    * 用户操作过程中键盘单击次数。
    */
    @SerializedName("KeyboardClickCount")
    @Expose
    private String KeyboardClickCount;

    /**
    * 注册结果：
0：失败
1：成功
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 失败原因：
0：其他
1：参数错误
2：帐号冲突
3：验证错误
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 登录耗时，单位：秒。
    */
    @SerializedName("LoginSpend")
    @Expose
    private String LoginSpend;

    /**
    * MAC 地址或设备唯一标识。
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 手机制造商 ID，如果手机注册，请带上此信息。
    */
    @SerializedName("VendorId")
    @Expose
    private String VendorId;

    /**
    * App 客户端版本。
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 手机设备号。
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 业务 ID 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 1：微信公众号
2：微信小程序
    */
    @SerializedName("WxSubType")
    @Expose
    private String WxSubType;

    /**
    * Token 签名随机数，微信小程序必填，建议16个字符。
    */
    @SerializedName("RandNum")
    @Expose
    private String RandNum;

    /**
    * 如果是微信小程序，该字段为以 ssesion_key 为 key 去签名随机数radnNum得到的值（hmac_sha256 签名算法）。
如果是微信公众号或第三方登录，则为授权的 access_token（注意：不是普通 access_token，具体看 微信官方文档）。
    */
    @SerializedName("WxToken")
    @Expose
    private String WxToken;

    /**
     * Get 登录来源的外网 IP。 
     * @return LoginIp 登录来源的外网 IP。
     */
    public String getLoginIp() {
        return this.LoginIp;
    }

    /**
     * Set 登录来源的外网 IP。
     * @param LoginIp 登录来源的外网 IP。
     */
    public void setLoginIp(String LoginIp) {
        this.LoginIp = LoginIp;
    }

    /**
     * Get 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。 
     * @return Uid 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
     * @param Uid 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 登录时间戳，单位：秒。 
     * @return LoginTime 登录时间戳，单位：秒。
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set 登录时间戳，单位：秒。
     * @param LoginTime 登录时间戳，单位：秒。
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get 用户账号类型（QQ 开放帐号、微信开放账号需要 提交工单 由腾讯云进行资格审核）：
1：QQ 开放帐号。
2：微信开放账号。
4：手机号。
0：其他。
10004：手机号 MD5。 
     * @return AccountType 用户账号类型（QQ 开放帐号、微信开放账号需要 提交工单 由腾讯云进行资格审核）：
1：QQ 开放帐号。
2：微信开放账号。
4：手机号。
0：其他。
10004：手机号 MD5。
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 用户账号类型（QQ 开放帐号、微信开放账号需要 提交工单 由腾讯云进行资格审核）：
1：QQ 开放帐号。
2：微信开放账号。
4：手机号。
0：其他。
10004：手机号 MD5。
     * @param AccountType 用户账号类型（QQ 开放帐号、微信开放账号需要 提交工单 由腾讯云进行资格审核）：
1：QQ 开放帐号。
2：微信开放账号。
4：手机号。
0：其他。
10004：手机号 MD5。
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get accountType 是 QQ 或微信开放账号时，该参数必填，表示 QQ 或微信分配给网站或应用的 AppID，用来唯一标识网站或应用。 
     * @return AppIdU accountType 是 QQ 或微信开放账号时，该参数必填，表示 QQ 或微信分配给网站或应用的 AppID，用来唯一标识网站或应用。
     */
    public String getAppIdU() {
        return this.AppIdU;
    }

    /**
     * Set accountType 是 QQ 或微信开放账号时，该参数必填，表示 QQ 或微信分配给网站或应用的 AppID，用来唯一标识网站或应用。
     * @param AppIdU accountType 是 QQ 或微信开放账号时，该参数必填，表示 QQ 或微信分配给网站或应用的 AppID，用来唯一标识网站或应用。
     */
    public void setAppIdU(String AppIdU) {
        this.AppIdU = AppIdU;
    }

    /**
     * Get accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。 
     * @return AssociateAccount accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
     */
    public String getAssociateAccount() {
        return this.AssociateAccount;
    }

    /**
     * Set accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
     * @param AssociateAccount accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
     */
    public void setAssociateAccount(String AssociateAccount) {
        this.AssociateAccount = AssociateAccount;
    }

    /**
     * Get 昵称，UTF-8 编码。 
     * @return NickName 昵称，UTF-8 编码。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称，UTF-8 编码。
     * @param NickName 昵称，UTF-8 编码。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 手机号：国家代码-手机号， 如0086-15912345687（0086前不需要+号）。 
     * @return PhoneNumber 手机号：国家代码-手机号， 如0086-15912345687（0086前不需要+号）。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号：国家代码-手机号， 如0086-15912345687（0086前不需要+号）。
     * @param PhoneNumber 手机号：国家代码-手机号， 如0086-15912345687（0086前不需要+号）。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 用户邮箱地址（非系统自动生成）。 
     * @return EmailAddress 用户邮箱地址（非系统自动生成）。
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 用户邮箱地址（非系统自动生成）。
     * @param EmailAddress 用户邮箱地址（非系统自动生成）。
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 注册来源的外网 IP。 
     * @return RegisterTime 注册来源的外网 IP。
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set 注册来源的外网 IP。
     * @param RegisterTime 注册来源的外网 IP。
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get 地址。 
     * @return Address 地址。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址。
     * @param Address 地址。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。 
     * @return CookieHash 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
     */
    public String getCookieHash() {
        return this.CookieHash;
    }

    /**
     * Set 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
     * @param CookieHash 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
     */
    public void setCookieHash(String CookieHash) {
        this.CookieHash = CookieHash;
    }

    /**
     * Get 登录来源：
0：其他
1：PC 网页
2：移动页面
3：App
4：微信公众号 
     * @return LoginSource 登录来源：
0：其他
1：PC 网页
2：移动页面
3：App
4：微信公众号
     */
    public String getLoginSource() {
        return this.LoginSource;
    }

    /**
     * Set 登录来源：
0：其他
1：PC 网页
2：移动页面
3：App
4：微信公众号
     * @param LoginSource 登录来源：
0：其他
1：PC 网页
2：移动页面
3：App
4：微信公众号
     */
    public void setLoginSource(String LoginSource) {
        this.LoginSource = LoginSource;
    }

    /**
     * Get 登录方式：
0：其他
1：手动帐号密码输入
2：动态短信密码登录
3：二维码扫描登录 
     * @return LoginType 登录方式：
0：其他
1：手动帐号密码输入
2：动态短信密码登录
3：二维码扫描登录
     */
    public String getLoginType() {
        return this.LoginType;
    }

    /**
     * Set 登录方式：
0：其他
1：手动帐号密码输入
2：动态短信密码登录
3：二维码扫描登录
     * @param LoginType 登录方式：
0：其他
1：手动帐号密码输入
2：动态短信密码登录
3：二维码扫描登录
     */
    public void setLoginType(String LoginType) {
        this.LoginType = LoginType;
    }

    /**
     * Get 用户 HTTP 请求的 referer 值。 
     * @return Referer 用户 HTTP 请求的 referer 值。
     */
    public String getReferer() {
        return this.Referer;
    }

    /**
     * Set 用户 HTTP 请求的 referer 值。
     * @param Referer 用户 HTTP 请求的 referer 值。
     */
    public void setReferer(String Referer) {
        this.Referer = Referer;
    }

    /**
     * Get 登录成功后跳转页面。 
     * @return JumpUrl 登录成功后跳转页面。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 登录成功后跳转页面。
     * @param JumpUrl 登录成功后跳转页面。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 用户 HTTP 请求的 userAgent。 
     * @return UserAgent 用户 HTTP 请求的 userAgent。
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 用户 HTTP 请求的 userAgent。
     * @param UserAgent 用户 HTTP 请求的 userAgent。
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 用户 HTTP 请求中的 x_forward_for。 
     * @return XForwardedFor 用户 HTTP 请求中的 x_forward_for。
     */
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    /**
     * Set 用户 HTTP 请求中的 x_forward_for。
     * @param XForwardedFor 用户 HTTP 请求中的 x_forward_for。
     */
    public void setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
    }

    /**
     * Get 用户操作过程中鼠标单击次数。 
     * @return MouseClickCount 用户操作过程中鼠标单击次数。
     */
    public String getMouseClickCount() {
        return this.MouseClickCount;
    }

    /**
     * Set 用户操作过程中鼠标单击次数。
     * @param MouseClickCount 用户操作过程中鼠标单击次数。
     */
    public void setMouseClickCount(String MouseClickCount) {
        this.MouseClickCount = MouseClickCount;
    }

    /**
     * Get 用户操作过程中键盘单击次数。 
     * @return KeyboardClickCount 用户操作过程中键盘单击次数。
     */
    public String getKeyboardClickCount() {
        return this.KeyboardClickCount;
    }

    /**
     * Set 用户操作过程中键盘单击次数。
     * @param KeyboardClickCount 用户操作过程中键盘单击次数。
     */
    public void setKeyboardClickCount(String KeyboardClickCount) {
        this.KeyboardClickCount = KeyboardClickCount;
    }

    /**
     * Get 注册结果：
0：失败
1：成功 
     * @return Result 注册结果：
0：失败
1：成功
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 注册结果：
0：失败
1：成功
     * @param Result 注册结果：
0：失败
1：成功
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 失败原因：
0：其他
1：参数错误
2：帐号冲突
3：验证错误 
     * @return Reason 失败原因：
0：其他
1：参数错误
2：帐号冲突
3：验证错误
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因：
0：其他
1：参数错误
2：帐号冲突
3：验证错误
     * @param Reason 失败原因：
0：其他
1：参数错误
2：帐号冲突
3：验证错误
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 登录耗时，单位：秒。 
     * @return LoginSpend 登录耗时，单位：秒。
     */
    public String getLoginSpend() {
        return this.LoginSpend;
    }

    /**
     * Set 登录耗时，单位：秒。
     * @param LoginSpend 登录耗时，单位：秒。
     */
    public void setLoginSpend(String LoginSpend) {
        this.LoginSpend = LoginSpend;
    }

    /**
     * Get MAC 地址或设备唯一标识。 
     * @return MacAddress MAC 地址或设备唯一标识。
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set MAC 地址或设备唯一标识。
     * @param MacAddress MAC 地址或设备唯一标识。
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get 手机制造商 ID，如果手机注册，请带上此信息。 
     * @return VendorId 手机制造商 ID，如果手机注册，请带上此信息。
     */
    public String getVendorId() {
        return this.VendorId;
    }

    /**
     * Set 手机制造商 ID，如果手机注册，请带上此信息。
     * @param VendorId 手机制造商 ID，如果手机注册，请带上此信息。
     */
    public void setVendorId(String VendorId) {
        this.VendorId = VendorId;
    }

    /**
     * Get App 客户端版本。 
     * @return AppVersion App 客户端版本。
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set App 客户端版本。
     * @param AppVersion App 客户端版本。
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 手机设备号。 
     * @return Imei 手机设备号。
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 手机设备号。
     * @param Imei 手机设备号。
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get 业务 ID 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据。 
     * @return BusinessId 业务 ID 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务 ID 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据。
     * @param BusinessId 业务 ID 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 1：微信公众号
2：微信小程序 
     * @return WxSubType 1：微信公众号
2：微信小程序
     */
    public String getWxSubType() {
        return this.WxSubType;
    }

    /**
     * Set 1：微信公众号
2：微信小程序
     * @param WxSubType 1：微信公众号
2：微信小程序
     */
    public void setWxSubType(String WxSubType) {
        this.WxSubType = WxSubType;
    }

    /**
     * Get Token 签名随机数，微信小程序必填，建议16个字符。 
     * @return RandNum Token 签名随机数，微信小程序必填，建议16个字符。
     */
    public String getRandNum() {
        return this.RandNum;
    }

    /**
     * Set Token 签名随机数，微信小程序必填，建议16个字符。
     * @param RandNum Token 签名随机数，微信小程序必填，建议16个字符。
     */
    public void setRandNum(String RandNum) {
        this.RandNum = RandNum;
    }

    /**
     * Get 如果是微信小程序，该字段为以 ssesion_key 为 key 去签名随机数radnNum得到的值（hmac_sha256 签名算法）。
如果是微信公众号或第三方登录，则为授权的 access_token（注意：不是普通 access_token，具体看 微信官方文档）。 
     * @return WxToken 如果是微信小程序，该字段为以 ssesion_key 为 key 去签名随机数radnNum得到的值（hmac_sha256 签名算法）。
如果是微信公众号或第三方登录，则为授权的 access_token（注意：不是普通 access_token，具体看 微信官方文档）。
     */
    public String getWxToken() {
        return this.WxToken;
    }

    /**
     * Set 如果是微信小程序，该字段为以 ssesion_key 为 key 去签名随机数radnNum得到的值（hmac_sha256 签名算法）。
如果是微信公众号或第三方登录，则为授权的 access_token（注意：不是普通 access_token，具体看 微信官方文档）。
     * @param WxToken 如果是微信小程序，该字段为以 ssesion_key 为 key 去签名随机数radnNum得到的值（hmac_sha256 签名算法）。
如果是微信公众号或第三方登录，则为授权的 access_token（注意：不是普通 access_token，具体看 微信官方文档）。
     */
    public void setWxToken(String WxToken) {
        this.WxToken = WxToken;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoginIp", this.LoginIp);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "AppIdU", this.AppIdU);
        this.setParamSimple(map, prefix + "AssociateAccount", this.AssociateAccount);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "CookieHash", this.CookieHash);
        this.setParamSimple(map, prefix + "LoginSource", this.LoginSource);
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamSimple(map, prefix + "Referer", this.Referer);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "XForwardedFor", this.XForwardedFor);
        this.setParamSimple(map, prefix + "MouseClickCount", this.MouseClickCount);
        this.setParamSimple(map, prefix + "KeyboardClickCount", this.KeyboardClickCount);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "LoginSpend", this.LoginSpend);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "VendorId", this.VendorId);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "WxSubType", this.WxSubType);
        this.setParamSimple(map, prefix + "RandNum", this.RandNum);
        this.setParamSimple(map, prefix + "WxToken", this.WxToken);

    }
}

