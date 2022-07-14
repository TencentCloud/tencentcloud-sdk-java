/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogstashBindedES extends AbstractModel{

    /**
    * ES集群ID
    */
    @SerializedName("ESInstanceId")
    @Expose
    private String ESInstanceId;

    /**
    * ES集群用户名
    */
    @SerializedName("ESUserName")
    @Expose
    private String ESUserName;

    /**
    * ES集群密码
    */
    @SerializedName("ESPassword")
    @Expose
    private String ESPassword;

    /**
     * Get ES集群ID 
     * @return ESInstanceId ES集群ID
     */
    public String getESInstanceId() {
        return this.ESInstanceId;
    }

    /**
     * Set ES集群ID
     * @param ESInstanceId ES集群ID
     */
    public void setESInstanceId(String ESInstanceId) {
        this.ESInstanceId = ESInstanceId;
    }

    /**
     * Get ES集群用户名 
     * @return ESUserName ES集群用户名
     */
    public String getESUserName() {
        return this.ESUserName;
    }

    /**
     * Set ES集群用户名
     * @param ESUserName ES集群用户名
     */
    public void setESUserName(String ESUserName) {
        this.ESUserName = ESUserName;
    }

    /**
     * Get ES集群密码 
     * @return ESPassword ES集群密码
     */
    public String getESPassword() {
        return this.ESPassword;
    }

    /**
     * Set ES集群密码
     * @param ESPassword ES集群密码
     */
    public void setESPassword(String ESPassword) {
        this.ESPassword = ESPassword;
    }

    public LogstashBindedES() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogstashBindedES(LogstashBindedES source) {
        if (source.ESInstanceId != null) {
            this.ESInstanceId = new String(source.ESInstanceId);
        }
        if (source.ESUserName != null) {
            this.ESUserName = new String(source.ESUserName);
        }
        if (source.ESPassword != null) {
            this.ESPassword = new String(source.ESPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ESInstanceId", this.ESInstanceId);
        this.setParamSimple(map, prefix + "ESUserName", this.ESUserName);
        this.setParamSimple(map, prefix + "ESPassword", this.ESPassword);

    }
}

