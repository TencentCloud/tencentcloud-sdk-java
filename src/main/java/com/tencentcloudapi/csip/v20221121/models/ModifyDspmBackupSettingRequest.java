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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmBackupSettingRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>备份日志保留时长</p>
    */
    @SerializedName("BackupLogSaveTime")
    @Expose
    private Long BackupLogSaveTime;

    /**
    * <p>恢复日志保留时长</p>
    */
    @SerializedName("RestoreLogSaveTime")
    @Expose
    private Long RestoreLogSaveTime;

    /**
    * <p>日志最大生命周期限制</p>
    */
    @SerializedName("LogMaxSaveTime")
    @Expose
    private Long LogMaxSaveTime;

    /**
    * <p>在线日志最大天数限制</p>
    */
    @SerializedName("OnlineLogMaxSaveTime")
    @Expose
    private Long OnlineLogMaxSaveTime;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>备份日志保留时长</p> 
     * @return BackupLogSaveTime <p>备份日志保留时长</p>
     */
    public Long getBackupLogSaveTime() {
        return this.BackupLogSaveTime;
    }

    /**
     * Set <p>备份日志保留时长</p>
     * @param BackupLogSaveTime <p>备份日志保留时长</p>
     */
    public void setBackupLogSaveTime(Long BackupLogSaveTime) {
        this.BackupLogSaveTime = BackupLogSaveTime;
    }

    /**
     * Get <p>恢复日志保留时长</p> 
     * @return RestoreLogSaveTime <p>恢复日志保留时长</p>
     */
    public Long getRestoreLogSaveTime() {
        return this.RestoreLogSaveTime;
    }

    /**
     * Set <p>恢复日志保留时长</p>
     * @param RestoreLogSaveTime <p>恢复日志保留时长</p>
     */
    public void setRestoreLogSaveTime(Long RestoreLogSaveTime) {
        this.RestoreLogSaveTime = RestoreLogSaveTime;
    }

    /**
     * Get <p>日志最大生命周期限制</p> 
     * @return LogMaxSaveTime <p>日志最大生命周期限制</p>
     */
    public Long getLogMaxSaveTime() {
        return this.LogMaxSaveTime;
    }

    /**
     * Set <p>日志最大生命周期限制</p>
     * @param LogMaxSaveTime <p>日志最大生命周期限制</p>
     */
    public void setLogMaxSaveTime(Long LogMaxSaveTime) {
        this.LogMaxSaveTime = LogMaxSaveTime;
    }

    /**
     * Get <p>在线日志最大天数限制</p> 
     * @return OnlineLogMaxSaveTime <p>在线日志最大天数限制</p>
     */
    public Long getOnlineLogMaxSaveTime() {
        return this.OnlineLogMaxSaveTime;
    }

    /**
     * Set <p>在线日志最大天数限制</p>
     * @param OnlineLogMaxSaveTime <p>在线日志最大天数限制</p>
     */
    public void setOnlineLogMaxSaveTime(Long OnlineLogMaxSaveTime) {
        this.OnlineLogMaxSaveTime = OnlineLogMaxSaveTime;
    }

    public ModifyDspmBackupSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmBackupSettingRequest(ModifyDspmBackupSettingRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.BackupLogSaveTime != null) {
            this.BackupLogSaveTime = new Long(source.BackupLogSaveTime);
        }
        if (source.RestoreLogSaveTime != null) {
            this.RestoreLogSaveTime = new Long(source.RestoreLogSaveTime);
        }
        if (source.LogMaxSaveTime != null) {
            this.LogMaxSaveTime = new Long(source.LogMaxSaveTime);
        }
        if (source.OnlineLogMaxSaveTime != null) {
            this.OnlineLogMaxSaveTime = new Long(source.OnlineLogMaxSaveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "BackupLogSaveTime", this.BackupLogSaveTime);
        this.setParamSimple(map, prefix + "RestoreLogSaveTime", this.RestoreLogSaveTime);
        this.setParamSimple(map, prefix + "LogMaxSaveTime", this.LogMaxSaveTime);
        this.setParamSimple(map, prefix + "OnlineLogMaxSaveTime", this.OnlineLogMaxSaveTime);

    }
}

