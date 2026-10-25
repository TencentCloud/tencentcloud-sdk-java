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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrivateCARequest extends AbstractModel {

    /**
    * <p>证书名称，长度 1~32 个字符。</p>
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * <p>证书内容，PEM 格式文本，需为 CA 证书。</p>
    */
    @SerializedName("CertText")
    @Expose
    private String CertText;

    /**
    * <p>验证证书内容，PEM 格式文本。须由所上传的 CA 签发，且 CN 为 sha256(&quot;iothub_主账号Uin&quot;) 的小写十六进制值，用于验证您持有 CA 私钥。</p>
    */
    @SerializedName("VerifyCertText")
    @Expose
    private String VerifyCertText;

    /**
     * Get <p>证书名称，长度 1~32 个字符。</p> 
     * @return CertName <p>证书名称，长度 1~32 个字符。</p>
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set <p>证书名称，长度 1~32 个字符。</p>
     * @param CertName <p>证书名称，长度 1~32 个字符。</p>
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get <p>证书内容，PEM 格式文本，需为 CA 证书。</p> 
     * @return CertText <p>证书内容，PEM 格式文本，需为 CA 证书。</p>
     */
    public String getCertText() {
        return this.CertText;
    }

    /**
     * Set <p>证书内容，PEM 格式文本，需为 CA 证书。</p>
     * @param CertText <p>证书内容，PEM 格式文本，需为 CA 证书。</p>
     */
    public void setCertText(String CertText) {
        this.CertText = CertText;
    }

    /**
     * Get <p>验证证书内容，PEM 格式文本。须由所上传的 CA 签发，且 CN 为 sha256(&quot;iothub_主账号Uin&quot;) 的小写十六进制值，用于验证您持有 CA 私钥。</p> 
     * @return VerifyCertText <p>验证证书内容，PEM 格式文本。须由所上传的 CA 签发，且 CN 为 sha256(&quot;iothub_主账号Uin&quot;) 的小写十六进制值，用于验证您持有 CA 私钥。</p>
     */
    public String getVerifyCertText() {
        return this.VerifyCertText;
    }

    /**
     * Set <p>验证证书内容，PEM 格式文本。须由所上传的 CA 签发，且 CN 为 sha256(&quot;iothub_主账号Uin&quot;) 的小写十六进制值，用于验证您持有 CA 私钥。</p>
     * @param VerifyCertText <p>验证证书内容，PEM 格式文本。须由所上传的 CA 签发，且 CN 为 sha256(&quot;iothub_主账号Uin&quot;) 的小写十六进制值，用于验证您持有 CA 私钥。</p>
     */
    public void setVerifyCertText(String VerifyCertText) {
        this.VerifyCertText = VerifyCertText;
    }

    public CreatePrivateCARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrivateCARequest(CreatePrivateCARequest source) {
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertText != null) {
            this.CertText = new String(source.CertText);
        }
        if (source.VerifyCertText != null) {
            this.VerifyCertText = new String(source.VerifyCertText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertText", this.CertText);
        this.setParamSimple(map, prefix + "VerifyCertText", this.VerifyCertText);

    }
}

