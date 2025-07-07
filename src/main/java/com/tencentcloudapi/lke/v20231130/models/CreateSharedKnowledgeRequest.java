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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSharedKnowledgeRequest extends AbstractModel {

    /**
    * 共享知识库名称，字符数量范围：[1, 50]
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * 共享知识库描述，字符数量上限2000
    */
    @SerializedName("KnowledgeDescription")
    @Expose
    private String KnowledgeDescription;

    /**
    * Embedding模型，字符数量上限128
    */
    @SerializedName("EmbeddingModel")
    @Expose
    private String EmbeddingModel;

    /**
     * Get 共享知识库名称，字符数量范围：[1, 50] 
     * @return KnowledgeName 共享知识库名称，字符数量范围：[1, 50]
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set 共享知识库名称，字符数量范围：[1, 50]
     * @param KnowledgeName 共享知识库名称，字符数量范围：[1, 50]
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get 共享知识库描述，字符数量上限2000 
     * @return KnowledgeDescription 共享知识库描述，字符数量上限2000
     */
    public String getKnowledgeDescription() {
        return this.KnowledgeDescription;
    }

    /**
     * Set 共享知识库描述，字符数量上限2000
     * @param KnowledgeDescription 共享知识库描述，字符数量上限2000
     */
    public void setKnowledgeDescription(String KnowledgeDescription) {
        this.KnowledgeDescription = KnowledgeDescription;
    }

    /**
     * Get Embedding模型，字符数量上限128 
     * @return EmbeddingModel Embedding模型，字符数量上限128
     */
    public String getEmbeddingModel() {
        return this.EmbeddingModel;
    }

    /**
     * Set Embedding模型，字符数量上限128
     * @param EmbeddingModel Embedding模型，字符数量上限128
     */
    public void setEmbeddingModel(String EmbeddingModel) {
        this.EmbeddingModel = EmbeddingModel;
    }

    public CreateSharedKnowledgeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSharedKnowledgeRequest(CreateSharedKnowledgeRequest source) {
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
        if (source.KnowledgeDescription != null) {
            this.KnowledgeDescription = new String(source.KnowledgeDescription);
        }
        if (source.EmbeddingModel != null) {
            this.EmbeddingModel = new String(source.EmbeddingModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);
        this.setParamSimple(map, prefix + "KnowledgeDescription", this.KnowledgeDescription);
        this.setParamSimple(map, prefix + "EmbeddingModel", this.EmbeddingModel);

    }
}

