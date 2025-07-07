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

public class DescribeBackupSummaryResponse extends AbstractModel {

    /**
    * 实际免费总空间，单位(KB)。
    */
    @SerializedName("FreeSpace")
    @Expose
    private Long FreeSpace;

    /**
    * 备份实际使用空间，单位(KB)。
    */
    @SerializedName("ActualUsedSpace")
    @Expose
    private Long ActualUsedSpace;

    /**
    * 备份文件总个数。
    */
    @SerializedName("BackupFilesTotal")
    @Expose
    private Long BackupFilesTotal;

    /**
    * 备份占用收费空间，单位(KB)。
    */
    @SerializedName("BillingSpace")
    @Expose
    private Long BillingSpace;

    /**
    * 数据备份使用空间，单位(KB)。
    */
    @SerializedName("DataBackupSpace")
    @Expose
    private Long DataBackupSpace;

    /**
    * 数据备份文件总个数。
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * 数据备份中手动备份使用空间，单位(KB)。
    */
    @SerializedName("ManualBackupSpace")
    @Expose
    private Long ManualBackupSpace;

    /**
    * 数据备份中手动备份文件总个数。
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * 数据备份中自动备份使用空间，单位(KB)。
    */
    @SerializedName("AutoBackupSpace")
    @Expose
    private Long AutoBackupSpace;

    /**
    * 数据备份中自动备份文件总个数。
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * 日志备份使用空间，单位(KB)。
    */
    @SerializedName("LogBackupSpace")
    @Expose
    private Long LogBackupSpace;

    /**
    * 日志备份文件总个数。
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * 预估收费金额，单位（元/小时）。
    */
    @SerializedName("EstimatedAmount")
    @Expose
    private Float EstimatedAmount;

    /**
    * 本地备份文件总个数
    */
    @SerializedName("LocalBackupFilesTotal")
    @Expose
    private Long LocalBackupFilesTotal;

    /**
    * 跨地域备份文件总个数
    */
    @SerializedName("CrossBackupFilesTotal")
    @Expose
    private Long CrossBackupFilesTotal;

    /**
    * 跨地域备份占用收费空间，单位（KB）
    */
    @SerializedName("CrossBillingSpace")
    @Expose
    private Long CrossBillingSpace;

    /**
    * 跨地域自动数据备份使用空间，单位（KB）
    */
    @SerializedName("CrossAutoBackupSpace")
    @Expose
    private Long CrossAutoBackupSpace;

    /**
    * 跨地域自动数据备份文件总个数
    */
    @SerializedName("CrossAutoBackupCount")
    @Expose
    private Long CrossAutoBackupCount;

    /**
    * 本地日志备份使用空间，单位（KB）
    */
    @SerializedName("LocalLogBackupSpace")
    @Expose
    private Long LocalLogBackupSpace;

    /**
    * 本地日志备份文件总个数
    */
    @SerializedName("LocalLogBackupCount")
    @Expose
    private Long LocalLogBackupCount;

    /**
    * 跨地域日志备份使用空间，单位（KB）
    */
    @SerializedName("CrossLogBackupSpace")
    @Expose
    private Long CrossLogBackupSpace;

    /**
    * 跨地域日志备份文件总个数
    */
    @SerializedName("CrossLogBackupCount")
    @Expose
    private Long CrossLogBackupCount;

    /**
    * 跨地域备份预估收费金额，单位（元/小时）
    */
    @SerializedName("CrossEstimatedAmount")
    @Expose
    private Float CrossEstimatedAmount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实际免费总空间，单位(KB)。 
     * @return FreeSpace 实际免费总空间，单位(KB)。
     */
    public Long getFreeSpace() {
        return this.FreeSpace;
    }

    /**
     * Set 实际免费总空间，单位(KB)。
     * @param FreeSpace 实际免费总空间，单位(KB)。
     */
    public void setFreeSpace(Long FreeSpace) {
        this.FreeSpace = FreeSpace;
    }

