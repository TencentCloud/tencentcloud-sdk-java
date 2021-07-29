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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Policy extends AbstractModel{

    /**
    * 需要授权的数据源名称，当前仅支持COSDataCatalog或者*
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 需要授权的数据库名，填*代表当前Catalog下所有数据库
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 需要授权的表名，填*代表当前Database下所有表
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 授权粒度，当前只支持ALL，即全部权限
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 需要授权的数据源名称，当前仅支持COSDataCatalog或者* 
     * @return Catalog 需要授权的数据源名称，当前仅支持COSDataCatalog或者*
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 需要授权的数据源名称，当前仅支持COSDataCatalog或者*
     * @param Catalog 需要授权的数据源名称，当前仅支持COSDataCatalog或者*
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 需要授权的数据库名，填*代表当前Catalog下所有数据库 
     * @return Database 需要授权的数据库名，填*代表当前Catalog下所有数据库
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 需要授权的数据库名，填*代表当前Catalog下所有数据库
     * @param Database 需要授权的数据库名，填*代表当前Catalog下所有数据库
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 需要授权的表名，填*代表当前Database下所有表 
     * @return Table 需要授权的表名，填*代表当前Database下所有表
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 需要授权的表名，填*代表当前Database下所有表
     * @param Table 需要授权的表名，填*代表当前Database下所有表
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 授权粒度，当前只支持ALL，即全部权限 
     * @return Operation 授权粒度，当前只支持ALL，即全部权限
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 授权粒度，当前只支持ALL，即全部权限
     * @param Operation 授权粒度，当前只支持ALL，即全部权限
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public Policy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Policy(Policy source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

