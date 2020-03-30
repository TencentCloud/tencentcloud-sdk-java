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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateL7RuleCertRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源实例ID，比如高防IP实例的ID，高防IP专业版实例的ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 证书类型，当为协议为HTTPS协议时必须填，取值[2(腾讯云托管证书)]
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源实例ID，比如高防IP实例的ID，高防IP专业版实例的ID 
     * @return Id 资源实例ID，比如高防IP实例的ID，高防IP专业版实例的ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源实例ID，比如高防IP实例的ID，高防IP专业版实例的ID
     * @param Id 资源实例ID，比如高防IP实例的ID，高防IP专业版实例的ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 证书类型，当为协议为HTTPS协议时必须填，取值[2(腾讯云托管证书)] 
     * @return CertType 证书类型，当为协议为HTTPS协议时必须填，取值[2(腾讯云托管证书)]
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型，当为协议为HTTPS协议时必须填，取值[2(腾讯云托管证书)]
     * @param CertType 证书类型，当为协议为HTTPS协议时必须填，取值[2(腾讯云托管证书)]
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID 
     * @return SSLId 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     * @param SSLId 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段) 
     * @return Cert 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     * @param Cert 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段) 
     * @return PrivateKey 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     * @param PrivateKey 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);

    }
}

