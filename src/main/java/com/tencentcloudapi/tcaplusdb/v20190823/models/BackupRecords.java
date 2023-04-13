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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupRecords extends AbstractModel{

    /**
    * 表格组ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 备份源
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 文件标签：TCAPLUS_FULL或OSDATA
    */
    @SerializedName("FileTag")
    @Expose
    private String FileTag;

    /**
    * 分片数量
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * 备份批次日期
    */
    @SerializedName("BackupBatchTime")
    @Expose
    private String BackupBatchTime;

    /**
    * 备份文件汇总大小
    */
    @SerializedName("BackupFileSize")
    @Expose
    private Long BackupFileSize;

    /**
    * 备份成功率
    */
    @SerializedName("BackupSuccRate")
    @Expose
    private String BackupSuccRate;

    /**
    * 备份文件过期时间
    */
    @SerializedName("BackupExpireTime")
    @Expose
    private String BackupExpireTime;

    /**
    * 业务ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get 表格组ID 
     * @return ZoneId 表格组ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 表格组ID
     * @param ZoneId 表格组ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 备份源 
     * @return BackupType 备份源
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份源
     * @param BackupType 备份源
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 文件标签：TCAPLUS_FULL或OSDATA 
     * @return FileTag 文件标签：TCAPLUS_FULL或OSDATA
     */
    public String getFileTag() {
        return this.FileTag;
    }

    /**
     * Set 文件标签：TCAPLUS_FULL或OSDATA
     * @param FileTag 文件标签：TCAPLUS_FULL或OSDATA
     */
    public void setFileTag(String FileTag) {
        this.FileTag = FileTag;
    }

    /**
     * Get 分片数量 
     * @return ShardCount 分片数量
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set 分片数量
     * @param ShardCount 分片数量
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get 备份批次日期 
     * @return BackupBatchTime 备份批次日期
     */
    public String getBackupBatchTime() {
        return this.BackupBatchTime;
    }

    /**
     * Set 备份批次日期
     * @param BackupBatchTime 备份批次日期
     */
    public void setBackupBatchTime(String BackupBatchTime) {
        this.BackupBatchTime = BackupBatchTime;
    }

    /**
     * Get 备份文件汇总大小 
     * @return BackupFileSize 备份文件汇总大小
     */
    public Long getBackupFileSize() {
        return this.BackupFileSize;
    }

    /**
     * Set 备份文件汇总大小
     * @param BackupFileSize 备份文件汇总大小
     */
    public void setBackupFileSize(Long BackupFileSize) {
        this.BackupFileSize = BackupFileSize;
    }

    /**
     * Get 备份成功率 
     * @return BackupSuccRate 备份成功率
     */
    public String getBackupSuccRate() {
        return this.BackupSuccRate;
    }

    /**
     * Set 备份成功率
     * @param BackupSuccRate 备份成功率
     */
    public void setBackupSuccRate(String BackupSuccRate) {
        this.BackupSuccRate = BackupSuccRate;
    }

    /**
     * Get 备份文件过期时间 
     * @return BackupExpireTime 备份文件过期时间
     */
    public String getBackupExpireTime() {
        return this.BackupExpireTime;
    }

    /**
     * Set 备份文件过期时间
     * @param BackupExpireTime 备份文件过期时间
     */
    public void setBackupExpireTime(String BackupExpireTime) {
        this.BackupExpireTime = BackupExpireTime;
    }

    /**
     * Get 业务ID 
     * @return AppId 业务ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 业务ID
     * @param AppId 业务ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public BackupRecords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupRecords(BackupRecords source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.FileTag != null) {
            this.FileTag = new String(source.FileTag);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.BackupBatchTime != null) {
            this.BackupBatchTime = new String(source.BackupBatchTime);
        }
        if (source.BackupFileSize != null) {
            this.BackupFileSize = new Long(source.BackupFileSize);
        }
        if (source.BackupSuccRate != null) {
            this.BackupSuccRate = new String(source.BackupSuccRate);
        }
        if (source.BackupExpireTime != null) {
            this.BackupExpireTime = new String(source.BackupExpireTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "FileTag", this.FileTag);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "BackupBatchTime", this.BackupBatchTime);
        this.setParamSimple(map, prefix + "BackupFileSize", this.BackupFileSize);
        this.setParamSimple(map, prefix + "BackupSuccRate", this.BackupSuccRate);
        this.setParamSimple(map, prefix + "BackupExpireTime", this.BackupExpireTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

