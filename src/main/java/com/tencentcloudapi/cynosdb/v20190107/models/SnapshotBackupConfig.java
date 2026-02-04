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

public class SnapshotBackupConfig extends AbstractModel {

    /**
    * 系统自动时间
    */
    @SerializedName("BackupCustomAutoTime")
    @Expose
    private Boolean BackupCustomAutoTime;

    /**
    * 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
    */
    @SerializedName("BackupTimeBeg")
    @Expose
    private Long BackupTimeBeg;

    /**
    * 表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
    */
    @SerializedName("BackupTimeEnd")
    @Expose
    private Long BackupTimeEnd;

    /**
    * 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份
    */
    @SerializedName("BackupWeekDays")
    @Expose
    private String [] BackupWeekDays;

    /**
    * 间隔时间
    */
    @SerializedName("BackupIntervalTime")
    @Expose
    private Long BackupIntervalTime;

    /**
    * 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * 自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份
    */
    @SerializedName("BackupTriggerStrategy")
    @Expose
    private String BackupTriggerStrategy;

    /**
     * Get 系统自动时间 
     * @return BackupCustomAutoTime 系统自动时间
     */
    public Boolean getBackupCustomAutoTime() {
        return this.BackupCustomAutoTime;
    }

    /**
     * Set 系统自动时间
     * @param BackupCustomAutoTime 系统自动时间
     */
    public void setBackupCustomAutoTime(Boolean BackupCustomAutoTime) {
        this.BackupCustomAutoTime = BackupCustomAutoTime;
    }

    /**
     * Get 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200 
     * @return BackupTimeBeg 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     */
    public Long getBackupTimeBeg() {
        return this.BackupTimeBeg;
    }

    /**
     * Set 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     * @param BackupTimeBeg 表示全备开始时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     */
    public void setBackupTimeBeg(Long BackupTimeBeg) {
        this.BackupTimeBeg = BackupTimeBeg;
    }

    /**
     * Get 表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200 
     * @return BackupTimeEnd 表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     */
    public Long getBackupTimeEnd() {
        return this.BackupTimeEnd;
    }

    /**
     * Set 表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     * @param BackupTimeEnd 表示全备结束时间，[0-24*3600]， 如0:00, 1:00, 2:00 分别为 0，3600， 7200
     */
    public void setBackupTimeEnd(Long BackupTimeEnd) {
        this.BackupTimeEnd = BackupTimeEnd;
    }

    /**
     * Get 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份 
     * @return BackupWeekDays 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份
     */
    public String [] getBackupWeekDays() {
        return this.BackupWeekDays;
    }

    /**
     * Set 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份
     * @param BackupWeekDays 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周日到周六的备份方式，full-全量备份，increment-增量备份
     */
    public void setBackupWeekDays(String [] BackupWeekDays) {
        this.BackupWeekDays = BackupWeekDays;
    }

    /**
     * Get 间隔时间 
     * @return BackupIntervalTime 间隔时间
     */
    public Long getBackupIntervalTime() {
        return this.BackupIntervalTime;
    }

    /**
     * Set 间隔时间
     * @param BackupIntervalTime 间隔时间
     */
    public void setBackupIntervalTime(Long BackupIntervalTime) {
        this.BackupIntervalTime = BackupIntervalTime;
    }

    /**
     * Get 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000 
     * @return ReserveDuration 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000
     * @param ReserveDuration 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600247=604800，最大为158112000
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get 自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份 
     * @return BackupTriggerStrategy 自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份
     */
    public String getBackupTriggerStrategy() {
        return this.BackupTriggerStrategy;
    }

    /**
     * Set 自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份
     * @param BackupTriggerStrategy 自动数据备份触发策略，periodically:自动周期备份,frequent:高频备份
     */
    public void setBackupTriggerStrategy(String BackupTriggerStrategy) {
        this.BackupTriggerStrategy = BackupTriggerStrategy;
    }

    public SnapshotBackupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotBackupConfig(SnapshotBackupConfig source) {
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
        if (source.BackupTriggerStrategy != null) {
            this.BackupTriggerStrategy = new String(source.BackupTriggerStrategy);
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
        this.setParamSimple(map, prefix + "BackupTriggerStrategy", this.BackupTriggerStrategy);

    }
}

