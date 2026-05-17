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

public class CosIdentifyCategoryDetail extends AbstractModel {

    /**
    * <p>分类id</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * <p>分类名称</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>数据项集合</p>
    */
    @SerializedName("RuleSet")
    @Expose
    private CosIdentifyRuleDetail [] RuleSet;

    /**
     * Get <p>分类id</p> 
     * @return CategoryId <p>分类id</p>
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>分类id</p>
     * @param CategoryId <p>分类id</p>
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>分类名称</p> 
     * @return CategoryName <p>分类名称</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>分类名称</p>
     * @param CategoryName <p>分类名称</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>数据项集合</p> 
     * @return RuleSet <p>数据项集合</p>
     */
    public CosIdentifyRuleDetail [] getRuleSet() {
        return this.RuleSet;
    }

    /**
     * Set <p>数据项集合</p>
     * @param RuleSet <p>数据项集合</p>
     */
    public void setRuleSet(CosIdentifyRuleDetail [] RuleSet) {
        this.RuleSet = RuleSet;
    }

    public CosIdentifyCategoryDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosIdentifyCategoryDetail(CosIdentifyCategoryDetail source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.RuleSet != null) {
            this.RuleSet = new CosIdentifyRuleDetail[source.RuleSet.length];
            for (int i = 0; i < source.RuleSet.length; i++) {
                this.RuleSet[i] = new CosIdentifyRuleDetail(source.RuleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamArrayObj(map, prefix + "RuleSet.", this.RuleSet);

    }
}

