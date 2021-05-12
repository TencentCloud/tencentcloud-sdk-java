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

public class AdvancedAuthenticationTypeB extends AbstractModel{

    /**
    * alpha键名。
    */
    @SerializedName("KeyAlpha")
    @Expose
    private String KeyAlpha;

    /**
    * beta键名。
    */
    @SerializedName("KeyBeta")
    @Expose
    private String KeyBeta;

    /**
    * gamma键名。
    */
    @SerializedName("KeyGamma")
    @Expose
    private String KeyGamma;

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
     * Get alpha键名。 
     * @return KeyAlpha alpha键名。
     */
    public String getKeyAlpha() {
        return this.KeyAlpha;
    }

    /**
     * Set alpha键名。
     * @param KeyAlpha alpha键名。
     */
    public void setKeyAlpha(String KeyAlpha) {
        this.KeyAlpha = KeyAlpha;
    }

    /**
     * Get beta键名。 
     * @return KeyBeta beta键名。
     */
    public String getKeyBeta() {
        return this.KeyBeta;
    }

    /**
     * Set beta键名。
     * @param KeyBeta beta键名。
     */
    public void setKeyBeta(String KeyBeta) {
        this.KeyBeta = KeyBeta;
    }

    /**
     * Get gamma键名。 
     * @return KeyGamma gamma键名。
     */
    public String getKeyGamma() {
        return this.KeyGamma;
    }

    /**
     * Set gamma键名。
     * @param KeyGamma gamma键名。
     */
    public void setKeyGamma(String KeyGamma) {
        this.KeyGamma = KeyGamma;
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

    public AdvancedAuthenticationTypeB() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthenticationTypeB(AdvancedAuthenticationTypeB source) {
        if (source.KeyAlpha != null) {
            this.KeyAlpha = new String(source.KeyAlpha);
        }
        if (source.KeyBeta != null) {
            this.KeyBeta = new String(source.KeyBeta);
        }
        if (source.KeyGamma != null) {
            this.KeyGamma = new String(source.KeyGamma);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyAlpha", this.KeyAlpha);
        this.setParamSimple(map, prefix + "KeyBeta", this.KeyBeta);
        this.setParamSimple(map, prefix + "KeyGamma", this.KeyGamma);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamSimple(map, prefix + "ExpireCode", this.ExpireCode);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

