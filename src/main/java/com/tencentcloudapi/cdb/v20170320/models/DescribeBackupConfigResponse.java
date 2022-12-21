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

public class DescribeBackupConfigResponse extends AbstractModel{

    /**
    * 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
    */
    @SerializedName("StartTimeMin")
    @Expose
    private Long StartTimeMin;

    /**
    * 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
    */
    @SerializedName("StartTimeMax")
    @Expose
    private Long StartTimeMax;

    /**
    * 备份文件保留时间，单位为天。
    */
    @SerializedName("BackupExpireDays")
    @Expose
    private Long BackupExpireDays;

    /**
    * 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * Binlog 文件保留时间，单位为天。
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Long BinlogExpireDays;

    /**
    * 实例自动备份的时间窗。
    */
    @SerializedName("BackupTimeWindow")
    @Expose
    private CommonTimeWindow BackupTimeWindow;

    /**
    * 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off
    */
    @SerializedName("EnableBackupPeriodSave")
    @Expose
    private String EnableBackupPeriodSave;

    /**
    * 定期保留最长天数，最小值：90，最大值：3650，默认值：1080
    */
    @SerializedName("BackupPeriodSaveDays")
    @Expose
    private Long BackupPeriodSaveDays;

    /**
    * 定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly
    */
    @SerializedName("BackupPeriodSaveInterval")
    @Expose
    private String BackupPeriodSaveInterval;

    /**
    * 定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1
    */
    @SerializedName("BackupPeriodSaveCount")
    @Expose
    private Long BackupPeriodSaveCount;

    /**
    * 定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss
    */
    @SerializedName("StartBackupPeriodSaveDate")
    @Expose
    private String StartBackupPeriodSaveDate;

    /**
    * 是否开启数据备份归档策略，off-关闭，on-打开，默认为off
    */
    @SerializedName("EnableBackupArchive")
    @Expose
    private String EnableBackupArchive;

    /**
    * 数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数
    */
    @SerializedName("BackupArchiveDays")
    @Expose
    private Long BackupArchiveDays;

    /**
    * 是否开启日志备份归档策略，off-关闭，on-打开，默认为off
    */
    @SerializedName("EnableBinlogArchive")
    @Expose
    private String EnableBinlogArchive;

    /**
    * 日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数
    */
    @SerializedName("BinlogArchiveDays")
    @Expose
    private Long BinlogArchiveDays;

    /**
    * 是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off
    */
    @SerializedName("EnableBackupStandby")
    @Expose
    private String EnableBackupStandby;

    /**
    * 数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数
    */
    @SerializedName("BackupStandbyDays")
    @Expose
    private Long BackupStandbyDays;

    /**
    * 是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off
    */
    @SerializedName("EnableBinlogStandby")
    @Expose
    private String EnableBinlogStandby;

    /**
    * 日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数
    */
    @SerializedName("BinlogStandbyDays")
    @Expose
    private Long BinlogStandbyDays;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段） 
     * @return StartTimeMin 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     */
    public Long getStartTimeMin() {
        return this.StartTimeMin;
    }

    /**
     * Set 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     * @param StartTimeMin 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     */
    public void setStartTimeMin(Long StartTimeMin) {
        this.StartTimeMin = StartTimeMin;
    }

    /**
     * Get 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段） 
     * @return StartTimeMax 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     */
    public Long getStartTimeMax() {
        return this.StartTimeMax;
    }

    /**
     * Set 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     * @param StartTimeMax 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     */
    public void setStartTimeMax(Long StartTimeMax) {
        this.StartTimeMax = StartTimeMax;
    }

    /**
     * Get 备份文件保留时间，单位为天。 
     * @return BackupExpireDays 备份文件保留时间，单位为天。
     */
    public Long getBackupExpireDays() {
        return this.BackupExpireDays;
    }

