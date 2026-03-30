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

public class BinlogInfo extends AbstractModel {

    /**
    * <p>binlog 日志备份文件名</p>
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
    * <p>文件存储时间，时间格式：2016-03-17 02:10:37</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>下载地址<br>说明：此下载地址和参数 InternetUrl 的下载地址一样。</p>
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * <p>下载地址<br>说明：此下载地址和参数 IntranetUrl 的下载地址一样。</p>
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * <p>日志具体类型，可能的值有：binlog - 二进制日志</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>binlog 文件起始时间</p>
    */
    @SerializedName("BinlogStartTime")
    @Expose
    private String BinlogStartTime;

    /**
    * <p>binlog 文件截止时间</p>
    */
    @SerializedName("BinlogFinishTime")
    @Expose
    private String BinlogFinishTime;

    /**
    * <p>本地binlog文件所在地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>备份任务状态。可能的值有 &quot;SUCCESS&quot;: 备份成功， &quot;FAILED&quot;: 备份失败， &quot;RUNNING&quot;: 备份进行中。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>binlog异地备份详细信息</p>
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
     * Get <p>binlog 日志备份文件名</p> 
     * @return Name <p>binlog 日志备份文件名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>binlog 日志备份文件名</p>
     * @param Name <p>binlog 日志备份文件名</p>
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
     * Get <p>文件存储时间，时间格式：2016-03-17 02:10:37</p> 
     * @return Date <p>文件存储时间，时间格式：2016-03-17 02:10:37</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>文件存储时间，时间格式：2016-03-17 02:10:37</p>
     * @param Date <p>文件存储时间，时间格式：2016-03-17 02:10:37</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>下载地址<br>说明：此下载地址和参数 InternetUrl 的下载地址一样。</p> 
     * @return IntranetUrl <p>下载地址<br>说明：此下载地址和参数 InternetUrl 的下载地址一样。</p>
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set <p>下载地址<br>说明：此下载地址和参数 InternetUrl 的下载地址一样。</p>
     * @param IntranetUrl <p>下载地址<br>说明：此下载地址和参数 InternetUrl 的下载地址一样。</p>
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get <p>下载地址<br>说明：此下载地址和参数 IntranetUrl 的下载地址一样。</p> 
     * @return InternetUrl <p>下载地址<br>说明：此下载地址和参数 IntranetUrl 的下载地址一样。</p>
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set <p>下载地址<br>说明：此下载地址和参数 IntranetUrl 的下载地址一样。</p>
     * @param InternetUrl <p>下载地址<br>说明：此下载地址和参数 IntranetUrl 的下载地址一样。</p>
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get <p>日志具体类型，可能的值有：binlog - 二进制日志</p> 
     * @return Type <p>日志具体类型，可能的值有：binlog - 二进制日志</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>日志具体类型，可能的值有：binlog - 二进制日志</p>
     * @param Type <p>日志具体类型，可能的值有：binlog - 二进制日志</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>binlog 文件起始时间</p> 
     * @return BinlogStartTime <p>binlog 文件起始时间</p>
     */
    public String getBinlogStartTime() {
        return this.BinlogStartTime;
    }

    /**
     * Set <p>binlog 文件起始时间</p>
     * @param BinlogStartTime <p>binlog 文件起始时间</p>
     */
    public void setBinlogStartTime(String BinlogStartTime) {
        this.BinlogStartTime = BinlogStartTime;
    }

    /**
     * Get <p>binlog 文件截止时间</p> 
     * @return BinlogFinishTime <p>binlog 文件截止时间</p>
     */
    public String getBinlogFinishTime() {
        return this.BinlogFinishTime;
    }

    /**
     * Set <p>binlog 文件截止时间</p>
     * @param BinlogFinishTime <p>binlog 文件截止时间</p>
     */
    public void setBinlogFinishTime(String BinlogFinishTime) {
        this.BinlogFinishTime = BinlogFinishTime;
    }

    /**
     * Get <p>本地binlog文件所在地域</p> 
     * @return Region <p>本地binlog文件所在地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>本地binlog文件所在地域</p>
     * @param Region <p>本地binlog文件所在地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get <p>binlog异地备份详细信息</p> 
     * @return RemoteInfo <p>binlog异地备份详细信息</p>
     */
    public RemoteBackupInfo [] getRemoteInfo() {
        return this.RemoteInfo;
    }

    /**
     * Set <p>binlog异地备份详细信息</p>
     * @param RemoteInfo <p>binlog异地备份详细信息</p>
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
     * @deprecated
     */
    @Deprecated
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
     * @param InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
     * @deprecated
     */
    @Deprecated
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
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

