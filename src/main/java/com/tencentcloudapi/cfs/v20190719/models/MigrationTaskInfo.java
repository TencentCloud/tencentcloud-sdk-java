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

public class MigrationTaskInfo extends AbstractModel{

    /**
    * 迁移任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 迁移任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移
    */
    @SerializedName("MigrationType")
    @Expose
    private Long MigrationType;

    /**
    * 迁移模式，默认为0。0: 全量迁移
    */
    @SerializedName("MigrationMode")
    @Expose
    private Long MigrationMode;

    /**
    * 数据源桶名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 数据源桶地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 数据源桶地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketAddress")
    @Expose
    private String BucketAddress;

    /**
    * 清单地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListAddress")
    @Expose
    private String ListAddress;

    /**
    * 文件系统实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * 文件系统实例Id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 文件系统路径
    */
    @SerializedName("FsPath")
    @Expose
    private String FsPath;

    /**
    * 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖
    */
    @SerializedName("CoverType")
    @Expose
    private Long CoverType;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 完成/终止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 迁移状态。0: 已完成；1: 进行中；2: 已终止
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 文件数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileTotalCount")
    @Expose
    private Long FileTotalCount;

    /**
    * 已迁移文件数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMigratedCount")
    @Expose
    private Long FileMigratedCount;

    /**
    * 迁移失败文件数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileFailedCount")
    @Expose
    private Long FileFailedCount;

    /**
    * 文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileTotalSize")
    @Expose
    private Long FileTotalSize;

    /**
    * 已迁移文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMigratedSize")
    @Expose
    private Long FileMigratedSize;

    /**
    * 迁移失败文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileFailedSize")
    @Expose
    private Long FileFailedSize;

    /**
    * 全部清单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileTotalList")
    @Expose
    private String FileTotalList;

    /**
    * 已完成文件清单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileCompletedList")
    @Expose
    private String FileCompletedList;

    /**
    * 失败文件清单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileFailedList")
    @Expose
    private String FileFailedList;

    /**
    * 源桶路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

    /**
     * Get 迁移任务名称 
     * @return TaskName 迁移任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 迁移任务名称
     * @param TaskName 迁移任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 迁移任务id 
     * @return TaskId 迁移任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 迁移任务id
     * @param TaskId 迁移任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移 
     * @return MigrationType 迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移
     */
    public Long getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set 迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移
     * @param MigrationType 迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移
     */
    public void setMigrationType(Long MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get 迁移模式，默认为0。0: 全量迁移 
     * @return MigrationMode 迁移模式，默认为0。0: 全量迁移
     */
    public Long getMigrationMode() {
        return this.MigrationMode;
    }

    /**
     * Set 迁移模式，默认为0。0: 全量迁移
     * @param MigrationMode 迁移模式，默认为0。0: 全量迁移
     */
    public void setMigrationMode(Long MigrationMode) {
        this.MigrationMode = MigrationMode;
    }

    /**
     * Get 数据源桶名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketName 数据源桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 数据源桶名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketName 数据源桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 数据源桶地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketRegion 数据源桶地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 数据源桶地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketRegion 数据源桶地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 数据源桶地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketAddress 数据源桶地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketAddress() {
        return this.BucketAddress;
    }

    /**
     * Set 数据源桶地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketAddress 数据源桶地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketAddress(String BucketAddress) {
        this.BucketAddress = BucketAddress;
    }

    /**
     * Get 清单地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListAddress 清单地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListAddress() {
        return this.ListAddress;
    }

    /**
     * Set 清单地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListAddress 清单地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListAddress(String ListAddress) {
        this.ListAddress = ListAddress;
    }

    /**
     * Get 文件系统实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FsName 文件系统实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set 文件系统实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FsName 文件系统实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get 文件系统实例Id 
     * @return FileSystemId 文件系统实例Id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统实例Id
     * @param FileSystemId 文件系统实例Id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 文件系统路径 
     * @return FsPath 文件系统路径
     */
    public String getFsPath() {
        return this.FsPath;
    }

    /**
     * Set 文件系统路径
     * @param FsPath 文件系统路径
     */
    public void setFsPath(String FsPath) {
        this.FsPath = FsPath;
    }

    /**
     * Get 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖 
     * @return CoverType 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖
     */
    public Long getCoverType() {
        return this.CoverType;
    }

    /**
     * Set 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖
     * @param CoverType 同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖
     */
    public void setCoverType(Long CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 完成/终止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 完成/终止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 完成/终止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 完成/终止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 迁移状态。0: 已完成；1: 进行中；2: 已终止 
     * @return Status 迁移状态。0: 已完成；1: 进行中；2: 已终止
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 迁移状态。0: 已完成；1: 进行中；2: 已终止
     * @param Status 迁移状态。0: 已完成；1: 进行中；2: 已终止
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 文件数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileTotalCount 文件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileTotalCount() {
        return this.FileTotalCount;
    }

    /**
     * Set 文件数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileTotalCount 文件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileTotalCount(Long FileTotalCount) {
        this.FileTotalCount = FileTotalCount;
    }

    /**
     * Get 已迁移文件数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMigratedCount 已迁移文件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileMigratedCount() {
        return this.FileMigratedCount;
    }

    /**
     * Set 已迁移文件数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMigratedCount 已迁移文件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMigratedCount(Long FileMigratedCount) {
        this.FileMigratedCount = FileMigratedCount;
    }

    /**
     * Get 迁移失败文件数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileFailedCount 迁移失败文件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileFailedCount() {
        return this.FileFailedCount;
    }

    /**
     * Set 迁移失败文件数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileFailedCount 迁移失败文件数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileFailedCount(Long FileFailedCount) {
        this.FileFailedCount = FileFailedCount;
    }

    /**
     * Get 文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileTotalSize 文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileTotalSize() {
        return this.FileTotalSize;
    }

    /**
     * Set 文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileTotalSize 文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileTotalSize(Long FileTotalSize) {
        this.FileTotalSize = FileTotalSize;
    }

    /**
     * Get 已迁移文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMigratedSize 已迁移文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileMigratedSize() {
        return this.FileMigratedSize;
    }

    /**
     * Set 已迁移文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMigratedSize 已迁移文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMigratedSize(Long FileMigratedSize) {
        this.FileMigratedSize = FileMigratedSize;
    }

    /**
     * Get 迁移失败文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileFailedSize 迁移失败文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileFailedSize() {
        return this.FileFailedSize;
    }

    /**
     * Set 迁移失败文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileFailedSize 迁移失败文件容量，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileFailedSize(Long FileFailedSize) {
        this.FileFailedSize = FileFailedSize;
    }

    /**
     * Get 全部清单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileTotalList 全部清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileTotalList() {
        return this.FileTotalList;
    }

    /**
     * Set 全部清单
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileTotalList 全部清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileTotalList(String FileTotalList) {
        this.FileTotalList = FileTotalList;
    }

    /**
     * Get 已完成文件清单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileCompletedList 已完成文件清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileCompletedList() {
        return this.FileCompletedList;
    }

    /**
     * Set 已完成文件清单
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileCompletedList 已完成文件清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileCompletedList(String FileCompletedList) {
        this.FileCompletedList = FileCompletedList;
    }

    /**
     * Get 失败文件清单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileFailedList 失败文件清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileFailedList() {
        return this.FileFailedList;
    }

    /**
     * Set 失败文件清单
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileFailedList 失败文件清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileFailedList(String FileFailedList) {
        this.FileFailedList = FileFailedList;
    }

    /**
     * Get 源桶路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketPath 源桶路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set 源桶路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketPath 源桶路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
    }

    public MigrationTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationTaskInfo(MigrationTaskInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.MigrationType != null) {
            this.MigrationType = new Long(source.MigrationType);
        }
        if (source.MigrationMode != null) {
            this.MigrationMode = new Long(source.MigrationMode);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketAddress != null) {
            this.BucketAddress = new String(source.BucketAddress);
        }
        if (source.ListAddress != null) {
            this.ListAddress = new String(source.ListAddress);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FsPath != null) {
            this.FsPath = new String(source.FsPath);
        }
        if (source.CoverType != null) {
            this.CoverType = new Long(source.CoverType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FileTotalCount != null) {
            this.FileTotalCount = new Long(source.FileTotalCount);
        }
        if (source.FileMigratedCount != null) {
            this.FileMigratedCount = new Long(source.FileMigratedCount);
        }
        if (source.FileFailedCount != null) {
            this.FileFailedCount = new Long(source.FileFailedCount);
        }
        if (source.FileTotalSize != null) {
            this.FileTotalSize = new Long(source.FileTotalSize);
        }
        if (source.FileMigratedSize != null) {
            this.FileMigratedSize = new Long(source.FileMigratedSize);
        }
        if (source.FileFailedSize != null) {
            this.FileFailedSize = new Long(source.FileFailedSize);
        }
        if (source.FileTotalList != null) {
            this.FileTotalList = new String(source.FileTotalList);
        }
        if (source.FileCompletedList != null) {
            this.FileCompletedList = new String(source.FileCompletedList);
        }
        if (source.FileFailedList != null) {
            this.FileFailedList = new String(source.FileFailedList);
        }
        if (source.BucketPath != null) {
            this.BucketPath = new String(source.BucketPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "MigrationType", this.MigrationType);
        this.setParamSimple(map, prefix + "MigrationMode", this.MigrationMode);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketAddress", this.BucketAddress);
        this.setParamSimple(map, prefix + "ListAddress", this.ListAddress);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FsPath", this.FsPath);
        this.setParamSimple(map, prefix + "CoverType", this.CoverType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileTotalCount", this.FileTotalCount);
        this.setParamSimple(map, prefix + "FileMigratedCount", this.FileMigratedCount);
        this.setParamSimple(map, prefix + "FileFailedCount", this.FileFailedCount);
        this.setParamSimple(map, prefix + "FileTotalSize", this.FileTotalSize);
        this.setParamSimple(map, prefix + "FileMigratedSize", this.FileMigratedSize);
        this.setParamSimple(map, prefix + "FileFailedSize", this.FileFailedSize);
        this.setParamSimple(map, prefix + "FileTotalList", this.FileTotalList);
        this.setParamSimple(map, prefix + "FileCompletedList", this.FileCompletedList);
        this.setParamSimple(map, prefix + "FileFailedList", this.FileFailedList);
        this.setParamSimple(map, prefix + "BucketPath", this.BucketPath);

    }
}

