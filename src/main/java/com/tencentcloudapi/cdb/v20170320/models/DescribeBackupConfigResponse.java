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

public class DescribeBackupConfigResponse extends AbstractModel {

    /**
    * <p>自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p>
    */
    @SerializedName("StartTimeMin")
    @Expose
    private Long StartTimeMin;

    /**
    * <p>自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p>
    */
    @SerializedName("StartTimeMax")
    @Expose
    private Long StartTimeMax;

    /**
    * <p>备份文件保留时间，单位为天。</p>
    */
    @SerializedName("BackupExpireDays")
    @Expose
    private Long BackupExpireDays;

    /**
    * <p>备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。</p>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>Binlog 文件保留时间，单位为天。</p>
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Long BinlogExpireDays;

    /**
    * <p>实例自动备份的时间窗。</p>
    */
    @SerializedName("BackupTimeWindow")
    @Expose
    private CommonTimeWindow BackupTimeWindow;

    /**
    * <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off</p>
    */
    @SerializedName("EnableBackupPeriodSave")
    @Expose
    private String EnableBackupPeriodSave;

    /**
    * <p>定期保留最长天数，最小值：90，最大值：3650，默认值：1080</p>
    */
    @SerializedName("BackupPeriodSaveDays")
    @Expose
    private Long BackupPeriodSaveDays;

    /**
    * <p>定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly</p>
    */
    @SerializedName("BackupPeriodSaveInterval")
    @Expose
    private String BackupPeriodSaveInterval;

    /**
    * <p>定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1</p>
    */
    @SerializedName("BackupPeriodSaveCount")
    @Expose
    private Long BackupPeriodSaveCount;

    /**
    * <p>定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss</p>
    */
    @SerializedName("StartBackupPeriodSaveDate")
    @Expose
    private String StartBackupPeriodSaveDate;

    /**
    * <p>是否开启数据备份归档策略，off-关闭，on-打开，默认为off</p>
    */
    @SerializedName("EnableBackupArchive")
    @Expose
    private String EnableBackupArchive;

    /**
    * <p>数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数</p>
    */
    @SerializedName("BackupArchiveDays")
    @Expose
    private Long BackupArchiveDays;

    /**
    * <p>是否开启日志备份归档策略，off-关闭，on-打开，默认为off</p>
    */
    @SerializedName("EnableBinlogArchive")
    @Expose
    private String EnableBinlogArchive;

    /**
    * <p>日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数</p>
    */
    @SerializedName("BinlogArchiveDays")
    @Expose
    private Long BinlogArchiveDays;

    /**
    * <p>是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off</p>
    */
    @SerializedName("EnableBackupStandby")
    @Expose
    private String EnableBackupStandby;

    /**
    * <p>数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p>
    */
    @SerializedName("BackupStandbyDays")
    @Expose
    private Long BackupStandbyDays;

    /**
    * <p>是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off</p>
    */
    @SerializedName("EnableBinlogStandby")
    @Expose
    private String EnableBinlogStandby;

    /**
    * <p>日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p>
    */
    @SerializedName("BinlogStandbyDays")
    @Expose
    private Long BinlogStandbyDays;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p> 
     * @return StartTimeMin <p>自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p>
     * @deprecated
     */
    @Deprecated
    public Long getStartTimeMin() {
        return this.StartTimeMin;
    }

    /**
     * Set <p>自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p>
     * @param StartTimeMin <p>自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p>
     * @deprecated
     */
    @Deprecated
    public void setStartTimeMin(Long StartTimeMin) {
        this.StartTimeMin = StartTimeMin;
    }

    /**
     * Get <p>自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p> 
     * @return StartTimeMax <p>自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p>
     * @deprecated
     */
    @Deprecated
    public Long getStartTimeMax() {
        return this.StartTimeMax;
    }

    /**
     * Set <p>自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p>
     * @param StartTimeMax <p>自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）</p>
     * @deprecated
     */
    @Deprecated
    public void setStartTimeMax(Long StartTimeMax) {
        this.StartTimeMax = StartTimeMax;
    }

    /**
     * Get <p>备份文件保留时间，单位为天。</p> 
     * @return BackupExpireDays <p>备份文件保留时间，单位为天。</p>
     */
    public Long getBackupExpireDays() {
        return this.BackupExpireDays;
    }

    /**
     * Set <p>备份文件保留时间，单位为天。</p>
     * @param BackupExpireDays <p>备份文件保留时间，单位为天。</p>
     */
    public void setBackupExpireDays(Long BackupExpireDays) {
        this.BackupExpireDays = BackupExpireDays;
    }