    /**
     * Get 备份实际使用空间，单位(KB)。 
     * @return ActualUsedSpace 备份实际使用空间，单位(KB)。
     */
    public Long getActualUsedSpace() {
        return this.ActualUsedSpace;
    }

    /**
     * Set 备份实际使用空间，单位(KB)。
     * @param ActualUsedSpace 备份实际使用空间，单位(KB)。
     */
    public void setActualUsedSpace(Long ActualUsedSpace) {
        this.ActualUsedSpace = ActualUsedSpace;
    }

    /**
     * Get 备份文件总个数。 
     * @return BackupFilesTotal 备份文件总个数。
     */
    public Long getBackupFilesTotal() {
        return this.BackupFilesTotal;
    }

    /**
     * Set 备份文件总个数。
     * @param BackupFilesTotal 备份文件总个数。
     */
    public void setBackupFilesTotal(Long BackupFilesTotal) {
        this.BackupFilesTotal = BackupFilesTotal;
    }

    /**
     * Get 备份占用收费空间，单位(KB)。 
     * @return BillingSpace 备份占用收费空间，单位(KB)。
     */
    public Long getBillingSpace() {
        return this.BillingSpace;
    }

    /**
     * Set 备份占用收费空间，单位(KB)。
     * @param BillingSpace 备份占用收费空间，单位(KB)。
     */
    public void setBillingSpace(Long BillingSpace) {
        this.BillingSpace = BillingSpace;
    }

    /**
     * Get 数据备份使用空间，单位(KB)。 
     * @return DataBackupSpace 数据备份使用空间，单位(KB)。
     */
    public Long getDataBackupSpace() {
        return this.DataBackupSpace;
    }

    /**
     * Set 数据备份使用空间，单位(KB)。
     * @param DataBackupSpace 数据备份使用空间，单位(KB)。
     */
    public void setDataBackupSpace(Long DataBackupSpace) {
        this.DataBackupSpace = DataBackupSpace;
    }

    /**
     * Get 数据备份文件总个数。 
     * @return DataBackupCount 数据备份文件总个数。
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set 数据备份文件总个数。
     * @param DataBackupCount 数据备份文件总个数。
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get 数据备份中手动备份使用空间，单位(KB)。 
     * @return ManualBackupSpace 数据备份中手动备份使用空间，单位(KB)。
     */
    public Long getManualBackupSpace() {
        return this.ManualBackupSpace;
    }

    /**
     * Set 数据备份中手动备份使用空间，单位(KB)。
     * @param ManualBackupSpace 数据备份中手动备份使用空间，单位(KB)。
     */
    public void setManualBackupSpace(Long ManualBackupSpace) {
        this.ManualBackupSpace = ManualBackupSpace;
    }

    /**
     * Get 数据备份中手动备份文件总个数。 
     * @return ManualBackupCount 数据备份中手动备份文件总个数。
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set 数据备份中手动备份文件总个数。
     * @param ManualBackupCount 数据备份中手动备份文件总个数。
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get 数据备份中自动备份使用空间，单位(KB)。 
     * @return AutoBackupSpace 数据备份中自动备份使用空间，单位(KB)。
     */
    public Long getAutoBackupSpace() {
        return this.AutoBackupSpace;
    }

    /**
     * Set 数据备份中自动备份使用空间，单位(KB)。
     * @param AutoBackupSpace 数据备份中自动备份使用空间，单位(KB)。
     */
    public void setAutoBackupSpace(Long AutoBackupSpace) {
        this.AutoBackupSpace = AutoBackupSpace;
    }

    /**
     * Get 数据备份中自动备份文件总个数。 
     * @return AutoBackupCount 数据备份中自动备份文件总个数。
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set 数据备份中自动备份文件总个数。
     * @param AutoBackupCount 数据备份中自动备份文件总个数。
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get 日志备份使用空间，单位(KB)。 
     * @return LogBackupSpace 日志备份使用空间，单位(KB)。
     */
    public Long getLogBackupSpace() {
        return this.LogBackupSpace;
    }

