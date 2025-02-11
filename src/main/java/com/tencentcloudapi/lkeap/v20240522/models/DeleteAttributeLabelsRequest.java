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

public class DeleteAttributeLabelsRequest extends AbstractModel {

    /**
    * 知识库ID
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 属性ID
    */
    @SerializedName("AttributeIds")
    @Expose
    private String [] AttributeIds;

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
     * Get 属性ID 
     * @return AttributeIds 属性ID
     */
    public String [] getAttributeIds() {
        return this.AttributeIds;
    }

    /**
     * Set 属性ID
     * @param AttributeIds 属性ID
     */
    public void setAttributeIds(String [] AttributeIds) {
        this.AttributeIds = AttributeIds;
    }

    public DeleteAttributeLabelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAttributeLabelsRequest(DeleteAttributeLabelsRequest source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.AttributeIds != null) {
            this.AttributeIds = new String[source.AttributeIds.length];
            for (int i = 0; i < source.AttributeIds.length; i++) {
                this.AttributeIds[i] = new String(source.AttributeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamArraySimple(map, prefix + "AttributeIds.", this.AttributeIds);

    }
}

