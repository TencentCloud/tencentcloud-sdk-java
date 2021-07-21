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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrivateCARequest extends AbstractModel{

    /**
    * CA证书名称
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * CA证书内容
    */
    @SerializedName("CertText")
    @Expose
    private String CertText;

    /**
    * 校验CA证书的证书内容
    */
    @SerializedName("VerifyCertText")
    @Expose
    private String VerifyCertText;

    /**
     * Get CA证书名称 
     * @return CertName CA证书名称
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set CA证书名称
     * @param CertName CA证书名称
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get CA证书内容 
     * @return CertText CA证书内容
     */
    public String getCertText() {
        return this.CertText;
    }

    /**
     * Set CA证书内容
     * @param CertText CA证书内容
     */
    public void setCertText(String CertText) {
        this.CertText = CertText;
    }

    /**
     * Get 校验CA证书的证书内容 
     * @return VerifyCertText 校验CA证书的证书内容
     */
    public String getVerifyCertText() {
        return this.VerifyCertText;
    }

    /**
     * Set 校验CA证书的证书内容
     * @param VerifyCertText 校验CA证书的证书内容
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

