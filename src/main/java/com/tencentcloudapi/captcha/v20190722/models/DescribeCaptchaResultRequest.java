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

public class DescribeCaptchaResultRequest  extends AbstractModel{

    /**
    * 验证码类型，9：滑块验证码
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
     * 获取验证码类型，9：滑块验证码
     * @return CaptchaType 验证码类型，9：滑块验证码
     */
    public Long getCaptchaType() {
        return this.CaptchaType;
    }

    /**
     * 设置验证码类型，9：滑块验证码
     * @param CaptchaType 验证码类型，9：滑块验证码
     */
    public void setCaptchaType(Long CaptchaType) {
        this.CaptchaType = CaptchaType;
    }

    /**
     * 获取验证码返回给用户的票据
     * @return Ticket 验证码返回给用户的票据
     */
    public String getTicket() {
        return this.Ticket;
    }

    /**
     * 设置验证码返回给用户的票据
     * @param Ticket 验证码返回给用户的票据
     */
    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    /**
     * 获取用户操作来源的外网 IP
     * @return UserIp 用户操作来源的外网 IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * 设置用户操作来源的外网 IP
     * @param UserIp 用户操作来源的外网 IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * 获取验证票据需要的随机字符串
     * @return Randstr 验证票据需要的随机字符串
     */
    public String getRandstr() {
        return this.Randstr;
    }

    /**
     * 设置验证票据需要的随机字符串
     * @param Randstr 验证票据需要的随机字符串
     */
    public void setRandstr(String Randstr) {
        this.Randstr = Randstr;
    }

    /**
     * 获取验证码应用ID
     * @return CaptchaAppId 验证码应用ID
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * 设置验证码应用ID
     * @param CaptchaAppId 验证码应用ID
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * 获取用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方
     * @return AppSecretKey 用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方
     */
    public String getAppSecretKey() {
        return this.AppSecretKey;
    }

    /**
     * 设置用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方
     * @param AppSecretKey 用于服务器端校验验证码票据的验证密钥，请妥善保密，请勿泄露给第三方
     */
    public void setAppSecretKey(String AppSecretKey) {
        this.AppSecretKey = AppSecretKey;
    }

    /**
     * 获取业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     * @return BusinessId 业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * 设置业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     * @param BusinessId 业务 ID，网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * 获取场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据
     * @return SceneId 场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * 设置场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据
     * @param SceneId 场景 ID，网站或应用的业务下有多个场景使用此服务，通过此 ID 区分统计数据
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * 获取mac 地址或设备唯一标识
     * @return MacAddress mac 地址或设备唯一标识
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * 设置mac 地址或设备唯一标识
     * @param MacAddress mac 地址或设备唯一标识
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * 获取手机设备号
     * @return Imei 手机设备号
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * 设置手机设备号
     * @param Imei 手机设备号
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

