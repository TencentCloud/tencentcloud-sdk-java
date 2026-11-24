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

public class PromptTemplateCategoryGroup extends AbstractModel {

    /**
    * 分类列表
    */
    @SerializedName("CategoryList")
    @Expose
    private PromptTemplateCategory [] CategoryList;

    /**
    * 模块标识
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
     * Get 分类列表 
     * @return CategoryList 分类列表
     */
    public PromptTemplateCategory [] getCategoryList() {
        return this.CategoryList;
    }

    /**
     * Set 分类列表
     * @param CategoryList 分类列表
     */
    public void setCategoryList(PromptTemplateCategory [] CategoryList) {
        this.CategoryList = CategoryList;
    }

    /**
     * Get 模块标识 
     * @return Module 模块标识
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块标识
     * @param Module 模块标识
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    public PromptTemplateCategoryGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptTemplateCategoryGroup(PromptTemplateCategoryGroup source) {
        if (source.CategoryList != null) {
            this.CategoryList = new PromptTemplateCategory[source.CategoryList.length];
            for (int i = 0; i < source.CategoryList.length; i++) {
                this.CategoryList[i] = new PromptTemplateCategory(source.CategoryList[i]);
            }
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CategoryList.", this.CategoryList);
        this.setParamSimple(map, prefix + "Module", this.Module);

    }
}

