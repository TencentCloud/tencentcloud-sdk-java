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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserSAMLConfigRequest extends AbstractModel {

    /**
    * 修改的操作类型:enable:启用,disable:禁用,updateSAML:修改元数据文档
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 元数据文档，需要base64 encode，仅当Operate为updateSAML时需要此参数
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
     * Get 修改的操作类型:enable:启用,disable:禁用,updateSAML:修改元数据文档 
     * @return Operate 修改的操作类型:enable:启用,disable:禁用,updateSAML:修改元数据文档
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 修改的操作类型:enable:启用,disable:禁用,updateSAML:修改元数据文档
     * @param Operate 修改的操作类型:enable:启用,disable:禁用,updateSAML:修改元数据文档
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 元数据文档，需要base64 encode，仅当Operate为updateSAML时需要此参数 
     * @return SAMLMetadataDocument 元数据文档，需要base64 encode，仅当Operate为updateSAML时需要此参数
     */
    public String getSAMLMetadataDocument() {
        return this.SAMLMetadataDocument;
    }

    /**
     * Set 元数据文档，需要base64 encode，仅当Operate为updateSAML时需要此参数
     * @param SAMLMetadataDocument 元数据文档，需要base64 encode，仅当Operate为updateSAML时需要此参数
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

    public UpdateUserSAMLConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserSAMLConfigRequest(UpdateUserSAMLConfigRequest source) {
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
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
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "SAMLMetadataDocument", this.SAMLMetadataDocument);
        this.setParamSimple(map, prefix + "AuxiliaryDomain", this.AuxiliaryDomain);

    }
}