    /**
     * Set 日志备份使用空间，单位(KB)。
     * @param LogBackupSpace 日志备份使用空间，单位(KB)。
     */
    public void setLogBackupSpace(Long LogBackupSpace) {
        this.LogBackupSpace = LogBackupSpace;
    }

    /**
     * Get 日志备份文件总个数。 
     * @return LogBackupCount 日志备份文件总个数。
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set 日志备份文件总个数。
     * @param LogBackupCount 日志备份文件总个数。
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get 预估收费金额，单位（元/小时）。 
     * @return EstimatedAmount 预估收费金额，单位（元/小时）。
     */
    public Float getEstimatedAmount() {
        return this.EstimatedAmount;
    }

    /**
     * Set 预估收费金额，单位（元/小时）。
     * @param EstimatedAmount 预估收费金额，单位（元/小时）。
     */
    public void setEstimatedAmount(Float EstimatedAmount) {
        this.EstimatedAmount = EstimatedAmount;
    }

    /**
     * Get 本地备份文件总个数 
     * @return LocalBackupFilesTotal 本地备份文件总个数
     */
    public Long getLocalBackupFilesTotal() {
        return this.LocalBackupFilesTotal;
    }

    /**
     * Set 本地备份文件总个数
     * @param LocalBackupFilesTotal 本地备份文件总个数
     */
    public void setLocalBackupFilesTotal(Long LocalBackupFilesTotal) {
        this.LocalBackupFilesTotal = LocalBackupFilesTotal;
    }

    /**
     * Get 跨地域备份文件总个数 
     * @return CrossBackupFilesTotal 跨地域备份文件总个数
     */
    public Long getCrossBackupFilesTotal() {
        return this.CrossBackupFilesTotal;
    }

    /**
     * Set 跨地域备份文件总个数
     * @param CrossBackupFilesTotal 跨地域备份文件总个数
     */
    public void setCrossBackupFilesTotal(Long CrossBackupFilesTotal) {
        this.CrossBackupFilesTotal = CrossBackupFilesTotal;
    }

    /**
     * Get 跨地域备份占用收费空间，单位（KB） 
     * @return CrossBillingSpace 跨地域备份占用收费空间，单位（KB）
     */
    public Long getCrossBillingSpace() {
        return this.CrossBillingSpace;
    }

    /**
     * Set 跨地域备份占用收费空间，单位（KB）
     * @param CrossBillingSpace 跨地域备份占用收费空间，单位（KB）
     */
    public void setCrossBillingSpace(Long CrossBillingSpace) {
        this.CrossBillingSpace = CrossBillingSpace;
    }

    /**
     * Get 跨地域自动数据备份使用空间，单位（KB） 
     * @return CrossAutoBackupSpace 跨地域自动数据备份使用空间，单位（KB）
     */
    public Long getCrossAutoBackupSpace() {
        return this.CrossAutoBackupSpace;
    }

    /**
     * Set 跨地域自动数据备份使用空间，单位（KB）
     * @param CrossAutoBackupSpace 跨地域自动数据备份使用空间，单位（KB）
     */
    public void setCrossAutoBackupSpace(Long CrossAutoBackupSpace) {
        this.CrossAutoBackupSpace = CrossAutoBackupSpace;
    }

    /**
     * Get 跨地域自动数据备份文件总个数 
     * @return CrossAutoBackupCount 跨地域自动数据备份文件总个数
     */
    public Long getCrossAutoBackupCount() {
        return this.CrossAutoBackupCount;
    }

    /**
     * Set 跨地域自动数据备份文件总个数
     * @param CrossAutoBackupCount 跨地域自动数据备份文件总个数
     */
    public void setCrossAutoBackupCount(Long CrossAutoBackupCount) {
        this.CrossAutoBackupCount = CrossAutoBackupCount;
    }

