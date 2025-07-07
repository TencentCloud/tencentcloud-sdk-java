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

public class SummaryDetailRes extends AbstractModel {

    /**
    * 地域标识
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 实例状态。1：申请中2：运行中3：受限运行中 (主备切换中)4：已隔离5：回收中6：已回收7：任务执行中 (实例做备份、回档等操作)8：已下线9：实例扩容中10：实例迁移中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * 备份空间
    */
    @SerializedName("ActualUsedSpace")
    @Expose
    private Long ActualUsedSpace;

    /**
    * 数据备份空间
    */
    @SerializedName("DataBackupSpace")
    @Expose
    private Long DataBackupSpace;

    /**
    * 数据备份文件总个数
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * 日志备份空间
    */
    @SerializedName("LogBackupSpace")
    @Expose
    private Long LogBackupSpace;

    /**
    * 日志备份文件总个数
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * 自动备份空间
    */
    @SerializedName("AutoBackupSpace")
    @Expose
    private Long AutoBackupSpace;

    /**
    * 自动备份文件总个数
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * 手动备份空间
    */
    @SerializedName("ManualBackupSpace")
    @Expose
    private Long ManualBackupSpace;

    /**
    * 手动备份文件总个数
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * 实例所属地域码
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 地域标识 
     * @return RegionId 地域标识
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域标识
     * @param RegionId 地域标识
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例状态。1：申请中2：运行中3：受限运行中 (主备切换中)4：已隔离5：回收中6：已回收7：任务执行中 (实例做备份、回档等操作)8：已下线9：实例扩容中10：实例迁移中 
     * @return Status 实例状态。1：申请中2：运行中3：受限运行中 (主备切换中)4：已隔离5：回收中6：已回收7：任务执行中 (实例做备份、回档等操作)8：已下线9：实例扩容中10：实例迁移中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。1：申请中2：运行中3：受限运行中 (主备切换中)4：已隔离5：回收中6：已回收7：任务执行中 (实例做备份、回档等操作)8：已下线9：实例扩容中10：实例迁移中
     * @param Status 实例状态。1：申请中2：运行中3：受限运行中 (主备切换中)4：已隔离5：回收中6：已回收7：任务执行中 (实例做备份、回档等操作)8：已下线9：实例扩容中10：实例迁移中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 备份空间 
     * @return ActualUsedSpace 备份空间
     */
    public Long getActualUsedSpace() {
        return this.ActualUsedSpace;
    }

    /**
     * Set 备份空间
     * @param ActualUsedSpace 备份空间
     */
    public void setActualUsedSpace(Long ActualUsedSpace) {
        this.ActualUsedSpace = ActualUsedSpace;
    }

    /**
     * Get 数据备份空间 
     * @return DataBackupSpace 数据备份空间
     */
    public Long getDataBackupSpace() {
        return this.DataBackupSpace;
    }

    /**
     * Set 数据备份空间
     * @param DataBackupSpace 数据备份空间
     */
    public void setDataBackupSpace(Long DataBackupSpace) {
        this.DataBackupSpace = DataBackupSpace;
    }

    /**
     * Get 数据备份文件总个数 
     * @return DataBackupCount 数据备份文件总个数
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set 数据备份文件总个数
     * @param DataBackupCount 数据备份文件总个数
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get 日志备份空间 
     * @return LogBackupSpace 日志备份空间
     */
    public Long getLogBackupSpace() {
        return this.LogBackupSpace;
    }

    /**
     * Set 日志备份空间
     * @param LogBackupSpace 日志备份空间
     */
    public void setLogBackupSpace(Long LogBackupSpace) {
        this.LogBackupSpace = LogBackupSpace;
    }

    /**
     * Get 日志备份文件总个数 
     * @return LogBackupCount 日志备份文件总个数
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set 日志备份文件总个数
     * @param LogBackupCount 日志备份文件总个数
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get 自动备份空间 
     * @return AutoBackupSpace 自动备份空间
     */
    public Long getAutoBackupSpace() {
        return this.AutoBackupSpace;
    }

    /**
     * Set 自动备份空间
     * @param AutoBackupSpace 自动备份空间
     */
    public void setAutoBackupSpace(Long AutoBackupSpace) {
        this.AutoBackupSpace = AutoBackupSpace;
    }

    /**
     * Get 自动备份文件总个数 
     * @return AutoBackupCount 自动备份文件总个数
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set 自动备份文件总个数
     * @param AutoBackupCount 自动备份文件总个数
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get 手动备份空间 
     * @return ManualBackupSpace 手动备份空间
     */
    public Long getManualBackupSpace() {
        return this.ManualBackupSpace;
    }

    /**
     * Set 手动备份空间
     * @param ManualBackupSpace 手动备份空间
     */
    public void setManualBackupSpace(Long ManualBackupSpace) {
        this.ManualBackupSpace = ManualBackupSpace;
    }

    /**
     * Get 手动备份文件总个数 
     * @return ManualBackupCount 手动备份文件总个数
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set 手动备份文件总个数
     * @param ManualBackupCount 手动备份文件总个数
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get 实例所属地域码 
     * @return Region 实例所属地域码
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所属地域码
     * @param Region 实例所属地域码
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public SummaryDetailRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryDetailRes(SummaryDetailRes source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ActualUsedSpace != null) {
            this.ActualUsedSpace = new Long(source.ActualUsedSpace);
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
        if (source.AutoBackupSpace != null) {
            this.AutoBackupSpace = new Long(source.AutoBackupSpace);
        }
        if (source.AutoBackupCount != null) {
            this.AutoBackupCount = new Long(source.AutoBackupCount);
        }
        if (source.ManualBackupSpace != null) {
            this.ManualBackupSpace = new Long(source.ManualBackupSpace);
        }
        if (source.ManualBackupCount != null) {
            this.ManualBackupCount = new Long(source.ManualBackupCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ActualUsedSpace", this.ActualUsedSpace);
        this.setParamSimple(map, prefix + "DataBackupSpace", this.DataBackupSpace);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSpace", this.LogBackupSpace);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupSpace", this.AutoBackupSpace);
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupSpace", this.ManualBackupSpace);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

