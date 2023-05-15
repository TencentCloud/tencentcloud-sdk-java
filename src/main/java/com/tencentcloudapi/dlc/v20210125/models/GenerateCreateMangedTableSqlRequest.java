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

public class GenerateCreateMangedTableSqlRequest extends AbstractModel{

    /**
    * 表基本信息
    */
    @SerializedName("TableBaseInfo")
    @Expose
    private TableBaseInfo TableBaseInfo;

    /**
    * 表字段信息
    */
    @SerializedName("Columns")
    @Expose
    private TColumn [] Columns;

    /**
    * 表分区信息
    */
    @SerializedName("Partitions")
    @Expose
    private TPartition [] Partitions;

    /**
    * 表属性信息
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * V2 upsert表 upsert键
    */
    @SerializedName("UpsertKeys")
    @Expose
    private String [] UpsertKeys;

    /**
     * Get 表基本信息 
     * @return TableBaseInfo 表基本信息
     */
    public TableBaseInfo getTableBaseInfo() {
        return this.TableBaseInfo;
    }

    /**
     * Set 表基本信息
     * @param TableBaseInfo 表基本信息
     */
    public void setTableBaseInfo(TableBaseInfo TableBaseInfo) {
        this.TableBaseInfo = TableBaseInfo;
    }

    /**
     * Get 表字段信息 
     * @return Columns 表字段信息
     */
    public TColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 表字段信息
     * @param Columns 表字段信息
     */
    public void setColumns(TColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 表分区信息 
     * @return Partitions 表分区信息
     */
    public TPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 表分区信息
     * @param Partitions 表分区信息
     */
    public void setPartitions(TPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 表属性信息 
     * @return Properties 表属性信息
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 表属性信息
     * @param Properties 表属性信息
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get V2 upsert表 upsert键 
     * @return UpsertKeys V2 upsert表 upsert键
     */
    public String [] getUpsertKeys() {
        return this.UpsertKeys;
    }

    /**
     * Set V2 upsert表 upsert键
     * @param UpsertKeys V2 upsert表 upsert键
     */
    public void setUpsertKeys(String [] UpsertKeys) {
        this.UpsertKeys = UpsertKeys;
    }

    public GenerateCreateMangedTableSqlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateCreateMangedTableSqlRequest(GenerateCreateMangedTableSqlRequest source) {
        if (source.TableBaseInfo != null) {
            this.TableBaseInfo = new TableBaseInfo(source.TableBaseInfo);
        }
        if (source.Columns != null) {
            this.Columns = new TColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new TColumn(source.Columns[i]);
            }
        }
        if (source.Partitions != null) {
            this.Partitions = new TPartition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new TPartition(source.Partitions[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.UpsertKeys != null) {
            this.UpsertKeys = new String[source.UpsertKeys.length];
            for (int i = 0; i < source.UpsertKeys.length; i++) {
                this.UpsertKeys[i] = new String(source.UpsertKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableBaseInfo.", this.TableBaseInfo);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamArraySimple(map, prefix + "UpsertKeys.", this.UpsertKeys);

    }
}

