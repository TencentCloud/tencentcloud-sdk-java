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

public class RowsCountDifference extends AbstractModel {

    /**
    * 数据库名
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 集合
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 源端行数
    */
    @SerializedName("SrcCount")
    @Expose
    private Long SrcCount;

    /**
    * 目标端行数
    */
    @SerializedName("DstCount")
    @Expose
    private Long DstCount;

    /**
     * Get 数据库名 
     * @return Db 数据库名
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 数据库名
     * @param Db 数据库名
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 集合 
     * @return Table 集合
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 集合
     * @param Table 集合
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 源端行数 
     * @return SrcCount 源端行数
     */
    public Long getSrcCount() {
        return this.SrcCount;
    }

    /**
     * Set 源端行数
     * @param SrcCount 源端行数
     */
    public void setSrcCount(Long SrcCount) {
        this.SrcCount = SrcCount;
    }

    /**
     * Get 目标端行数 
     * @return DstCount 目标端行数
     */
    public Long getDstCount() {
        return this.DstCount;
    }

    /**
     * Set 目标端行数
     * @param DstCount 目标端行数
     */
    public void setDstCount(Long DstCount) {
        this.DstCount = DstCount;
    }

    public RowsCountDifference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RowsCountDifference(RowsCountDifference source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.SrcCount != null) {
            this.SrcCount = new Long(source.SrcCount);
        }
        if (source.DstCount != null) {
            this.DstCount = new Long(source.DstCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "SrcCount", this.SrcCount);
        this.setParamSimple(map, prefix + "DstCount", this.DstCount);

    }
}

