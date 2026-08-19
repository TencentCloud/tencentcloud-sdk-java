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

public class CategoryNode extends AbstractModel {

    /**
    * <p>资产分类名称</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>展示顺序</p>
    */
    @SerializedName("DisplayOrder")
    @Expose
    private Long DisplayOrder;

    /**
    * <p>下级资产类型节点</p>
    */
    @SerializedName("AssetTypes")
    @Expose
    private AssetTypeNode [] AssetTypes;

    /**
     * Get <p>资产分类名称</p> 
     * @return Category <p>资产分类名称</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>资产分类名称</p>
     * @param Category <p>资产分类名称</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>展示顺序</p> 
     * @return DisplayOrder <p>展示顺序</p>
     */
    public Long getDisplayOrder() {
        return this.DisplayOrder;
    }

    /**
     * Set <p>展示顺序</p>
     * @param DisplayOrder <p>展示顺序</p>
     */
    public void setDisplayOrder(Long DisplayOrder) {
        this.DisplayOrder = DisplayOrder;
    }

    /**
     * Get <p>下级资产类型节点</p> 
     * @return AssetTypes <p>下级资产类型节点</p>
     */
    public AssetTypeNode [] getAssetTypes() {
        return this.AssetTypes;
    }

    /**
     * Set <p>下级资产类型节点</p>
     * @param AssetTypes <p>下级资产类型节点</p>
     */
    public void setAssetTypes(AssetTypeNode [] AssetTypes) {
        this.AssetTypes = AssetTypes;
    }

    public CategoryNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CategoryNode(CategoryNode source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.DisplayOrder != null) {
            this.DisplayOrder = new Long(source.DisplayOrder);
        }
        if (source.AssetTypes != null) {
            this.AssetTypes = new AssetTypeNode[source.AssetTypes.length];
            for (int i = 0; i < source.AssetTypes.length; i++) {
                this.AssetTypes[i] = new AssetTypeNode(source.AssetTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "DisplayOrder", this.DisplayOrder);
        this.setParamArrayObj(map, prefix + "AssetTypes.", this.AssetTypes);

    }
}

