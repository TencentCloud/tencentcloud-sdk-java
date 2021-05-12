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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BFDInfo extends AbstractModel{

    /**
    * 健康检查次数
    */
    @SerializedName("ProbeFailedTimes")
    @Expose
    private Long ProbeFailedTimes;

    /**
    * 健康检查间隔
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get 健康检查次数 
     * @return ProbeFailedTimes 健康检查次数
     */
    public Long getProbeFailedTimes() {
        return this.ProbeFailedTimes;
    }

    /**
     * Set 健康检查次数
     * @param ProbeFailedTimes 健康检查次数
     */
    public void setProbeFailedTimes(Long ProbeFailedTimes) {
        this.ProbeFailedTimes = ProbeFailedTimes;
    }

    /**
     * Get 健康检查间隔 
     * @return Interval 健康检查间隔
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 健康检查间隔
     * @param Interval 健康检查间隔
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public BFDInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BFDInfo(BFDInfo source) {
        if (source.ProbeFailedTimes != null) {
            this.ProbeFailedTimes = new Long(source.ProbeFailedTimes);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProbeFailedTimes", this.ProbeFailedTimes);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

