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

public class CreateProtocolBlockConfigRequest extends AbstractModel{

    /**
    * 资源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 协议封禁配置
    */
    @SerializedName("ProtocolBlockConfig")
    @Expose
    private ProtocolBlockConfig ProtocolBlockConfig;

    /**
     * Get 资源实例ID 
     * @return InstanceId 资源实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例ID
     * @param InstanceId 资源实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 协议封禁配置 
     * @return ProtocolBlockConfig 协议封禁配置
     */
    public ProtocolBlockConfig getProtocolBlockConfig() {
        return this.ProtocolBlockConfig;
    }

    /**
     * Set 协议封禁配置
     * @param ProtocolBlockConfig 协议封禁配置
     */
    public void setProtocolBlockConfig(ProtocolBlockConfig ProtocolBlockConfig) {
        this.ProtocolBlockConfig = ProtocolBlockConfig;
    }

    public CreateProtocolBlockConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProtocolBlockConfigRequest(CreateProtocolBlockConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProtocolBlockConfig != null) {
            this.ProtocolBlockConfig = new ProtocolBlockConfig(source.ProtocolBlockConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ProtocolBlockConfig.", this.ProtocolBlockConfig);

    }
}

