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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyUserRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 电子签平台用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 是否需要下发个人长效证书，默认为false
注：如您有下发个人长效证书需求，请提前邮件至e-contract@oa.com进行申请。
    */
    @SerializedName("CertificateRequired")
    @Expose
    private Boolean CertificateRequired;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 电子签平台用户ID 
     * @return UserId 电子签平台用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 电子签平台用户ID
     * @param UserId 电子签平台用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 是否需要下发个人长效证书，默认为false
注：如您有下发个人长效证书需求，请提前邮件至e-contract@oa.com进行申请。 
     * @return CertificateRequired 是否需要下发个人长效证书，默认为false
注：如您有下发个人长效证书需求，请提前邮件至e-contract@oa.com进行申请。
     */
    public Boolean getCertificateRequired() {
        return this.CertificateRequired;
    }

    /**
     * Set 是否需要下发个人长效证书，默认为false
注：如您有下发个人长效证书需求，请提前邮件至e-contract@oa.com进行申请。
     * @param CertificateRequired 是否需要下发个人长效证书，默认为false
注：如您有下发个人长效证书需求，请提前邮件至e-contract@oa.com进行申请。
     */
    public void setCertificateRequired(Boolean CertificateRequired) {
        this.CertificateRequired = CertificateRequired;
    }

    public VerifyUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyUserRequest(VerifyUserRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.CertificateRequired != null) {
            this.CertificateRequired = new Boolean(source.CertificateRequired);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CertificateRequired", this.CertificateRequired);

    }
}

