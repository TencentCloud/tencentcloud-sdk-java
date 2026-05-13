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

public class DspmAssetDatabaseInfo extends AbstractModel {

    /**
    * 资产实例id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 总表数
    */
    @SerializedName("TableCount")
    @Expose
    private Long TableCount;

    /**
    * 敏感表数
    */
    @SerializedName("SensitiveTableCount")
    @Expose
    private Long SensitiveTableCount;

    /**
    * 数据项id集合
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * 数据项名称集合
    */
    @SerializedName("RuleNames")
    @Expose
    private String [] RuleNames;

    /**
    * 分类id集合
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * 分类名称集合
    */
    @SerializedName("CategoryNames")
    @Expose
    private String [] CategoryNames;

    /**
    * 分类详情
    */
    @SerializedName("CategoryDetails")
    @Expose
    private DspmIdentifyCategoryDetail [] CategoryDetails;

    /**
     * Get 资产实例id 
     * @return AssetId 资产实例id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产实例id
     * @param AssetId 资产实例id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 总表数 
     * @return TableCount 总表数
     */
    public Long getTableCount() {
        return this.TableCount;
    }

    /**
     * Set 总表数
     * @param TableCount 总表数
     */
    public void setTableCount(Long TableCount) {
        this.TableCount = TableCount;
    }

    /**
     * Get 敏感表数 
     * @return SensitiveTableCount 敏感表数
     */
    public Long getSensitiveTableCount() {
        return this.SensitiveTableCount;
    }

    /**
     * Set 敏感表数
     * @param SensitiveTableCount 敏感表数
     */
    public void setSensitiveTableCount(Long SensitiveTableCount) {
        this.SensitiveTableCount = SensitiveTableCount;
    }

    /**
     * Get 数据项id集合 
     * @return RuleIds 数据项id集合
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 数据项id集合
     * @param RuleIds 数据项id集合
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get 数据项名称集合 
     * @return RuleNames 数据项名称集合
     */
    public String [] getRuleNames() {
        return this.RuleNames;
    }

    /**
     * Set 数据项名称集合
     * @param RuleNames 数据项名称集合
     */
    public void setRuleNames(String [] RuleNames) {
        this.RuleNames = RuleNames;
    }

    /**
     * Get 分类id集合 
     * @return CategoryIds 分类id集合
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set 分类id集合
     * @param CategoryIds 分类id集合
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get 分类名称集合 
     * @return CategoryNames 分类名称集合
     */
    public String [] getCategoryNames() {
        return this.CategoryNames;
    }

    /**
     * Set 分类名称集合
     * @param CategoryNames 分类名称集合
     */
    public void setCategoryNames(String [] CategoryNames) {
        this.CategoryNames = CategoryNames;
    }

    /**
     * Get 分类详情 
     * @return CategoryDetails 分类详情
     */
    public DspmIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set 分类详情
     * @param CategoryDetails 分类详情
     */
    public void setCategoryDetails(DspmIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    public DspmAssetDatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetDatabaseInfo(DspmAssetDatabaseInfo source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TableCount != null) {
            this.TableCount = new Long(source.TableCount);
        }
        if (source.SensitiveTableCount != null) {
            this.SensitiveTableCount = new Long(source.SensitiveTableCount);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.RuleNames != null) {
            this.RuleNames = new String[source.RuleNames.length];
            for (int i = 0; i < source.RuleNames.length; i++) {
                this.RuleNames[i] = new String(source.RuleNames[i]);
            }
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
            }
        }
        if (source.CategoryNames != null) {
            this.CategoryNames = new String[source.CategoryNames.length];
            for (int i = 0; i < source.CategoryNames.length; i++) {
                this.CategoryNames[i] = new String(source.CategoryNames[i]);
            }
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new DspmIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new DspmIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TableCount", this.TableCount);
        this.setParamSimple(map, prefix + "SensitiveTableCount", this.SensitiveTableCount);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "RuleNames.", this.RuleNames);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamArraySimple(map, prefix + "CategoryNames.", this.CategoryNames);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);

    }
}

