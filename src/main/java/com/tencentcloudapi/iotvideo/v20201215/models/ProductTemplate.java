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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductTemplate extends AbstractModel{

    /**
    * 实体ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 分类字段
    */
    @SerializedName("CategoryKey")
    @Expose
    private String CategoryKey;

    /**
    * 分类名称
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 上层实体ID
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 物模型
    */
    @SerializedName("ModelTemplate")
    @Expose
    private String ModelTemplate;

    /**
    * 排列顺序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListOrder")
    @Expose
    private Long ListOrder;

    /**
    * 分类图标地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 九宫格图片地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IconUrlGrid")
    @Expose
    private String IconUrlGrid;

    /**
     * Get 实体ID 
     * @return Id 实体ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 实体ID
     * @param Id 实体ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 分类字段 
     * @return CategoryKey 分类字段
     */
    public String getCategoryKey() {
        return this.CategoryKey;
    }

    /**
     * Set 分类字段
     * @param CategoryKey 分类字段
     */
    public void setCategoryKey(String CategoryKey) {
        this.CategoryKey = CategoryKey;
    }

    /**
     * Get 分类名称 
     * @return CategoryName 分类名称
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 分类名称
     * @param CategoryName 分类名称
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 上层实体ID 
     * @return ParentId 上层实体ID
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 上层实体ID
     * @param ParentId 上层实体ID
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 物模型 
     * @return ModelTemplate 物模型
     */
    public String getModelTemplate() {
        return this.ModelTemplate;
    }

    /**
     * Set 物模型
     * @param ModelTemplate 物模型
     */
    public void setModelTemplate(String ModelTemplate) {
        this.ModelTemplate = ModelTemplate;
    }

    /**
     * Get 排列顺序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListOrder 排列顺序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getListOrder() {
        return this.ListOrder;
    }

    /**
     * Set 排列顺序
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListOrder 排列顺序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListOrder(Long ListOrder) {
        this.ListOrder = ListOrder;
    }

    /**
     * Get 分类图标地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IconUrl 分类图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 分类图标地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IconUrl 分类图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 九宫格图片地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IconUrlGrid 九宫格图片地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIconUrlGrid() {
        return this.IconUrlGrid;
    }

    /**
     * Set 九宫格图片地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IconUrlGrid 九宫格图片地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIconUrlGrid(String IconUrlGrid) {
        this.IconUrlGrid = IconUrlGrid;
    }

    public ProductTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductTemplate(ProductTemplate source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CategoryKey != null) {
            this.CategoryKey = new String(source.CategoryKey);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.ModelTemplate != null) {
            this.ModelTemplate = new String(source.ModelTemplate);
        }
        if (source.ListOrder != null) {
            this.ListOrder = new Long(source.ListOrder);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.IconUrlGrid != null) {
            this.IconUrlGrid = new String(source.IconUrlGrid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CategoryKey", this.CategoryKey);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "ModelTemplate", this.ModelTemplate);
        this.setParamSimple(map, prefix + "ListOrder", this.ListOrder);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "IconUrlGrid", this.IconUrlGrid);

    }
}

