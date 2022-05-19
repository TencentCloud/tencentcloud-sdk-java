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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePayRollPreOrderWithAuthResponse extends AbstractModel{

    /**
    * 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
    */
    @SerializedName("AuthNumber")
    @Expose
    private String AuthNumber;

    /**
    * Token有效时间，单位秒
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 微信服务商商户的商户号，由微信支付生成并下发
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 用户在商户对应appid下的唯一标识
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 微信服务商下特约商户的商户号，由微信支付生成并下发
    */
    @SerializedName("SubMerchantId")
    @Expose
    private String SubMerchantId;

    /**
    * Token值
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一 
     * @return AuthNumber 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     */
    public String getAuthNumber() {
        return this.AuthNumber;
    }

    /**
     * Set 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     * @param AuthNumber 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     */
    public void setAuthNumber(String AuthNumber) {
        this.AuthNumber = AuthNumber;
    }

    /**
     * Get Token有效时间，单位秒 
     * @return ExpireTime Token有效时间，单位秒
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Token有效时间，单位秒
     * @param ExpireTime Token有效时间，单位秒
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 微信服务商商户的商户号，由微信支付生成并下发 
     * @return MerchantId 微信服务商商户的商户号，由微信支付生成并下发
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 微信服务商商户的商户号，由微信支付生成并下发
     * @param MerchantId 微信服务商商户的商户号，由微信支付生成并下发
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 用户在商户对应appid下的唯一标识 
     * @return OpenId 用户在商户对应appid下的唯一标识
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户在商户对应appid下的唯一标识
     * @param OpenId 用户在商户对应appid下的唯一标识
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 微信服务商下特约商户的商户号，由微信支付生成并下发 
     * @return SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public String getSubMerchantId() {
        return this.SubMerchantId;
    }

    /**
     * Set 微信服务商下特约商户的商户号，由微信支付生成并下发
     * @param SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public void setSubMerchantId(String SubMerchantId) {
        this.SubMerchantId = SubMerchantId;
    }

    /**
     * Get Token值 
     * @return Token Token值
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token值
     * @param Token Token值
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreatePayRollPreOrderWithAuthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePayRollPreOrderWithAuthResponse(CreatePayRollPreOrderWithAuthResponse source) {
        if (source.AuthNumber != null) {
            this.AuthNumber = new String(source.AuthNumber);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.SubMerchantId != null) {
            this.SubMerchantId = new String(source.SubMerchantId);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthNumber", this.AuthNumber);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "SubMerchantId", this.SubMerchantId);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

