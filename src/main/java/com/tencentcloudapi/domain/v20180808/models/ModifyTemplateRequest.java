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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTemplateRequest extends AbstractModel {

    /**
    * 证件信息
    */
    @SerializedName("CertificateInfo")
    @Expose
    private CertificateInfo CertificateInfo;

    /**
    * 联系人信息
    */
    @SerializedName("ContactInfo")
    @Expose
    private ContactInfo ContactInfo;

    /**
    * 模板ID
可通过接口: [DescribeTemplateList](https://cloud.tencent.com/document/product/242/48940)
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 证件信息 
     * @return CertificateInfo 证件信息
     */
    public CertificateInfo getCertificateInfo() {
        return this.CertificateInfo;
    }

    /**
     * Set 证件信息
     * @param CertificateInfo 证件信息
     */
    public void setCertificateInfo(CertificateInfo CertificateInfo) {
        this.CertificateInfo = CertificateInfo;
    }

    /**
     * Get 联系人信息 
     * @return ContactInfo 联系人信息
     */
    public ContactInfo getContactInfo() {
        return this.ContactInfo;
    }

    /**
     * Set 联系人信息
     * @param ContactInfo 联系人信息
     */
    public void setContactInfo(ContactInfo ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    /**
     * Get 模板ID
可通过接口: [DescribeTemplateList](https://cloud.tencent.com/document/product/242/48940) 
     * @return TemplateId 模板ID
可通过接口: [DescribeTemplateList](https://cloud.tencent.com/document/product/242/48940)
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
可通过接口: [DescribeTemplateList](https://cloud.tencent.com/document/product/242/48940)
     * @param TemplateId 模板ID
可通过接口: [DescribeTemplateList](https://cloud.tencent.com/document/product/242/48940)
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ModifyTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTemplateRequest(ModifyTemplateRequest source) {
        if (source.CertificateInfo != null) {
            this.CertificateInfo = new CertificateInfo(source.CertificateInfo);
        }
        if (source.ContactInfo != null) {
            this.ContactInfo = new ContactInfo(source.ContactInfo);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CertificateInfo.", this.CertificateInfo);
        this.setParamObj(map, prefix + "ContactInfo.", this.ContactInfo);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

