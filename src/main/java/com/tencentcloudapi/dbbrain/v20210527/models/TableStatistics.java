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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableStatistics extends AbstractModel {

    /**
    * <p>表名。</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>Schema 名。</p>
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * <p>库名（catalog）。</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>存储引擎。</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>数据空间。</p><p>单位：MB</p>
    */
    @SerializedName("DataLength")
    @Expose
    private Float DataLength;

    /**
    * <p>索引空间。</p><p>单位：MB</p>
    */
    @SerializedName("IndexLength")
    @Expose
    private Float IndexLength;

    /**
    * <p>总分配空间。</p><p>单位：MB</p>
    */
    @SerializedName("TotalLength")
    @Expose
    private Float TotalLength;

    /**
    * <p>已用空间。</p><p>单位：MB</p>
    */
    @SerializedName("UsedLength")
    @Expose
    private Float UsedLength;

    /**
    * <p>碎片空间。</p><p>单位：MB</p>
    */
    @SerializedName("DataFree")
    @Expose
    private Float DataFree;

    /**
    * <p>行数。</p>
    */
    @SerializedName("TableRows")
    @Expose
    private Long TableRows;

    /**
    * <p>碎片率（%）。</p>
    */
    @SerializedName("FragRatio")
    @Expose
    private Float FragRatio;

    /**
    * <p>物理文件大小。</p><p>单位：MB</p>
    */
    @SerializedName("PhysicalFileSize")
    @Expose
    private Float PhysicalFileSize;

    /**
     * Get <p>表名。</p> 
     * @return TableName <p>表名。</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名。</p>
     * @param TableName <p>表名。</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>Schema 名。</p> 
     * @return TableSchema <p>Schema 名。</p>
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set <p>Schema 名。</p>
     * @param TableSchema <p>Schema 名。</p>
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get <p>库名（catalog）。</p> 
     * @return DatabaseName <p>库名（catalog）。</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>库名（catalog）。</p>
     * @param DatabaseName <p>库名（catalog）。</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>存储引擎。</p> 
     * @return Engine <p>存储引擎。</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>存储引擎。</p>
     * @param Engine <p>存储引擎。</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>数据空间。</p><p>单位：MB</p> 
     * @return DataLength <p>数据空间。</p><p>单位：MB</p>
     */
    public Float getDataLength() {
        return this.DataLength;
    }

    /**
     * Set <p>数据空间。</p><p>单位：MB</p>
     * @param DataLength <p>数据空间。</p><p>单位：MB</p>
     */
    public void setDataLength(Float DataLength) {
        this.DataLength = DataLength;
    }

    /**
     * Get <p>索引空间。</p><p>单位：MB</p> 
     * @return IndexLength <p>索引空间。</p><p>单位：MB</p>
     */
    public Float getIndexLength() {
        return this.IndexLength;
    }

    /**
     * Set <p>索引空间。</p><p>单位：MB</p>
     * @param IndexLength <p>索引空间。</p><p>单位：MB</p>
     */
    public void setIndexLength(Float IndexLength) {
        this.IndexLength = IndexLength;
    }

    /**
     * Get <p>总分配空间。</p><p>单位：MB</p> 
     * @return TotalLength <p>总分配空间。</p><p>单位：MB</p>
     */
    public Float getTotalLength() {
        return this.TotalLength;
    }

    /**
     * Set <p>总分配空间。</p><p>单位：MB</p>
     * @param TotalLength <p>总分配空间。</p><p>单位：MB</p>
     */
    public void setTotalLength(Float TotalLength) {
        this.TotalLength = TotalLength;
    }

    /**
     * Get <p>已用空间。</p><p>单位：MB</p> 
     * @return UsedLength <p>已用空间。</p><p>单位：MB</p>
     */
    public Float getUsedLength() {
        return this.UsedLength;
    }

    /**
     * Set <p>已用空间。</p><p>单位：MB</p>
     * @param UsedLength <p>已用空间。</p><p>单位：MB</p>
     */
    public void setUsedLength(Float UsedLength) {
        this.UsedLength = UsedLength;
    }

    /**
     * Get <p>碎片空间。</p><p>单位：MB</p> 
     * @return DataFree <p>碎片空间。</p><p>单位：MB</p>
     */
    public Float getDataFree() {
        return this.DataFree;
    }

    /**
     * Set <p>碎片空间。</p><p>单位：MB</p>
     * @param DataFree <p>碎片空间。</p><p>单位：MB</p>
     */
    public void setDataFree(Float DataFree) {
        this.DataFree = DataFree;
    }

    /**
     * Get <p>行数。</p> 
     * @return TableRows <p>行数。</p>
     */
    public Long getTableRows() {
        return this.TableRows;
    }

    /**
     * Set <p>行数。</p>
     * @param TableRows <p>行数。</p>
     */
    public void setTableRows(Long TableRows) {
        this.TableRows = TableRows;
    }

    /**
     * Get <p>碎片率（%）。</p> 
     * @return FragRatio <p>碎片率（%）。</p>
     */
    public Float getFragRatio() {
        return this.FragRatio;
    }

    /**
     * Set <p>碎片率（%）。</p>
     * @param FragRatio <p>碎片率（%）。</p>
     */
    public void setFragRatio(Float FragRatio) {
        this.FragRatio = FragRatio;
    }

    /**
     * Get <p>物理文件大小。</p><p>单位：MB</p> 
     * @return PhysicalFileSize <p>物理文件大小。</p><p>单位：MB</p>
     */
    public Float getPhysicalFileSize() {
        return this.PhysicalFileSize;
    }

    /**
     * Set <p>物理文件大小。</p><p>单位：MB</p>
     * @param PhysicalFileSize <p>物理文件大小。</p><p>单位：MB</p>
     */
    public void setPhysicalFileSize(Float PhysicalFileSize) {
        this.PhysicalFileSize = PhysicalFileSize;
    }

    public TableStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableStatistics(TableStatistics source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.DataLength != null) {
            this.DataLength = new Float(source.DataLength);
        }
        if (source.IndexLength != null) {
            this.IndexLength = new Float(source.IndexLength);
        }
        if (source.TotalLength != null) {
            this.TotalLength = new Float(source.TotalLength);
        }
        if (source.UsedLength != null) {
            this.UsedLength = new Float(source.UsedLength);
        }
        if (source.DataFree != null) {
            this.DataFree = new Float(source.DataFree);
        }
        if (source.TableRows != null) {
            this.TableRows = new Long(source.TableRows);
        }
        if (source.FragRatio != null) {
            this.FragRatio = new Float(source.FragRatio);
        }
        if (source.PhysicalFileSize != null) {
            this.PhysicalFileSize = new Float(source.PhysicalFileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "DataLength", this.DataLength);
        this.setParamSimple(map, prefix + "IndexLength", this.IndexLength);
        this.setParamSimple(map, prefix + "TotalLength", this.TotalLength);
        this.setParamSimple(map, prefix + "UsedLength", this.UsedLength);
        this.setParamSimple(map, prefix + "DataFree", this.DataFree);
        this.setParamSimple(map, prefix + "TableRows", this.TableRows);
        this.setParamSimple(map, prefix + "FragRatio", this.FragRatio);
        this.setParamSimple(map, prefix + "PhysicalFileSize", this.PhysicalFileSize);

    }
}