    /**
     * Set 备份文件保留时间，单位为天。
     * @param BackupExpireDays 备份文件保留时间，单位为天。
     */
    public void setBackupExpireDays(Long BackupExpireDays) {
        this.BackupExpireDays = BackupExpireDays;
    }

    /**
     * Get 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。 
     * @return BackupMethod 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。
     * @param BackupMethod 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Binlog 文件保留时间，单位为天。 
     * @return BinlogExpireDays Binlog 文件保留时间，单位为天。
     */
    public Long getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * Set Binlog 文件保留时间，单位为天。
     * @param BinlogExpireDays Binlog 文件保留时间，单位为天。
     */
    public void setBinlogExpireDays(Long BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
    }

    /**
     * Get 实例自动备份的时间窗。 
     * @return BackupTimeWindow 实例自动备份的时间窗。
     */
    public CommonTimeWindow getBackupTimeWindow() {
        return this.BackupTimeWindow;
    }

    /**
     * Set 实例自动备份的时间窗。
     * @param BackupTimeWindow 实例自动备份的时间窗。
     */
    public void setBackupTimeWindow(CommonTimeWindow BackupTimeWindow) {
        this.BackupTimeWindow = BackupTimeWindow;
    }

    /**
     * Get 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off 
     * @return EnableBackupPeriodSave 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off
     */
    public String getEnableBackupPeriodSave() {
        return this.EnableBackupPeriodSave;
    }

    /**
     * Set 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off
     * @param EnableBackupPeriodSave 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off
     */
    public void setEnableBackupPeriodSave(String EnableBackupPeriodSave) {
        this.EnableBackupPeriodSave = EnableBackupPeriodSave;
    }

    /**
     * Get 定期保留最长天数，最小值：90，最大值：3650，默认值：1080 
     * @return BackupPeriodSaveDays 定期保留最长天数，最小值：90，最大值：3650，默认值：1080
     */
    public Long getBackupPeriodSaveDays() {
        return this.BackupPeriodSaveDays;
    }

    /**
     * Set 定期保留最长天数，最小值：90，最大值：3650，默认值：1080
     * @param BackupPeriodSaveDays 定期保留最长天数，最小值：90，最大值：3650，默认值：1080
     */
    public void setBackupPeriodSaveDays(Long BackupPeriodSaveDays) {
        this.BackupPeriodSaveDays = BackupPeriodSaveDays;
    }

    /**
     * Get 定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly 
     * @return BackupPeriodSaveInterval 定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly
     */
    public String getBackupPeriodSaveInterval() {
        return this.BackupPeriodSaveInterval;
    }

    /**
     * Set 定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly
     * @param BackupPeriodSaveInterval 定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly
     */
    public void setBackupPeriodSaveInterval(String BackupPeriodSaveInterval) {
        this.BackupPeriodSaveInterval = BackupPeriodSaveInterval;
    }

    /**
     * Get 定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1 
     * @return BackupPeriodSaveCount 定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1
     */
    public Long getBackupPeriodSaveCount() {
        return this.BackupPeriodSaveCount;
    }

    /**
     * Set 定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1
     * @param BackupPeriodSaveCount 定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1
     */
    public void setBackupPeriodSaveCount(Long BackupPeriodSaveCount) {
        this.BackupPeriodSaveCount = BackupPeriodSaveCount;
    }

    /**
     * Get 定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss 
     * @return StartBackupPeriodSaveDate 定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss
     */
    public String getStartBackupPeriodSaveDate() {
        return this.StartBackupPeriodSaveDate;
    }

    /**
     * Set 定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss
     * @param StartBackupPeriodSaveDate 定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss
     */
    public void setStartBackupPeriodSaveDate(String StartBackupPeriodSaveDate) {
        this.StartBackupPeriodSaveDate = StartBackupPeriodSaveDate;
    }

    /**
     * Get 是否开启数据备份归档策略，off-关闭，on-打开，默认为off 
     * @return EnableBackupArchive 是否开启数据备份归档策略，off-关闭，on-打开，默认为off
     */
    public String getEnableBackupArchive() {
        return this.EnableBackupArchive;
    }

