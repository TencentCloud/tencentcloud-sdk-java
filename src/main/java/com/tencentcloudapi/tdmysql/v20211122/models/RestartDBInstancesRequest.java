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

public class RestartDBInstancesRequest extends AbstractModel {

    /**
    * <p>需要重启的实例ID的数组</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>重启时间，不传表示立即重启</p>
    */
    @SerializedName("RestartTime")
    @Expose
    private String RestartTime;

    /**
     * Get <p>需要重启的实例ID的数组</p> 
     * @return InstanceIds <p>需要重启的实例ID的数组</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>需要重启的实例ID的数组</p>
     * @param InstanceIds <p>需要重启的实例ID的数组</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>重启时间，不传表示立即重启</p> 
     * @return RestartTime <p>重启时间，不传表示立即重启</p>
     */
    public String getRestartTime() {
        return this.RestartTime;
    }

    /**
     * Set <p>重启时间，不传表示立即重启</p>
     * @param RestartTime <p>重启时间，不传表示立即重启</p>
     */
    public void setRestartTime(String RestartTime) {
        this.RestartTime = RestartTime;
    }

    public RestartDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartDBInstancesRequest(RestartDBInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.RestartTime != null) {
            this.RestartTime = new String(source.RestartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RestartTime", this.RestartTime);

    }
}

