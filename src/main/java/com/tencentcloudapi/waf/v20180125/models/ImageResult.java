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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResult extends AbstractModel {

    /**
    * <p>命中类别标识</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>类别的名称</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
     * Get <p>命中类别标识</p> 
     * @return Category <p>命中类别标识</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>命中类别标识</p>
     * @param Category <p>命中类别标识</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>类别的名称</p> 
     * @return CategoryName <p>类别的名称</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>类别的名称</p>
     * @param CategoryName <p>类别的名称</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public ImageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageResult(ImageResult source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);

    }
}

