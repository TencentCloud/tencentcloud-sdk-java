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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TablePartition extends AbstractModel {

    /**
    * 分区名称
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * 分区记录数
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * 分区数据存储大小，字节数
    */
    @SerializedName("StorageSize")
    @Expose
    private String StorageSize;

    /**
    * 分区创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 分区修改时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 分区数据存储大小，已转为适合的单位
    */
    @SerializedName("StorageSizeWithUnit")
    @Expose
    private String StorageSizeWithUnit;

    /**
    * 文件数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumFiles")
    @Expose
    private Long NumFiles;

    /**
    * 平均文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageFileSizeWithUnit")
    @Expose
    private String AverageFileSizeWithUnit;

    /**
     * Get 分区名称 
     * @return PartitionName 分区名称
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set 分区名称
     * @param PartitionName 分区名称
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get 分区记录数 
     * @return RecordCount 分区记录数
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 分区记录数
     * @param RecordCount 分区记录数
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 分区数据存储大小，字节数 
     * @return StorageSize 分区数据存储大小，字节数
     */
    public String getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 分区数据存储大小，字节数
     * @param StorageSize 分区数据存储大小，字节数
     */
    public void setStorageSize(String StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 分区创建时间 
     * @return CreateTime 分区创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 分区创建时间
     * @param CreateTime 分区创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 分区修改时间 
     * @return ModifiedTime 分区修改时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 分区修改时间
     * @param ModifiedTime 分区修改时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 分区数据存储大小，已转为适合的单位 
     * @return StorageSizeWithUnit 分区数据存储大小，已转为适合的单位
     */
    public String getStorageSizeWithUnit() {
        return this.StorageSizeWithUnit;
    }

    /**
     * Set 分区数据存储大小，已转为适合的单位
     * @param StorageSizeWithUnit 分区数据存储大小，已转为适合的单位
     */
    public void setStorageSizeWithUnit(String StorageSizeWithUnit) {
        this.StorageSizeWithUnit = StorageSizeWithUnit;
    }

    /**
     * Get 文件数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumFiles 文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumFiles() {
        return this.NumFiles;
    }

    /**
     * Set 文件数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumFiles 文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumFiles(Long NumFiles) {
        this.NumFiles = NumFiles;
    }

    /**
     * Get 平均文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageFileSizeWithUnit 平均文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAverageFileSizeWithUnit() {
        return this.AverageFileSizeWithUnit;
    }

    /**
     * Set 平均文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageFileSizeWithUnit 平均文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageFileSizeWithUnit(String AverageFileSizeWithUnit) {
        this.AverageFileSizeWithUnit = AverageFileSizeWithUnit;
    }

    public TablePartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TablePartition(TablePartition source) {
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new String(source.StorageSize);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.StorageSizeWithUnit != null) {
            this.StorageSizeWithUnit = new String(source.StorageSizeWithUnit);
        }
        if (source.NumFiles != null) {
            this.NumFiles = new Long(source.NumFiles);
        }
        if (source.AverageFileSizeWithUnit != null) {
            this.AverageFileSizeWithUnit = new String(source.AverageFileSizeWithUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "StorageSizeWithUnit", this.StorageSizeWithUnit);
        this.setParamSimple(map, prefix + "NumFiles", this.NumFiles);
        this.setParamSimple(map, prefix + "AverageFileSizeWithUnit", this.AverageFileSizeWithUnit);

    }
}

