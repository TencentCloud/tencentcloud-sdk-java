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

public class AlterDMSTableRequest extends AbstractModel{

    /**
    * 当前名称
    */
    @SerializedName("CurrentName")
    @Expose
    private String CurrentName;

    /**
    * 当前数据库名称
    */
    @SerializedName("CurrentDbName")
    @Expose
    private String CurrentDbName;

    /**
    * 基础对象
    */
    @SerializedName("Asset")
    @Expose
    private Asset Asset;

    /**
    * 表类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 存储大小
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 记录数量
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * 生命周期
    */
    @SerializedName("LifeTime")
    @Expose
    private Long LifeTime;

    /**
    * 数据更新时间
    */
    @SerializedName("DataUpdateTime")
    @Expose
    private String DataUpdateTime;

    /**
    * 结构更新时间
    */
    @SerializedName("StructUpdateTime")
    @Expose
    private String StructUpdateTime;

    /**
    * 最后访问时间
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * 存储对象
    */
    @SerializedName("Sds")
    @Expose
    private DMSSds Sds;

    /**
    * 列
    */
    @SerializedName("Columns")
    @Expose
    private DMSColumn [] Columns;

    /**
    * 分区键值
    */
    @SerializedName("PartitionKeys")
    @Expose
    private DMSColumn [] PartitionKeys;

    /**
    * 视图文本
    */
    @SerializedName("ViewOriginalText")
    @Expose
    private String ViewOriginalText;

    /**
    * 视图文本
    */
    @SerializedName("ViewExpandedText")
    @Expose
    private String ViewExpandedText;

    /**
    * 分区
    */
    @SerializedName("Partitions")
    @Expose
    private DMSPartition [] Partitions;

    /**
    * 当前表名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 当前名称 
     * @return CurrentName 当前名称
     */
    public String getCurrentName() {
        return this.CurrentName;
    }

    /**
     * Set 当前名称
     * @param CurrentName 当前名称
     */
    public void setCurrentName(String CurrentName) {
        this.CurrentName = CurrentName;
    }

    /**
     * Get 当前数据库名称 
     * @return CurrentDbName 当前数据库名称
     */
    public String getCurrentDbName() {
        return this.CurrentDbName;
    }

    /**
     * Set 当前数据库名称
     * @param CurrentDbName 当前数据库名称
     */
    public void setCurrentDbName(String CurrentDbName) {
        this.CurrentDbName = CurrentDbName;
    }

    /**
     * Get 基础对象 
     * @return Asset 基础对象
     */
    public Asset getAsset() {
        return this.Asset;
    }

    /**
     * Set 基础对象
     * @param Asset 基础对象
     */
    public void setAsset(Asset Asset) {
        this.Asset = Asset;
    }

    /**
     * Get 表类型 
     * @return Type 表类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 表类型
     * @param Type 表类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 存储大小 
     * @return StorageSize 存储大小
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 存储大小
     * @param StorageSize 存储大小
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 记录数量 
     * @return RecordCount 记录数量
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 记录数量
     * @param RecordCount 记录数量
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 生命周期 
     * @return LifeTime 生命周期
     */
    public Long getLifeTime() {
        return this.LifeTime;
    }

    /**
     * Set 生命周期
     * @param LifeTime 生命周期
     */
    public void setLifeTime(Long LifeTime) {
        this.LifeTime = LifeTime;
    }

    /**
     * Get 数据更新时间 
     * @return DataUpdateTime 数据更新时间
     */
    public String getDataUpdateTime() {
        return this.DataUpdateTime;
    }

    /**
     * Set 数据更新时间
     * @param DataUpdateTime 数据更新时间
     */
    public void setDataUpdateTime(String DataUpdateTime) {
        this.DataUpdateTime = DataUpdateTime;
    }

    /**
     * Get 结构更新时间 
     * @return StructUpdateTime 结构更新时间
     */
    public String getStructUpdateTime() {
        return this.StructUpdateTime;
    }

    /**
     * Set 结构更新时间
     * @param StructUpdateTime 结构更新时间
     */
    public void setStructUpdateTime(String StructUpdateTime) {
        this.StructUpdateTime = StructUpdateTime;
    }

