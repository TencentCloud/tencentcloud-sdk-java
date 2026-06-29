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
    * <p>模型徽章列表</p>
    */
    @SerializedName("BadgeList")
    @Expose
    private ModelBadge [] BadgeList;

    /**
    * <p>模型限制信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitInfo")
    @Expose
    private ModelLimit LimitInfo;

    /**
    * <p>模型基本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelBasic")
    @Expose
    private ModelBasic ModelBasic;

    /**
    * <p>模型超参配置</p>
    */
    @SerializedName("ParameterList")
    @Expose
    private ModelParameter [] ParameterList;

    /**
    * <p>模型属性配置</p>
    */
    @SerializedName("PropertyList")
    @Expose
    private ModelProperty [] PropertyList;

    /**
    * <p>模型提供商信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProviderInfo")
    @Expose
    private ModelProviderBasic ProviderInfo;

    /**
    * <p>模型状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusInfo")
    @Expose
    private ModelStatus StatusInfo;

    /**
    * <p>模型标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * <p>模型作者信息</p>
    */
    @SerializedName("DeveloperInfo")
    @Expose
    private ModelDeveloperBasic DeveloperInfo;

    /**
     * Get <p>模型徽章列表</p> 
     * @return BadgeList <p>模型徽章列表</p>
     */
    public ModelBadge [] getBadgeList() {
        return this.BadgeList;
    }

    /**
     * Set <p>模型徽章列表</p>
     * @param BadgeList <p>模型徽章列表</p>
     */
    public void setBadgeList(ModelBadge [] BadgeList) {
        this.BadgeList = BadgeList;
    }

    /**
     * Get <p>模型限制信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitInfo <p>模型限制信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelLimit getLimitInfo() {
        return this.LimitInfo;
    }

    /**
     * Set <p>模型限制信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitInfo <p>模型限制信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitInfo(ModelLimit LimitInfo) {
        this.LimitInfo = LimitInfo;
    }

    /**
     * Get <p>模型基本信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelBasic <p>模型基本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelBasic getModelBasic() {
        return this.ModelBasic;
    }

    /**
     * Set <p>模型基本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelBasic <p>模型基本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelBasic(ModelBasic ModelBasic) {
        this.ModelBasic = ModelBasic;
    }

    /**
     * Get <p>模型超参配置</p> 
     * @return ParameterList <p>模型超参配置</p>
     */
    public ModelParameter [] getParameterList() {
        return this.ParameterList;
    }

    /**
     * Set <p>模型超参配置</p>
     * @param ParameterList <p>模型超参配置</p>
     */
    public void setParameterList(ModelParameter [] ParameterList) {
        this.ParameterList = ParameterList;
    }

    /**
     * Get <p>模型属性配置</p> 
     * @return PropertyList <p>模型属性配置</p>
     */
    public ModelProperty [] getPropertyList() {
        return this.PropertyList;
    }

    /**
     * Set <p>模型属性配置</p>
     * @param PropertyList <p>模型属性配置</p>
     */
    public void setPropertyList(ModelProperty [] PropertyList) {
        this.PropertyList = PropertyList;
    }

    /**
     * Get <p>模型提供商信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProviderInfo <p>模型提供商信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelProviderBasic getProviderInfo() {
        return this.ProviderInfo;
    }

    /**
     * Set <p>模型提供商信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProviderInfo <p>模型提供商信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProviderInfo(ModelProviderBasic ProviderInfo) {
        this.ProviderInfo = ProviderInfo;
    }

    /**
     * Get <p>模型状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusInfo <p>模型状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelStatus getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set <p>模型状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusInfo <p>模型状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusInfo(ModelStatus StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get <p>模型标签列表</p> 
     * @return TagList <p>模型标签列表</p>
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>模型标签列表</p>
     * @param TagList <p>模型标签列表</p>
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>模型作者信息</p> 
     * @return DeveloperInfo <p>模型作者信息</p>
     */
    public ModelDeveloperBasic getDeveloperInfo() {
        return this.DeveloperInfo;
    }

    /**
     * Set <p>模型作者信息</p>
     * @param DeveloperInfo <p>模型作者信息</p>
     */
    public void setDeveloperInfo(ModelDeveloperBasic DeveloperInfo) {
        this.DeveloperInfo = DeveloperInfo;
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
        if (source.DeveloperInfo != null) {
            this.DeveloperInfo = new ModelDeveloperBasic(source.DeveloperInfo);
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
        this.setParamObj(map, prefix + "DeveloperInfo.", this.DeveloperInfo);

    }
}

