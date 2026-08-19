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

public class BaselinePolicySystemCategoryConf extends AbstractModel {

    /**
    * <p>系统父分类 ID。</p>
    */
    @SerializedName("CategoryID")
    @Expose
    private Long CategoryID;

    /**
    * <p>是否全选该父分类下所有子分类。true 全选，false 按 SubCategoryConfList 明细生效。</p>
    */
    @SerializedName("AllSelect")
    @Expose
    private Boolean AllSelect;

    /**
    * <p>子分类配置列表，AllSelect=false 时按此明细生效。</p>
    */
    @SerializedName("SubCategoryConfList")
    @Expose
    private BaselinePolicySubCategoryConf [] SubCategoryConfList;

    /**
     * Get <p>系统父分类 ID。</p> 
     * @return CategoryID <p>系统父分类 ID。</p>
     */
    public Long getCategoryID() {
        return this.CategoryID;
    }

    /**
     * Set <p>系统父分类 ID。</p>
     * @param CategoryID <p>系统父分类 ID。</p>
     */
    public void setCategoryID(Long CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * Get <p>是否全选该父分类下所有子分类。true 全选，false 按 SubCategoryConfList 明细生效。</p> 
     * @return AllSelect <p>是否全选该父分类下所有子分类。true 全选，false 按 SubCategoryConfList 明细生效。</p>
     */
    public Boolean getAllSelect() {
        return this.AllSelect;
    }

    /**
     * Set <p>是否全选该父分类下所有子分类。true 全选，false 按 SubCategoryConfList 明细生效。</p>
     * @param AllSelect <p>是否全选该父分类下所有子分类。true 全选，false 按 SubCategoryConfList 明细生效。</p>
     */
    public void setAllSelect(Boolean AllSelect) {
        this.AllSelect = AllSelect;
    }

    /**
     * Get <p>子分类配置列表，AllSelect=false 时按此明细生效。</p> 
     * @return SubCategoryConfList <p>子分类配置列表，AllSelect=false 时按此明细生效。</p>
     */
    public BaselinePolicySubCategoryConf [] getSubCategoryConfList() {
        return this.SubCategoryConfList;
    }

    /**
     * Set <p>子分类配置列表，AllSelect=false 时按此明细生效。</p>
     * @param SubCategoryConfList <p>子分类配置列表，AllSelect=false 时按此明细生效。</p>
     */
    public void setSubCategoryConfList(BaselinePolicySubCategoryConf [] SubCategoryConfList) {
        this.SubCategoryConfList = SubCategoryConfList;
    }

    public BaselinePolicySystemCategoryConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicySystemCategoryConf(BaselinePolicySystemCategoryConf source) {
        if (source.CategoryID != null) {
            this.CategoryID = new Long(source.CategoryID);
        }
        if (source.AllSelect != null) {
            this.AllSelect = new Boolean(source.AllSelect);
        }
        if (source.SubCategoryConfList != null) {
            this.SubCategoryConfList = new BaselinePolicySubCategoryConf[source.SubCategoryConfList.length];
            for (int i = 0; i < source.SubCategoryConfList.length; i++) {
                this.SubCategoryConfList[i] = new BaselinePolicySubCategoryConf(source.SubCategoryConfList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamSimple(map, prefix + "AllSelect", this.AllSelect);
        this.setParamArrayObj(map, prefix + "SubCategoryConfList.", this.SubCategoryConfList);

    }
}

