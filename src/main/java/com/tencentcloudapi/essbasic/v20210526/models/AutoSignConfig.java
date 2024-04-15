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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoSignConfig extends AbstractModel {

    /**
    * 自动签开通个人用户信息, 包括名字,身份证等
    */
    @SerializedName("UserInfo")
    @Expose
    private UserThreeFactor UserInfo;

    /**
    * 是否回调证书信息:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**:需要</li></ul>
    */
    @SerializedName("CertInfoCallback")
    @Expose
    private Boolean CertInfoCallback;

    /**
    * 是否支持用户自定义签名印章:
<ul><li>**false**: 不能自己定义(默认)</li>
<li>**true**: 可以自己定义</li></ul>
    */
    @SerializedName("UserDefineSeal")
    @Expose
    private Boolean UserDefineSeal;

    /**
    * 回调中是否需要自动签将要使用的印章（签名）图片的 base64:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**: 需要</li></ul>
    */
    @SerializedName("SealImgCallback")
    @Expose
    private Boolean SealImgCallback;

    /**
    * 回调链接，如果渠道已经配置了，可以不传
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 开通时候的身份验证方式, 取值为：
<ul><li>**WEIXINAPP** : 微信人脸识别</li>
<li>**INSIGHT** : 慧眼人脸认别</li>
<li>**TELECOM** : 运营商三要素验证</li></ul>
注：
<ul><li>如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。为空默认 WEIXINAPP</li>
<li>如果是 H5 开通链接，支持传 INSIGHT / TELECOM。为空默认 INSIGHT </li></ul>
    */
    @SerializedName("VerifyChannels")
    @Expose
    private String [] VerifyChannels;

    /**
    * 设置用户开通自动签时是否绑定个人自动签账号许可。

<ul><li>**0**: (默认) 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li>
<li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul>
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 开通成功后前端页面跳转的url，此字段的用法场景请联系客户经理确认。

注：`仅支持H5开通场景`, `跳转链接仅支持 https:// , qianapp:// 开头`

跳转场景：
<ul><li>**贵方H5 -> 腾讯电子签H5 -> 贵方H5** : JumpUrl格式: https://YOUR_CUSTOM_URL/xxxx，只需满足 https:// 开头的正确且合规的网址即可。</li>
<li>**贵方原生App -> 腾讯电子签H5 -> 贵方原生App** : JumpUrl格式: qianapp://YOUR_CUSTOM_URL，只需满足 qianapp:// 开头的URL即可。`APP实现方，需要拦截Webview地址跳转，发现url是qianapp:// 开头时跳转到原生页面。`APP拦截地址跳转可参考：<a href='https://stackoverflow.com/questions/41693263/android-webview-err-unknown-url-scheme'>Android</a>，<a href='https://razorpay.com/docs/payments/payment-gateway/web-integration/standard/webview/upi-intent-ios/'>IOS</a> </li></ul>

成功结果返回：
若贵方需要在跳转回时通过链接query参数提示开通成功，JumpUrl中的query应携带如下参数：`appendResult=qian`。这样腾讯电子签H5会在跳转回的url后面会添加query参数提示贵方签署成功，例如：qianapp://YOUR_CUSTOM_URL?action=sign&result=success&from=tencent_ess
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
     * Get 自动签开通个人用户信息, 包括名字,身份证等 
     * @return UserInfo 自动签开通个人用户信息, 包括名字,身份证等
     */
    public UserThreeFactor getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 自动签开通个人用户信息, 包括名字,身份证等
     * @param UserInfo 自动签开通个人用户信息, 包括名字,身份证等
     */
    public void setUserInfo(UserThreeFactor UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 是否回调证书信息:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**:需要</li></ul> 
     * @return CertInfoCallback 是否回调证书信息:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**:需要</li></ul>
     */
    public Boolean getCertInfoCallback() {
        return this.CertInfoCallback;
    }

    /**
     * Set 是否回调证书信息:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**:需要</li></ul>
     * @param CertInfoCallback 是否回调证书信息:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**:需要</li></ul>
     */
    public void setCertInfoCallback(Boolean CertInfoCallback) {
        this.CertInfoCallback = CertInfoCallback;
    }

    /**
     * Get 是否支持用户自定义签名印章:
<ul><li>**false**: 不能自己定义(默认)</li>
<li>**true**: 可以自己定义</li></ul> 
     * @return UserDefineSeal 是否支持用户自定义签名印章:
<ul><li>**false**: 不能自己定义(默认)</li>
<li>**true**: 可以自己定义</li></ul>
     */
    public Boolean getUserDefineSeal() {
        return this.UserDefineSeal;
    }

    /**
     * Set 是否支持用户自定义签名印章:
<ul><li>**false**: 不能自己定义(默认)</li>
<li>**true**: 可以自己定义</li></ul>
     * @param UserDefineSeal 是否支持用户自定义签名印章:
<ul><li>**false**: 不能自己定义(默认)</li>
<li>**true**: 可以自己定义</li></ul>
     */
    public void setUserDefineSeal(Boolean UserDefineSeal) {
        this.UserDefineSeal = UserDefineSeal;
    }

    /**
     * Get 回调中是否需要自动签将要使用的印章（签名）图片的 base64:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**: 需要</li></ul> 
     * @return SealImgCallback 回调中是否需要自动签将要使用的印章（签名）图片的 base64:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**: 需要</li></ul>
     */
    public Boolean getSealImgCallback() {
        return this.SealImgCallback;
    }

    /**
     * Set 回调中是否需要自动签将要使用的印章（签名）图片的 base64:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**: 需要</li></ul>
     * @param SealImgCallback 回调中是否需要自动签将要使用的印章（签名）图片的 base64:
<ul><li>**false**: 不需要(默认)</li>
<li>**true**: 需要</li></ul>
     */
    public void setSealImgCallback(Boolean SealImgCallback) {
        this.SealImgCallback = SealImgCallback;
    }

    /**
     * Get 回调链接，如果渠道已经配置了，可以不传 
     * @return CallbackUrl 回调链接，如果渠道已经配置了，可以不传
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调链接，如果渠道已经配置了，可以不传
     * @param CallbackUrl 回调链接，如果渠道已经配置了，可以不传
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 开通时候的身份验证方式, 取值为：
<ul><li>**WEIXINAPP** : 微信人脸识别</li>
<li>**INSIGHT** : 慧眼人脸认别</li>
<li>**TELECOM** : 运营商三要素验证</li></ul>
注：
<ul><li>如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。为空默认 WEIXINAPP</li>
<li>如果是 H5 开通链接，支持传 INSIGHT / TELECOM。为空默认 INSIGHT </li></ul> 
     * @return VerifyChannels 开通时候的身份验证方式, 取值为：
<ul><li>**WEIXINAPP** : 微信人脸识别</li>
<li>**INSIGHT** : 慧眼人脸认别</li>
<li>**TELECOM** : 运营商三要素验证</li></ul>
注：
<ul><li>如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。为空默认 WEIXINAPP</li>
<li>如果是 H5 开通链接，支持传 INSIGHT / TELECOM。为空默认 INSIGHT </li></ul>
     */
    public String [] getVerifyChannels() {
        return this.VerifyChannels;
    }

    /**
     * Set 开通时候的身份验证方式, 取值为：
<ul><li>**WEIXINAPP** : 微信人脸识别</li>
<li>**INSIGHT** : 慧眼人脸认别</li>
<li>**TELECOM** : 运营商三要素验证</li></ul>
注：
<ul><li>如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。为空默认 WEIXINAPP</li>
<li>如果是 H5 开通链接，支持传 INSIGHT / TELECOM。为空默认 INSIGHT </li></ul>
     * @param VerifyChannels 开通时候的身份验证方式, 取值为：
<ul><li>**WEIXINAPP** : 微信人脸识别</li>
<li>**INSIGHT** : 慧眼人脸认别</li>
<li>**TELECOM** : 运营商三要素验证</li></ul>
注：
<ul><li>如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。为空默认 WEIXINAPP</li>
<li>如果是 H5 开通链接，支持传 INSIGHT / TELECOM。为空默认 INSIGHT </li></ul>
     */
    public void setVerifyChannels(String [] VerifyChannels) {
        this.VerifyChannels = VerifyChannels;
    }

    /**
     * Get 设置用户开通自动签时是否绑定个人自动签账号许可。

<ul><li>**0**: (默认) 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li>
<li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul> 
     * @return LicenseType 设置用户开通自动签时是否绑定个人自动签账号许可。

<ul><li>**0**: (默认) 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li>
<li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul>
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 设置用户开通自动签时是否绑定个人自动签账号许可。

<ul><li>**0**: (默认) 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li>
<li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul>
     * @param LicenseType 设置用户开通自动签时是否绑定个人自动签账号许可。

<ul><li>**0**: (默认) 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li>
<li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul>
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 开通成功后前端页面跳转的url，此字段的用法场景请联系客户经理确认。

注：`仅支持H5开通场景`, `跳转链接仅支持 https:// , qianapp:// 开头`

跳转场景：
<ul><li>**贵方H5 -> 腾讯电子签H5 -> 贵方H5** : JumpUrl格式: https://YOUR_CUSTOM_URL/xxxx，只需满足 https:// 开头的正确且合规的网址即可。</li>
<li>**贵方原生App -> 腾讯电子签H5 -> 贵方原生App** : JumpUrl格式: qianapp://YOUR_CUSTOM_URL，只需满足 qianapp:// 开头的URL即可。`APP实现方，需要拦截Webview地址跳转，发现url是qianapp:// 开头时跳转到原生页面。`APP拦截地址跳转可参考：<a href='https://stackoverflow.com/questions/41693263/android-webview-err-unknown-url-scheme'>Android</a>，<a href='https://razorpay.com/docs/payments/payment-gateway/web-integration/standard/webview/upi-intent-ios/'>IOS</a> </li></ul>

成功结果返回：
若贵方需要在跳转回时通过链接query参数提示开通成功，JumpUrl中的query应携带如下参数：`appendResult=qian`。这样腾讯电子签H5会在跳转回的url后面会添加query参数提示贵方签署成功，例如：qianapp://YOUR_CUSTOM_URL?action=sign&result=success&from=tencent_ess 
     * @return JumpUrl 开通成功后前端页面跳转的url，此字段的用法场景请联系客户经理确认。

注：`仅支持H5开通场景`, `跳转链接仅支持 https:// , qianapp:// 开头`

跳转场景：
<ul><li>**贵方H5 -> 腾讯电子签H5 -> 贵方H5** : JumpUrl格式: https://YOUR_CUSTOM_URL/xxxx，只需满足 https:// 开头的正确且合规的网址即可。</li>
<li>**贵方原生App -> 腾讯电子签H5 -> 贵方原生App** : JumpUrl格式: qianapp://YOUR_CUSTOM_URL，只需满足 qianapp:// 开头的URL即可。`APP实现方，需要拦截Webview地址跳转，发现url是qianapp:// 开头时跳转到原生页面。`APP拦截地址跳转可参考：<a href='https://stackoverflow.com/questions/41693263/android-webview-err-unknown-url-scheme'>Android</a>，<a href='https://razorpay.com/docs/payments/payment-gateway/web-integration/standard/webview/upi-intent-ios/'>IOS</a> </li></ul>

成功结果返回：
若贵方需要在跳转回时通过链接query参数提示开通成功，JumpUrl中的query应携带如下参数：`appendResult=qian`。这样腾讯电子签H5会在跳转回的url后面会添加query参数提示贵方签署成功，例如：qianapp://YOUR_CUSTOM_URL?action=sign&result=success&from=tencent_ess
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 开通成功后前端页面跳转的url，此字段的用法场景请联系客户经理确认。

注：`仅支持H5开通场景`, `跳转链接仅支持 https:// , qianapp:// 开头`

跳转场景：
<ul><li>**贵方H5 -> 腾讯电子签H5 -> 贵方H5** : JumpUrl格式: https://YOUR_CUSTOM_URL/xxxx，只需满足 https:// 开头的正确且合规的网址即可。</li>
<li>**贵方原生App -> 腾讯电子签H5 -> 贵方原生App** : JumpUrl格式: qianapp://YOUR_CUSTOM_URL，只需满足 qianapp:// 开头的URL即可。`APP实现方，需要拦截Webview地址跳转，发现url是qianapp:// 开头时跳转到原生页面。`APP拦截地址跳转可参考：<a href='https://stackoverflow.com/questions/41693263/android-webview-err-unknown-url-scheme'>Android</a>，<a href='https://razorpay.com/docs/payments/payment-gateway/web-integration/standard/webview/upi-intent-ios/'>IOS</a> </li></ul>

成功结果返回：
若贵方需要在跳转回时通过链接query参数提示开通成功，JumpUrl中的query应携带如下参数：`appendResult=qian`。这样腾讯电子签H5会在跳转回的url后面会添加query参数提示贵方签署成功，例如：qianapp://YOUR_CUSTOM_URL?action=sign&result=success&from=tencent_ess
     * @param JumpUrl 开通成功后前端页面跳转的url，此字段的用法场景请联系客户经理确认。

注：`仅支持H5开通场景`, `跳转链接仅支持 https:// , qianapp:// 开头`

跳转场景：
<ul><li>**贵方H5 -> 腾讯电子签H5 -> 贵方H5** : JumpUrl格式: https://YOUR_CUSTOM_URL/xxxx，只需满足 https:// 开头的正确且合规的网址即可。</li>
<li>**贵方原生App -> 腾讯电子签H5 -> 贵方原生App** : JumpUrl格式: qianapp://YOUR_CUSTOM_URL，只需满足 qianapp:// 开头的URL即可。`APP实现方，需要拦截Webview地址跳转，发现url是qianapp:// 开头时跳转到原生页面。`APP拦截地址跳转可参考：<a href='https://stackoverflow.com/questions/41693263/android-webview-err-unknown-url-scheme'>Android</a>，<a href='https://razorpay.com/docs/payments/payment-gateway/web-integration/standard/webview/upi-intent-ios/'>IOS</a> </li></ul>

成功结果返回：
若贵方需要在跳转回时通过链接query参数提示开通成功，JumpUrl中的query应携带如下参数：`appendResult=qian`。这样腾讯电子签H5会在跳转回的url后面会添加query参数提示贵方签署成功，例如：qianapp://YOUR_CUSTOM_URL?action=sign&result=success&from=tencent_ess
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    public AutoSignConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoSignConfig(AutoSignConfig source) {
        if (source.UserInfo != null) {
            this.UserInfo = new UserThreeFactor(source.UserInfo);
        }
        if (source.CertInfoCallback != null) {
            this.CertInfoCallback = new Boolean(source.CertInfoCallback);
        }
        if (source.UserDefineSeal != null) {
            this.UserDefineSeal = new Boolean(source.UserDefineSeal);
        }
        if (source.SealImgCallback != null) {
            this.SealImgCallback = new Boolean(source.SealImgCallback);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.VerifyChannels != null) {
            this.VerifyChannels = new String[source.VerifyChannels.length];
            for (int i = 0; i < source.VerifyChannels.length; i++) {
                this.VerifyChannels[i] = new String(source.VerifyChannels[i]);
            }
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "CertInfoCallback", this.CertInfoCallback);
        this.setParamSimple(map, prefix + "UserDefineSeal", this.UserDefineSeal);
        this.setParamSimple(map, prefix + "SealImgCallback", this.SealImgCallback);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArraySimple(map, prefix + "VerifyChannels.", this.VerifyChannels);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

