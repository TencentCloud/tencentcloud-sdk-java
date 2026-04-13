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

public class RestoreDBInstanceRequest extends AbstractModel {

    /**
    * <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>指定回档的目标时间点。该时间必须处于实例的备份保留期内。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * <p>回档的库表信息。</p>
    */
    @SerializedName("Databases")
    @Expose
    private RestoreDatabases [] Databases;

    /**
     * Get <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>指定回档的目标时间点。该时间必须处于实例的备份保留期内。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return RestoreTime <p>指定回档的目标时间点。该时间必须处于实例的备份保留期内。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set <p>指定回档的目标时间点。该时间必须处于实例的备份保留期内。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param RestoreTime <p>指定回档的目标时间点。该时间必须处于实例的备份保留期内。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get <p>回档的库表信息。</p> 
     * @return Databases <p>回档的库表信息。</p>
     */
    public RestoreDatabases [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set <p>回档的库表信息。</p>
     * @param Databases <p>回档的库表信息。</p>
     */
    public void setDatabases(RestoreDatabases [] Databases) {
        this.Databases = Databases;
    }

    public RestoreDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreDBInstanceRequest(RestoreDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.Databases != null) {
            this.Databases = new RestoreDatabases[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new RestoreDatabases(source.Databases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);

    }
}