    /**
     * Get <p>备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。</p> 
     * @return BackupMethod <p>备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。</p>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。</p>
     * @param BackupMethod <p>备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。</p>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>Binlog 文件保留时间，单位为天。</p> 
     * @return BinlogExpireDays <p>Binlog 文件保留时间，单位为天。</p>
     */
    public Long getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * Set <p>Binlog 文件保留时间，单位为天。</p>
     * @param BinlogExpireDays <p>Binlog 文件保留时间，单位为天。</p>
     */
    public void setBinlogExpireDays(Long BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
    }

    /**
     * Get <p>实例自动备份的时间窗。</p> 
     * @return BackupTimeWindow <p>实例自动备份的时间窗。</p>
     */
    public CommonTimeWindow getBackupTimeWindow() {
        return this.BackupTimeWindow;
    }

    /**
     * Set <p>实例自动备份的时间窗。</p>
     * @param BackupTimeWindow <p>实例自动备份的时间窗。</p>
     */
    public void setBackupTimeWindow(CommonTimeWindow BackupTimeWindow) {
        this.BackupTimeWindow = BackupTimeWindow;
    }

    /**
     * Get <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off</p> 
     * @return EnableBackupPeriodSave <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off</p>
     */
    public String getEnableBackupPeriodSave() {
        return this.EnableBackupPeriodSave;
    }

    /**
     * Set <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off</p>
     * @param EnableBackupPeriodSave <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off</p>
     */
    public void setEnableBackupPeriodSave(String EnableBackupPeriodSave) {
        this.EnableBackupPeriodSave = EnableBackupPeriodSave;
    }

    /**
     * Get <p>定期保留最长天数，最小值：90，最大值：3650，默认值：1080</p> 
     * @return BackupPeriodSaveDays <p>定期保留最长天数，最小值：90，最大值：3650，默认值：1080</p>
     */
    public Long getBackupPeriodSaveDays() {
        return this.BackupPeriodSaveDays;
    }

    /**
     * Set <p>定期保留最长天数，最小值：90，最大值：3650，默认值：1080</p>
     * @param BackupPeriodSaveDays <p>定期保留最长天数，最小值：90，最大值：3650，默认值：1080</p>
     */
    public void setBackupPeriodSaveDays(Long BackupPeriodSaveDays) {
        this.BackupPeriodSaveDays = BackupPeriodSaveDays;
    }

    /**
     * Get <p>定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly</p> 
     * @return BackupPeriodSaveInterval <p>定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly</p>
     */
    public String getBackupPeriodSaveInterval() {
        return this.BackupPeriodSaveInterval;
    }

    /**
     * Set <p>定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly</p>
     * @param BackupPeriodSaveInterval <p>定期保留策略周期，可取值：weekly - 周，monthly - 月， quarterly - 季度，yearly - 年，默认为monthly</p>
     */
    public void setBackupPeriodSaveInterval(String BackupPeriodSaveInterval) {
        this.BackupPeriodSaveInterval = BackupPeriodSaveInterval;
    }

    /**
     * Get <p>定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1</p> 
     * @return BackupPeriodSaveCount <p>定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1</p>
     */
    public Long getBackupPeriodSaveCount() {
        return this.BackupPeriodSaveCount;
    }

    /**
     * Set <p>定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1</p>
     * @param BackupPeriodSaveCount <p>定期保留的备份数量，最小值为1，最大值不超过定期保留策略周期内常规备份个数，默认值为1</p>
     */
    public void setBackupPeriodSaveCount(Long BackupPeriodSaveCount) {
        this.BackupPeriodSaveCount = BackupPeriodSaveCount;
    }

    /**
     * Get <p>定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss</p> 
     * @return StartBackupPeriodSaveDate <p>定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss</p>
     */
    public String getStartBackupPeriodSaveDate() {
        return this.StartBackupPeriodSaveDate;
    }

    /**
     * Set <p>定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss</p>
     * @param StartBackupPeriodSaveDate <p>定期保留策略周期起始日期，格式：YYYY-MM-dd HH:mm:ss</p>
     */
    public void setStartBackupPeriodSaveDate(String StartBackupPeriodSaveDate) {
        this.StartBackupPeriodSaveDate = StartBackupPeriodSaveDate;
    }

