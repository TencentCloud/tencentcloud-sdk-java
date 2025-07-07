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

public class CrossSummaryDetailRes extends AbstractModel {

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 跨地域备份状态 enable-开启，disable-关闭
    */
    @SerializedName("CrossBackupEnabled")
    @Expose
    private String CrossBackupEnabled;

    /**
    * 跨地域备份目标地域
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * 最新备份开始时间
    */
    @SerializedName("LastBackupStartTime")
    @Expose
    private String LastBackupStartTime;

    /**
    * 跨地域备份保留天数
    */
    @SerializedName("CrossBackupSaveDays")
    @Expose
    private Long CrossBackupSaveDays;

    /**
    * 跨地域数据备份总空间
    */
    @SerializedName("DataBackupSpace")
    @Expose
    private Long DataBackupSpace;

    /**
    * 跨地域数据备份文件总个数
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * 跨地域日志备份总空间
    */
    @SerializedName("LogBackupSpace")
    @Expose
    private Long LogBackupSpace;

    /**
    * 跨地域日志备份文件总个数
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * 跨地域备份总空间
    */
    @SerializedName("ActualUsedSpace")
    @Expose
    private Long ActualUsedSpace;

    /**
    * 跨地域备份总个数
    */
    @SerializedName("ActualUsedCount")
    @Expose
    private Long ActualUsedCount;

    /**
     * Get 实例状态 
     * @return Status 实例状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例所属地域 
     * @return Region 实例所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所属地域
     * @param Region 实例所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 跨地域备份状态 enable-开启，disable-关闭 
     * @return CrossBackupEnabled 跨地域备份状态 enable-开启，disable-关闭
     */
    public String getCrossBackupEnabled() {
        return this.CrossBackupEnabled;
    }

    /**
     * Set 跨地域备份状态 enable-开启，disable-关闭
     * @param CrossBackupEnabled 跨地域备份状态 enable-开启，disable-关闭
     */
    public void setCrossBackupEnabled(String CrossBackupEnabled) {
        this.CrossBackupEnabled = CrossBackupEnabled;
    }

    /**
     * Get 跨地域备份目标地域 
     * @return CrossRegions 跨地域备份目标地域
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set 跨地域备份目标地域
     * @param CrossRegions 跨地域备份目标地域
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get 最新备份开始时间 
     * @return LastBackupStartTime 最新备份开始时间
     */
    public String getLastBackupStartTime() {
        return this.LastBackupStartTime;
    }

    /**
     * Set 最新备份开始时间
     * @param LastBackupStartTime 最新备份开始时间
     */
    public void setLastBackupStartTime(String LastBackupStartTime) {
        this.LastBackupStartTime = LastBackupStartTime;
    }

    /**
     * Get 跨地域备份保留天数 
     * @return CrossBackupSaveDays 跨地域备份保留天数
     */
    public Long getCrossBackupSaveDays() {
        return this.CrossBackupSaveDays;
    }

    /**
     * Set 跨地域备份保留天数
     * @param CrossBackupSaveDays 跨地域备份保留天数
     */
    public void setCrossBackupSaveDays(Long CrossBackupSaveDays) {
        this.CrossBackupSaveDays = CrossBackupSaveDays;
    }

    /**
     * Get 跨地域数据备份总空间 
     * @return DataBackupSpace 跨地域数据备份总空间
     */
    public Long getDataBackupSpace() {
        return this.DataBackupSpace;
    }

    /**
     * Set 跨地域数据备份总空间
     * @param DataBackupSpace 跨地域数据备份总空间
     */
    public void setDataBackupSpace(Long DataBackupSpace) {
        this.DataBackupSpace = DataBackupSpace;
    }

    /**
     * Get 跨地域数据备份文件总个数 
     * @return DataBackupCount 跨地域数据备份文件总个数
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set 跨地域数据备份文件总个数
     * @param DataBackupCount 跨地域数据备份文件总个数
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get 跨地域日志备份总空间 
     * @return LogBackupSpace 跨地域日志备份总空间
     */
    public Long getLogBackupSpace() {
        return this.LogBackupSpace;
    }

    /**
     * Set 跨地域日志备份总空间
     * @param LogBackupSpace 跨地域日志备份总空间
     */
    public void setLogBackupSpace(Long LogBackupSpace) {
        this.LogBackupSpace = LogBackupSpace;
    }

    /**
     * Get 跨地域日志备份文件总个数 
     * @return LogBackupCount 跨地域日志备份文件总个数
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set 跨地域日志备份文件总个数
     * @param LogBackupCount 跨地域日志备份文件总个数
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get 跨地域备份总空间 
     * @return ActualUsedSpace 跨地域备份总空间
     */
    public Long getActualUsedSpace() {
        return this.ActualUsedSpace;
    }

    /**
     * Set 跨地域备份总空间
     * @param ActualUsedSpace 跨地域备份总空间
     */
    public void setActualUsedSpace(Long ActualUsedSpace) {
        this.ActualUsedSpace = ActualUsedSpace;
    }

    /**
     * Get 跨地域备份总个数 
     * @return ActualUsedCount 跨地域备份总个数
     */
    public Long getActualUsedCount() {
        return this.ActualUsedCount;
    }

    /**
     * Set 跨地域备份总个数
     * @param ActualUsedCount 跨地域备份总个数
     */
    public void setActualUsedCount(Long ActualUsedCount) {
        this.ActualUsedCount = ActualUsedCount;
    }

    public CrossSummaryDetailRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossSummaryDetailRes(CrossSummaryDetailRes source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CrossBackupEnabled != null) {
            this.CrossBackupEnabled = new String(source.CrossBackupEnabled);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.LastBackupStartTime != null) {
            this.LastBackupStartTime = new String(source.LastBackupStartTime);
        }
        if (source.CrossBackupSaveDays != null) {
            this.CrossBackupSaveDays = new Long(source.CrossBackupSaveDays);
        }
        if (source.DataBackupSpace != null) {
            this.DataBackupSpace = new Long(source.DataBackupSpace);
        }
        if (source.DataBackupCount != null) {
            this.DataBackupCount = new Long(source.DataBackupCount);
        }
        if (source.LogBackupSpace != null) {
            this.LogBackupSpace = new Long(source.LogBackupSpace);
        }
        if (source.LogBackupCount != null) {
            this.LogBackupCount = new Long(source.LogBackupCount);
        }
        if (source.ActualUsedSpace != null) {
            this.ActualUsedSpace = new Long(source.ActualUsedSpace);
        }
        if (source.ActualUsedCount != null) {
            this.ActualUsedCount = new Long(source.ActualUsedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CrossBackupEnabled", this.CrossBackupEnabled);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "LastBackupStartTime", this.LastBackupStartTime);
        this.setParamSimple(map, prefix + "CrossBackupSaveDays", this.CrossBackupSaveDays);
        this.setParamSimple(map, prefix + "DataBackupSpace", this.DataBackupSpace);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSpace", this.LogBackupSpace);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "ActualUsedSpace", this.ActualUsedSpace);
        this.setParamSimple(map, prefix + "ActualUsedCount", this.ActualUsedCount);

    }
}

