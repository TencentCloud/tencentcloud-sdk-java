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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkippedPrivilegeItem extends AbstractModel {

    /**
    * <p>数据目录（catalog）名称</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>库名</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>表名；库级条目被跳过时该字段为空（Go 定义带 omitempty，为空时响应里整个字段不出现）</p>
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * <p>跳过原因，如 table not found, maybe already dropped、database not found, maybe already dropped、existence check failed, granting  skipped this round, please retry</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>数据目录（catalog）名称</p> 
     * @return CatalogName <p>数据目录（catalog）名称</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>数据目录（catalog）名称</p>
     * @param CatalogName <p>数据目录（catalog）名称</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>库名</p> 
     * @return Database <p>库名</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>库名</p>
     * @param Database <p>库名</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>表名；库级条目被跳过时该字段为空（Go 定义带 omitempty，为空时响应里整个字段不出现）</p> 
     * @return Table <p>表名；库级条目被跳过时该字段为空（Go 定义带 omitempty，为空时响应里整个字段不出现）</p>
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set <p>表名；库级条目被跳过时该字段为空（Go 定义带 omitempty，为空时响应里整个字段不出现）</p>
     * @param Table <p>表名；库级条目被跳过时该字段为空（Go 定义带 omitempty，为空时响应里整个字段不出现）</p>
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get <p>跳过原因，如 table not found, maybe already dropped、database not found, maybe already dropped、existence check failed, granting  skipped this round, please retry</p> 
     * @return Reason <p>跳过原因，如 table not found, maybe already dropped、database not found, maybe already dropped、existence check failed, granting  skipped this round, please retry</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>跳过原因，如 table not found, maybe already dropped、database not found, maybe already dropped、existence check failed, granting  skipped this round, please retry</p>
     * @param Reason <p>跳过原因，如 table not found, maybe already dropped、database not found, maybe already dropped、existence check failed, granting  skipped this round, please retry</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public SkippedPrivilegeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkippedPrivilegeItem(SkippedPrivilegeItem source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

