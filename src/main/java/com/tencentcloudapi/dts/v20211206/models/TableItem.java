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

public class TableItem extends AbstractModel {

    /**
    * 迁移的表名，大小写敏感
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 迁移后的表名，当TableEditMode为rename时此项必填，注意此配置与TmpTables互斥，只能使用其中一种
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
    * 迁移临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在迁移过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。
    */
    @SerializedName("TmpTables")
    @Expose
    private String [] TmpTables;

    /**
    * 编辑表类型，rename(表映射)，pt(同步附加表)
    */
    @SerializedName("TableEditMode")
    @Expose
    private String TableEditMode;

    /**
     * Get 迁移的表名，大小写敏感 
     * @return TableName 迁移的表名，大小写敏感
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 迁移的表名，大小写敏感
     * @param TableName 迁移的表名，大小写敏感
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 迁移后的表名，当TableEditMode为rename时此项必填，注意此配置与TmpTables互斥，只能使用其中一种 
     * @return NewTableName 迁移后的表名，当TableEditMode为rename时此项必填，注意此配置与TmpTables互斥，只能使用其中一种
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set 迁移后的表名，当TableEditMode为rename时此项必填，注意此配置与TmpTables互斥，只能使用其中一种
     * @param NewTableName 迁移后的表名，当TableEditMode为rename时此项必填，注意此配置与TmpTables互斥，只能使用其中一种
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    /**
     * Get 迁移临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在迁移过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。 
     * @return TmpTables 迁移临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在迁移过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。
     */
    public String [] getTmpTables() {
        return this.TmpTables;
    }

    /**
     * Set 迁移临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在迁移过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。
     * @param TmpTables 迁移临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在迁移过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。
     */
    public void setTmpTables(String [] TmpTables) {
        this.TmpTables = TmpTables;
    }

    /**
     * Get 编辑表类型，rename(表映射)，pt(同步附加表) 
     * @return TableEditMode 编辑表类型，rename(表映射)，pt(同步附加表)
     */
    public String getTableEditMode() {
        return this.TableEditMode;
    }

    /**
     * Set 编辑表类型，rename(表映射)，pt(同步附加表)
     * @param TableEditMode 编辑表类型，rename(表映射)，pt(同步附加表)
     */
    public void setTableEditMode(String TableEditMode) {
        this.TableEditMode = TableEditMode;
    }

    public TableItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableItem(TableItem source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
        if (source.TmpTables != null) {
            this.TmpTables = new String[source.TmpTables.length];
            for (int i = 0; i < source.TmpTables.length; i++) {
                this.TmpTables[i] = new String(source.TmpTables[i]);
            }
        }
        if (source.TableEditMode != null) {
            this.TableEditMode = new String(source.TableEditMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);
        this.setParamArraySimple(map, prefix + "TmpTables.", this.TmpTables);
        this.setParamSimple(map, prefix + "TableEditMode", this.TableEditMode);

    }
}

