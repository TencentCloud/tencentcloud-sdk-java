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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupConfigInfo extends AbstractModel {

    /**
    * <p>系统自动时间</p>
    */
    @SerializedName("BackupCustomAutoTime")
    @Expose
    private Boolean BackupCustomAutoTime;

    /**
    * <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
    */
    @SerializedName("BackupTimeBeg")
    @Expose
    private Long BackupTimeBeg;

    /**
    * <p>表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
    */
    @SerializedName("BackupTimeEnd")
    @Expose
    private Long BackupTimeEnd;

    /**
    * <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupWeekDays")
    @Expose
    private String [] BackupWeekDays;

    /**
    * <p>间隔时间</p>
    */
    @SerializedName("BackupIntervalTime")
    @Expose
    private Long BackupIntervalTime;

    /**
    * <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000</p>
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * <p>跨地域备份开启<br>yes-开启<br>no-关闭</p>
    */
    @SerializedName("CrossRegionsEnable")
    @Expose
    private String CrossRegionsEnable;

    /**
    * <p>跨地域备份地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * <p>跨地域备份保留时间</p><p>单位：天</p>
    */
    @SerializedName("CrossRegionSaveDays")
    @Expose
    private Long CrossRegionSaveDays;

    /**
    * <p>自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份</p>
    */
    @SerializedName("BackupTriggerStrategy")
    @Expose
    private String BackupTriggerStrategy;

    /**
    * <p>备份投递关系</p>
    */
    @SerializedName("AutoCopyVaults")
    @Expose
    private CreateBackupVaultItem [] AutoCopyVaults;

    /**
     * Get <p>系统自动时间</p> 
     * @return BackupCustomAutoTime <p>系统自动时间</p>
     */
    public Boolean getBackupCustomAutoTime() {
        return this.BackupCustomAutoTime;
    }

    /**
     * Set <p>系统自动时间</p>
     * @param BackupCustomAutoTime <p>系统自动时间</p>
     */
    public void setBackupCustomAutoTime(Boolean BackupCustomAutoTime) {
        this.BackupCustomAutoTime = BackupCustomAutoTime;
    }

    /**
     * Get <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p> 
     * @return BackupTimeBeg <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     */
    public Long getBackupTimeBeg() {
        return this.BackupTimeBeg;
    }

    /**
     * Set <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     * @param BackupTimeBeg <p>表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     */
    public void setBackupTimeBeg(Long BackupTimeBeg) {
        this.BackupTimeBeg = BackupTimeBeg;
    }

    /**
     * Get <p>表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p> 
     * @return BackupTimeEnd <p>表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     */
    public Long getBackupTimeEnd() {
        return this.BackupTimeEnd;
    }

    /**
     * Set <p>表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     * @param BackupTimeEnd <p>表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200</p>
     */
    public void setBackupTimeEnd(Long BackupTimeEnd) {
        this.BackupTimeEnd = BackupTimeEnd;
    }

    /**
     * Get <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupWeekDays <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBackupWeekDays() {
        return this.BackupWeekDays;
    }

    /**
     * Set <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupWeekDays <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupWeekDays(String [] BackupWeekDays) {
        this.BackupWeekDays = BackupWeekDays;
    }

    /**
     * Get <p>间隔时间</p> 
     * @return BackupIntervalTime <p>间隔时间</p>
     */
    public Long getBackupIntervalTime() {
        return this.BackupIntervalTime;
    }

    /**
     * Set <p>间隔时间</p>
     * @param BackupIntervalTime <p>间隔时间</p>
     */
    public void setBackupIntervalTime(Long BackupIntervalTime) {
        this.BackupIntervalTime = BackupIntervalTime;
    }

    /**
     * Get <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000</p> 
     * @return ReserveDuration <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000</p>
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000</p>
     * @param ReserveDuration <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000</p>
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get <p>跨地域备份开启<br>yes-开启<br>no-关闭</p> 
     * @return CrossRegionsEnable <p>跨地域备份开启<br>yes-开启<br>no-关闭</p>
     */
    public String getCrossRegionsEnable() {
        return this.CrossRegionsEnable;
    }

    /**
     * Set <p>跨地域备份开启<br>yes-开启<br>no-关闭</p>
     * @param CrossRegionsEnable <p>跨地域备份开启<br>yes-开启<br>no-关闭</p>
     */
    public void setCrossRegionsEnable(String CrossRegionsEnable) {
        this.CrossRegionsEnable = CrossRegionsEnable;
    }

    /**
     * Get <p>跨地域备份地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossRegions <p>跨地域备份地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set <p>跨地域备份地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossRegions <p>跨地域备份地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get <p>跨地域备份保留时间</p><p>单位：天</p> 
     * @return CrossRegionSaveDays <p>跨地域备份保留时间</p><p>单位：天</p>
     */
    public Long getCrossRegionSaveDays() {
        return this.CrossRegionSaveDays;
    }

    /**
     * Set <p>跨地域备份保留时间</p><p>单位：天</p>
     * @param CrossRegionSaveDays <p>跨地域备份保留时间</p><p>单位：天</p>
     */
    public void setCrossRegionSaveDays(Long CrossRegionSaveDays) {
        this.CrossRegionSaveDays = CrossRegionSaveDays;
    }

    /**
     * Get <p>自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份</p> 
     * @return BackupTriggerStrategy <p>自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份</p>
     */
    public String getBackupTriggerStrategy() {
        return this.BackupTriggerStrategy;
    }

    /**
     * Set <p>自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份</p>
     * @param BackupTriggerStrategy <p>自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份</p>
     */
    public void setBackupTriggerStrategy(String BackupTriggerStrategy) {
        this.BackupTriggerStrategy = BackupTriggerStrategy;
    }

    /**
     * Get <p>备份投递关系</p> 
     * @return AutoCopyVaults <p>备份投递关系</p>
     */
    public CreateBackupVaultItem [] getAutoCopyVaults() {
        return this.AutoCopyVaults;
    }

    /**
     * Set <p>备份投递关系</p>
     * @param AutoCopyVaults <p>备份投递关系</p>
     */
    public void setAutoCopyVaults(CreateBackupVaultItem [] AutoCopyVaults) {
        this.AutoCopyVaults = AutoCopyVaults;
    }

    public BackupConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupConfigInfo(BackupConfigInfo source) {
        if (source.BackupCustomAutoTime != null) {
            this.BackupCustomAutoTime = new Boolean(source.BackupCustomAutoTime);
        }
        if (source.BackupTimeBeg != null) {
            this.BackupTimeBeg = new Long(source.BackupTimeBeg);
        }
        if (source.BackupTimeEnd != null) {
            this.BackupTimeEnd = new Long(source.BackupTimeEnd);
        }
        if (source.BackupWeekDays != null) {
            this.BackupWeekDays = new String[source.BackupWeekDays.length];
            for (int i = 0; i < source.BackupWeekDays.length; i++) {
                this.BackupWeekDays[i] = new String(source.BackupWeekDays[i]);
            }
        }
        if (source.BackupIntervalTime != null) {
            this.BackupIntervalTime = new Long(source.BackupIntervalTime);
        }
        if (source.ReserveDuration != null) {
            this.ReserveDuration = new Long(source.ReserveDuration);
        }
        if (source.CrossRegionsEnable != null) {
            this.CrossRegionsEnable = new String(source.CrossRegionsEnable);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.CrossRegionSaveDays != null) {
            this.CrossRegionSaveDays = new Long(source.CrossRegionSaveDays);
        }
        if (source.BackupTriggerStrategy != null) {
            this.BackupTriggerStrategy = new String(source.BackupTriggerStrategy);
        }
        if (source.AutoCopyVaults != null) {
            this.AutoCopyVaults = new CreateBackupVaultItem[source.AutoCopyVaults.length];
            for (int i = 0; i < source.AutoCopyVaults.length; i++) {
                this.AutoCopyVaults[i] = new CreateBackupVaultItem(source.AutoCopyVaults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupCustomAutoTime", this.BackupCustomAutoTime);
        this.setParamSimple(map, prefix + "BackupTimeBeg", this.BackupTimeBeg);
        this.setParamSimple(map, prefix + "BackupTimeEnd", this.BackupTimeEnd);
        this.setParamArraySimple(map, prefix + "BackupWeekDays.", this.BackupWeekDays);
        this.setParamSimple(map, prefix + "BackupIntervalTime", this.BackupIntervalTime);
        this.setParamSimple(map, prefix + "ReserveDuration", this.ReserveDuration);
        this.setParamSimple(map, prefix + "CrossRegionsEnable", this.CrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "CrossRegionSaveDays", this.CrossRegionSaveDays);
        this.setParamSimple(map, prefix + "BackupTriggerStrategy", this.BackupTriggerStrategy);
        this.setParamArrayObj(map, prefix + "AutoCopyVaults.", this.AutoCopyVaults);

    }
}

