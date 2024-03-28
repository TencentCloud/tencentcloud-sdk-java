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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineItemsCategory extends AbstractModel {

    /**
    * 基线检测项父分类id
    */
    @SerializedName("ParentCategoryId")
    @Expose
    private Long ParentCategoryId;

    /**
    * 基线检测项父分类名称
    */
    @SerializedName("ParentCategoryName")
    @Expose
    private String ParentCategoryName;

    /**
    * 基线检测项子分类数目
    */
    @SerializedName("CategoryCount")
    @Expose
    private Long CategoryCount;

    /**
    * 基线检测项子分类列表
    */
    @SerializedName("CategoryLists")
    @Expose
    private BaselineCategory [] CategoryLists;

    /**
     * Get 基线检测项父分类id 
     * @return ParentCategoryId 基线检测项父分类id
     */
    public Long getParentCategoryId() {
        return this.ParentCategoryId;
    }

    /**
     * Set 基线检测项父分类id
     * @param ParentCategoryId 基线检测项父分类id
     */
    public void setParentCategoryId(Long ParentCategoryId) {
        this.ParentCategoryId = ParentCategoryId;
    }

    /**
     * Get 基线检测项父分类名称 
     * @return ParentCategoryName 基线检测项父分类名称
     */
    public String getParentCategoryName() {
        return this.ParentCategoryName;
    }

    /**
     * Set 基线检测项父分类名称
     * @param ParentCategoryName 基线检测项父分类名称
     */
    public void setParentCategoryName(String ParentCategoryName) {
        this.ParentCategoryName = ParentCategoryName;
    }

    /**
     * Get 基线检测项子分类数目 
     * @return CategoryCount 基线检测项子分类数目
     */
    public Long getCategoryCount() {
        return this.CategoryCount;
    }

    /**
     * Set 基线检测项子分类数目
     * @param CategoryCount 基线检测项子分类数目
     */
    public void setCategoryCount(Long CategoryCount) {
        this.CategoryCount = CategoryCount;
    }

    /**
     * Get 基线检测项子分类列表 
     * @return CategoryLists 基线检测项子分类列表
     */
    public BaselineCategory [] getCategoryLists() {
        return this.CategoryLists;
    }

    /**
     * Set 基线检测项子分类列表
     * @param CategoryLists 基线检测项子分类列表
     */
    public void setCategoryLists(BaselineCategory [] CategoryLists) {
        this.CategoryLists = CategoryLists;
    }

    public BaselineItemsCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItemsCategory(BaselineItemsCategory source) {
        if (source.ParentCategoryId != null) {
            this.ParentCategoryId = new Long(source.ParentCategoryId);
        }
        if (source.ParentCategoryName != null) {
            this.ParentCategoryName = new String(source.ParentCategoryName);
        }
        if (source.CategoryCount != null) {
            this.CategoryCount = new Long(source.CategoryCount);
        }
        if (source.CategoryLists != null) {
            this.CategoryLists = new BaselineCategory[source.CategoryLists.length];
            for (int i = 0; i < source.CategoryLists.length; i++) {
                this.CategoryLists[i] = new BaselineCategory(source.CategoryLists[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentCategoryId", this.ParentCategoryId);
        this.setParamSimple(map, prefix + "ParentCategoryName", this.ParentCategoryName);
        this.setParamSimple(map, prefix + "CategoryCount", this.CategoryCount);
        this.setParamArrayObj(map, prefix + "CategoryLists.", this.CategoryLists);

    }
}

