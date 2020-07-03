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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadCertRequest extends AbstractModel{

    /**
    * 证书类型，可选值：CA，SVR。
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 证书内容。
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 证书别名。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 私钥内容，证书类型为SVR时不需要传递。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get 证书类型，可选值：CA，SVR。 
     * @return CertType 证书类型，可选值：CA，SVR。
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型，可选值：CA，SVR。
     * @param CertType 证书类型，可选值：CA，SVR。
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 证书内容。 
     * @return Cert 证书内容。
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 证书内容。
     * @param Cert 证书内容。
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get 证书别名。 
     * @return Alias 证书别名。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 证书别名。
     * @param Alias 证书别名。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 私钥内容，证书类型为SVR时不需要传递。 
     * @return Key 私钥内容，证书类型为SVR时不需要传递。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 私钥内容，证书类型为SVR时不需要传递。
     * @param Key 私钥内容，证书类型为SVR时不需要传递。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

