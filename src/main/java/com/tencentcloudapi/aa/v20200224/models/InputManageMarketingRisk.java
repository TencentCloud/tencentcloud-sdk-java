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

public class InputManageMarketingRisk extends AbstractModel{

    /**
    * 账号信息。
    */
    @SerializedName("Account")
    @Expose
    private AccountInfo Account;

    /**
    * 登录来源的外网IP
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
    * 场景类型。(后续不再支持，请使用SceneCode字段)
1：活动防刷
2：登录保护
3：注册保护
4：活动防刷高级版（网赚）
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * 用户唯一标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 设备指纹token。
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * 设备指纹BusinessId
    */
    @SerializedName("DeviceBusinessId")
    @Expose
    private Long DeviceBusinessId;

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
    * 网赚防刷相关信息。SceneType为4时填写。
    */
    @SerializedName("CrowdAntiRush")
    @Expose
    private CrowdAntiRushInfo CrowdAntiRush;

    /**
    * 场景Code，控制台上获取
    */
    @SerializedName("SceneCode")
    @Expose
    private String SceneCode;

    /**
    * 详细信息
    */
    @SerializedName("Details")
    @Expose
    private InputDetails [] Details;

    /**
    * 设备类型：
1：Android
2：IOS
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

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
     * Get 登录来源的外网IP 
     * @return UserIp 登录来源的外网IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 登录来源的外网IP
     * @param UserIp 登录来源的外网IP
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
     * Get 场景类型。(后续不再支持，请使用SceneCode字段)
1：活动防刷
2：登录保护
3：注册保护
4：活动防刷高级版（网赚） 
     * @return SceneType 场景类型。(后续不再支持，请使用SceneCode字段)
1：活动防刷
2：登录保护
3：注册保护
4：活动防刷高级版（网赚）
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 场景类型。(后续不再支持，请使用SceneCode字段)
1：活动防刷
2：登录保护
3：注册保护
4：活动防刷高级版（网赚）
     * @param SceneType 场景类型。(后续不再支持，请使用SceneCode字段)
1：活动防刷
2：登录保护
3：注册保护
4：活动防刷高级版（网赚）
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get 用户唯一标识。 
     * @return UserId 用户唯一标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一标识。
     * @param UserId 用户唯一标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 设备指纹token。 
     * @return DeviceToken 设备指纹token。
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set 设备指纹token。
     * @param DeviceToken 设备指纹token。
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get 设备指纹BusinessId 
     * @return DeviceBusinessId 设备指纹BusinessId
     */
    public Long getDeviceBusinessId() {
        return this.DeviceBusinessId;
    }

    /**
     * Set 设备指纹BusinessId
     * @param DeviceBusinessId 设备指纹BusinessId
     */
    public void setDeviceBusinessId(Long DeviceBusinessId) {
        this.DeviceBusinessId = DeviceBusinessId;
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
     * Get 网赚防刷相关信息。SceneType为4时填写。 
     * @return CrowdAntiRush 网赚防刷相关信息。SceneType为4时填写。
     */
    public CrowdAntiRushInfo getCrowdAntiRush() {
        return this.CrowdAntiRush;
    }

    /**
     * Set 网赚防刷相关信息。SceneType为4时填写。
     * @param CrowdAntiRush 网赚防刷相关信息。SceneType为4时填写。
     */
    public void setCrowdAntiRush(CrowdAntiRushInfo CrowdAntiRush) {
        this.CrowdAntiRush = CrowdAntiRush;
    }

    /**
     * Get 场景Code，控制台上获取 
     * @return SceneCode 场景Code，控制台上获取
     */
    public String getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景Code，控制台上获取
     * @param SceneCode 场景Code，控制台上获取
     */
    public void setSceneCode(String SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get 详细信息 
     * @return Details 详细信息
     */
    public InputDetails [] getDetails() {
        return this.Details;
    }

    /**
     * Set 详细信息
     * @param Details 详细信息
     */
    public void setDetails(InputDetails [] Details) {
        this.Details = Details;
    }

    /**
     * Get 设备类型：
1：Android
2：IOS 
     * @return DeviceType 设备类型：
1：Android
2：IOS
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型：
1：Android
2：IOS
     * @param DeviceType 设备类型：
1：Android
2：IOS
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
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
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.PostTime != null) {
            this.PostTime = new Long(source.PostTime);
        }
        if (source.SceneType != null) {
            this.SceneType = new Long(source.SceneType);
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
        if (source.CrowdAntiRush != null) {
            this.CrowdAntiRush = new CrowdAntiRushInfo(source.CrowdAntiRush);
        }
        if (source.SceneCode != null) {
            this.SceneCode = new String(source.SceneCode);
        }
        if (source.Details != null) {
            this.Details = new InputDetails[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new InputDetails(source.Details[i]);
            }
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
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
        this.setParamObj(map, prefix + "CrowdAntiRush.", this.CrowdAntiRush);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