    /**
     * Set 是否开启数据备份归档策略，off-关闭，on-打开，默认为off
     * @param EnableBackupArchive 是否开启数据备份归档策略，off-关闭，on-打开，默认为off
     */
    public void setEnableBackupArchive(String EnableBackupArchive) {
        this.EnableBackupArchive = EnableBackupArchive;
    }

    /**
     * Get 数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数 
     * @return BackupArchiveDays 数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数
     */
    public Long getBackupArchiveDays() {
        return this.BackupArchiveDays;
    }

    /**
     * Set 数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数
     * @param BackupArchiveDays 数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数
     */
    public void setBackupArchiveDays(Long BackupArchiveDays) {
        this.BackupArchiveDays = BackupArchiveDays;
    }

    /**
     * Get 是否开启日志备份归档策略，off-关闭，on-打开，默认为off 
     * @return EnableBinlogArchive 是否开启日志备份归档策略，off-关闭，on-打开，默认为off
     */
    public String getEnableBinlogArchive() {
        return this.EnableBinlogArchive;
    }

    /**
     * Set 是否开启日志备份归档策略，off-关闭，on-打开，默认为off
     * @param EnableBinlogArchive 是否开启日志备份归档策略，off-关闭，on-打开，默认为off
     */
    public void setEnableBinlogArchive(String EnableBinlogArchive) {
        this.EnableBinlogArchive = EnableBinlogArchive;
    }

    /**
     * Get 日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数 
     * @return BinlogArchiveDays 日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数
     */
    public Long getBinlogArchiveDays() {
        return this.BinlogArchiveDays;
    }

    /**
     * Set 日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数
     * @param BinlogArchiveDays 日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数
     */
    public void setBinlogArchiveDays(Long BinlogArchiveDays) {
        this.BinlogArchiveDays = BinlogArchiveDays;
    }

    /**
     * Get 是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off 
     * @return EnableBackupStandby 是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off
     */
    public String getEnableBackupStandby() {
        return this.EnableBackupStandby;
    }

    /**
     * Set 是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off
     * @param EnableBackupStandby 是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off
     */
    public void setEnableBackupStandby(String EnableBackupStandby) {
        this.EnableBackupStandby = EnableBackupStandby;
    }

    /**
     * Get 数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数 
     * @return BackupStandbyDays 数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数
     */
    public Long getBackupStandbyDays() {
        return this.BackupStandbyDays;
    }

    /**
     * Set 数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数
     * @param BackupStandbyDays 数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数
     */
    public void setBackupStandbyDays(Long BackupStandbyDays) {
        this.BackupStandbyDays = BackupStandbyDays;
    }

    /**
     * Get 是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off 
     * @return EnableBinlogStandby 是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off
     */
    public String getEnableBinlogStandby() {
        return this.EnableBinlogStandby;
    }

    /**
     * Set 是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off
     * @param EnableBinlogStandby 是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off
     */
    public void setEnableBinlogStandby(String EnableBinlogStandby) {
        this.EnableBinlogStandby = EnableBinlogStandby;
    }

    /**
     * Get 日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数 
     * @return BinlogStandbyDays 日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数
     */
    public Long getBinlogStandbyDays() {
        return this.BinlogStandbyDays;
    }

