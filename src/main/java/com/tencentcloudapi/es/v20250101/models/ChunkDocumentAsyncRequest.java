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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChunkDocumentAsyncRequest extends AbstractModel {

    /**
    * 文件信息。
    */
    @SerializedName("Document")
    @Expose
    private Document Document;

    /**
    * 模型名称，可选模型列表：doc-tree-chunk。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 文件切片配置。
    */
    @SerializedName("Config")
    @Expose
    private ChunkConfigAsync Config;

    /**
     * Get 文件信息。 
     * @return Document 文件信息。
     */
    public Document getDocument() {
        return this.Document;
    }

    /**
     * Set 文件信息。
     * @param Document 文件信息。
     */
    public void setDocument(Document Document) {
        this.Document = Document;
    }

    /**
     * Get 模型名称，可选模型列表：doc-tree-chunk。 
     * @return ModelName 模型名称，可选模型列表：doc-tree-chunk。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称，可选模型列表：doc-tree-chunk。
     * @param ModelName 模型名称，可选模型列表：doc-tree-chunk。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 文件切片配置。 
     * @return Config 文件切片配置。
     */
    public ChunkConfigAsync getConfig() {
        return this.Config;
    }

    /**
     * Set 文件切片配置。
     * @param Config 文件切片配置。
     */
    public void setConfig(ChunkConfigAsync Config) {
        this.Config = Config;
    }

    public ChunkDocumentAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkDocumentAsyncRequest(ChunkDocumentAsyncRequest source) {
        if (source.Document != null) {
            this.Document = new Document(source.Document);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Config != null) {
            this.Config = new ChunkConfigAsync(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Document.", this.Document);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

