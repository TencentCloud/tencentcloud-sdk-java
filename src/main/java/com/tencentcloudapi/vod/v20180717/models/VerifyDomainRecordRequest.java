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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyDomainRecordRequest extends AbstractModel {

    /**
    * 需要接入点播的加速域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2024年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>	
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 验证方式：
<li>dns：DNS 解析验证；</li>
<li>fIle：文件验证。</li>

默认值：dns。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get 需要接入点播的加速域名。 
     * @return Domain 需要接入点播的加速域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要接入点播的加速域名。
     * @param Domain 需要接入点播的加速域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2024年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>	 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2024年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>	
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2024年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>	
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2024年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>	
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 验证方式：
<li>dns：DNS 解析验证；</li>
<li>fIle：文件验证。</li>

默认值：dns。 
     * @return VerifyType 验证方式：
<li>dns：DNS 解析验证；</li>
<li>fIle：文件验证。</li>

默认值：dns。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证方式：
<li>dns：DNS 解析验证；</li>
<li>fIle：文件验证。</li>

默认值：dns。
     * @param VerifyType 验证方式：
<li>dns：DNS 解析验证；</li>
<li>fIle：文件验证。</li>

默认值：dns。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public VerifyDomainRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDomainRecordRequest(VerifyDomainRecordRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

