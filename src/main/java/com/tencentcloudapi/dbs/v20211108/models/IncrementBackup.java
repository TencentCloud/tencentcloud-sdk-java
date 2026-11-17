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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementBackup extends AbstractModel {

    /**
    * 备份集 ID。
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * 源实例信息。
    */
    @SerializedName("SourceInfo")
    @Expose
    private String SourceInfo;

    /**
    * 备份集状态。可能的取值为：
"running" - 运行中;
"finished" - 已完成;
"failed" - 已失败;
"stopped" - 已终止。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 开始时间。格式为 YYYY-MM-DD hh:mm:ss。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 过期时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未生成过期时间时返回空字符串。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 备份集文件个数。
    */
    @SerializedName("FileCount")
    @Expose
    private Long FileCount;

    /**
    * 备份方式。可能的取值为：
"logical" - 逻辑备份；
"physical" - 物理备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 备份池类型。目前仅支持 "DefaultPool"，即默认存储池。
    */
    @SerializedName("BackupPool")
    @Expose
    private String BackupPool;

    /**
    * 备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。
    */
    @SerializedName("RetentionType")
    @Expose
    private String RetentionType;

    /**
    * 备份集存储状态详情。
    */
    @SerializedName("ResourceDetail")
    @Expose
    private ResourceItemDetail ResourceDetail;

    /**
     * Get 备份集 ID。 
     * @return BackupSetId 备份集 ID。
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set 备份集 ID。
     * @param BackupSetId 备份集 ID。
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get 源实例信息。 
     * @return SourceInfo 源实例信息。
     */
    public String getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 源实例信息。
     * @param SourceInfo 源实例信息。
     */
    public void setSourceInfo(String SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get 备份集状态。可能的取值为：
"running" - 运行中;
"finished" - 已完成;
"failed" - 已失败;
"stopped" - 已终止。 
     * @return Status 备份集状态。可能的取值为：
"running" - 运行中;
"finished" - 已完成;
"failed" - 已失败;
"stopped" - 已终止。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 备份集状态。可能的取值为：
"running" - 运行中;
"finished" - 已完成;
"failed" - 已失败;
"stopped" - 已终止。
     * @param Status 备份集状态。可能的取值为：
"running" - 运行中;
"finished" - 已完成;
"failed" - 已失败;
"stopped" - 已终止。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 开始时间。格式为 YYYY-MM-DD hh:mm:ss。 
     * @return StartTime 开始时间。格式为 YYYY-MM-DD hh:mm:ss。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。格式为 YYYY-MM-DD hh:mm:ss。
     * @param StartTime 开始时间。格式为 YYYY-MM-DD hh:mm:ss。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。 
     * @return EndTime 结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。
     * @param EndTime 结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 过期时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未生成过期时间时返回空字符串。 
     * @return ExpireTime 过期时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未生成过期时间时返回空字符串。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未生成过期时间时返回空字符串。
     * @param ExpireTime 过期时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未生成过期时间时返回空字符串。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 备份集文件个数。 
     * @return FileCount 备份集文件个数。
     */
    public Long getFileCount() {
        return this.FileCount;
    }

    /**
     * Set 备份集文件个数。
     * @param FileCount 备份集文件个数。
     */
    public void setFileCount(Long FileCount) {
        this.FileCount = FileCount;
    }

    /**
     * Get 备份方式。可能的取值为：
"logical" - 逻辑备份；
"physical" - 物理备份。 
     * @return BackupMethod 备份方式。可能的取值为：
"logical" - 逻辑备份；
"physical" - 物理备份。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式。可能的取值为：
"logical" - 逻辑备份；
"physical" - 物理备份。
     * @param BackupMethod 备份方式。可能的取值为：
"logical" - 逻辑备份；
"physical" - 物理备份。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。 
     * @return StorageType 存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。
     * @param StorageType 存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 备份池类型。目前仅支持 "DefaultPool"，即默认存储池。 
     * @return BackupPool 备份池类型。目前仅支持 "DefaultPool"，即默认存储池。
     */
    public String getBackupPool() {
        return this.BackupPool;
    }

    /**
     * Set 备份池类型。目前仅支持 "DefaultPool"，即默认存储池。
     * @param BackupPool 备份池类型。目前仅支持 "DefaultPool"，即默认存储池。
     */
    public void setBackupPool(String BackupPool) {
        this.BackupPool = BackupPool;
    }

    /**
     * Get 备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。 
     * @return RetentionType 备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。
     */
    public String getRetentionType() {
        return this.RetentionType;
    }

    /**
     * Set 备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。
     * @param RetentionType 备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。
     */
    public void setRetentionType(String RetentionType) {
        this.RetentionType = RetentionType;
    }

    /**
     * Get 备份集存储状态详情。 
     * @return ResourceDetail 备份集存储状态详情。
     */
    public ResourceItemDetail getResourceDetail() {
        return this.ResourceDetail;
    }

    /**
     * Set 备份集存储状态详情。
     * @param ResourceDetail 备份集存储状态详情。
     */
    public void setResourceDetail(ResourceItemDetail ResourceDetail) {
        this.ResourceDetail = ResourceDetail;
    }

    public IncrementBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementBackup(IncrementBackup source) {
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new String(source.SourceInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.FileCount != null) {
            this.FileCount = new Long(source.FileCount);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.BackupPool != null) {
            this.BackupPool = new String(source.BackupPool);
        }
        if (source.RetentionType != null) {
            this.RetentionType = new String(source.RetentionType);
        }
        if (source.ResourceDetail != null) {
            this.ResourceDetail = new ResourceItemDetail(source.ResourceDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "SourceInfo", this.SourceInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FileCount", this.FileCount);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "BackupPool", this.BackupPool);
        this.setParamSimple(map, prefix + "RetentionType", this.RetentionType);
        this.setParamObj(map, prefix + "ResourceDetail.", this.ResourceDetail);

    }
}

