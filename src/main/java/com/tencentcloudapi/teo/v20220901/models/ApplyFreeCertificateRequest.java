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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyFreeCertificateRequest extends AbstractModel {

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 申请免费证书的目标域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 申请免费证书的验证方式，详细验证方式说明参考[免费证书申请方式说明文档](https://cloud.tencent.com/document/product/1552/90437) ，相关取值有：
<li>http_challenge：HTTP 访问文件验证方式，通过 HTTP 访问域名指定 URL 获取文件信息以完成免费证书申请验证；</li>
<li>dns_challenge：DNS 委派验证方式，通过添加指定的主机记录解析指向 EdgeOne 以完成免费证书申请验证。</li>
注意：在触发本接口后，你需要根据返回的验证信息，完成验证内容配置。配置完成后，还需要通过<a href = 'https://cloud.tencent.com/document/product/1552/124806'>检查免费证书申请结果</a>接口进行验证，验证通过后，即可申请成功。在免费证书申请成功后，你可以调用<a href = 'https://cloud.tencent.com/document/product/1552/80764'>配置域名证书</a>接口为当前域名部署免费证书。
    */
    @SerializedName("VerificationMethod")
    @Expose
    private String VerificationMethod;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 申请免费证书的目标域名。 
     * @return Domain 申请免费证书的目标域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 申请免费证书的目标域名。
     * @param Domain 申请免费证书的目标域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 申请免费证书的验证方式，详细验证方式说明参考[免费证书申请方式说明文档](https://cloud.tencent.com/document/product/1552/90437) ，相关取值有：
<li>http_challenge：HTTP 访问文件验证方式，通过 HTTP 访问域名指定 URL 获取文件信息以完成免费证书申请验证；</li>
<li>dns_challenge：DNS 委派验证方式，通过添加指定的主机记录解析指向 EdgeOne 以完成免费证书申请验证。</li>
注意：在触发本接口后，你需要根据返回的验证信息，完成验证内容配置。配置完成后，还需要通过<a href = 'https://cloud.tencent.com/document/product/1552/124806'>检查免费证书申请结果</a>接口进行验证，验证通过后，即可申请成功。在免费证书申请成功后，你可以调用<a href = 'https://cloud.tencent.com/document/product/1552/80764'>配置域名证书</a>接口为当前域名部署免费证书。 
     * @return VerificationMethod 申请免费证书的验证方式，详细验证方式说明参考[免费证书申请方式说明文档](https://cloud.tencent.com/document/product/1552/90437) ，相关取值有：
<li>http_challenge：HTTP 访问文件验证方式，通过 HTTP 访问域名指定 URL 获取文件信息以完成免费证书申请验证；</li>
<li>dns_challenge：DNS 委派验证方式，通过添加指定的主机记录解析指向 EdgeOne 以完成免费证书申请验证。</li>
注意：在触发本接口后，你需要根据返回的验证信息，完成验证内容配置。配置完成后，还需要通过<a href = 'https://cloud.tencent.com/document/product/1552/124806'>检查免费证书申请结果</a>接口进行验证，验证通过后，即可申请成功。在免费证书申请成功后，你可以调用<a href = 'https://cloud.tencent.com/document/product/1552/80764'>配置域名证书</a>接口为当前域名部署免费证书。
     */
    public String getVerificationMethod() {
        return this.VerificationMethod;
    }

    /**
     * Set 申请免费证书的验证方式，详细验证方式说明参考[免费证书申请方式说明文档](https://cloud.tencent.com/document/product/1552/90437) ，相关取值有：
<li>http_challenge：HTTP 访问文件验证方式，通过 HTTP 访问域名指定 URL 获取文件信息以完成免费证书申请验证；</li>
<li>dns_challenge：DNS 委派验证方式，通过添加指定的主机记录解析指向 EdgeOne 以完成免费证书申请验证。</li>
注意：在触发本接口后，你需要根据返回的验证信息，完成验证内容配置。配置完成后，还需要通过<a href = 'https://cloud.tencent.com/document/product/1552/124806'>检查免费证书申请结果</a>接口进行验证，验证通过后，即可申请成功。在免费证书申请成功后，你可以调用<a href = 'https://cloud.tencent.com/document/product/1552/80764'>配置域名证书</a>接口为当前域名部署免费证书。
     * @param VerificationMethod 申请免费证书的验证方式，详细验证方式说明参考[免费证书申请方式说明文档](https://cloud.tencent.com/document/product/1552/90437) ，相关取值有：
<li>http_challenge：HTTP 访问文件验证方式，通过 HTTP 访问域名指定 URL 获取文件信息以完成免费证书申请验证；</li>
<li>dns_challenge：DNS 委派验证方式，通过添加指定的主机记录解析指向 EdgeOne 以完成免费证书申请验证。</li>
注意：在触发本接口后，你需要根据返回的验证信息，完成验证内容配置。配置完成后，还需要通过<a href = 'https://cloud.tencent.com/document/product/1552/124806'>检查免费证书申请结果</a>接口进行验证，验证通过后，即可申请成功。在免费证书申请成功后，你可以调用<a href = 'https://cloud.tencent.com/document/product/1552/80764'>配置域名证书</a>接口为当前域名部署免费证书。
     */
    public void setVerificationMethod(String VerificationMethod) {
        this.VerificationMethod = VerificationMethod;
    }

    public ApplyFreeCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyFreeCertificateRequest(ApplyFreeCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.VerificationMethod != null) {
            this.VerificationMethod = new String(source.VerificationMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VerificationMethod", this.VerificationMethod);

    }
}