    /**
     * Get 本地日志备份使用空间，单位（KB） 
     * @return LocalLogBackupSpace 本地日志备份使用空间，单位（KB）
     */
    public Long getLocalLogBackupSpace() {
        return this.LocalLogBackupSpace;
    }

    /**
     * Set 本地日志备份使用空间，单位（KB）
     * @param LocalLogBackupSpace 本地日志备份使用空间，单位（KB）
     */
    public void setLocalLogBackupSpace(Long LocalLogBackupSpace) {
        this.LocalLogBackupSpace = LocalLogBackupSpace;
    }

    /**
     * Get 本地日志备份文件总个数 
     * @return LocalLogBackupCount 本地日志备份文件总个数
     */
    public Long getLocalLogBackupCount() {
        return this.LocalLogBackupCount;
    }

    /**
     * Set 本地日志备份文件总个数
     * @param LocalLogBackupCount 本地日志备份文件总个数
     */
    public void setLocalLogBackupCount(Long LocalLogBackupCount) {
        this.LocalLogBackupCount = LocalLogBackupCount;
    }

    /**
     * Get 跨地域日志备份使用空间，单位（KB） 
     * @return CrossLogBackupSpace 跨地域日志备份使用空间，单位（KB）
     */
    public Long getCrossLogBackupSpace() {
        return this.CrossLogBackupSpace;
    }

    /**
     * Set 跨地域日志备份使用空间，单位（KB）
     * @param CrossLogBackupSpace 跨地域日志备份使用空间，单位（KB）
     */
    public void setCrossLogBackupSpace(Long CrossLogBackupSpace) {
        this.CrossLogBackupSpace = CrossLogBackupSpace;
    }

    /**
     * Get 跨地域日志备份文件总个数 
     * @return CrossLogBackupCount 跨地域日志备份文件总个数
     */
    public Long getCrossLogBackupCount() {
        return this.CrossLogBackupCount;
    }

    /**
     * Set 跨地域日志备份文件总个数
     * @param CrossLogBackupCount 跨地域日志备份文件总个数
     */
    public void setCrossLogBackupCount(Long CrossLogBackupCount) {
        this.CrossLogBackupCount = CrossLogBackupCount;
    }

    /**
     * Get 跨地域备份预估收费金额，单位（元/小时） 
     * @return CrossEstimatedAmount 跨地域备份预估收费金额，单位（元/小时）
     */
    public Float getCrossEstimatedAmount() {
        return this.CrossEstimatedAmount;
    }

