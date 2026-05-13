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

public class DspmIdentifyCategoryDetail extends AbstractModel {

    /**
    * 分类id
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
    * 数据项集合
    */
    @SerializedName("RuleSet")
    @Expose
    private DspmIdentifyRuleDetail [] RuleSet;

    /**
     * Get 分类id 
     * @return CategoryId 分类id
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类id
     * @param CategoryId 分类id
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
     * Get 数据项集合 
     * @return RuleSet 数据项集合
     */
    public DspmIdentifyRuleDetail [] getRuleSet() {
        return this.RuleSet;
    }

    /**
     * Set 数据项集合
     * @param RuleSet 数据项集合
     */
    public void setRuleSet(DspmIdentifyRuleDetail [] RuleSet) {
        this.RuleSet = RuleSet;
    }

    public DspmIdentifyCategoryDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyCategoryDetail(DspmIdentifyCategoryDetail source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.RuleSet != null) {
            this.RuleSet = new DspmIdentifyRuleDetail[source.RuleSet.length];
            for (int i = 0; i < source.RuleSet.length; i++) {
                this.RuleSet[i] = new DspmIdentifyRuleDetail(source.RuleSet[i]);
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

