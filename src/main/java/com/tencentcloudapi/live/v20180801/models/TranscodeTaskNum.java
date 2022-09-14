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

public class TranscodeTaskNum extends AbstractModel{

    /**
    * 时间点。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 码率。
    */
    @SerializedName("CodeRate")
    @Expose
    private Long CodeRate;

    /**
    * 任务数。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get 时间点。 
     * @return Time 时间点。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点。
     * @param Time 时间点。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 码率。 
     * @return CodeRate 码率。
     */
    public Long getCodeRate() {
        return this.CodeRate;
    }

    /**
     * Set 码率。
     * @param CodeRate 码率。
     */
    public void setCodeRate(Long CodeRate) {
        this.CodeRate = CodeRate;
    }

    /**
     * Get 任务数。 
     * @return Num 任务数。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 任务数。
     * @param Num 任务数。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public TranscodeTaskNum() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskNum(TranscodeTaskNum source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.CodeRate != null) {
            this.CodeRate = new Long(source.CodeRate);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "CodeRate", this.CodeRate);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

