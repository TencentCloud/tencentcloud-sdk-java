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

public class ModifyFileBackupAttributeRequest extends AbstractModel {

    /**
    * 备份ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 备份的名称。
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 是否为永久保留的备份。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 备份到期时间。
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
     * Get 备份ID 
     * @return BackupId 备份ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份ID
     * @param BackupId 备份ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份的名称。 
     * @return BackupName 备份的名称。
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份的名称。
     * @param BackupName 备份的名称。
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 是否为永久保留的备份。 
     * @return IsPermanent 是否为永久保留的备份。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 是否为永久保留的备份。
     * @param IsPermanent 是否为永久保留的备份。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 备份到期时间。 
     * @return Deadline 备份到期时间。
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 备份到期时间。
     * @param Deadline 备份到期时间。
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    public ModifyFileBackupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileBackupAttributeRequest(ModifyFileBackupAttributeRequest source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

