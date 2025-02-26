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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePresentationRequest extends AbstractModel {

    /**
    * DID应用id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 用户应用id
    */
    @SerializedName("UAPId")
    @Expose
    private Long UAPId;

    /**
    * 凭证列表
    */
    @SerializedName("Credentials")
    @Expose
    private String [] Credentials;

    /**
    * VP持有人的DID标识
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * VP随机验证码
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
    * 选择性披露策略
    */
    @SerializedName("PolicyJson")
    @Expose
    private String PolicyJson;

    /**
    * 是否签名，ture时signatureValue为待签名内容由调用端自行签名，false时signatureValue为平台自动已签名的内容。默认false
    */
    @SerializedName("Unsigned")
    @Expose
    private Boolean Unsigned;

    /**
    * 可验证凭证证明列表
    */
    @SerializedName("CredentialList")
    @Expose
    private CredentialProof [] CredentialList;

    /**
     * Get DID应用id 
     * @return DAPId DID应用id
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用id
     * @param DAPId DID应用id
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 用户应用id 
     * @return UAPId 用户应用id
     */
    public Long getUAPId() {
        return this.UAPId;
    }

    /**
     * Set 用户应用id
     * @param UAPId 用户应用id
     */
    public void setUAPId(Long UAPId) {
        this.UAPId = UAPId;
    }

    /**
     * Get 凭证列表 
     * @return Credentials 凭证列表
     */
    public String [] getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 凭证列表
     * @param Credentials 凭证列表
     */
    public void setCredentials(String [] Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get VP持有人的DID标识 
     * @return Did VP持有人的DID标识
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set VP持有人的DID标识
     * @param Did VP持有人的DID标识
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get VP随机验证码 
     * @return VerifyCode VP随机验证码
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set VP随机验证码
     * @param VerifyCode VP随机验证码
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    /**
     * Get 选择性披露策略 
     * @return PolicyJson 选择性披露策略
     */
    public String getPolicyJson() {
        return this.PolicyJson;
    }

    /**
     * Set 选择性披露策略
     * @param PolicyJson 选择性披露策略
     */
    public void setPolicyJson(String PolicyJson) {
        this.PolicyJson = PolicyJson;
    }

    /**
     * Get 是否签名，ture时signatureValue为待签名内容由调用端自行签名，false时signatureValue为平台自动已签名的内容。默认false 
     * @return Unsigned 是否签名，ture时signatureValue为待签名内容由调用端自行签名，false时signatureValue为平台自动已签名的内容。默认false
     */
    public Boolean getUnsigned() {
        return this.Unsigned;
    }

    /**
     * Set 是否签名，ture时signatureValue为待签名内容由调用端自行签名，false时signatureValue为平台自动已签名的内容。默认false
     * @param Unsigned 是否签名，ture时signatureValue为待签名内容由调用端自行签名，false时signatureValue为平台自动已签名的内容。默认false
     */
    public void setUnsigned(Boolean Unsigned) {
        this.Unsigned = Unsigned;
    }

    /**
     * Get 可验证凭证证明列表 
     * @return CredentialList 可验证凭证证明列表
     */
    public CredentialProof [] getCredentialList() {
        return this.CredentialList;
    }

    /**
     * Set 可验证凭证证明列表
     * @param CredentialList 可验证凭证证明列表
     */
    public void setCredentialList(CredentialProof [] CredentialList) {
        this.CredentialList = CredentialList;
    }

    public CreatePresentationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePresentationRequest(CreatePresentationRequest source) {
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.UAPId != null) {
            this.UAPId = new Long(source.UAPId);
        }
        if (source.Credentials != null) {
            this.Credentials = new String[source.Credentials.length];
            for (int i = 0; i < source.Credentials.length; i++) {
                this.Credentials[i] = new String(source.Credentials[i]);
            }
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
        if (source.PolicyJson != null) {
            this.PolicyJson = new String(source.PolicyJson);
        }
        if (source.Unsigned != null) {
            this.Unsigned = new Boolean(source.Unsigned);
        }
        if (source.CredentialList != null) {
            this.CredentialList = new CredentialProof[source.CredentialList.length];
            for (int i = 0; i < source.CredentialList.length; i++) {
                this.CredentialList[i] = new CredentialProof(source.CredentialList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "UAPId", this.UAPId);
        this.setParamArraySimple(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);
        this.setParamSimple(map, prefix + "PolicyJson", this.PolicyJson);
        this.setParamSimple(map, prefix + "Unsigned", this.Unsigned);
        this.setParamArrayObj(map, prefix + "CredentialList.", this.CredentialList);

    }
}

