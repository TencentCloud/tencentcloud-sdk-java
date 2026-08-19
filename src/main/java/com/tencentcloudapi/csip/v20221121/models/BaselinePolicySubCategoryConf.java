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

public class BaselinePolicySubCategoryConf extends AbstractModel {

    /**
    * <p>基线子分类 ID。</p>
    */
    @SerializedName("CategoryID")
    @Expose
    private Long CategoryID;

    /**
    * <p>是否全选该子分类下所有检测项。true 全选，false 按 ItemIDList 明细生效。</p>
    */
    @SerializedName("AllSelect")
    @Expose
    private Boolean AllSelect;

    /**
    * <p>已选的检测项 ID 列表，AllSelect=false 时按此明细生效。</p>
    */
    @SerializedName("ItemIDList")
    @Expose
    private Long [] ItemIDList;

    /**
     * Get <p>基线子分类 ID。</p> 
     * @return CategoryID <p>基线子分类 ID。</p>
     */
    public Long getCategoryID() {
        return this.CategoryID;
    }

    /**
     * Set <p>基线子分类 ID。</p>
     * @param CategoryID <p>基线子分类 ID。</p>
     */
    public void setCategoryID(Long CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * Get <p>是否全选该子分类下所有检测项。true 全选，false 按 ItemIDList 明细生效。</p> 
     * @return AllSelect <p>是否全选该子分类下所有检测项。true 全选，false 按 ItemIDList 明细生效。</p>
     */
    public Boolean getAllSelect() {
        return this.AllSelect;
    }

    /**
     * Set <p>是否全选该子分类下所有检测项。true 全选，false 按 ItemIDList 明细生效。</p>
     * @param AllSelect <p>是否全选该子分类下所有检测项。true 全选，false 按 ItemIDList 明细生效。</p>
     */
    public void setAllSelect(Boolean AllSelect) {
        this.AllSelect = AllSelect;
    }

    /**
     * Get <p>已选的检测项 ID 列表，AllSelect=false 时按此明细生效。</p> 
     * @return ItemIDList <p>已选的检测项 ID 列表，AllSelect=false 时按此明细生效。</p>
     */
    public Long [] getItemIDList() {
        return this.ItemIDList;
    }

    /**
     * Set <p>已选的检测项 ID 列表，AllSelect=false 时按此明细生效。</p>
     * @param ItemIDList <p>已选的检测项 ID 列表，AllSelect=false 时按此明细生效。</p>
     */
    public void setItemIDList(Long [] ItemIDList) {
        this.ItemIDList = ItemIDList;
    }

    public BaselinePolicySubCategoryConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicySubCategoryConf(BaselinePolicySubCategoryConf source) {
        if (source.CategoryID != null) {
            this.CategoryID = new Long(source.CategoryID);
        }
        if (source.AllSelect != null) {
            this.AllSelect = new Boolean(source.AllSelect);
        }
        if (source.ItemIDList != null) {
            this.ItemIDList = new Long[source.ItemIDList.length];
            for (int i = 0; i < source.ItemIDList.length; i++) {
                this.ItemIDList[i] = new Long(source.ItemIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamSimple(map, prefix + "AllSelect", this.AllSelect);
        this.setParamArraySimple(map, prefix + "ItemIDList.", this.ItemIDList);

    }
}

