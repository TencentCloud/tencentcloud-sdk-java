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

public class WeChatAccountInfo extends AbstractModel{

    /**
    * 微信的OpenID/UnionID 。
    */
    @SerializedName("WeChatOpenId")
    @Expose
    private String WeChatOpenId;

    /**
    * 微信开放账号类型：
1：微信公众号/微信第三方登录。
2：微信小程序。
    */
    @SerializedName("WeChatSubType")
    @Expose
    private Long WeChatSubType;

    /**
    * 随机串。如果WeChatSubType是2，该字段必填。Token签名随机数，建议16个字符。
    */
    @SerializedName("RandStr")
    @Expose
    private String RandStr;

    /**
    * 如果WeChatSubType是1，填入授权的access_token（注意：不是普通access_token，详情请参阅官方说明文档。获取网页版本的access_token时，scope字段必需填写snsapi_userinfo。
如果WeChatSubType是2，填入以session_key为密钥签名随机数RandStr（hmac_sha256签名算法）得到的字符串。
    */
    @SerializedName("WeChatAccessToken")
    @Expose
    private String WeChatAccessToken;

    /**
    * 用于标识微信用户登录后所关联业务自身的账号ID。
    */
    @SerializedName("AssociateAccount")
    @Expose
    private String AssociateAccount;

    /**
    * 账号绑定的手机号。
    */
    @SerializedName("MobilePhone")
    @Expose
    private String MobilePhone;

    /**
    * 用户设备号。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get 微信的OpenID/UnionID 。 
     * @return WeChatOpenId 微信的OpenID/UnionID 。
     */
    public String getWeChatOpenId() {
        return this.WeChatOpenId;
    }

    /**
     * Set 微信的OpenID/UnionID 。
     * @param WeChatOpenId 微信的OpenID/UnionID 。
     */
    public void setWeChatOpenId(String WeChatOpenId) {
        this.WeChatOpenId = WeChatOpenId;
    }

    /**
     * Get 微信开放账号类型：
1：微信公众号/微信第三方登录。
2：微信小程序。 
     * @return WeChatSubType 微信开放账号类型：
1：微信公众号/微信第三方登录。
2：微信小程序。
     */
    public Long getWeChatSubType() {
        return this.WeChatSubType;
    }

    /**
     * Set 微信开放账号类型：
1：微信公众号/微信第三方登录。
2：微信小程序。
     * @param WeChatSubType 微信开放账号类型：
1：微信公众号/微信第三方登录。
2：微信小程序。
     */
    public void setWeChatSubType(Long WeChatSubType) {
        this.WeChatSubType = WeChatSubType;
    }

    /**
     * Get 随机串。如果WeChatSubType是2，该字段必填。Token签名随机数，建议16个字符。 
     * @return RandStr 随机串。如果WeChatSubType是2，该字段必填。Token签名随机数，建议16个字符。
     */
    public String getRandStr() {
        return this.RandStr;
    }

    /**
     * Set 随机串。如果WeChatSubType是2，该字段必填。Token签名随机数，建议16个字符。
     * @param RandStr 随机串。如果WeChatSubType是2，该字段必填。Token签名随机数，建议16个字符。
     */
    public void setRandStr(String RandStr) {
        this.RandStr = RandStr;
    }

    /**
     * Get 如果WeChatSubType是1，填入授权的access_token（注意：不是普通access_token，详情请参阅官方说明文档。获取网页版本的access_token时，scope字段必需填写snsapi_userinfo。
如果WeChatSubType是2，填入以session_key为密钥签名随机数RandStr（hmac_sha256签名算法）得到的字符串。 
     * @return WeChatAccessToken 如果WeChatSubType是1，填入授权的access_token（注意：不是普通access_token，详情请参阅官方说明文档。获取网页版本的access_token时，scope字段必需填写snsapi_userinfo。
如果WeChatSubType是2，填入以session_key为密钥签名随机数RandStr（hmac_sha256签名算法）得到的字符串。
     */
    public String getWeChatAccessToken() {
        return this.WeChatAccessToken;
    }

    /**
     * Set 如果WeChatSubType是1，填入授权的access_token（注意：不是普通access_token，详情请参阅官方说明文档。获取网页版本的access_token时，scope字段必需填写snsapi_userinfo。
如果WeChatSubType是2，填入以session_key为密钥签名随机数RandStr（hmac_sha256签名算法）得到的字符串。
     * @param WeChatAccessToken 如果WeChatSubType是1，填入授权的access_token（注意：不是普通access_token，详情请参阅官方说明文档。获取网页版本的access_token时，scope字段必需填写snsapi_userinfo。
如果WeChatSubType是2，填入以session_key为密钥签名随机数RandStr（hmac_sha256签名算法）得到的字符串。
     */
    public void setWeChatAccessToken(String WeChatAccessToken) {
        this.WeChatAccessToken = WeChatAccessToken;
    }

    /**
     * Get 用于标识微信用户登录后所关联业务自身的账号ID。 
     * @return AssociateAccount 用于标识微信用户登录后所关联业务自身的账号ID。
     */
    public String getAssociateAccount() {
        return this.AssociateAccount;
    }

    /**
     * Set 用于标识微信用户登录后所关联业务自身的账号ID。
     * @param AssociateAccount 用于标识微信用户登录后所关联业务自身的账号ID。
     */
    public void setAssociateAccount(String AssociateAccount) {
        this.AssociateAccount = AssociateAccount;
    }

    /**
     * Get 账号绑定的手机号。 
     * @return MobilePhone 账号绑定的手机号。
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * Set 账号绑定的手机号。
     * @param MobilePhone 账号绑定的手机号。
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * Get 用户设备号。 
     * @return DeviceId 用户设备号。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 用户设备号。
     * @param DeviceId 用户设备号。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public WeChatAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeChatAccountInfo(WeChatAccountInfo source) {
        if (source.WeChatOpenId != null) {
            this.WeChatOpenId = new String(source.WeChatOpenId);
        }
        if (source.WeChatSubType != null) {
            this.WeChatSubType = new Long(source.WeChatSubType);
        }
        if (source.RandStr != null) {
            this.RandStr = new String(source.RandStr);
        }
        if (source.WeChatAccessToken != null) {
            this.WeChatAccessToken = new String(source.WeChatAccessToken);
        }
        if (source.AssociateAccount != null) {
            this.AssociateAccount = new String(source.AssociateAccount);
        }
        if (source.MobilePhone != null) {
            this.MobilePhone = new String(source.MobilePhone);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WeChatOpenId", this.WeChatOpenId);
        this.setParamSimple(map, prefix + "WeChatSubType", this.WeChatSubType);
        this.setParamSimple(map, prefix + "RandStr", this.RandStr);
        this.setParamSimple(map, prefix + "WeChatAccessToken", this.WeChatAccessToken);
        this.setParamSimple(map, prefix + "AssociateAccount", this.AssociateAccount);
        this.setParamSimple(map, prefix + "MobilePhone", this.MobilePhone);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

