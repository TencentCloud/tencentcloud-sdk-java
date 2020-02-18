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

public class BackupSummaryItem extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 该实例自动数据备份的个数。
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * 该实例自动数据备份的容量。
    */
    @SerializedName("AutoBackupVolume")
    @Expose
    private Long AutoBackupVolume;

    /**
    * 该实例手动数据备份的个数。
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * 该实例手动数据备份的容量。
    */
    @SerializedName("ManualBackupVolume")
    @Expose
    private Long ManualBackupVolume;

    /**
    * 该实例总的数据备份（包含自动备份和手动备份）个数。
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * 该实例总的数据备份容量。
    */
    @SerializedName("DataBackupVolume")
    @Expose
    private Long DataBackupVolume;

    /**
    * 该实例日志备份的个数。
    */
    @SerializedName("BinlogBackupCount")
    @Expose
    private Long BinlogBackupCount;

    /**
    * 该实例日志备份的容量。
    */
    @SerializedName("BinlogBackupVolume")
    @Expose
    private Long BinlogBackupVolume;

    /**
    * 该实例的总备份（包含数据备份和日志备份）占用容量。
    */
    @SerializedName("BackupVolume")
    @Expose
    private Long BackupVolume;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 该实例自动数据备份的个数。 
     * @return AutoBackupCount 该实例自动数据备份的个数。
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set 该实例自动数据备份的个数。
     * @param AutoBackupCount 该实例自动数据备份的个数。
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get 该实例自动数据备份的容量。 
     * @return AutoBackupVolume 该实例自动数据备份的容量。
     */
    public Long getAutoBackupVolume() {
        return this.AutoBackupVolume;
    }

    /**
     * Set 该实例自动数据备份的容量。
     * @param AutoBackupVolume 该实例自动数据备份的容量。
     */
    public void setAutoBackupVolume(Long AutoBackupVolume) {
        this.AutoBackupVolume = AutoBackupVolume;
    }

    /**
     * Get 该实例手动数据备份的个数。 
     * @return ManualBackupCount 该实例手动数据备份的个数。
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set 该实例手动数据备份的个数。
     * @param ManualBackupCount 该实例手动数据备份的个数。
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get 该实例手动数据备份的容量。 
     * @return ManualBackupVolume 该实例手动数据备份的容量。
     */
    public Long getManualBackupVolume() {
        return this.ManualBackupVolume;
    }

    /**
     * Set 该实例手动数据备份的容量。
     * @param ManualBackupVolume 该实例手动数据备份的容量。
     */
    public void setManualBackupVolume(Long ManualBackupVolume) {
        this.ManualBackupVolume = ManualBackupVolume;
    }

    /**
     * Get 该实例总的数据备份（包含自动备份和手动备份）个数。 
     * @return DataBackupCount 该实例总的数据备份（包含自动备份和手动备份）个数。
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set 该实例总的数据备份（包含自动备份和手动备份）个数。
     * @param DataBackupCount 该实例总的数据备份（包含自动备份和手动备份）个数。
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get 该实例总的数据备份容量。 
     * @return DataBackupVolume 该实例总的数据备份容量。
     */
    public Long getDataBackupVolume() {
        return this.DataBackupVolume;
    }

    /**
     * Set 该实例总的数据备份容量。
     * @param DataBackupVolume 该实例总的数据备份容量。
     */
    public void setDataBackupVolume(Long DataBackupVolume) {
        this.DataBackupVolume = DataBackupVolume;
    }

    /**
     * Get 该实例日志备份的个数。 
     * @return BinlogBackupCount 该实例日志备份的个数。
     */
    public Long getBinlogBackupCount() {
        return this.BinlogBackupCount;
    }

    /**
     * Set 该实例日志备份的个数。
     * @param BinlogBackupCount 该实例日志备份的个数。
     */
    public void setBinlogBackupCount(Long BinlogBackupCount) {
        this.BinlogBackupCount = BinlogBackupCount;
    }

    /**
     * Get 该实例日志备份的容量。 
     * @return BinlogBackupVolume 该实例日志备份的容量。
     */
    public Long getBinlogBackupVolume() {
        return this.BinlogBackupVolume;
    }

    /**
     * Set 该实例日志备份的容量。
     * @param BinlogBackupVolume 该实例日志备份的容量。
     */
    public void setBinlogBackupVolume(Long BinlogBackupVolume) {
        this.BinlogBackupVolume = BinlogBackupVolume;
    }

    /**
     * Get 该实例的总备份（包含数据备份和日志备份）占用容量。 
     * @return BackupVolume 该实例的总备份（包含数据备份和日志备份）占用容量。
     */
    public Long getBackupVolume() {
        return this.BackupVolume;
    }

    /**
     * Set 该实例的总备份（包含数据备份和日志备份）占用容量。
     * @param BackupVolume 该实例的总备份（包含数据备份和日志备份）占用容量。
     */
    public void setBackupVolume(Long BackupVolume) {
        this.BackupVolume = BackupVolume;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupVolume", this.AutoBackupVolume);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupVolume", this.ManualBackupVolume);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "DataBackupVolume", this.DataBackupVolume);
        this.setParamSimple(map, prefix + "BinlogBackupCount", this.BinlogBackupCount);
        this.setParamSimple(map, prefix + "BinlogBackupVolume", this.BinlogBackupVolume);
        this.setParamSimple(map, prefix + "BackupVolume", this.BackupVolume);

    }
}

