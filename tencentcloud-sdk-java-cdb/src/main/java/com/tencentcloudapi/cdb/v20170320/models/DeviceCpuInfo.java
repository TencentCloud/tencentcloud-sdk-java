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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceCpuInfo extends AbstractModel{

    /**
    * 实例CPU平均使用率
    */
    @SerializedName("Rate")
    @Expose
    private DeviceCpuRateInfo [] Rate;

    /**
    * 实例CPU监控数据
    */
    @SerializedName("Load")
    @Expose
    private Long [] Load;

    /**
     * Get 实例CPU平均使用率 
     * @return Rate 实例CPU平均使用率
     */
    public DeviceCpuRateInfo [] getRate() {
        return this.Rate;
    }

    /**
     * Set 实例CPU平均使用率
     * @param Rate 实例CPU平均使用率
     */
    public void setRate(DeviceCpuRateInfo [] Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 实例CPU监控数据 
     * @return Load 实例CPU监控数据
     */
    public Long [] getLoad() {
        return this.Load;
    }

    /**
     * Set 实例CPU监控数据
     * @param Load 实例CPU监控数据
     */
    public void setLoad(Long [] Load) {
        this.Load = Load;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rate.", this.Rate);
        this.setParamArraySimple(map, prefix + "Load.", this.Load);

    }
}

