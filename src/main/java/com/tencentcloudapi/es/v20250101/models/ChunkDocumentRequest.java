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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChunkDocumentRequest extends AbstractModel {

    /**
    * 切片文件信息。
    */
    @SerializedName("Document")
    @Expose
    private ChunkDocument Document;

    /**
    * 模型名称，可选模型列表：doc-chunk。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 文件切片配置。
    */
    @SerializedName("Config")
    @Expose
    private ChunkConfig Config;

    /**
     * Get 切片文件信息。 
     * @return Document 切片文件信息。
     */
    public ChunkDocument getDocument() {
        return this.Document;
    }

    /**
     * Set 切片文件信息。
     * @param Document 切片文件信息。
     */
    public void setDocument(ChunkDocument Document) {
        this.Document = Document;
    }

    /**
     * Get 模型名称，可选模型列表：doc-chunk。 
     * @return ModelName 模型名称，可选模型列表：doc-chunk。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称，可选模型列表：doc-chunk。
     * @param ModelName 模型名称，可选模型列表：doc-chunk。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 文件切片配置。 
     * @return Config 文件切片配置。
     */
    public ChunkConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 文件切片配置。
     * @param Config 文件切片配置。
     */
    public void setConfig(ChunkConfig Config) {
        this.Config = Config;
    }

    public ChunkDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkDocumentRequest(ChunkDocumentRequest source) {
        if (source.Document != null) {
            this.Document = new ChunkDocument(source.Document);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Config != null) {
            this.Config = new ChunkConfig(source.Config);
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

