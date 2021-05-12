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

public class InputActivityAntiRushAdvanced extends AbstractModel{

    /**
    * 账号信息。
    */
    @SerializedName("Account")
    @Expose
    private AccountInfo Account;

    /**
    * 用户IP（外网有效IP地址）。
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 可选填写。详情请跳转至SponsorInfo查看。
    */
    @SerializedName("Sponsor")
    @Expose
    private SponsorInfo Sponsor;

    /**
    * 可选填写。详情请跳转至OnlineScamInfo查看。
    */
    @SerializedName("OnlineScam")
    @Expose
    private OnlineScamInfo OnlineScam;

    /**
    * 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * 昵称，UTF-8 编码。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 用户邮箱地址（非系统自动生成）。
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 是否识别设备异常：
0：不识别。
1：识别。
    */
    @SerializedName("CheckDevice")
    @Expose
    private Long CheckDevice;

    /**
    * 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。
    */
    @SerializedName("CookieHash")
    @Expose
    private String CookieHash;

    /**
    * 用户HTTP请求的Referer值。
    */
    @SerializedName("Referer")
    @Expose
    private String Referer;

    /**
    * 用户HTTP请求的User-Agent值。
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 用户HTTP请求的X-Forwarded-For值。
    */
    @SerializedName("XForwardedFor")
    @Expose
    private String XForwardedFor;

    /**
    * MAC地址或设备唯一标识。
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 手机制造商ID，如果手机注册，请带上此信息。
    */
    @SerializedName("VendorId")
    @Expose
    private String VendorId;

    /**
     * Get 账号信息。 
     * @return Account 账号信息。
     */
    public AccountInfo getAccount() {
        return this.Account;
    }

    /**
     * Set 账号信息。
     * @param Account 账号信息。
     */
    public void setAccount(AccountInfo Account) {
        this.Account = Account;
    }

    /**
     * Get 用户IP（外网有效IP地址）。 
     * @return UserIp 用户IP（外网有效IP地址）。
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户IP（外网有效IP地址）。
     * @param UserIp 用户IP（外网有效IP地址）。
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。 
     * @return PostTime 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。
     * @param PostTime 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）。
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 可选填写。详情请跳转至SponsorInfo查看。 
     * @return Sponsor 可选填写。详情请跳转至SponsorInfo查看。
     */
    public SponsorInfo getSponsor() {
        return this.Sponsor;
    }

    /**
     * Set 可选填写。详情请跳转至SponsorInfo查看。
     * @param Sponsor 可选填写。详情请跳转至SponsorInfo查看。
     */
    public void setSponsor(SponsorInfo Sponsor) {
        this.Sponsor = Sponsor;
    }

    /**
     * Get 可选填写。详情请跳转至OnlineScamInfo查看。 
     * @return OnlineScam 可选填写。详情请跳转至OnlineScamInfo查看。
     */
    public OnlineScamInfo getOnlineScam() {
        return this.OnlineScam;
    }

    /**
     * Set 可选填写。详情请跳转至OnlineScamInfo查看。
     * @param OnlineScam 可选填写。详情请跳转至OnlineScamInfo查看。
     */
    public void setOnlineScam(OnlineScamInfo OnlineScam) {
        this.OnlineScam = OnlineScam;
    }

    /**
     * Get 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。 
     * @return BusinessId 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。
     * @param BusinessId 业务ID。网站或应用在多个业务中使用此服务，通过此ID区分统计数据。
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 昵称，UTF-8 编码。 
     * @return Nickname 昵称，UTF-8 编码。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称，UTF-8 编码。
     * @param Nickname 昵称，UTF-8 编码。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
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
     * Get 是否识别设备异常：
0：不识别。
1：识别。 
     * @return CheckDevice 是否识别设备异常：
0：不识别。
1：识别。
     */
    public Long getCheckDevice() {
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
    public void setCheckDevice(Long CheckDevice) {
        this.CheckDevice = CheckDevice;
    }

    /**
     * Get 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。 
     * @return CookieHash 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。
     */
    public String getCookieHash() {
        return this.CookieHash;
    }

    /**
     * Set 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。
     * @param CookieHash 用户HTTP请求中的Cookie进行2次hash的值，只要保证相同Cookie的hash值一致即可。
     */
    public void setCookieHash(String CookieHash) {
        this.CookieHash = CookieHash;
    }

    /**
     * Get 用户HTTP请求的Referer值。 
     * @return Referer 用户HTTP请求的Referer值。
     */
    public String getReferer() {
        return this.Referer;
    }

    /**
     * Set 用户HTTP请求的Referer值。
     * @param Referer 用户HTTP请求的Referer值。
     */
    public void setReferer(String Referer) {
        this.Referer = Referer;
    }

    /**
     * Get 用户HTTP请求的User-Agent值。 
     * @return UserAgent 用户HTTP请求的User-Agent值。
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 用户HTTP请求的User-Agent值。
     * @param UserAgent 用户HTTP请求的User-Agent值。
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 用户HTTP请求的X-Forwarded-For值。 
     * @return XForwardedFor 用户HTTP请求的X-Forwarded-For值。
     */
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    /**
     * Set 用户HTTP请求的X-Forwarded-For值。
     * @param XForwardedFor 用户HTTP请求的X-Forwarded-For值。
     */
    public void setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
    }

    /**
     * Get MAC地址或设备唯一标识。 
     * @return MacAddress MAC地址或设备唯一标识。
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set MAC地址或设备唯一标识。
     * @param MacAddress MAC地址或设备唯一标识。
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get 手机制造商ID，如果手机注册，请带上此信息。 
     * @return VendorId 手机制造商ID，如果手机注册，请带上此信息。
     */
    public String getVendorId() {
        return this.VendorId;
    }

    /**
     * Set 手机制造商ID，如果手机注册，请带上此信息。
     * @param VendorId 手机制造商ID，如果手机注册，请带上此信息。
     */
    public void setVendorId(String VendorId) {
        this.VendorId = VendorId;
    }

    public InputActivityAntiRushAdvanced() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputActivityAntiRushAdvanced(InputActivityAntiRushAdvanced source) {
        if (source.Account != null) {
            this.Account = new AccountInfo(source.Account);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.PostTime != null) {
            this.PostTime = new Long(source.PostTime);
        }
        if (source.Sponsor != null) {
            this.Sponsor = new SponsorInfo(source.Sponsor);
        }
        if (source.OnlineScam != null) {
            this.OnlineScam = new OnlineScamInfo(source.OnlineScam);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamObj(map, prefix + "Sponsor.", this.Sponsor);
        this.setParamObj(map, prefix + "OnlineScam.", this.OnlineScam);
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

    }
}

