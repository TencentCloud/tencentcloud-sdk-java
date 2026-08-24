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

public class ApplyBackupGroupRequest extends AbstractModel {

    /**
    * 回滚的备份组ID。
    */
    @SerializedName("BackupGroupId")
    @Expose
    private String BackupGroupId;

    /**
    * 回滚的备份ID、云硬盘ID列表。
    */
    @SerializedName("ApplyDisks")
    @Expose
    private ApplyDisk [] ApplyDisks;

    /**
    * 回滚备份前是否执行自动关机，如果回滚的盘挂载在实例上且实例处于运行状态，可传入该参数。
    */
    @SerializedName("AutoStopInstance")
    @Expose
    private Boolean AutoStopInstance;

    /**
    * 回滚备份完成后是否执行自动开机。
    */
    @SerializedName("AutoStartInstance")
    @Expose
    private Boolean AutoStartInstance;

    /**
     * Get 回滚的备份组ID。 
     * @return BackupGroupId 回滚的备份组ID。
     */
    public String getBackupGroupId() {
        return this.BackupGroupId;
    }

    /**
     * Set 回滚的备份组ID。
     * @param BackupGroupId 回滚的备份组ID。
     */
    public void setBackupGroupId(String BackupGroupId) {
        this.BackupGroupId = BackupGroupId;
    }

    /**
     * Get 回滚的备份ID、云硬盘ID列表。 
     * @return ApplyDisks 回滚的备份ID、云硬盘ID列表。
     */
    public ApplyDisk [] getApplyDisks() {
        return this.ApplyDisks;
    }

    /**
     * Set 回滚的备份ID、云硬盘ID列表。
     * @param ApplyDisks 回滚的备份ID、云硬盘ID列表。
     */
    public void setApplyDisks(ApplyDisk [] ApplyDisks) {
        this.ApplyDisks = ApplyDisks;
    }

    /**
     * Get 回滚备份前是否执行自动关机，如果回滚的盘挂载在实例上且实例处于运行状态，可传入该参数。 
     * @return AutoStopInstance 回滚备份前是否执行自动关机，如果回滚的盘挂载在实例上且实例处于运行状态，可传入该参数。
     */
    public Boolean getAutoStopInstance() {
        return this.AutoStopInstance;
    }

    /**
     * Set 回滚备份前是否执行自动关机，如果回滚的盘挂载在实例上且实例处于运行状态，可传入该参数。
     * @param AutoStopInstance 回滚备份前是否执行自动关机，如果回滚的盘挂载在实例上且实例处于运行状态，可传入该参数。
     */
    public void setAutoStopInstance(Boolean AutoStopInstance) {
        this.AutoStopInstance = AutoStopInstance;
    }

    /**
     * Get 回滚备份完成后是否执行自动开机。 
     * @return AutoStartInstance 回滚备份完成后是否执行自动开机。
     */
    public Boolean getAutoStartInstance() {
        return this.AutoStartInstance;
    }

    /**
     * Set 回滚备份完成后是否执行自动开机。
     * @param AutoStartInstance 回滚备份完成后是否执行自动开机。
     */
    public void setAutoStartInstance(Boolean AutoStartInstance) {
        this.AutoStartInstance = AutoStartInstance;
    }

    public ApplyBackupGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyBackupGroupRequest(ApplyBackupGroupRequest source) {
        if (source.BackupGroupId != null) {
            this.BackupGroupId = new String(source.BackupGroupId);
        }
        if (source.ApplyDisks != null) {
            this.ApplyDisks = new ApplyDisk[source.ApplyDisks.length];
            for (int i = 0; i < source.ApplyDisks.length; i++) {
                this.ApplyDisks[i] = new ApplyDisk(source.ApplyDisks[i]);
            }
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
        this.setParamSimple(map, prefix + "BackupGroupId", this.BackupGroupId);
        this.setParamArrayObj(map, prefix + "ApplyDisks.", this.ApplyDisks);
        this.setParamSimple(map, prefix + "AutoStopInstance", this.AutoStopInstance);
        this.setParamSimple(map, prefix + "AutoStartInstance", this.AutoStartInstance);

    }
}

