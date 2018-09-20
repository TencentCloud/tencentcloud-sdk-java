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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Backup  extends AbstractModel{

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小，单位 KB
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;

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
    * 内网下载地址
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * 外网下载地址
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
    * 备份文件唯一标识，RestoreInstance接口会用到该字段
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 备份文件状态（0-创建中；1-成功；2-失败）
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

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
    private Integer Strategy;

    /**
    * 备份方式，0-定时备份；1-手动临时备份
    */
    @SerializedName("BackupWay")
    @Expose
    private Integer BackupWay;

    /**
     * 获取文件名
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取文件大小，单位 KB
     * @return Size 文件大小，单位 KB
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置文件大小，单位 KB
     * @param Size 文件大小，单位 KB
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 获取备份开始时间
     * @return StartTime 备份开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置备份开始时间
     * @param StartTime 备份开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取备份结束时间
     * @return EndTime 备份结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置备份结束时间
     * @param EndTime 备份结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取内网下载地址
     * @return InternalAddr 内网下载地址
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * 设置内网下载地址
     * @param InternalAddr 内网下载地址
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * 获取外网下载地址
     * @return ExternalAddr 外网下载地址
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * 设置外网下载地址
     * @param ExternalAddr 外网下载地址
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * 获取备份文件唯一标识，RestoreInstance接口会用到该字段
     * @return Id 备份文件唯一标识，RestoreInstance接口会用到该字段
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置备份文件唯一标识，RestoreInstance接口会用到该字段
     * @param Id 备份文件唯一标识，RestoreInstance接口会用到该字段
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取备份文件状态（0-创建中；1-成功；2-失败）
     * @return Status 备份文件状态（0-创建中；1-成功；2-失败）
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置备份文件状态（0-创建中；1-成功；2-失败）
     * @param Status 备份文件状态（0-创建中；1-成功；2-失败）
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取多库备份时的DB列表
     * @return DBs 多库备份时的DB列表
     */
    public String [] getDBs() {
        return this.DBs;
    }

    /**
     * 设置多库备份时的DB列表
     * @param DBs 多库备份时的DB列表
     */
    public void setDBs(String [] DBs) {
        this.DBs = DBs;
    }

    /**
     * 获取备份策略（0-实例备份；1-多库备份）
     * @return Strategy 备份策略（0-实例备份；1-多库备份）
     */
    public Integer getStrategy() {
        return this.Strategy;
    }

    /**
     * 设置备份策略（0-实例备份；1-多库备份）
     * @param Strategy 备份策略（0-实例备份；1-多库备份）
     */
    public void setStrategy(Integer Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * 获取备份方式，0-定时备份；1-手动临时备份
     * @return BackupWay 备份方式，0-定时备份；1-手动临时备份
     */
    public Integer getBackupWay() {
        return this.BackupWay;
    }

    /**
     * 设置备份方式，0-定时备份；1-手动临时备份
     * @param BackupWay 备份方式，0-定时备份；1-手动临时备份
     */
    public void setBackupWay(Integer BackupWay) {
        this.BackupWay = BackupWay;
    }

    /**
     * 内部实现，用户禁止调用
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
        this.setParamSimple(map, prefix + "BackupWay", this.BackupWay);

    }
}

