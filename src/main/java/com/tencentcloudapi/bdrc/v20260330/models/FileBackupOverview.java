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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileBackupOverview extends AbstractModel {

    /**
    * 整机备份点总数
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * 创建中数量
    */
    @SerializedName("CreatingBackupCount")
    @Expose
    private Long CreatingBackupCount;

    /**
    * 失败数量
    */
    @SerializedName("FailedBackupCount")
    @Expose
    private Long FailedBackupCount;

    /**
    * 已完成数量
    */
    @SerializedName("SuccessBackupCount")
    @Expose
    private Long SuccessBackupCount;

    /**
    * 恢复中的总数量
    */
    @SerializedName("RestoringBackupCount")
    @Expose
    private Long RestoringBackupCount;

    /**
    * 整机备份总容量
    */
    @SerializedName("BackupSizeMb")
    @Expose
    private Long BackupSizeMb;

    /**
    * 受保护 CVM 资源数
    */
    @SerializedName("BackupResourceCount")
    @Expose
    private Long BackupResourceCount;

    /**
     * Get 整机备份点总数 
     * @return BackupCount 整机备份点总数
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set 整机备份点总数
     * @param BackupCount 整机备份点总数
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get 创建中数量 
     * @return CreatingBackupCount 创建中数量
     */
    public Long getCreatingBackupCount() {
        return this.CreatingBackupCount;
    }

    /**
     * Set 创建中数量
     * @param CreatingBackupCount 创建中数量
     */
    public void setCreatingBackupCount(Long CreatingBackupCount) {
        this.CreatingBackupCount = CreatingBackupCount;
    }

    /**
     * Get 失败数量 
     * @return FailedBackupCount 失败数量
     */
    public Long getFailedBackupCount() {
        return this.FailedBackupCount;
    }

    /**
     * Set 失败数量
     * @param FailedBackupCount 失败数量
     */
    public void setFailedBackupCount(Long FailedBackupCount) {
        this.FailedBackupCount = FailedBackupCount;
    }

    /**
     * Get 已完成数量 
     * @return SuccessBackupCount 已完成数量
     */
    public Long getSuccessBackupCount() {
        return this.SuccessBackupCount;
    }

    /**
     * Set 已完成数量
     * @param SuccessBackupCount 已完成数量
     */
    public void setSuccessBackupCount(Long SuccessBackupCount) {
        this.SuccessBackupCount = SuccessBackupCount;
    }

    /**
     * Get 恢复中的总数量 
     * @return RestoringBackupCount 恢复中的总数量
     */
    public Long getRestoringBackupCount() {
        return this.RestoringBackupCount;
    }

    /**
     * Set 恢复中的总数量
     * @param RestoringBackupCount 恢复中的总数量
     */
    public void setRestoringBackupCount(Long RestoringBackupCount) {
        this.RestoringBackupCount = RestoringBackupCount;
    }

    /**
     * Get 整机备份总容量 
     * @return BackupSizeMb 整机备份总容量
     */
    public Long getBackupSizeMb() {
        return this.BackupSizeMb;
    }

    /**
     * Set 整机备份总容量
     * @param BackupSizeMb 整机备份总容量
     */
    public void setBackupSizeMb(Long BackupSizeMb) {
        this.BackupSizeMb = BackupSizeMb;
    }

    /**
     * Get 受保护 CVM 资源数 
     * @return BackupResourceCount 受保护 CVM 资源数
     */
    public Long getBackupResourceCount() {
        return this.BackupResourceCount;
    }

    /**
     * Set 受保护 CVM 资源数
     * @param BackupResourceCount 受保护 CVM 资源数
     */
    public void setBackupResourceCount(Long BackupResourceCount) {
        this.BackupResourceCount = BackupResourceCount;
    }

    public FileBackupOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileBackupOverview(FileBackupOverview source) {
        if (source.BackupCount != null) {
            this.BackupCount = new Long(source.BackupCount);
        }
        if (source.CreatingBackupCount != null) {
            this.CreatingBackupCount = new Long(source.CreatingBackupCount);
        }
        if (source.FailedBackupCount != null) {
            this.FailedBackupCount = new Long(source.FailedBackupCount);
        }
        if (source.SuccessBackupCount != null) {
            this.SuccessBackupCount = new Long(source.SuccessBackupCount);
        }
        if (source.RestoringBackupCount != null) {
            this.RestoringBackupCount = new Long(source.RestoringBackupCount);
        }
        if (source.BackupSizeMb != null) {
            this.BackupSizeMb = new Long(source.BackupSizeMb);
        }
        if (source.BackupResourceCount != null) {
            this.BackupResourceCount = new Long(source.BackupResourceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);
        this.setParamSimple(map, prefix + "CreatingBackupCount", this.CreatingBackupCount);
        this.setParamSimple(map, prefix + "FailedBackupCount", this.FailedBackupCount);
        this.setParamSimple(map, prefix + "SuccessBackupCount", this.SuccessBackupCount);
        this.setParamSimple(map, prefix + "RestoringBackupCount", this.RestoringBackupCount);
        this.setParamSimple(map, prefix + "BackupSizeMb", this.BackupSizeMb);
        this.setParamSimple(map, prefix + "BackupResourceCount", this.BackupResourceCount);

    }
}

