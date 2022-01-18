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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDDoSConnectLimitRequest extends AbstractModel{

    /**
    * 资源实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 连接抑制配置
    */
    @SerializedName("ConnectLimitConfig")
    @Expose
    private ConnectLimitConfig ConnectLimitConfig;

    /**
     * Get 资源实例Id 
     * @return InstanceId 资源实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例Id
     * @param InstanceId 资源实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 连接抑制配置 
     * @return ConnectLimitConfig 连接抑制配置
     */
    public ConnectLimitConfig getConnectLimitConfig() {
        return this.ConnectLimitConfig;
    }

    /**
     * Set 连接抑制配置
     * @param ConnectLimitConfig 连接抑制配置
     */
    public void setConnectLimitConfig(ConnectLimitConfig ConnectLimitConfig) {
        this.ConnectLimitConfig = ConnectLimitConfig;
    }

    public CreateDDoSConnectLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDDoSConnectLimitRequest(CreateDDoSConnectLimitRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConnectLimitConfig != null) {
            this.ConnectLimitConfig = new ConnectLimitConfig(source.ConnectLimitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ConnectLimitConfig.", this.ConnectLimitConfig);

    }
}

