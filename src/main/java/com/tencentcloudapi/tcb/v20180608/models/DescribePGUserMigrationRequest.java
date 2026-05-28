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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePGUserMigrationRequest extends AbstractModel {

    /**
    * <p>云开发环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>版本号</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p>
    */
    @SerializedName("MigrationVersion")
    @Expose
    private String MigrationVersion;

    /**
     * Get <p>云开发环境ID</p> 
     * @return EnvId <p>云开发环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>云开发环境ID</p>
     * @param EnvId <p>云开发环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>版本号</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p> 
     * @return MigrationVersion <p>版本号</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p>
     */
    public String getMigrationVersion() {
        return this.MigrationVersion;
    }

    /**
     * Set <p>版本号</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p>
     * @param MigrationVersion <p>版本号</p><p>参数格式：14位时间格式</p><p>入参限制：纯数字</p>
     */
    public void setMigrationVersion(String MigrationVersion) {
        this.MigrationVersion = MigrationVersion;
    }

    public DescribePGUserMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePGUserMigrationRequest(DescribePGUserMigrationRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.MigrationVersion != null) {
            this.MigrationVersion = new String(source.MigrationVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "MigrationVersion", this.MigrationVersion);

    }
}

