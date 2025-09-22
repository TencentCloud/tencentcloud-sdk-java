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

public class ModelInfo extends AbstractModel {

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelDesc")
    @Expose
    private String ModelDesc;

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptWordsLimit")
    @Expose
    private String PromptWordsLimit;

    /**
    * 通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopP")
    @Expose
    private ModelParameter TopP;

    /**
    * 温度控制随机性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Temperature")
    @Expose
    private ModelParameter Temperature;

    /**
    * 最多能生成的token数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTokens")
    @Expose
    private ModelParameter MaxTokens;

    /**
    * 模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 模型图标
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 是否免费
    */
    @SerializedName("IsFree")
    @Expose
    private Boolean IsFree;

    /**
    * 模型对话框可输入的上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputLenLimit")
    @Expose
    private Long InputLenLimit;

    /**
    * 支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportWorkflowStatus")
    @Expose
    private Long SupportWorkflowStatus;

    /**
    * 模型类别 generate：生成模型，thought：思考模型
    */
    @SerializedName("ModelCategory")
    @Expose
    private String ModelCategory;

    /**
    * 是否默认模型
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 角色提示词输入长度限制
    */
    @SerializedName("RoleLenLimit")
    @Expose
    private Long RoleLenLimit;

    /**
    * 是否专属并发模型
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * 模型支持智能通话效果
    */
    @SerializedName("SupportAiCallStatus")
    @Expose
    private Long SupportAiCallStatus;

    /**
    * 专属并发数
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * 模型标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelTags")
    @Expose
    private String [] ModelTags;

    /**
    * 模型超参定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelParams")
    @Expose
    private ModelParameter [] ModelParams;

    /**
    * 提供商名称
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * 提供商别名
    */
    @SerializedName("ProviderAliasName")
    @Expose
    private String ProviderAliasName;

    /**
    * 提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商
    */
    @SerializedName("ProviderType")
    @Expose
    private String ProviderType;

    /**
    * 是否关闭模型超参
    */
    @SerializedName("IsCloseModelParams")
    @Expose
    private Boolean IsCloseModelParams;

    /**
    * 是否支持深度思考
    */
    @SerializedName("IsDeepThinking")
    @Expose
    private Boolean IsDeepThinking;

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelDesc 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelDesc() {
        return this.ModelDesc;
    }

    /**
     * Set 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelDesc 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelDesc(String ModelDesc) {
        this.ModelDesc = ModelDesc;
    }

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceStatus 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceStatus 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptWordsLimit 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPromptWordsLimit() {
        return this.PromptWordsLimit;
    }

    /**
     * Set 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptWordsLimit 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptWordsLimit(String PromptWordsLimit) {
        this.PromptWordsLimit = PromptWordsLimit;
    }

    /**
     * Get 通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopP 通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelParameter getTopP() {
        return this.TopP;
    }

    /**
     * Set 通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopP 通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopP(ModelParameter TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 温度控制随机性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Temperature 温度控制随机性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelParameter getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 温度控制随机性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Temperature 温度控制随机性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemperature(ModelParameter Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 最多能生成的token数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTokens 最多能生成的token数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelParameter getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set 最多能生成的token数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTokens 最多能生成的token数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTokens(ModelParameter MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get 模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型 
     * @return Source 模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型
     * @param Source 模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 模型图标 
     * @return Icon 模型图标
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 模型图标
     * @param Icon 模型图标
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 是否免费 
     * @return IsFree 是否免费
     */
    public Boolean getIsFree() {
        return this.IsFree;
    }

