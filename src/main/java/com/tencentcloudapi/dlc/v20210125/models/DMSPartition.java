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

public class DMSPartition extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据目录名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 数据版本
    */
    @SerializedName("DataVersion")
    @Expose
    private Long DataVersion;

    /**
    * 分区名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 值列表
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

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
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 最后访问时间
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * 附件属性
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
    * 存储对象
    */
    @SerializedName("Sds")
    @Expose
    private DMSSds Sds;

    /**
     * Get 数据库名称 
     * @return DatabaseName 数据库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
     * @param DatabaseName 数据库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据目录名称 
     * @return SchemaName 数据目录名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 数据目录名称
     * @param SchemaName 数据目录名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 数据版本 
     * @return DataVersion 数据版本
     */
    public Long getDataVersion() {
        return this.DataVersion;
    }

    /**
     * Set 数据版本
     * @param DataVersion 数据版本
     */
    public void setDataVersion(Long DataVersion) {
        this.DataVersion = DataVersion;
    }

    /**
     * Get 分区名称 
     * @return Name 分区名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分区名称
     * @param Name 分区名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 值列表 
     * @return Values 值列表
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 值列表
     * @param Values 值列表
     */
    public void setValues(String [] Values) {
        this.Values = Values;
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
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifiedTime 修改时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间
     * @param ModifiedTime 修改时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
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
     * Get 附件属性 
     * @return Params 附件属性
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set 附件属性
     * @param Params 附件属性
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
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

    public DMSPartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSPartition(DMSPartition source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.DataVersion != null) {
            this.DataVersion = new Long(source.DataVersion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
        if (source.Sds != null) {
            this.Sds = new DMSSds(source.Sds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DataVersion", this.DataVersion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamObj(map, prefix + "Sds.", this.Sds);

    }
}

