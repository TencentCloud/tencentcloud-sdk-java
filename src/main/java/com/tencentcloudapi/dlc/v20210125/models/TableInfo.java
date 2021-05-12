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

public class TableInfo extends AbstractModel{

    /**
    * 数据表配置信息。
    */
    @SerializedName("TableBaseInfo")
    @Expose
    private TableBaseInfo TableBaseInfo;

    /**
    * 数据表格式。每次入参可选如下其一的KV结构，[TextFile，CSV，Json, Parquet, ORC, AVRD]。
    */
    @SerializedName("DataFormat")
    @Expose
    private DataFormat DataFormat;

    /**
    * 数据表列信息。
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * 数据表分块信息。
    */
    @SerializedName("Partitions")
    @Expose
    private Partition [] Partitions;

    /**
    * 数据存储路径。当前仅支持cos路径，格式如下：cosn://bucket-name/filepath。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
     * Get 数据表配置信息。 
     * @return TableBaseInfo 数据表配置信息。
     */
    public TableBaseInfo getTableBaseInfo() {
        return this.TableBaseInfo;
    }

    /**
     * Set 数据表配置信息。
     * @param TableBaseInfo 数据表配置信息。
     */
    public void setTableBaseInfo(TableBaseInfo TableBaseInfo) {
        this.TableBaseInfo = TableBaseInfo;
    }

    /**
     * Get 数据表格式。每次入参可选如下其一的KV结构，[TextFile，CSV，Json, Parquet, ORC, AVRD]。 
     * @return DataFormat 数据表格式。每次入参可选如下其一的KV结构，[TextFile，CSV，Json, Parquet, ORC, AVRD]。
     */
    public DataFormat getDataFormat() {
        return this.DataFormat;
    }

    /**
     * Set 数据表格式。每次入参可选如下其一的KV结构，[TextFile，CSV，Json, Parquet, ORC, AVRD]。
     * @param DataFormat 数据表格式。每次入参可选如下其一的KV结构，[TextFile，CSV，Json, Parquet, ORC, AVRD]。
     */
    public void setDataFormat(DataFormat DataFormat) {
        this.DataFormat = DataFormat;
    }

    /**
     * Get 数据表列信息。 
     * @return Columns 数据表列信息。
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 数据表列信息。
     * @param Columns 数据表列信息。
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 数据表分块信息。 
     * @return Partitions 数据表分块信息。
     */
    public Partition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 数据表分块信息。
     * @param Partitions 数据表分块信息。
     */
    public void setPartitions(Partition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 数据存储路径。当前仅支持cos路径，格式如下：cosn://bucket-name/filepath。 
     * @return Location 数据存储路径。当前仅支持cos路径，格式如下：cosn://bucket-name/filepath。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 数据存储路径。当前仅支持cos路径，格式如下：cosn://bucket-name/filepath。
     * @param Location 数据存储路径。当前仅支持cos路径，格式如下：cosn://bucket-name/filepath。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
        if (source.TableBaseInfo != null) {
            this.TableBaseInfo = new TableBaseInfo(source.TableBaseInfo);
        }
        if (source.DataFormat != null) {
            this.DataFormat = new DataFormat(source.DataFormat);
        }
        if (source.Columns != null) {
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
        }
        if (source.Partitions != null) {
            this.Partitions = new Partition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Partition(source.Partitions[i]);
            }
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableBaseInfo.", this.TableBaseInfo);
        this.setParamObj(map, prefix + "DataFormat.", this.DataFormat);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

