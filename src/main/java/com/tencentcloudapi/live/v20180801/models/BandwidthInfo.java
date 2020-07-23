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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BandwidthInfo extends AbstractModel{

    /**
    * 返回格式：
yyyy-mm-dd HH:MM:SS
根据粒度会有不同程度的缩减。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 带宽。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
     * Get 返回格式：
yyyy-mm-dd HH:MM:SS
根据粒度会有不同程度的缩减。 
     * @return Time 返回格式：
yyyy-mm-dd HH:MM:SS
根据粒度会有不同程度的缩减。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 返回格式：
yyyy-mm-dd HH:MM:SS
根据粒度会有不同程度的缩减。
     * @param Time 返回格式：
yyyy-mm-dd HH:MM:SS
根据粒度会有不同程度的缩减。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 带宽。 
     * @return Bandwidth 带宽。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽。
     * @param Bandwidth 带宽。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

