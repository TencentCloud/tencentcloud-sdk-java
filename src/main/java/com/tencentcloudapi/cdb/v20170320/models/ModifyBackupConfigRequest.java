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
    * <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>数据备份文件的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。</li><li>MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。</li></ol>
    */
    @SerializedName("ExpireDays")
    @Expose
    private Long ExpireDays;

    /**
    * <p>(将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>自动备份方式，仅支持：physical - 物理冷备</p>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>binlog 的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。</li><li>MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。</li></ol>
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Long BinlogExpireDays;

    /**
    * <p>备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{&quot;Monday&quot;: &quot;&quot;, &quot;Tuesday&quot;: &quot;10:00-14:00&quot;, &quot;Wednesday&quot;: &quot;&quot;, &quot;Thursday&quot;: &quot;&quot;, &quot;Friday&quot;: &quot;&quot;, &quot;Saturday&quot;: &quot;&quot;, &quot;Sunday&quot;: &quot;10:00-14:00&quot;}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）</p>
    */
    @SerializedName("BackupTimeWindow")
    @Expose
    private CommonTimeWindow BackupTimeWindow;

    /**
    * <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。</p>
    */
    @SerializedName("EnableBackupPeriodSave")
    @Expose
    private String EnableBackupPeriodSave;

    /**
    * <p>长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效</p>
    */
    @SerializedName("EnableBackupPeriodLongTermSave")
    @Expose
    private String EnableBackupPeriodLongTermSave;

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
    * <p>是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
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
    * <p>日志备份归档起始天数，日志备份达到归档起始天数时进行归档，最小为180天，不得大于日志备份保留天数</p>
    */
    @SerializedName("BinlogArchiveDays")
    @Expose
    private Long BinlogArchiveDays;

    /**
    * <p>是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
    */
    @SerializedName("EnableBinlogArchive")
    @Expose
    private String EnableBinlogArchive;

    /**
    * <p>是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
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
    * <p>是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
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
     * Get <p>数据备份文件的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。</li><li>MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。</li></ol> 
     * @return ExpireDays <p>数据备份文件的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。</li><li>MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。</li></ol>
     */
    public Long getExpireDays() {
        return this.ExpireDays;
    }

    /**
     * Set <p>数据备份文件的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。</li><li>MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。</li></ol>
     * @param ExpireDays <p>数据备份文件的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版数据备份文件可以保留7天 - 1830天。</li><li>MySQL 单节点（云盘）数据备份文件可以保留7天 - 30天。</li></ol>
     */
    public void setExpireDays(Long ExpireDays) {
        this.ExpireDays = ExpireDays;
    }

    /**
     * Get <p>(将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。</p> 
     * @return StartTime <p>(将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>(将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。</p>
     * @param StartTime <p>(将废弃，建议使用 BackupTimeWindow 参数) 备份时间范围，格式为：02:00-06:00，起点和终点时间目前限制为整点，目前可以选择的范围为： 00:00-12:00，02:00-06:00，06：00-10：00，10:00-14:00，14:00-18:00，18:00-22:00，22:00-02:00。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>自动备份方式，仅支持：physical - 物理冷备</p> 
     * @return BackupMethod <p>自动备份方式，仅支持：physical - 物理冷备</p>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>自动备份方式，仅支持：physical - 物理冷备</p>
     * @param BackupMethod <p>自动备份方式，仅支持：physical - 物理冷备</p>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>binlog 的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。</li><li>MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。</li></ol> 
     * @return BinlogExpireDays <p>binlog 的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。</li><li>MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。</li></ol>
     */
    public Long getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * Set <p>binlog 的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。</li><li>MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。</li></ol>
     * @param BinlogExpireDays <p>binlog 的保留时间，单位为天。</p><ol><li>MySQL 双节点、三节点、云盘版日志备份文件可以保留7天 - 3650天。</li><li>MySQL 单节点（云盘）日志备份文件可以保留7天 - 30天。</li></ol>
     */
    public void setBinlogExpireDays(Long BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
    }

    /**
     * Get <p>备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{&quot;Monday&quot;: &quot;&quot;, &quot;Tuesday&quot;: &quot;10:00-14:00&quot;, &quot;Wednesday&quot;: &quot;&quot;, &quot;Thursday&quot;: &quot;&quot;, &quot;Friday&quot;: &quot;&quot;, &quot;Saturday&quot;: &quot;&quot;, &quot;Sunday&quot;: &quot;10:00-14:00&quot;}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）</p> 
     * @return BackupTimeWindow <p>备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{&quot;Monday&quot;: &quot;&quot;, &quot;Tuesday&quot;: &quot;10:00-14:00&quot;, &quot;Wednesday&quot;: &quot;&quot;, &quot;Thursday&quot;: &quot;&quot;, &quot;Friday&quot;: &quot;&quot;, &quot;Saturday&quot;: &quot;&quot;, &quot;Sunday&quot;: &quot;10:00-14:00&quot;}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）</p>
     */
    public CommonTimeWindow getBackupTimeWindow() {
        return this.BackupTimeWindow;
    }

    /**
     * Set <p>备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{&quot;Monday&quot;: &quot;&quot;, &quot;Tuesday&quot;: &quot;10:00-14:00&quot;, &quot;Wednesday&quot;: &quot;&quot;, &quot;Thursday&quot;: &quot;&quot;, &quot;Friday&quot;: &quot;&quot;, &quot;Saturday&quot;: &quot;&quot;, &quot;Sunday&quot;: &quot;10:00-14:00&quot;}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）</p>
     * @param BackupTimeWindow <p>备份时间窗，比如要设置每周二和周日 10:00-14:00之间备份，该参数如下：{&quot;Monday&quot;: &quot;&quot;, &quot;Tuesday&quot;: &quot;10:00-14:00&quot;, &quot;Wednesday&quot;: &quot;&quot;, &quot;Thursday&quot;: &quot;&quot;, &quot;Friday&quot;: &quot;&quot;, &quot;Saturday&quot;: &quot;&quot;, &quot;Sunday&quot;: &quot;10:00-14:00&quot;}    （注：可以设置一周的某几天备份，但是每天的备份时间需要设置为相同的时间段。 如果设置了该字段，将忽略StartTime字段的设置）</p>
     */
    public void setBackupTimeWindow(CommonTimeWindow BackupTimeWindow) {
        this.BackupTimeWindow = BackupTimeWindow;
    }

    /**
     * Get <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。</p> 
     * @return EnableBackupPeriodSave <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。</p>
     */
    public String getEnableBackupPeriodSave() {
        return this.EnableBackupPeriodSave;
    }

    /**
     * Set <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。</p>
     * @param EnableBackupPeriodSave <p>定期保留开关，off - 不开启定期保留策略，on - 开启定期保留策略，默认为off。</p>
     */
    public void setEnableBackupPeriodSave(String EnableBackupPeriodSave) {
        this.EnableBackupPeriodSave = EnableBackupPeriodSave;
    }

    /**
     * Get <p>长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效</p> 
     * @return EnableBackupPeriodLongTermSave <p>长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效</p>
     */
    public String getEnableBackupPeriodLongTermSave() {
        return this.EnableBackupPeriodLongTermSave;
    }

    /**
     * Set <p>长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效</p>
     * @param EnableBackupPeriodLongTermSave <p>长期保留开关,该字段功能暂未上线，可忽略。off - 不开启长期保留策略，on - 开启长期保留策略，默认为off，如果开启，则BackupPeriodSaveDays，BackupPeriodSaveInterval，BackupPeriodSaveCount参数无效</p>
     */
    public void setEnableBackupPeriodLongTermSave(String EnableBackupPeriodLongTermSave) {
        this.EnableBackupPeriodLongTermSave = EnableBackupPeriodLongTermSave;
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
     * Get <p>是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p> 
     * @return EnableBackupArchive <p>是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     */
    public String getEnableBackupArchive() {
        return this.EnableBackupArchive;
    }

    /**
     * Set <p>是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     * @param EnableBackupArchive <p>是否开启数据备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
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
     * Get <p>是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p> 
     * @return EnableBinlogArchive <p>是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     */
    public String getEnableBinlogArchive() {
        return this.EnableBinlogArchive;
    }

    /**
     * Set <p>是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     * @param EnableBinlogArchive <p>是否开启日志备份归档策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     */
    public void setEnableBinlogArchive(String EnableBinlogArchive) {
        this.EnableBinlogArchive = EnableBinlogArchive;
    }

    /**
     * Get <p>是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p> 
     * @return EnableBackupStandby <p>是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     */
    public String getEnableBackupStandby() {
        return this.EnableBackupStandby;
    }

    /**
     * Set <p>是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     * @param EnableBackupStandby <p>是否开启数据备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
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
     * Get <p>是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p> 
     * @return EnableBinlogStandby <p>是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     */
    public String getEnableBinlogStandby() {
        return this.EnableBinlogStandby;
    }

    /**
     * Set <p>是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
     * @param EnableBinlogStandby <p>是否开启日志备份标准存储策略，off-关闭，on-打开，如果不指定该入参， 则保持不变。</p>
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

