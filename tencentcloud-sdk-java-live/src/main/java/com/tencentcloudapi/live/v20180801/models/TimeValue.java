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

public class TimeValue extends AbstractModel{

    /**
    * UTC 时间，时间格式：yyyy-mm-ddTHH:MM:SSZ。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 数值。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get UTC 时间，时间格式：yyyy-mm-ddTHH:MM:SSZ。 
     * @return Time UTC 时间，时间格式：yyyy-mm-ddTHH:MM:SSZ。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set UTC 时间，时间格式：yyyy-mm-ddTHH:MM:SSZ。
     * @param Time UTC 时间，时间格式：yyyy-mm-ddTHH:MM:SSZ。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 数值。 
     * @return Num 数值。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 数值。
     * @param Num 数值。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

