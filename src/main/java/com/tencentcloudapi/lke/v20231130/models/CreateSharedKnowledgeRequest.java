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
    * <p>共享知识库名称，字符数量范围：[1, 50]</p>
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * <p>共享知识库描述，字符数量上限2000</p>
    */
    @SerializedName("KnowledgeDescription")
    @Expose
    private String KnowledgeDescription;

    /**
    * <p>Embedding模型，字符数量上限128</p>
    */
    @SerializedName("EmbeddingModel")
    @Expose
    private String EmbeddingModel;

    /**
    * <p>共享知识库类型，0普通，1公众号</p>
    */
    @SerializedName("KnowledgeType")
    @Expose
    private Long KnowledgeType;

    /**
    * <p>ES存储配置</p>
    */
    @SerializedName("EsConfig")
    @Expose
    private ESConfig EsConfig;

    /**
     * Get <p>共享知识库名称，字符数量范围：[1, 50]</p> 
     * @return KnowledgeName <p>共享知识库名称，字符数量范围：[1, 50]</p>
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set <p>共享知识库名称，字符数量范围：[1, 50]</p>
     * @param KnowledgeName <p>共享知识库名称，字符数量范围：[1, 50]</p>
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get <p>共享知识库描述，字符数量上限2000</p> 
     * @return KnowledgeDescription <p>共享知识库描述，字符数量上限2000</p>
     */
    public String getKnowledgeDescription() {
        return this.KnowledgeDescription;
    }

    /**
     * Set <p>共享知识库描述，字符数量上限2000</p>
     * @param KnowledgeDescription <p>共享知识库描述，字符数量上限2000</p>
     */
    public void setKnowledgeDescription(String KnowledgeDescription) {
        this.KnowledgeDescription = KnowledgeDescription;
    }

    /**
     * Get <p>Embedding模型，字符数量上限128</p> 
     * @return EmbeddingModel <p>Embedding模型，字符数量上限128</p>
     * @deprecated
     */
    @Deprecated
    public String getEmbeddingModel() {
        return this.EmbeddingModel;
    }

    /**
     * Set <p>Embedding模型，字符数量上限128</p>
     * @param EmbeddingModel <p>Embedding模型，字符数量上限128</p>
     * @deprecated
     */
    @Deprecated
    public void setEmbeddingModel(String EmbeddingModel) {
        this.EmbeddingModel = EmbeddingModel;
    }

    /**
     * Get <p>共享知识库类型，0普通，1公众号</p> 
     * @return KnowledgeType <p>共享知识库类型，0普通，1公众号</p>
     */
    public Long getKnowledgeType() {
        return this.KnowledgeType;
    }

    /**
     * Set <p>共享知识库类型，0普通，1公众号</p>
     * @param KnowledgeType <p>共享知识库类型，0普通，1公众号</p>
     */
    public void setKnowledgeType(Long KnowledgeType) {
        this.KnowledgeType = KnowledgeType;
    }

    /**
     * Get <p>ES存储配置</p> 
     * @return EsConfig <p>ES存储配置</p>
     */
    public ESConfig getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set <p>ES存储配置</p>
     * @param EsConfig <p>ES存储配置</p>
     */
    public void setEsConfig(ESConfig EsConfig) {
        this.EsConfig = EsConfig;
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
        if (source.KnowledgeType != null) {
            this.KnowledgeType = new Long(source.KnowledgeType);
        }
        if (source.EsConfig != null) {
            this.EsConfig = new ESConfig(source.EsConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);
        this.setParamSimple(map, prefix + "KnowledgeDescription", this.KnowledgeDescription);
        this.setParamSimple(map, prefix + "EmbeddingModel", this.EmbeddingModel);
        this.setParamSimple(map, prefix + "KnowledgeType", this.KnowledgeType);
        this.setParamObj(map, prefix + "EsConfig.", this.EsConfig);

    }
}

