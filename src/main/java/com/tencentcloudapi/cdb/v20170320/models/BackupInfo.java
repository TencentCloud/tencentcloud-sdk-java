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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupInfo extends AbstractModel {

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
    * 下载地址
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * 下载地址
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
    * 手动备份别名
    */
    @SerializedName("ManualBackupName")
    @Expose
    private String ManualBackupName;

    /**
    * 备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份
    */
    @SerializedName("SaveMode")
    @Expose
    private String SaveMode;

    /**
    * 本地备份所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 异地备份详细信息
    */
    @SerializedName("RemoteInfo")
    @Expose
    private RemoteBackupInfo [] RemoteInfo;

    /**
    * 存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0
    */
    @SerializedName("CosStorageType")
    @Expose
    private Long CosStorageType;

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份文件是否加密， on-加密， off-未加密
    */
    @SerializedName("EncryptionFlag")
    @Expose
    private String EncryptionFlag;

    /**
    * 备份GTID点位
    */
    @SerializedName("ExecutedGTIDSet")
    @Expose
    private String ExecutedGTIDSet;

    /**
    * 备份文件MD5值
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

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
     * Get 下载地址 
     * @return IntranetUrl 下载地址
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set 下载地址
     * @param IntranetUrl 下载地址
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get 下载地址 
     * @return InternetUrl 下载地址
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set 下载地址
     * @param InternetUrl 下载地址
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
     * Get 手动备份别名 
     * @return ManualBackupName 手动备份别名
     */
    public String getManualBackupName() {
        return this.ManualBackupName;
    }

    /**
     * Set 手动备份别名
     * @param ManualBackupName 手动备份别名
     */
    public void setManualBackupName(String ManualBackupName) {
        this.ManualBackupName = ManualBackupName;
    }

    /**
     * Get 备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份 
     * @return SaveMode 备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份
     */
    public String getSaveMode() {
        return this.SaveMode;
    }

    /**
     * Set 备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份
     * @param SaveMode 备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份
     */
    public void setSaveMode(String SaveMode) {
        this.SaveMode = SaveMode;
    }

    /**
     * Get 本地备份所在地域 
     * @return Region 本地备份所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 本地备份所在地域
     * @param Region 本地备份所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 异地备份详细信息 
     * @return RemoteInfo 异地备份详细信息
     */
    public RemoteBackupInfo [] getRemoteInfo() {
        return this.RemoteInfo;
    }

    /**
     * Set 异地备份详细信息
     * @param RemoteInfo 异地备份详细信息
     */
    public void setRemoteInfo(RemoteBackupInfo [] RemoteInfo) {
        this.RemoteInfo = RemoteInfo;
    }

    /**
     * Get 存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0 
     * @return CosStorageType 存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0
     */
    public Long getCosStorageType() {
        return this.CosStorageType;
    }

    /**
     * Set 存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0
     * @param CosStorageType 存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0
     */
    public void setCosStorageType(Long CosStorageType) {
        this.CosStorageType = CosStorageType;
    }

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份文件是否加密， on-加密， off-未加密 
     * @return EncryptionFlag 备份文件是否加密， on-加密， off-未加密
     */
    public String getEncryptionFlag() {
        return this.EncryptionFlag;
    }

    /**
     * Set 备份文件是否加密， on-加密， off-未加密
     * @param EncryptionFlag 备份文件是否加密， on-加密， off-未加密
     */
    public void setEncryptionFlag(String EncryptionFlag) {
        this.EncryptionFlag = EncryptionFlag;
    }

    /**
     * Get 备份GTID点位 
     * @return ExecutedGTIDSet 备份GTID点位
     */
    public String getExecutedGTIDSet() {
        return this.ExecutedGTIDSet;
    }

    /**
     * Set 备份GTID点位
     * @param ExecutedGTIDSet 备份GTID点位
     */
    public void setExecutedGTIDSet(String ExecutedGTIDSet) {
        this.ExecutedGTIDSet = ExecutedGTIDSet;
    }

    /**
     * Get 备份文件MD5值 
     * @return MD5 备份文件MD5值
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 备份文件MD5值
     * @param MD5 备份文件MD5值
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    public BackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInfo(BackupInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.IntranetUrl != null) {
            this.IntranetUrl = new String(source.IntranetUrl);
        }
        if (source.InternetUrl != null) {
            this.InternetUrl = new String(source.InternetUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Way != null) {
            this.Way = new String(source.Way);
        }
        if (source.ManualBackupName != null) {
            this.ManualBackupName = new String(source.ManualBackupName);
        }
        if (source.SaveMode != null) {
            this.SaveMode = new String(source.SaveMode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RemoteInfo != null) {
            this.RemoteInfo = new RemoteBackupInfo[source.RemoteInfo.length];
            for (int i = 0; i < source.RemoteInfo.length; i++) {
                this.RemoteInfo[i] = new RemoteBackupInfo(source.RemoteInfo[i]);
            }
        }
        if (source.CosStorageType != null) {
            this.CosStorageType = new Long(source.CosStorageType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EncryptionFlag != null) {
            this.EncryptionFlag = new String(source.EncryptionFlag);
        }
        if (source.ExecutedGTIDSet != null) {
            this.ExecutedGTIDSet = new String(source.ExecutedGTIDSet);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
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
        this.setParamSimple(map, prefix + "ManualBackupName", this.ManualBackupName);
        this.setParamSimple(map, prefix + "SaveMode", this.SaveMode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "RemoteInfo.", this.RemoteInfo);
        this.setParamSimple(map, prefix + "CosStorageType", this.CosStorageType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EncryptionFlag", this.EncryptionFlag);
        this.setParamSimple(map, prefix + "ExecutedGTIDSet", this.ExecutedGTIDSet);
        this.setParamSimple(map, prefix + "MD5", this.MD5);

    }
}

