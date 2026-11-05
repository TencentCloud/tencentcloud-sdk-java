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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateTextEmbeddingRequest extends AbstractModel {

    /**
    * <p>选择生成向量的模型（不同模型计费单价不同）。取值：</p><ul><li>0：text-embedding-0.6b</li><li>1：text-embedding-4b</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>输入文本列表。单次最多 7 条，单条不超过 2000 字符。</p>
    */
    @SerializedName("Inputs")
    @Expose
    private String [] Inputs;

    /**
    * <p>文本向量化类型。取值：</p><ul><li>query：查询文本，用于检索场景的查询侧</li><li>document：文档文本，用于检索场景的文档侧</li></ul><p>默认为 document</p>
    */
    @SerializedName("TextType")
    @Expose
    private String TextType;

    /**
    * <p>自定义任务指令词，用于指定向量化任务。最大 2000 字符。不传时按 TextType 使用系统默认指令词。</p>
    */
    @SerializedName("Instruction")
    @Expose
    private String Instruction;

    /**
     * Get <p>选择生成向量的模型（不同模型计费单价不同）。取值：</p><ul><li>0：text-embedding-0.6b</li><li>1：text-embedding-4b</li></ul> 
     * @return Model <p>选择生成向量的模型（不同模型计费单价不同）。取值：</p><ul><li>0：text-embedding-0.6b</li><li>1：text-embedding-4b</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>选择生成向量的模型（不同模型计费单价不同）。取值：</p><ul><li>0：text-embedding-0.6b</li><li>1：text-embedding-4b</li></ul>
     * @param Model <p>选择生成向量的模型（不同模型计费单价不同）。取值：</p><ul><li>0：text-embedding-0.6b</li><li>1：text-embedding-4b</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>输入文本列表。单次最多 7 条，单条不超过 2000 字符。</p> 
     * @return Inputs <p>输入文本列表。单次最多 7 条，单条不超过 2000 字符。</p>
     */
    public String [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set <p>输入文本列表。单次最多 7 条，单条不超过 2000 字符。</p>
     * @param Inputs <p>输入文本列表。单次最多 7 条，单条不超过 2000 字符。</p>
     */
    public void setInputs(String [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get <p>文本向量化类型。取值：</p><ul><li>query：查询文本，用于检索场景的查询侧</li><li>document：文档文本，用于检索场景的文档侧</li></ul><p>默认为 document</p> 
     * @return TextType <p>文本向量化类型。取值：</p><ul><li>query：查询文本，用于检索场景的查询侧</li><li>document：文档文本，用于检索场景的文档侧</li></ul><p>默认为 document</p>
     */
    public String getTextType() {
        return this.TextType;
    }

    /**
     * Set <p>文本向量化类型。取值：</p><ul><li>query：查询文本，用于检索场景的查询侧</li><li>document：文档文本，用于检索场景的文档侧</li></ul><p>默认为 document</p>
     * @param TextType <p>文本向量化类型。取值：</p><ul><li>query：查询文本，用于检索场景的查询侧</li><li>document：文档文本，用于检索场景的文档侧</li></ul><p>默认为 document</p>
     */
    public void setTextType(String TextType) {
        this.TextType = TextType;
    }

    /**
     * Get <p>自定义任务指令词，用于指定向量化任务。最大 2000 字符。不传时按 TextType 使用系统默认指令词。</p> 
     * @return Instruction <p>自定义任务指令词，用于指定向量化任务。最大 2000 字符。不传时按 TextType 使用系统默认指令词。</p>
     */
    public String getInstruction() {
        return this.Instruction;
    }

    /**
     * Set <p>自定义任务指令词，用于指定向量化任务。最大 2000 字符。不传时按 TextType 使用系统默认指令词。</p>
     * @param Instruction <p>自定义任务指令词，用于指定向量化任务。最大 2000 字符。不传时按 TextType 使用系统默认指令词。</p>
     */
    public void setInstruction(String Instruction) {
        this.Instruction = Instruction;
    }

    public GenerateTextEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateTextEmbeddingRequest(GenerateTextEmbeddingRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Inputs != null) {
            this.Inputs = new String[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new String(source.Inputs[i]);
            }
        }
        if (source.TextType != null) {
            this.TextType = new String(source.TextType);
        }
        if (source.Instruction != null) {
            this.Instruction = new String(source.Instruction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArraySimple(map, prefix + "Inputs.", this.Inputs);
        this.setParamSimple(map, prefix + "TextType", this.TextType);
        this.setParamSimple(map, prefix + "Instruction", this.Instruction);

    }
}

