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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableInfo extends AbstractModel {

    /**
    * 表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表中文档数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 表的大小（即表中文档总大小），单位：字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 索引数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexCount")
    @Expose
    private Long IndexCount;

    /**
    * 索引占用空间，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexSize")
    @Expose
    private Long IndexSize;

    /**
     * Get 表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表中文档数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 表中文档数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 表中文档数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 表中文档数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 表的大小（即表中文档总大小），单位：字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 表的大小（即表中文档总大小），单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 表的大小（即表中文档总大小），单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 表的大小（即表中文档总大小），单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 索引数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexCount 索引数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexCount() {
        return this.IndexCount;
    }

    /**
     * Set 索引数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexCount 索引数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexCount(Long IndexCount) {
        this.IndexCount = IndexCount;
    }

    /**
     * Get 索引占用空间，单位：字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexSize 索引占用空间，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexSize() {
        return this.IndexSize;
    }

    /**
     * Set 索引占用空间，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexSize 索引占用空间，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexSize(Long IndexSize) {
        this.IndexSize = IndexSize;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.IndexCount != null) {
            this.IndexCount = new Long(source.IndexCount);
        }
        if (source.IndexSize != null) {
            this.IndexSize = new Long(source.IndexSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "IndexCount", this.IndexCount);
        this.setParamSimple(map, prefix + "IndexSize", this.IndexSize);

    }
}

