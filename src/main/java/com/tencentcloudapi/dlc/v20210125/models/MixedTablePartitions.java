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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MixedTablePartitions extends AbstractModel {

    /**
    * 数据表格式
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
    * 分区总数
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * 分页查询的游标信息，在获取下一页信息时需要回传到服务端
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
    * iceberg表分区信息
    */
    @SerializedName("IcebergPartitions")
    @Expose
    private IcebergTablePartition [] IcebergPartitions;

    /**
    * hive表分区信息
    */
    @SerializedName("HivePartitions")
    @Expose
    private HiveTablePartition [] HivePartitions;

    /**
     * Get 数据表格式 
     * @return TableFormat 数据表格式
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set 数据表格式
     * @param TableFormat 数据表格式
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    /**
     * Get 分区总数 
     * @return TotalSize 分区总数
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 分区总数
     * @param TotalSize 分区总数
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 分页查询的游标信息，在获取下一页信息时需要回传到服务端 
     * @return NextCursor 分页查询的游标信息，在获取下一页信息时需要回传到服务端
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set 分页查询的游标信息，在获取下一页信息时需要回传到服务端
     * @param NextCursor 分页查询的游标信息，在获取下一页信息时需要回传到服务端
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    /**
     * Get iceberg表分区信息 
     * @return IcebergPartitions iceberg表分区信息
     */
    public IcebergTablePartition [] getIcebergPartitions() {
        return this.IcebergPartitions;
    }

    /**
     * Set iceberg表分区信息
     * @param IcebergPartitions iceberg表分区信息
     */
    public void setIcebergPartitions(IcebergTablePartition [] IcebergPartitions) {
        this.IcebergPartitions = IcebergPartitions;
    }

    /**
     * Get hive表分区信息 
     * @return HivePartitions hive表分区信息
     */
    public HiveTablePartition [] getHivePartitions() {
        return this.HivePartitions;
    }

    /**
     * Set hive表分区信息
     * @param HivePartitions hive表分区信息
     */
    public void setHivePartitions(HiveTablePartition [] HivePartitions) {
        this.HivePartitions = HivePartitions;
    }

    public MixedTablePartitions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MixedTablePartitions(MixedTablePartitions source) {
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
        if (source.IcebergPartitions != null) {
            this.IcebergPartitions = new IcebergTablePartition[source.IcebergPartitions.length];
            for (int i = 0; i < source.IcebergPartitions.length; i++) {
                this.IcebergPartitions[i] = new IcebergTablePartition(source.IcebergPartitions[i]);
            }
        }
        if (source.HivePartitions != null) {
            this.HivePartitions = new HiveTablePartition[source.HivePartitions.length];
            for (int i = 0; i < source.HivePartitions.length; i++) {
                this.HivePartitions[i] = new HiveTablePartition(source.HivePartitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamArrayObj(map, prefix + "IcebergPartitions.", this.IcebergPartitions);
        this.setParamArrayObj(map, prefix + "HivePartitions.", this.HivePartitions);

    }
}

