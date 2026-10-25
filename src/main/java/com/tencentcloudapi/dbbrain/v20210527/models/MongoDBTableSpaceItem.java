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

public class MongoDBTableSpaceItem extends AbstractModel {

    /**
    * 应用 Id（AppId）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例 Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 数据采集时间戳（毫秒）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 磁盘占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SizeOnDisk")
    @Expose
    private Long SizeOnDisk;

    /**
    * 集合级空间使用明细。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Collection")
    @Expose
    private MongoCollectionDetail Collection;

    /**
     * Get 应用 Id（AppId）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 应用 Id（AppId）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用 Id（AppId）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 应用 Id（AppId）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例 Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例 Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例 Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Db 数据库名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 数据库名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Db 数据库名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 数据采集时间戳（毫秒）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 数据采集时间戳（毫秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 数据采集时间戳（毫秒）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 数据采集时间戳（毫秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 磁盘占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SizeOnDisk 磁盘占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSizeOnDisk() {
        return this.SizeOnDisk;
    }

    /**
     * Set 磁盘占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SizeOnDisk 磁盘占用大小（字节）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSizeOnDisk(Long SizeOnDisk) {
        this.SizeOnDisk = SizeOnDisk;
    }

    /**
     * Get 集合级空间使用明细。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Collection 集合级空间使用明细。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoCollectionDetail getCollection() {
        return this.Collection;
    }

    /**
     * Set 集合级空间使用明细。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Collection 集合级空间使用明细。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollection(MongoCollectionDetail Collection) {
        this.Collection = Collection;
    }

    public MongoDBTableSpaceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoDBTableSpaceItem(MongoDBTableSpaceItem source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.SizeOnDisk != null) {
            this.SizeOnDisk = new Long(source.SizeOnDisk);
        }
        if (source.Collection != null) {
            this.Collection = new MongoCollectionDetail(source.Collection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SizeOnDisk", this.SizeOnDisk);
        this.setParamObj(map, prefix + "Collection.", this.Collection);

    }
}

