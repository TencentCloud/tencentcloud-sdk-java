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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationTaskInfo extends AbstractModel {

    /**
    * <p>迁移任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>迁移任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移</p>
    */
    @SerializedName("MigrationType")
    @Expose
    private Long MigrationType;

    /**
    * <p>迁移模式，默认为0。0: 全量迁移</p>
    */
    @SerializedName("MigrationMode")
    @Expose
    private Long MigrationMode;

    /**
    * <p>数据源桶名称</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>数据源桶地域</p>
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * <p>数据源桶地址</p>
    */
    @SerializedName("BucketAddress")
    @Expose
    private String BucketAddress;

    /**
    * <p>清单地址</p>
    */
    @SerializedName("ListAddress")
    @Expose
    private String ListAddress;

    /**
    * <p>文件系统实例名称</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>文件系统实例Id</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>文件系统内目录路径，不涉及实际挂载子目录/根目录，无需以/cfs/作为前缀</p>
    */
    @SerializedName("FsPath")
    @Expose
    private String FsPath;

    /**
    * <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p>
    */
    @SerializedName("CoverType")
    @Expose
    private Long CoverType;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>完成/终止时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>迁移状态。0: 已完成；1: 创建中；2: 运行中；3: 终止中；4: 已终止；5: 创建失败；6: 运行失败；7: 结束中；8: 删除中；9: 等待中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>文件数量</p>
    */
    @SerializedName("FileTotalCount")
    @Expose
    private Long FileTotalCount;

    /**
    * <p>已迁移文件数量</p>
    */
    @SerializedName("FileMigratedCount")
    @Expose
    private Long FileMigratedCount;

    /**
    * <p>迁移失败文件数量</p>
    */
    @SerializedName("FileFailedCount")
    @Expose
    private Long FileFailedCount;

    /**
    * <p>文件容量，单位Byte</p>
    */
    @SerializedName("FileTotalSize")
    @Expose
    private Long FileTotalSize;

    /**
    * <p>已迁移文件容量，单位Byte</p>
    */
    @SerializedName("FileMigratedSize")
    @Expose
    private Long FileMigratedSize;

    /**
    * <p>迁移失败文件容量，单位Byte</p>
    */
    @SerializedName("FileFailedSize")
    @Expose
    private Long FileFailedSize;

    /**
    * <p>全部清单</p>
    */
    @SerializedName("FileTotalList")
    @Expose
    private String FileTotalList;

    /**
    * <p>已完成文件清单</p>
    */
    @SerializedName("FileCompletedList")
    @Expose
    private String FileCompletedList;

    /**
    * <p>失败文件清单</p>
    */
    @SerializedName("FileFailedList")
    @Expose
    private String FileFailedList;

    /**
    * <p>源桶路径</p>
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

    /**
    * <p>迁移方向。0: 对象存储迁移至文件系统，1: 文件系统迁移至对象存储。默认 0</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul>
    */
    @SerializedName("SrcService")
    @Expose
    private String SrcService;

    /**
     * Get <p>迁移任务名称</p> 
     * @return TaskName <p>迁移任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>迁移任务名称</p>
     * @param TaskName <p>迁移任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>迁移任务id</p> 
     * @return TaskId <p>迁移任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>迁移任务id</p>
     * @param TaskId <p>迁移任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移</p> 
     * @return MigrationType <p>迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移</p>
     */
    public Long getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set <p>迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移</p>
     * @param MigrationType <p>迁移方式标志位，默认为0。0: 桶迁移；1: 清单迁移</p>
     */
    public void setMigrationType(Long MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get <p>迁移模式，默认为0。0: 全量迁移</p> 
     * @return MigrationMode <p>迁移模式，默认为0。0: 全量迁移</p>
     */
    public Long getMigrationMode() {
        return this.MigrationMode;
    }

    /**
     * Set <p>迁移模式，默认为0。0: 全量迁移</p>
     * @param MigrationMode <p>迁移模式，默认为0。0: 全量迁移</p>
     */
    public void setMigrationMode(Long MigrationMode) {
        this.MigrationMode = MigrationMode;
    }

    /**
     * Get <p>数据源桶名称</p> 
     * @return BucketName <p>数据源桶名称</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>数据源桶名称</p>
     * @param BucketName <p>数据源桶名称</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>数据源桶地域</p> 
     * @return BucketRegion <p>数据源桶地域</p>
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set <p>数据源桶地域</p>
     * @param BucketRegion <p>数据源桶地域</p>
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get <p>数据源桶地址</p> 
     * @return BucketAddress <p>数据源桶地址</p>
     */
    public String getBucketAddress() {
        return this.BucketAddress;
    }

    /**
     * Set <p>数据源桶地址</p>
     * @param BucketAddress <p>数据源桶地址</p>
     */
    public void setBucketAddress(String BucketAddress) {
        this.BucketAddress = BucketAddress;
    }

    /**
     * Get <p>清单地址</p> 
     * @return ListAddress <p>清单地址</p>
     */
    public String getListAddress() {
        return this.ListAddress;
    }

    /**
     * Set <p>清单地址</p>
     * @param ListAddress <p>清单地址</p>
     */
    public void setListAddress(String ListAddress) {
        this.ListAddress = ListAddress;
    }

    /**
     * Get <p>文件系统实例名称</p> 
     * @return FsName <p>文件系统实例名称</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>文件系统实例名称</p>
     * @param FsName <p>文件系统实例名称</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>文件系统实例Id</p> 
     * @return FileSystemId <p>文件系统实例Id</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统实例Id</p>
     * @param FileSystemId <p>文件系统实例Id</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>文件系统内目录路径，不涉及实际挂载子目录/根目录，无需以/cfs/作为前缀</p> 
     * @return FsPath <p>文件系统内目录路径，不涉及实际挂载子目录/根目录，无需以/cfs/作为前缀</p>
     */
    public String getFsPath() {
        return this.FsPath;
    }

    /**
     * Set <p>文件系统内目录路径，不涉及实际挂载子目录/根目录，无需以/cfs/作为前缀</p>
     * @param FsPath <p>文件系统内目录路径，不涉及实际挂载子目录/根目录，无需以/cfs/作为前缀</p>
     */
    public void setFsPath(String FsPath) {
        this.FsPath = FsPath;
    }

    /**
     * Get <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p> 
     * @return CoverType <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p>
     */
    public Long getCoverType() {
        return this.CoverType;
    }

    /**
     * Set <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p>
     * @param CoverType <p>同名文件迁移时覆盖策略，默认为0。0: 最后修改时间优先；1: 全覆盖；2: 不覆盖</p>
     */
    public void setCoverType(Long CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>完成/终止时间</p> 
     * @return EndTime <p>完成/终止时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>完成/终止时间</p>
     * @param EndTime <p>完成/终止时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>迁移状态。0: 已完成；1: 创建中；2: 运行中；3: 终止中；4: 已终止；5: 创建失败；6: 运行失败；7: 结束中；8: 删除中；9: 等待中</p> 
     * @return Status <p>迁移状态。0: 已完成；1: 创建中；2: 运行中；3: 终止中；4: 已终止；5: 创建失败；6: 运行失败；7: 结束中；8: 删除中；9: 等待中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>迁移状态。0: 已完成；1: 创建中；2: 运行中；3: 终止中；4: 已终止；5: 创建失败；6: 运行失败；7: 结束中；8: 删除中；9: 等待中</p>
     * @param Status <p>迁移状态。0: 已完成；1: 创建中；2: 运行中；3: 终止中；4: 已终止；5: 创建失败；6: 运行失败；7: 结束中；8: 删除中；9: 等待中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>文件数量</p> 
     * @return FileTotalCount <p>文件数量</p>
     */
    public Long getFileTotalCount() {
        return this.FileTotalCount;
    }

    /**
     * Set <p>文件数量</p>
     * @param FileTotalCount <p>文件数量</p>
     */
    public void setFileTotalCount(Long FileTotalCount) {
        this.FileTotalCount = FileTotalCount;
    }

    /**
     * Get <p>已迁移文件数量</p> 
     * @return FileMigratedCount <p>已迁移文件数量</p>
     */
    public Long getFileMigratedCount() {
        return this.FileMigratedCount;
    }

    /**
     * Set <p>已迁移文件数量</p>
     * @param FileMigratedCount <p>已迁移文件数量</p>
     */
    public void setFileMigratedCount(Long FileMigratedCount) {
        this.FileMigratedCount = FileMigratedCount;
    }

    /**
     * Get <p>迁移失败文件数量</p> 
     * @return FileFailedCount <p>迁移失败文件数量</p>
     */
    public Long getFileFailedCount() {
        return this.FileFailedCount;
    }

    /**
     * Set <p>迁移失败文件数量</p>
     * @param FileFailedCount <p>迁移失败文件数量</p>
     */
    public void setFileFailedCount(Long FileFailedCount) {
        this.FileFailedCount = FileFailedCount;
    }

    /**
     * Get <p>文件容量，单位Byte</p> 
     * @return FileTotalSize <p>文件容量，单位Byte</p>
     */
    public Long getFileTotalSize() {
        return this.FileTotalSize;
    }

    /**
     * Set <p>文件容量，单位Byte</p>
     * @param FileTotalSize <p>文件容量，单位Byte</p>
     */
    public void setFileTotalSize(Long FileTotalSize) {
        this.FileTotalSize = FileTotalSize;
    }

    /**
     * Get <p>已迁移文件容量，单位Byte</p> 
     * @return FileMigratedSize <p>已迁移文件容量，单位Byte</p>
     */
    public Long getFileMigratedSize() {
        return this.FileMigratedSize;
    }

    /**
     * Set <p>已迁移文件容量，单位Byte</p>
     * @param FileMigratedSize <p>已迁移文件容量，单位Byte</p>
     */
    public void setFileMigratedSize(Long FileMigratedSize) {
        this.FileMigratedSize = FileMigratedSize;
    }

    /**
     * Get <p>迁移失败文件容量，单位Byte</p> 
     * @return FileFailedSize <p>迁移失败文件容量，单位Byte</p>
     */
    public Long getFileFailedSize() {
        return this.FileFailedSize;
    }

    /**
     * Set <p>迁移失败文件容量，单位Byte</p>
     * @param FileFailedSize <p>迁移失败文件容量，单位Byte</p>
     */
    public void setFileFailedSize(Long FileFailedSize) {
        this.FileFailedSize = FileFailedSize;
    }

    /**
     * Get <p>全部清单</p> 
     * @return FileTotalList <p>全部清单</p>
     */
    public String getFileTotalList() {
        return this.FileTotalList;
    }

    /**
     * Set <p>全部清单</p>
     * @param FileTotalList <p>全部清单</p>
     */
    public void setFileTotalList(String FileTotalList) {
        this.FileTotalList = FileTotalList;
    }

    /**
     * Get <p>已完成文件清单</p> 
     * @return FileCompletedList <p>已完成文件清单</p>
     */
    public String getFileCompletedList() {
        return this.FileCompletedList;
    }

    /**
     * Set <p>已完成文件清单</p>
     * @param FileCompletedList <p>已完成文件清单</p>
     */
    public void setFileCompletedList(String FileCompletedList) {
        this.FileCompletedList = FileCompletedList;
    }

    /**
     * Get <p>失败文件清单</p> 
     * @return FileFailedList <p>失败文件清单</p>
     */
    public String getFileFailedList() {
        return this.FileFailedList;
    }

    /**
     * Set <p>失败文件清单</p>
     * @param FileFailedList <p>失败文件清单</p>
     */
    public void setFileFailedList(String FileFailedList) {
        this.FileFailedList = FileFailedList;
    }

    /**
     * Get <p>源桶路径</p> 
     * @return BucketPath <p>源桶路径</p>
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set <p>源桶路径</p>
     * @param BucketPath <p>源桶路径</p>
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
    }

    /**
     * Get <p>迁移方向。0: 对象存储迁移至文件系统，1: 文件系统迁移至对象存储。默认 0</p> 
     * @return Direction <p>迁移方向。0: 对象存储迁移至文件系统，1: 文件系统迁移至对象存储。默认 0</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>迁移方向。0: 对象存储迁移至文件系统，1: 文件系统迁移至对象存储。默认 0</p>
     * @param Direction <p>迁移方向。0: 对象存储迁移至文件系统，1: 文件系统迁移至对象存储。默认 0</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul> 
     * @return SrcService <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul>
     */
    public String getSrcService() {
        return this.SrcService;
    }

    /**
     * Set <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul>
     * @param SrcService <p>数据源服务商</p><p>枚举值：</p><ul><li>COS： 腾讯云COS</li><li>OSS： 阿里云OSS</li><li>OBS： 华为云OBS</li><li>BOS： 百度云BOS</li><li>TOS： 火山引擎TOS</li></ul>
     */
    public void setSrcService(String SrcService) {
        this.SrcService = SrcService;
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
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.SrcService != null) {
            this.SrcService = new String(source.SrcService);
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
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "SrcService", this.SrcService);

    }
}

