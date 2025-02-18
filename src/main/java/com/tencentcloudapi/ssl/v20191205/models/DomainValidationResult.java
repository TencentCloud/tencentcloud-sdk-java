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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainValidationResult extends AbstractModel {

    /**
    * 证书绑定的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名验证类型。 取值为：DNS、FILE、DNS_AUTO、DNS_PROXY、FILE_PROXY
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 腾讯云检测结果，取值：1（验证通过）； -1（被限频或者 txt record not found）；-2（txt record not match）；-3（ns record not found）；-4（file not found）；-5（file not match）；-6（cname record not found）；-7（cname record not match）；-8（ns record not found）-9（file not found）；-10（file not match）

    */
    @SerializedName("LocalCheck")
    @Expose
    private Long LocalCheck;

    /**
    * CA检查结果。取值： -1（未检测通过）；2（检测通过）
    */
    @SerializedName("CaCheck")
    @Expose
    private Long CaCheck;

    /**
    * 检查失败原因。状态LocalCheck的具体描述
    */
    @SerializedName("LocalCheckFailReason")
    @Expose
    private String LocalCheckFailReason;

    /**
    * 检查到的值。
    */
    @SerializedName("CheckValue")
    @Expose
    private String [] CheckValue;

    /**
    * 是否被限频拦截， 取值：false（未被限频）；true（被限频）
    */
    @SerializedName("Frequently")
    @Expose
    private Boolean Frequently;

    /**
    * 证书是否已经签发。取值： false（未签发）；true（已签发）
    */
    @SerializedName("Issued")
    @Expose
    private Boolean Issued;

    /**
     * Get 证书绑定的域名。 
     * @return Domain 证书绑定的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 证书绑定的域名。
     * @param Domain 证书绑定的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名验证类型。 取值为：DNS、FILE、DNS_AUTO、DNS_PROXY、FILE_PROXY 
     * @return VerifyType 域名验证类型。 取值为：DNS、FILE、DNS_AUTO、DNS_PROXY、FILE_PROXY
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 域名验证类型。 取值为：DNS、FILE、DNS_AUTO、DNS_PROXY、FILE_PROXY
     * @param VerifyType 域名验证类型。 取值为：DNS、FILE、DNS_AUTO、DNS_PROXY、FILE_PROXY
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 腾讯云检测结果，取值：1（验证通过）； -1（被限频或者 txt record not found）；-2（txt record not match）；-3（ns record not found）；-4（file not found）；-5（file not match）；-6（cname record not found）；-7（cname record not match）；-8（ns record not found）-9（file not found）；-10（file not match）
 
     * @return LocalCheck 腾讯云检测结果，取值：1（验证通过）； -1（被限频或者 txt record not found）；-2（txt record not match）；-3（ns record not found）；-4（file not found）；-5（file not match）；-6（cname record not found）；-7（cname record not match）；-8（ns record not found）-9（file not found）；-10（file not match）

     */
    public Long getLocalCheck() {
        return this.LocalCheck;
    }

    /**
     * Set 腾讯云检测结果，取值：1（验证通过）； -1（被限频或者 txt record not found）；-2（txt record not match）；-3（ns record not found）；-4（file not found）；-5（file not match）；-6（cname record not found）；-7（cname record not match）；-8（ns record not found）-9（file not found）；-10（file not match）

     * @param LocalCheck 腾讯云检测结果，取值：1（验证通过）； -1（被限频或者 txt record not found）；-2（txt record not match）；-3（ns record not found）；-4（file not found）；-5（file not match）；-6（cname record not found）；-7（cname record not match）；-8（ns record not found）-9（file not found）；-10（file not match）

     */
    public void setLocalCheck(Long LocalCheck) {
        this.LocalCheck = LocalCheck;
    }

    /**
     * Get CA检查结果。取值： -1（未检测通过）；2（检测通过） 
     * @return CaCheck CA检查结果。取值： -1（未检测通过）；2（检测通过）
     */
    public Long getCaCheck() {
        return this.CaCheck;
    }

    /**
     * Set CA检查结果。取值： -1（未检测通过）；2（检测通过）
     * @param CaCheck CA检查结果。取值： -1（未检测通过）；2（检测通过）
     */
    public void setCaCheck(Long CaCheck) {
        this.CaCheck = CaCheck;
    }

    /**
     * Get 检查失败原因。状态LocalCheck的具体描述 
     * @return LocalCheckFailReason 检查失败原因。状态LocalCheck的具体描述
     */
    public String getLocalCheckFailReason() {
        return this.LocalCheckFailReason;
    }

    /**
     * Set 检查失败原因。状态LocalCheck的具体描述
     * @param LocalCheckFailReason 检查失败原因。状态LocalCheck的具体描述
     */
    public void setLocalCheckFailReason(String LocalCheckFailReason) {
        this.LocalCheckFailReason = LocalCheckFailReason;
    }

    /**
     * Get 检查到的值。 
     * @return CheckValue 检查到的值。
     */
    public String [] getCheckValue() {
        return this.CheckValue;
    }

    /**
     * Set 检查到的值。
     * @param CheckValue 检查到的值。
     */
    public void setCheckValue(String [] CheckValue) {
        this.CheckValue = CheckValue;
    }

    /**
     * Get 是否被限频拦截， 取值：false（未被限频）；true（被限频） 
     * @return Frequently 是否被限频拦截， 取值：false（未被限频）；true（被限频）
     */
    public Boolean getFrequently() {
        return this.Frequently;
    }

    /**
     * Set 是否被限频拦截， 取值：false（未被限频）；true（被限频）
     * @param Frequently 是否被限频拦截， 取值：false（未被限频）；true（被限频）
     */
    public void setFrequently(Boolean Frequently) {
        this.Frequently = Frequently;
    }

    /**
     * Get 证书是否已经签发。取值： false（未签发）；true（已签发） 
     * @return Issued 证书是否已经签发。取值： false（未签发）；true（已签发）
     */
    public Boolean getIssued() {
        return this.Issued;
    }

    /**
     * Set 证书是否已经签发。取值： false（未签发）；true（已签发）
     * @param Issued 证书是否已经签发。取值： false（未签发）；true（已签发）
     */
    public void setIssued(Boolean Issued) {
        this.Issued = Issued;
    }

    public DomainValidationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainValidationResult(DomainValidationResult source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.LocalCheck != null) {
            this.LocalCheck = new Long(source.LocalCheck);
        }
        if (source.CaCheck != null) {
            this.CaCheck = new Long(source.CaCheck);
        }
        if (source.LocalCheckFailReason != null) {
            this.LocalCheckFailReason = new String(source.LocalCheckFailReason);
        }
        if (source.CheckValue != null) {
            this.CheckValue = new String[source.CheckValue.length];
            for (int i = 0; i < source.CheckValue.length; i++) {
                this.CheckValue[i] = new String(source.CheckValue[i]);
            }
        }
        if (source.Frequently != null) {
            this.Frequently = new Boolean(source.Frequently);
        }
        if (source.Issued != null) {
            this.Issued = new Boolean(source.Issued);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "LocalCheck", this.LocalCheck);
        this.setParamSimple(map, prefix + "CaCheck", this.CaCheck);
        this.setParamSimple(map, prefix + "LocalCheckFailReason", this.LocalCheckFailReason);
        this.setParamArraySimple(map, prefix + "CheckValue.", this.CheckValue);
        this.setParamSimple(map, prefix + "Frequently", this.Frequently);
        this.setParamSimple(map, prefix + "Issued", this.Issued);

    }
}

