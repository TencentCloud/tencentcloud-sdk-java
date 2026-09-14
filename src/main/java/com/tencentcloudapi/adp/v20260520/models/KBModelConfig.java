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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBModelConfig extends AbstractModel {

    /**
    * <p>Embedding 模型</p>
    */
    @SerializedName("EmbeddingModel")
    @Expose
    private String EmbeddingModel;

    /**
    * <p>QA 抽取模型</p>
    */
    @SerializedName("QaExtractModel")
    @Expose
    private String QaExtractModel;

    /**
    * <p>Schema 生成模型</p>
    */
    @SerializedName("SchemaModel")
    @Expose
    private String SchemaModel;

    /**
     * Get <p>Embedding 模型</p> 
     * @return EmbeddingModel <p>Embedding 模型</p>
     */
    public String getEmbeddingModel() {
        return this.EmbeddingModel;
    }

    /**
     * Set <p>Embedding 模型</p>
     * @param EmbeddingModel <p>Embedding 模型</p>
     */
    public void setEmbeddingModel(String EmbeddingModel) {
        this.EmbeddingModel = EmbeddingModel;
    }

    /**
     * Get <p>QA 抽取模型</p> 
     * @return QaExtractModel <p>QA 抽取模型</p>
     */
    public String getQaExtractModel() {
        return this.QaExtractModel;
    }

    /**
     * Set <p>QA 抽取模型</p>
     * @param QaExtractModel <p>QA 抽取模型</p>
     */
    public void setQaExtractModel(String QaExtractModel) {
        this.QaExtractModel = QaExtractModel;
    }

    /**
     * Get <p>Schema 生成模型</p> 
     * @return SchemaModel <p>Schema 生成模型</p>
     */
    public String getSchemaModel() {
        return this.SchemaModel;
    }

    /**
     * Set <p>Schema 生成模型</p>
     * @param SchemaModel <p>Schema 生成模型</p>
     */
    public void setSchemaModel(String SchemaModel) {
        this.SchemaModel = SchemaModel;
    }

    public KBModelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBModelConfig(KBModelConfig source) {
        if (source.EmbeddingModel != null) {
            this.EmbeddingModel = new String(source.EmbeddingModel);
        }
        if (source.QaExtractModel != null) {
            this.QaExtractModel = new String(source.QaExtractModel);
        }
        if (source.SchemaModel != null) {
            this.SchemaModel = new String(source.SchemaModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmbeddingModel", this.EmbeddingModel);
        this.setParamSimple(map, prefix + "QaExtractModel", this.QaExtractModel);
        this.setParamSimple(map, prefix + "SchemaModel", this.SchemaModel);

    }
}

