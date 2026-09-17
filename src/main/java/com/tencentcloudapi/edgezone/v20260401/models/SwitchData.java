/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchData extends AbstractModel {

    /**
    * UTC时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 统计值
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get UTC时间 
     * @return Time UTC时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set UTC时间
     * @param Time UTC时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 统计值 
     * @return Value 统计值
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 统计值
     * @param Value 统计值
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public SwitchData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchData(SwitchData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

