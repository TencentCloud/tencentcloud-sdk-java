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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertDomainsRequest extends AbstractModel{

    /**
    * PEM格式证书Base64编码后的字符串
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 托管证书ID，Cert和CertId不能均未空，都填写时以CerId为准。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 域名所属产品，cdn或ecdn，默认cdn。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get PEM格式证书Base64编码后的字符串 
     * @return Cert PEM格式证书Base64编码后的字符串
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set PEM格式证书Base64编码后的字符串
     * @param Cert PEM格式证书Base64编码后的字符串
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get 托管证书ID，Cert和CertId不能均未空，都填写时以CerId为准。 
     * @return CertId 托管证书ID，Cert和CertId不能均未空，都填写时以CerId为准。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 托管证书ID，Cert和CertId不能均未空，都填写时以CerId为准。
     * @param CertId 托管证书ID，Cert和CertId不能均未空，都填写时以CerId为准。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 域名所属产品，cdn或ecdn，默认cdn。 
     * @return Product 域名所属产品，cdn或ecdn，默认cdn。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 域名所属产品，cdn或ecdn，默认cdn。
     * @param Product 域名所属产品，cdn或ecdn，默认cdn。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeCertDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertDomainsRequest(DescribeCertDomainsRequest source) {
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

