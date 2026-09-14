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

public class CategoryPath extends AbstractModel {

    /**
    * <p>分类 ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>从根节点开始的路径分类 ID 列表</p>
    */
    @SerializedName("CategoryIdPath")
    @Expose
    private String [] CategoryIdPath;

    /**
    * <p>从根节点开始的路径分类名称列表</p>
    */
    @SerializedName("CategoryNamePath")
    @Expose
    private String [] CategoryNamePath;

    /**
     * Get <p>分类 ID</p> 
     * @return CategoryId <p>分类 ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>分类 ID</p>
     * @param CategoryId <p>分类 ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>从根节点开始的路径分类 ID 列表</p> 
     * @return CategoryIdPath <p>从根节点开始的路径分类 ID 列表</p>
     */
    public String [] getCategoryIdPath() {
        return this.CategoryIdPath;
    }

    /**
     * Set <p>从根节点开始的路径分类 ID 列表</p>
     * @param CategoryIdPath <p>从根节点开始的路径分类 ID 列表</p>
     */
    public void setCategoryIdPath(String [] CategoryIdPath) {
        this.CategoryIdPath = CategoryIdPath;
    }

    /**
     * Get <p>从根节点开始的路径分类名称列表</p> 
     * @return CategoryNamePath <p>从根节点开始的路径分类名称列表</p>
     */
    public String [] getCategoryNamePath() {
        return this.CategoryNamePath;
    }

    /**
     * Set <p>从根节点开始的路径分类名称列表</p>
     * @param CategoryNamePath <p>从根节点开始的路径分类名称列表</p>
     */
    public void setCategoryNamePath(String [] CategoryNamePath) {
        this.CategoryNamePath = CategoryNamePath;
    }

    public CategoryPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CategoryPath(CategoryPath source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryIdPath != null) {
            this.CategoryIdPath = new String[source.CategoryIdPath.length];
            for (int i = 0; i < source.CategoryIdPath.length; i++) {
                this.CategoryIdPath[i] = new String(source.CategoryIdPath[i]);
            }
        }
        if (source.CategoryNamePath != null) {
            this.CategoryNamePath = new String[source.CategoryNamePath.length];
            for (int i = 0; i < source.CategoryNamePath.length; i++) {
                this.CategoryNamePath[i] = new String(source.CategoryNamePath[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamArraySimple(map, prefix + "CategoryIdPath.", this.CategoryIdPath);
        this.setParamArraySimple(map, prefix + "CategoryNamePath.", this.CategoryNamePath);

    }
}

