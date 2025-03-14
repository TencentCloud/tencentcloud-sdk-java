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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOptimizerEnginesRequest extends AbstractModel {

    /**
    * 数据目录名称
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 引擎信息列表
    */
    @SerializedName("Engines")
    @Expose
    private OptimizerEngineInfo [] Engines;

    /**
    * 数据库名称
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据表名称
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
     * Get 数据目录名称 
     * @return Catalog 数据目录名称
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 数据目录名称
     * @param Catalog 数据目录名称
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 引擎信息列表 
     * @return Engines 引擎信息列表
     */
    public OptimizerEngineInfo [] getEngines() {
        return this.Engines;
    }

    /**
     * Set 引擎信息列表
     * @param Engines 引擎信息列表
     */
    public void setEngines(OptimizerEngineInfo [] Engines) {
        this.Engines = Engines;
    }

    /**
     * Get 数据库名称 
     * @return Database 数据库名称
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名称
     * @param Database 数据库名称
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 数据表名称 
     * @return Table 数据表名称
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 数据表名称
     * @param Table 数据表名称
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    public AddOptimizerEnginesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOptimizerEnginesRequest(AddOptimizerEnginesRequest source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Engines != null) {
            this.Engines = new OptimizerEngineInfo[source.Engines.length];
            for (int i = 0; i < source.Engines.length; i++) {
                this.Engines[i] = new OptimizerEngineInfo(source.Engines[i]);
            }
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamArrayObj(map, prefix + "Engines.", this.Engines);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);

    }
}

