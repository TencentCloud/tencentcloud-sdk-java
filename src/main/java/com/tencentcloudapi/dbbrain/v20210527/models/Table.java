/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Table extends AbstractModel{

    /**
    * 库名。
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * 表名。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 库表的存储引擎。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 行数。
    */
    @SerializedName("TableRows")
    @Expose
    private Long TableRows;

    /**
    * 总使用空间（MB）。
    */
    @SerializedName("TotalLength")
    @Expose
    private Float TotalLength;

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

    public Table() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Table(Table source) {
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.TableRows != null) {
            this.TableRows = new Long(source.TableRows);
        }
        if (source.TotalLength != null) {
            this.TotalLength = new Float(source.TotalLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "TableRows", this.TableRows);
        this.setParamSimple(map, prefix + "TotalLength", this.TotalLength);

    }
}

