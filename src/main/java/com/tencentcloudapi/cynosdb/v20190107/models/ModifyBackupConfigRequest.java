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
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800，最大为158112000
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
    */
    @SerializedName("BackupFreq")
    @Expose
    private String [] BackupFreq;

    /**
    * 该参数目前不支持修改，无需填写。
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 逻辑备份配置
    */
    @SerializedName("LogicBackupConfig")
    @Expose
    private LogicBackupConfigInfo LogicBackupConfig;

    /**
    * 是否删除自动逻辑备份
    */
    @SerializedName("DeleteAutoLogicBackup")
    @Expose
    private Boolean DeleteAutoLogicBackup;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800，最大为158112000 
     * @return ReserveDuration 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800，最大为158112000
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800，最大为158112000
     * @param ReserveDuration 表示保留备份时长, 单位秒，超过该时间将被清理, 七天表示为3600*24*7=604800，最大为158112000
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份 
     * @return BackupFreq 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
     */
    public String [] getBackupFreq() {
        return this.BackupFreq;
    }

    /**
     * Set 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
     * @param BackupFreq 该参数目前不支持修改，无需填写。备份频率，长度为7的数组，分别对应周一到周日的备份方式，full-全量备份，increment-增量备份
     */
    public void setBackupFreq(String [] BackupFreq) {
        this.BackupFreq = BackupFreq;
    }

    /**
     * Get 该参数目前不支持修改，无需填写。 
     * @return BackupType 该参数目前不支持修改，无需填写。
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 该参数目前不支持修改，无需填写。
     * @param BackupType 该参数目前不支持修改，无需填写。
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 逻辑备份配置 
     * @return LogicBackupConfig 逻辑备份配置
     */
    public LogicBackupConfigInfo getLogicBackupConfig() {
        return this.LogicBackupConfig;
    }

    /**
     * Set 逻辑备份配置
     * @param LogicBackupConfig 逻辑备份配置
     */
    public void setLogicBackupConfig(LogicBackupConfigInfo LogicBackupConfig) {
        this.LogicBackupConfig = LogicBackupConfig;
    }

    /**
     * Get 是否删除自动逻辑备份 
     * @return DeleteAutoLogicBackup 是否删除自动逻辑备份
     */
    public Boolean getDeleteAutoLogicBackup() {
        return this.DeleteAutoLogicBackup;
    }

    /**
     * Set 是否删除自动逻辑备份
     * @param DeleteAutoLogicBackup 是否删除自动逻辑备份
     */
    public void setDeleteAutoLogicBackup(Boolean DeleteAutoLogicBackup) {
        this.DeleteAutoLogicBackup = DeleteAutoLogicBackup;
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

    }
}

