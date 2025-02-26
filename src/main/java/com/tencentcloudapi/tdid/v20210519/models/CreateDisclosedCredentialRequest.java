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

public class CreateDisclosedCredentialRequest extends AbstractModel {

    /**
    * 披露策略id，PolicyJson和PolicyId任选其一
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 凭证文本内容，FunctionArg和CredentialText任选其一
    */
    @SerializedName("CredentialData")
    @Expose
    private String CredentialData;

    /**
    * 披露策略文本
    */
    @SerializedName("PolicyJson")
    @Expose
    private String PolicyJson;

    /**
    * DID应用ID
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 用户应用ID
    */
    @SerializedName("UAPId")
    @Expose
    private Long UAPId;

    /**
     * Get 披露策略id，PolicyJson和PolicyId任选其一 
     * @return PolicyId 披露策略id，PolicyJson和PolicyId任选其一
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 披露策略id，PolicyJson和PolicyId任选其一
     * @param PolicyId 披露策略id，PolicyJson和PolicyId任选其一
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 凭证文本内容，FunctionArg和CredentialText任选其一 
     * @return CredentialData 凭证文本内容，FunctionArg和CredentialText任选其一
     */
    public String getCredentialData() {
        return this.CredentialData;
    }

    /**
     * Set 凭证文本内容，FunctionArg和CredentialText任选其一
     * @param CredentialData 凭证文本内容，FunctionArg和CredentialText任选其一
     */
    public void setCredentialData(String CredentialData) {
        this.CredentialData = CredentialData;
    }

    /**
     * Get 披露策略文本 
     * @return PolicyJson 披露策略文本
     */
    public String getPolicyJson() {
        return this.PolicyJson;
    }

    /**
     * Set 披露策略文本
     * @param PolicyJson 披露策略文本
     */
    public void setPolicyJson(String PolicyJson) {
        this.PolicyJson = PolicyJson;
    }

    /**
     * Get DID应用ID 
     * @return DAPId DID应用ID
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用ID
     * @param DAPId DID应用ID
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 用户应用ID 
     * @return UAPId 用户应用ID
     */
    public Long getUAPId() {
        return this.UAPId;
    }

    /**
     * Set 用户应用ID
     * @param UAPId 用户应用ID
     */
    public void setUAPId(Long UAPId) {
        this.UAPId = UAPId;
    }

    public CreateDisclosedCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisclosedCredentialRequest(CreateDisclosedCredentialRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.CredentialData != null) {
            this.CredentialData = new String(source.CredentialData);
        }
        if (source.PolicyJson != null) {
            this.PolicyJson = new String(source.PolicyJson);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.UAPId != null) {
            this.UAPId = new Long(source.UAPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "CredentialData", this.CredentialData);
        this.setParamSimple(map, prefix + "PolicyJson", this.PolicyJson);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "UAPId", this.UAPId);

    }
}

