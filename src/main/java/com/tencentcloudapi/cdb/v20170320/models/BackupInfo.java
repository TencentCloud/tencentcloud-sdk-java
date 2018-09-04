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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupInfo  extends AbstractModel{

    /**
    * 备份文件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备份文件大小，单位：Byte
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 备份快照时间，时间格式：2016-03-17 02:10:37
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 内网下载地址
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * 外网下载地址
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * 日志具体类型，可能的值有：logic - 逻辑冷备，physical - 物理冷备
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 备份子任务的ID，删除备份文件时使用
    */
    @SerializedName("BackupId")
    @Expose
    private Integer BackupId;

    /**
    * 备份任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 备份任务的完成时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * 获取备份文件名
     * @return Name 备份文件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置备份文件名
     * @param Name 备份文件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取备份文件大小，单位：Byte
     * @return Size 备份文件大小，单位：Byte
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * 设置备份文件大小，单位：Byte
     * @param Size 备份文件大小，单位：Byte
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * 获取备份快照时间，时间格式：2016-03-17 02:10:37
     * @return Date 备份快照时间，时间格式：2016-03-17 02:10:37
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置备份快照时间，时间格式：2016-03-17 02:10:37
     * @param Date 备份快照时间，时间格式：2016-03-17 02:10:37
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取内网下载地址
     * @return IntranetUrl 内网下载地址
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * 设置内网下载地址
     * @param IntranetUrl 内网下载地址
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * 获取外网下载地址
     * @return InternetUrl 外网下载地址
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * 设置外网下载地址
     * @param InternetUrl 外网下载地址
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * 获取日志具体类型，可能的值有：logic - 逻辑冷备，physical - 物理冷备
     * @return Type 日志具体类型，可能的值有：logic - 逻辑冷备，physical - 物理冷备
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置日志具体类型，可能的值有：logic - 逻辑冷备，physical - 物理冷备
     * @param Type 日志具体类型，可能的值有：logic - 逻辑冷备，physical - 物理冷备
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取备份子任务的ID，删除备份文件时使用
     * @return BackupId 备份子任务的ID，删除备份文件时使用
     */
    public Integer getBackupId() {
        return this.BackupId;
    }

    /**
     * 设置备份子任务的ID，删除备份文件时使用
     * @param BackupId 备份子任务的ID，删除备份文件时使用
     */
    public void setBackupId(Integer BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * 获取备份任务状态
     * @return Status 备份任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置备份任务状态
     * @param Status 备份任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取备份任务的完成时间
     * @return FinishTime 备份任务的完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * 设置备份任务的完成时间
     * @param FinishTime 备份任务的完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * 获取备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值
     * @return Creator 备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * 设置备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值
     * @param Creator 备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "IntranetUrl", this.IntranetUrl);
        this.setParamSimple(map, prefix + "InternetUrl", this.InternetUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

