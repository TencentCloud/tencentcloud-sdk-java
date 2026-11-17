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

public class FullBackupSetDetail extends AbstractModel {

    /**
    * <p>备份集 ID。</p>
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * <p>源实例信息。</p>
    */
    @SerializedName("SourceInfo")
    @Expose
    private String SourceInfo;

    /**
    * <p>备份集状态。可能的取值为："running" - 运行中;"finished" - 已完成;"failed" - 已失败;"stopped" - 已终止。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间。格式为 YYYY-MM-DD hh:mm:ss。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>过期时间。格式为 YYYY-MM-DD hh:mm:ss。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>备份集大小，单位为 Bytes。</p>
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>备份方式。可能的取值为："logical" - 逻辑备份；"physical" - 物理备份。</p>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>备份池类型。目前仅支持 "DefaultPool"，即默认存储池。</p>
    */
    @SerializedName("BackupPool")
    @Expose
    private String BackupPool;

    /**
    * <p>备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。</p>
    */
    @SerializedName("RetentionType")
    @Expose
    private String RetentionType;

    /**
    * <p>备份集存储状态详情。</p>
    */
    @SerializedName("ResourceDetail")
    @Expose
    private ResourceDetail ResourceDetail;

    /**
    * 备份源实例信息。
    */
    @SerializedName("SourceEndpoint")
    @Expose
    private Endpoint SourceEndpoint;

    /**
    * 备份对象。
    */
    @SerializedName("BackupObject")
    @Expose
    private BackupObject BackupObject;

    /**
    * 备份进度。
    */
    @SerializedName("Progress")
    @Expose
    private FullBackupProgress Progress;

    /**
    * 备份错误信息。备份失败时有值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private FullBackupErrorMessage ErrorMessage;

    /**
    * 备份集加密信息。
    */
    @SerializedName("BackupSetOption")
    @Expose
    private BackupSetOption BackupSetOption;

