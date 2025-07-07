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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetBackupRulesRequest extends AbstractModel {

    /**
    * 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设置自动备份方式。- 0：逻辑备份。- 1：物理备份。-3：快照备份(仅云盘版支持)。
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。
    */
    @SerializedName("BackupTime")
    @Expose
    private Long BackupTime;

    /**
    * 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。
    */
    @SerializedName("Notify")
    @Expose
    private Boolean Notify;

    /**
    * 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。
    */
    @SerializedName("BackupRetentionPeriod")
    @Expose
    private Long BackupRetentionPeriod;

    /**
     * Get 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 设置自动备份方式。- 0：逻辑备份。- 1：物理备份。-3：快照备份(仅云盘版支持)。 
     * @return BackupMethod 设置自动备份方式。- 0：逻辑备份。- 1：物理备份。-3：快照备份(仅云盘版支持)。
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 设置自动备份方式。- 0：逻辑备份。- 1：物理备份。-3：快照备份(仅云盘版支持)。
     * @param BackupMethod 设置自动备份方式。- 0：逻辑备份。- 1：物理备份。-3：快照备份(仅云盘版支持)。
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。 
     * @return BackupTime 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。
     */
    public Long getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。
     * @param BackupTime 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。
     */
    public void setBackupTime(Long BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。 
     * @return Notify 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。
     */
    public Boolean getNotify() {
        return this.Notify;
    }

    /**
     * Set 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。
     * @param Notify 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。
     */
    public void setNotify(Boolean Notify) {
        this.Notify = Notify;
    }

    /**
     * Get 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。 
     * @return BackupRetentionPeriod 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。
     */
    public Long getBackupRetentionPeriod() {
        return this.BackupRetentionPeriod;
    }

    /**
     * Set 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。
     * @param BackupRetentionPeriod 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。
     */
    public void setBackupRetentionPeriod(Long BackupRetentionPeriod) {
        this.BackupRetentionPeriod = BackupRetentionPeriod;
    }

    public SetBackupRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetBackupRulesRequest(SetBackupRulesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new Long(source.BackupTime);
        }
        if (source.Notify != null) {
            this.Notify = new Boolean(source.Notify);
        }
        if (source.BackupRetentionPeriod != null) {
            this.BackupRetentionPeriod = new Long(source.BackupRetentionPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "Notify", this.Notify);
        this.setParamSimple(map, prefix + "BackupRetentionPeriod", this.BackupRetentionPeriod);

    }
}

