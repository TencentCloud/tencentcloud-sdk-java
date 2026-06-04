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

public class Model extends AbstractModel {

    /**
    * 模型徽章列表
    */
    @SerializedName("BadgeList")
    @Expose
    private ModelBadge [] BadgeList;

    /**
    * 模型限制信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitInfo")
    @Expose
    private ModelLimit LimitInfo;

    /**
    * 模型基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelBasic")
    @Expose
    private ModelBasic ModelBasic;

    /**
    * 模型超参配置
    */
    @SerializedName("ParameterList")
    @Expose
    private ModelParameter [] ParameterList;

    /**
    * 模型属性配置
    */
    @SerializedName("PropertyList")
    @Expose
    private ModelProperty [] PropertyList;

    /**
    * 模型提供商信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProviderInfo")
    @Expose
    private ModelProviderBasic ProviderInfo;

    /**
    * 模型状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusInfo")
    @Expose
    private ModelStatus StatusInfo;

    /**
    * 模型标签列表
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
     * Get 模型徽章列表 
     * @return BadgeList 模型徽章列表
     */
    public ModelBadge [] getBadgeList() {
        return this.BadgeList;
    }

    /**
     * Set 模型徽章列表
     * @param BadgeList 模型徽章列表
     */
    public void setBadgeList(ModelBadge [] BadgeList) {
        this.BadgeList = BadgeList;
    }

    /**
     * Get 模型限制信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitInfo 模型限制信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelLimit getLimitInfo() {
        return this.LimitInfo;
    }

    /**
     * Set 模型限制信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitInfo 模型限制信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitInfo(ModelLimit LimitInfo) {
        this.LimitInfo = LimitInfo;
    }

    /**
     * Get 模型基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelBasic 模型基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelBasic getModelBasic() {
        return this.ModelBasic;
    }

    /**
     * Set 模型基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelBasic 模型基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelBasic(ModelBasic ModelBasic) {
        this.ModelBasic = ModelBasic;
    }

    /**
     * Get 模型超参配置 
     * @return ParameterList 模型超参配置
     */
    public ModelParameter [] getParameterList() {
        return this.ParameterList;
    }

    /**
     * Set 模型超参配置
     * @param ParameterList 模型超参配置
     */
    public void setParameterList(ModelParameter [] ParameterList) {
        this.ParameterList = ParameterList;
    }

    /**
     * Get 模型属性配置 
     * @return PropertyList 模型属性配置
     */
    public ModelProperty [] getPropertyList() {
        return this.PropertyList;
    }

    /**
     * Set 模型属性配置
     * @param PropertyList 模型属性配置
     */
    public void setPropertyList(ModelProperty [] PropertyList) {
        this.PropertyList = PropertyList;
    }

    /**
     * Get 模型提供商信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProviderInfo 模型提供商信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelProviderBasic getProviderInfo() {
        return this.ProviderInfo;
    }

    /**
     * Set 模型提供商信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProviderInfo 模型提供商信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProviderInfo(ModelProviderBasic ProviderInfo) {
        this.ProviderInfo = ProviderInfo;
    }

    /**
     * Get 模型状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusInfo 模型状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelStatus getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set 模型状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusInfo 模型状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusInfo(ModelStatus StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get 模型标签列表 
     * @return TagList 模型标签列表
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 模型标签列表
     * @param TagList 模型标签列表
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    public Model() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Model(Model source) {
        if (source.BadgeList != null) {
            this.BadgeList = new ModelBadge[source.BadgeList.length];
            for (int i = 0; i < source.BadgeList.length; i++) {
                this.BadgeList[i] = new ModelBadge(source.BadgeList[i]);
            }
        }
        if (source.LimitInfo != null) {
            this.LimitInfo = new ModelLimit(source.LimitInfo);
        }
        if (source.ModelBasic != null) {
            this.ModelBasic = new ModelBasic(source.ModelBasic);
        }
        if (source.ParameterList != null) {
            this.ParameterList = new ModelParameter[source.ParameterList.length];
            for (int i = 0; i < source.ParameterList.length; i++) {
                this.ParameterList[i] = new ModelParameter(source.ParameterList[i]);
            }
        }
        if (source.PropertyList != null) {
            this.PropertyList = new ModelProperty[source.PropertyList.length];
            for (int i = 0; i < source.PropertyList.length; i++) {
                this.PropertyList[i] = new ModelProperty(source.PropertyList[i]);
            }
        }
        if (source.ProviderInfo != null) {
            this.ProviderInfo = new ModelProviderBasic(source.ProviderInfo);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new ModelStatus(source.StatusInfo);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BadgeList.", this.BadgeList);
        this.setParamObj(map, prefix + "LimitInfo.", this.LimitInfo);
        this.setParamObj(map, prefix + "ModelBasic.", this.ModelBasic);
        this.setParamArrayObj(map, prefix + "ParameterList.", this.ParameterList);
        this.setParamArrayObj(map, prefix + "PropertyList.", this.PropertyList);
        this.setParamObj(map, prefix + "ProviderInfo.", this.ProviderInfo);
        this.setParamObj(map, prefix + "StatusInfo.", this.StatusInfo);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);

    }
}

