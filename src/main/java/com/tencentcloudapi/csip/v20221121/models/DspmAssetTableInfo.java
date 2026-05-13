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

public class DspmAssetTableInfo extends AbstractModel {

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
    * schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 字段数
    */
    @SerializedName("FieldCount")
    @Expose
    private Long FieldCount;

    /**
    * 敏感字段数
    */
    @SerializedName("SensitiveFieldCount")
    @Expose
    private Long SensitiveFieldCount;

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
     * Get schema名称 
     * @return SchemaName schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称
     * @param SchemaName schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 表名 
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 字段数 
     * @return FieldCount 字段数
     */
    public Long getFieldCount() {
        return this.FieldCount;
    }

    /**
     * Set 字段数
     * @param FieldCount 字段数
     */
    public void setFieldCount(Long FieldCount) {
        this.FieldCount = FieldCount;
    }

    /**
     * Get 敏感字段数 
     * @return SensitiveFieldCount 敏感字段数
     */
    public Long getSensitiveFieldCount() {
        return this.SensitiveFieldCount;
    }

    /**
     * Set 敏感字段数
     * @param SensitiveFieldCount 敏感字段数
     */
    public void setSensitiveFieldCount(Long SensitiveFieldCount) {
        this.SensitiveFieldCount = SensitiveFieldCount;
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

    public DspmAssetTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetTableInfo(DspmAssetTableInfo source) {
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
        if (source.FieldCount != null) {
            this.FieldCount = new Long(source.FieldCount);
        }
        if (source.SensitiveFieldCount != null) {
            this.SensitiveFieldCount = new Long(source.SensitiveFieldCount);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldCount", this.FieldCount);
        this.setParamSimple(map, prefix + "SensitiveFieldCount", this.SensitiveFieldCount);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "RuleNames.", this.RuleNames);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamArraySimple(map, prefix + "CategoryNames.", this.CategoryNames);

    }
}

