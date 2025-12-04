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

public class TableFilter extends AbstractModel {

    /**
    * 规则生效的表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表级 DDL/DML 过滤规则
    */
    @SerializedName("OpFilter")
    @Expose
    private OpFilter OpFilter;

    /**
     * Get 规则生效的表名 
     * @return TableName 规则生效的表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 规则生效的表名
     * @param TableName 规则生效的表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表级 DDL/DML 过滤规则 
     * @return OpFilter 表级 DDL/DML 过滤规则
     */
    public OpFilter getOpFilter() {
        return this.OpFilter;
    }

    /**
     * Set 表级 DDL/DML 过滤规则
     * @param OpFilter 表级 DDL/DML 过滤规则
     */
    public void setOpFilter(OpFilter OpFilter) {
        this.OpFilter = OpFilter;
    }

    public TableFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableFilter(TableFilter source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.OpFilter != null) {
            this.OpFilter = new OpFilter(source.OpFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamObj(map, prefix + "OpFilter.", this.OpFilter);

    }
}

