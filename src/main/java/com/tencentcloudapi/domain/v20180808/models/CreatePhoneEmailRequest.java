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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePhoneEmailRequest extends AbstractModel {

    /**
    * 手机号或者邮箱
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 1：手机   2：邮箱
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 验证码
通过调用[SendPhoneEmailCode](https://cloud.tencent.com/document/api/242/62666)接口发送到手机或邮箱的验证码
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
     * Get 手机号或者邮箱 
     * @return Code 手机号或者邮箱
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 手机号或者邮箱
     * @param Code 手机号或者邮箱
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 1：手机   2：邮箱 
     * @return Type 1：手机   2：邮箱
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1：手机   2：邮箱
     * @param Type 1：手机   2：邮箱
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 验证码
通过调用[SendPhoneEmailCode](https://cloud.tencent.com/document/api/242/62666)接口发送到手机或邮箱的验证码 
     * @return VerifyCode 验证码
通过调用[SendPhoneEmailCode](https://cloud.tencent.com/document/api/242/62666)接口发送到手机或邮箱的验证码
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set 验证码
通过调用[SendPhoneEmailCode](https://cloud.tencent.com/document/api/242/62666)接口发送到手机或邮箱的验证码
     * @param VerifyCode 验证码
通过调用[SendPhoneEmailCode](https://cloud.tencent.com/document/api/242/62666)接口发送到手机或邮箱的验证码
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    public CreatePhoneEmailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePhoneEmailRequest(CreatePhoneEmailRequest source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);

    }
}

