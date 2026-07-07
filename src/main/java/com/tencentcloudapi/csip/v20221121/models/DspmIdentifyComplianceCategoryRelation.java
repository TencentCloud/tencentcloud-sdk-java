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

public class DspmIdentifyComplianceCategoryRelation extends AbstractModel {

    /**
    * <p>分类ID</p>
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
    * <p>父分类ID</p>
    */
    @SerializedName("CategoryParentId")
    @Expose
    private String CategoryParentId;

    /**
    * <p>是否叶子节点</p>
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * <p>分类类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
    */
    @SerializedName("CategoryType")
    @Expose
    private Long CategoryType;

    /**
    * <p>分类层级</p><p>单位：层</p>
    */
    @SerializedName("CategoryGrade")
    @Expose
    private Long CategoryGrade;

    /**
    * <p>无</p>
    */
    @SerializedName("RuleRelations")
    @Expose
    private DspmIdentifyComplianceRuleRelation [] RuleRelations;

    /**
    * <p>无</p>
    */
    @SerializedName("Children")
    @Expose
    private DspmIdentifyComplianceCategoryRelation [] Children;

    /**
     * Get <p>分类ID</p> 
     * @return CategoryId <p>分类ID</p>
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>分类ID</p>
     * @param CategoryId <p>分类ID</p>
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
     * Get <p>父分类ID</p> 
     * @return CategoryParentId <p>父分类ID</p>
     */
    public String getCategoryParentId() {
        return this.CategoryParentId;
    }

    /**
     * Set <p>父分类ID</p>
     * @param CategoryParentId <p>父分类ID</p>
     */
    public void setCategoryParentId(String CategoryParentId) {
        this.CategoryParentId = CategoryParentId;
    }

    /**
     * Get <p>是否叶子节点</p> 
     * @return IsLeaf <p>是否叶子节点</p>
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set <p>是否叶子节点</p>
     * @param IsLeaf <p>是否叶子节点</p>
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get <p>分类类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul> 
     * @return CategoryType <p>分类类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public Long getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set <p>分类类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     * @param CategoryType <p>分类类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public void setCategoryType(Long CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get <p>分类层级</p><p>单位：层</p> 
     * @return CategoryGrade <p>分类层级</p><p>单位：层</p>
     */
    public Long getCategoryGrade() {
        return this.CategoryGrade;
    }

    /**
     * Set <p>分类层级</p><p>单位：层</p>
     * @param CategoryGrade <p>分类层级</p><p>单位：层</p>
     */
    public void setCategoryGrade(Long CategoryGrade) {
        this.CategoryGrade = CategoryGrade;
    }

    /**
     * Get <p>无</p> 
     * @return RuleRelations <p>无</p>
     */
    public DspmIdentifyComplianceRuleRelation [] getRuleRelations() {
        return this.RuleRelations;
    }

    /**
     * Set <p>无</p>
     * @param RuleRelations <p>无</p>
     */
    public void setRuleRelations(DspmIdentifyComplianceRuleRelation [] RuleRelations) {
        this.RuleRelations = RuleRelations;
    }

    /**
     * Get <p>无</p> 
     * @return Children <p>无</p>
     */
    public DspmIdentifyComplianceCategoryRelation [] getChildren() {
        return this.Children;
    }

    /**
     * Set <p>无</p>
     * @param Children <p>无</p>
     */
    public void setChildren(DspmIdentifyComplianceCategoryRelation [] Children) {
        this.Children = Children;
    }

    public DspmIdentifyComplianceCategoryRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyComplianceCategoryRelation(DspmIdentifyComplianceCategoryRelation source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.CategoryParentId != null) {
            this.CategoryParentId = new String(source.CategoryParentId);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new Long(source.CategoryType);
        }
        if (source.CategoryGrade != null) {
            this.CategoryGrade = new Long(source.CategoryGrade);
        }
        if (source.RuleRelations != null) {
            this.RuleRelations = new DspmIdentifyComplianceRuleRelation[source.RuleRelations.length];
            for (int i = 0; i < source.RuleRelations.length; i++) {
                this.RuleRelations[i] = new DspmIdentifyComplianceRuleRelation(source.RuleRelations[i]);
            }
        }
        if (source.Children != null) {
            this.Children = new DspmIdentifyComplianceCategoryRelation[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new DspmIdentifyComplianceCategoryRelation(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "CategoryParentId", this.CategoryParentId);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "CategoryGrade", this.CategoryGrade);
        this.setParamArrayObj(map, prefix + "RuleRelations.", this.RuleRelations);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

