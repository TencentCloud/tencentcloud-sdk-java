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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportEventRequest extends AbstractModel {

    /**
    * <p>事件码，标准事件包含：</p><p>枚举值：</p><ul><li>login： 登录</li><li>register： 注册</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>charge_back： 拒付</li><li>sms： 短信</li><li>logout： 登出</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>security_verification： 安全验证</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li><li>withdraw： 提现</li><li>cust_event： 自定义事件，cust_xxx</li><li>scan_code： 扫码</li><li>lucky_draw： 抽奖</li><li>task： 做任务</li><li>invitation： 邀请</li><li>claim_red_packet： 领红包</li><li>browse： 浏览</li></ul><p>自定义事件可与RCE约定后进行风险评估</p>
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * <p>事件的发生时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * <p>用户当前会话 ID， 用于关联用户登录前后的动作，如果没有传UserId，则SessionId必传，如缺失则可填充空字符串</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p>
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * <p>客户端 IP 地址（IPv4或IPv6）</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * <p>事件详情，根据您输入的事件码传入对应的事件信息</p>
    */
    @SerializedName("EventDetail")
    @Expose
    private EventDetail EventDetail;

    /**
    * <p>用户在您系统中的唯一ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户邮箱</p>
    */
    @SerializedName("UserEmail")
    @Expose
    private String UserEmail;

    /**
    * <p>用户提供的联系方式</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
    */
    @SerializedName("UserPhone")
    @Expose
    private String UserPhone;

    /**
    * <p>web浏览器相关信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p>
    */
    @SerializedName("Browser")
    @Expose
    private Browser Browser;

    /**
    * <p>应用程序、操作系统和移动设备详细信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p>
    */
    @SerializedName("App")
    @Expose
    private App App;

    /**
    * <p>数据授权信息，国内地域必填</p>
    */
    @SerializedName("DataAuthorization")
    @Expose
    private DataAuthorization DataAuthorization;

    /**
    * <p>手机号码加密方式，国内地域必填</p><p>枚举值：</p><ul><li>md5： md5加密</li><li>plain： 明文</li></ul>
    */
    @SerializedName("UserPhoneEncrypt")
    @Expose
    private String UserPhoneEncrypt;

    /**
    * <p>微信开放账号</p>
    */
    @SerializedName("WeChatOpenId")
    @Expose
    private String WeChatOpenId;

    /**
    * <p>QQ开放账号</p>
    */
    @SerializedName("QQOpenId")
    @Expose
    private String QQOpenId;

    /**
    * <p>QQ应用ID，当传入QQ开放账号时，该字段必填，QQ分配给网站或应用的AppId，用来唯一标识网站或应用</p>
    */
    @SerializedName("QQAppId")
    @Expose
    private String QQAppId;

    /**
     * Get <p>事件码，标准事件包含：</p><p>枚举值：</p><ul><li>login： 登录</li><li>register： 注册</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>charge_back： 拒付</li><li>sms： 短信</li><li>logout： 登出</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>security_verification： 安全验证</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li><li>withdraw： 提现</li><li>cust_event： 自定义事件，cust_xxx</li><li>scan_code： 扫码</li><li>lucky_draw： 抽奖</li><li>task： 做任务</li><li>invitation： 邀请</li><li>claim_red_packet： 领红包</li><li>browse： 浏览</li></ul><p>自定义事件可与RCE约定后进行风险评估</p> 
     * @return EventCode <p>事件码，标准事件包含：</p><p>枚举值：</p><ul><li>login： 登录</li><li>register： 注册</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>charge_back： 拒付</li><li>sms： 短信</li><li>logout： 登出</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>security_verification： 安全验证</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li><li>withdraw： 提现</li><li>cust_event： 自定义事件，cust_xxx</li><li>scan_code： 扫码</li><li>lucky_draw： 抽奖</li><li>task： 做任务</li><li>invitation： 邀请</li><li>claim_red_packet： 领红包</li><li>browse： 浏览</li></ul><p>自定义事件可与RCE约定后进行风险评估</p>
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set <p>事件码，标准事件包含：</p><p>枚举值：</p><ul><li>login： 登录</li><li>register： 注册</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>charge_back： 拒付</li><li>sms： 短信</li><li>logout： 登出</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>security_verification： 安全验证</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li><li>withdraw： 提现</li><li>cust_event： 自定义事件，cust_xxx</li><li>scan_code： 扫码</li><li>lucky_draw： 抽奖</li><li>task： 做任务</li><li>invitation： 邀请</li><li>claim_red_packet： 领红包</li><li>browse： 浏览</li></ul><p>自定义事件可与RCE约定后进行风险评估</p>
     * @param EventCode <p>事件码，标准事件包含：</p><p>枚举值：</p><ul><li>login： 登录</li><li>register： 注册</li><li>create_order： 创建订单</li><li>transaction： 交易支付</li><li>charge_back： 拒付</li><li>sms： 短信</li><li>logout： 登出</li><li>modify_account： 修改账号</li><li>modify_password： 修改密码</li><li>security_verification： 安全验证</li><li>add_promotion： 参加营销活动</li><li>redeem： 兑奖</li><li>withdraw： 提现</li><li>cust_event： 自定义事件，cust_xxx</li><li>scan_code： 扫码</li><li>lucky_draw： 抽奖</li><li>task： 做任务</li><li>invitation： 邀请</li><li>claim_red_packet： 领红包</li><li>browse： 浏览</li></ul><p>自定义事件可与RCE约定后进行风险评估</p>
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get <p>事件的发生时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p> 
     * @return EventTime <p>事件的发生时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>事件的发生时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     * @param EventTime <p>事件的发生时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>用户当前会话 ID， 用于关联用户登录前后的动作，如果没有传UserId，则SessionId必传，如缺失则可填充空字符串</p> 
     * @return SessionId <p>用户当前会话 ID， 用于关联用户登录前后的动作，如果没有传UserId，则SessionId必传，如缺失则可填充空字符串</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用户当前会话 ID， 用于关联用户登录前后的动作，如果没有传UserId，则SessionId必传，如缺失则可填充空字符串</p>
     * @param SessionId <p>用户当前会话 ID， 用于关联用户登录前后的动作，如果没有传UserId，则SessionId必传，如缺失则可填充空字符串</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p> 
     * @return DeviceToken <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p>
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p>
     * @param DeviceToken <p>用户设备指纹token标识，在您的网站或者应用程序中集成设备指纹的SDK后获取</p>
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get <p>客户端 IP 地址（IPv4或IPv6）</p> 
     * @return UserIp <p>客户端 IP 地址（IPv4或IPv6）</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>客户端 IP 地址（IPv4或IPv6）</p>
     * @param UserIp <p>客户端 IP 地址（IPv4或IPv6）</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get <p>事件详情，根据您输入的事件码传入对应的事件信息</p> 
     * @return EventDetail <p>事件详情，根据您输入的事件码传入对应的事件信息</p>
     */
    public EventDetail getEventDetail() {
        return this.EventDetail;
    }

    /**
     * Set <p>事件详情，根据您输入的事件码传入对应的事件信息</p>
     * @param EventDetail <p>事件详情，根据您输入的事件码传入对应的事件信息</p>
     */
    public void setEventDetail(EventDetail EventDetail) {
        this.EventDetail = EventDetail;
    }

    /**
     * Get <p>用户在您系统中的唯一ID</p> 
     * @return UserId <p>用户在您系统中的唯一ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户在您系统中的唯一ID</p>
     * @param UserId <p>用户在您系统中的唯一ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>用户邮箱</p> 
     * @return UserEmail <p>用户邮箱</p>
     */
    public String getUserEmail() {
        return this.UserEmail;
    }

    /**
     * Set <p>用户邮箱</p>
     * @param UserEmail <p>用户邮箱</p>
     */
    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    /**
     * Get <p>用户提供的联系方式</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p> 
     * @return UserPhone <p>用户提供的联系方式</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public String getUserPhone() {
        return this.UserPhone;
    }

    /**
     * Set <p>用户提供的联系方式</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     * @param UserPhone <p>用户提供的联系方式</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public void setUserPhone(String UserPhone) {
        this.UserPhone = UserPhone;
    }

    /**
     * Get <p>web浏览器相关信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p> 
     * @return Browser <p>web浏览器相关信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p>
     */
    public Browser getBrowser() {
        return this.Browser;
    }

    /**
     * Set <p>web浏览器相关信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p>
     * @param Browser <p>web浏览器相关信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p>
     */
    public void setBrowser(Browser Browser) {
        this.Browser = Browser;
    }

    /**
     * Get <p>应用程序、操作系统和移动设备详细信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p> 
     * @return App <p>应用程序、操作系统和移动设备详细信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p>
     */
    public App getApp() {
        return this.App;
    }

    /**
     * Set <p>应用程序、操作系统和移动设备详细信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p>
     * @param App <p>应用程序、操作系统和移动设备详细信息，若您已集成我们的设备指纹SDK，则无需传入此字段</p>
     */
    public void setApp(App App) {
        this.App = App;
    }

    /**
     * Get <p>数据授权信息，国内地域必填</p> 
     * @return DataAuthorization <p>数据授权信息，国内地域必填</p>
     */
    public DataAuthorization getDataAuthorization() {
        return this.DataAuthorization;
    }

    /**
     * Set <p>数据授权信息，国内地域必填</p>
     * @param DataAuthorization <p>数据授权信息，国内地域必填</p>
     */
    public void setDataAuthorization(DataAuthorization DataAuthorization) {
        this.DataAuthorization = DataAuthorization;
    }

    /**
     * Get <p>手机号码加密方式，国内地域必填</p><p>枚举值：</p><ul><li>md5： md5加密</li><li>plain： 明文</li></ul> 
     * @return UserPhoneEncrypt <p>手机号码加密方式，国内地域必填</p><p>枚举值：</p><ul><li>md5： md5加密</li><li>plain： 明文</li></ul>
     */
    public String getUserPhoneEncrypt() {
        return this.UserPhoneEncrypt;
    }

    /**
     * Set <p>手机号码加密方式，国内地域必填</p><p>枚举值：</p><ul><li>md5： md5加密</li><li>plain： 明文</li></ul>
     * @param UserPhoneEncrypt <p>手机号码加密方式，国内地域必填</p><p>枚举值：</p><ul><li>md5： md5加密</li><li>plain： 明文</li></ul>
     */
    public void setUserPhoneEncrypt(String UserPhoneEncrypt) {
        this.UserPhoneEncrypt = UserPhoneEncrypt;
    }

    /**
     * Get <p>微信开放账号</p> 
     * @return WeChatOpenId <p>微信开放账号</p>
     */
    public String getWeChatOpenId() {
        return this.WeChatOpenId;
    }

    /**
     * Set <p>微信开放账号</p>
     * @param WeChatOpenId <p>微信开放账号</p>
     */
    public void setWeChatOpenId(String WeChatOpenId) {
        this.WeChatOpenId = WeChatOpenId;
    }

    /**
     * Get <p>QQ开放账号</p> 
     * @return QQOpenId <p>QQ开放账号</p>
     */
    public String getQQOpenId() {
        return this.QQOpenId;
    }

    /**
     * Set <p>QQ开放账号</p>
     * @param QQOpenId <p>QQ开放账号</p>
     */
    public void setQQOpenId(String QQOpenId) {
        this.QQOpenId = QQOpenId;
    }

    /**
     * Get <p>QQ应用ID，当传入QQ开放账号时，该字段必填，QQ分配给网站或应用的AppId，用来唯一标识网站或应用</p> 
     * @return QQAppId <p>QQ应用ID，当传入QQ开放账号时，该字段必填，QQ分配给网站或应用的AppId，用来唯一标识网站或应用</p>
     */
    public String getQQAppId() {
        return this.QQAppId;
    }

    /**
     * Set <p>QQ应用ID，当传入QQ开放账号时，该字段必填，QQ分配给网站或应用的AppId，用来唯一标识网站或应用</p>
     * @param QQAppId <p>QQ应用ID，当传入QQ开放账号时，该字段必填，QQ分配给网站或应用的AppId，用来唯一标识网站或应用</p>
     */
    public void setQQAppId(String QQAppId) {
        this.QQAppId = QQAppId;
    }

    public ReportEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportEventRequest(ReportEventRequest source) {
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.EventDetail != null) {
            this.EventDetail = new EventDetail(source.EventDetail);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserEmail != null) {
            this.UserEmail = new String(source.UserEmail);
        }
        if (source.UserPhone != null) {
            this.UserPhone = new String(source.UserPhone);
        }
        if (source.Browser != null) {
            this.Browser = new Browser(source.Browser);
        }
        if (source.App != null) {
            this.App = new App(source.App);
        }
        if (source.DataAuthorization != null) {
            this.DataAuthorization = new DataAuthorization(source.DataAuthorization);
        }
        if (source.UserPhoneEncrypt != null) {
            this.UserPhoneEncrypt = new String(source.UserPhoneEncrypt);
        }
        if (source.WeChatOpenId != null) {
            this.WeChatOpenId = new String(source.WeChatOpenId);
        }
        if (source.QQOpenId != null) {
            this.QQOpenId = new String(source.QQOpenId);
        }
        if (source.QQAppId != null) {
            this.QQAppId = new String(source.QQAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamObj(map, prefix + "EventDetail.", this.EventDetail);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserEmail", this.UserEmail);
        this.setParamSimple(map, prefix + "UserPhone", this.UserPhone);
        this.setParamObj(map, prefix + "Browser.", this.Browser);
        this.setParamObj(map, prefix + "App.", this.App);
        this.setParamObj(map, prefix + "DataAuthorization.", this.DataAuthorization);
        this.setParamSimple(map, prefix + "UserPhoneEncrypt", this.UserPhoneEncrypt);
        this.setParamSimple(map, prefix + "WeChatOpenId", this.WeChatOpenId);
        this.setParamSimple(map, prefix + "QQOpenId", this.QQOpenId);
        this.setParamSimple(map, prefix + "QQAppId", this.QQAppId);

    }
}

