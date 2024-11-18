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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaRceResultRequest extends AbstractModel {

    /**
    * 固定填值：9。
    */
    @SerializedName("CaptchaType")
    @Expose
    private Long CaptchaType;

    /**
    * 前端回调函数返回的用户验证票据
    */
    @SerializedName("Ticket")
    @Expose
    private String Ticket;

    /**
    * 业务侧获取到的验证码使用者的外网IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 前端回调函数返回的随机字符串
    */
    @SerializedName("Randstr")
    @Expose
    private String Randstr;

    /**
    * 验证码应用ID。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到CaptchaAppId。
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * 验证码应用密钥。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。
    */
    @SerializedName("AppSecretKey")
    @Expose
    private String AppSecretKey;

    /**
    * 预留字段
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * 预留字段
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * mac 地址或设备唯一标识
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 手机设备号
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 是否返回前端获取验证码时间，取值1：需要返回
    */
    @SerializedName("NeedGetCaptchaTime")
    @Expose
    private Long NeedGetCaptchaTime;

    /**
     * Get 固定填值：9。 
     * @return CaptchaType 固定填值：9。
     */
    public Long getCaptchaType() {
        return this.CaptchaType;
    }

    /**
     * Set 固定填值：9。
     * @param CaptchaType 固定填值：9。
     */
    public void setCaptchaType(Long CaptchaType) {
        this.CaptchaType = CaptchaType;
    }

    /**
     * Get 前端回调函数返回的用户验证票据 
     * @return Ticket 前端回调函数返回的用户验证票据
     */
    public String getTicket() {
        return this.Ticket;
    }

    /**
     * Set 前端回调函数返回的用户验证票据
     * @param Ticket 前端回调函数返回的用户验证票据
     */
    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    /**
     * Get 业务侧获取到的验证码使用者的外网IP 
     * @return UserIp 业务侧获取到的验证码使用者的外网IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 业务侧获取到的验证码使用者的外网IP
     * @param UserIp 业务侧获取到的验证码使用者的外网IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 前端回调函数返回的随机字符串 
     * @return Randstr 前端回调函数返回的随机字符串
     */
    public String getRandstr() {
        return this.Randstr;
    }

    /**
     * Set 前端回调函数返回的随机字符串
     * @param Randstr 前端回调函数返回的随机字符串
     */
    public void setRandstr(String Randstr) {
        this.Randstr = Randstr;
    }

    /**
     * Get 验证码应用ID。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到CaptchaAppId。 
     * @return CaptchaAppId 验证码应用ID。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到CaptchaAppId。
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set 验证码应用ID。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到CaptchaAppId。
     * @param CaptchaAppId 验证码应用ID。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到CaptchaAppId。
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get 验证码应用密钥。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。 
     * @return AppSecretKey 验证码应用密钥。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。
     */
    public String getAppSecretKey() {
        return this.AppSecretKey;
    }

    /**
     * Set 验证码应用密钥。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。
     * @param AppSecretKey 验证码应用密钥。登录 [验证码控制台](https://console.cloud.tencent.com/captcha/graphical)，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。
     */
    public void setAppSecretKey(String AppSecretKey) {
        this.AppSecretKey = AppSecretKey;
    }

    /**
     * Get 预留字段 
     * @return BusinessId 预留字段
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 预留字段
     * @param BusinessId 预留字段
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 预留字段 
     * @return SceneId 预留字段
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 预留字段
     * @param SceneId 预留字段
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get mac 地址或设备唯一标识 
     * @return MacAddress mac 地址或设备唯一标识
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set mac 地址或设备唯一标识
     * @param MacAddress mac 地址或设备唯一标识
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
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
     * Get 是否返回前端获取验证码时间，取值1：需要返回 
     * @return NeedGetCaptchaTime 是否返回前端获取验证码时间，取值1：需要返回
     */
    public Long getNeedGetCaptchaTime() {
        return this.NeedGetCaptchaTime;
    }

    /**
     * Set 是否返回前端获取验证码时间，取值1：需要返回
     * @param NeedGetCaptchaTime 是否返回前端获取验证码时间，取值1：需要返回
     */
    public void setNeedGetCaptchaTime(Long NeedGetCaptchaTime) {
        this.NeedGetCaptchaTime = NeedGetCaptchaTime;
    }

    public DescribeCaptchaRceResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaRceResultRequest(DescribeCaptchaRceResultRequest source) {
        if (source.CaptchaType != null) {
            this.CaptchaType = new Long(source.CaptchaType);
        }
        if (source.Ticket != null) {
            this.Ticket = new String(source.Ticket);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.Randstr != null) {
            this.Randstr = new String(source.Randstr);
        }
        if (source.CaptchaAppId != null) {
            this.CaptchaAppId = new Long(source.CaptchaAppId);
        }
        if (source.AppSecretKey != null) {
            this.AppSecretKey = new String(source.AppSecretKey);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new Long(source.BusinessId);
        }
        if (source.SceneId != null) {
            this.SceneId = new Long(source.SceneId);
        }
        if (source.MacAddress != null) {
            this.MacAddress = new String(source.MacAddress);
        }
        if (source.Imei != null) {
            this.Imei = new String(source.Imei);
        }
        if (source.NeedGetCaptchaTime != null) {
            this.NeedGetCaptchaTime = new Long(source.NeedGetCaptchaTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaType", this.CaptchaType);
        this.setParamSimple(map, prefix + "Ticket", this.Ticket);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Randstr", this.Randstr);
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "AppSecretKey", this.AppSecretKey);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "NeedGetCaptchaTime", this.NeedGetCaptchaTime);

    }
}

