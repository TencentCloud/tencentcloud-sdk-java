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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DifferenceData extends AbstractModel {

    /**
    * 数据库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 源端ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcChunk")
    @Expose
    private String SrcChunk;

    /**
    * 目标端ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstChunk")
    @Expose
    private String DstChunk;

    /**
    * 源端值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcItem")
    @Expose
    private String SrcItem;

    /**
    * 目标端值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstItem")
    @Expose
    private String DstItem;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 数据库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Db 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Db 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table 集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table 集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 源端ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcChunk 源端ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcChunk() {
        return this.SrcChunk;
    }

    /**
     * Set 源端ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcChunk 源端ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcChunk(String SrcChunk) {
        this.SrcChunk = SrcChunk;
    }

    /**
     * Get 目标端ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstChunk 目标端ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstChunk() {
        return this.DstChunk;
    }

    /**
     * Set 目标端ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstChunk 目标端ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstChunk(String DstChunk) {
        this.DstChunk = DstChunk;
    }

    /**
     * Get 源端值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcItem 源端值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcItem() {
        return this.SrcItem;
    }

    /**
     * Set 源端值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcItem 源端值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcItem(String SrcItem) {
        this.SrcItem = SrcItem;
    }

    /**
     * Get 目标端值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstItem 目标端值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstItem() {
        return this.DstItem;
    }

    /**
     * Set 目标端值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstItem 目标端值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstItem(String DstItem) {
        this.DstItem = DstItem;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public DifferenceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DifferenceData(DifferenceData source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.SrcChunk != null) {
            this.SrcChunk = new String(source.SrcChunk);
        }
        if (source.DstChunk != null) {
            this.DstChunk = new String(source.DstChunk);
        }
        if (source.SrcItem != null) {
            this.SrcItem = new String(source.SrcItem);
        }
        if (source.DstItem != null) {
            this.DstItem = new String(source.DstItem);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "SrcChunk", this.SrcChunk);
        this.setParamSimple(map, prefix + "DstChunk", this.DstChunk);
        this.setParamSimple(map, prefix + "SrcItem", this.SrcItem);
        this.setParamSimple(map, prefix + "DstItem", this.DstItem);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

