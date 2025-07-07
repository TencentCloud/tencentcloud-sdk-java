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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTextStatisticsItem extends AbstractModel {

    /**
    * 统计值，单位：秒
    */
    @SerializedName("Data")
    @Expose
    private Float Data;

    /**
     * Get 统计值，单位：秒 
     * @return Data 统计值，单位：秒
     */
    public Float getData() {
        return this.Data;
    }

    /**
     * Set 统计值，单位：秒
     * @param Data 统计值，单位：秒
     */
    public void setData(Float Data) {
        this.Data = Data;
    }

    public AudioTextStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTextStatisticsItem(AudioTextStatisticsItem source) {
        if (source.Data != null) {
            this.Data = new Float(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

