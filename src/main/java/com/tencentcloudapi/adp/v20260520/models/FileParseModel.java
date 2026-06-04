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

public class FileParseModel extends AbstractModel {

    /**
    * 模型别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 模型描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 增强模式
    */
    @SerializedName("EnhancementMode")
    @Expose
    private String EnhancementMode;

    /**
    * 模型唯一ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型类型
    */
    @SerializedName("ModelProviderType")
    @Expose
    private String ModelProviderType;

    /**
    * 是否启用公式增强
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableFormulaEnhancement")
    @Expose
    private Boolean EnableFormulaEnhancement;

    /**
    * 是否启用 LLM 增强
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableLLMEnhancement")
    @Expose
    private Boolean EnableLLMEnhancement;

    /**
    * 是否输出 HTML 表格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputHtmlTable")
    @Expose
    private Boolean OutputHtmlTable;

    /**
    * 支持的文件类型列表
    */
    @SerializedName("SupportedFileList")
    @Expose
    private SupportedFileType [] SupportedFileList;

    /**
     * Get 模型别名 
     * @return Alias 模型别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 模型别名
     * @param Alias 模型别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 模型描述 
     * @return Description 模型描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模型描述
     * @param Description 模型描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 增强模式 
     * @return EnhancementMode 增强模式
     */
    public String getEnhancementMode() {
        return this.EnhancementMode;
    }

    /**
     * Set 增强模式
     * @param EnhancementMode 增强模式
     */
    public void setEnhancementMode(String EnhancementMode) {
        this.EnhancementMode = EnhancementMode;
    }

    /**
     * Get 模型唯一ID 
     * @return ModelId 模型唯一ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型唯一ID
     * @param ModelId 模型唯一ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型类型 
     * @return ModelProviderType 模型类型
     */
    public String getModelProviderType() {
        return this.ModelProviderType;
    }

    /**
     * Set 模型类型
     * @param ModelProviderType 模型类型
     */
    public void setModelProviderType(String ModelProviderType) {
        this.ModelProviderType = ModelProviderType;
    }

    /**
     * Get 是否启用公式增强
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableFormulaEnhancement 是否启用公式增强
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableFormulaEnhancement() {
        return this.EnableFormulaEnhancement;
    }

    /**
     * Set 是否启用公式增强
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableFormulaEnhancement 是否启用公式增强
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableFormulaEnhancement(Boolean EnableFormulaEnhancement) {
        this.EnableFormulaEnhancement = EnableFormulaEnhancement;
    }

    /**
     * Get 是否启用 LLM 增强
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableLLMEnhancement 是否启用 LLM 增强
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableLLMEnhancement() {
        return this.EnableLLMEnhancement;
    }

    /**
     * Set 是否启用 LLM 增强
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableLLMEnhancement 是否启用 LLM 增强
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableLLMEnhancement(Boolean EnableLLMEnhancement) {
        this.EnableLLMEnhancement = EnableLLMEnhancement;
    }

    /**
     * Get 是否输出 HTML 表格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputHtmlTable 是否输出 HTML 表格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOutputHtmlTable() {
        return this.OutputHtmlTable;
    }

    /**
     * Set 是否输出 HTML 表格
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputHtmlTable 是否输出 HTML 表格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputHtmlTable(Boolean OutputHtmlTable) {
        this.OutputHtmlTable = OutputHtmlTable;
    }

    /**
     * Get 支持的文件类型列表 
     * @return SupportedFileList 支持的文件类型列表
     */
    public SupportedFileType [] getSupportedFileList() {
        return this.SupportedFileList;
    }

    /**
     * Set 支持的文件类型列表
     * @param SupportedFileList 支持的文件类型列表
     */
    public void setSupportedFileList(SupportedFileType [] SupportedFileList) {
        this.SupportedFileList = SupportedFileList;
    }

    public FileParseModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileParseModel(FileParseModel source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnhancementMode != null) {
            this.EnhancementMode = new String(source.EnhancementMode);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelProviderType != null) {
            this.ModelProviderType = new String(source.ModelProviderType);
        }
        if (source.EnableFormulaEnhancement != null) {
            this.EnableFormulaEnhancement = new Boolean(source.EnableFormulaEnhancement);
        }
        if (source.EnableLLMEnhancement != null) {
            this.EnableLLMEnhancement = new Boolean(source.EnableLLMEnhancement);
        }
        if (source.OutputHtmlTable != null) {
            this.OutputHtmlTable = new Boolean(source.OutputHtmlTable);
        }
        if (source.SupportedFileList != null) {
            this.SupportedFileList = new SupportedFileType[source.SupportedFileList.length];
            for (int i = 0; i < source.SupportedFileList.length; i++) {
                this.SupportedFileList[i] = new SupportedFileType(source.SupportedFileList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnhancementMode", this.EnhancementMode);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelProviderType", this.ModelProviderType);
        this.setParamSimple(map, prefix + "EnableFormulaEnhancement", this.EnableFormulaEnhancement);
        this.setParamSimple(map, prefix + "EnableLLMEnhancement", this.EnableLLMEnhancement);
        this.setParamSimple(map, prefix + "OutputHtmlTable", this.OutputHtmlTable);
        this.setParamArrayObj(map, prefix + "SupportedFileList.", this.SupportedFileList);

    }
}

