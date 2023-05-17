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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserSAMLConfigRequest extends AbstractModel{

    /**
    * SAML元数据文档，需要base64 encode
    */
    @SerializedName("SAMLMetadataDocument")
    @Expose
    private String SAMLMetadataDocument;

    /**
    * 辅助域名
    */
    @SerializedName("AuxiliaryDomain")
    @Expose
    private String AuxiliaryDomain;

    /**
     * Get SAML元数据文档，需要base64 encode 
     * @return SAMLMetadataDocument SAML元数据文档，需要base64 encode
     */
    public String getSAMLMetadataDocument() {
        return this.SAMLMetadataDocument;
    }

    /**
     * Set SAML元数据文档，需要base64 encode
     * @param SAMLMetadataDocument SAML元数据文档，需要base64 encode
     */
    public void setSAMLMetadataDocument(String SAMLMetadataDocument) {
        this.SAMLMetadataDocument = SAMLMetadataDocument;
    }

    /**
     * Get 辅助域名 
     * @return AuxiliaryDomain 辅助域名
     */
    public String getAuxiliaryDomain() {
        return this.AuxiliaryDomain;
    }

    /**
     * Set 辅助域名
     * @param AuxiliaryDomain 辅助域名
     */
    public void setAuxiliaryDomain(String AuxiliaryDomain) {
        this.AuxiliaryDomain = AuxiliaryDomain;
    }

    public CreateUserSAMLConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserSAMLConfigRequest(CreateUserSAMLConfigRequest source) {
        if (source.SAMLMetadataDocument != null) {
            this.SAMLMetadataDocument = new String(source.SAMLMetadataDocument);
        }
        if (source.AuxiliaryDomain != null) {
            this.AuxiliaryDomain = new String(source.AuxiliaryDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SAMLMetadataDocument", this.SAMLMetadataDocument);
        this.setParamSimple(map, prefix + "AuxiliaryDomain", this.AuxiliaryDomain);

    }
}

