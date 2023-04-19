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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDownloadURLRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 备份类型，目前支持：LogBackup，BaseBackup。
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份的唯一ID。
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 链接的有效时间，默认为12小时。
    */
    @SerializedName("URLExpireTime")
    @Expose
    private Long URLExpireTime;

    /**
    * 备份下载限制
    */
    @SerializedName("BackupDownloadRestriction")
    @Expose
    private BackupDownloadRestriction BackupDownloadRestriction;

    /**
     * Get 实例ID。 
     * @return DBInstanceId 实例ID。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。
     * @param DBInstanceId 实例ID。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 备份类型，目前支持：LogBackup，BaseBackup。 
     * @return BackupType 备份类型，目前支持：LogBackup，BaseBackup。
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型，目前支持：LogBackup，BaseBackup。
     * @param BackupType 备份类型，目前支持：LogBackup，BaseBackup。
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份的唯一ID。 
     * @return BackupId 备份的唯一ID。
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份的唯一ID。
     * @param BackupId 备份的唯一ID。
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 链接的有效时间，默认为12小时。 
     * @return URLExpireTime 链接的有效时间，默认为12小时。
     */
    public Long getURLExpireTime() {
        return this.URLExpireTime;
    }

    /**
     * Set 链接的有效时间，默认为12小时。
     * @param URLExpireTime 链接的有效时间，默认为12小时。
     */
    public void setURLExpireTime(Long URLExpireTime) {
        this.URLExpireTime = URLExpireTime;
    }

    /**
     * Get 备份下载限制 
     * @return BackupDownloadRestriction 备份下载限制
     */
    public BackupDownloadRestriction getBackupDownloadRestriction() {
        return this.BackupDownloadRestriction;
    }

    /**
     * Set 备份下载限制
     * @param BackupDownloadRestriction 备份下载限制
     */
    public void setBackupDownloadRestriction(BackupDownloadRestriction BackupDownloadRestriction) {
        this.BackupDownloadRestriction = BackupDownloadRestriction;
    }

    public DescribeBackupDownloadURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDownloadURLRequest(DescribeBackupDownloadURLRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.URLExpireTime != null) {
            this.URLExpireTime = new Long(source.URLExpireTime);
        }
        if (source.BackupDownloadRestriction != null) {
            this.BackupDownloadRestriction = new BackupDownloadRestriction(source.BackupDownloadRestriction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "URLExpireTime", this.URLExpireTime);
        this.setParamObj(map, prefix + "BackupDownloadRestriction.", this.BackupDownloadRestriction);

    }
}

