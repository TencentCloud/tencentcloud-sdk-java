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

public class Table extends AbstractModel {

    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 新表名
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
    * 过滤条件
    */
    @SerializedName("FilterCondition")
    @Expose
    private String FilterCondition;

    /**
    * 是否同步表中所有列，All：当前表下的所有列,Partial(ModifySyncJobConfig接口里的对应字段ColumnMode暂不支持Partial)：当前表下的部分列，通过填充Columns字段详细表信息
    */
    @SerializedName("ColumnMode")
    @Expose
    private String ColumnMode;

    /**
    * 同步的列信息，当ColumnMode为Partial时，必填
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * 同步临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在同步过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。
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
     * Get 表名 
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 新表名 
     * @return NewTableName 新表名
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set 新表名
     * @param NewTableName 新表名
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    /**
     * Get 过滤条件 
     * @return FilterCondition 过滤条件
     */
    public String getFilterCondition() {
        return this.FilterCondition;
    }

    /**
     * Set 过滤条件
     * @param FilterCondition 过滤条件
     */
    public void setFilterCondition(String FilterCondition) {
        this.FilterCondition = FilterCondition;
    }

    /**
     * Get 是否同步表中所有列，All：当前表下的所有列,Partial(ModifySyncJobConfig接口里的对应字段ColumnMode暂不支持Partial)：当前表下的部分列，通过填充Columns字段详细表信息 
     * @return ColumnMode 是否同步表中所有列，All：当前表下的所有列,Partial(ModifySyncJobConfig接口里的对应字段ColumnMode暂不支持Partial)：当前表下的部分列，通过填充Columns字段详细表信息
     */
    public String getColumnMode() {
        return this.ColumnMode;
    }

    /**
     * Set 是否同步表中所有列，All：当前表下的所有列,Partial(ModifySyncJobConfig接口里的对应字段ColumnMode暂不支持Partial)：当前表下的部分列，通过填充Columns字段详细表信息
     * @param ColumnMode 是否同步表中所有列，All：当前表下的所有列,Partial(ModifySyncJobConfig接口里的对应字段ColumnMode暂不支持Partial)：当前表下的部分列，通过填充Columns字段详细表信息
     */
    public void setColumnMode(String ColumnMode) {
        this.ColumnMode = ColumnMode;
    }

    /**
     * Get 同步的列信息，当ColumnMode为Partial时，必填 
     * @return Columns 同步的列信息，当ColumnMode为Partial时，必填
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 同步的列信息，当ColumnMode为Partial时，必填
     * @param Columns 同步的列信息，当ColumnMode为Partial时，必填
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 同步临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在同步过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。 
     * @return TmpTables 同步临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在同步过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。
     */
    public String [] getTmpTables() {
        return this.TmpTables;
    }

    /**
     * Set 同步临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在同步过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。
     * @param TmpTables 同步临时表，注意此配置与NewTableName互斥，只能使用其中一种。当配置的同步对象为表级别且TableEditMode为pt时此项有意义，针对pt-osc等工具在同步过程中产生的临时表进行同步，需要提前将可能的临时表配置在这里，否则不会同步任何临时表。示例，如要对t1进行pt-osc操作，此项配置应该为["\_t1\_new","\_t1\_old"]；如要对t1进行gh-ost操作，此项配置应该为["\_t1\_ghc","\_t1\_gho","\_t1\_del"]，pt-osc与gh-ost产生的临时表可同时配置。
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

    public Table() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Table(Table source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
        if (source.FilterCondition != null) {
            this.FilterCondition = new String(source.FilterCondition);
        }
        if (source.ColumnMode != null) {
            this.ColumnMode = new String(source.ColumnMode);
        }
        if (source.Columns != null) {
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
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
        this.setParamSimple(map, prefix + "FilterCondition", this.FilterCondition);
        this.setParamSimple(map, prefix + "ColumnMode", this.ColumnMode);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArraySimple(map, prefix + "TmpTables.", this.TmpTables);
        this.setParamSimple(map, prefix + "TableEditMode", this.TableEditMode);

    }
}

