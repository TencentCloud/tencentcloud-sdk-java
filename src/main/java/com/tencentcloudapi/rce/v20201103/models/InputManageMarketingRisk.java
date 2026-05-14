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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputManageMarketingRisk extends AbstractModel {

    /**
    * <p>用户账号类型；默认开通QQOpenId、手机号MD5权限；如果需要使用微信OpenId入参，则需要&quot;提交工单&quot;或联系对接人进行资格审核，审核通过后方可正常使用微信开放账号。<br>1：QQ开放账号<br>2：微信开放账号<br>10004：手机号MD5，中国大陆11位手机号进行MD5加密，取32位小写值<br>10005：手机号SHA256，中国大陆11位手机号进行SHA256加密，取64位小写值</p>
    */
    @SerializedName("Account")
    @Expose
    private AccountInfo Account;

    /**
    * <p>场景码，用于识别和区分不同的业务场景，可在控制台上新建和管理<br>控制台链接：https://console.cloud.tencent.com/rce/risk/strategy/scene-root<br>活动防刷默认场景码：e_activity_antirush<br>登录保护默认场景码：e_login_protection<br>注册保护默认场景码：e_register_protection</p>
    */
    @SerializedName("SceneCode")
    @Expose
    private String SceneCode;

    /**
    * <p>用户外网ip（传入用户非外网ip会影响判断结果）。</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * <p>用户操作时间戳，精确到秒。</p>
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * <p>业务平台用户唯一标识，支持自定义。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>设备指纹DeviceToken值，集成设备指纹后获取；如果集成了相应的设备指纹，该字段必填。</p>
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * <p>设备指纹 BusinessId。</p>
    */
    @SerializedName("DeviceBusinessId")
    @Expose
    private Long DeviceBusinessId;

    /**
    * <p>业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。</p>
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * <p>昵称，UTF-8 编码。</p>
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * <p>用户邮箱地址。</p>
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * <p>是否识别设备异常：<br>0：不识别。<br>1：识别。</p>
    */
    @SerializedName("CheckDevice")
    @Expose
    private Long CheckDevice;

    /**
    * <p>用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。</p>
    */
    @SerializedName("CookieHash")
    @Expose
    private String CookieHash;

    /**
    * <p>用户HTTP请求的Referer值。</p>
    */
    @SerializedName("Referer")
    @Expose
    private String Referer;

    /**
    * <p>用户HTTP请求的User-Agent值。</p>
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * <p>用户HTTP请求的X-Forwarded-For值。</p>
    */
    @SerializedName("XForwardedFor")
    @Expose
    private String XForwardedFor;

    /**
    * <p>MAC地址或设备唯一标识。</p>
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * <p>手机制造商ID，如果手机注册，请带上此信息。</p>
    */
    @SerializedName("VendorId")
    @Expose
    private String VendorId;

    /**
    * <p>设备类型(已不推荐使用)。</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * <p>扩展字段。</p>
    */
    @SerializedName("Details")
    @Expose
    private InputDetails [] Details;

    /**
    * <p>邀请助力场景相关信息。</p>
    */
    @SerializedName("Sponsor")
    @Expose
    private SponsorInfo Sponsor;

    /**
    * <p>详情请跳转至OnlineScamInfo查看。</p>
    */
    @SerializedName("OnlineScam")
    @Expose
    private OnlineScamInfo OnlineScam;

    /**
    * <p>1：Android<br>2：iOS<br>3：H5<br>4：小程序<br>5：鸿蒙</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>数据授权信息。<br>注意：新接入通用业务欺诈保护（RCE）服务的客户该字段【必传】。</p>
    */
    @SerializedName("DataAuthorization")
    @Expose
    private DataAuthorizationInfo DataAuthorization;

    /**
     * Get <p>用户账号类型；默认开通QQOpenId、手机号MD5权限；如果需要使用微信OpenId入参，则需要&quot;提交工单&quot;或联系对接人进行资格审核，审核通过后方可正常使用微信开放账号。<br>1：QQ开放账号<br>2：微信开放账号<br>10004：手机号MD5，中国大陆11位手机号进行MD5加密，取32位小写值<br>10005：手机号SHA256，中国大陆11位手机号进行SHA256加密，取64位小写值</p> 
     * @return Account <p>用户账号类型；默认开通QQOpenId、手机号MD5权限；如果需要使用微信OpenId入参，则需要&quot;提交工单&quot;或联系对接人进行资格审核，审核通过后方可正常使用微信开放账号。<br>1：QQ开放账号<br>2：微信开放账号<br>10004：手机号MD5，中国大陆11位手机号进行MD5加密，取32位小写值<br>10005：手机号SHA256，中国大陆11位手机号进行SHA256加密，取64位小写值</p>
     */
    public AccountInfo getAccount() {
        return this.Account;
    }

    /**
     * Set <p>用户账号类型；默认开通QQOpenId、手机号MD5权限；如果需要使用微信OpenId入参，则需要&quot;提交工单&quot;或联系对接人进行资格审核，审核通过后方可正常使用微信开放账号。<br>1：QQ开放账号<br>2：微信开放账号<br>10004：手机号MD5，中国大陆11位手机号进行MD5加密，取32位小写值<br>10005：手机号SHA256，中国大陆11位手机号进行SHA256加密，取64位小写值</p>
     * @param Account <p>用户账号类型；默认开通QQOpenId、手机号MD5权限；如果需要使用微信OpenId入参，则需要&quot;提交工单&quot;或联系对接人进行资格审核，审核通过后方可正常使用微信开放账号。<br>1：QQ开放账号<br>2：微信开放账号<br>10004：手机号MD5，中国大陆11位手机号进行MD5加密，取32位小写值<br>10005：手机号SHA256，中国大陆11位手机号进行SHA256加密，取64位小写值</p>
     */
    public void setAccount(AccountInfo Account) {
        this.Account = Account;
    }

    /**
     * Get <p>场景码，用于识别和区分不同的业务场景，可在控制台上新建和管理<br>控制台链接：https://console.cloud.tencent.com/rce/risk/strategy/scene-root<br>活动防刷默认场景码：e_activity_antirush<br>登录保护默认场景码：e_login_protection<br>注册保护默认场景码：e_register_protection</p> 
     * @return SceneCode <p>场景码，用于识别和区分不同的业务场景，可在控制台上新建和管理<br>控制台链接：https://console.cloud.tencent.com/rce/risk/strategy/scene-root<br>活动防刷默认场景码：e_activity_antirush<br>登录保护默认场景码：e_login_protection<br>注册保护默认场景码：e_register_protection</p>
     */
    public String getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set <p>场景码，用于识别和区分不同的业务场景，可在控制台上新建和管理<br>控制台链接：https://console.cloud.tencent.com/rce/risk/strategy/scene-root<br>活动防刷默认场景码：e_activity_antirush<br>登录保护默认场景码：e_login_protection<br>注册保护默认场景码：e_register_protection</p>
     * @param SceneCode <p>场景码，用于识别和区分不同的业务场景，可在控制台上新建和管理<br>控制台链接：https://console.cloud.tencent.com/rce/risk/strategy/scene-root<br>活动防刷默认场景码：e_activity_antirush<br>登录保护默认场景码：e_login_protection<br>注册保护默认场景码：e_register_protection</p>
     */
    public void setSceneCode(String SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get <p>用户外网ip（传入用户非外网ip会影响判断结果）。</p> 
     * @return UserIp <p>用户外网ip（传入用户非外网ip会影响判断结果）。</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>用户外网ip（传入用户非外网ip会影响判断结果）。</p>
     * @param UserIp <p>用户外网ip（传入用户非外网ip会影响判断结果）。</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get <p>用户操作时间戳，精确到秒。</p> 
     * @return PostTime <p>用户操作时间戳，精确到秒。</p>
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set <p>用户操作时间戳，精确到秒。</p>
     * @param PostTime <p>用户操作时间戳，精确到秒。</p>
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get <p>业务平台用户唯一标识，支持自定义。</p> 
     * @return UserId <p>业务平台用户唯一标识，支持自定义。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>业务平台用户唯一标识，支持自定义。</p>
     * @param UserId <p>业务平台用户唯一标识，支持自定义。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>设备指纹DeviceToken值，集成设备指纹后获取；如果集成了相应的设备指纹，该字段必填。</p> 
     * @return DeviceToken <p>设备指纹DeviceToken值，集成设备指纹后获取；如果集成了相应的设备指纹，该字段必填。</p>
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set <p>设备指纹DeviceToken值，集成设备指纹后获取；如果集成了相应的设备指纹，该字段必填。</p>
     * @param DeviceToken <p>设备指纹DeviceToken值，集成设备指纹后获取；如果集成了相应的设备指纹，该字段必填。</p>
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get <p>设备指纹 BusinessId。</p> 
     * @return DeviceBusinessId <p>设备指纹 BusinessId。</p>
     */
    public Long getDeviceBusinessId() {
        return this.DeviceBusinessId;
    }

    /**
     * Set <p>设备指纹 BusinessId。</p>
     * @param DeviceBusinessId <p>设备指纹 BusinessId。</p>
     */
    public void setDeviceBusinessId(Long DeviceBusinessId) {
        this.DeviceBusinessId = DeviceBusinessId;
    }

    /**
     * Get <p>业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。</p> 
     * @return BusinessId <p>业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。</p>
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set <p>业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。</p>
     * @param BusinessId <p>业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。</p>
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get <p>昵称，UTF-8 编码。</p> 
     * @return Nickname <p>昵称，UTF-8 编码。</p>
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set <p>昵称，UTF-8 编码。</p>
     * @param Nickname <p>昵称，UTF-8 编码。</p>
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get <p>用户邮箱地址。</p> 
     * @return EmailAddress <p>用户邮箱地址。</p>
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set <p>用户邮箱地址。</p>
     * @param EmailAddress <p>用户邮箱地址。</p>
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get <p>是否识别设备异常：<br>0：不识别。<br>1：识别。</p> 
     * @return CheckDevice <p>是否识别设备异常：<br>0：不识别。<br>1：识别。</p>
     */
    public Long getCheckDevice() {
        return this.CheckDevice;
    }

    /**
     * Set <p>是否识别设备异常：<br>0：不识别。<br>1：识别。</p>
     * @param CheckDevice <p>是否识别设备异常：<br>0：不识别。<br>1：识别。</p>
     */
    public void setCheckDevice(Long CheckDevice) {
        this.CheckDevice = CheckDevice;
    }

    /**
     * Get <p>用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。</p> 
     * @return CookieHash <p>用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。</p>
     */
    public String getCookieHash() {
        return this.CookieHash;
    }

    /**
     * Set <p>用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。</p>
     * @param CookieHash <p>用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。</p>
     */
    public void setCookieHash(String CookieHash) {
        this.CookieHash = CookieHash;
    }

    /**
     * Get <p>用户HTTP请求的Referer值。</p> 
     * @return Referer <p>用户HTTP请求的Referer值。</p>
     */
    public String getReferer() {
        return this.Referer;
    }

    /**
     * Set <p>用户HTTP请求的Referer值。</p>
     * @param Referer <p>用户HTTP请求的Referer值。</p>
     */
    public void setReferer(String Referer) {
        this.Referer = Referer;
    }

    /**
     * Get <p>用户HTTP请求的User-Agent值。</p> 
     * @return UserAgent <p>用户HTTP请求的User-Agent值。</p>
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set <p>用户HTTP请求的User-Agent值。</p>
     * @param UserAgent <p>用户HTTP请求的User-Agent值。</p>
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get <p>用户HTTP请求的X-Forwarded-For值。</p> 
     * @return XForwardedFor <p>用户HTTP请求的X-Forwarded-For值。</p>
     */
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    /**
     * Set <p>用户HTTP请求的X-Forwarded-For值。</p>
     * @param XForwardedFor <p>用户HTTP请求的X-Forwarded-For值。</p>
     */
    public void setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
    }

    /**
     * Get <p>MAC地址或设备唯一标识。</p> 
     * @return MacAddress <p>MAC地址或设备唯一标识。</p>
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set <p>MAC地址或设备唯一标识。</p>
     * @param MacAddress <p>MAC地址或设备唯一标识。</p>
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get <p>手机制造商ID，如果手机注册，请带上此信息。</p> 
     * @return VendorId <p>手机制造商ID，如果手机注册，请带上此信息。</p>
     */
    public String getVendorId() {
        return this.VendorId;
    }

    /**
     * Set <p>手机制造商ID，如果手机注册，请带上此信息。</p>
     * @param VendorId <p>手机制造商ID，如果手机注册，请带上此信息。</p>
     */
    public void setVendorId(String VendorId) {
        this.VendorId = VendorId;
    }

    /**
     * Get <p>设备类型(已不推荐使用)。</p> 
     * @return DeviceType <p>设备类型(已不推荐使用)。</p>
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>设备类型(已不推荐使用)。</p>
     * @param DeviceType <p>设备类型(已不推荐使用)。</p>
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>扩展字段。</p> 
     * @return Details <p>扩展字段。</p>
     */
    public InputDetails [] getDetails() {
        return this.Details;
    }

    /**
     * Set <p>扩展字段。</p>
     * @param Details <p>扩展字段。</p>
     */
    public void setDetails(InputDetails [] Details) {
        this.Details = Details;
    }

    /**
     * Get <p>邀请助力场景相关信息。</p> 
     * @return Sponsor <p>邀请助力场景相关信息。</p>
     */
    public SponsorInfo getSponsor() {
        return this.Sponsor;
    }

    /**
     * Set <p>邀请助力场景相关信息。</p>
     * @param Sponsor <p>邀请助力场景相关信息。</p>
     */
    public void setSponsor(SponsorInfo Sponsor) {
        this.Sponsor = Sponsor;
    }

    /**
     * Get <p>详情请跳转至OnlineScamInfo查看。</p> 
     * @return OnlineScam <p>详情请跳转至OnlineScamInfo查看。</p>
     */
    public OnlineScamInfo getOnlineScam() {
        return this.OnlineScam;
    }

    /**
     * Set <p>详情请跳转至OnlineScamInfo查看。</p>
     * @param OnlineScam <p>详情请跳转至OnlineScamInfo查看。</p>
     */
    public void setOnlineScam(OnlineScamInfo OnlineScam) {
        this.OnlineScam = OnlineScam;
    }

    /**
     * Get <p>1：Android<br>2：iOS<br>3：H5<br>4：小程序<br>5：鸿蒙</p> 
     * @return Platform <p>1：Android<br>2：iOS<br>3：H5<br>4：小程序<br>5：鸿蒙</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>1：Android<br>2：iOS<br>3：H5<br>4：小程序<br>5：鸿蒙</p>
     * @param Platform <p>1：Android<br>2：iOS<br>3：H5<br>4：小程序<br>5：鸿蒙</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>数据授权信息。<br>注意：新接入通用业务欺诈保护（RCE）服务的客户该字段【必传】。</p> 
     * @return DataAuthorization <p>数据授权信息。<br>注意：新接入通用业务欺诈保护（RCE）服务的客户该字段【必传】。</p>
     */
    public DataAuthorizationInfo getDataAuthorization() {
        return this.DataAuthorization;
    }

    /**
     * Set <p>数据授权信息。<br>注意：新接入通用业务欺诈保护（RCE）服务的客户该字段【必传】。</p>
     * @param DataAuthorization <p>数据授权信息。<br>注意：新接入通用业务欺诈保护（RCE）服务的客户该字段【必传】。</p>
     */
    public void setDataAuthorization(DataAuthorizationInfo DataAuthorization) {
        this.DataAuthorization = DataAuthorization;
    }

    public InputManageMarketingRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputManageMarketingRisk(InputManageMarketingRisk source) {
        if (source.Account != null) {
            this.Account = new AccountInfo(source.Account);
        }
        if (source.SceneCode != null) {
            this.SceneCode = new String(source.SceneCode);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.PostTime != null) {
            this.PostTime = new Long(source.PostTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
        if (source.DeviceBusinessId != null) {
            this.DeviceBusinessId = new Long(source.DeviceBusinessId);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new Long(source.BusinessId);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
        if (source.CheckDevice != null) {
            this.CheckDevice = new Long(source.CheckDevice);
        }
        if (source.CookieHash != null) {
            this.CookieHash = new String(source.CookieHash);
        }
        if (source.Referer != null) {
            this.Referer = new String(source.Referer);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.XForwardedFor != null) {
            this.XForwardedFor = new String(source.XForwardedFor);
        }
        if (source.MacAddress != null) {
            this.MacAddress = new String(source.MacAddress);
        }
        if (source.VendorId != null) {
            this.VendorId = new String(source.VendorId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.Details != null) {
            this.Details = new InputDetails[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new InputDetails(source.Details[i]);
            }
        }
        if (source.Sponsor != null) {
            this.Sponsor = new SponsorInfo(source.Sponsor);
        }
        if (source.OnlineScam != null) {
            this.OnlineScam = new OnlineScamInfo(source.OnlineScam);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.DataAuthorization != null) {
            this.DataAuthorization = new DataAuthorizationInfo(source.DataAuthorization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);
        this.setParamSimple(map, prefix + "DeviceBusinessId", this.DeviceBusinessId);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "CheckDevice", this.CheckDevice);
        this.setParamSimple(map, prefix + "CookieHash", this.CookieHash);
        this.setParamSimple(map, prefix + "Referer", this.Referer);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "XForwardedFor", this.XForwardedFor);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "VendorId", this.VendorId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamObj(map, prefix + "Sponsor.", this.Sponsor);
        this.setParamObj(map, prefix + "OnlineScam.", this.OnlineScam);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamObj(map, prefix + "DataAuthorization.", this.DataAuthorization);

    }
}

