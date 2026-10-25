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

public class MongoCollectionDetail extends AbstractModel {

    /**
    * 集合命名空间，格式为 db.collection。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollStats")
    @Expose
    private String CollStats;

    /**
    * 集合逻辑大小（字节，未压缩）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectionSize")
    @Expose
    private Long CollectionSize;

    /**
    * 集合已分配但未使用的空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataFree")
    @Expose
    private Long DataFree;

    /**
    * 空间利用率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpaceRatio")
    @Expose
    private String SpaceRatio;

    /**
    * 碎片率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragRatio")
    @Expose
    private String FragRatio;

    /**
    * 集合数据大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 所有索引占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalIndexSize")
    @Expose
    private Long TotalIndexSize;

    /**
    * 平均文档大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvgObjSize")
    @Expose
    private Long AvgObjSize;

    /**
    * 集合实际占用存储大小（字节，压缩后）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 文档数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 压缩率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompressionRatio")
    @Expose
    private String CompressionRatio;

    /**
    * 可复用文件空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileReuseBytes")
    @Expose
    private Long FileReuseBytes;

    /**
     * Get 集合命名空间，格式为 db.collection。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollStats 集合命名空间，格式为 db.collection。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollStats() {
        return this.CollStats;
    }

    /**
     * Set 集合命名空间，格式为 db.collection。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollStats 集合命名空间，格式为 db.collection。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollStats(String CollStats) {
        this.CollStats = CollStats;
    }

    /**
     * Get 集合逻辑大小（字节，未压缩）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectionSize 集合逻辑大小（字节，未压缩）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCollectionSize() {
        return this.CollectionSize;
    }

    /**
     * Set 集合逻辑大小（字节，未压缩）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectionSize 集合逻辑大小（字节，未压缩）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectionSize(Long CollectionSize) {
        this.CollectionSize = CollectionSize;
    }

    /**
     * Get 集合已分配但未使用的空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataFree 集合已分配但未使用的空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataFree() {
        return this.DataFree;
    }

    /**
     * Set 集合已分配但未使用的空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataFree 集合已分配但未使用的空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataFree(Long DataFree) {
        this.DataFree = DataFree;
    }

    /**
     * Get 空间利用率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpaceRatio 空间利用率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpaceRatio() {
        return this.SpaceRatio;
    }

    /**
     * Set 空间利用率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpaceRatio 空间利用率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpaceRatio(String SpaceRatio) {
        this.SpaceRatio = SpaceRatio;
    }

    /**
     * Get 碎片率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragRatio 碎片率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFragRatio() {
        return this.FragRatio;
    }

    /**
     * Set 碎片率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragRatio 碎片率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragRatio(String FragRatio) {
        this.FragRatio = FragRatio;
    }

    /**
     * Get 集合数据大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 集合数据大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 集合数据大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 集合数据大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 所有索引占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalIndexSize 所有索引占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalIndexSize() {
        return this.TotalIndexSize;
    }

    /**
     * Set 所有索引占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalIndexSize 所有索引占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalIndexSize(Long TotalIndexSize) {
        this.TotalIndexSize = TotalIndexSize;
    }

    /**
     * Get 平均文档大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvgObjSize 平均文档大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvgObjSize() {
        return this.AvgObjSize;
    }

    /**
     * Set 平均文档大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvgObjSize 平均文档大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvgObjSize(Long AvgObjSize) {
        this.AvgObjSize = AvgObjSize;
    }

    /**
     * Get 集合实际占用存储大小（字节，压缩后）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSize 集合实际占用存储大小（字节，压缩后）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 集合实际占用存储大小（字节，压缩后）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSize 集合实际占用存储大小（字节，压缩后）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 文档数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 文档数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 文档数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 文档数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 压缩率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompressionRatio 压缩率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompressionRatio() {
        return this.CompressionRatio;
    }

    /**
     * Set 压缩率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompressionRatio 压缩率（百分比字符串）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompressionRatio(String CompressionRatio) {
        this.CompressionRatio = CompressionRatio;
    }

    /**
     * Get 可复用文件空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileReuseBytes 可复用文件空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileReuseBytes() {
        return this.FileReuseBytes;
    }

    /**
     * Set 可复用文件空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileReuseBytes 可复用文件空间（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileReuseBytes(Long FileReuseBytes) {
        this.FileReuseBytes = FileReuseBytes;
    }

    public MongoCollectionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoCollectionDetail(MongoCollectionDetail source) {
        if (source.CollStats != null) {
            this.CollStats = new String(source.CollStats);
        }
        if (source.CollectionSize != null) {
            this.CollectionSize = new Long(source.CollectionSize);
        }
        if (source.DataFree != null) {
            this.DataFree = new Long(source.DataFree);
        }
        if (source.SpaceRatio != null) {
            this.SpaceRatio = new String(source.SpaceRatio);
        }
        if (source.FragRatio != null) {
            this.FragRatio = new String(source.FragRatio);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.TotalIndexSize != null) {
            this.TotalIndexSize = new Long(source.TotalIndexSize);
        }
        if (source.AvgObjSize != null) {
            this.AvgObjSize = new Long(source.AvgObjSize);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CompressionRatio != null) {
            this.CompressionRatio = new String(source.CompressionRatio);
        }
        if (source.FileReuseBytes != null) {
            this.FileReuseBytes = new Long(source.FileReuseBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CollStats", this.CollStats);
        this.setParamSimple(map, prefix + "CollectionSize", this.CollectionSize);
        this.setParamSimple(map, prefix + "DataFree", this.DataFree);
        this.setParamSimple(map, prefix + "SpaceRatio", this.SpaceRatio);
        this.setParamSimple(map, prefix + "FragRatio", this.FragRatio);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "TotalIndexSize", this.TotalIndexSize);
        this.setParamSimple(map, prefix + "AvgObjSize", this.AvgObjSize);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CompressionRatio", this.CompressionRatio);
        this.setParamSimple(map, prefix + "FileReuseBytes", this.FileReuseBytes);

    }
}

