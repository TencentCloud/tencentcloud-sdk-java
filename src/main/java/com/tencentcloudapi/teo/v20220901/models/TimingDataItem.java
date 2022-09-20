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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimingDataItem extends AbstractModel{

    /**
    * 返回数据对应时间点，采用unix秒级时间戳。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 具体数值。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 返回数据对应时间点，采用unix秒级时间戳。 
     * @return Timestamp 返回数据对应时间点，采用unix秒级时间戳。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 返回数据对应时间点，采用unix秒级时间戳。
     * @param Timestamp 返回数据对应时间点，采用unix秒级时间戳。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 具体数值。 
     * @return Value 具体数值。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 具体数值。
     * @param Value 具体数值。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public TimingDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingDataItem(TimingDataItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

