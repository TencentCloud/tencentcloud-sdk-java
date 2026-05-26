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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEmbeddingRequest extends AbstractModel {

    /**
    * <p>说明：选择生成向量的模型</p><p>枚举值：</p><ul><li>lke-text-embedding-v1： 文本embedding v1</li><li>lke-text-embedding-v2： 文本embedding v2</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>说明：需要 embedding 的文本<br>备注：单条query最多2000个字符，总条数最多7条</p>
    */
    @SerializedName("Inputs")
    @Expose
    private String [] Inputs;

    /**
    * <p>说明：文本向量化的类型，为使得检索任务有更好的检索效果，建议区分查询文本（query）和文档文本（document）类型, 聚类、分类等对称任务可以不用特殊指定，采用系统默认值document即可。</p>
    */
    @SerializedName("TextType")
    @Expose
    private String TextType;

    /**
    * <p>说明：自定义任务指令词，当且仅当TextType=query且Model为lke-text-embedding-v1时，生效</p>
    */
    @SerializedName("Instruction")
    @Expose
    private String Instruction;

    /**
     * Get <p>说明：选择生成向量的模型</p><p>枚举值：</p><ul><li>lke-text-embedding-v1： 文本embedding v1</li><li>lke-text-embedding-v2： 文本embedding v2</li></ul> 
     * @return Model <p>说明：选择生成向量的模型</p><p>枚举值：</p><ul><li>lke-text-embedding-v1： 文本embedding v1</li><li>lke-text-embedding-v2： 文本embedding v2</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>说明：选择生成向量的模型</p><p>枚举值：</p><ul><li>lke-text-embedding-v1： 文本embedding v1</li><li>lke-text-embedding-v2： 文本embedding v2</li></ul>
     * @param Model <p>说明：选择生成向量的模型</p><p>枚举值：</p><ul><li>lke-text-embedding-v1： 文本embedding v1</li><li>lke-text-embedding-v2： 文本embedding v2</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>说明：需要 embedding 的文本<br>备注：单条query最多2000个字符，总条数最多7条</p> 
     * @return Inputs <p>说明：需要 embedding 的文本<br>备注：单条query最多2000个字符，总条数最多7条</p>
     */
    public String [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set <p>说明：需要 embedding 的文本<br>备注：单条query最多2000个字符，总条数最多7条</p>
     * @param Inputs <p>说明：需要 embedding 的文本<br>备注：单条query最多2000个字符，总条数最多7条</p>
     */
    public void setInputs(String [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get <p>说明：文本向量化的类型，为使得检索任务有更好的检索效果，建议区分查询文本（query）和文档文本（document）类型, 聚类、分类等对称任务可以不用特殊指定，采用系统默认值document即可。</p> 
     * @return TextType <p>说明：文本向量化的类型，为使得检索任务有更好的检索效果，建议区分查询文本（query）和文档文本（document）类型, 聚类、分类等对称任务可以不用特殊指定，采用系统默认值document即可。</p>
     */
    public String getTextType() {
        return this.TextType;
    }

    /**
     * Set <p>说明：文本向量化的类型，为使得检索任务有更好的检索效果，建议区分查询文本（query）和文档文本（document）类型, 聚类、分类等对称任务可以不用特殊指定，采用系统默认值document即可。</p>
     * @param TextType <p>说明：文本向量化的类型，为使得检索任务有更好的检索效果，建议区分查询文本（query）和文档文本（document）类型, 聚类、分类等对称任务可以不用特殊指定，采用系统默认值document即可。</p>
     */
    public void setTextType(String TextType) {
        this.TextType = TextType;
    }

    /**
     * Get <p>说明：自定义任务指令词，当且仅当TextType=query且Model为lke-text-embedding-v1时，生效</p> 
     * @return Instruction <p>说明：自定义任务指令词，当且仅当TextType=query且Model为lke-text-embedding-v1时，生效</p>
     */
    public String getInstruction() {
        return this.Instruction;
    }

    /**
     * Set <p>说明：自定义任务指令词，当且仅当TextType=query且Model为lke-text-embedding-v1时，生效</p>
     * @param Instruction <p>说明：自定义任务指令词，当且仅当TextType=query且Model为lke-text-embedding-v1时，生效</p>
     */
    public void setInstruction(String Instruction) {
        this.Instruction = Instruction;
    }

    public GetEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmbeddingRequest(GetEmbeddingRequest source) {
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

