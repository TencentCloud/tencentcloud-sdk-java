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

public class BinlogInfo extends AbstractModel{

    /**
    * binlog 日志备份文件名
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
    * 文件存储时间，时间格式：2016-03-17 02:10:37
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
    * 日志具体类型，可能的值有：binlog - 二进制日志
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * binlog 文件起始时间
    */
    @SerializedName("BinlogStartTime")
    @Expose
    private String BinlogStartTime;

    /**
    * binlog 文件截止时间
    */
    @SerializedName("BinlogFinishTime")
    @Expose
    private String BinlogFinishTime;

    /**
    * 本地binlog文件所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 备份任务状态。可能的值有 "SUCCESS": 备份成功， "FAILED": 备份失败， "RUNNING": 备份进行中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * binlog异地备份详细信息
    */
    @SerializedName("RemoteInfo")
    @Expose
    private RemoteBackupInfo [] RemoteInfo;

    /**
    * 存储方式，0-常规存储，1-归档存储，默认为0
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
     * Get binlog 日志备份文件名 
     * @return Name binlog 日志备份文件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set binlog 日志备份文件名
     * @param Name binlog 日志备份文件名
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
     * Get 文件存储时间，时间格式：2016-03-17 02:10:37 
     * @return Date 文件存储时间，时间格式：2016-03-17 02:10:37
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 文件存储时间，时间格式：2016-03-17 02:10:37
     * @param Date 文件存储时间，时间格式：2016-03-17 02:10:37
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
     * Get 日志具体类型，可能的值有：binlog - 二进制日志 
     * @return Type 日志具体类型，可能的值有：binlog - 二进制日志
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 日志具体类型，可能的值有：binlog - 二进制日志
     * @param Type 日志具体类型，可能的值有：binlog - 二进制日志
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get binlog 文件起始时间 
     * @return BinlogStartTime binlog 文件起始时间
     */
    public String getBinlogStartTime() {
        return this.BinlogStartTime;
    }

    /**
     * Set binlog 文件起始时间
     * @param BinlogStartTime binlog 文件起始时间
     */
    public void setBinlogStartTime(String BinlogStartTime) {
        this.BinlogStartTime = BinlogStartTime;
    }

    /**
     * Get binlog 文件截止时间 
     * @return BinlogFinishTime binlog 文件截止时间
     */
    public String getBinlogFinishTime() {
        return this.BinlogFinishTime;
    }

    /**
     * Set binlog 文件截止时间
     * @param BinlogFinishTime binlog 文件截止时间
     */
    public void setBinlogFinishTime(String BinlogFinishTime) {
        this.BinlogFinishTime = BinlogFinishTime;
    }

    /**
     * Get 本地binlog文件所在地域 
     * @return Region 本地binlog文件所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 本地binlog文件所在地域
     * @param Region 本地binlog文件所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get binlog异地备份详细信息 
     * @return RemoteInfo binlog异地备份详细信息
     */
    public RemoteBackupInfo [] getRemoteInfo() {
        return this.RemoteInfo;
    }

    /**
     * Set binlog异地备份详细信息
     * @param RemoteInfo binlog异地备份详细信息
     */
    public void setRemoteInfo(RemoteBackupInfo [] RemoteInfo) {
        this.RemoteInfo = RemoteInfo;
    }

    /**
     * Get 存储方式，0-常规存储，1-归档存储，默认为0 
     * @return CosStorageType 存储方式，0-常规存储，1-归档存储，默认为0
     */
    public Long getCosStorageType() {
        return this.CosStorageType;
    }

    /**
     * Set 存储方式，0-常规存储，1-归档存储，默认为0
     * @param CosStorageType 存储方式，0-常规存储，1-归档存储，默认为0
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

    public BinlogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogInfo(BinlogInfo source) {
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
        if (source.BinlogStartTime != null) {
            this.BinlogStartTime = new String(source.BinlogStartTime);
        }
        if (source.BinlogFinishTime != null) {
            this.BinlogFinishTime = new String(source.BinlogFinishTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamSimple(map, prefix + "BinlogStartTime", this.BinlogStartTime);
        this.setParamSimple(map, prefix + "BinlogFinishTime", this.BinlogFinishTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "RemoteInfo.", this.RemoteInfo);
        this.setParamSimple(map, prefix + "CosStorageType", this.CosStorageType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

