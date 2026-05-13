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

public class TableField extends AbstractModel {

    /**
    * 数据库名
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * 数据库视图名
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 数据库表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 数据库字段名
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 字段敏感信息
    */
    @SerializedName("Sensitive")
    @Expose
    private SensitiveDetail Sensitive;

    /**
     * Get 数据库名 
     * @return DB 数据库名
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set 数据库名
     * @param DB 数据库名
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get 数据库视图名 
     * @return Schema 数据库视图名
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 数据库视图名
     * @param Schema 数据库视图名
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 数据库表名 
     * @return Table 数据库表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 数据库表名
     * @param Table 数据库表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 数据库字段名 
     * @return Field 数据库字段名
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 数据库字段名
     * @param Field 数据库字段名
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 字段敏感信息 
     * @return Sensitive 字段敏感信息
     */
    public SensitiveDetail getSensitive() {
        return this.Sensitive;
    }

    /**
     * Set 字段敏感信息
     * @param Sensitive 字段敏感信息
     */
    public void setSensitive(SensitiveDetail Sensitive) {
        this.Sensitive = Sensitive;
    }

    public TableField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableField(TableField source) {
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Sensitive != null) {
            this.Sensitive = new SensitiveDetail(source.Sensitive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamObj(map, prefix + "Sensitive.", this.Sensitive);

    }
}

