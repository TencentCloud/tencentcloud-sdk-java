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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoSignConfig extends AbstractModel{

    /**
    * 自动签开通个人用户的三要素
    */
    @SerializedName("UserInfo")
    @Expose
    private UserThreeFactor UserInfo;

    /**
    * 接受回调URL地址。支持http://或者https://协议

Post数据到此地址后返回httpcode200表示接受回调成功, 返回其他httpcode表示接受回调失败
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 是否回调证书信息
false-不需要 (默认值)
true-需要
    */
    @SerializedName("CertInfoCallback")
    @Expose
    private Boolean CertInfoCallback;

    /**
    * 是否支持用户自定义签名印章
false-不需要(默认)
true-需要
    */
    @SerializedName("UserDefineSeal")
    @Expose
    private Boolean UserDefineSeal;

    /**
    * 是否需要回调的时候返回印章(签名) 图片的 base64

false-不需要(默认)
true-需要
    */
    @SerializedName("SealImgCallback")
    @Expose
    private Boolean SealImgCallback;

    /**
    * 开通时候的验证方式, 分布为

WEIXINAPP : 微信人脸识别
INSIGHT : 慧眼人脸认别
TELECOM : 运营商三要素验证

如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。

如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
    */
    @SerializedName("VerifyChannels")
    @Expose
    private String [] VerifyChannels;

    /**
     * Get 自动签开通个人用户的三要素 
     * @return UserInfo 自动签开通个人用户的三要素
     */
    public UserThreeFactor getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 自动签开通个人用户的三要素
     * @param UserInfo 自动签开通个人用户的三要素
     */
    public void setUserInfo(UserThreeFactor UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 接受回调URL地址。支持http://或者https://协议

Post数据到此地址后返回httpcode200表示接受回调成功, 返回其他httpcode表示接受回调失败 
     * @return CallbackUrl 接受回调URL地址。支持http://或者https://协议

Post数据到此地址后返回httpcode200表示接受回调成功, 返回其他httpcode表示接受回调失败
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 接受回调URL地址。支持http://或者https://协议

Post数据到此地址后返回httpcode200表示接受回调成功, 返回其他httpcode表示接受回调失败
     * @param CallbackUrl 接受回调URL地址。支持http://或者https://协议

Post数据到此地址后返回httpcode200表示接受回调成功, 返回其他httpcode表示接受回调失败
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 是否回调证书信息
false-不需要 (默认值)
true-需要 
     * @return CertInfoCallback 是否回调证书信息
false-不需要 (默认值)
true-需要
     */
    public Boolean getCertInfoCallback() {
        return this.CertInfoCallback;
    }

    /**
     * Set 是否回调证书信息
false-不需要 (默认值)
true-需要
     * @param CertInfoCallback 是否回调证书信息
false-不需要 (默认值)
true-需要
     */
    public void setCertInfoCallback(Boolean CertInfoCallback) {
        this.CertInfoCallback = CertInfoCallback;
    }

    /**
     * Get 是否支持用户自定义签名印章
false-不需要(默认)
true-需要 
     * @return UserDefineSeal 是否支持用户自定义签名印章
false-不需要(默认)
true-需要
     */
    public Boolean getUserDefineSeal() {
        return this.UserDefineSeal;
    }

    /**
     * Set 是否支持用户自定义签名印章
false-不需要(默认)
true-需要
     * @param UserDefineSeal 是否支持用户自定义签名印章
false-不需要(默认)
true-需要
     */
    public void setUserDefineSeal(Boolean UserDefineSeal) {
        this.UserDefineSeal = UserDefineSeal;
    }

    /**
     * Get 是否需要回调的时候返回印章(签名) 图片的 base64

false-不需要(默认)
true-需要 
     * @return SealImgCallback 是否需要回调的时候返回印章(签名) 图片的 base64

false-不需要(默认)
true-需要
     */
    public Boolean getSealImgCallback() {
        return this.SealImgCallback;
    }

    /**
     * Set 是否需要回调的时候返回印章(签名) 图片的 base64

false-不需要(默认)
true-需要
     * @param SealImgCallback 是否需要回调的时候返回印章(签名) 图片的 base64

false-不需要(默认)
true-需要
     */
    public void setSealImgCallback(Boolean SealImgCallback) {
        this.SealImgCallback = SealImgCallback;
    }

    /**
     * Get 开通时候的验证方式, 分布为

WEIXINAPP : 微信人脸识别
INSIGHT : 慧眼人脸认别
TELECOM : 运营商三要素验证

如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。

如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。 
     * @return VerifyChannels 开通时候的验证方式, 分布为

WEIXINAPP : 微信人脸识别
INSIGHT : 慧眼人脸认别
TELECOM : 运营商三要素验证

如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。

如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
     */
    public String [] getVerifyChannels() {
        return this.VerifyChannels;
    }

    /**
     * Set 开通时候的验证方式, 分布为

WEIXINAPP : 微信人脸识别
INSIGHT : 慧眼人脸认别
TELECOM : 运营商三要素验证

如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。

如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
     * @param VerifyChannels 开通时候的验证方式, 分布为

WEIXINAPP : 微信人脸识别
INSIGHT : 慧眼人脸认别
TELECOM : 运营商三要素验证

如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。

如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
     */
    public void setVerifyChannels(String [] VerifyChannels) {
        this.VerifyChannels = VerifyChannels;
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
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
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
        if (source.VerifyChannels != null) {
            this.VerifyChannels = new String[source.VerifyChannels.length];
            for (int i = 0; i < source.VerifyChannels.length; i++) {
                this.VerifyChannels[i] = new String(source.VerifyChannels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "CertInfoCallback", this.CertInfoCallback);
        this.setParamSimple(map, prefix + "UserDefineSeal", this.UserDefineSeal);
        this.setParamSimple(map, prefix + "SealImgCallback", this.SealImgCallback);
        this.setParamArraySimple(map, prefix + "VerifyChannels.", this.VerifyChannels);

    }
}

