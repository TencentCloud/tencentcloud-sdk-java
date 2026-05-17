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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Spec extends AbstractModel {

    /**
    * <p>计费项标签</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>计费项名称</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>计费项显示名称</p>
    */
    @SerializedName("SpecAlias")
    @Expose
    private String SpecAlias;

    /**
    * <p>是否售罄</p>
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * <p>当前资源售罄时，可用的区域有哪些</p>
    */
    @SerializedName("AvailableRegion")
    @Expose
    private String [] AvailableRegion;

    /**
    * <p>当前计费项支持的特性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecFeatures")
    @Expose
    private String [] SpecFeatures;

    /**
    * <p>计费项类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecType")
    @Expose
    private String SpecType;

    /**
    * <p>GPU类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>计费项CategoryId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
     * Get <p>计费项标签</p> 
     * @return SpecId <p>计费项标签</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>计费项标签</p>
     * @param SpecId <p>计费项标签</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>计费项名称</p> 
     * @return SpecName <p>计费项名称</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>计费项名称</p>
     * @param SpecName <p>计费项名称</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>计费项显示名称</p> 
     * @return SpecAlias <p>计费项显示名称</p>
     */
    public String getSpecAlias() {
        return this.SpecAlias;
    }

    /**
     * Set <p>计费项显示名称</p>
     * @param SpecAlias <p>计费项显示名称</p>
     */
    public void setSpecAlias(String SpecAlias) {
        this.SpecAlias = SpecAlias;
    }

    /**
     * Get <p>是否售罄</p> 
     * @return Available <p>是否售罄</p>
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>是否售罄</p>
     * @param Available <p>是否售罄</p>
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get <p>当前资源售罄时，可用的区域有哪些</p> 
     * @return AvailableRegion <p>当前资源售罄时，可用的区域有哪些</p>
     */
    public String [] getAvailableRegion() {
        return this.AvailableRegion;
    }

    /**
     * Set <p>当前资源售罄时，可用的区域有哪些</p>
     * @param AvailableRegion <p>当前资源售罄时，可用的区域有哪些</p>
     */
    public void setAvailableRegion(String [] AvailableRegion) {
        this.AvailableRegion = AvailableRegion;
    }

    /**
     * Get <p>当前计费项支持的特性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecFeatures <p>当前计费项支持的特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSpecFeatures() {
        return this.SpecFeatures;
    }

    /**
     * Set <p>当前计费项支持的特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecFeatures <p>当前计费项支持的特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecFeatures(String [] SpecFeatures) {
        this.SpecFeatures = SpecFeatures;
    }

    /**
     * Get <p>计费项类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecType <p>计费项类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecType() {
        return this.SpecType;
    }

    /**
     * Set <p>计费项类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecType <p>计费项类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecType(String SpecType) {
        this.SpecType = SpecType;
    }

    /**
     * Get <p>GPU类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType <p>GPU类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>GPU类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType <p>GPU类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>计费项CategoryId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryId <p>计费项CategoryId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>计费项CategoryId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryId <p>计费项CategoryId</p>
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

