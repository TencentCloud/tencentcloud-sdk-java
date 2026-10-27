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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongoDBSchemaSpaceItem extends AbstractModel {

    /**
    * <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * <p>数据采集时间戳（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>磁盘占用大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SizeOnDisk")
    @Expose
    private Long SizeOnDisk;

    /**
    * <p>库级数据大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>库级平均文档大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvgObjSize")
    @Expose
    private Long AvgObjSize;

    /**
    * <p>库级文档数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>库级存储大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * <p>库级索引总大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalIndexSize")
    @Expose
    private Long TotalIndexSize;

    /**
    * <p>库级已分配未使用空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataFree")
    @Expose
    private Long DataFree;

    /**
    * <p>库级碎片率（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragRatio")
    @Expose
    private String FragRatio;

    /**
    * <p>库级可复用文件空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileReuseBytes")
    @Expose
    private Long FileReuseBytes;

    /**
    * <p>库空间占比（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseRatio")
    @Expose
    private String DatabaseRatio;

    /**
     * Get <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Db <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Db <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get <p>数据采集时间戳（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>数据采集时间戳（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>数据采集时间戳（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>数据采集时间戳（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>磁盘占用大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SizeOnDisk <p>磁盘占用大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSizeOnDisk() {
        return this.SizeOnDisk;
    }

    /**
     * Set <p>磁盘占用大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SizeOnDisk <p>磁盘占用大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSizeOnDisk(Long SizeOnDisk) {
        this.SizeOnDisk = SizeOnDisk;
    }

    /**
     * Get <p>库级数据大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size <p>库级数据大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>库级数据大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size <p>库级数据大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>库级平均文档大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvgObjSize <p>库级平均文档大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvgObjSize() {
        return this.AvgObjSize;
    }

    /**
     * Set <p>库级平均文档大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvgObjSize <p>库级平均文档大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvgObjSize(Long AvgObjSize) {
        this.AvgObjSize = AvgObjSize;
    }

    /**
     * Get <p>库级文档数量。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count <p>库级文档数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>库级文档数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count <p>库级文档数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>库级存储大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSize <p>库级存储大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set <p>库级存储大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSize <p>库级存储大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get <p>库级索引总大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalIndexSize <p>库级索引总大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalIndexSize() {
        return this.TotalIndexSize;
    }

    /**
     * Set <p>库级索引总大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalIndexSize <p>库级索引总大小（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalIndexSize(Long TotalIndexSize) {
        this.TotalIndexSize = TotalIndexSize;
    }

    /**
     * Get <p>库级已分配未使用空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataFree <p>库级已分配未使用空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataFree() {
        return this.DataFree;
    }

    /**
     * Set <p>库级已分配未使用空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataFree <p>库级已分配未使用空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataFree(Long DataFree) {
        this.DataFree = DataFree;
    }

    /**
     * Get <p>库级碎片率（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragRatio <p>库级碎片率（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFragRatio() {
        return this.FragRatio;
    }

    /**
     * Set <p>库级碎片率（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragRatio <p>库级碎片率（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragRatio(String FragRatio) {
        this.FragRatio = FragRatio;
    }

    /**
     * Get <p>库级可复用文件空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileReuseBytes <p>库级可复用文件空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileReuseBytes() {
        return this.FileReuseBytes;
    }

    /**
     * Set <p>库级可复用文件空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileReuseBytes <p>库级可复用文件空间（字节）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileReuseBytes(Long FileReuseBytes) {
        this.FileReuseBytes = FileReuseBytes;
    }

    /**
     * Get <p>库空间占比（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseRatio <p>库空间占比（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseRatio() {
        return this.DatabaseRatio;
    }

    /**
     * Set <p>库空间占比（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseRatio <p>库空间占比（百分比字符串）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseRatio(String DatabaseRatio) {
        this.DatabaseRatio = DatabaseRatio;
    }

    public MongoDBSchemaSpaceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoDBSchemaSpaceItem(MongoDBSchemaSpaceItem source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.SizeOnDisk != null) {
            this.SizeOnDisk = new Long(source.SizeOnDisk);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.AvgObjSize != null) {
            this.AvgObjSize = new Long(source.AvgObjSize);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.TotalIndexSize != null) {
            this.TotalIndexSize = new Long(source.TotalIndexSize);
        }
        if (source.DataFree != null) {
            this.DataFree = new Long(source.DataFree);
        }
        if (source.FragRatio != null) {
            this.FragRatio = new String(source.FragRatio);
        }
        if (source.FileReuseBytes != null) {
            this.FileReuseBytes = new Long(source.FileReuseBytes);
        }
        if (source.DatabaseRatio != null) {
            this.DatabaseRatio = new String(source.DatabaseRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SizeOnDisk", this.SizeOnDisk);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "AvgObjSize", this.AvgObjSize);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "TotalIndexSize", this.TotalIndexSize);
        this.setParamSimple(map, prefix + "DataFree", this.DataFree);
        this.setParamSimple(map, prefix + "FragRatio", this.FragRatio);
        this.setParamSimple(map, prefix + "FileReuseBytes", this.FileReuseBytes);
        this.setParamSimple(map, prefix + "DatabaseRatio", this.DatabaseRatio);

    }
}

