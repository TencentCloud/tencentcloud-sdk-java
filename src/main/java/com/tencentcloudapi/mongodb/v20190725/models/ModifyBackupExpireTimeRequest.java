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

public class ModifyBackupExpireTimeRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>备份ID</p>
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

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

    /**
     * Get <p>过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return ExpireTime <p>过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param ExpireTime <p>过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>备份ID</p> 
     * @return BackupIds <p>备份ID</p>
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set <p>备份ID</p>
     * @param BackupIds <p>备份ID</p>
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    public ModifyBackupExpireTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupExpireTimeRequest(ModifyBackupExpireTimeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);

    }
}