    /**
     * Get <p>备份集 ID。</p> 
     * @return BackupSetId <p>备份集 ID。</p>
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set <p>备份集 ID。</p>
     * @param BackupSetId <p>备份集 ID。</p>
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get <p>源实例信息。</p> 
     * @return SourceInfo <p>源实例信息。</p>
     */
    public String getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>源实例信息。</p>
     * @param SourceInfo <p>源实例信息。</p>
     */
    public void setSourceInfo(String SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get <p>备份集状态。可能的取值为："running" - 运行中;"finished" - 已完成;"failed" - 已失败;"stopped" - 已终止。</p> 
     * @return Status <p>备份集状态。可能的取值为："running" - 运行中;"finished" - 已完成;"failed" - 已失败;"stopped" - 已终止。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份集状态。可能的取值为："running" - 运行中;"finished" - 已完成;"failed" - 已失败;"stopped" - 已终止。</p>
     * @param Status <p>备份集状态。可能的取值为："running" - 运行中;"finished" - 已完成;"failed" - 已失败;"stopped" - 已终止。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间。格式为 YYYY-MM-DD hh:mm:ss。</p> 
     * @return StartTime <p>创建时间。格式为 YYYY-MM-DD hh:mm:ss。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>创建时间。格式为 YYYY-MM-DD hh:mm:ss。</p>
     * @param StartTime <p>创建时间。格式为 YYYY-MM-DD hh:mm:ss。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。</p> 
     * @return EndTime <p>结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。</p>
     * @param EndTime <p>结束时间。格式为 YYYY-MM-DD hh:mm:ss，备份集尚未结束时返回 0000-00-00 00:00:00。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>过期时间。格式为 YYYY-MM-DD hh:mm:ss。</p> 
     * @return ExpireTime <p>过期时间。格式为 YYYY-MM-DD hh:mm:ss。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间。格式为 YYYY-MM-DD hh:mm:ss。</p>
     * @param ExpireTime <p>过期时间。格式为 YYYY-MM-DD hh:mm:ss。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>备份集大小，单位为 Bytes。</p> 
     * @return BackupSize <p>备份集大小，单位为 Bytes。</p>
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>备份集大小，单位为 Bytes。</p>
     * @param BackupSize <p>备份集大小，单位为 Bytes。</p>
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>备份方式。可能的取值为："logical" - 逻辑备份；"physical" - 物理备份。</p> 
     * @return BackupMethod <p>备份方式。可能的取值为："logical" - 逻辑备份；"physical" - 物理备份。</p>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式。可能的取值为："logical" - 逻辑备份；"physical" - 物理备份。</p>
     * @param BackupMethod <p>备份方式。可能的取值为："logical" - 逻辑备份；"physical" - 物理备份。</p>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。</p> 
     * @return StorageType <p>存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。</p>
     * @param StorageType <p>存储类型。目前仅支持 "DBSStorage"，即 DBS 内置存储。</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>备份池类型。目前仅支持 "DefaultPool"，即默认存储池。</p> 
     * @return BackupPool <p>备份池类型。目前仅支持 "DefaultPool"，即默认存储池。</p>
     */
    public String getBackupPool() {
        return this.BackupPool;
    }

    /**
     * Set <p>备份池类型。目前仅支持 "DefaultPool"，即默认存储池。</p>
     * @param BackupPool <p>备份池类型。目前仅支持 "DefaultPool"，即默认存储池。</p>
     */
    public void setBackupPool(String BackupPool) {
        this.BackupPool = BackupPool;
    }

    /**
     * Get <p>备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。</p> 
     * @return RetentionType <p>备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。</p>
     */
    public String getRetentionType() {
        return this.RetentionType;
    }

    /**
     * Set <p>备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。</p>
     * @param RetentionType <p>备份集存储类型。支持的取值范围为："standard" - 标准存储；"tiered" - 分级存储。</p>
     */
    public void setRetentionType(String RetentionType) {
        this.RetentionType = RetentionType;
    }

    /**
     * Get <p>备份集存储状态详情。</p> 
     * @return ResourceDetail <p>备份集存储状态详情。</p>
     */
    public ResourceDetail getResourceDetail() {
        return this.ResourceDetail;
    }

    /**
     * Set <p>备份集存储状态详情。</p>
     * @param ResourceDetail <p>备份集存储状态详情。</p>
     */
    public void setResourceDetail(ResourceDetail ResourceDetail) {
        this.ResourceDetail = ResourceDetail;
    }

    /**
     * Get 备份源实例信息。 
     * @return SourceEndpoint 备份源实例信息。
     */
    public Endpoint getSourceEndpoint() {
        return this.SourceEndpoint;
    }

    /**
     * Set 备份源实例信息。
     * @param SourceEndpoint 备份源实例信息。
     */
    public void setSourceEndpoint(Endpoint SourceEndpoint) {
        this.SourceEndpoint = SourceEndpoint;
    }

    /**
     * Get 备份对象。 
     * @return BackupObject 备份对象。
     */
    public BackupObject getBackupObject() {
        return this.BackupObject;
    }

    /**
     * Set 备份对象。
     * @param BackupObject 备份对象。
     */
    public void setBackupObject(BackupObject BackupObject) {
        this.BackupObject = BackupObject;
    }

    /**
     * Get 备份进度。 
     * @return Progress 备份进度。
     */
    public FullBackupProgress getProgress() {
        return this.Progress;
    }

    /**
     * Set 备份进度。
     * @param Progress 备份进度。
     */
    public void setProgress(FullBackupProgress Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 备份错误信息。备份失败时有值。 
     * @return ErrorMessage 备份错误信息。备份失败时有值。
     */
    public FullBackupErrorMessage getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 备份错误信息。备份失败时有值。
     * @param ErrorMessage 备份错误信息。备份失败时有值。
     */
    public void setErrorMessage(FullBackupErrorMessage ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 备份集加密信息。 
     * @return BackupSetOption 备份集加密信息。
     */
    public BackupSetOption getBackupSetOption() {
        return this.BackupSetOption;
    }

    /**
     * Set 备份集加密信息。
     * @param BackupSetOption 备份集加密信息。
     */
    public void setBackupSetOption(BackupSetOption BackupSetOption) {
        this.BackupSetOption = BackupSetOption;
    }

    public FullBackupSetDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FullBackupSetDetail(FullBackupSetDetail source) {
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
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
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
            this.ResourceDetail = new ResourceDetail(source.ResourceDetail);
        }
        if (source.SourceEndpoint != null) {
            this.SourceEndpoint = new Endpoint(source.SourceEndpoint);
        }
        if (source.BackupObject != null) {
            this.BackupObject = new BackupObject(source.BackupObject);
        }
        if (source.Progress != null) {
            this.Progress = new FullBackupProgress(source.Progress);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new FullBackupErrorMessage(source.ErrorMessage);
        }
        if (source.BackupSetOption != null) {
            this.BackupSetOption = new BackupSetOption(source.BackupSetOption);
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
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "BackupPool", this.BackupPool);
        this.setParamSimple(map, prefix + "RetentionType", this.RetentionType);
        this.setParamObj(map, prefix + "ResourceDetail.", this.ResourceDetail);
        this.setParamObj(map, prefix + "SourceEndpoint.", this.SourceEndpoint);
        this.setParamObj(map, prefix + "BackupObject.", this.BackupObject);
        this.setParamObj(map, prefix + "Progress.", this.Progress);
        this.setParamObj(map, prefix + "ErrorMessage.", this.ErrorMessage);
        this.setParamObj(map, prefix + "BackupSetOption.", this.BackupSetOption);

    }
}

