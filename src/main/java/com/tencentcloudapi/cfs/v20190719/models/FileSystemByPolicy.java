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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSystemByPolicy extends AbstractModel{

    /**
    * 文件系统名称
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 文件系统大小
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * 存储类型
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 快照总大小
    */
    @SerializedName("TotalSnapshotSize")
    @Expose
    private Long TotalSnapshotSize;

    /**
    * 文件系统创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 文件系统所在区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
     * Get 文件系统名称 
     * @return CreationToken 文件系统名称
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set 文件系统名称
     * @param CreationToken 文件系统名称
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
    }

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 文件系统大小 
     * @return SizeByte 文件系统大小
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set 文件系统大小
     * @param SizeByte 文件系统大小
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get 存储类型 
     * @return StorageType 存储类型
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型
     * @param StorageType 存储类型
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 快照总大小 
     * @return TotalSnapshotSize 快照总大小
     */
    public Long getTotalSnapshotSize() {
        return this.TotalSnapshotSize;
    }

    /**
     * Set 快照总大小
     * @param TotalSnapshotSize 快照总大小
     */
    public void setTotalSnapshotSize(Long TotalSnapshotSize) {
        this.TotalSnapshotSize = TotalSnapshotSize;
    }

    /**
     * Get 文件系统创建时间 
     * @return CreationTime 文件系统创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 文件系统创建时间
     * @param CreationTime 文件系统创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 文件系统所在区ID 
     * @return ZoneId 文件系统所在区ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 文件系统所在区ID
     * @param ZoneId 文件系统所在区ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    public FileSystemByPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileSystemByPolicy(FileSystemByPolicy source) {
        if (source.CreationToken != null) {
            this.CreationToken = new String(source.CreationToken);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.SizeByte != null) {
            this.SizeByte = new Long(source.SizeByte);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.TotalSnapshotSize != null) {
            this.TotalSnapshotSize = new Long(source.TotalSnapshotSize);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "SizeByte", this.SizeByte);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "TotalSnapshotSize", this.TotalSnapshotSize);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

