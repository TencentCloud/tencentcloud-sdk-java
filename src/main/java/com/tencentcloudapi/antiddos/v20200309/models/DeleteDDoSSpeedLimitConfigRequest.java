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

public class DeleteDDoSSpeedLimitConfigRequest extends AbstractModel{

    /**
    * 资源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 访问限速配置，填写参数时配置ID不能为空
    */
    @SerializedName("DDoSSpeedLimitConfig")
    @Expose
    private DDoSSpeedLimitConfig DDoSSpeedLimitConfig;

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
     * Get 访问限速配置，填写参数时配置ID不能为空 
     * @return DDoSSpeedLimitConfig 访问限速配置，填写参数时配置ID不能为空
     */
    public DDoSSpeedLimitConfig getDDoSSpeedLimitConfig() {
        return this.DDoSSpeedLimitConfig;
    }

    /**
     * Set 访问限速配置，填写参数时配置ID不能为空
     * @param DDoSSpeedLimitConfig 访问限速配置，填写参数时配置ID不能为空
     */
    public void setDDoSSpeedLimitConfig(DDoSSpeedLimitConfig DDoSSpeedLimitConfig) {
        this.DDoSSpeedLimitConfig = DDoSSpeedLimitConfig;
    }

    public DeleteDDoSSpeedLimitConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDDoSSpeedLimitConfigRequest(DeleteDDoSSpeedLimitConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DDoSSpeedLimitConfig != null) {
            this.DDoSSpeedLimitConfig = new DDoSSpeedLimitConfig(source.DDoSSpeedLimitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "DDoSSpeedLimitConfig.", this.DDoSSpeedLimitConfig);

    }
}

