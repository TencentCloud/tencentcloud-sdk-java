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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataCheckStat extends AbstractModel{

    /**
    * 表总数
    */
    @SerializedName("TableTotal")
    @Expose
    private Long TableTotal;

    /**
    * 字段总数
    */
    @SerializedName("ColumnTotal")
    @Expose
    private Long ColumnTotal;

    /**
    * 表配置检测数
    */
    @SerializedName("TableConfig")
    @Expose
    private Long TableConfig;

    /**
    * 字段配置检测数
    */
    @SerializedName("ColumnConfig")
    @Expose
    private Long ColumnConfig;

    /**
    * 表实际检测数
    */
    @SerializedName("TableExec")
    @Expose
    private Long TableExec;

    /**
    * 字段实际检测数
    */
    @SerializedName("ColumnExec")
    @Expose
    private Long ColumnExec;

    /**
     * Get 表总数 
     * @return TableTotal 表总数
     */
    public Long getTableTotal() {
        return this.TableTotal;
    }

    /**
     * Set 表总数
     * @param TableTotal 表总数
     */
    public void setTableTotal(Long TableTotal) {
        this.TableTotal = TableTotal;
    }

    /**
     * Get 字段总数 
     * @return ColumnTotal 字段总数
     */
    public Long getColumnTotal() {
        return this.ColumnTotal;
    }

    /**
     * Set 字段总数
     * @param ColumnTotal 字段总数
     */
    public void setColumnTotal(Long ColumnTotal) {
        this.ColumnTotal = ColumnTotal;
    }

    /**
     * Get 表配置检测数 
     * @return TableConfig 表配置检测数
     */
    public Long getTableConfig() {
        return this.TableConfig;
    }

    /**
     * Set 表配置检测数
     * @param TableConfig 表配置检测数
     */
    public void setTableConfig(Long TableConfig) {
        this.TableConfig = TableConfig;
    }

    /**
     * Get 字段配置检测数 
     * @return ColumnConfig 字段配置检测数
     */
    public Long getColumnConfig() {
        return this.ColumnConfig;
    }

    /**
     * Set 字段配置检测数
     * @param ColumnConfig 字段配置检测数
     */
    public void setColumnConfig(Long ColumnConfig) {
        this.ColumnConfig = ColumnConfig;
    }

    /**
     * Get 表实际检测数 
     * @return TableExec 表实际检测数
     */
    public Long getTableExec() {
        return this.TableExec;
    }

    /**
     * Set 表实际检测数
     * @param TableExec 表实际检测数
     */
    public void setTableExec(Long TableExec) {
        this.TableExec = TableExec;
    }

    /**
     * Get 字段实际检测数 
     * @return ColumnExec 字段实际检测数
     */
    public Long getColumnExec() {
        return this.ColumnExec;
    }

    /**
     * Set 字段实际检测数
     * @param ColumnExec 字段实际检测数
     */
    public void setColumnExec(Long ColumnExec) {
        this.ColumnExec = ColumnExec;
    }

    public DataCheckStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataCheckStat(DataCheckStat source) {
        if (source.TableTotal != null) {
            this.TableTotal = new Long(source.TableTotal);
        }
        if (source.ColumnTotal != null) {
            this.ColumnTotal = new Long(source.ColumnTotal);
        }
        if (source.TableConfig != null) {
            this.TableConfig = new Long(source.TableConfig);
        }
        if (source.ColumnConfig != null) {
            this.ColumnConfig = new Long(source.ColumnConfig);
        }
        if (source.TableExec != null) {
            this.TableExec = new Long(source.TableExec);
        }
        if (source.ColumnExec != null) {
            this.ColumnExec = new Long(source.ColumnExec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableTotal", this.TableTotal);
        this.setParamSimple(map, prefix + "ColumnTotal", this.ColumnTotal);
        this.setParamSimple(map, prefix + "TableConfig", this.TableConfig);
        this.setParamSimple(map, prefix + "ColumnConfig", this.ColumnConfig);
        this.setParamSimple(map, prefix + "TableExec", this.TableExec);
        this.setParamSimple(map, prefix + "ColumnExec", this.ColumnExec);

    }
}

