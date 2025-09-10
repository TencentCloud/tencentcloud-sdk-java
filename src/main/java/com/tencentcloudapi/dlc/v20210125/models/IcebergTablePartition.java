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

public class IcebergTablePartition extends AbstractModel {

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
    * 分区数据文件数量
    */
    @SerializedName("DataFileSize")
    @Expose
    private Long DataFileSize;

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
    * 分区更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最后一次分区更新的快照ID
    */
    @SerializedName("LastUpdateSnapshotId")
    @Expose
    private String LastUpdateSnapshotId;

    /**
    * 分区的location
    */
    @SerializedName("Location")
    @Expose
    private LocationInfo Location;

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
     * Get 分区数据文件数量 
     * @return DataFileSize 分区数据文件数量
     */
    public Long getDataFileSize() {
        return this.DataFileSize;
    }

    /**
     * Set 分区数据文件数量
     * @param DataFileSize 分区数据文件数量
     */
    public void setDataFileSize(Long DataFileSize) {
        this.DataFileSize = DataFileSize;
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
     * Get 分区更新时间 
     * @return UpdateTime 分区更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 分区更新时间
     * @param UpdateTime 分区更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最后一次分区更新的快照ID 
     * @return LastUpdateSnapshotId 最后一次分区更新的快照ID
     */
    public String getLastUpdateSnapshotId() {
        return this.LastUpdateSnapshotId;
    }

    /**
     * Set 最后一次分区更新的快照ID
     * @param LastUpdateSnapshotId 最后一次分区更新的快照ID
     */
    public void setLastUpdateSnapshotId(String LastUpdateSnapshotId) {
        this.LastUpdateSnapshotId = LastUpdateSnapshotId;
    }

    /**
     * Get 分区的location 
     * @return Location 分区的location
     */
    public LocationInfo getLocation() {
        return this.Location;
    }

    /**
     * Set 分区的location
     * @param Location 分区的location
     */
    public void setLocation(LocationInfo Location) {
        this.Location = Location;
    }

    public IcebergTablePartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IcebergTablePartition(IcebergTablePartition source) {
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Records != null) {
            this.Records = new Long(source.Records);
        }
        if (source.DataFileSize != null) {
            this.DataFileSize = new Long(source.DataFileSize);
        }
        if (source.DataFileStorage != null) {
            this.DataFileStorage = new Long(source.DataFileStorage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastUpdateSnapshotId != null) {
            this.LastUpdateSnapshotId = new String(source.LastUpdateSnapshotId);
        }
        if (source.Location != null) {
            this.Location = new LocationInfo(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Records", this.Records);
        this.setParamSimple(map, prefix + "DataFileSize", this.DataFileSize);
        this.setParamSimple(map, prefix + "DataFileStorage", this.DataFileStorage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastUpdateSnapshotId", this.LastUpdateSnapshotId);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

