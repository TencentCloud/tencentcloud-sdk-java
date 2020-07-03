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

public class BackupInfo extends AbstractModel{

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
    * 日志具体类型。可能的值有 "logical": 逻辑冷备， "physical": 物理冷备。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 备份子任务的ID，删除备份文件时使用
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
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
    * （该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 备份任务的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份方法。可能的值有 "full": 全量备份， "partial": 部分备份。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 备份方式。可能的值有 "manual": 手动备份， "automatic": 自动备份。
    */
    @SerializedName("Way")
    @Expose
    private String Way;

    /**
     * Get 备份文件名 
     * @return Name 备份文件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 备份文件名
     * @param Name 备份文件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 备份文件大小，单位：Byte 
     * @return Size 备份文件大小，单位：Byte
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 备份文件大小，单位：Byte
     * @param Size 备份文件大小，单位：Byte
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 备份快照时间，时间格式：2016-03-17 02:10:37 
     * @return Date 备份快照时间，时间格式：2016-03-17 02:10:37
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 备份快照时间，时间格式：2016-03-17 02:10:37
     * @param Date 备份快照时间，时间格式：2016-03-17 02:10:37
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 内网下载地址 
     * @return IntranetUrl 内网下载地址
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set 内网下载地址
     * @param IntranetUrl 内网下载地址
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get 外网下载地址 
     * @return InternetUrl 外网下载地址
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set 外网下载地址
     * @param InternetUrl 外网下载地址
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get 日志具体类型。可能的值有 "logical": 逻辑冷备， "physical": 物理冷备。 
     * @return Type 日志具体类型。可能的值有 "logical": 逻辑冷备， "physical": 物理冷备。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 日志具体类型。可能的值有 "logical": 逻辑冷备， "physical": 物理冷备。
     * @param Type 日志具体类型。可能的值有 "logical": 逻辑冷备， "physical": 物理冷备。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 备份子任务的ID，删除备份文件时使用 
     * @return BackupId 备份子任务的ID，删除备份文件时使用
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份子任务的ID，删除备份文件时使用
     * @param BackupId 备份子任务的ID，删除备份文件时使用
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。 
     * @return Status 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
     * @param Status 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 备份任务的完成时间 
     * @return FinishTime 备份任务的完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 备份任务的完成时间
     * @param FinishTime 备份任务的完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get （该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。 
     * @return Creator （该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set （该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。
     * @param Creator （该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 备份任务的开始时间 
     * @return StartTime 备份任务的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份任务的开始时间
     * @param StartTime 备份任务的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份方法。可能的值有 "full": 全量备份， "partial": 部分备份。 
     * @return Method 备份方法。可能的值有 "full": 全量备份， "partial": 部分备份。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 备份方法。可能的值有 "full": 全量备份， "partial": 部分备份。
     * @param Method 备份方法。可能的值有 "full": 全量备份， "partial": 部分备份。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 备份方式。可能的值有 "manual": 手动备份， "automatic": 自动备份。 
     * @return Way 备份方式。可能的值有 "manual": 手动备份， "automatic": 自动备份。
     */
    public String getWay() {
        return this.Way;
    }

    /**
     * Set 备份方式。可能的值有 "manual": 手动备份， "automatic": 自动备份。
     * @param Way 备份方式。可能的值有 "manual": 手动备份， "automatic": 自动备份。
     */
    public void setWay(String Way) {
        this.Way = Way;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Way", this.Way);

    }
}

