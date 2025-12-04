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

public class DBOpFilter extends AbstractModel {

    /**
    * 规则生效的库名
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 库级 DDL/DML 过滤规则
    */
    @SerializedName("OpFilter")
    @Expose
    private OpFilter OpFilter;

    /**
    * 表级 DDL/DML 过滤信息
    */
    @SerializedName("Tables")
    @Expose
    private TableFilter [] Tables;

    /**
    * 视图级 DDL/DML 过滤信息
    */
    @SerializedName("Views")
    @Expose
    private ViewFilter [] Views;

    /**
     * Get 规则生效的库名 
     * @return DbName 规则生效的库名
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 规则生效的库名
     * @param DbName 规则生效的库名
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 库级 DDL/DML 过滤规则 
     * @return OpFilter 库级 DDL/DML 过滤规则
     */
    public OpFilter getOpFilter() {
        return this.OpFilter;
    }

    /**
     * Set 库级 DDL/DML 过滤规则
     * @param OpFilter 库级 DDL/DML 过滤规则
     */
    public void setOpFilter(OpFilter OpFilter) {
        this.OpFilter = OpFilter;
    }

    /**
     * Get 表级 DDL/DML 过滤信息 
     * @return Tables 表级 DDL/DML 过滤信息
     */
    public TableFilter [] getTables() {
        return this.Tables;
    }

    /**
     * Set 表级 DDL/DML 过滤信息
     * @param Tables 表级 DDL/DML 过滤信息
     */
    public void setTables(TableFilter [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get 视图级 DDL/DML 过滤信息 
     * @return Views 视图级 DDL/DML 过滤信息
     */
    public ViewFilter [] getViews() {
        return this.Views;
    }

    /**
     * Set 视图级 DDL/DML 过滤信息
     * @param Views 视图级 DDL/DML 过滤信息
     */
    public void setViews(ViewFilter [] Views) {
        this.Views = Views;
    }

    public DBOpFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBOpFilter(DBOpFilter source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.OpFilter != null) {
            this.OpFilter = new OpFilter(source.OpFilter);
        }
        if (source.Tables != null) {
            this.Tables = new TableFilter[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new TableFilter(source.Tables[i]);
            }
        }
        if (source.Views != null) {
            this.Views = new ViewFilter[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new ViewFilter(source.Views[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamObj(map, prefix + "OpFilter.", this.OpFilter);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);

    }
}