    /**
     * Set 日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数
     * @param BinlogStandbyDays 日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数
     */
    public void setBinlogStandbyDays(Long BinlogStandbyDays) {
        this.BinlogStandbyDays = BinlogStandbyDays;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupConfigResponse(DescribeBackupConfigResponse source) {
        if (source.StartTimeMin != null) {
            this.StartTimeMin = new Long(source.StartTimeMin);
        }
        if (source.StartTimeMax != null) {
            this.StartTimeMax = new Long(source.StartTimeMax);
        }
        if (source.BackupExpireDays != null) {
            this.BackupExpireDays = new Long(source.BackupExpireDays);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BinlogExpireDays != null) {
            this.BinlogExpireDays = new Long(source.BinlogExpireDays);
        }
        if (source.BackupTimeWindow != null) {
            this.BackupTimeWindow = new CommonTimeWindow(source.BackupTimeWindow);
        }
        if (source.EnableBackupPeriodSave != null) {
            this.EnableBackupPeriodSave = new String(source.EnableBackupPeriodSave);
        }
        if (source.BackupPeriodSaveDays != null) {
            this.BackupPeriodSaveDays = new Long(source.BackupPeriodSaveDays);
        }
        if (source.BackupPeriodSaveInterval != null) {
            this.BackupPeriodSaveInterval = new String(source.BackupPeriodSaveInterval);
        }
        if (source.BackupPeriodSaveCount != null) {
            this.BackupPeriodSaveCount = new Long(source.BackupPeriodSaveCount);
        }
        if (source.StartBackupPeriodSaveDate != null) {
            this.StartBackupPeriodSaveDate = new String(source.StartBackupPeriodSaveDate);
        }
        if (source.EnableBackupArchive != null) {
            this.EnableBackupArchive = new String(source.EnableBackupArchive);
        }
        if (source.BackupArchiveDays != null) {
            this.BackupArchiveDays = new Long(source.BackupArchiveDays);
        }
        if (source.EnableBinlogArchive != null) {
            this.EnableBinlogArchive = new String(source.EnableBinlogArchive);
        }
        if (source.BinlogArchiveDays != null) {
            this.BinlogArchiveDays = new Long(source.BinlogArchiveDays);
        }
        if (source.EnableBackupStandby != null) {
            this.EnableBackupStandby = new String(source.EnableBackupStandby);
        }
        if (source.BackupStandbyDays != null) {
            this.BackupStandbyDays = new Long(source.BackupStandbyDays);
        }
        if (source.EnableBinlogStandby != null) {
            this.EnableBinlogStandby = new String(source.EnableBinlogStandby);
        }
        if (source.BinlogStandbyDays != null) {
            this.BinlogStandbyDays = new Long(source.BinlogStandbyDays);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeMin", this.StartTimeMin);
        this.setParamSimple(map, prefix + "StartTimeMax", this.StartTimeMax);
        this.setParamSimple(map, prefix + "BackupExpireDays", this.BackupExpireDays);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BinlogExpireDays", this.BinlogExpireDays);
        this.setParamObj(map, prefix + "BackupTimeWindow.", this.BackupTimeWindow);
        this.setParamSimple(map, prefix + "EnableBackupPeriodSave", this.EnableBackupPeriodSave);
        this.setParamSimple(map, prefix + "BackupPeriodSaveDays", this.BackupPeriodSaveDays);
        this.setParamSimple(map, prefix + "BackupPeriodSaveInterval", this.BackupPeriodSaveInterval);
        this.setParamSimple(map, prefix + "BackupPeriodSaveCount", this.BackupPeriodSaveCount);
        this.setParamSimple(map, prefix + "StartBackupPeriodSaveDate", this.StartBackupPeriodSaveDate);
        this.setParamSimple(map, prefix + "EnableBackupArchive", this.EnableBackupArchive);
        this.setParamSimple(map, prefix + "BackupArchiveDays", this.BackupArchiveDays);
        this.setParamSimple(map, prefix + "EnableBinlogArchive", this.EnableBinlogArchive);
        this.setParamSimple(map, prefix + "BinlogArchiveDays", this.BinlogArchiveDays);
        this.setParamSimple(map, prefix + "EnableBackupStandby", this.EnableBackupStandby);
        this.setParamSimple(map, prefix + "BackupStandbyDays", this.BackupStandbyDays);
        this.setParamSimple(map, prefix + "EnableBinlogStandby", this.EnableBinlogStandby);
        this.setParamSimple(map, prefix + "BinlogStandbyDays", this.BinlogStandbyDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

