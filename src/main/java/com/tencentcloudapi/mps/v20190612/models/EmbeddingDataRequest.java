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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbeddingDataRequest extends AbstractModel {

    /**
    * <p>embedding 的模型，现在只支持 text_embedding_v1</p><p>枚举值：</p><ul><li>text_embedding_v1： 文本embedding的模型，可以填写Prompt</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>embedding的输入</p>
    */
    @SerializedName("Files")
    @Expose
    private EmbeddingData [] Files;

    /**
    * <p>embedding 的输入prompt</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
     * Get <p>embedding 的模型，现在只支持 text_embedding_v1</p><p>枚举值：</p><ul><li>text_embedding_v1： 文本embedding的模型，可以填写Prompt</li></ul> 
     * @return Model <p>embedding 的模型，现在只支持 text_embedding_v1</p><p>枚举值：</p><ul><li>text_embedding_v1： 文本embedding的模型，可以填写Prompt</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>embedding 的模型，现在只支持 text_embedding_v1</p><p>枚举值：</p><ul><li>text_embedding_v1： 文本embedding的模型，可以填写Prompt</li></ul>
     * @param Model <p>embedding 的模型，现在只支持 text_embedding_v1</p><p>枚举值：</p><ul><li>text_embedding_v1： 文本embedding的模型，可以填写Prompt</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>embedding的输入</p> 
     * @return Files <p>embedding的输入</p>
     */
    public EmbeddingData [] getFiles() {
        return this.Files;
    }

    /**
     * Set <p>embedding的输入</p>
     * @param Files <p>embedding的输入</p>
     */
    public void setFiles(EmbeddingData [] Files) {
        this.Files = Files;
    }

    /**
     * Get <p>embedding 的输入prompt</p> 
     * @return Prompt <p>embedding 的输入prompt</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>embedding 的输入prompt</p>
     * @param Prompt <p>embedding 的输入prompt</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public EmbeddingDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbeddingDataRequest(EmbeddingDataRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Files != null) {
            this.Files = new EmbeddingData[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new EmbeddingData(source.Files[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

