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

public class AppModelConfig extends AbstractModel {

    /**
    * AI一键优化模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiOptimizeModel")
    @Expose
    private AIOptimizeModel AiOptimizeModel;

    /**
    * 实时文件解析模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileParseModel")
    @Expose
    private FileParseModel FileParseModel;

    /**
    * 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GenerateModel")
    @Expose
    private GenerateModel GenerateModel;

    /**
    * 多模态问答模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiModalQaModel")
    @Expose
    private MultiModalQAModel MultiModalQaModel;

    /**
    * 多模态理解模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiModalUnderstandingModel")
    @Expose
    private MultiModalUnderstandingModel MultiModalUnderstandingModel;

    /**
    * Prompt改写模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptRewriteModel")
    @Expose
    private PromptRewriteModel PromptRewriteModel;

    /**
    * 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThinkModel")
    @Expose
    private ThinkModel ThinkModel;

    /**
     * Get AI一键优化模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiOptimizeModel AI一键优化模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AIOptimizeModel getAiOptimizeModel() {
        return this.AiOptimizeModel;
    }

    /**
     * Set AI一键优化模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiOptimizeModel AI一键优化模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiOptimizeModel(AIOptimizeModel AiOptimizeModel) {
        this.AiOptimizeModel = AiOptimizeModel;
    }

    /**
     * Get 实时文件解析模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileParseModel 实时文件解析模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileParseModel getFileParseModel() {
        return this.FileParseModel;
    }

    /**
     * Set 实时文件解析模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileParseModel 实时文件解析模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileParseModel(FileParseModel FileParseModel) {
        this.FileParseModel = FileParseModel;
    }

    /**
     * Get 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GenerateModel 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GenerateModel getGenerateModel() {
        return this.GenerateModel;
    }

    /**
     * Set 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param GenerateModel 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGenerateModel(GenerateModel GenerateModel) {
        this.GenerateModel = GenerateModel;
    }

    /**
     * Get 多模态问答模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiModalQaModel 多模态问答模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiModalQAModel getMultiModalQaModel() {
        return this.MultiModalQaModel;
    }

    /**
     * Set 多模态问答模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiModalQaModel 多模态问答模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiModalQaModel(MultiModalQAModel MultiModalQaModel) {
        this.MultiModalQaModel = MultiModalQaModel;
    }

    /**
     * Get 多模态理解模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiModalUnderstandingModel 多模态理解模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiModalUnderstandingModel getMultiModalUnderstandingModel() {
        return this.MultiModalUnderstandingModel;
    }

    /**
     * Set 多模态理解模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiModalUnderstandingModel 多模态理解模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiModalUnderstandingModel(MultiModalUnderstandingModel MultiModalUnderstandingModel) {
        this.MultiModalUnderstandingModel = MultiModalUnderstandingModel;
    }

    /**
     * Get Prompt改写模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptRewriteModel Prompt改写模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PromptRewriteModel getPromptRewriteModel() {
        return this.PromptRewriteModel;
    }

    /**
     * Set Prompt改写模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptRewriteModel Prompt改写模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptRewriteModel(PromptRewriteModel PromptRewriteModel) {
        this.PromptRewriteModel = PromptRewriteModel;
    }

    /**
     * Get 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThinkModel 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ThinkModel getThinkModel() {
        return this.ThinkModel;
    }

    /**
     * Set 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThinkModel 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThinkModel(ThinkModel ThinkModel) {
        this.ThinkModel = ThinkModel;
    }

    public AppModelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppModelConfig(AppModelConfig source) {
        if (source.AiOptimizeModel != null) {
            this.AiOptimizeModel = new AIOptimizeModel(source.AiOptimizeModel);
        }
        if (source.FileParseModel != null) {
            this.FileParseModel = new FileParseModel(source.FileParseModel);
        }
        if (source.GenerateModel != null) {
            this.GenerateModel = new GenerateModel(source.GenerateModel);
        }
        if (source.MultiModalQaModel != null) {
            this.MultiModalQaModel = new MultiModalQAModel(source.MultiModalQaModel);
        }
        if (source.MultiModalUnderstandingModel != null) {
            this.MultiModalUnderstandingModel = new MultiModalUnderstandingModel(source.MultiModalUnderstandingModel);
        }
        if (source.PromptRewriteModel != null) {
            this.PromptRewriteModel = new PromptRewriteModel(source.PromptRewriteModel);
        }
        if (source.ThinkModel != null) {
            this.ThinkModel = new ThinkModel(source.ThinkModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AiOptimizeModel.", this.AiOptimizeModel);
        this.setParamObj(map, prefix + "FileParseModel.", this.FileParseModel);
        this.setParamObj(map, prefix + "GenerateModel.", this.GenerateModel);
        this.setParamObj(map, prefix + "MultiModalQaModel.", this.MultiModalQaModel);
        this.setParamObj(map, prefix + "MultiModalUnderstandingModel.", this.MultiModalUnderstandingModel);
        this.setParamObj(map, prefix + "PromptRewriteModel.", this.PromptRewriteModel);
        this.setParamObj(map, prefix + "ThinkModel.", this.ThinkModel);

    }
}

