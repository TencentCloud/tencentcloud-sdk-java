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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Model extends AbstractModel {

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型 ID。</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>模型显示名称。</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>模型描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模型概要。</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>模型类型。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p><p>枚举值：</p><ul><li>Text： 语言模型</li><li>Vision： 视觉模型</li><li>Multimodal： 多模态模型</li></ul>
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>模型品牌。</p>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * <p>模型图标。</p>
    */
    @SerializedName("ModelImage")
    @Expose
    private ModelImage ModelImage;

    /**
    * <p>模型供应商。</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>模型状态。取值：online（上线）、offline（下线）。</p><p>枚举值：</p><ul><li>online ： 上线</li><li>pre-offline： 预下线</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>计费信息列表。</p>
    */
    @SerializedName("ModelChargingInfo")
    @Expose
    private ModelChargingInfo [] ModelChargingInfo;

    /**
    * <p>模型规格。</p>
    */
    @SerializedName("ModelSpec")
    @Expose
    private ModelSpec ModelSpec;

    /**
    * <p>发布时间。</p>
    */
    @SerializedName("ReleaseAt")
    @Expose
    private String ReleaseAt;

    /**
    * <p>推荐顺序，值越小排序越靠前。</p>
    */
    @SerializedName("RecommendWeight")
    @Expose
    private Long RecommendWeight;

    /**
    * <p>模型访问信息。包含模型在各站点和地域的可用性配置。为空时表示未配置地域信息，模型不可用。</p>
    */
    @SerializedName("ModelAccessInfo")
    @Expose
    private ModelAccessInfo ModelAccessInfo;

    /**
    * <p>体验包信息。</p>
    */
    @SerializedName("FreeTrialInfo")
    @Expose
    private ModelFreeTrialInfo FreeTrialInfo;

    /**
    * <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p>
    */
    @SerializedName("OfflineAt")
    @Expose
    private String OfflineAt;

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型 ID。</p> 
     * @return ModelId <p>模型 ID。</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型 ID。</p>
     * @param ModelId <p>模型 ID。</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>模型显示名称。</p> 
     * @return DisplayName <p>模型显示名称。</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>模型显示名称。</p>
     * @param DisplayName <p>模型显示名称。</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>模型描述。</p> 
     * @return Description <p>模型描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模型描述。</p>
     * @param Description <p>模型描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模型概要。</p> 
     * @return Summary <p>模型概要。</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>模型概要。</p>
     * @param Summary <p>模型概要。</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>模型类型。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p><p>枚举值：</p><ul><li>Text： 语言模型</li><li>Vision： 视觉模型</li><li>Multimodal： 多模态模型</li></ul> 
     * @return ModelType <p>模型类型。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p><p>枚举值：</p><ul><li>Text： 语言模型</li><li>Vision： 视觉模型</li><li>Multimodal： 多模态模型</li></ul>
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p><p>枚举值：</p><ul><li>Text： 语言模型</li><li>Vision： 视觉模型</li><li>Multimodal： 多模态模型</li></ul>
     * @param ModelType <p>模型类型。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p><p>枚举值：</p><ul><li>Text： 语言模型</li><li>Vision： 视觉模型</li><li>Multimodal： 多模态模型</li></ul>
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>模型品牌。</p> 
     * @return Brand <p>模型品牌。</p>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set <p>模型品牌。</p>
     * @param Brand <p>模型品牌。</p>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get <p>模型图标。</p> 
     * @return ModelImage <p>模型图标。</p>
     */
    public ModelImage getModelImage() {
        return this.ModelImage;
    }

    /**
     * Set <p>模型图标。</p>
     * @param ModelImage <p>模型图标。</p>
     */
    public void setModelImage(ModelImage ModelImage) {
        this.ModelImage = ModelImage;
    }

    /**
     * Get <p>模型供应商。</p> 
     * @return Provider <p>模型供应商。</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>模型供应商。</p>
     * @param Provider <p>模型供应商。</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>模型状态。取值：online（上线）、offline（下线）。</p><p>枚举值：</p><ul><li>online ： 上线</li><li>pre-offline： 预下线</li></ul> 
     * @return Status <p>模型状态。取值：online（上线）、offline（下线）。</p><p>枚举值：</p><ul><li>online ： 上线</li><li>pre-offline： 预下线</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>模型状态。取值：online（上线）、offline（下线）。</p><p>枚举值：</p><ul><li>online ： 上线</li><li>pre-offline： 预下线</li></ul>
     * @param Status <p>模型状态。取值：online（上线）、offline（下线）。</p><p>枚举值：</p><ul><li>online ： 上线</li><li>pre-offline： 预下线</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>标签列表。</p> 
     * @return Tags <p>标签列表。</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表。</p>
     * @param Tags <p>标签列表。</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>计费信息列表。</p> 
     * @return ModelChargingInfo <p>计费信息列表。</p>
     */
    public ModelChargingInfo [] getModelChargingInfo() {
        return this.ModelChargingInfo;
    }

    /**
     * Set <p>计费信息列表。</p>
     * @param ModelChargingInfo <p>计费信息列表。</p>
     */
    public void setModelChargingInfo(ModelChargingInfo [] ModelChargingInfo) {
        this.ModelChargingInfo = ModelChargingInfo;
    }

    /**
     * Get <p>模型规格。</p> 
     * @return ModelSpec <p>模型规格。</p>
     */
    public ModelSpec getModelSpec() {
        return this.ModelSpec;
    }

    /**
     * Set <p>模型规格。</p>
     * @param ModelSpec <p>模型规格。</p>
     */
    public void setModelSpec(ModelSpec ModelSpec) {
        this.ModelSpec = ModelSpec;
    }

    /**
     * Get <p>发布时间。</p> 
     * @return ReleaseAt <p>发布时间。</p>
     */
    public String getReleaseAt() {
        return this.ReleaseAt;
    }

    /**
     * Set <p>发布时间。</p>
     * @param ReleaseAt <p>发布时间。</p>
     */
    public void setReleaseAt(String ReleaseAt) {
        this.ReleaseAt = ReleaseAt;
    }

    /**
     * Get <p>推荐顺序，值越小排序越靠前。</p> 
     * @return RecommendWeight <p>推荐顺序，值越小排序越靠前。</p>
     */
    public Long getRecommendWeight() {
        return this.RecommendWeight;
    }

    /**
     * Set <p>推荐顺序，值越小排序越靠前。</p>
     * @param RecommendWeight <p>推荐顺序，值越小排序越靠前。</p>
     */
    public void setRecommendWeight(Long RecommendWeight) {
        this.RecommendWeight = RecommendWeight;
    }

    /**
     * Get <p>模型访问信息。包含模型在各站点和地域的可用性配置。为空时表示未配置地域信息，模型不可用。</p> 
     * @return ModelAccessInfo <p>模型访问信息。包含模型在各站点和地域的可用性配置。为空时表示未配置地域信息，模型不可用。</p>
     */
    public ModelAccessInfo getModelAccessInfo() {
        return this.ModelAccessInfo;
    }

    /**
     * Set <p>模型访问信息。包含模型在各站点和地域的可用性配置。为空时表示未配置地域信息，模型不可用。</p>
     * @param ModelAccessInfo <p>模型访问信息。包含模型在各站点和地域的可用性配置。为空时表示未配置地域信息，模型不可用。</p>
     */
    public void setModelAccessInfo(ModelAccessInfo ModelAccessInfo) {
        this.ModelAccessInfo = ModelAccessInfo;
    }

    /**
     * Get <p>体验包信息。</p> 
     * @return FreeTrialInfo <p>体验包信息。</p>
     */
    public ModelFreeTrialInfo getFreeTrialInfo() {
        return this.FreeTrialInfo;
    }

    /**
     * Set <p>体验包信息。</p>
     * @param FreeTrialInfo <p>体验包信息。</p>
     */
    public void setFreeTrialInfo(ModelFreeTrialInfo FreeTrialInfo) {
        this.FreeTrialInfo = FreeTrialInfo;
    }

    /**
     * Get <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p> 
     * @return OfflineAt <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p>
     */
    public String getOfflineAt() {
        return this.OfflineAt;
    }

    /**
     * Set <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p>
     * @param OfflineAt <p>模型下线时间，Status=pre-offline 时，会配置模型下线时间</p>
     */
    public void setOfflineAt(String OfflineAt) {
        this.OfflineAt = OfflineAt;
    }

    public Model() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Model(Model source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.ModelImage != null) {
            this.ModelImage = new ModelImage(source.ModelImage);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.ModelChargingInfo != null) {
            this.ModelChargingInfo = new ModelChargingInfo[source.ModelChargingInfo.length];
            for (int i = 0; i < source.ModelChargingInfo.length; i++) {
                this.ModelChargingInfo[i] = new ModelChargingInfo(source.ModelChargingInfo[i]);
            }
        }
        if (source.ModelSpec != null) {
            this.ModelSpec = new ModelSpec(source.ModelSpec);
        }
        if (source.ReleaseAt != null) {
            this.ReleaseAt = new String(source.ReleaseAt);
        }
        if (source.RecommendWeight != null) {
            this.RecommendWeight = new Long(source.RecommendWeight);
        }
        if (source.ModelAccessInfo != null) {
            this.ModelAccessInfo = new ModelAccessInfo(source.ModelAccessInfo);
        }
        if (source.FreeTrialInfo != null) {
            this.FreeTrialInfo = new ModelFreeTrialInfo(source.FreeTrialInfo);
        }
        if (source.OfflineAt != null) {
            this.OfflineAt = new String(source.OfflineAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamObj(map, prefix + "ModelImage.", this.ModelImage);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "ModelChargingInfo.", this.ModelChargingInfo);
        this.setParamObj(map, prefix + "ModelSpec.", this.ModelSpec);
        this.setParamSimple(map, prefix + "ReleaseAt", this.ReleaseAt);
        this.setParamSimple(map, prefix + "RecommendWeight", this.RecommendWeight);
        this.setParamObj(map, prefix + "ModelAccessInfo.", this.ModelAccessInfo);
        this.setParamObj(map, prefix + "FreeTrialInfo.", this.FreeTrialInfo);
        this.setParamSimple(map, prefix + "OfflineAt", this.OfflineAt);

    }
}

