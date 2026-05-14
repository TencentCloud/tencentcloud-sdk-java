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

public class DspmAssetFieldInfo extends AbstractModel {

    /**
    * <p>资产实例id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>数据库名称</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>schema名</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>表名</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>字段名</p>
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>数据项id集合</p>
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * <p>数据项名称集合</p>
    */
    @SerializedName("RuleNames")
    @Expose
    private String [] RuleNames;

    /**
    * <p>分类id集合</p>
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * <p>分类名称集合</p>
    */
    @SerializedName("CategoryNames")
    @Expose
    private String [] CategoryNames;

    /**
    * <p>分类详情</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private DspmIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>字段注释</p>
    */
    @SerializedName("FieldComment")
    @Expose
    private String FieldComment;

    /**
     * Get <p>资产实例id</p> 
     * @return AssetId <p>资产实例id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产实例id</p>
     * @param AssetId <p>资产实例id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>数据库名称</p> 
     * @return DbName <p>数据库名称</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>数据库名称</p>
     * @param DbName <p>数据库名称</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>schema名</p> 
     * @return SchemaName <p>schema名</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema名</p>
     * @param SchemaName <p>schema名</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>表名</p> 
     * @return TableName <p>表名</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名</p>
     * @param TableName <p>表名</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>字段名</p> 
     * @return FieldName <p>字段名</p>
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>字段名</p>
     * @param FieldName <p>字段名</p>
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>数据项id集合</p> 
     * @return RuleIds <p>数据项id集合</p>
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set <p>数据项id集合</p>
     * @param RuleIds <p>数据项id集合</p>
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get <p>数据项名称集合</p> 
     * @return RuleNames <p>数据项名称集合</p>
     */
    public String [] getRuleNames() {
        return this.RuleNames;
    }

    /**
     * Set <p>数据项名称集合</p>
     * @param RuleNames <p>数据项名称集合</p>
     */
    public void setRuleNames(String [] RuleNames) {
        this.RuleNames = RuleNames;
    }

    /**
     * Get <p>分类id集合</p> 
     * @return CategoryIds <p>分类id集合</p>
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set <p>分类id集合</p>
     * @param CategoryIds <p>分类id集合</p>
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get <p>分类名称集合</p> 
     * @return CategoryNames <p>分类名称集合</p>
     */
    public String [] getCategoryNames() {
        return this.CategoryNames;
    }

    /**
     * Set <p>分类名称集合</p>
     * @param CategoryNames <p>分类名称集合</p>
     */
    public void setCategoryNames(String [] CategoryNames) {
        this.CategoryNames = CategoryNames;
    }

    /**
     * Get <p>分类详情</p> 
     * @return CategoryDetails <p>分类详情</p>
     */
    public DspmIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>分类详情</p>
     * @param CategoryDetails <p>分类详情</p>
     */
    public void setCategoryDetails(DspmIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>字段注释</p> 
     * @return FieldComment <p>字段注释</p>
     */
    public String getFieldComment() {
        return this.FieldComment;
    }

    /**
     * Set <p>字段注释</p>
     * @param FieldComment <p>字段注释</p>
     */
    public void setFieldComment(String FieldComment) {
        this.FieldComment = FieldComment;
    }

    public DspmAssetFieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetFieldInfo(DspmAssetFieldInfo source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
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
        if (source.FieldComment != null) {
            this.FieldComment = new String(source.FieldComment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "RuleNames.", this.RuleNames);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamArraySimple(map, prefix + "CategoryNames.", this.CategoryNames);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamSimple(map, prefix + "FieldComment", this.FieldComment);

    }
}

