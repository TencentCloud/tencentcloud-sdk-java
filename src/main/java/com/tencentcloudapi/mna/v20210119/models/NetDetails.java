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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetDetails extends AbstractModel{

    /**
    * 流量值（bit）
    */
    @SerializedName("Current")
    @Expose
    private Float Current;

    /**
    * 时间点，单位：s
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get 流量值（bit） 
     * @return Current 流量值（bit）
     */
    public Float getCurrent() {
        return this.Current;
    }

    /**
     * Set 流量值（bit）
     * @param Current 流量值（bit）
     */
    public void setCurrent(Float Current) {
        this.Current = Current;
    }

    /**
     * Get 时间点，单位：s 
     * @return Time 时间点，单位：s
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点，单位：s
     * @param Time 时间点，单位：s
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    public NetDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetDetails(NetDetails source) {
        if (source.Current != null) {
            this.Current = new Float(source.Current);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Current", this.Current);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

