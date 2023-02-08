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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupInfo extends AbstractModel{

    /**
    * 备份开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份 ID。
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 备份类型。<ul><li>1：手动备份，指根据业务运维排障需求，立即执行备份任务的操作。</li> <li>0：自动备份，指根据自动备份策略定时自动发起的备份任务。</li></ul>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份的备注信息.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 备份状态。  <ul><li>1：备份任务被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li> <li>-1：备份已过期。</li><li>3：备份正在被导出。</li> <li>4：备份导出成功。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备份是否被锁定。<ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul>
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
     * Get 备份开始时间。 
     * @return StartTime 备份开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间。
     * @param StartTime 备份开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份 ID。 
     * @return BackupId 备份 ID。
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份 ID。
     * @param BackupId 备份 ID。
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份类型。<ul><li>1：手动备份，指根据业务运维排障需求，立即执行备份任务的操作。</li> <li>0：自动备份，指根据自动备份策略定时自动发起的备份任务。</li></ul> 
     * @return BackupType 备份类型。<ul><li>1：手动备份，指根据业务运维排障需求，立即执行备份任务的操作。</li> <li>0：自动备份，指根据自动备份策略定时自动发起的备份任务。</li></ul>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型。<ul><li>1：手动备份，指根据业务运维排障需求，立即执行备份任务的操作。</li> <li>0：自动备份，指根据自动备份策略定时自动发起的备份任务。</li></ul>
     * @param BackupType 备份类型。<ul><li>1：手动备份，指根据业务运维排障需求，立即执行备份任务的操作。</li> <li>0：自动备份，指根据自动备份策略定时自动发起的备份任务。</li></ul>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份的备注信息. 
     * @return Remark 备份的备注信息.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备份的备注信息.
     * @param Remark 备份的备注信息.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 备份状态。  <ul><li>1：备份任务被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li> <li>-1：备份已过期。</li><li>3：备份正在被导出。</li> <li>4：备份导出成功。</li></ul> 
     * @return Status 备份状态。  <ul><li>1：备份任务被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li> <li>-1：备份已过期。</li><li>3：备份正在被导出。</li> <li>4：备份导出成功。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 备份状态。  <ul><li>1：备份任务被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li> <li>-1：备份已过期。</li><li>3：备份正在被导出。</li> <li>4：备份导出成功。</li></ul>
     * @param Status 备份状态。  <ul><li>1：备份任务被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li> <li>-1：备份已过期。</li><li>3：备份正在被导出。</li> <li>4：备份导出成功。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备份是否被锁定。<ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul> 
     * @return Locked 备份是否被锁定。<ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul>
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 备份是否被锁定。<ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul>
     * @param Locked 备份是否被锁定。<ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul>
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    public BackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInfo(BackupInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Locked", this.Locked);

    }
}

