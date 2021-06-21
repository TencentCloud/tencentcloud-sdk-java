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

public class CreateDefaultAlarmThresholdRequest extends AbstractModel{

    /**
    * 默认告警阈值配置
    */
    @SerializedName("DefaultAlarmConfig")
    @Expose
    private DefaultAlarmThreshold DefaultAlarmConfig;

    /**
    * 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
]
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 默认告警阈值配置 
     * @return DefaultAlarmConfig 默认告警阈值配置
     */
    public DefaultAlarmThreshold getDefaultAlarmConfig() {
        return this.DefaultAlarmConfig;
    }

    /**
     * Set 默认告警阈值配置
     * @param DefaultAlarmConfig 默认告警阈值配置
     */
    public void setDefaultAlarmConfig(DefaultAlarmThreshold DefaultAlarmConfig) {
        this.DefaultAlarmConfig = DefaultAlarmConfig;
    }

    /**
     * Get 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
] 
     * @return InstanceType 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
]
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
]
     * @param InstanceType 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
]
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CreateDefaultAlarmThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDefaultAlarmThresholdRequest(CreateDefaultAlarmThresholdRequest source) {
        if (source.DefaultAlarmConfig != null) {
            this.DefaultAlarmConfig = new DefaultAlarmThreshold(source.DefaultAlarmConfig);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DefaultAlarmConfig.", this.DefaultAlarmConfig);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