    /**
     * Get 最后访问时间 
     * @return LastAccessTime 最后访问时间
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set 最后访问时间
     * @param LastAccessTime 最后访问时间
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get 存储对象 
     * @return Sds 存储对象
     */
    public DMSSds getSds() {
        return this.Sds;
    }

    /**
     * Set 存储对象
     * @param Sds 存储对象
     */
    public void setSds(DMSSds Sds) {
        this.Sds = Sds;
    }

    /**
     * Get 列 
     * @return Columns 列
     */
    public DMSColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 列
     * @param Columns 列
     */
    public void setColumns(DMSColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 分区键值 
     * @return PartitionKeys 分区键值
     */
    public DMSColumn [] getPartitionKeys() {
        return this.PartitionKeys;
    }

    /**
     * Set 分区键值
     * @param PartitionKeys 分区键值
     */
    public void setPartitionKeys(DMSColumn [] PartitionKeys) {
        this.PartitionKeys = PartitionKeys;
    }

    /**
     * Get 视图文本 
     * @return ViewOriginalText 视图文本
     */
    public String getViewOriginalText() {
        return this.ViewOriginalText;
    }

    /**
     * Set 视图文本
     * @param ViewOriginalText 视图文本
     */
    public void setViewOriginalText(String ViewOriginalText) {
        this.ViewOriginalText = ViewOriginalText;
    }

    /**
     * Get 视图文本 
     * @return ViewExpandedText 视图文本
     */
    public String getViewExpandedText() {
        return this.ViewExpandedText;
    }

    /**
     * Set 视图文本
     * @param ViewExpandedText 视图文本
     */
    public void setViewExpandedText(String ViewExpandedText) {
        this.ViewExpandedText = ViewExpandedText;
    }

    /**
     * Get 分区 
     * @return Partitions 分区
     */
    public DMSPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 分区
     * @param Partitions 分区
     */
    public void setPartitions(DMSPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 当前表名 
     * @return Name 当前表名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 当前表名
     * @param Name 当前表名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public AlterDMSTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlterDMSTableRequest(AlterDMSTableRequest source) {
        if (source.CurrentName != null) {
            this.CurrentName = new String(source.CurrentName);
        }
        if (source.CurrentDbName != null) {
            this.CurrentDbName = new String(source.CurrentDbName);
        }
        if (source.Asset != null) {
            this.Asset = new Asset(source.Asset);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.LifeTime != null) {
            this.LifeTime = new Long(source.LifeTime);
        }
        if (source.DataUpdateTime != null) {
            this.DataUpdateTime = new String(source.DataUpdateTime);
        }
        if (source.StructUpdateTime != null) {
            this.StructUpdateTime = new String(source.StructUpdateTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.Sds != null) {
            this.Sds = new DMSSds(source.Sds);
        }
        if (source.Columns != null) {
            this.Columns = new DMSColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new DMSColumn(source.Columns[i]);
            }
        }
        if (source.PartitionKeys != null) {
            this.PartitionKeys = new DMSColumn[source.PartitionKeys.length];
            for (int i = 0; i < source.PartitionKeys.length; i++) {
                this.PartitionKeys[i] = new DMSColumn(source.PartitionKeys[i]);
            }
        }
        if (source.ViewOriginalText != null) {
            this.ViewOriginalText = new String(source.ViewOriginalText);
        }
        if (source.ViewExpandedText != null) {
            this.ViewExpandedText = new String(source.ViewExpandedText);
        }
        if (source.Partitions != null) {
            this.Partitions = new DMSPartition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new DMSPartition(source.Partitions[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentName", this.CurrentName);
        this.setParamSimple(map, prefix + "CurrentDbName", this.CurrentDbName);
        this.setParamObj(map, prefix + "Asset.", this.Asset);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "LifeTime", this.LifeTime);
        this.setParamSimple(map, prefix + "DataUpdateTime", this.DataUpdateTime);
        this.setParamSimple(map, prefix + "StructUpdateTime", this.StructUpdateTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamObj(map, prefix + "Sds.", this.Sds);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "PartitionKeys.", this.PartitionKeys);
        this.setParamSimple(map, prefix + "ViewOriginalText", this.ViewOriginalText);
        this.setParamSimple(map, prefix + "ViewExpandedText", this.ViewExpandedText);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

