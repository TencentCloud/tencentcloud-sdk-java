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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedAuthenticationTypeA extends AbstractModel{

    /**
    * 用于计算签名的密钥，只允许字母和数字，长度6-32字节。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
    */
    @SerializedName("SignParam")
    @Expose
    private String SignParam;

    /**
    * uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
    */
    @SerializedName("TimeParam")
    @Expose
    private String TimeParam;

    /**
    * 过期时间，单位秒。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 是否必须提供过期时间参数。
    */
    @SerializedName("ExpireTimeRequired")
    @Expose
    private Boolean ExpireTimeRequired;

    /**
    * Url组成格式，如：${private_key}${schema}${host}${full_uri。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 时间格式，dec，hex分别表示十进制，十六进制。
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * 鉴权失败时返回的状态码。
    */
    @SerializedName("FailCode")
    @Expose
    private Long FailCode;

    /**
    * 链接过期时返回的状态码。
    */
    @SerializedName("ExpireCode")
    @Expose
    private Long ExpireCode;

    /**
    * 需要鉴权的url路径列表。
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * 保留字段。
    */
    @SerializedName("Transformation")
    @Expose
    private Long Transformation;

    /**
     * Get 用于计算签名的密钥，只允许字母和数字，长度6-32字节。 
     * @return SecretKey 用于计算签名的密钥，只允许字母和数字，长度6-32字节。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 用于计算签名的密钥，只允许字母和数字，长度6-32字节。
     * @param SecretKey 用于计算签名的密钥，只允许字母和数字，长度6-32字节。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。 
     * @return SignParam uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
     */
    public String getSignParam() {
        return this.SignParam;
    }

    /**
     * Set uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
     * @param SignParam uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
     */
    public void setSignParam(String SignParam) {
        this.SignParam = SignParam;
    }

    /**
     * Get uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。 
     * @return TimeParam uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
     */
    public String getTimeParam() {
        return this.TimeParam;
    }

    /**
     * Set uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
     * @param TimeParam uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
     */
    public void setTimeParam(String TimeParam) {
        this.TimeParam = TimeParam;
    }

    /**
     * Get 过期时间，单位秒。 
     * @return ExpireTime 过期时间，单位秒。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，单位秒。
     * @param ExpireTime 过期时间，单位秒。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 是否必须提供过期时间参数。 
     * @return ExpireTimeRequired 是否必须提供过期时间参数。
     */
    public Boolean getExpireTimeRequired() {
        return this.ExpireTimeRequired;
    }

    /**
     * Set 是否必须提供过期时间参数。
     * @param ExpireTimeRequired 是否必须提供过期时间参数。
     */
    public void setExpireTimeRequired(Boolean ExpireTimeRequired) {
        this.ExpireTimeRequired = ExpireTimeRequired;
    }

    /**
     * Get Url组成格式，如：${private_key}${schema}${host}${full_uri。 
     * @return Format Url组成格式，如：${private_key}${schema}${host}${full_uri。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Url组成格式，如：${private_key}${schema}${host}${full_uri。
     * @param Format Url组成格式，如：${private_key}${schema}${host}${full_uri。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 时间格式，dec，hex分别表示十进制，十六进制。 
     * @return TimeFormat 时间格式，dec，hex分别表示十进制，十六进制。
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set 时间格式，dec，hex分别表示十进制，十六进制。
     * @param TimeFormat 时间格式，dec，hex分别表示十进制，十六进制。
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get 鉴权失败时返回的状态码。 
     * @return FailCode 鉴权失败时返回的状态码。
     */
    public Long getFailCode() {
        return this.FailCode;
    }

    /**
     * Set 鉴权失败时返回的状态码。
     * @param FailCode 鉴权失败时返回的状态码。
     */
    public void setFailCode(Long FailCode) {
        this.FailCode = FailCode;
    }

    /**
     * Get 链接过期时返回的状态码。 
     * @return ExpireCode 链接过期时返回的状态码。
     */
    public Long getExpireCode() {
        return this.ExpireCode;
    }

    /**
     * Set 链接过期时返回的状态码。
     * @param ExpireCode 链接过期时返回的状态码。
     */
    public void setExpireCode(Long ExpireCode) {
        this.ExpireCode = ExpireCode;
    }

    /**
     * Get 需要鉴权的url路径列表。 
     * @return RulePaths 需要鉴权的url路径列表。
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set 需要鉴权的url路径列表。
     * @param RulePaths 需要鉴权的url路径列表。
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get 保留字段。 
     * @return Transformation 保留字段。
     */
    public Long getTransformation() {
        return this.Transformation;
    }

    /**
     * Set 保留字段。
     * @param Transformation 保留字段。
     */
    public void setTransformation(Long Transformation) {
        this.Transformation = Transformation;
    }

    public AdvancedAuthenticationTypeA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthenticationTypeA(AdvancedAuthenticationTypeA source) {
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.SignParam != null) {
            this.SignParam = new String(source.SignParam);
        }
        if (source.TimeParam != null) {
            this.TimeParam = new String(source.TimeParam);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ExpireTimeRequired != null) {
            this.ExpireTimeRequired = new Boolean(source.ExpireTimeRequired);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.FailCode != null) {
            this.FailCode = new Long(source.FailCode);
        }
        if (source.ExpireCode != null) {
            this.ExpireCode = new Long(source.ExpireCode);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.Transformation != null) {
            this.Transformation = new Long(source.Transformation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ExpireTimeRequired", this.ExpireTimeRequired);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamSimple(map, prefix + "ExpireCode", this.ExpireCode);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "Transformation", this.Transformation);

    }
}

