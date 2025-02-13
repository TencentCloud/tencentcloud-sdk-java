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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyDiskBackupRequest extends AbstractModel {

    /**
    * 云硬盘备份点ID，可通过 DescribeDiskBackups 查询。
    */
    @SerializedName("DiskBackupId")
    @Expose
    private String DiskBackupId;

    /**
    * 云硬盘备份点原云硬盘ID，可通过DescribeDisks接口查询。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 回滚云硬盘备份点前是否自动关机，默认为FALSE，表示不自动关机
    */
    @SerializedName("AutoStopInstance")
    @Expose
    private Boolean AutoStopInstance;

    /**
    * 回滚云硬盘备份点完成后是否自动开机，默认为FALSE，表示不自动开机
    */
    @SerializedName("AutoStartInstance")
    @Expose
    private Boolean AutoStartInstance;

    /**
     * Get 云硬盘备份点ID，可通过 DescribeDiskBackups 查询。 
     * @return DiskBackupId 云硬盘备份点ID，可通过 DescribeDiskBackups 查询。
     */
    public String getDiskBackupId() {
        return this.DiskBackupId;
    }

    /**
     * Set 云硬盘备份点ID，可通过 DescribeDiskBackups 查询。
     * @param DiskBackupId 云硬盘备份点ID，可通过 DescribeDiskBackups 查询。
     */
    public void setDiskBackupId(String DiskBackupId) {
        this.DiskBackupId = DiskBackupId;
    }

    /**
     * Get 云硬盘备份点原云硬盘ID，可通过DescribeDisks接口查询。 
     * @return DiskId 云硬盘备份点原云硬盘ID，可通过DescribeDisks接口查询。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 云硬盘备份点原云硬盘ID，可通过DescribeDisks接口查询。
     * @param DiskId 云硬盘备份点原云硬盘ID，可通过DescribeDisks接口查询。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 回滚云硬盘备份点前是否自动关机，默认为FALSE，表示不自动关机 
     * @return AutoStopInstance 回滚云硬盘备份点前是否自动关机，默认为FALSE，表示不自动关机
     */
    public Boolean getAutoStopInstance() {
        return this.AutoStopInstance;
    }

    /**
     * Set 回滚云硬盘备份点前是否自动关机，默认为FALSE，表示不自动关机
     * @param AutoStopInstance 回滚云硬盘备份点前是否自动关机，默认为FALSE，表示不自动关机
     */
    public void setAutoStopInstance(Boolean AutoStopInstance) {
        this.AutoStopInstance = AutoStopInstance;
    }

    /**
     * Get 回滚云硬盘备份点完成后是否自动开机，默认为FALSE，表示不自动开机 
     * @return AutoStartInstance 回滚云硬盘备份点完成后是否自动开机，默认为FALSE，表示不自动开机
     */
    public Boolean getAutoStartInstance() {
        return this.AutoStartInstance;
    }

    /**
     * Set 回滚云硬盘备份点完成后是否自动开机，默认为FALSE，表示不自动开机
     * @param AutoStartInstance 回滚云硬盘备份点完成后是否自动开机，默认为FALSE，表示不自动开机
     */
    public void setAutoStartInstance(Boolean AutoStartInstance) {
        this.AutoStartInstance = AutoStartInstance;
    }

    public ApplyDiskBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyDiskBackupRequest(ApplyDiskBackupRequest source) {
        if (source.DiskBackupId != null) {
            this.DiskBackupId = new String(source.DiskBackupId);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.AutoStopInstance != null) {
            this.AutoStopInstance = new Boolean(source.AutoStopInstance);
        }
        if (source.AutoStartInstance != null) {
            this.AutoStartInstance = new Boolean(source.AutoStartInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskBackupId", this.DiskBackupId);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "AutoStopInstance", this.AutoStopInstance);
        this.setParamSimple(map, prefix + "AutoStartInstance", this.AutoStartInstance);

    }
}

