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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Backup extends AbstractModel {

    /**
    * 文件名，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小，单位 KB，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 备份开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 内网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * 外网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
    * 备份文件唯一标识，RestoreInstance接口会用到该字段，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取可回档的ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 备份文件状态（0-创建中；1-成功；2-失败）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 多库备份时的DB列表
    */
    @SerializedName("DBs")
    @Expose
    private String [] DBs;

    /**
    * 备份策略（0-实例备份；1-多库备份）
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线
    */
    @SerializedName("StorageStrategy")
    @Expose
    private Long StorageStrategy;

    /**
    * 备份方式，0-定时备份；1-手动临时备份；2-定期备份
    */
    @SerializedName("BackupWay")
    @Expose
    private Long BackupWay;

    /**
    * 备份任务名称，可自定义
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 聚合Id，对于打包备份文件不返回此值。通过此值调用DescribeBackupFiles接口，获取单库备份文件的详细信息
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 备份文件形式（pkg-打包备份文件，single-单库备份文件）
    */
    @SerializedName("BackupFormat")
    @Expose
    private String BackupFormat;

    /**
    * 实例当前地域Code
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 跨地域备份的目的地域下载链接
    */
    @SerializedName("CrossBackupAddr")
    @Expose
    private CrossBackupAddr [] CrossBackupAddr;

    /**
    * 跨地域备份的目标地域和备份状态
    */
    @SerializedName("CrossBackupStatus")
    @Expose
    private CrossRegionStatus [] CrossBackupStatus;

    /**
     * Get 文件名，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件名 
     * @return FileName 文件名，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件名
     * @param FileName 文件名，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小，单位 KB，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件大小 
     * @return Size 文件大小，单位 KB，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小，单位 KB，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件大小
     * @param Size 文件大小，单位 KB，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 备份开始时间 
     * @return StartTime 备份开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间
     * @param StartTime 备份开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份结束时间 
     * @return EndTime 备份结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份结束时间
     * @param EndTime 备份结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 内网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址 
     * @return InternalAddr 内网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * Set 内网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址
     * @param InternalAddr 内网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * Get 外网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址 
     * @return ExternalAddr 外网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * Set 外网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址
     * @param ExternalAddr 外网下载地址，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取下载地址
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * Get 备份文件唯一标识，RestoreInstance接口会用到该字段，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取可回档的ID 
     * @return Id 备份文件唯一标识，RestoreInstance接口会用到该字段，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取可回档的ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 备份文件唯一标识，RestoreInstance接口会用到该字段，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取可回档的ID
     * @param Id 备份文件唯一标识，RestoreInstance接口会用到该字段，对于单库备份文件不返回此值；单库备份文件通过DescribeBackupFiles接口获取可回档的ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 备份文件状态（0-创建中；1-成功；2-失败） 
     * @return Status 备份文件状态（0-创建中；1-成功；2-失败）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 备份文件状态（0-创建中；1-成功；2-失败）
     * @param Status 备份文件状态（0-创建中；1-成功；2-失败）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 多库备份时的DB列表 
     * @return DBs 多库备份时的DB列表
     */
    public String [] getDBs() {
        return this.DBs;
    }

    /**
     * Set 多库备份时的DB列表
     * @param DBs 多库备份时的DB列表
     */
    public void setDBs(String [] DBs) {
        this.DBs = DBs;
    }

    /**
     * Get 备份策略（0-实例备份；1-多库备份） 
     * @return Strategy 备份策略（0-实例备份；1-多库备份）
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 备份策略（0-实例备份；1-多库备份）
     * @param Strategy 备份策略（0-实例备份；1-多库备份）
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线 
     * @return StorageStrategy 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线
     */
    public Long getStorageStrategy() {
        return this.StorageStrategy;
    }

    /**
     * Set 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线
     * @param StorageStrategy 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线
     */
    public void setStorageStrategy(Long StorageStrategy) {
        this.StorageStrategy = StorageStrategy;
    }

    /**
     * Get 备份方式，0-定时备份；1-手动临时备份；2-定期备份 
     * @return BackupWay 备份方式，0-定时备份；1-手动临时备份；2-定期备份
     */
    public Long getBackupWay() {
        return this.BackupWay;
    }

    /**
     * Set 备份方式，0-定时备份；1-手动临时备份；2-定期备份
     * @param BackupWay 备份方式，0-定时备份；1-手动临时备份；2-定期备份
     */
    public void setBackupWay(Long BackupWay) {
        this.BackupWay = BackupWay;
    }

    /**
     * Get 备份任务名称，可自定义 
     * @return BackupName 备份任务名称，可自定义
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份任务名称，可自定义
     * @param BackupName 备份任务名称，可自定义
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 聚合Id，对于打包备份文件不返回此值。通过此值调用DescribeBackupFiles接口，获取单库备份文件的详细信息 
     * @return GroupId 聚合Id，对于打包备份文件不返回此值。通过此值调用DescribeBackupFiles接口，获取单库备份文件的详细信息
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 聚合Id，对于打包备份文件不返回此值。通过此值调用DescribeBackupFiles接口，获取单库备份文件的详细信息
     * @param GroupId 聚合Id，对于打包备份文件不返回此值。通过此值调用DescribeBackupFiles接口，获取单库备份文件的详细信息
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 备份文件形式（pkg-打包备份文件，single-单库备份文件） 
     * @return BackupFormat 备份文件形式（pkg-打包备份文件，single-单库备份文件）
     */
    public String getBackupFormat() {
        return this.BackupFormat;
    }

    /**
     * Set 备份文件形式（pkg-打包备份文件，single-单库备份文件）
     * @param BackupFormat 备份文件形式（pkg-打包备份文件，single-单库备份文件）
     */
    public void setBackupFormat(String BackupFormat) {
        this.BackupFormat = BackupFormat;
    }

    /**
     * Get 实例当前地域Code 
     * @return Region 实例当前地域Code
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例当前地域Code
     * @param Region 实例当前地域Code
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 跨地域备份的目的地域下载链接 
     * @return CrossBackupAddr 跨地域备份的目的地域下载链接
     */
    public CrossBackupAddr [] getCrossBackupAddr() {
        return this.CrossBackupAddr;
    }

    /**
     * Set 跨地域备份的目的地域下载链接
     * @param CrossBackupAddr 跨地域备份的目的地域下载链接
     */
    public void setCrossBackupAddr(CrossBackupAddr [] CrossBackupAddr) {
        this.CrossBackupAddr = CrossBackupAddr;
    }

    /**
     * Get 跨地域备份的目标地域和备份状态 
     * @return CrossBackupStatus 跨地域备份的目标地域和备份状态
     */
    public CrossRegionStatus [] getCrossBackupStatus() {
        return this.CrossBackupStatus;
    }

    /**
     * Set 跨地域备份的目标地域和备份状态
     * @param CrossBackupStatus 跨地域备份的目标地域和备份状态
     */
    public void setCrossBackupStatus(CrossRegionStatus [] CrossBackupStatus) {
        this.CrossBackupStatus = CrossBackupStatus;
    }

    public Backup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Backup(Backup source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DBs != null) {
            this.DBs = new String[source.DBs.length];
            for (int i = 0; i < source.DBs.length; i++) {
                this.DBs[i] = new String(source.DBs[i]);
            }
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.StorageStrategy != null) {
            this.StorageStrategy = new Long(source.StorageStrategy);
        }
        if (source.BackupWay != null) {
            this.BackupWay = new Long(source.BackupWay);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.BackupFormat != null) {
            this.BackupFormat = new String(source.BackupFormat);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CrossBackupAddr != null) {
            this.CrossBackupAddr = new CrossBackupAddr[source.CrossBackupAddr.length];
            for (int i = 0; i < source.CrossBackupAddr.length; i++) {
                this.CrossBackupAddr[i] = new CrossBackupAddr(source.CrossBackupAddr[i]);
            }
        }
        if (source.CrossBackupStatus != null) {
            this.CrossBackupStatus = new CrossRegionStatus[source.CrossBackupStatus.length];
            for (int i = 0; i < source.CrossBackupStatus.length; i++) {
                this.CrossBackupStatus[i] = new CrossRegionStatus(source.CrossBackupStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DBs.", this.DBs);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "StorageStrategy", this.StorageStrategy);
        this.setParamSimple(map, prefix + "BackupWay", this.BackupWay);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "BackupFormat", this.BackupFormat);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "CrossBackupAddr.", this.CrossBackupAddr);
        this.setParamArrayObj(map, prefix + "CrossBackupStatus.", this.CrossBackupStatus);

    }
}

