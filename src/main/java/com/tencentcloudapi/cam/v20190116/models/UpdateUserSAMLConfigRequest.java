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

public class UpdateUserSAMLConfigRequest extends AbstractModel{

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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "SAMLMetadataDocument", this.SAMLMetadataDocument);

    }
}

