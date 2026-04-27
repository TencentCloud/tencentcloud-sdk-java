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

public class ModifyBackupConfigRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800，最大为158112000</p>
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p>
    */
    @SerializedName("BackupFreq")
    @Expose
    private String [] BackupFreq;

    /**
    * <p>该参数目前不支持修改，无需填写。</p>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>逻辑备份配置</p>
    */
    @SerializedName("LogicBackupConfig")
    @Expose
    private LogicBackupConfigInfo LogicBackupConfig;

    /**
    * <p>是否删除自动逻辑备份</p>
    */
    @SerializedName("DeleteAutoLogicBackup")
    @Expose
    private Boolean DeleteAutoLogicBackup;

    /**
    * <p>二级快照备份参数</p>
    */
    @SerializedName("SnapshotSecondaryBackupConfig")
    @Expose
    private SnapshotBackupConfig SnapshotSecondaryBackupConfig;

    /**
    * <p>稀疏备份配置</p>
    */
    @SerializedName("SparseBackupConfig")
    @Expose
    private SparseBackupConfig SparseBackupConfig;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800，最大为158112000</p> 
     * @return ReserveDuration <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800，最大为158112000</p>
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800，最大为158112000</p>
     * @param ReserveDuration <p>表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600<em>24</em>7=604800，最大为158112000</p>
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p> 
     * @return BackupFreq <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p>
     */
    public String [] getBackupFreq() {
        return this.BackupFreq;
    }

    /**
     * Set <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p>
     * @param BackupFreq <p>该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份</p>
     */
    public void setBackupFreq(String [] BackupFreq) {
        this.BackupFreq = BackupFreq;
    }

    /**
     * Get <p>该参数目前不支持修改，无需填写。</p> 
     * @return BackupType <p>该参数目前不支持修改，无需填写。</p>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>该参数目前不支持修改，无需填写。</p>
     * @param BackupType <p>该参数目前不支持修改，无需填写。</p>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>逻辑备份配置</p> 
     * @return LogicBackupConfig <p>逻辑备份配置</p>
     */
    public LogicBackupConfigInfo getLogicBackupConfig() {
        return this.LogicBackupConfig;
    }

    /**
     * Set <p>逻辑备份配置</p>
     * @param LogicBackupConfig <p>逻辑备份配置</p>
     */
    public void setLogicBackupConfig(LogicBackupConfigInfo LogicBackupConfig) {
        this.LogicBackupConfig = LogicBackupConfig;
    }

    /**
     * Get <p>是否删除自动逻辑备份</p> 
     * @return DeleteAutoLogicBackup <p>是否删除自动逻辑备份</p>
     */
    public Boolean getDeleteAutoLogicBackup() {
        return this.DeleteAutoLogicBackup;
    }

    /**
     * Set <p>是否删除自动逻辑备份</p>
     * @param DeleteAutoLogicBackup <p>是否删除自动逻辑备份</p>
     */
    public void setDeleteAutoLogicBackup(Boolean DeleteAutoLogicBackup) {
        this.DeleteAutoLogicBackup = DeleteAutoLogicBackup;
    }

    /**
     * Get <p>二级快照备份参数</p> 
     * @return SnapshotSecondaryBackupConfig <p>二级快照备份参数</p>
     */
    public SnapshotBackupConfig getSnapshotSecondaryBackupConfig() {
        return this.SnapshotSecondaryBackupConfig;
    }

    /**
     * Set <p>二级快照备份参数</p>
     * @param SnapshotSecondaryBackupConfig <p>二级快照备份参数</p>
     */
    public void setSnapshotSecondaryBackupConfig(SnapshotBackupConfig SnapshotSecondaryBackupConfig) {
        this.SnapshotSecondaryBackupConfig = SnapshotSecondaryBackupConfig;
    }

    /**
     * Get <p>稀疏备份配置</p> 
     * @return SparseBackupConfig <p>稀疏备份配置</p>
     */
    public SparseBackupConfig getSparseBackupConfig() {
        return this.SparseBackupConfig;
    }

    /**
     * Set <p>稀疏备份配置</p>
     * @param SparseBackupConfig <p>稀疏备份配置</p>
     */
    public void setSparseBackupConfig(SparseBackupConfig SparseBackupConfig) {
        this.SparseBackupConfig = SparseBackupConfig;
    }

    public ModifyBackupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupConfigRequest(ModifyBackupConfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupTimeBeg != null) {
            this.BackupTimeBeg = new Long(source.BackupTimeBeg);
        }
        if (source.BackupTimeEnd != null) {
            this.BackupTimeEnd = new Long(source.BackupTimeEnd);
        }
        if (source.ReserveDuration != null) {
            this.ReserveDuration = new Long(source.ReserveDuration);
        }
        if (source.BackupFreq != null) {
            this.BackupFreq = new String[source.BackupFreq.length];
            for (int i = 0; i < source.BackupFreq.length; i++) {
                this.BackupFreq[i] = new String(source.BackupFreq[i]);
            }
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.LogicBackupConfig != null) {
            this.LogicBackupConfig = new LogicBackupConfigInfo(source.LogicBackupConfig);
        }
        if (source.DeleteAutoLogicBackup != null) {
            this.DeleteAutoLogicBackup = new Boolean(source.DeleteAutoLogicBackup);
        }
        if (source.SnapshotSecondaryBackupConfig != null) {
            this.SnapshotSecondaryBackupConfig = new SnapshotBackupConfig(source.SnapshotSecondaryBackupConfig);
        }
        if (source.SparseBackupConfig != null) {
            this.SparseBackupConfig = new SparseBackupConfig(source.SparseBackupConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BackupTimeBeg", this.BackupTimeBeg);
        this.setParamSimple(map, prefix + "BackupTimeEnd", this.BackupTimeEnd);
        this.setParamSimple(map, prefix + "ReserveDuration", this.ReserveDuration);
        this.setParamArraySimple(map, prefix + "BackupFreq.", this.BackupFreq);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamObj(map, prefix + "LogicBackupConfig.", this.LogicBackupConfig);
        this.setParamSimple(map, prefix + "DeleteAutoLogicBackup", this.DeleteAutoLogicBackup);
        this.setParamObj(map, prefix + "SnapshotSecondaryBackupConfig.", this.SnapshotSecondaryBackupConfig);
        this.setParamObj(map, prefix + "SparseBackupConfig.", this.SparseBackupConfig);

    }
}

