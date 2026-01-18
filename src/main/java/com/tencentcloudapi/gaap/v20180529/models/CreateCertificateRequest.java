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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCertificateRequest extends AbstractModel {

    /**
    * <p>证书类型。其中：0，表示基础认证配置；1，表示客户端CA证书；2，服务器SSL证书；3，表示源站CA证书；4，表示通道SSL证书。</p>
    */
    @SerializedName("CertificateType")
    @Expose
    private Long CertificateType;

    /**
    * <p>证书内容。采用url编码。其中：当证书类型为基础认证配置时，该参数填写用户名/密码对。格式：“用户名：密码”，例如：root:FSGdT。其中密码使用htpasswd或者openssl，例如：openssl passwd -crypt 123456。当证书类型为CA/SSL证书时，该参数填写证书内容，格式为pem。</p>
    */
    @SerializedName("CertificateContent")
    @Expose
    private String CertificateContent;

    /**
    * <p>证书名称</p>
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * <p>密钥内容。采用url编码。仅当证书类型为SSL证书时，需要填写该参数。格式为pem。</p>
    */
    @SerializedName("CertificateKey")
    @Expose
    private String CertificateKey;

    /**
     * Get <p>证书类型。其中：0，表示基础认证配置；1，表示客户端CA证书；2，服务器SSL证书；3，表示源站CA证书；4，表示通道SSL证书。</p> 
     * @return CertificateType <p>证书类型。其中：0，表示基础认证配置；1，表示客户端CA证书；2，服务器SSL证书；3，表示源站CA证书；4，表示通道SSL证书。</p>
     */
    public Long getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set <p>证书类型。其中：0，表示基础认证配置；1，表示客户端CA证书；2，服务器SSL证书；3，表示源站CA证书；4，表示通道SSL证书。</p>
     * @param CertificateType <p>证书类型。其中：0，表示基础认证配置；1，表示客户端CA证书；2，服务器SSL证书；3，表示源站CA证书；4，表示通道SSL证书。</p>
     */
    public void setCertificateType(Long CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get <p>证书内容。采用url编码。其中：当证书类型为基础认证配置时，该参数填写用户名/密码对。格式：“用户名：密码”，例如：root:FSGdT。其中密码使用htpasswd或者openssl，例如：openssl passwd -crypt 123456。当证书类型为CA/SSL证书时，该参数填写证书内容，格式为pem。</p> 
     * @return CertificateContent <p>证书内容。采用url编码。其中：当证书类型为基础认证配置时，该参数填写用户名/密码对。格式：“用户名：密码”，例如：root:FSGdT。其中密码使用htpasswd或者openssl，例如：openssl passwd -crypt 123456。当证书类型为CA/SSL证书时，该参数填写证书内容，格式为pem。</p>
     */
    public String getCertificateContent() {
        return this.CertificateContent;
    }

    /**
     * Set <p>证书内容。采用url编码。其中：当证书类型为基础认证配置时，该参数填写用户名/密码对。格式：“用户名：密码”，例如：root:FSGdT。其中密码使用htpasswd或者openssl，例如：openssl passwd -crypt 123456。当证书类型为CA/SSL证书时，该参数填写证书内容，格式为pem。</p>
     * @param CertificateContent <p>证书内容。采用url编码。其中：当证书类型为基础认证配置时，该参数填写用户名/密码对。格式：“用户名：密码”，例如：root:FSGdT。其中密码使用htpasswd或者openssl，例如：openssl passwd -crypt 123456。当证书类型为CA/SSL证书时，该参数填写证书内容，格式为pem。</p>
     */
    public void setCertificateContent(String CertificateContent) {
        this.CertificateContent = CertificateContent;
    }

    /**
     * Get <p>证书名称</p> 
     * @return CertificateAlias <p>证书名称</p>
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set <p>证书名称</p>
     * @param CertificateAlias <p>证书名称</p>
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get <p>密钥内容。采用url编码。仅当证书类型为SSL证书时，需要填写该参数。格式为pem。</p> 
     * @return CertificateKey <p>密钥内容。采用url编码。仅当证书类型为SSL证书时，需要填写该参数。格式为pem。</p>
     */
    public String getCertificateKey() {
        return this.CertificateKey;
    }

    /**
     * Set <p>密钥内容。采用url编码。仅当证书类型为SSL证书时，需要填写该参数。格式为pem。</p>
     * @param CertificateKey <p>密钥内容。采用url编码。仅当证书类型为SSL证书时，需要填写该参数。格式为pem。</p>
     */
    public void setCertificateKey(String CertificateKey) {
        this.CertificateKey = CertificateKey;
    }

    public CreateCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCertificateRequest(CreateCertificateRequest source) {
        if (source.CertificateType != null) {
            this.CertificateType = new Long(source.CertificateType);
        }
        if (source.CertificateContent != null) {
            this.CertificateContent = new String(source.CertificateContent);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
        if (source.CertificateKey != null) {
            this.CertificateKey = new String(source.CertificateKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "CertificateContent", this.CertificateContent);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "CertificateKey", this.CertificateKey);

    }
}

