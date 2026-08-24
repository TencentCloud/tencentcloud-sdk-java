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

public class BackupGroupDeniedAction extends AbstractModel {

    /**
    * 备份组ID
    */
    @SerializedName("BackupGroupId")
    @Expose
    private String BackupGroupId;

    /**
    * 拒绝的操作
    */
    @SerializedName("DeniedActions")
    @Expose
    private DeniedAction [] DeniedActions;

    /**
     * Get 备份组ID 
     * @return BackupGroupId 备份组ID
     */
    public String getBackupGroupId() {
        return this.BackupGroupId;
    }

    /**
     * Set 备份组ID
     * @param BackupGroupId 备份组ID
     */
    public void setBackupGroupId(String BackupGroupId) {
        this.BackupGroupId = BackupGroupId;
    }

    /**
     * Get 拒绝的操作 
     * @return DeniedActions 拒绝的操作
     */
    public DeniedAction [] getDeniedActions() {
        return this.DeniedActions;
    }

    /**
     * Set 拒绝的操作
     * @param DeniedActions 拒绝的操作
     */
    public void setDeniedActions(DeniedAction [] DeniedActions) {
        this.DeniedActions = DeniedActions;
    }

    public BackupGroupDeniedAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupGroupDeniedAction(BackupGroupDeniedAction source) {
        if (source.BackupGroupId != null) {
            this.BackupGroupId = new String(source.BackupGroupId);
        }
        if (source.DeniedActions != null) {
            this.DeniedActions = new DeniedAction[source.DeniedActions.length];
            for (int i = 0; i < source.DeniedActions.length; i++) {
                this.DeniedActions[i] = new DeniedAction(source.DeniedActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupGroupId", this.BackupGroupId);
        this.setParamArrayObj(map, prefix + "DeniedActions.", this.DeniedActions);

    }
}

