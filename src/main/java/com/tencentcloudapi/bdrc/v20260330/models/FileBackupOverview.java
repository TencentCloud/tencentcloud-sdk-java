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
    * <p>备份点总数</p>
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * <p>创建中数量</p>
    */
    @SerializedName("CreatingBackupCount")
    @Expose
    private Long CreatingBackupCount;

    /**
    * <p>失败数量</p>
    */
    @SerializedName("FailedBackupCount")
    @Expose
    private Long FailedBackupCount;

    /**
    * <p>已完成数量</p>
    */
    @SerializedName("SuccessBackupCount")
    @Expose
    private Long SuccessBackupCount;

    /**
    * <p>恢复中的总数量</p>
    */
    @SerializedName("RestoringBackupCount")
    @Expose
    private Long RestoringBackupCount;

    /**
    * <p>备份总容量</p>
    */
    @SerializedName("BackupSizeMb")
    @Expose
    private Long BackupSizeMb;

    /**
    * <p>受保护资源数</p>
    */
    @SerializedName("BackupResourceCount")
    @Expose
    private Long BackupResourceCount;

    /**
     * Get <p>备份点总数</p> 
     * @return BackupCount <p>备份点总数</p>
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set <p>备份点总数</p>
     * @param BackupCount <p>备份点总数</p>
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get <p>创建中数量</p> 
     * @return CreatingBackupCount <p>创建中数量</p>
     */
    public Long getCreatingBackupCount() {
        return this.CreatingBackupCount;
    }

    /**
     * Set <p>创建中数量</p>
     * @param CreatingBackupCount <p>创建中数量</p>
     */
    public void setCreatingBackupCount(Long CreatingBackupCount) {
        this.CreatingBackupCount = CreatingBackupCount;
    }

    /**
     * Get <p>失败数量</p> 
     * @return FailedBackupCount <p>失败数量</p>
     */
    public Long getFailedBackupCount() {
        return this.FailedBackupCount;
    }

    /**
     * Set <p>失败数量</p>
     * @param FailedBackupCount <p>失败数量</p>
     */
    public void setFailedBackupCount(Long FailedBackupCount) {
        this.FailedBackupCount = FailedBackupCount;
    }

    /**
     * Get <p>已完成数量</p> 
     * @return SuccessBackupCount <p>已完成数量</p>
     */
    public Long getSuccessBackupCount() {
        return this.SuccessBackupCount;
    }

    /**
     * Set <p>已完成数量</p>
     * @param SuccessBackupCount <p>已完成数量</p>
     */
    public void setSuccessBackupCount(Long SuccessBackupCount) {
        this.SuccessBackupCount = SuccessBackupCount;
    }

    /**
     * Get <p>恢复中的总数量</p> 
     * @return RestoringBackupCount <p>恢复中的总数量</p>
     */
    public Long getRestoringBackupCount() {
        return this.RestoringBackupCount;
    }

    /**
     * Set <p>恢复中的总数量</p>
     * @param RestoringBackupCount <p>恢复中的总数量</p>
     */
    public void setRestoringBackupCount(Long RestoringBackupCount) {
        this.RestoringBackupCount = RestoringBackupCount;
    }

    /**
     * Get <p>备份总容量</p> 
     * @return BackupSizeMb <p>备份总容量</p>
     */
    public Long getBackupSizeMb() {
        return this.BackupSizeMb;
    }

    /**
     * Set <p>备份总容量</p>
     * @param BackupSizeMb <p>备份总容量</p>
     */
    public void setBackupSizeMb(Long BackupSizeMb) {
        this.BackupSizeMb = BackupSizeMb;
    }

    /**
     * Get <p>受保护资源数</p> 
     * @return BackupResourceCount <p>受保护资源数</p>
     */
    public Long getBackupResourceCount() {
        return this.BackupResourceCount;
    }

    /**
     * Set <p>受保护资源数</p>
     * @param BackupResourceCount <p>受保护资源数</p>
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

