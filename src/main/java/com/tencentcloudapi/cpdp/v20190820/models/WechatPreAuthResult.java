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

public class WechatPreAuthResult extends AbstractModel{

    /**
    * 商户核身单号
    */
    @SerializedName("AuthNo")
    @Expose
    private String AuthNo;

    /**
    * 微信用户标识
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 商户号
    */
    @SerializedName("MchId")
    @Expose
    private String MchId;

    /**
    * 子商户号
    */
    @SerializedName("SubMchId")
    @Expose
    private String SubMchId;

    /**
    * 预核身token值
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * token有效期时间，单位：秒
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
     * Get 商户核身单号 
     * @return AuthNo 商户核身单号
     */
    public String getAuthNo() {
        return this.AuthNo;
    }

    /**
     * Set 商户核身单号
     * @param AuthNo 商户核身单号
     */
    public void setAuthNo(String AuthNo) {
        this.AuthNo = AuthNo;
    }

    /**
     * Get 微信用户标识 
     * @return OpenId 微信用户标识
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 微信用户标识
     * @param OpenId 微信用户标识
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 商户号 
     * @return MchId 商户号
     */
    public String getMchId() {
        return this.MchId;
    }

    /**
     * Set 商户号
     * @param MchId 商户号
     */
    public void setMchId(String MchId) {
        this.MchId = MchId;
    }

    /**
     * Get 子商户号 
     * @return SubMchId 子商户号
     */
    public String getSubMchId() {
        return this.SubMchId;
    }

    /**
     * Set 子商户号
     * @param SubMchId 子商户号
     */
    public void setSubMchId(String SubMchId) {
        this.SubMchId = SubMchId;
    }

    /**
     * Get 预核身token值 
     * @return Token 预核身token值
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 预核身token值
     * @param Token 预核身token值
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get token有效期时间，单位：秒 
     * @return Expire token有效期时间，单位：秒
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set token有效期时间，单位：秒
     * @param Expire token有效期时间，单位：秒
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    public WechatPreAuthResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WechatPreAuthResult(WechatPreAuthResult source) {
        if (source.AuthNo != null) {
            this.AuthNo = new String(source.AuthNo);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.MchId != null) {
            this.MchId = new String(source.MchId);
        }
        if (source.SubMchId != null) {
            this.SubMchId = new String(source.SubMchId);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthNo", this.AuthNo);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "MchId", this.MchId);
        this.setParamSimple(map, prefix + "SubMchId", this.SubMchId);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Expire", this.Expire);

    }
}

