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

public class DbInstance extends AbstractModel {

    /**
    * 云开发环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * MySQL 连接器实例 ID；`"default"` 或为空表示使用 TCB 环境的默认连接器
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名；为空时使用连接器配置的默认数据库名
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
     * Get 云开发环境ID 
     * @return EnvId 云开发环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 云开发环境ID
     * @param EnvId 云开发环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get MySQL 连接器实例 ID；`"default"` 或为空表示使用 TCB 环境的默认连接器 
     * @return InstanceId MySQL 连接器实例 ID；`"default"` 或为空表示使用 TCB 环境的默认连接器
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set MySQL 连接器实例 ID；`"default"` 或为空表示使用 TCB 环境的默认连接器
     * @param InstanceId MySQL 连接器实例 ID；`"default"` 或为空表示使用 TCB 环境的默认连接器
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库名；为空时使用连接器配置的默认数据库名 
     * @return Schema 数据库名；为空时使用连接器配置的默认数据库名
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 数据库名；为空时使用连接器配置的默认数据库名
     * @param Schema 数据库名；为空时使用连接器配置的默认数据库名
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    public DbInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbInstance(DbInstance source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Schema", this.Schema);

    }
}

