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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRuntimeConfigurationRequest extends AbstractModel{

    /**
    * 服务器舰队Id
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 服务器舰队配置
    */
    @SerializedName("RuntimeConfiguration")
    @Expose
    private RuntimeConfiguration RuntimeConfiguration;

    /**
     * Get 服务器舰队Id 
     * @return FleetId 服务器舰队Id
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队Id
     * @param FleetId 服务器舰队Id
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 服务器舰队配置 
     * @return RuntimeConfiguration 服务器舰队配置
     */
    public RuntimeConfiguration getRuntimeConfiguration() {
        return this.RuntimeConfiguration;
    }

    /**
     * Set 服务器舰队配置
     * @param RuntimeConfiguration 服务器舰队配置
     */
    public void setRuntimeConfiguration(RuntimeConfiguration RuntimeConfiguration) {
        this.RuntimeConfiguration = RuntimeConfiguration;
    }

    public UpdateRuntimeConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRuntimeConfigurationRequest(UpdateRuntimeConfigurationRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.RuntimeConfiguration != null) {
            this.RuntimeConfiguration = new RuntimeConfiguration(source.RuntimeConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamObj(map, prefix + "RuntimeConfiguration.", this.RuntimeConfiguration);

    }
}

