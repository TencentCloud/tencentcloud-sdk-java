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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaResultRequest extends AbstractModel {

    /**
    * <p>固定填值：9。</p>
    */
    @SerializedName("CaptchaType")
    @Expose
    private Long CaptchaType;

    /**
    * <p>前端回调函数返回的用户验证票据</p>
    */
    @SerializedName("Ticket")
    @Expose
    private String Ticket;

    /**
    * <p>业务侧获取到的验证码使用者的外网IP</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * <p>前端回调函数返回的随机字符串</p>
    */
    @SerializedName("Randstr")
    @Expose
    private String Randstr;

    /**
    * <p>验证码应用ID。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到CaptchaAppId。</p>
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * <p>验证码应用密钥。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。</p>
    */
    @SerializedName("AppSecretKey")
    @Expose
    private String AppSecretKey;

    /**
    * <p>预留字段</p>
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * <p>预留字段</p>
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * <p>mac 地址或设备唯一标识</p>
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * <p>手机设备号</p>
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * <p>是否返回前端获取验证码时间，取值1：需要返回</p>
    */
    @SerializedName("NeedGetCaptchaTime")
    @Expose
    private Long NeedGetCaptchaTime;

    /**
     * Get <p>固定填值：9。</p> 
     * @return CaptchaType <p>固定填值：9。</p>
     */
    public Long getCaptchaType() {
        return this.CaptchaType;
    }

    /**
     * Set <p>固定填值：9。</p>
     * @param CaptchaType <p>固定填值：9。</p>
     */
    public void setCaptchaType(Long CaptchaType) {
        this.CaptchaType = CaptchaType;
    }

    /**
     * Get <p>前端回调函数返回的用户验证票据</p> 
     * @return Ticket <p>前端回调函数返回的用户验证票据</p>
     */
    public String getTicket() {
        return this.Ticket;
    }

    /**
     * Set <p>前端回调函数返回的用户验证票据</p>
     * @param Ticket <p>前端回调函数返回的用户验证票据</p>
     */
    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    /**
     * Get <p>业务侧获取到的验证码使用者的外网IP</p> 
     * @return UserIp <p>业务侧获取到的验证码使用者的外网IP</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>业务侧获取到的验证码使用者的外网IP</p>
     * @param UserIp <p>业务侧获取到的验证码使用者的外网IP</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get <p>前端回调函数返回的随机字符串</p> 
     * @return Randstr <p>前端回调函数返回的随机字符串</p>
     */
    public String getRandstr() {
        return this.Randstr;
    }

    /**
     * Set <p>前端回调函数返回的随机字符串</p>
     * @param Randstr <p>前端回调函数返回的随机字符串</p>
     */
    public void setRandstr(String Randstr) {
        this.Randstr = Randstr;
    }

    /**
     * Get <p>验证码应用ID。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到CaptchaAppId。</p> 
     * @return CaptchaAppId <p>验证码应用ID。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到CaptchaAppId。</p>
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set <p>验证码应用ID。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到CaptchaAppId。</p>
     * @param CaptchaAppId <p>验证码应用ID。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到CaptchaAppId。</p>
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get <p>验证码应用密钥。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。</p> 
     * @return AppSecretKey <p>验证码应用密钥。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。</p>
     */
    public String getAppSecretKey() {
        return this.AppSecretKey;
    }

    /**
     * Set <p>验证码应用密钥。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。</p>
     * @param AppSecretKey <p>验证码应用密钥。登录 <a href="https://console.cloud.tencent.com/captcha/graphical">验证码控制台</a>，在验证列表的【密钥】列，即可查看到AppSecretKey。AppSecretKey属于服务器端校验验证码票据的密钥，请妥善保密，请勿泄露给第三方。</p>
     */
    public void setAppSecretKey(String AppSecretKey) {
        this.AppSecretKey = AppSecretKey;
    }

    /**
     * Get <p>预留字段</p> 
     * @return BusinessId <p>预留字段</p>
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set <p>预留字段</p>
     * @param BusinessId <p>预留字段</p>
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get <p>预留字段</p> 
     * @return SceneId <p>预留字段</p>
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set <p>预留字段</p>
     * @param SceneId <p>预留字段</p>
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get <p>mac 地址或设备唯一标识</p> 
     * @return MacAddress <p>mac 地址或设备唯一标识</p>
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set <p>mac 地址或设备唯一标识</p>
     * @param MacAddress <p>mac 地址或设备唯一标识</p>
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get <p>手机设备号</p> 
     * @return Imei <p>手机设备号</p>
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set <p>手机设备号</p>
     * @param Imei <p>手机设备号</p>
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get <p>是否返回前端获取验证码时间，取值1：需要返回</p> 
     * @return NeedGetCaptchaTime <p>是否返回前端获取验证码时间，取值1：需要返回</p>
     */
    public Long getNeedGetCaptchaTime() {
        return this.NeedGetCaptchaTime;
    }

    /**
     * Set <p>是否返回前端获取验证码时间，取值1：需要返回</p>
     * @param NeedGetCaptchaTime <p>是否返回前端获取验证码时间，取值1：需要返回</p>
     */
    public void setNeedGetCaptchaTime(Long NeedGetCaptchaTime) {
        this.NeedGetCaptchaTime = NeedGetCaptchaTime;
    }

    public DescribeCaptchaResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaResultRequest(DescribeCaptchaResultRequest source) {
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

