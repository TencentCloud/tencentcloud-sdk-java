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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignCertCsr extends AbstractModel{

    /**
    * 用户签名证书的标识，会存在于用户申请的证书中
    */
    @SerializedName("CertMark")
    @Expose
    private String CertMark;

    /**
    * 用户申请签名证书所需要的证书请求文件的base64编码
    */
    @SerializedName("SignCsrContent")
    @Expose
    private String SignCsrContent;

    /**
     * Get 用户签名证书的标识，会存在于用户申请的证书中 
     * @return CertMark 用户签名证书的标识，会存在于用户申请的证书中
     */
    public String getCertMark() {
        return this.CertMark;
    }

    /**
     * Set 用户签名证书的标识，会存在于用户申请的证书中
     * @param CertMark 用户签名证书的标识，会存在于用户申请的证书中
     */
    public void setCertMark(String CertMark) {
        this.CertMark = CertMark;
    }

    /**
     * Get 用户申请签名证书所需要的证书请求文件的base64编码 
     * @return SignCsrContent 用户申请签名证书所需要的证书请求文件的base64编码
     */
    public String getSignCsrContent() {
        return this.SignCsrContent;
    }

    /**
     * Set 用户申请签名证书所需要的证书请求文件的base64编码
     * @param SignCsrContent 用户申请签名证书所需要的证书请求文件的base64编码
     */
    public void setSignCsrContent(String SignCsrContent) {
        this.SignCsrContent = SignCsrContent;
    }

    public SignCertCsr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignCertCsr(SignCertCsr source) {
        if (source.CertMark != null) {
            this.CertMark = new String(source.CertMark);
        }
        if (source.SignCsrContent != null) {
            this.SignCsrContent = new String(source.SignCsrContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertMark", this.CertMark);
        this.setParamSimple(map, prefix + "SignCsrContent", this.SignCsrContent);

    }
}

