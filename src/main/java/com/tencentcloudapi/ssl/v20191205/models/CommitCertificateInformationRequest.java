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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommitCertificateInformationRequest extends AbstractModel{

    /**
    * 证书 ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 域名验证方式
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get 证书 ID。 
     * @return CertificateId 证书 ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书 ID。
     * @param CertificateId 证书 ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 域名验证方式 
     * @return VerifyType 域名验证方式
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 域名验证方式
     * @param VerifyType 域名验证方式
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public CommitCertificateInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitCertificateInformationRequest(CommitCertificateInformationRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

