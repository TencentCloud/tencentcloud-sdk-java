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

public class CreateSAMLProviderRequest extends AbstractModel{

    /**
    * SAML身份提供商名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SAML身份提供商描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * SAML身份提供商Base64编码的元数据文档
    */
    @SerializedName("SAMLMetadataDocument")
    @Expose
    private String SAMLMetadataDocument;

    /**
     * Get SAML身份提供商名称 
     * @return Name SAML身份提供商名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set SAML身份提供商名称
     * @param Name SAML身份提供商名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get SAML身份提供商描述 
     * @return Description SAML身份提供商描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set SAML身份提供商描述
     * @param Description SAML身份提供商描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get SAML身份提供商Base64编码的元数据文档 
     * @return SAMLMetadataDocument SAML身份提供商Base64编码的元数据文档
     */
    public String getSAMLMetadataDocument() {
        return this.SAMLMetadataDocument;
    }

    /**
     * Set SAML身份提供商Base64编码的元数据文档
     * @param SAMLMetadataDocument SAML身份提供商Base64编码的元数据文档
     */
    public void setSAMLMetadataDocument(String SAMLMetadataDocument) {
        this.SAMLMetadataDocument = SAMLMetadataDocument;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SAMLMetadataDocument", this.SAMLMetadataDocument);

    }
}

