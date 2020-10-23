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

public class CheckCertificateChainRequest extends AbstractModel{

    /**
    * 待检查的证书链
    */
    @SerializedName("CertificateChain")
    @Expose
    private String CertificateChain;

    /**
     * Get 待检查的证书链 
     * @return CertificateChain 待检查的证书链
     */
    public String getCertificateChain() {
        return this.CertificateChain;
    }

    /**
     * Set 待检查的证书链
     * @param CertificateChain 待检查的证书链
     */
    public void setCertificateChain(String CertificateChain) {
        this.CertificateChain = CertificateChain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateChain", this.CertificateChain);

    }
}