    /**
     * Set 是否免费
     * @param IsFree 是否免费
     */
    public void setIsFree(Boolean IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get 模型对话框可输入的上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputLenLimit 模型对话框可输入的上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputLenLimit() {
        return this.InputLenLimit;
    }

    /**
     * Set 模型对话框可输入的上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputLenLimit 模型对话框可输入的上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputLenLimit(Long InputLenLimit) {
        this.InputLenLimit = InputLenLimit;
    }

    /**
     * Get 支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportWorkflowStatus 支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportWorkflowStatus() {
        return this.SupportWorkflowStatus;
    }

    /**
     * Set 支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportWorkflowStatus 支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportWorkflowStatus(Long SupportWorkflowStatus) {
        this.SupportWorkflowStatus = SupportWorkflowStatus;
    }

    /**
     * Get 模型类别 generate：生成模型，thought：思考模型 
     * @return ModelCategory 模型类别 generate：生成模型，thought：思考模型
     */
    public String getModelCategory() {
        return this.ModelCategory;
    }

    /**
     * Set 模型类别 generate：生成模型，thought：思考模型
     * @param ModelCategory 模型类别 generate：生成模型，thought：思考模型
     */
    public void setModelCategory(String ModelCategory) {
        this.ModelCategory = ModelCategory;
    }

    /**
     * Get 是否默认模型 
     * @return IsDefault 是否默认模型
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认模型
     * @param IsDefault 是否默认模型
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 角色提示词输入长度限制 
     * @return RoleLenLimit 角色提示词输入长度限制
     */
    public Long getRoleLenLimit() {
        return this.RoleLenLimit;
    }

    /**
     * Set 角色提示词输入长度限制
     * @param RoleLenLimit 角色提示词输入长度限制
     */
    public void setRoleLenLimit(Long RoleLenLimit) {
        this.RoleLenLimit = RoleLenLimit;
    }

    /**
     * Get 是否专属并发模型 
     * @return IsExclusive 是否专属并发模型
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set 是否专属并发模型
     * @param IsExclusive 是否专属并发模型
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get 模型支持智能通话效果 
     * @return SupportAiCallStatus 模型支持智能通话效果
     */
    public Long getSupportAiCallStatus() {
        return this.SupportAiCallStatus;
    }

    /**
     * Set 模型支持智能通话效果
     * @param SupportAiCallStatus 模型支持智能通话效果
     */
    public void setSupportAiCallStatus(Long SupportAiCallStatus) {
        this.SupportAiCallStatus = SupportAiCallStatus;
    }

    /**
     * Get 专属并发数 
     * @return Concurrency 专属并发数
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set 专属并发数
     * @param Concurrency 专属并发数
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get 模型标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelTags 模型标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getModelTags() {
        return this.ModelTags;
    }

    /**
     * Set 模型标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelTags 模型标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelTags(String [] ModelTags) {
        this.ModelTags = ModelTags;
    }

    /**
     * Get 模型超参定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelParams 模型超参定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelParameter [] getModelParams() {
        return this.ModelParams;
    }

    /**
     * Set 模型超参定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelParams 模型超参定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelParams(ModelParameter [] ModelParams) {
        this.ModelParams = ModelParams;
    }

    /**
     * Get 提供商名称 
     * @return ProviderName 提供商名称
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set 提供商名称
     * @param ProviderName 提供商名称
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get 提供商别名 
     * @return ProviderAliasName 提供商别名
     */
    public String getProviderAliasName() {
        return this.ProviderAliasName;
    }

    /**
     * Set 提供商别名
     * @param ProviderAliasName 提供商别名
     */
    public void setProviderAliasName(String ProviderAliasName) {
        this.ProviderAliasName = ProviderAliasName;
    }

    /**
     * Get 提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商 
     * @return ProviderType 提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商
     */
    public String getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set 提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商
     * @param ProviderType 提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商
     */
    public void setProviderType(String ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get 是否关闭模型超参 
     * @return IsCloseModelParams 是否关闭模型超参
     */
    public Boolean getIsCloseModelParams() {
        return this.IsCloseModelParams;
    }

    /**
     * Set 是否关闭模型超参
     * @param IsCloseModelParams 是否关闭模型超参
     */
    public void setIsCloseModelParams(Boolean IsCloseModelParams) {
        this.IsCloseModelParams = IsCloseModelParams;
    }

    /**
     * Get 是否支持深度思考 
     * @return IsDeepThinking 是否支持深度思考
     */
    public Boolean getIsDeepThinking() {
        return this.IsDeepThinking;
    }

    /**
     * Set 是否支持深度思考
     * @param IsDeepThinking 是否支持深度思考
     */
    public void setIsDeepThinking(Boolean IsDeepThinking) {
        this.IsDeepThinking = IsDeepThinking;
    }

    public ModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelInfo(ModelInfo source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelDesc != null) {
            this.ModelDesc = new String(source.ModelDesc);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.PromptWordsLimit != null) {
            this.PromptWordsLimit = new String(source.PromptWordsLimit);
        }
        if (source.TopP != null) {
            this.TopP = new ModelParameter(source.TopP);
        }
        if (source.Temperature != null) {
            this.Temperature = new ModelParameter(source.Temperature);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new ModelParameter(source.MaxTokens);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.IsFree != null) {
            this.IsFree = new Boolean(source.IsFree);
        }
        if (source.InputLenLimit != null) {
            this.InputLenLimit = new Long(source.InputLenLimit);
        }
        if (source.SupportWorkflowStatus != null) {
            this.SupportWorkflowStatus = new Long(source.SupportWorkflowStatus);
        }
        if (source.ModelCategory != null) {
            this.ModelCategory = new String(source.ModelCategory);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.RoleLenLimit != null) {
            this.RoleLenLimit = new Long(source.RoleLenLimit);
        }
        if (source.IsExclusive != null) {
            this.IsExclusive = new Boolean(source.IsExclusive);
        }
        if (source.SupportAiCallStatus != null) {
            this.SupportAiCallStatus = new Long(source.SupportAiCallStatus);
        }
        if (source.Concurrency != null) {
            this.Concurrency = new Long(source.Concurrency);
        }
        if (source.ModelTags != null) {
            this.ModelTags = new String[source.ModelTags.length];
            for (int i = 0; i < source.ModelTags.length; i++) {
                this.ModelTags[i] = new String(source.ModelTags[i]);
            }
        }
        if (source.ModelParams != null) {
            this.ModelParams = new ModelParameter[source.ModelParams.length];
            for (int i = 0; i < source.ModelParams.length; i++) {
                this.ModelParams[i] = new ModelParameter(source.ModelParams[i]);
            }
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.ProviderAliasName != null) {
            this.ProviderAliasName = new String(source.ProviderAliasName);
        }
        if (source.ProviderType != null) {
            this.ProviderType = new String(source.ProviderType);
        }
        if (source.IsCloseModelParams != null) {
            this.IsCloseModelParams = new Boolean(source.IsCloseModelParams);
        }
        if (source.IsDeepThinking != null) {
            this.IsDeepThinking = new Boolean(source.IsDeepThinking);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelDesc", this.ModelDesc);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "PromptWordsLimit", this.PromptWordsLimit);
        this.setParamObj(map, prefix + "TopP.", this.TopP);
        this.setParamObj(map, prefix + "Temperature.", this.Temperature);
        this.setParamObj(map, prefix + "MaxTokens.", this.MaxTokens);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "IsFree", this.IsFree);
        this.setParamSimple(map, prefix + "InputLenLimit", this.InputLenLimit);
        this.setParamSimple(map, prefix + "SupportWorkflowStatus", this.SupportWorkflowStatus);
        this.setParamSimple(map, prefix + "ModelCategory", this.ModelCategory);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "RoleLenLimit", this.RoleLenLimit);
        this.setParamSimple(map, prefix + "IsExclusive", this.IsExclusive);
        this.setParamSimple(map, prefix + "SupportAiCallStatus", this.SupportAiCallStatus);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamArraySimple(map, prefix + "ModelTags.", this.ModelTags);
        this.setParamArrayObj(map, prefix + "ModelParams.", this.ModelParams);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "ProviderAliasName", this.ProviderAliasName);
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "IsCloseModelParams", this.IsCloseModelParams);
        this.setParamSimple(map, prefix + "IsDeepThinking", this.IsDeepThinking);

    }
}

