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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineSystemCategory extends AbstractModel {

    /**
    * <p>该父分类下的子分类列表（每个子分类含其内置检测项 ID 列表）。</p>
    */
    @SerializedName("SubCategoryList")
    @Expose
    private BaselineSubCategory [] SubCategoryList;

    /**
    * <p>系统父分类基础信息（ID、名称、描述、CheckAssetType）。</p>
    */
    @SerializedName("Category")
    @Expose
    private BaselineCategory Category;

    /**
    * <p>检测项个数</p>
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
     * Get <p>该父分类下的子分类列表（每个子分类含其内置检测项 ID 列表）。</p> 
     * @return SubCategoryList <p>该父分类下的子分类列表（每个子分类含其内置检测项 ID 列表）。</p>
     */
    public BaselineSubCategory [] getSubCategoryList() {
        return this.SubCategoryList;
    }

    /**
     * Set <p>该父分类下的子分类列表（每个子分类含其内置检测项 ID 列表）。</p>
     * @param SubCategoryList <p>该父分类下的子分类列表（每个子分类含其内置检测项 ID 列表）。</p>
     */
    public void setSubCategoryList(BaselineSubCategory [] SubCategoryList) {
        this.SubCategoryList = SubCategoryList;
    }

    /**
     * Get <p>系统父分类基础信息（ID、名称、描述、CheckAssetType）。</p> 
     * @return Category <p>系统父分类基础信息（ID、名称、描述、CheckAssetType）。</p>
     */
    public BaselineCategory getCategory() {
        return this.Category;
    }

    /**
     * Set <p>系统父分类基础信息（ID、名称、描述、CheckAssetType）。</p>
     * @param Category <p>系统父分类基础信息（ID、名称、描述、CheckAssetType）。</p>
     */
    public void setCategory(BaselineCategory Category) {
        this.Category = Category;
    }

    /**
     * Get <p>检测项个数</p> 
     * @return ItemCount <p>检测项个数</p>
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set <p>检测项个数</p>
     * @param ItemCount <p>检测项个数</p>
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    public BaselineSystemCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineSystemCategory(BaselineSystemCategory source) {
        if (source.SubCategoryList != null) {
            this.SubCategoryList = new BaselineSubCategory[source.SubCategoryList.length];
            for (int i = 0; i < source.SubCategoryList.length; i++) {
                this.SubCategoryList[i] = new BaselineSubCategory(source.SubCategoryList[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new BaselineCategory(source.Category);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubCategoryList.", this.SubCategoryList);
        this.setParamObj(map, prefix + "Category.", this.Category);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);

    }
}

