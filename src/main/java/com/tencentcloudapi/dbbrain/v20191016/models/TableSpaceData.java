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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableSpaceData extends AbstractModel {

    /**
    * 表名。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 库名。
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * 库表的存储引擎。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 数据空间（MB）。
    */
    @SerializedName("DataLength")
    @Expose
    private Float DataLength;

    /**
    * 索引空间（MB）。
    */
    @SerializedName("IndexLength")
    @Expose
    private Float IndexLength;

    /**
    * 碎片空间（MB）。
    */
    @SerializedName("DataFree")
    @Expose
    private Float DataFree;

    /**
    * 总使用空间（MB）。
    */
    @SerializedName("TotalLength")
    @Expose
    private Float TotalLength;

    /**
    * 碎片率（%）。
    */
    @SerializedName("FragRatio")
    @Expose
    private Float FragRatio;

    /**
    * 行数。
    */
    @SerializedName("TableRows")
    @Expose
    private Long TableRows;

    /**
    * 表对应的独立物理文件大小（MB）。
    */
    @SerializedName("PhysicalFileSize")
    @Expose
    private Float PhysicalFileSize;

    /**
     * Get 表名。 
     * @return TableName 表名。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名。
     * @param TableName 表名。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 库名。 
     * @return TableSchema 库名。
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set 库名。
     * @param TableSchema 库名。
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get 库表的存储引擎。 
     * @return Engine 库表的存储引擎。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 库表的存储引擎。
     * @param Engine 库表的存储引擎。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 数据空间（MB）。 
     * @return DataLength 数据空间（MB）。
     */
    public Float getDataLength() {
        return this.DataLength;
    }

    /**
     * Set 数据空间（MB）。
     * @param DataLength 数据空间（MB）。
     */
    public void setDataLength(Float DataLength) {
        this.DataLength = DataLength;
    }

    /**
     * Get 索引空间（MB）。 
     * @return IndexLength 索引空间（MB）。
     */
    public Float getIndexLength() {
        return this.IndexLength;
    }

    /**
     * Set 索引空间（MB）。
     * @param IndexLength 索引空间（MB）。
     */
    public void setIndexLength(Float IndexLength) {
        this.IndexLength = IndexLength;
    }

    /**
     * Get 碎片空间（MB）。 
     * @return DataFree 碎片空间（MB）。
     */
    public Float getDataFree() {
        return this.DataFree;
    }

    /**
     * Set 碎片空间（MB）。
     * @param DataFree 碎片空间（MB）。
     */
    public void setDataFree(Float DataFree) {
        this.DataFree = DataFree;
    }

    /**
     * Get 总使用空间（MB）。 
     * @return TotalLength 总使用空间（MB）。
     */
    public Float getTotalLength() {
        return this.TotalLength;
    }

    /**
     * Set 总使用空间（MB）。
     * @param TotalLength 总使用空间（MB）。
     */
    public void setTotalLength(Float TotalLength) {
        this.TotalLength = TotalLength;
    }

    /**
     * Get 碎片率（%）。 
     * @return FragRatio 碎片率（%）。
     */
    public Float getFragRatio() {
        return this.FragRatio;
    }

    /**
     * Set 碎片率（%）。
     * @param FragRatio 碎片率（%）。
     */
    public void setFragRatio(Float FragRatio) {
        this.FragRatio = FragRatio;
    }

    /**
     * Get 行数。 
     * @return TableRows 行数。
     */
    public Long getTableRows() {
        return this.TableRows;
    }

    /**
     * Set 行数。
     * @param TableRows 行数。
     */
    public void setTableRows(Long TableRows) {
        this.TableRows = TableRows;
    }

    /**
     * Get 表对应的独立物理文件大小（MB）。 
     * @return PhysicalFileSize 表对应的独立物理文件大小（MB）。
     */
    public Float getPhysicalFileSize() {
        return this.PhysicalFileSize;
    }

    /**
     * Set 表对应的独立物理文件大小（MB）。
     * @param PhysicalFileSize 表对应的独立物理文件大小（MB）。
     */
    public void setPhysicalFileSize(Float PhysicalFileSize) {
        this.PhysicalFileSize = PhysicalFileSize;
    }

    public TableSpaceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableSpaceData(TableSpaceData source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
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
        if (source.DataFree != null) {
            this.DataFree = new Float(source.DataFree);
        }
        if (source.TotalLength != null) {
            this.TotalLength = new Float(source.TotalLength);
        }
        if (source.FragRatio != null) {
            this.FragRatio = new Float(source.FragRatio);
        }
        if (source.TableRows != null) {
            this.TableRows = new Long(source.TableRows);
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
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "DataLength", this.DataLength);
        this.setParamSimple(map, prefix + "IndexLength", this.IndexLength);
        this.setParamSimple(map, prefix + "DataFree", this.DataFree);
        this.setParamSimple(map, prefix + "TotalLength", this.TotalLength);
        this.setParamSimple(map, prefix + "FragRatio", this.FragRatio);
        this.setParamSimple(map, prefix + "TableRows", this.TableRows);
        this.setParamSimple(map, prefix + "PhysicalFileSize", this.PhysicalFileSize);

    }
}

