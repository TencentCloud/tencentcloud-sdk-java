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
    * <p>备份文件名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>备份文件大小，单位：Byte</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>备份快照时间，时间格式：2016-03-17 02:10:37</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>下载地址</p>
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * <p>下载地址</p>
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * <p>日志具体类型。可能的值有 &quot;logical&quot;: 逻辑冷备， &quot;physical&quot;: 物理冷备。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>备份子任务的ID，删除备份文件时使用</p>
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * <p>备份任务状态。可能的值有 &quot;SUCCESS&quot;: 备份成功， &quot;FAILED&quot;: 备份失败， &quot;RUNNING&quot;: 备份进行中。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>备份任务的完成时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>（该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>备份任务的开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>备份方法。可能的值有 &quot;full&quot;: 全量备份， &quot;partial&quot;: 部分备份。</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>备份方式。可能的值有 &quot;manual&quot;: 手动备份， &quot;automatic&quot;: 自动备份。</p>
    */
    @SerializedName("Way")
    @Expose
    private String Way;

    /**
    * <p>手动备份别名</p>
    */
    @SerializedName("ManualBackupName")
    @Expose
    private String ManualBackupName;

    /**
    * <p>备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份</p>
    */
    @SerializedName("SaveMode")
    @Expose
    private String SaveMode;

    /**
    * <p>本地备份所在地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>异地备份详细信息</p>
    */
    @SerializedName("RemoteInfo")
    @Expose
    private RemoteBackupInfo [] RemoteInfo;

    /**
    * <p>存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0</p>
    */
    @SerializedName("CosStorageType")
    @Expose
    private Long CosStorageType;

    /**
    * <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>备份完成进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>备份文件是否加密， on-加密， off-未加密</p>
    */
    @SerializedName("EncryptionFlag")
    @Expose
    private String EncryptionFlag;

    /**
    * <p>备份GTID点位</p>
    */
    @SerializedName("ExecutedGTIDSet")
    @Expose
    private String ExecutedGTIDSet;

    /**
    * <p>备份文件MD5值</p>
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
     * Get <p>备份文件名</p> 
     * @return Name <p>备份文件名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>备份文件名</p>
     * @param Name <p>备份文件名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>备份文件大小，单位：Byte</p> 
     * @return Size <p>备份文件大小，单位：Byte</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>备份文件大小，单位：Byte</p>
     * @param Size <p>备份文件大小，单位：Byte</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>备份快照时间，时间格式：2016-03-17 02:10:37</p> 
     * @return Date <p>备份快照时间，时间格式：2016-03-17 02:10:37</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>备份快照时间，时间格式：2016-03-17 02:10:37</p>
     * @param Date <p>备份快照时间，时间格式：2016-03-17 02:10:37</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>下载地址</p> 
     * @return IntranetUrl <p>下载地址</p>
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set <p>下载地址</p>
     * @param IntranetUrl <p>下载地址</p>
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get <p>下载地址</p> 
     * @return InternetUrl <p>下载地址</p>
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set <p>下载地址</p>
     * @param InternetUrl <p>下载地址</p>
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get <p>日志具体类型。可能的值有 &quot;logical&quot;: 逻辑冷备， &quot;physical&quot;: 物理冷备。</p> 
     * @return Type <p>日志具体类型。可能的值有 &quot;logical&quot;: 逻辑冷备， &quot;physical&quot;: 物理冷备。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>日志具体类型。可能的值有 &quot;logical&quot;: 逻辑冷备， &quot;physical&quot;: 物理冷备。</p>
     * @param Type <p>日志具体类型。可能的值有 &quot;logical&quot;: 逻辑冷备， &quot;physical&quot;: 物理冷备。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>备份子任务的ID，删除备份文件时使用</p> 
     * @return BackupId <p>备份子任务的ID，删除备份文件时使用</p>
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>备份子任务的ID，删除备份文件时使用</p>
     * @param BackupId <p>备份子任务的ID，删除备份文件时使用</p>
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>备份任务状态。可能的值有 &quot;SUCCESS&quot;: 备份成功， &quot;FAILED&quot;: 备份失败， &quot;RUNNING&quot;: 备份进行中。</p> 
     * @return Status <p>备份任务状态。可能的值有 &quot;SUCCESS&quot;: 备份成功， &quot;FAILED&quot;: 备份失败， &quot;RUNNING&quot;: 备份进行中。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份任务状态。可能的值有 &quot;SUCCESS&quot;: 备份成功， &quot;FAILED&quot;: 备份失败， &quot;RUNNING&quot;: 备份进行中。</p>
     * @param Status <p>备份任务状态。可能的值有 &quot;SUCCESS&quot;: 备份成功， &quot;FAILED&quot;: 备份失败， &quot;RUNNING&quot;: 备份进行中。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>备份任务的完成时间</p> 
     * @return FinishTime <p>备份任务的完成时间</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>备份任务的完成时间</p>
     * @param FinishTime <p>备份任务的完成时间</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>（该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。</p> 
     * @return Creator <p>（该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>（该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。</p>
     * @param Creator <p>（该值将废弃，不建议使用）备份的创建者，可能的值：SYSTEM - 系统创建，Uin - 发起者Uin值。</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>备份任务的开始时间</p> 
     * @return StartTime <p>备份任务的开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>备份任务的开始时间</p>
     * @param StartTime <p>备份任务的开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>备份方法。可能的值有 &quot;full&quot;: 全量备份， &quot;partial&quot;: 部分备份。</p> 
     * @return Method <p>备份方法。可能的值有 &quot;full&quot;: 全量备份， &quot;partial&quot;: 部分备份。</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>备份方法。可能的值有 &quot;full&quot;: 全量备份， &quot;partial&quot;: 部分备份。</p>
     * @param Method <p>备份方法。可能的值有 &quot;full&quot;: 全量备份， &quot;partial&quot;: 部分备份。</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>备份方式。可能的值有 &quot;manual&quot;: 手动备份， &quot;automatic&quot;: 自动备份。</p> 
     * @return Way <p>备份方式。可能的值有 &quot;manual&quot;: 手动备份， &quot;automatic&quot;: 自动备份。</p>
     */
    public String getWay() {
        return this.Way;
    }

    /**
     * Set <p>备份方式。可能的值有 &quot;manual&quot;: 手动备份， &quot;automatic&quot;: 自动备份。</p>
     * @param Way <p>备份方式。可能的值有 &quot;manual&quot;: 手动备份， &quot;automatic&quot;: 自动备份。</p>
     */
    public void setWay(String Way) {
        this.Way = Way;
    }

    /**
     * Get <p>手动备份别名</p> 
     * @return ManualBackupName <p>手动备份别名</p>
     */
    public String getManualBackupName() {
        return this.ManualBackupName;
    }

    /**
     * Set <p>手动备份别名</p>
     * @param ManualBackupName <p>手动备份别名</p>
     */
    public void setManualBackupName(String ManualBackupName) {
        this.ManualBackupName = ManualBackupName;
    }

    /**
     * Get <p>备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份</p> 
     * @return SaveMode <p>备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份</p>
     */
    public String getSaveMode() {
        return this.SaveMode;
    }

    /**
     * Set <p>备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份</p>
     * @param SaveMode <p>备份保留类型，save_mode_regular - 常规保存备份，save_mode_period - 定期保存备份</p>
     */
    public void setSaveMode(String SaveMode) {
        this.SaveMode = SaveMode;
    }

    /**
     * Get <p>本地备份所在地域</p> 
     * @return Region <p>本地备份所在地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>本地备份所在地域</p>
     * @param Region <p>本地备份所在地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>异地备份详细信息</p> 
     * @return RemoteInfo <p>异地备份详细信息</p>
     */
    public RemoteBackupInfo [] getRemoteInfo() {
        return this.RemoteInfo;
    }

    /**
     * Set <p>异地备份详细信息</p>
     * @param RemoteInfo <p>异地备份详细信息</p>
     */
    public void setRemoteInfo(RemoteBackupInfo [] RemoteInfo) {
        this.RemoteInfo = RemoteInfo;
    }

    /**
     * Get <p>存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0</p> 
     * @return CosStorageType <p>存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0</p>
     */
    public Long getCosStorageType() {
        return this.CosStorageType;
    }

    /**
     * Set <p>存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0</p>
     * @param CosStorageType <p>存储方式，0-常规存储，1-归档存储，2-标准存储，默认为0</p>
     */
    public void setCosStorageType(Long CosStorageType) {
        this.CosStorageType = CosStorageType;
    }

    /**
     * Get <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p> 
     * @return InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
     * @param InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>备份完成进度</p> 
     * @return Progress <p>备份完成进度</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>备份完成进度</p>
     * @param Progress <p>备份完成进度</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>备份文件是否加密， on-加密， off-未加密</p> 
     * @return EncryptionFlag <p>备份文件是否加密， on-加密， off-未加密</p>
     */
    public String getEncryptionFlag() {
        return this.EncryptionFlag;
    }

    /**
     * Set <p>备份文件是否加密， on-加密， off-未加密</p>
     * @param EncryptionFlag <p>备份文件是否加密， on-加密， off-未加密</p>
     */
    public void setEncryptionFlag(String EncryptionFlag) {
        this.EncryptionFlag = EncryptionFlag;
    }

    /**
     * Get <p>备份GTID点位</p> 
     * @return ExecutedGTIDSet <p>备份GTID点位</p>
     */
    public String getExecutedGTIDSet() {
        return this.ExecutedGTIDSet;
    }

    /**
     * Set <p>备份GTID点位</p>
     * @param ExecutedGTIDSet <p>备份GTID点位</p>
     */
    public void setExecutedGTIDSet(String ExecutedGTIDSet) {
        this.ExecutedGTIDSet = ExecutedGTIDSet;
    }

    /**
     * Get <p>备份文件MD5值</p> 
     * @return MD5 <p>备份文件MD5值</p>
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set <p>备份文件MD5值</p>
     * @param MD5 <p>备份文件MD5值</p>
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
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "EncryptionFlag", this.EncryptionFlag);
        this.setParamSimple(map, prefix + "ExecutedGTIDSet", this.ExecutedGTIDSet);
        this.setParamSimple(map, prefix + "MD5", this.MD5);

    }
}

