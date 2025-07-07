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

public class CrossRegionBackupItem extends AbstractModel {

    /**
    * 备份的目标地域
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * 目标地域的备份任务ID
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 目标地域的备份状态
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
     * Get 备份的目标地域 
     * @return CrossRegion 备份的目标地域
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set 备份的目标地域
     * @param CrossRegion 备份的目标地域
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get 目标地域的备份任务ID 
     * @return BackupId 目标地域的备份任务ID
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 目标地域的备份任务ID
     * @param BackupId 目标地域的备份任务ID
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 目标地域的备份状态 
     * @return BackupStatus 目标地域的备份状态
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set 目标地域的备份状态
     * @param BackupStatus 目标地域的备份状态
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    public CrossRegionBackupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossRegionBackupItem(CrossRegionBackupItem source) {
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);

    }
}

