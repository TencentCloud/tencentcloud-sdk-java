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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaResultRequest extends AbstractModel{

    /**
    * 固定填值：9。可在控制台配置不同验证码类型。
    */
    @SerializedName("CaptchaType")
    @Expose
    private Long CaptchaType;

    /**
    * 验证码返回给用户的票据
    */
    @SerializedName("Ticket")
    @Expose
    private String Ticket;

    /**
    * 用户操作来源的外网 IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 验证票据需要的随机字符串
    */
    @SerializedName("Randstr")
    @Expose
    private String Randstr;

    /**
    * 验证码应用ID
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * 用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方
    */
    @SerializedName("AppSecretKey")
    @Expose
    private String AppSecretKey;

    /**
    * 业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * 场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据
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
     * Get 固定填值：9。可在控制台配置不同验证码类型。 
     * @return CaptchaType 固定填值：9。可在控制台配置不同验证码类型。
     */
    public Long getCaptchaType() {
        return this.CaptchaType;
    }

    /**
     * Set 固定填值：9。可在控制台配置不同验证码类型。
     * @param CaptchaType 固定填值：9。可在控制台配置不同验证码类型。
     */
    public void setCaptchaType(Long CaptchaType) {
        this.CaptchaType = CaptchaType;
    }

    /**
     * Get 验证码返回给用户的票据 
     * @return Ticket 验证码返回给用户的票据
     */
    public String getTicket() {
        return this.Ticket;
    }

    /**
     * Set 验证码返回给用户的票据
     * @param Ticket 验证码返回给用户的票据
     */
    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    /**
     * Get 用户操作来源的外网 IP 
     * @return UserIp 用户操作来源的外网 IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户操作来源的外网 IP
     * @param UserIp 用户操作来源的外网 IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 验证票据需要的随机字符串 
     * @return Randstr 验证票据需要的随机字符串
     */
    public String getRandstr() {
        return this.Randstr;
    }

    /**
     * Set 验证票据需要的随机字符串
     * @param Randstr 验证票据需要的随机字符串
     */
    public void setRandstr(String Randstr) {
        this.Randstr = Randstr;
    }

    /**
     * Get 验证码应用ID 
     * @return CaptchaAppId 验证码应用ID
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set 验证码应用ID
     * @param CaptchaAppId 验证码应用ID
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get 用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方 
     * @return AppSecretKey 用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方
     */
    public String getAppSecretKey() {
        return this.AppSecretKey;
    }

    /**
     * Set 用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方
     * @param AppSecretKey 用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方
     */
    public void setAppSecretKey(String AppSecretKey) {
        this.AppSecretKey = AppSecretKey;
    }

    /**
     * Get 业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据 
     * @return BusinessId 业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     * @param BusinessId 业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据 
     * @return SceneId 场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据
     * @param SceneId 场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据
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

