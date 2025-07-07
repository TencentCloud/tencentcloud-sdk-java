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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyCredentialsRequest extends AbstractModel {

    /**
    * 0:仅验证签名，1:验证签名和链上状态，2, 仅验证链上状态，默认为0, 3.验证DID和凭证状态以及签名，4. 验证历史凭证有效性
    */
    @SerializedName("VerifyType")
    @Expose
    private Long VerifyType;

    /**
    * 凭证内容
    */
    @SerializedName("CredentialData")
    @Expose
    private String CredentialData;

    /**
    * DID应用id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
     * Get 0:仅验证签名，1:验证签名和链上状态，2, 仅验证链上状态，默认为0, 3.验证DID和凭证状态以及签名，4. 验证历史凭证有效性 
     * @return VerifyType 0:仅验证签名，1:验证签名和链上状态，2, 仅验证链上状态，默认为0, 3.验证DID和凭证状态以及签名，4. 验证历史凭证有效性
     */
    public Long getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 0:仅验证签名，1:验证签名和链上状态，2, 仅验证链上状态，默认为0, 3.验证DID和凭证状态以及签名，4. 验证历史凭证有效性
     * @param VerifyType 0:仅验证签名，1:验证签名和链上状态，2, 仅验证链上状态，默认为0, 3.验证DID和凭证状态以及签名，4. 验证历史凭证有效性
     */
    public void setVerifyType(Long VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 凭证内容 
     * @return CredentialData 凭证内容
     */
    public String getCredentialData() {
        return this.CredentialData;
    }

    /**
     * Set 凭证内容
     * @param CredentialData 凭证内容
     */
    public void setCredentialData(String CredentialData) {
        this.CredentialData = CredentialData;
    }

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

    public VerifyCredentialsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyCredentialsRequest(VerifyCredentialsRequest source) {
        if (source.VerifyType != null) {
            this.VerifyType = new Long(source.VerifyType);
        }
        if (source.CredentialData != null) {
            this.CredentialData = new String(source.CredentialData);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "CredentialData", this.CredentialData);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);

    }
}

