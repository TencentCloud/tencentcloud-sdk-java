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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchemaDifference extends AbstractModel {

    /**
    * 结构不一致的表所在库
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 结构不一致的表所在schema
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 结构不一致的表
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 源库表结构
    */
    @SerializedName("SrcSchema")
    @Expose
    private String SrcSchema;

    /**
    * 目标库表结构
    */
    @SerializedName("DstSchema")
    @Expose
    private String DstSchema;

    /**
     * Get 结构不一致的表所在库 
     * @return Db 结构不一致的表所在库
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 结构不一致的表所在库
     * @param Db 结构不一致的表所在库
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 结构不一致的表所在schema 
     * @return Schema 结构不一致的表所在schema
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 结构不一致的表所在schema
     * @param Schema 结构不一致的表所在schema
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 结构不一致的表 
     * @return Table 结构不一致的表
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 结构不一致的表
     * @param Table 结构不一致的表
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 源库表结构 
     * @return SrcSchema 源库表结构
     */
    public String getSrcSchema() {
        return this.SrcSchema;
    }

    /**
     * Set 源库表结构
     * @param SrcSchema 源库表结构
     */
    public void setSrcSchema(String SrcSchema) {
        this.SrcSchema = SrcSchema;
    }

    /**
     * Get 目标库表结构 
     * @return DstSchema 目标库表结构
     */
    public String getDstSchema() {
        return this.DstSchema;
    }

    /**
     * Set 目标库表结构
     * @param DstSchema 目标库表结构
     */
    public void setDstSchema(String DstSchema) {
        this.DstSchema = DstSchema;
    }

    public SchemaDifference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchemaDifference(SchemaDifference source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.SrcSchema != null) {
            this.SrcSchema = new String(source.SrcSchema);
        }
        if (source.DstSchema != null) {
            this.DstSchema = new String(source.DstSchema);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "SrcSchema", this.SrcSchema);
        this.setParamSimple(map, prefix + "DstSchema", this.DstSchema);

    }
}

