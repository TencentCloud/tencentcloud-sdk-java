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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTemplateRequest extends AbstractModel{

    /**
    * 联系人信息
    */
    @SerializedName("ContactInfo")
    @Expose
    private ContactInfo ContactInfo;

    /**
    * 证件信息
    */
    @SerializedName("CertificateInfo")
    @Expose
    private CertificateInfo CertificateInfo;

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

    public CreateTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTemplateRequest(CreateTemplateRequest source) {
        if (source.ContactInfo != null) {
            this.ContactInfo = new ContactInfo(source.ContactInfo);
        }
        if (source.CertificateInfo != null) {
            this.CertificateInfo = new CertificateInfo(source.CertificateInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ContactInfo.", this.ContactInfo);
        this.setParamObj(map, prefix + "CertificateInfo.", this.CertificateInfo);

    }
}

