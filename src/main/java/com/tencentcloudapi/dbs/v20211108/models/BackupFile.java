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

public class BackupFile extends AbstractModel {

    /**
    * 文件名。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 备份集 ID。
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * 文件状态。取值：
- notReady：未就绪
- backuping：备份中
- finished：备份完成
- failed：备份失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 源库连接信息。云数据库实例为实例 ID，其余为 ip:port。
    */
    @SerializedName("SourceInfo")
    @Expose
    private String SourceInfo;

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
    * 过期时间。格式为 YYYY-MM-DD hh:mm:ss。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 文件大小，单位：字节。
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * 备份方式。取值：logical（逻辑备份）。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 存储类型。取值：DBSStorage（内置存储）。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
    */
    @SerializedName("RetentionType")
    @Expose
    private String RetentionType;

    /**
    * 备份集存储详情。
    */
    @SerializedName("ResourceDetail")
    @Expose
    private ResourceDetail ResourceDetail;

    /**
    * 备份池。
    */
    @SerializedName("BackupPool")
    @Expose
    private String BackupPool;

    /**
    * 当前状态下允许的操作。取值：download。
    */
    @SerializedName("AllowedActions")
    @Expose
    private String [] AllowedActions;

    /**
    * 支持的全部操作。
    */
    @SerializedName("AllActions")
    @Expose
    private String [] AllActions;

    /**
    * 文件最后修改时间。格式为 YYYY-MM-DD hh:mm:ss。
    */
    @SerializedName("LastModified")
    @Expose
    private String LastModified;

    /**
     * Get 文件名。 
     * @return FileName 文件名。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名。
     * @param FileName 文件名。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

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
     * Get 文件状态。取值：
- notReady：未就绪
- backuping：备份中
- finished：备份完成
- failed：备份失败 
     * @return Status 文件状态。取值：
- notReady：未就绪
- backuping：备份中
- finished：备份完成
- failed：备份失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 文件状态。取值：
- notReady：未就绪
- backuping：备份中
- finished：备份完成
- failed：备份失败
     * @param Status 文件状态。取值：
- notReady：未就绪
- backuping：备份中
- finished：备份完成
- failed：备份失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 源库连接信息。云数据库实例为实例 ID，其余为 ip:port。 
     * @return SourceInfo 源库连接信息。云数据库实例为实例 ID，其余为 ip:port。
     */
    public String getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 源库连接信息。云数据库实例为实例 ID，其余为 ip:port。
     * @param SourceInfo 源库连接信息。云数据库实例为实例 ID，其余为 ip:port。
     */
    public void setSourceInfo(String SourceInfo) {
        this.SourceInfo = SourceInfo;
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
     * Get 过期时间。格式为 YYYY-MM-DD hh:mm:ss。 
     * @return ExpireTime 过期时间。格式为 YYYY-MM-DD hh:mm:ss。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间。格式为 YYYY-MM-DD hh:mm:ss。
     * @param ExpireTime 过期时间。格式为 YYYY-MM-DD hh:mm:ss。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 文件大小，单位：字节。 
     * @return BackupSize 文件大小，单位：字节。
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set 文件大小，单位：字节。
     * @param BackupSize 文件大小，单位：字节。
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get 备份方式。取值：logical（逻辑备份）。 
     * @return BackupMethod 备份方式。取值：logical（逻辑备份）。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式。取值：logical（逻辑备份）。
     * @param BackupMethod 备份方式。取值：logical（逻辑备份）。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 存储类型。取值：DBSStorage（内置存储）。 
     * @return StorageType 存储类型。取值：DBSStorage（内置存储）。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型。取值：DBSStorage（内置存储）。
     * @param StorageType 存储类型。取值：DBSStorage（内置存储）。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储 
     * @return RetentionType 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
     */
    public String getRetentionType() {
        return this.RetentionType;
    }

    /**
     * Set 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
     * @param RetentionType 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
     */
    public void setRetentionType(String RetentionType) {
        this.RetentionType = RetentionType;
    }

    /**
     * Get 备份集存储详情。 
     * @return ResourceDetail 备份集存储详情。
     */
    public ResourceDetail getResourceDetail() {
        return this.ResourceDetail;
    }

    /**
     * Set 备份集存储详情。
     * @param ResourceDetail 备份集存储详情。
     */
    public void setResourceDetail(ResourceDetail ResourceDetail) {
        this.ResourceDetail = ResourceDetail;
    }

    /**
     * Get 备份池。 
     * @return BackupPool 备份池。
     */
    public String getBackupPool() {
        return this.BackupPool;
    }

    /**
     * Set 备份池。
     * @param BackupPool 备份池。
     */
    public void setBackupPool(String BackupPool) {
        this.BackupPool = BackupPool;
    }

    /**
     * Get 当前状态下允许的操作。取值：download。 
     * @return AllowedActions 当前状态下允许的操作。取值：download。
     */
    public String [] getAllowedActions() {
        return this.AllowedActions;
    }

    /**
     * Set 当前状态下允许的操作。取值：download。
     * @param AllowedActions 当前状态下允许的操作。取值：download。
     */
    public void setAllowedActions(String [] AllowedActions) {
        this.AllowedActions = AllowedActions;
    }

    /**
     * Get 支持的全部操作。 
     * @return AllActions 支持的全部操作。
     */
    public String [] getAllActions() {
        return this.AllActions;
    }

    /**
     * Set 支持的全部操作。
     * @param AllActions 支持的全部操作。
     */
    public void setAllActions(String [] AllActions) {
        this.AllActions = AllActions;
    }

    /**
     * Get 文件最后修改时间。格式为 YYYY-MM-DD hh:mm:ss。 
     * @return LastModified 文件最后修改时间。格式为 YYYY-MM-DD hh:mm:ss。
     */
    public String getLastModified() {
        return this.LastModified;
    }

    /**
     * Set 文件最后修改时间。格式为 YYYY-MM-DD hh:mm:ss。
     * @param LastModified 文件最后修改时间。格式为 YYYY-MM-DD hh:mm:ss。
     */
    public void setLastModified(String LastModified) {
        this.LastModified = LastModified;
    }

    public BackupFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupFile(BackupFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new String(source.SourceInfo);
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
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.RetentionType != null) {
            this.RetentionType = new String(source.RetentionType);
        }
        if (source.ResourceDetail != null) {
            this.ResourceDetail = new ResourceDetail(source.ResourceDetail);
        }
        if (source.BackupPool != null) {
            this.BackupPool = new String(source.BackupPool);
        }
        if (source.AllowedActions != null) {
            this.AllowedActions = new String[source.AllowedActions.length];
            for (int i = 0; i < source.AllowedActions.length; i++) {
                this.AllowedActions[i] = new String(source.AllowedActions[i]);
            }
        }
        if (source.AllActions != null) {
            this.AllActions = new String[source.AllActions.length];
            for (int i = 0; i < source.AllActions.length; i++) {
                this.AllActions[i] = new String(source.AllActions[i]);
            }
        }
        if (source.LastModified != null) {
            this.LastModified = new String(source.LastModified);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SourceInfo", this.SourceInfo);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "RetentionType", this.RetentionType);
        this.setParamObj(map, prefix + "ResourceDetail.", this.ResourceDetail);
        this.setParamSimple(map, prefix + "BackupPool", this.BackupPool);
        this.setParamArraySimple(map, prefix + "AllowedActions.", this.AllowedActions);
        this.setParamArraySimple(map, prefix + "AllActions.", this.AllActions);
        this.setParamSimple(map, prefix + "LastModified", this.LastModified);

    }
}

