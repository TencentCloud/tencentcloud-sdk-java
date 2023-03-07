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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineCategory extends AbstractModel{

    /**
    * 分类Id
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 分类名称
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 父分类ID,如果为0则没有父分类
    */
    @SerializedName("ParentCategoryId")
    @Expose
    private Long ParentCategoryId;

    /**
     * Get 分类Id 
     * @return CategoryId 分类Id
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类Id
     * @param CategoryId 分类Id
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
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
     * Get 父分类ID,如果为0则没有父分类 
     * @return ParentCategoryId 父分类ID,如果为0则没有父分类
     */
    public Long getParentCategoryId() {
        return this.ParentCategoryId;
    }

    /**
     * Set 父分类ID,如果为0则没有父分类
     * @param ParentCategoryId 父分类ID,如果为0则没有父分类
     */
    public void setParentCategoryId(Long ParentCategoryId) {
        this.ParentCategoryId = ParentCategoryId;
    }

    public BaselineCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineCategory(BaselineCategory source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.ParentCategoryId != null) {
            this.ParentCategoryId = new Long(source.ParentCategoryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "ParentCategoryId", this.ParentCategoryId);

    }
}

