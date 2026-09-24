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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CatalogTaleInfo extends AbstractModel {

    /**
    * <p>表名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>字段信息</p>
    */
    @SerializedName("Columns")
    @Expose
    private ColumnInfo [] Columns;

    /**
    * <p>属性值</p>
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * <p>分区</p>
    */
    @SerializedName("Partitioning")
    @Expose
    private Partitioning [] Partitioning;

    /**
    * <p>索引</p>
    */
    @SerializedName("Indexes")
    @Expose
    private IndexInfo [] Indexes;

    /**
    * <p>编辑者/审计信息</p>
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * <p>数据目录名称</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>数据库名称</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>表格式</p>
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
    * <p>表格式类型</p><p>枚举值：</p><ul><li>v2： TcIceberg v2版本</li></ul>
    */
    @SerializedName("FormatType")
    @Expose
    private String FormatType;

    /**
    * <p>表类型</p><p>枚举值：</p><ul><li>Managed： 内部表</li></ul>
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * <p>场景类型</p><p>枚举值：</p><ul><li>REALTIME： 实时类型</li></ul>
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
     * Get <p>表名称</p> 
     * @return Name <p>表名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>表名称</p>
     * @param Name <p>表名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Comment <p>描述</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>描述</p>
     * @param Comment <p>描述</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>字段信息</p> 
     * @return Columns <p>字段信息</p>
     */
    public ColumnInfo [] getColumns() {
        return this.Columns;
    }

    /**
     * Set <p>字段信息</p>
     * @param Columns <p>字段信息</p>
     */
    public void setColumns(ColumnInfo [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get <p>属性值</p> 
     * @return Properties <p>属性值</p>
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>属性值</p>
     * @param Properties <p>属性值</p>
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>分区</p> 
     * @return Partitioning <p>分区</p>
     */
    public Partitioning [] getPartitioning() {
        return this.Partitioning;
    }

    /**
     * Set <p>分区</p>
     * @param Partitioning <p>分区</p>
     */
    public void setPartitioning(Partitioning [] Partitioning) {
        this.Partitioning = Partitioning;
    }

    /**
     * Get <p>索引</p> 
     * @return Indexes <p>索引</p>
     */
    public IndexInfo [] getIndexes() {
        return this.Indexes;
    }

    /**
     * Set <p>索引</p>
     * @param Indexes <p>索引</p>
     */
    public void setIndexes(IndexInfo [] Indexes) {
        this.Indexes = Indexes;
    }

    /**
     * Get <p>编辑者/审计信息</p> 
     * @return Audit <p>编辑者/审计信息</p>
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set <p>编辑者/审计信息</p>
     * @param Audit <p>编辑者/审计信息</p>
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    /**
     * Get <p>数据目录名称</p> 
     * @return CatalogName <p>数据目录名称</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>数据目录名称</p>
     * @param CatalogName <p>数据目录名称</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>数据库名称</p> 
     * @return SchemaName <p>数据库名称</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>数据库名称</p>
     * @param SchemaName <p>数据库名称</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>表格式</p> 
     * @return TableFormat <p>表格式</p>
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set <p>表格式</p>
     * @param TableFormat <p>表格式</p>
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    /**
     * Get <p>表格式类型</p><p>枚举值：</p><ul><li>v2： TcIceberg v2版本</li></ul> 
     * @return FormatType <p>表格式类型</p><p>枚举值：</p><ul><li>v2： TcIceberg v2版本</li></ul>
     */
    public String getFormatType() {
        return this.FormatType;
    }

    /**
     * Set <p>表格式类型</p><p>枚举值：</p><ul><li>v2： TcIceberg v2版本</li></ul>
     * @param FormatType <p>表格式类型</p><p>枚举值：</p><ul><li>v2： TcIceberg v2版本</li></ul>
     */
    public void setFormatType(String FormatType) {
        this.FormatType = FormatType;
    }

    /**
     * Get <p>表类型</p><p>枚举值：</p><ul><li>Managed： 内部表</li></ul> 
     * @return TableType <p>表类型</p><p>枚举值：</p><ul><li>Managed： 内部表</li></ul>
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set <p>表类型</p><p>枚举值：</p><ul><li>Managed： 内部表</li></ul>
     * @param TableType <p>表类型</p><p>枚举值：</p><ul><li>Managed： 内部表</li></ul>
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get <p>场景类型</p><p>枚举值：</p><ul><li>REALTIME： 实时类型</li></ul> 
     * @return TableMode <p>场景类型</p><p>枚举值：</p><ul><li>REALTIME： 实时类型</li></ul>
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set <p>场景类型</p><p>枚举值：</p><ul><li>REALTIME： 实时类型</li></ul>
     * @param TableMode <p>场景类型</p><p>枚举值：</p><ul><li>REALTIME： 实时类型</li></ul>
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    public CatalogTaleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CatalogTaleInfo(CatalogTaleInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Columns != null) {
            this.Columns = new ColumnInfo[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new ColumnInfo(source.Columns[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
        if (source.Partitioning != null) {
            this.Partitioning = new Partitioning[source.Partitioning.length];
            for (int i = 0; i < source.Partitioning.length; i++) {
                this.Partitioning[i] = new Partitioning(source.Partitioning[i]);
            }
        }
        if (source.Indexes != null) {
            this.Indexes = new IndexInfo[source.Indexes.length];
            for (int i = 0; i < source.Indexes.length; i++) {
                this.Indexes[i] = new IndexInfo(source.Indexes[i]);
            }
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
        }
        if (source.FormatType != null) {
            this.FormatType = new String(source.FormatType);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.TableMode != null) {
            this.TableMode = new String(source.TableMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamArrayObj(map, prefix + "Partitioning.", this.Partitioning);
        this.setParamArrayObj(map, prefix + "Indexes.", this.Indexes);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);
        this.setParamSimple(map, prefix + "FormatType", this.FormatType);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);

    }
}

