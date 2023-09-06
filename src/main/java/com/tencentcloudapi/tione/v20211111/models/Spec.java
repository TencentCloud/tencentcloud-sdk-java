/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Spec extends AbstractModel{

    /**
    * 计费项标签
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * 计费项名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 计费项显示名称
    */
    @SerializedName("SpecAlias")
    @Expose
    private String SpecAlias;

    /**
    * 是否售罄
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 当前资源售罄时，可用的区域有哪些
    */
    @SerializedName("AvailableRegion")
    @Expose
    private String [] AvailableRegion;

    /**
    * 当前计费项支持的特性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecFeatures")
    @Expose
    private String [] SpecFeatures;

    /**
    * 计费项类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecType")
    @Expose
    private String SpecType;

    /**
    * GPU类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * 计费项CategoryId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
     * Get 计费项标签 
     * @return SpecId 计费项标签
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 计费项标签
     * @param SpecId 计费项标签
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 计费项名称 
     * @return SpecName 计费项名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 计费项名称
     * @param SpecName 计费项名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 计费项显示名称 
     * @return SpecAlias 计费项显示名称
     */
    public String getSpecAlias() {
        return this.SpecAlias;
    }

    /**
     * Set 计费项显示名称
     * @param SpecAlias 计费项显示名称
     */
    public void setSpecAlias(String SpecAlias) {
        this.SpecAlias = SpecAlias;
    }

    /**
     * Get 是否售罄 
     * @return Available 是否售罄
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set 是否售罄
     * @param Available 是否售罄
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get 当前资源售罄时，可用的区域有哪些 
     * @return AvailableRegion 当前资源售罄时，可用的区域有哪些
     */
    public String [] getAvailableRegion() {
        return this.AvailableRegion;
    }

    /**
     * Set 当前资源售罄时，可用的区域有哪些
     * @param AvailableRegion 当前资源售罄时，可用的区域有哪些
     */
    public void setAvailableRegion(String [] AvailableRegion) {
        this.AvailableRegion = AvailableRegion;
    }

    /**
     * Get 当前计费项支持的特性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecFeatures 当前计费项支持的特性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSpecFeatures() {
        return this.SpecFeatures;
    }

    /**
     * Set 当前计费项支持的特性
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecFeatures 当前计费项支持的特性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecFeatures(String [] SpecFeatures) {
        this.SpecFeatures = SpecFeatures;
    }

    /**
     * Get 计费项类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecType 计费项类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecType() {
        return this.SpecType;
    }

    /**
     * Set 计费项类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecType 计费项类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecType(String SpecType) {
        this.SpecType = SpecType;
    }

    /**
     * Get GPU类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get 计费项CategoryId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryId 计费项CategoryId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 计费项CategoryId
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryId 计费项CategoryId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    public Spec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Spec(Spec source) {
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.SpecAlias != null) {
            this.SpecAlias = new String(source.SpecAlias);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.AvailableRegion != null) {
            this.AvailableRegion = new String[source.AvailableRegion.length];
            for (int i = 0; i < source.AvailableRegion.length; i++) {
                this.AvailableRegion[i] = new String(source.AvailableRegion[i]);
            }
        }
        if (source.SpecFeatures != null) {
            this.SpecFeatures = new String[source.SpecFeatures.length];
            for (int i = 0; i < source.SpecFeatures.length; i++) {
                this.SpecFeatures[i] = new String(source.SpecFeatures[i]);
            }
        }
        if (source.SpecType != null) {
            this.SpecType = new String(source.SpecType);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "SpecAlias", this.SpecAlias);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamArraySimple(map, prefix + "AvailableRegion.", this.AvailableRegion);
        this.setParamArraySimple(map, prefix + "SpecFeatures.", this.SpecFeatures);
        this.setParamSimple(map, prefix + "SpecType", this.SpecType);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);

    }
}

