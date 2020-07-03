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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsistencyParams extends AbstractModel{

    /**
    * 数据内容检测参数。表中选出用来数据对比的行，占表的总行数的百分比。取值范围是整数[1-100]
    */
    @SerializedName("SelectRowsPerTable")
    @Expose
    private Long SelectRowsPerTable;

    /**
    * 数据内容检测参数。迁移库表中，要进行数据内容检测的表，占所有表的百分比。取值范围是整数[1-100]
    */
    @SerializedName("TablesSelectAll")
    @Expose
    private Long TablesSelectAll;

    /**
    * 数据数量检测，检测表行数是否一致。迁移库表中，要进行数据数量检测的表，占所有表的百分比。取值范围是整数[1-100]
    */
    @SerializedName("TablesSelectCount")
    @Expose
    private Long TablesSelectCount;

    /**
     * Get 数据内容检测参数。表中选出用来数据对比的行，占表的总行数的百分比。取值范围是整数[1-100] 
     * @return SelectRowsPerTable 数据内容检测参数。表中选出用来数据对比的行，占表的总行数的百分比。取值范围是整数[1-100]
     */
    public Long getSelectRowsPerTable() {
        return this.SelectRowsPerTable;
    }

    /**
     * Set 数据内容检测参数。表中选出用来数据对比的行，占表的总行数的百分比。取值范围是整数[1-100]
     * @param SelectRowsPerTable 数据内容检测参数。表中选出用来数据对比的行，占表的总行数的百分比。取值范围是整数[1-100]
     */
    public void setSelectRowsPerTable(Long SelectRowsPerTable) {
        this.SelectRowsPerTable = SelectRowsPerTable;
    }

    /**
     * Get 数据内容检测参数。迁移库表中，要进行数据内容检测的表，占所有表的百分比。取值范围是整数[1-100] 
     * @return TablesSelectAll 数据内容检测参数。迁移库表中，要进行数据内容检测的表，占所有表的百分比。取值范围是整数[1-100]
     */
    public Long getTablesSelectAll() {
        return this.TablesSelectAll;
    }

    /**
     * Set 数据内容检测参数。迁移库表中，要进行数据内容检测的表，占所有表的百分比。取值范围是整数[1-100]
     * @param TablesSelectAll 数据内容检测参数。迁移库表中，要进行数据内容检测的表，占所有表的百分比。取值范围是整数[1-100]
     */
    public void setTablesSelectAll(Long TablesSelectAll) {
        this.TablesSelectAll = TablesSelectAll;
    }

    /**
     * Get 数据数量检测，检测表行数是否一致。迁移库表中，要进行数据数量检测的表，占所有表的百分比。取值范围是整数[1-100] 
     * @return TablesSelectCount 数据数量检测，检测表行数是否一致。迁移库表中，要进行数据数量检测的表，占所有表的百分比。取值范围是整数[1-100]
     */
    public Long getTablesSelectCount() {
        return this.TablesSelectCount;
    }

    /**
     * Set 数据数量检测，检测表行数是否一致。迁移库表中，要进行数据数量检测的表，占所有表的百分比。取值范围是整数[1-100]
     * @param TablesSelectCount 数据数量检测，检测表行数是否一致。迁移库表中，要进行数据数量检测的表，占所有表的百分比。取值范围是整数[1-100]
     */
    public void setTablesSelectCount(Long TablesSelectCount) {
        this.TablesSelectCount = TablesSelectCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelectRowsPerTable", this.SelectRowsPerTable);
        this.setParamSimple(map, prefix + "TablesSelectAll", this.TablesSelectAll);
        this.setParamSimple(map, prefix + "TablesSelectCount", this.TablesSelectCount);

    }
}