    /**
     * Set 跨地域备份预估收费金额，单位（元/小时）
     * @param CrossEstimatedAmount 跨地域备份预估收费金额，单位（元/小时）
     */
    public void setCrossEstimatedAmount(Float CrossEstimatedAmount) {
        this.CrossEstimatedAmount = CrossEstimatedAmount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupSummaryResponse(DescribeBackupSummaryResponse source) {
        if (source.FreeSpace != null) {
            this.FreeSpace = new Long(source.FreeSpace);
        }
        if (source.ActualUsedSpace != null) {
            this.ActualUsedSpace = new Long(source.ActualUsedSpace);
        }
        if (source.BackupFilesTotal != null) {
            this.BackupFilesTotal = new Long(source.BackupFilesTotal);
        }
        if (source.BillingSpace != null) {
            this.BillingSpace = new Long(source.BillingSpace);
        }
        if (source.DataBackupSpace != null) {
            this.DataBackupSpace = new Long(source.DataBackupSpace);
        }
        if (source.DataBackupCount != null) {
            this.DataBackupCount = new Long(source.DataBackupCount);
        }
        if (source.ManualBackupSpace != null) {
            this.ManualBackupSpace = new Long(source.ManualBackupSpace);
        }
        if (source.ManualBackupCount != null) {
            this.ManualBackupCount = new Long(source.ManualBackupCount);
        }
        if (source.AutoBackupSpace != null) {
            this.AutoBackupSpace = new Long(source.AutoBackupSpace);
        }
        if (source.AutoBackupCount != null) {
            this.AutoBackupCount = new Long(source.AutoBackupCount);
        }
        if (source.LogBackupSpace != null) {
            this.LogBackupSpace = new Long(source.LogBackupSpace);
        }
        if (source.LogBackupCount != null) {
            this.LogBackupCount = new Long(source.LogBackupCount);
        }
        if (source.EstimatedAmount != null) {
            this.EstimatedAmount = new Float(source.EstimatedAmount);
        }
        if (source.LocalBackupFilesTotal != null) {
            this.LocalBackupFilesTotal = new Long(source.LocalBackupFilesTotal);
        }
        if (source.CrossBackupFilesTotal != null) {
            this.CrossBackupFilesTotal = new Long(source.CrossBackupFilesTotal);
        }
        if (source.CrossBillingSpace != null) {
            this.CrossBillingSpace = new Long(source.CrossBillingSpace);
        }
        if (source.CrossAutoBackupSpace != null) {
            this.CrossAutoBackupSpace = new Long(source.CrossAutoBackupSpace);
        }
        if (source.CrossAutoBackupCount != null) {
            this.CrossAutoBackupCount = new Long(source.CrossAutoBackupCount);
        }
        if (source.LocalLogBackupSpace != null) {
            this.LocalLogBackupSpace = new Long(source.LocalLogBackupSpace);
        }
        if (source.LocalLogBackupCount != null) {
            this.LocalLogBackupCount = new Long(source.LocalLogBackupCount);
        }
        if (source.CrossLogBackupSpace != null) {
            this.CrossLogBackupSpace = new Long(source.CrossLogBackupSpace);
        }
        if (source.CrossLogBackupCount != null) {
            this.CrossLogBackupCount = new Long(source.CrossLogBackupCount);
        }
        if (source.CrossEstimatedAmount != null) {
            this.CrossEstimatedAmount = new Float(source.CrossEstimatedAmount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FreeSpace", this.FreeSpace);
        this.setParamSimple(map, prefix + "ActualUsedSpace", this.ActualUsedSpace);
        this.setParamSimple(map, prefix + "BackupFilesTotal", this.BackupFilesTotal);
        this.setParamSimple(map, prefix + "BillingSpace", this.BillingSpace);
        this.setParamSimple(map, prefix + "DataBackupSpace", this.DataBackupSpace);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupSpace", this.ManualBackupSpace);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupSpace", this.AutoBackupSpace);
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSpace", this.LogBackupSpace);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "EstimatedAmount", this.EstimatedAmount);
        this.setParamSimple(map, prefix + "LocalBackupFilesTotal", this.LocalBackupFilesTotal);
        this.setParamSimple(map, prefix + "CrossBackupFilesTotal", this.CrossBackupFilesTotal);
        this.setParamSimple(map, prefix + "CrossBillingSpace", this.CrossBillingSpace);
        this.setParamSimple(map, prefix + "CrossAutoBackupSpace", this.CrossAutoBackupSpace);
        this.setParamSimple(map, prefix + "CrossAutoBackupCount", this.CrossAutoBackupCount);
        this.setParamSimple(map, prefix + "LocalLogBackupSpace", this.LocalLogBackupSpace);
        this.setParamSimple(map, prefix + "LocalLogBackupCount", this.LocalLogBackupCount);
        this.setParamSimple(map, prefix + "CrossLogBackupSpace", this.CrossLogBackupSpace);
        this.setParamSimple(map, prefix + "CrossLogBackupCount", this.CrossLogBackupCount);
        this.setParamSimple(map, prefix + "CrossEstimatedAmount", this.CrossEstimatedAmount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

