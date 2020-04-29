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
package com.tencentcloudapi.aa.v20200224.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryActivityAntiRushRequest extends AbstractModel{

    /**
    * 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
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
    * 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 用户的真实外网 IP。若填入非外网有效ip，会返回level=0的风控结果，risktype中会有205的风险码返回作为标识
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 用户操作时间戳。
    */
    @SerializedName("PostTime")
    @Expose
    private String PostTime;

    /**
    * accountType 是QQ开放账号时，该参数必填，表示 QQ 开放平台分配给网站或应用的 AppID，用来唯一标识网站或应用。
    */
    @SerializedName("AppIdU")
    @Expose
    private String AppIdU;

    /**
    * 昵称，UTF-8 编码。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）。accountType为1或2时，该字段支持MD5值；
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 用户邮箱地址。
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 注册时间戳。
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * 注册来源的外网 IP。
    */
    @SerializedName("RegisterIp")
    @Expose
    private String RegisterIp;

    /**
    * 用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
    */
    @SerializedName("CookieHash")
    @Expose
    private String CookieHash;

    /**
    * 地址。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 登录来源：
0：其他。
1：PC 网页。
2：移动页面。
3：App。
4：微信公众号。
    */
    @SerializedName("LoginSource")
    @Expose
    private String LoginSource;

    /**
    * 登录方式：
0：其他。
1：手动账号密码输入。
2：动态短信密码登录。
3：二维码扫描登录。
    */
    @SerializedName("LoginType")
    @Expose
    private String LoginType;

    /**
    * 登录耗时，单位：秒。
    */
    @SerializedName("LoginSpend")
    @Expose
    private String LoginSpend;

    /**
    * 用户操作的目的 ID，如点赞等，该字段就是被点赞的消息 ID，如果是投票，则为被投号码的 ID。
    */
    @SerializedName("RootId")
    @Expose
    private String RootId;

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
    * 手机设备号。支持以下格式：
1.imei明文
2.idfa明文,
3.imei小写后MD5值小写
4.idfa大写后MD5值小写
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * App 客户端版本。
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 业务 ID 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 1：微信公众号。
2：微信小程序。
    */
    @SerializedName("WxSubType")
    @Expose
    private String WxSubType;

    /**
    * Token 签名随机数，WxSubType为微信小程序时必填，建议16个字符。
    */
    @SerializedName("RandNum")
    @Expose
    private String RandNum;

    /**
    * 如果 accountType为2而且wxSubType有填，该字段必选，否则不需要填写；
如果是微信小程序（WxSubType=2），该字段为以ssesion_key为key去签名随机数radnNum得到的值（ hmac_sha256签名算法）；如果是微信公众号或第三方登录，则为授权的access_token（网页版本的access_Token,而且获取token的scope字段必需填写snsapi_userinfo；）
    */
    @SerializedName("WxToken")
    @Expose
    private String WxToken;

    /**
    * 是否识别设备异常：
0：不识别。
1：识别。
    */
    @SerializedName("CheckDevice")
    @Expose
    private String CheckDevice;

    /**
     * Get 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
1：QQ 开放帐号。
2：微信开放账号。
4：手机号。
0：其他。
10004：手机号 MD5。 
     * @return AccountType 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
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
     * Set 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
1：QQ 开放帐号。
2：微信开放账号。
4：手机号。
0：其他。
10004：手机号 MD5。
     * @param AccountType 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
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
     * Get 用户的真实外网 IP。若填入非外网有效ip，会返回level=0的风控结果，risktype中会有205的风险码返回作为标识 
     * @return UserIp 用户的真实外网 IP。若填入非外网有效ip，会返回level=0的风控结果，risktype中会有205的风险码返回作为标识
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户的真实外网 IP。若填入非外网有效ip，会返回level=0的风控结果，risktype中会有205的风险码返回作为标识
     * @param UserIp 用户的真实外网 IP。若填入非外网有效ip，会返回level=0的风控结果，risktype中会有205的风险码返回作为标识
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 用户操作时间戳。 
     * @return PostTime 用户操作时间戳。
     */
    public String getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 用户操作时间戳。
     * @param PostTime 用户操作时间戳。
     */
    public void setPostTime(String PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get accountType 是QQ开放账号时，该参数必填，表示 QQ 开放平台分配给网站或应用的 AppID，用来唯一标识网站或应用。 
     * @return AppIdU accountType 是QQ开放账号时，该参数必填，表示 QQ 开放平台分配给网站或应用的 AppID，用来唯一标识网站或应用。
     */
    public String getAppIdU() {
        return this.AppIdU;
    }

    /**
     * Set accountType 是QQ开放账号时，该参数必填，表示 QQ 开放平台分配给网站或应用的 AppID，用来唯一标识网站或应用。
     * @param AppIdU accountType 是QQ开放账号时，该参数必填，表示 QQ 开放平台分配给网站或应用的 AppID，用来唯一标识网站或应用。
     */
    public void setAppIdU(String AppIdU) {
        this.AppIdU = AppIdU;
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
     * Get 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）。accountType为1或2时，该字段支持MD5值； 
     * @return PhoneNumber 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）。accountType为1或2时，该字段支持MD5值；
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）。accountType为1或2时，该字段支持MD5值；
     * @param PhoneNumber 手机号。若 accountType 选4（手机号）、或10004（手机号 MD5），则无需重复填写。否则填入对应的手机号（如15912345687）。accountType为1或2时，该字段支持MD5值；
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 用户邮箱地址。 
     * @return EmailAddress 用户邮箱地址。
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 用户邮箱地址。
     * @param EmailAddress 用户邮箱地址。
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 注册时间戳。 
     * @return RegisterTime 注册时间戳。
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set 注册时间戳。
     * @param RegisterTime 注册时间戳。
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get 注册来源的外网 IP。 
     * @return RegisterIp 注册来源的外网 IP。
     */
    public String getRegisterIp() {
        return this.RegisterIp;
    }

    /**
     * Set 注册来源的外网 IP。
     * @param RegisterIp 注册来源的外网 IP。
     */
    public void setRegisterIp(String RegisterIp) {
        this.RegisterIp = RegisterIp;
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
     * Get 登录来源：
0：其他。
1：PC 网页。
2：移动页面。
3：App。
4：微信公众号。 
     * @return LoginSource 登录来源：
0：其他。
1：PC 网页。
2：移动页面。
3：App。
4：微信公众号。
     */
    public String getLoginSource() {
        return this.LoginSource;
    }

    /**
     * Set 登录来源：
0：其他。
1：PC 网页。
2：移动页面。
3：App。
4：微信公众号。
     * @param LoginSource 登录来源：
0：其他。
1：PC 网页。
2：移动页面。
3：App。
4：微信公众号。
     */
    public void setLoginSource(String LoginSource) {
        this.LoginSource = LoginSource;
    }

    /**
     * Get 登录方式：
0：其他。
1：手动账号密码输入。
2：动态短信密码登录。
3：二维码扫描登录。 
     * @return LoginType 登录方式：
0：其他。
1：手动账号密码输入。
2：动态短信密码登录。
3：二维码扫描登录。
     */
    public String getLoginType() {
        return this.LoginType;
    }

    /**
     * Set 登录方式：
0：其他。
1：手动账号密码输入。
2：动态短信密码登录。
3：二维码扫描登录。
     * @param LoginType 登录方式：
0：其他。
1：手动账号密码输入。
2：动态短信密码登录。
3：二维码扫描登录。
     */
    public void setLoginType(String LoginType) {
        this.LoginType = LoginType;
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
     * Get 用户操作的目的 ID，如点赞等，该字段就是被点赞的消息 ID，如果是投票，则为被投号码的 ID。 
     * @return RootId 用户操作的目的 ID，如点赞等，该字段就是被点赞的消息 ID，如果是投票，则为被投号码的 ID。
     */
    public String getRootId() {
        return this.RootId;
    }

    /**
     * Set 用户操作的目的 ID，如点赞等，该字段就是被点赞的消息 ID，如果是投票，则为被投号码的 ID。
     * @param RootId 用户操作的目的 ID，如点赞等，该字段就是被点赞的消息 ID，如果是投票，则为被投号码的 ID。
     */
    public void setRootId(String RootId) {
        this.RootId = RootId;
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
     * Get 手机设备号。支持以下格式：
1.imei明文
2.idfa明文,
3.imei小写后MD5值小写
4.idfa大写后MD5值小写 
     * @return Imei 手机设备号。支持以下格式：
1.imei明文
2.idfa明文,
3.imei小写后MD5值小写
4.idfa大写后MD5值小写
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 手机设备号。支持以下格式：
1.imei明文
2.idfa明文,
3.imei小写后MD5值小写
4.idfa大写后MD5值小写
     * @param Imei 手机设备号。支持以下格式：
1.imei明文
2.idfa明文,
3.imei小写后MD5值小写
4.idfa大写后MD5值小写
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
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
     * Get 1：微信公众号。
2：微信小程序。 
     * @return WxSubType 1：微信公众号。
2：微信小程序。
     */
    public String getWxSubType() {
        return this.WxSubType;
    }

    /**
     * Set 1：微信公众号。
2：微信小程序。
     * @param WxSubType 1：微信公众号。
2：微信小程序。
     */
    public void setWxSubType(String WxSubType) {
        this.WxSubType = WxSubType;
    }

    /**
     * Get Token 签名随机数，WxSubType为微信小程序时必填，建议16个字符。 
     * @return RandNum Token 签名随机数，WxSubType为微信小程序时必填，建议16个字符。
     */
    public String getRandNum() {
        return this.RandNum;
    }

    /**
     * Set Token 签名随机数，WxSubType为微信小程序时必填，建议16个字符。
     * @param RandNum Token 签名随机数，WxSubType为微信小程序时必填，建议16个字符。
     */
    public void setRandNum(String RandNum) {
        this.RandNum = RandNum;
    }

    /**
     * Get 如果 accountType为2而且wxSubType有填，该字段必选，否则不需要填写；
如果是微信小程序（WxSubType=2），该字段为以ssesion_key为key去签名随机数radnNum得到的值（ hmac_sha256签名算法）；如果是微信公众号或第三方登录，则为授权的access_token（网页版本的access_Token,而且获取token的scope字段必需填写snsapi_userinfo；） 
     * @return WxToken 如果 accountType为2而且wxSubType有填，该字段必选，否则不需要填写；
如果是微信小程序（WxSubType=2），该字段为以ssesion_key为key去签名随机数radnNum得到的值（ hmac_sha256签名算法）；如果是微信公众号或第三方登录，则为授权的access_token（网页版本的access_Token,而且获取token的scope字段必需填写snsapi_userinfo；）
     */
    public String getWxToken() {
        return this.WxToken;
    }

    /**
     * Set 如果 accountType为2而且wxSubType有填，该字段必选，否则不需要填写；
如果是微信小程序（WxSubType=2），该字段为以ssesion_key为key去签名随机数radnNum得到的值（ hmac_sha256签名算法）；如果是微信公众号或第三方登录，则为授权的access_token（网页版本的access_Token,而且获取token的scope字段必需填写snsapi_userinfo；）
     * @param WxToken 如果 accountType为2而且wxSubType有填，该字段必选，否则不需要填写；
如果是微信小程序（WxSubType=2），该字段为以ssesion_key为key去签名随机数radnNum得到的值（ hmac_sha256签名算法）；如果是微信公众号或第三方登录，则为授权的access_token（网页版本的access_Token,而且获取token的scope字段必需填写snsapi_userinfo；）
     */
    public void setWxToken(String WxToken) {
        this.WxToken = WxToken;
    }

    /**
     * Get 是否识别设备异常：
0：不识别。
1：识别。 
     * @return CheckDevice 是否识别设备异常：
0：不识别。
1：识别。
     */
    public String getCheckDevice() {
        return this.CheckDevice;
    }

    /**
     * Set 是否识别设备异常：
0：不识别。
1：识别。
     * @param CheckDevice 是否识别设备异常：
0：不识别。
1：识别。
     */
    public void setCheckDevice(String CheckDevice) {
        this.CheckDevice = CheckDevice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "AppIdU", this.AppIdU);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "RegisterIp", this.RegisterIp);
        this.setParamSimple(map, prefix + "CookieHash", this.CookieHash);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "LoginSource", this.LoginSource);
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamSimple(map, prefix + "LoginSpend", this.LoginSpend);
        this.setParamSimple(map, prefix + "RootId", this.RootId);
        this.setParamSimple(map, prefix + "Referer", this.Referer);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "XForwardedFor", this.XForwardedFor);
        this.setParamSimple(map, prefix + "MouseClickCount", this.MouseClickCount);
        this.setParamSimple(map, prefix + "KeyboardClickCount", this.KeyboardClickCount);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "VendorId", this.VendorId);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "WxSubType", this.WxSubType);
        this.setParamSimple(map, prefix + "RandNum", this.RandNum);
        this.setParamSimple(map, prefix + "WxToken", this.WxToken);
        this.setParamSimple(map, prefix + "CheckDevice", this.CheckDevice);

    }
}

