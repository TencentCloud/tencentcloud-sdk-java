/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSessionTokenRequest extends AbstractModel {

    /**
    * MFA序列号，与进行调用的CAM用户关联的MFA设备的标识号。格式qcs::cam:uin/${ownerUin}::mfa/${mfaType}。mfaType支持softToken（软token）
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * mfa身份验证码。
    */
    @SerializedName("TokenCode")
    @Expose
    private String TokenCode;

    /**
    * 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get MFA序列号，与进行调用的CAM用户关联的MFA设备的标识号。格式qcs::cam:uin/${ownerUin}::mfa/${mfaType}。mfaType支持softToken（软token） 
     * @return SerialNumber MFA序列号，与进行调用的CAM用户关联的MFA设备的标识号。格式qcs::cam:uin/${ownerUin}::mfa/${mfaType}。mfaType支持softToken（软token）
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set MFA序列号，与进行调用的CAM用户关联的MFA设备的标识号。格式qcs::cam:uin/${ownerUin}::mfa/${mfaType}。mfaType支持softToken（软token）
     * @param SerialNumber MFA序列号，与进行调用的CAM用户关联的MFA设备的标识号。格式qcs::cam:uin/${ownerUin}::mfa/${mfaType}。mfaType支持softToken（软token）
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get mfa身份验证码。 
     * @return TokenCode mfa身份验证码。
     */
    public String getTokenCode() {
        return this.TokenCode;
    }

    /**
     * Set mfa身份验证码。
     * @param TokenCode mfa身份验证码。
     */
    public void setTokenCode(String TokenCode) {
        this.TokenCode = TokenCode;
    }

    /**
     * Get 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。 
     * @return DurationSeconds 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。
     * @param DurationSeconds 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public GetSessionTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSessionTokenRequest(GetSessionTokenRequest source) {
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.TokenCode != null) {
            this.TokenCode = new String(source.TokenCode);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "TokenCode", this.TokenCode);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

