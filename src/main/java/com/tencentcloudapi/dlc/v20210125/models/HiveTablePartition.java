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

public class HiveTablePartition extends AbstractModel {

    /**
    * 分区信息名称
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * 分区记录数
    */
    @SerializedName("Records")
    @Expose
    private Long Records;

    /**
    * 分区数据文件存储量
    */
    @SerializedName("DataFileStorage")
    @Expose
    private Long DataFileStorage;

    /**
    * 分区创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 分区schema更新时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 最后一次分区更新的访问时间
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
     * Get 分区信息名称 
     * @return Partition 分区信息名称
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区信息名称
     * @param Partition 分区信息名称
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 分区记录数 
     * @return Records 分区记录数
     */
    public Long getRecords() {
        return this.Records;
    }

    /**
     * Set 分区记录数
     * @param Records 分区记录数
     */
    public void setRecords(Long Records) {
        this.Records = Records;
    }

    /**
     * Get 分区数据文件存储量 
     * @return DataFileStorage 分区数据文件存储量
     */
    public Long getDataFileStorage() {
        return this.DataFileStorage;
    }

    /**
     * Set 分区数据文件存储量
     * @param DataFileStorage 分区数据文件存储量
     */
    public void setDataFileStorage(Long DataFileStorage) {
        this.DataFileStorage = DataFileStorage;
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
     * Get 分区schema更新时间 
     * @return ModifiedTime 分区schema更新时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 分区schema更新时间
     * @param ModifiedTime 分区schema更新时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 最后一次分区更新的访问时间 
     * @return LastAccessTime 最后一次分区更新的访问时间
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set 最后一次分区更新的访问时间
     * @param LastAccessTime 最后一次分区更新的访问时间
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    public HiveTablePartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HiveTablePartition(HiveTablePartition source) {
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Records != null) {
            this.Records = new Long(source.Records);
        }
        if (source.DataFileStorage != null) {
            this.DataFileStorage = new Long(source.DataFileStorage);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Records", this.Records);
        this.setParamSimple(map, prefix + "DataFileStorage", this.DataFileStorage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);

    }
}

