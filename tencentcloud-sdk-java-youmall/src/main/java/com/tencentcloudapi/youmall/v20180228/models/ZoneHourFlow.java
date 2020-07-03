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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneHourFlow extends AbstractModel{

    /**
    * 分时 0~23
    */
    @SerializedName("Hour")
    @Expose
    private Long Hour;

    /**
    * 客流量
    */
    @SerializedName("FlowCount")
    @Expose
    private Long FlowCount;

    /**
     * Get 分时 0~23 
     * @return Hour 分时 0~23
     */
    public Long getHour() {
        return this.Hour;
    }

    /**
     * Set 分时 0~23
     * @param Hour 分时 0~23
     */
    public void setHour(Long Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 客流量 
     * @return FlowCount 客流量
     */
    public Long getFlowCount() {
        return this.FlowCount;
    }

    /**
     * Set 客流量
     * @param FlowCount 客流量
     */
    public void setFlowCount(Long FlowCount) {
        this.FlowCount = FlowCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "FlowCount", this.FlowCount);

    }
}

