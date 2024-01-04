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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMetaTableRequest extends AbstractModel {

    /**
    * 目录名
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 空间唯一标识
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 目录名 
     * @return Catalog 目录名
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 目录名
     * @param Catalog 目录名
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 库名 
     * @return Database 库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 库名
     * @param Database 库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 表名 
     * @return Table 表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名
     * @param Table 表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 空间唯一标识 
     * @return WorkSpaceId 空间唯一标识
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 空间唯一标识
     * @param WorkSpaceId 空间唯一标识
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public GetMetaTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMetaTableRequest(GetMetaTableRequest source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

