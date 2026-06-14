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

public class CreateBackupDBInstanceRequest extends AbstractModel {

    /**
    * <p>实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>设置备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * <p>备份备注信息。</p>
    */
    @SerializedName("BackupRemark")
    @Expose
    private String BackupRemark;

    /**
    * <p>保存天数，-2-永久保留（不定期保留），-1-跟随长期保留时长，0-按配置天数，1~7300-自定义天数（最长20年）</p><p>单位：天</p>
    */
    @SerializedName("BackupRetentionDays")
    @Expose
    private Long BackupRetentionDays;

    /**
     * Get <p>实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>设置备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul> 
     * @return BackupMethod <p>设置备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>设置备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     * @param BackupMethod <p>设置备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>备份备注信息。</p> 
     * @return BackupRemark <p>备份备注信息。</p>
     */
    public String getBackupRemark() {
        return this.BackupRemark;
    }

    /**
     * Set <p>备份备注信息。</p>
     * @param BackupRemark <p>备份备注信息。</p>
     */
    public void setBackupRemark(String BackupRemark) {
        this.BackupRemark = BackupRemark;
    }

    /**
     * Get <p>保存天数，-2-永久保留（不定期保留），-1-跟随长期保留时长，0-按配置天数，1~7300-自定义天数（最长20年）</p><p>单位：天</p> 
     * @return BackupRetentionDays <p>保存天数，-2-永久保留（不定期保留），-1-跟随长期保留时长，0-按配置天数，1~7300-自定义天数（最长20年）</p><p>单位：天</p>
     */
    public Long getBackupRetentionDays() {
        return this.BackupRetentionDays;
    }

    /**
     * Set <p>保存天数，-2-永久保留（不定期保留），-1-跟随长期保留时长，0-按配置天数，1~7300-自定义天数（最长20年）</p><p>单位：天</p>
     * @param BackupRetentionDays <p>保存天数，-2-永久保留（不定期保留），-1-跟随长期保留时长，0-按配置天数，1~7300-自定义天数（最长20年）</p><p>单位：天</p>
     */
    public void setBackupRetentionDays(Long BackupRetentionDays) {
        this.BackupRetentionDays = BackupRetentionDays;
    }

    public CreateBackupDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupDBInstanceRequest(CreateBackupDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackupRemark != null) {
            this.BackupRemark = new String(source.BackupRemark);
        }
        if (source.BackupRetentionDays != null) {
            this.BackupRetentionDays = new Long(source.BackupRetentionDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupRemark", this.BackupRemark);
        this.setParamSimple(map, prefix + "BackupRetentionDays", this.BackupRetentionDays);

    }
}

