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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDocsRequest extends AbstractModel {

    /**
    * 知识库ID
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 文档ID列表。支持批量删除，数量不超过100
    */
    @SerializedName("DocIds")
    @Expose
    private String [] DocIds;

    /**
     * Get 知识库ID 
     * @return KnowledgeBaseId 知识库ID
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库ID
     * @param KnowledgeBaseId 知识库ID
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get 文档ID列表。支持批量删除，数量不超过100 
     * @return DocIds 文档ID列表。支持批量删除，数量不超过100
     */
    public String [] getDocIds() {
        return this.DocIds;
    }

    /**
     * Set 文档ID列表。支持批量删除，数量不超过100
     * @param DocIds 文档ID列表。支持批量删除，数量不超过100
     */
    public void setDocIds(String [] DocIds) {
        this.DocIds = DocIds;
    }

    public DeleteDocsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDocsRequest(DeleteDocsRequest source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.DocIds != null) {
            this.DocIds = new String[source.DocIds.length];
            for (int i = 0; i < source.DocIds.length; i++) {
                this.DocIds[i] = new String(source.DocIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamArraySimple(map, prefix + "DocIds.", this.DocIds);

    }
}

