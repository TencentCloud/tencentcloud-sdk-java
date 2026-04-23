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
    * <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelDesc")
    @Expose
    private String ModelDesc;

    /**
    * <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * <p>资源状态 1：资源可用；2：资源已用尽</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * <p>提示词内容字符限制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptWordsLimit")
    @Expose
    private String PromptWordsLimit;

    /**
    * <p>通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopP")
    @Expose
    private ModelParameter TopP;

    /**
    * <p>温度控制随机性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Temperature")
    @Expose
    private ModelParameter Temperature;

    /**
    * <p>最多能生成的token数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTokens")
    @Expose
    private ModelParameter MaxTokens;

    /**
    * <p>模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>模型图标</p>
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * <p>是否免费</p>
    */
    @SerializedName("IsFree")
    @Expose
    private Boolean IsFree;

    /**
    * <p>模型对话框可输入的上限</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputLenLimit")
    @Expose
    private Long InputLenLimit;

    /**
    * <p>支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportWorkflowStatus")
    @Expose
    private Long SupportWorkflowStatus;

    /**
    * <p>模型类别 generate：生成模型，thought：思考模型</p>
    */
    @SerializedName("ModelCategory")
    @Expose
    private String ModelCategory;

    /**
    * <p>是否默认模型</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>角色提示词输入长度限制</p>
    */
    @SerializedName("RoleLenLimit")
    @Expose
    private Long RoleLenLimit;

    /**
    * <p>是否专属并发模型</p>
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * <p>模型支持智能通话效果</p><p>枚举值：</p><ul><li>0： 模型不支持</li><li>1： 模型支持ai通话</li><li>2： 模型ai通话支持效果不佳</li></ul>
    */
    @SerializedName("SupportAiCallStatus")
    @Expose
    private Long SupportAiCallStatus;

    /**
    * <p>专属并发数</p>
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelTags")
    @Expose
    private String [] ModelTags;

    /**
    * <p>模型超参定义</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelParams")
    @Expose
    private ModelParameter [] ModelParams;

    /**
    * <p>提供商名称</p>
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * <p>提供商别名</p>
    */
    @SerializedName("ProviderAliasName")
    @Expose
    private String ProviderAliasName;

    /**
    * <p>提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商</p>
    */
    @SerializedName("ProviderType")
    @Expose
    private String ProviderType;

    /**
    * <p>是否关闭模型超参</p>
    */
    @SerializedName("IsCloseModelParams")
    @Expose
    private Boolean IsCloseModelParams;

    /**
    * <p>是否支持深度思考</p>
    */
    @SerializedName("IsDeepThinking")
    @Expose
    private Boolean IsDeepThinking;

    /**
     * Get <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelDesc <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelDesc() {
        return this.ModelDesc;
    }

    /**
     * Set <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelDesc <p>模型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelDesc(String ModelDesc) {
        this.ModelDesc = ModelDesc;
    }

    /**
     * Get <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get <p>资源状态 1：资源可用；2：资源已用尽</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceStatus <p>资源状态 1：资源可用；2：资源已用尽</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set <p>资源状态 1：资源可用；2：资源已用尽</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceStatus <p>资源状态 1：资源可用；2：资源已用尽</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get <p>提示词内容字符限制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptWordsLimit <p>提示词内容字符限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPromptWordsLimit() {
        return this.PromptWordsLimit;
    }

    /**
     * Set <p>提示词内容字符限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptWordsLimit <p>提示词内容字符限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptWordsLimit(String PromptWordsLimit) {
        this.PromptWordsLimit = PromptWordsLimit;
    }

    /**
     * Get <p>通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopP <p>通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelParameter getTopP() {
        return this.TopP;
    }

    /**
     * Set <p>通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopP <p>通过核心采样控制内容生成的多样性，较高的Top P值会导致生成更多样的内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopP(ModelParameter TopP) {
        this.TopP = TopP;
    }

    /**
     * Get <p>温度控制随机性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Temperature <p>温度控制随机性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelParameter getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>温度控制随机性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Temperature <p>温度控制随机性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemperature(ModelParameter Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>最多能生成的token数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTokens <p>最多能生成的token数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelParameter getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set <p>最多能生成的token数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTokens <p>最多能生成的token数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTokens(ModelParameter MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get <p>模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型</p> 
     * @return Source <p>模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型</p>
     * @param Source <p>模型来源 Hunyuan：腾讯混元大模型,Industry：腾讯云行业大模型,Experience：新模型体验,Custom自定义模型</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>模型图标</p> 
     * @return Icon <p>模型图标</p>
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set <p>模型图标</p>
     * @param Icon <p>模型图标</p>
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get <p>是否免费</p> 
     * @return IsFree <p>是否免费</p>
     */
    public Boolean getIsFree() {
        return this.IsFree;
    }

    /**
     * Set <p>是否免费</p>
     * @param IsFree <p>是否免费</p>
     */
    public void setIsFree(Boolean IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get <p>模型对话框可输入的上限</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputLenLimit <p>模型对话框可输入的上限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputLenLimit() {
        return this.InputLenLimit;
    }

    /**
     * Set <p>模型对话框可输入的上限</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputLenLimit <p>模型对话框可输入的上限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputLenLimit(Long InputLenLimit) {
        this.InputLenLimit = InputLenLimit;
    }

    /**
     * Get <p>支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportWorkflowStatus <p>支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportWorkflowStatus() {
        return this.SupportWorkflowStatus;
    }

    /**
     * Set <p>支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportWorkflowStatus <p>支持工作流的类型 0:模型不支持; 1: 模型支持工作流； 2： 模型支持效果不佳；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportWorkflowStatus(Long SupportWorkflowStatus) {
        this.SupportWorkflowStatus = SupportWorkflowStatus;
    }

    /**
     * Get <p>模型类别 generate：生成模型，thought：思考模型</p> 
     * @return ModelCategory <p>模型类别 generate：生成模型，thought：思考模型</p>
     */
    public String getModelCategory() {
        return this.ModelCategory;
    }

    /**
     * Set <p>模型类别 generate：生成模型，thought：思考模型</p>
     * @param ModelCategory <p>模型类别 generate：生成模型，thought：思考模型</p>
     */
    public void setModelCategory(String ModelCategory) {
        this.ModelCategory = ModelCategory;
    }

    /**
     * Get <p>是否默认模型</p> 
     * @return IsDefault <p>是否默认模型</p>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否默认模型</p>
     * @param IsDefault <p>是否默认模型</p>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>角色提示词输入长度限制</p> 
     * @return RoleLenLimit <p>角色提示词输入长度限制</p>
     */
    public Long getRoleLenLimit() {
        return this.RoleLenLimit;
    }

    /**
     * Set <p>角色提示词输入长度限制</p>
     * @param RoleLenLimit <p>角色提示词输入长度限制</p>
     */
    public void setRoleLenLimit(Long RoleLenLimit) {
        this.RoleLenLimit = RoleLenLimit;
    }

    /**
     * Get <p>是否专属并发模型</p> 
     * @return IsExclusive <p>是否专属并发模型</p>
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set <p>是否专属并发模型</p>
     * @param IsExclusive <p>是否专属并发模型</p>
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get <p>模型支持智能通话效果</p><p>枚举值：</p><ul><li>0： 模型不支持</li><li>1： 模型支持ai通话</li><li>2： 模型ai通话支持效果不佳</li></ul> 
     * @return SupportAiCallStatus <p>模型支持智能通话效果</p><p>枚举值：</p><ul><li>0： 模型不支持</li><li>1： 模型支持ai通话</li><li>2： 模型ai通话支持效果不佳</li></ul>
     */
    public Long getSupportAiCallStatus() {
        return this.SupportAiCallStatus;
    }

    /**
     * Set <p>模型支持智能通话效果</p><p>枚举值：</p><ul><li>0： 模型不支持</li><li>1： 模型支持ai通话</li><li>2： 模型ai通话支持效果不佳</li></ul>
     * @param SupportAiCallStatus <p>模型支持智能通话效果</p><p>枚举值：</p><ul><li>0： 模型不支持</li><li>1： 模型支持ai通话</li><li>2： 模型ai通话支持效果不佳</li></ul>
     */
    public void setSupportAiCallStatus(Long SupportAiCallStatus) {
        this.SupportAiCallStatus = SupportAiCallStatus;
    }

    /**
     * Get <p>专属并发数</p> 
     * @return Concurrency <p>专属并发数</p>
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set <p>专属并发数</p>
     * @param Concurrency <p>专属并发数</p>
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelTags <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getModelTags() {
        return this.ModelTags;
    }

    /**
     * Set <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelTags <p>模型标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelTags(String [] ModelTags) {
        this.ModelTags = ModelTags;
    }

    /**
     * Get <p>模型超参定义</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelParams <p>模型超参定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelParameter [] getModelParams() {
        return this.ModelParams;
    }

    /**
     * Set <p>模型超参定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelParams <p>模型超参定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelParams(ModelParameter [] ModelParams) {
        this.ModelParams = ModelParams;
    }

    /**
     * Get <p>提供商名称</p> 
     * @return ProviderName <p>提供商名称</p>
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set <p>提供商名称</p>
     * @param ProviderName <p>提供商名称</p>
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get <p>提供商别名</p> 
     * @return ProviderAliasName <p>提供商别名</p>
     */
    public String getProviderAliasName() {
        return this.ProviderAliasName;
    }

    /**
     * Set <p>提供商别名</p>
     * @param ProviderAliasName <p>提供商别名</p>
     */
    public void setProviderAliasName(String ProviderAliasName) {
        this.ProviderAliasName = ProviderAliasName;
    }

    /**
     * Get <p>提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商</p> 
     * @return ProviderType <p>提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商</p>
     */
    public String getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set <p>提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商</p>
     * @param ProviderType <p>提供商类型 Self:提供商，Custom：自定义模型提供商，Third：第三方模型提供商</p>
     */
    public void setProviderType(String ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get <p>是否关闭模型超参</p> 
     * @return IsCloseModelParams <p>是否关闭模型超参</p>
     */
    public Boolean getIsCloseModelParams() {
        return this.IsCloseModelParams;
    }

    /**
     * Set <p>是否关闭模型超参</p>
     * @param IsCloseModelParams <p>是否关闭模型超参</p>
     */
    public void setIsCloseModelParams(Boolean IsCloseModelParams) {
        this.IsCloseModelParams = IsCloseModelParams;
    }

    /**
     * Get <p>是否支持深度思考</p> 
     * @return IsDeepThinking <p>是否支持深度思考</p>
     */
    public Boolean getIsDeepThinking() {
        return this.IsDeepThinking;
    }

    /**
     * Set <p>是否支持深度思考</p>
     * @param IsDeepThinking <p>是否支持深度思考</p>
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