    /**
     * Get <p>是否开启数据备份归档策略，off-关闭，on-打开，默认为off</p> 
     * @return EnableBackupArchive <p>是否开启数据备份归档策略，off-关闭，on-打开，默认为off</p>
     */
    public String getEnableBackupArchive() {
        return this.EnableBackupArchive;
    }

    /**
     * Set <p>是否开启数据备份归档策略，off-关闭，on-打开，默认为off</p>
     * @param EnableBackupArchive <p>是否开启数据备份归档策略，off-关闭，on-打开，默认为off</p>
     */
    public void setEnableBackupArchive(String EnableBackupArchive) {
        this.EnableBackupArchive = EnableBackupArchive;
    }

    /**
     * Get <p>数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数</p> 
     * @return BackupArchiveDays <p>数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数</p>
     */
    public Long getBackupArchiveDays() {
        return this.BackupArchiveDays;
    }

    /**
     * Set <p>数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数</p>
     * @param BackupArchiveDays <p>数据备份归档起始天数，数据备份达到归档起始天数时进行归档，最小为180天，不得大于数据备份保留天数</p>
     */
    public void setBackupArchiveDays(Long BackupArchiveDays) {
        this.BackupArchiveDays = BackupArchiveDays;
    }

    /**
     * Get <p>是否开启日志备份归档策略，off-关闭，on-打开，默认为off</p> 
     * @return EnableBinlogArchive <p>是否开启日志备份归档策略，off-关闭，on-打开，默认为off</p>
     */
    public String getEnableBinlogArchive() {
        return this.EnableBinlogArchive;
    }

    /**
     * Set <p>是否开启日志备份归档策略，off-关闭，on-打开，默认为off</p>
     * @param EnableBinlogArchive <p>是否开启日志备份归档策略，off-关闭，on-打开，默认为off</p>
     */
    public void setEnableBinlogArchive(String EnableBinlogArchive) {
        this.EnableBinlogArchive = EnableBinlogArchive;
    }

    /**
     * Get <p>日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数</p> 
     * @return BinlogArchiveDays <p>日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数</p>
     */
    public Long getBinlogArchiveDays() {
        return this.BinlogArchiveDays;
    }

    /**
     * Set <p>日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数</p>
     * @param BinlogArchiveDays <p>日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数</p>
     */
    public void setBinlogArchiveDays(Long BinlogArchiveDays) {
        this.BinlogArchiveDays = BinlogArchiveDays;
    }

    /**
     * Get <p>是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off</p> 
     * @return EnableBackupStandby <p>是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off</p>
     */
    public String getEnableBackupStandby() {
        return this.EnableBackupStandby;
    }

    /**
     * Set <p>是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off</p>
     * @param EnableBackupStandby <p>是否开启数据备份标准存储策略，off-关闭，on-打开，默认为off</p>
     */
    public void setEnableBackupStandby(String EnableBackupStandby) {
        this.EnableBackupStandby = EnableBackupStandby;
    }

    /**
     * Get <p>数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p> 
     * @return BackupStandbyDays <p>数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p>
     */
    public Long getBackupStandbyDays() {
        return this.BackupStandbyDays;
    }

    /**
     * Set <p>数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p>
     * @param BackupStandbyDays <p>数据备份标准存储起始天数，数据备份达到标准存储起始天数时进行转换，最小为30天，不得大于数据备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p>
     */
    public void setBackupStandbyDays(Long BackupStandbyDays) {
        this.BackupStandbyDays = BackupStandbyDays;
    }

    /**
     * Get <p>是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off</p> 
     * @return EnableBinlogStandby <p>是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off</p>
     */
    public String getEnableBinlogStandby() {
        return this.EnableBinlogStandby;
    }

    /**
     * Set <p>是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off</p>
     * @param EnableBinlogStandby <p>是否开启日志备份标准存储策略，off-关闭，on-打开，默认为off</p>
     */
    public void setEnableBinlogStandby(String EnableBinlogStandby) {
        this.EnableBinlogStandby = EnableBinlogStandby;
    }

    /**
     * Get <p>日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p> 
     * @return BinlogStandbyDays <p>日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p>
     */
    public Long getBinlogStandbyDays() {
        return this.BinlogStandbyDays;
    }

    /**
     * Set <p>日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p>
     * @param BinlogStandbyDays <p>日志备份标准存储起始天数，日志备份达到标准存储起始天数时进行转换，最小为30天，不得大于日志备份保留天数。如果开启备份归档，不得大于等于备份归档天数</p>
     */
    public void setBinlogStandbyDays(Long BinlogStandbyDays) {
        this.BinlogStandbyDays = BinlogStandbyDays;
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

