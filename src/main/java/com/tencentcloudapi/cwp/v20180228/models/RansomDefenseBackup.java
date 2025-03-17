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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RansomDefenseBackup extends AbstractModel {

    /**
    * 备份时间
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * 勒索状态：0无告警, 1有告警
    */
    @SerializedName("EventStatus")
    @Expose
    private Long EventStatus;

    /**
    * 备份状态：0备份中，1正常，2、3失败，4快照已过期，5快照数量超出限制，9快照已删除
    */
    @SerializedName("BackupStatus")
    @Expose
    private Long BackupStatus;

    /**
    * 备份磁盘数量
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 硬盘信息，；分隔
    */
    @SerializedName("Disks")
    @Expose
    private String Disks;

    /**
    * 快照列表，；分隔
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String SnapshotIds;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 策略状态:0关闭，1开启，9已删除
    */
    @SerializedName("StrategyStatus")
    @Expose
    private Long StrategyStatus;

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
     * Get 备份时间 
     * @return BackupTime 备份时间
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 备份时间
     * @param BackupTime 备份时间
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get 勒索状态：0无告警, 1有告警 
     * @return EventStatus 勒索状态：0无告警, 1有告警
     */
    public Long getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set 勒索状态：0无告警, 1有告警
     * @param EventStatus 勒索状态：0无告警, 1有告警
     */
    public void setEventStatus(Long EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get 备份状态：0备份中，1正常，2、3失败，4快照已过期，5快照数量超出限制，9快照已删除 
     * @return BackupStatus 备份状态：0备份中，1正常，2、3失败，4快照已过期，5快照数量超出限制，9快照已删除
     */
    public Long getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set 备份状态：0备份中，1正常，2、3失败，4快照已过期，5快照数量超出限制，9快照已删除
     * @param BackupStatus 备份状态：0备份中，1正常，2、3失败，4快照已过期，5快照数量超出限制，9快照已删除
     */
    public void setBackupStatus(Long BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get 备份磁盘数量 
     * @return DiskCount 备份磁盘数量
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 备份磁盘数量
     * @param DiskCount 备份磁盘数量
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 硬盘信息，；分隔 
     * @return Disks 硬盘信息，；分隔
     */
    public String getDisks() {
        return this.Disks;
    }

    /**
     * Set 硬盘信息，；分隔
     * @param Disks 硬盘信息，；分隔
     */
    public void setDisks(String Disks) {
        this.Disks = Disks;
    }

    /**
     * Get 快照列表，；分隔 
     * @return SnapshotIds 快照列表，；分隔
     */
    public String getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set 快照列表，；分隔
     * @param SnapshotIds 快照列表，；分隔
     */
    public void setSnapshotIds(String SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get 策略id 
     * @return StrategyId 策略id
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
     * @param StrategyId 策略id
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 策略状态:0关闭，1开启，9已删除 
     * @return StrategyStatus 策略状态:0关闭，1开启，9已删除
     */
    public Long getStrategyStatus() {
        return this.StrategyStatus;
    }

    /**
     * Set 策略状态:0关闭，1开启，9已删除
     * @param StrategyStatus 策略状态:0关闭，1开启，9已删除
     */
    public void setStrategyStatus(Long StrategyStatus) {
        this.StrategyStatus = StrategyStatus;
    }

    /**
     * Get 策略名称 
     * @return StrategyName 策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
     * @param StrategyName 策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    public RansomDefenseBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseBackup(RansomDefenseBackup source) {
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long(source.EventStatus);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new Long(source.BackupStatus);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.Disks != null) {
            this.Disks = new String(source.Disks);
        }
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String(source.SnapshotIds);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyStatus != null) {
            this.StrategyStatus = new Long(source.StrategyStatus);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "Disks", this.Disks);
        this.setParamSimple(map, prefix + "SnapshotIds", this.SnapshotIds);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyStatus", this.StrategyStatus);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);

    }
}

