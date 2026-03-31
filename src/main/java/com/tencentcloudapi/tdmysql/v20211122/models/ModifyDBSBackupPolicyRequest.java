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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBSBackupPolicyRequest extends AbstractModel {

    /**
    * <p>备份策略</p>
    */
    @SerializedName("BackupPolicy")
    @Expose
    private BackupPolicyModelInput BackupPolicy;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>备份策略</p> 
     * @return BackupPolicy <p>备份策略</p>
     */
    public BackupPolicyModelInput getBackupPolicy() {
        return this.BackupPolicy;
    }

    /**
     * Set <p>备份策略</p>
     * @param BackupPolicy <p>备份策略</p>
     */
    public void setBackupPolicy(BackupPolicyModelInput BackupPolicy) {
        this.BackupPolicy = BackupPolicy;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ModifyDBSBackupPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBSBackupPolicyRequest(ModifyDBSBackupPolicyRequest source) {
        if (source.BackupPolicy != null) {
            this.BackupPolicy = new BackupPolicyModelInput(source.BackupPolicy);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BackupPolicy.", this.BackupPolicy);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

