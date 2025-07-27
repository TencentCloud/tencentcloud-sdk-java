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

public class ModifyBackupConfigRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据备份文件的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。
2. MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。
    */
    @SerializedName("ExpireDays")
    @Expose
    private Long ExpireDays;

    /**
    * (将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 自动备份方式，仅支持：physical - 物理冷备
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * binlog 的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。
2. MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Long BinlogExpireDays;

    /**
    * 备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）
    */
    @SerializedName("BackupTimeWindow")
    @Expose
    private CommonTimeWindow BackupTimeWindow;

    /**
    * 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。
    */
    @SerializedName("EnableBackupPeriodSave")
    @Expose
    private String EnableBackupPeriodSave;

    /**
    * 长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效
    */
    @SerializedName("EnableBackupPeriodLongTermSave")
    @Expose
    private String EnableBackupPeriodLongTermSave;

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
    * 是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
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
    * 日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数
    */
    @SerializedName("BinlogArchiveDays")
    @Expose
    private Long BinlogArchiveDays;

    /**
    * 是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
    */
    @SerializedName("EnableBinlogArchive")
    @Expose
    private String EnableBinlogArchive;

    /**
    * 是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
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
    * 是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
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
     * Get 数据备份文件的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。
2. MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。 
     * @return ExpireDays 数据备份文件的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。
2. MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。
     */
    public Long getExpireDays() {
        return this.ExpireDays;
    }

    /**
     * Set 数据备份文件的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。
2. MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。
     * @param ExpireDays 数据备份文件的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。
2. MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。
     */
    public void setExpireDays(Long ExpireDays) {
        this.ExpireDays = ExpireDays;
    }

    /**
     * Get (将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。 
     * @return StartTime (将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set (将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
     * @param StartTime (将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 自动备份方式，仅支持：physical - 物理冷备 
     * @return BackupMethod 自动备份方式，仅支持：physical - 物理冷备
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 自动备份方式，仅支持：physical - 物理冷备
     * @param BackupMethod 自动备份方式，仅支持：physical - 物理冷备
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get binlog 的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。
2. MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。 
     * @return BinlogExpireDays binlog 的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。
2. MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。
     */
    public Long getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * Set binlog 的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。
2. MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。
     * @param BinlogExpireDays binlog 的保留时间，单位为天。
1. MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。
2. MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。
     */
    public void setBinlogExpireDays(Long BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
    }

    /**
     * Get 备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置） 
     * @return BackupTimeWindow 备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）
     */
    public CommonTimeWindow getBackupTimeWindow() {
        return this.BackupTimeWindow;
    }

    /**
     * Set 备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）
     * @param BackupTimeWindow 备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）
     */
    public void setBackupTimeWindow(CommonTimeWindow BackupTimeWindow) {
        this.BackupTimeWindow = BackupTimeWindow;
    }

    /**
     * Get 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。 
     * @return EnableBackupPeriodSave 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。
     */
    public String getEnableBackupPeriodSave() {
        return this.EnableBackupPeriodSave;
    }

    /**
     * Set 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。
     * @param EnableBackupPeriodSave 定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。
     */
    public void setEnableBackupPeriodSave(String EnableBackupPeriodSave) {
        this.EnableBackupPeriodSave = EnableBackupPeriodSave;
    }

    /**
     * Get 长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效 
     * @return EnableBackupPeriodLongTermSave 长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效
     */
    public String getEnableBackupPeriodLongTermSave() {
        return this.EnableBackupPeriodLongTermSave;
    }

    /**
     * Set 长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效
     * @param EnableBackupPeriodLongTermSave 长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效
     */
    public void setEnableBackupPeriodLongTermSave(String EnableBackupPeriodLongTermSave) {
        this.EnableBackupPeriodLongTermSave = EnableBackupPeriodLongTermSave;
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
     * Get 是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。 
     * @return EnableBackupArchive 是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     */
    public String getEnableBackupArchive() {
        return this.EnableBackupArchive;
    }

    /**
     * Set 是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     * @param EnableBackupArchive 是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
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
     * Get 是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。 
     * @return EnableBinlogArchive 是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     */
    public String getEnableBinlogArchive() {
        return this.EnableBinlogArchive;
    }

    /**
     * Set 是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     * @param EnableBinlogArchive 是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     */
    public void setEnableBinlogArchive(String EnableBinlogArchive) {
        this.EnableBinlogArchive = EnableBinlogArchive;
    }

    /**
     * Get 是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。 
     * @return EnableBackupStandby 是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     */
    public String getEnableBackupStandby() {
        return this.EnableBackupStandby;
    }

    /**
     * Set 是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     * @param EnableBackupStandby 是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
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
     * Get 是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。 
     * @return EnableBinlogStandby 是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     */
    public String getEnableBinlogStandby() {
        return this.EnableBinlogStandby;
    }

    /**
     * Set 是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
     * @param EnableBinlogStandby 是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。
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

    public ModifyBackupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupConfigRequest(ModifyBackupConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExpireDays != null) {
            this.ExpireDays = new Long(source.ExpireDays);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
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
        if (source.EnableBackupPeriodLongTermSave != null) {
            this.EnableBackupPeriodLongTermSave = new String(source.EnableBackupPeriodLongTermSave);
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
        if (source.BinlogArchiveDays != null) {
            this.BinlogArchiveDays = new Long(source.BinlogArchiveDays);
        }
        if (source.EnableBinlogArchive != null) {
            this.EnableBinlogArchive = new String(source.EnableBinlogArchive);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExpireDays", this.ExpireDays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BinlogExpireDays", this.BinlogExpireDays);
        this.setParamObj(map, prefix + "BackupTimeWindow.", this.BackupTimeWindow);
        this.setParamSimple(map, prefix + "EnableBackupPeriodSave", this.EnableBackupPeriodSave);
        this.setParamSimple(map, prefix + "EnableBackupPeriodLongTermSave", this.EnableBackupPeriodLongTermSave);
        this.setParamSimple(map, prefix + "BackupPeriodSaveDays", this.BackupPeriodSaveDays);
        this.setParamSimple(map, prefix + "BackupPeriodSaveInterval", this.BackupPeriodSaveInterval);
        this.setParamSimple(map, prefix + "BackupPeriodSaveCount", this.BackupPeriodSaveCount);
        this.setParamSimple(map, prefix + "StartBackupPeriodSaveDate", this.StartBackupPeriodSaveDate);
        this.setParamSimple(map, prefix + "EnableBackupArchive", this.EnableBackupArchive);
        this.setParamSimple(map, prefix + "BackupArchiveDays", this.BackupArchiveDays);
        this.setParamSimple(map, prefix + "BinlogArchiveDays", this.BinlogArchiveDays);
        this.setParamSimple(map, prefix + "EnableBinlogArchive", this.EnableBinlogArchive);
        this.setParamSimple(map, prefix + "EnableBackupStandby", this.EnableBackupStandby);
        this.setParamSimple(map, prefix + "BackupStandbyDays", this.BackupStandbyDays);
        this.setParamSimple(map, prefix + "EnableBinlogStandby", this.EnableBinlogStandby);
        this.setParamSimple(map, prefix + "BinlogStandbyDays", this.BinlogStandbyDays);

    }
}

