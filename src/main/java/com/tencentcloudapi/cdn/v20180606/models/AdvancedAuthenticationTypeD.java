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

public class AdvancedAuthenticationTypeD extends AbstractModel{

    /**
    * 用于计算签名的密钥，只允许字母和数字，长度6-32字节。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 备份密钥，当使用SecretKey鉴权失败时会使用该密钥重新鉴权。
    */
    @SerializedName("BackupSecretKey")
    @Expose
    private String BackupSecretKey;

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
     * Get 备份密钥，当使用SecretKey鉴权失败时会使用该密钥重新鉴权。 
     * @return BackupSecretKey 备份密钥，当使用SecretKey鉴权失败时会使用该密钥重新鉴权。
     */
    public String getBackupSecretKey() {
        return this.BackupSecretKey;
    }

    /**
     * Set 备份密钥，当使用SecretKey鉴权失败时会使用该密钥重新鉴权。
     * @param BackupSecretKey 备份密钥，当使用SecretKey鉴权失败时会使用该密钥重新鉴权。
     */
    public void setBackupSecretKey(String BackupSecretKey) {
        this.BackupSecretKey = BackupSecretKey;
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

    public AdvancedAuthenticationTypeD() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthenticationTypeD(AdvancedAuthenticationTypeD source) {
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.BackupSecretKey != null) {
            this.BackupSecretKey = new String(source.BackupSecretKey);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "BackupSecretKey", this.BackupSecretKey);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);

    }
}

